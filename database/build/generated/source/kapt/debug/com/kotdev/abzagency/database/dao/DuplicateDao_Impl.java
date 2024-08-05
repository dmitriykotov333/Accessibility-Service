package com.kotdev.abzagency.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kotdev.abzagency.database.dbo.DuplicateDBO;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DuplicateDao_Impl implements DuplicateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DuplicateDBO> __insertionAdapterOfDuplicateDBO;

  private final SharedSQLiteStatement __preparedStmtOfClean;

  public DuplicateDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDuplicateDBO = new EntityInsertionAdapter<DuplicateDBO>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `duplicate` (`duplicate_id`,`history_id`,`createdAt`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DuplicateDBO entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getHistoryId());
        statement.bindLong(3, entity.getCreatedAt());
      }
    };
    this.__preparedStmtOfClean = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM duplicate";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final DuplicateDBO duplicate, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfDuplicateDBO.insertAndReturnId(duplicate);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clean(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClean.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClean.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public List<DuplicateDBO> getDuplicates() {
    final String _sql = "SELECT * FROM duplicate ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "duplicate_id");
      final int _cursorIndexOfHistoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "history_id");
      final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
      final List<DuplicateDBO> _result = new ArrayList<DuplicateDBO>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final DuplicateDBO _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpHistoryId;
        _tmpHistoryId = _cursor.getInt(_cursorIndexOfHistoryId);
        final long _tmpCreatedAt;
        _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
        _item = new DuplicateDBO(_tmpId,_tmpHistoryId,_tmpCreatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
