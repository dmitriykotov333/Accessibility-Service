package com.kotdev.abzagency.database

import androidx.room.Embedded
import androidx.room.Relation
import com.kotdev.abzagency.database.dbo.DuplicateDBO
import com.kotdev.abzagency.database.dbo.HistoryDBO

/**
 * This class combines database tables using a one-to-many relationship
 * with Room library annotations.
 */

data class HistoryWithDuplicate(

    @Embedded val history: HistoryDBO,
    @Relation(
        parentColumn = "history_id",
        entityColumn = "history_id",
    )
    val duplicate: List<DuplicateDBO>
)