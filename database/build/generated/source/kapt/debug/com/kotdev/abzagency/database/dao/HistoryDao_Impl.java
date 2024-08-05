package com.kotdev.abzagency.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kotdev.abzagency.database.HistoryWithDuplicate;
import com.kotdev.abzagency.database.dbo.DuplicateDBO;
import com.kotdev.abzagency.database.dbo.HistoryDBO;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryDao_Impl implements HistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HistoryDBO> __insertionAdapterOfHistoryDBO;

  private final SharedSQLiteStatement __preparedStmtOfRemoveById;

  private final SharedSQLiteStatement __preparedStmtOfUpdate;

  private final SharedSQLiteStatement __preparedStmtOfClean;

  public HistoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistoryDBO = new EntityInsertionAdapter<HistoryDBO>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `history` (`history_id`,`createdAt`,`service`,`request`,`website`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final HistoryDBO entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getCreatedAt());
        if (entity.getService() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getService());
        }
        if (entity.getRequest() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getRequest());
        }
        if (entity.getWebsite() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getWebsite());
        }
      }
    };
    this.__preparedStmtOfRemoveById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM history WHERE history_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdate = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE history SET createdAt = ?  WHERE history_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClean = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM history";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final HistoryDBO history, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfHistoryDBO.insertAndReturnId(history);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object removeById(final int id, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            final Integer _result = _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfRemoveById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final int id, final long createdAt,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdate.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, createdAt);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
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
          __preparedStmtOfUpdate.release(_stmt);
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
  public Object getHistories(final Continuation<? super List<HistoryWithDuplicate>> $completion) {
    final String _sql = "SELECT * FROM history ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<HistoryWithDuplicate>>() {
      @Override
      @NonNull
      public List<HistoryWithDuplicate> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "history_id");
            final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
            final int _cursorIndexOfService = CursorUtil.getColumnIndexOrThrow(_cursor, "service");
            final int _cursorIndexOfRequest = CursorUtil.getColumnIndexOrThrow(_cursor, "request");
            final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
            final LongSparseArray<ArrayList<DuplicateDBO>> _collectionDuplicate = new LongSparseArray<ArrayList<DuplicateDBO>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionDuplicate.containsKey(_tmpKey)) {
                _collectionDuplicate.put(_tmpKey, new ArrayList<DuplicateDBO>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipduplicateAscomKotdevAbzagencyDatabaseDboDuplicateDBO(_collectionDuplicate);
            final List<HistoryWithDuplicate> _result = new ArrayList<HistoryWithDuplicate>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final HistoryWithDuplicate _item;
              final HistoryDBO _tmpHistory;
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final long _tmpCreatedAt;
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
              final String _tmpService;
              if (_cursor.isNull(_cursorIndexOfService)) {
                _tmpService = null;
              } else {
                _tmpService = _cursor.getString(_cursorIndexOfService);
              }
              final String _tmpRequest;
              if (_cursor.isNull(_cursorIndexOfRequest)) {
                _tmpRequest = null;
              } else {
                _tmpRequest = _cursor.getString(_cursorIndexOfRequest);
              }
              final String _tmpWebsite;
              if (_cursor.isNull(_cursorIndexOfWebsite)) {
                _tmpWebsite = null;
              } else {
                _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
              }
              _tmpHistory = new HistoryDBO(_tmpId,_tmpCreatedAt,_tmpService,_tmpRequest,_tmpWebsite);
              final ArrayList<DuplicateDBO> _tmpDuplicateCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpDuplicateCollection = _collectionDuplicate.get(_tmpKey_1);
              _item = new HistoryWithDuplicate(_tmpHistory,_tmpDuplicateCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<HistoryWithDuplicate>> historiesFlow() {
    final String _sql = "SELECT * FROM history ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[] {"duplicate",
        "history"}, new Callable<List<HistoryWithDuplicate>>() {
      @Override
      @NonNull
      public List<HistoryWithDuplicate> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "history_id");
            final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
            final int _cursorIndexOfService = CursorUtil.getColumnIndexOrThrow(_cursor, "service");
            final int _cursorIndexOfRequest = CursorUtil.getColumnIndexOrThrow(_cursor, "request");
            final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
            final LongSparseArray<ArrayList<DuplicateDBO>> _collectionDuplicate = new LongSparseArray<ArrayList<DuplicateDBO>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionDuplicate.containsKey(_tmpKey)) {
                _collectionDuplicate.put(_tmpKey, new ArrayList<DuplicateDBO>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipduplicateAscomKotdevAbzagencyDatabaseDboDuplicateDBO(_collectionDuplicate);
            final List<HistoryWithDuplicate> _result = new ArrayList<HistoryWithDuplicate>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final HistoryWithDuplicate _item;
              final HistoryDBO _tmpHistory;
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final long _tmpCreatedAt;
              _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
              final String _tmpService;
              if (_cursor.isNull(_cursorIndexOfService)) {
                _tmpService = null;
              } else {
                _tmpService = _cursor.getString(_cursorIndexOfService);
              }
              final String _tmpRequest;
              if (_cursor.isNull(_cursorIndexOfRequest)) {
                _tmpRequest = null;
              } else {
                _tmpRequest = _cursor.getString(_cursorIndexOfRequest);
              }
              final String _tmpWebsite;
              if (_cursor.isNull(_cursorIndexOfWebsite)) {
                _tmpWebsite = null;
              } else {
                _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
              }
              _tmpHistory = new HistoryDBO(_tmpId,_tmpCreatedAt,_tmpService,_tmpRequest,_tmpWebsite);
              final ArrayList<DuplicateDBO> _tmpDuplicateCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpDuplicateCollection = _collectionDuplicate.get(_tmpKey_1);
              _item = new HistoryWithDuplicate(_tmpHistory,_tmpDuplicateCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipduplicateAscomKotdevAbzagencyDatabaseDboDuplicateDBO(
      @NonNull final LongSparseArray<ArrayList<DuplicateDBO>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchLongSparseArray(_map, true, (map) -> {
        __fetchRelationshipduplicateAscomKotdevAbzagencyDatabaseDboDuplicateDBO(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `duplicate_id`,`history_id`,`createdAt` FROM `duplicate` WHERE `history_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      final long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "history_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfHistoryId = 1;
      final int _cursorIndexOfCreatedAt = 2;
      while (_cursor.moveToNext()) {
        final long _tmpKey;
        _tmpKey = _cursor.getLong(_itemKeyIndex);
        final ArrayList<DuplicateDBO> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final DuplicateDBO _item_1;
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final int _tmpHistoryId;
          _tmpHistoryId = _cursor.getInt(_cursorIndexOfHistoryId);
          final long _tmpCreatedAt;
          _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
          _item_1 = new DuplicateDBO(_tmpId,_tmpHistoryId,_tmpCreatedAt);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
