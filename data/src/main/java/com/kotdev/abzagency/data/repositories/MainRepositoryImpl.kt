package com.kotdev.abzagency.data.repositories

import com.kotdev.abzagency.database.HistoryDatabase
import com.kotdev.abzagency.database.HistoryWithDuplicate
import com.kotdev.abzagency.domain.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepositoryImpl @Inject constructor(private val database: HistoryDatabase) :
    MainRepository {

    private val historyDao = database.historyDao

    override suspend fun observeAll() = historyDao.getHistories()

    override fun historiesFlow() = historyDao.historiesFlow()

    override suspend fun removeItem(id: Int) = withContext(Dispatchers.IO) {
        historyDao.removeById(id)
    }

    override suspend fun getAllPagingSource(page: Int, pageSize: Int) = getItems(page, pageSize)

    /**
     * Returns a list containing elements at indices in the specified [indices] range.
     */
    private suspend fun getItems(page: Int, pageSize: Int): Result<List<HistoryWithDuplicate>> {
        val startingIndex = page * pageSize
        val items = observeAll()
        return if (startingIndex + pageSize <= items.size) {
            Result.success(items.slice(startingIndex until startingIndex + pageSize))
        } else {
            if (items.size <= pageSize) {
                Result.failure(exception = Throwable())
            } else {
                Result.success(emptyList())
            }
        }
    }
}