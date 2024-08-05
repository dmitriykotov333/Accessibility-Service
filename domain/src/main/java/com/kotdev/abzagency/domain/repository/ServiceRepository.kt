package com.kotdev.abzagency.domain.repository

import com.kotdev.abzagency.database.HistoryWithDuplicate
import com.kotdev.abzagency.domain.entities.Duplicate
import com.kotdev.abzagency.domain.entities.History


interface ServiceRepository {
    suspend fun checkDuplicate(history: History): Duplicate
    suspend fun addHistory(history: History)
}