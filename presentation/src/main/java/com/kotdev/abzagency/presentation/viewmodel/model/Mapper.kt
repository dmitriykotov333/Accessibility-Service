package com.kotdev.abzagency.presentation.viewmodel.model

import com.kotdev.abzagency.core.extensions.longToDateFormat
import com.kotdev.abzagency.core.extensions.longToDateFullFormat
import com.kotdev.abzagency.database.HistoryWithDuplicate
import com.kotdev.abzagency.database.dbo.DuplicateDBO
import com.kotdev.abzagency.service.config.SupportedBrowser
import com.kotdev.abzagency.service.config.SupportedBrowserData

fun HistoryWithDuplicate.mapToUI(): RequestItem {
    return RequestItem(
        id = history.id,
        date = history.createdAt.longToDateFormat(),
        request = history.request,
        website = history.website ?: "",
        service = when (history.service) {
            SupportedBrowser.GOOGLE.name -> com.kotdev.abzagency.core_ui.R.drawable.google
            SupportedBrowser.OPERA.name -> com.kotdev.abzagency.core_ui.R.drawable.opera
            else -> com.kotdev.abzagency.core_ui.R.drawable.web
        },
        duplicateSize = duplicate.size,
        duplicate = duplicate.sortedBy { it.createdAt }.takeLast(10).map {
            it.mapToString()
        }
    )
}

fun DuplicateDBO.mapToString(): String {
    return createdAt.longToDateFullFormat()
}

