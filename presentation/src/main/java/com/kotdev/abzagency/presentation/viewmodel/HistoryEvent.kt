package com.kotdev.abzagency.presentation.viewmodel

import com.kotdev.abzagency.presentation.viewmodel.model.RequestItem


sealed class HistoryEvent {
    data class RemoveItem(val item: RequestItem) : HistoryEvent()
    data class DuplicateClick(val id: Int) : HistoryEvent()
    data class LinkClick(val id: Int) : HistoryEvent()
}