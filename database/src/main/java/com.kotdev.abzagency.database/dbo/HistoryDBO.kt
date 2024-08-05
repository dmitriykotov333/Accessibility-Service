package com.kotdev.abzagency.database.dbo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "history")
data class HistoryDBO(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("history_id") val id: Int = 0,
    @ColumnInfo("createdAt") val createdAt: Long,
    @ColumnInfo("service") val service: String,
    @ColumnInfo("request") val request: String,
    @ColumnInfo("website") val website: String?,
)


/**
 * ForeignKey.CASCADE - will remove all child columns
 */
@Entity(
    tableName = "duplicate",
    foreignKeys = [
        ForeignKey(
            entity = HistoryDBO::class,
            parentColumns = arrayOf("history_id"),
            childColumns = arrayOf("history_id"),
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        )]
)
data class DuplicateDBO(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "duplicate_id") val id: Int = 0,
    @ColumnInfo(name = "history_id")
    val historyId: Int,
    @ColumnInfo(name = "createdAt")
    val createdAt: Long
)