package com.kotdev.abzagency.data.mapper

import com.kotdev.abzagency.database.dbo.HistoryDBO
import com.kotdev.abzagency.domain.entities.History

fun History.mapToHistoryDBO(): HistoryDBO {
    return HistoryDBO(
        createdAt = createdAt,
        service = service,
        request = request,
        website = website,
    )
}