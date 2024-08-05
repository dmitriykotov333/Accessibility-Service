package com.kotdev.abzagency.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import com.kotdev.abzagency.database.dbo.DuplicateDBO
import kotlinx.coroutines.flow.Flow

@Dao
interface DuplicateDao {

    @Query("SELECT * FROM duplicate ORDER BY createdAt DESC")
    fun getDuplicates(): List<DuplicateDBO>

    @Insert
    suspend fun insert(duplicate: DuplicateDBO): Long


    @Query("DELETE FROM duplicate")
    suspend fun clean()
}