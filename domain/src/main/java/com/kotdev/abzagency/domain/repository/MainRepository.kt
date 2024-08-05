package com.kotdev.abzagency.domain.repository

import com.kotdev.abzagency.database.HistoryWithDuplicate
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    suspend fun removeItem(id: Int): Int
    suspend fun observeAll(): List<HistoryWithDuplicate>
    fun historiesFlow(): Flow<List<HistoryWithDuplicate>>
    suspend fun getAllPagingSource(page: Int, pageSize: Int): Result<List<HistoryWithDuplicate>>
}