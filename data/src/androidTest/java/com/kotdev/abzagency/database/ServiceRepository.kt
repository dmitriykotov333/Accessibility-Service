package com.kotdev.abzagency.database

import org.junit.Assert.assertEquals

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kotdev.abzagency.data.repositories.ServiceRepositoryImpl
import com.kotdev.abzagency.domain.entities.History
import com.kotdev.abzagency.domain.repository.ServiceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class ServiceRepository {

    @get:Rule
    val rule = HiltAndroidRule(this)

    @Inject
    lateinit var service: ServiceRepository

    @Inject
    lateinit var database: HistoryDatabase

    @Before
    fun setup() {
        rule.inject()
    }


    @Test
    fun checkServiceDuplicate() = runBlocking {
        val item = History(
            id = 1,
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        service.addHistory(item)
        val isDuplicate = service.checkDuplicate(item).isDuplicate
        assertEquals(true, isDuplicate)
    }

    @Test
    fun serviceAddHistory() = runBlocking {
        val item = History(
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        val item2 = History(
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        val item3 = History(
            request = "test1",
            service = "Google",
            website = "",
            createdAt = System.currentTimeMillis()
        )
        service.addHistory(item)
        service.addHistory(item2)
        service.addHistory(item3)
        val items = database.historyDao.getHistories()
        assertEquals(1, items.size)
        assertEquals(3, items.get(0).duplicate.size)
    }
}