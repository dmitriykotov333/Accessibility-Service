package com.kotdev.abzagency.database

import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kotdev.abzagency.database.dao.DuplicateDao
import com.kotdev.abzagency.database.dao.HistoryDao
import com.kotdev.abzagency.database.dbo.DuplicateDBO
import com.kotdev.abzagency.database.dbo.HistoryDBO
import net.sqlcipher.database.SQLiteDatabase


@Database(entities = [HistoryDBO::class, DuplicateDBO::class], version = 1)
internal abstract class HistoryRoomDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
    abstract fun duplicateDao(): DuplicateDao
}


fun HistoryDatabase(context: Context): HistoryDatabase {
    KeyStoreHelper.generateKey()
    val secretKey = KeyStoreHelper.getKey()
    val passphrase: ByteArray = SQLiteDatabase.getBytes("${secretKey.encoded}".toCharArray())
    System.loadLibrary("sqlcipher")
    val state = SQLCipherUtils.getDatabaseState(context.getDatabasePath("abzagency.db"))
    Log.d("HistoryDatabase", "state = ${state}")
    if (state == SQLCipherUtils.State.UNENCRYPTED) {
        SQLCipherUtils.encrypt(
            context,
            context.getDatabasePath("abzagency.db"),
            passphrase
        )
    }

    val factory = SQLCipherHelperFactory(passphrase)
    val roomDatabase =
        Room.databaseBuilder(
            checkNotNull(context.applicationContext),
            HistoryRoomDatabase::class.java,
            "abzagency.db"
        ).openHelperFactory(factory).fallbackToDestructiveMigration().build()

    return HistoryDatabase(roomDatabase)
}

class HistoryDatabase internal constructor(private val database: HistoryRoomDatabase) {
    val historyDao: HistoryDao
        get() = database.historyDao()
    val duplicateDao: DuplicateDao
        get() = database.duplicateDao()
}