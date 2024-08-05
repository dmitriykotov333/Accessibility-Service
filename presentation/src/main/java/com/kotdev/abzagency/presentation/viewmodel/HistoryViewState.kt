package com.kotdev.abzagency.presentation.viewmodel

import androidx.compose.runtime.Immutable
import com.kotdev.abzagency.presentation.viewmodel.model.RequestItem
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf


@Immutable
data class HistoryViewState(
    val isLoading: Boolean = false,
    val items: ImmutableList<RequestItem> = persistentListOf(),
    val error: String? = null,
    val endReached: Boolean = false,
    val page: Int = 0
)
