package com.kotdev.abzagency.database

import android.database.sqlite.SQLiteConstraintException
import org.junit.Assert.assertEquals

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kotdev.abzagency.database.dao.DuplicateDao
import com.kotdev.abzagency.database.dao.HistoryDao
import com.kotdev.abzagency.database.dbo.DuplicateDBO
import com.kotdev.abzagency.database.dbo.HistoryDBO
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.After

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class DatabaseTest {

    private lateinit var database: HistoryRoomDatabase
    private lateinit var historyDao: HistoryDao
    private lateinit var duplicateDao: DuplicateDao

    @Before
    fun setupDatabase() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            HistoryRoomDatabase::class.java
        ).allowMainThreadQueries().build()

        historyDao = database.historyDao()
        duplicateDao = database.duplicateDao()
    }

    @After
    fun closeDatabase() {
        database.close()
    }

    private suspend fun cleanAll() {
        duplicateDao.clean()
        historyDao.clean()
    }


    @Test
    fun insertSuccessfully() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        val items = historyDao.getHistories()

        assertEquals(1, items.size)
    }

    @Test
    fun testInsertFailure() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        val rst = kotlin.runCatching {
            historyDao.insert(item)
            historyDao.insert(item)
        }.exceptionOrNull()?.message
        assertEquals(
            "UNIQUE constraint failed: history.history_id (code 1555 SQLITE_CONSTRAINT_PRIMARYKEY)",
            rst
        )
    }

    @Test
    fun getHistoryListWithDuplicate() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        for (i in 1..40) {
            duplicateDao.insert(
                DuplicateDBO(
                    id = i,
                    createdAt = System.currentTimeMillis(),
                    historyId = 1
                )
            )
        }
        val items = historyDao.getHistories()
        assertEquals(40, items[0].duplicate.size)
    }

    @Test
    fun removeHistoryItemById() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        for (i in 1..40) {
            duplicateDao.insert(
                DuplicateDBO(
                    id = i,
                    createdAt = System.currentTimeMillis(),
                    historyId = 1
                )
            )
        }
        historyDao.removeById(1)
        assertEquals(0, duplicateDao.getDuplicates().size)
    }


    @Test
    fun selectFailure() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        val rst = historyDao.removeById(2)
        assertEquals(0, rst)
    }

    @Test
    fun checkDuplicate() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        val item2 = HistoryDBO(
            id = 2,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        historyDao.insert(item2)

        val isDuplicate = historyDao.getHistories().filter {
            it.history.id == item.id
        }.isNotEmpty()

        assertEquals(true, isDuplicate)
    }

    @Test
    fun addHistoryIfDuplicate() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        val item2 = HistoryDBO(
            id = 2,
            request = "test2",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        historyDao.insert(item2)

        val isDuplicate = historyDao.getHistories().filter {
            it.history.request == item.request
        }.isNotEmpty()

        if (isDuplicate) {
            duplicateDao.insert(
                DuplicateDBO(
                    historyId = item.id!!,
                    createdAt = System.currentTimeMillis()
                )
            )
            duplicateDao.insert(
                DuplicateDBO(
                    historyId = item.id!!,
                    createdAt = System.currentTimeMillis()
                )
            )
        } else {
            historyDao.insert(item)
        }
        val items = historyDao.getHistories()
        assertEquals(2, items.size)
        assertEquals(1, duplicateDao.getDuplicates().size/*items.get(0).duplicate.size*/)
        assertEquals(2, items.get(0).duplicate.size)
    }

    @Test
    fun addHistoryIfNotDuplicate() = runBlocking {
        cleanAll()
        val item = HistoryDBO(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        val item2 = HistoryDBO(
            id = 2,
            request = "test2",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        val item3 = HistoryDBO(
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        historyDao.insert(item)
        historyDao.insert(item2)

        val isDuplicate = historyDao.getHistories().filter {
            it.history.request == item3.request
        }.getOrNull(0)?.history?.id

        if (isDuplicate != 0) {
            duplicateDao.insert(
                DuplicateDBO(
                    historyId = isDuplicate!!,
                    createdAt = System.currentTimeMillis()
                )
            )
        } else {
            historyDao.insert(item3)
        }
        val items = historyDao.getHistories()
        assertEquals(2, items.size)
    }
}