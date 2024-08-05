package com.kotdev.abzagency.database
 
import android.content.Context
import androidx.sqlite.db.SupportSQLiteOpenHelper
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SQLiteStatement
import net.sqlcipher.database.SupportFactory
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

class SQLCipherHelperFactory(passphrase: ByteArray) : SupportSQLiteOpenHelper.Factory {
    private val factory: SupportFactory = SupportFactory(passphrase)
    override fun create(configuration: SupportSQLiteOpenHelper.Configuration): SupportSQLiteOpenHelper {
        return factory.create(configuration)
    }
}

/**
 * This decision i am copy from repository
 * @see <a href="https://github.com/commonsguy/cwac-saferoom/blob/master/saferoom/src/main/java/com/commonsware/cwac/saferoom/SQLCipherUtils.java">SQLCipherUtils.java</a>
 */
object SQLCipherUtils {
    enum class State {
        DOES_NOT_EXIST, UNENCRYPTED, ENCRYPTED
    }

    fun getDatabaseState(dbPath: File): State {
        if (dbPath.exists()) {
            var db: SQLiteDatabase? = null

            try {
                db =
                    SQLiteDatabase.openDatabase(
                        dbPath.absolutePath, "",
                        null, SQLiteDatabase.OPEN_READONLY
                    )



                return (State.UNENCRYPTED)
            } catch (e: Exception) {
                return (State.ENCRYPTED)
            } finally {
                db?.close()
            }
        }

        return (State.DOES_NOT_EXIST)
    }
    @Throws(IOException::class)
    fun encrypt(ctxt: Context, originalFile: File, passphrase: ByteArray?) {


        if (originalFile.exists()) {
            val newFile = File.createTempFile(
                "sqlcipherutils", "tmp",
                ctxt.cacheDir
            )
            var db =
                SQLiteDatabase.openDatabase(
                    originalFile.absolutePath,
                    "", null, SQLiteDatabase.OPEN_READWRITE
                )
            val version = db.version

            db.close()

            db = SQLiteDatabase.openDatabase(
                newFile.absolutePath, passphrase,
                null, SQLiteDatabase.OPEN_READWRITE, null, null
            )

            val st: SQLiteStatement = db.compileStatement("ATTACH DATABASE ? AS plaintext KEY ''")

            st.bindString(1, originalFile.absolutePath)
            st.execute()

            db.rawExecSQL("SELECT sqlcipher_export('main', 'plaintext')")
            db.rawExecSQL("DETACH DATABASE plaintext")
            db.version = version
            st.close()
            db.close()

            originalFile.delete()
            newFile.renameTo(originalFile)
        } else {
            throw FileNotFoundException(originalFile.absolutePath + " not found")
        }
    }
}