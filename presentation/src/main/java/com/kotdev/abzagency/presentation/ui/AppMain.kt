package com.kotdev.abzagency.presentation.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kotdev.abzagency.core_ui.theme.Theme
import com.kotdev.abzagency.presentation.viewmodel.HistoryViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AppMain(
    padding: PaddingValues,
    viewModel: HistoryViewModel = viewModel()
) {
    val state by viewModel.states().collectAsState()
    val isEmpty by remember {
        derivedStateOf { state.items.isEmpty() }
    }
    Box(
        modifier = Modifier.background(Theme.colors.background),
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(
                top = padding.calculateTopPadding() + 85.dp,
                bottom = 15.dp,
                start = 15.dp,
                end = 15.dp
            ), verticalArrangement = Arrangement.spacedBy(
                15.dp
            )
        ) {
            itemsIndexed(
                items = state.items,
                key = { index, item ->
                    item.id
                },
                itemContent = { index, item ->
                    if (index >= state.items.size - 1 && !state.endReached && !state.isLoading) {
                        viewModel.loadNextItems()
                    }
                    Request(
                        modifier = Modifier.animateItemPlacement(),
                        item = item,
                        eventHandler = viewModel::obtainEvent
                    )
                }
            )
        }
        if (isEmpty) {
            EmptyContent()
        }
        AppBarContent()
    }
}