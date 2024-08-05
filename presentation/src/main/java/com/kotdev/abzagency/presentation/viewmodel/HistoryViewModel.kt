package com.kotdev.abzagency.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import com.kotdev.abzagency.core.viewmodel.BaseViewModel
import com.kotdev.abzagency.data.paging.CommonPaging
import com.kotdev.abzagency.domain.entities.History
import com.kotdev.abzagency.domain.repository.MainRepository
import com.kotdev.abzagency.domain.repository.ServiceRepository
import com.kotdev.abzagency.presentation.viewmodel.model.RequestItem
import com.kotdev.abzagency.presentation.viewmodel.model.mapToUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val repository: MainRepository
) : BaseViewModel<HistoryViewState, Unit, HistoryEvent>(
    initialState = HistoryViewState()
) {

    private val paging = CommonPaging(
        initialPage = viewState.page,
        onLoad = {
            viewState = viewState.copy(isLoading = it)
        },
        onRequest = { nextPage ->
            repository.getAllPagingSource(nextPage, 20)
        },
        onNextPage = {
            viewState.page + 1
        },
        onError = {
            val items = if (viewState.items.isEmpty()) {
                viewState.items + repository.observeAll().map { it.mapToUI() }
            } else {
                viewState.items
            }
            viewState = viewState.copy(
                items = items.toImmutableList()
            )
        },
        onSuccess = { items, newKey ->
            viewState = viewState.copy(
                items = (viewState.items + items.map { it.mapToUI() }).toImmutableList(),
                page = newKey,
                endReached = items.isEmpty()
            )
        }
    )

    init {
        loadNextItems()
        histories()
    }

    fun loadNextItems() {
        viewModelScope.launch {
            paging.load()
        }
    }

    private fun histories() {
        coroutineScope.launch {
            repository.historiesFlow().collectLatest {
                viewState = viewState.copy(
                    items = it.map { it.mapToUI() }.toImmutableList(),
                    page = 0,
                    endReached = false
                )
                paging.load()
            }
        }
    }

    override fun obtainEvent(viewEvent: HistoryEvent) {
        when (viewEvent) {
            is HistoryEvent.RemoveItem -> {
                remove(viewEvent.item)
            }

            is HistoryEvent.LinkClick -> {
                viewState = viewState.copy(
                    items =
                    viewState.items.map {
                        if (it.id == viewEvent.id) it.copy(linkOpen = !it.linkOpen)
                        else it
                    }.toImmutableList()
                )
            }

            is HistoryEvent.DuplicateClick -> {
                viewState = viewState.copy(
                    items =
                    viewState.items.map {
                        if (it.id == viewEvent.id) it.copy(duplicateOpen = !it.duplicateOpen)
                        else it
                    }.toImmutableList()
                )
            }
        }
    }

    private fun remove(item: RequestItem) {
        coroutineScope.launch {
            repository.removeItem(item.id)
            val newList = viewState.items.toMutableList()
            newList.remove(item)
            viewState = viewState.copy(items = newList.toImmutableList())
        }
    }
}