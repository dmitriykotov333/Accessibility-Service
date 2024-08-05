package com.kotdev.abzagency.data.repositories

import com.kotdev.abzagency.data.mapper.mapToHistoryDBO
import com.kotdev.abzagency.database.HistoryDatabase
import com.kotdev.abzagency.database.HistoryWithDuplicate
import com.kotdev.abzagency.database.dbo.DuplicateDBO
import com.kotdev.abzagency.domain.entities.Duplicate
import com.kotdev.abzagency.domain.entities.History
import com.kotdev.abzagency.domain.repository.ServiceRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ServiceRepositoryImpl @Inject constructor(
    private val database: HistoryDatabase
) : ServiceRepository {

    private val historyDao = database.historyDao
    private val duplicateDao = database.duplicateDao

    /**
     * We check if there is already such a request in the database
     */
    override suspend fun checkDuplicate(history: History): Duplicate {
        val dbo = history.mapToHistoryDBO()
        val result = historyDao.getHistories().filter {
            it.history.request == dbo.request
        }
        return Duplicate(
            id = result.getOrNull(0)?.history?.id,
            isDuplicate = result.isNotEmpty()
        )
    }

    override suspend fun addHistory(history: History) {
        withContext(Dispatchers.IO) {
            val duplicate = checkDuplicate(history)
            if (duplicate.isDuplicate) {
                val time = System.currentTimeMillis()
                database.historyDao.update(
                    duplicate.id!!,
                    time
                )
                duplicateDao.insert(
                    DuplicateDBO(
                        historyId = duplicate.id!!,
                        createdAt = time
                    )
                )
            } else {
                historyDao.insert(history.mapToHistoryDBO())
            }
        }
    }
}