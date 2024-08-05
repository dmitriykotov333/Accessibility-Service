package com.kotdev.abzagency.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.kotdev.abzagency.database.dbo.HistoryDBO
import com.kotdev.abzagency.database.HistoryWithDuplicate
import kotlinx.coroutines.flow.Flow

/**
 * This interface performs actions with the database.
 *
 * getHistories() - A suspend function that returns a list of data combined from two tables.
 *
 * historiesFlow() - flow function update the UI in real-time
 * if the application is in the onPause or onStop state.
 *
 * update() - If we add a duplicate to the table, update createdAt to sort it correctly.,
 *
 */
@Dao
interface HistoryDao {

    @Transaction
    @Query("SELECT * FROM history ORDER BY createdAt DESC")
    suspend fun getHistories(): List<HistoryWithDuplicate>

    @Transaction
    @Query("SELECT * FROM history ORDER BY createdAt DESC")
    fun historiesFlow(): Flow<List<HistoryWithDuplicate>>


    @Query("DELETE FROM history WHERE history_id = :id")
    suspend fun removeById(id: Int): Int

    @Insert
    suspend fun insert(history: HistoryDBO): Long

    @Query("UPDATE history SET createdAt = :createdAt  WHERE history_id = :id")
    suspend fun update(id: Int, createdAt: Long)

    @Query("DELETE FROM history")
    suspend fun clean()
}