package com.sample.android.trivialdrivesample.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GameStateDao_Impl implements GameStateDao {
  private final RoomDatabase __db;

  private final SharedSQLiteStatement __preparedStmtOfPut;

  private final SharedSQLiteStatement __preparedStmtOfDecrement;

  private final SharedSQLiteStatement __preparedStmtOfIncrement;

  public GameStateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__preparedStmtOfPut = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "REPLACE INTO GameState VALUES(?,?)";
        return _query;
      }
    };
    this.__preparedStmtOfDecrement = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE GameState SET `value`=`value`-1 WHERE `key`=? AND `value` > ?";
        return _query;
      }
    };
    this.__preparedStmtOfIncrement = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE GameState SET `value`=`value`+1 WHERE `key`=? AND `value` < ?";
        return _query;
      }
    };
  }

  @Override
  public void put(final String key, final int value) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfPut.acquire();
    int _argIndex = 1;
    if (key == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, key);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, value);
    __db.beginTransaction();
    try {
      _stmt.executeInsert();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfPut.release(_stmt);
    }
  }

  @Override
  public int decrement(final String key, final int minValue) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDecrement.acquire();
    int _argIndex = 1;
    if (key == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, key);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, minValue);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDecrement.release(_stmt);
    }
  }

  @Override
  public int increment(final String key, final int maxValue) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfIncrement.acquire();
    int _argIndex = 1;
    if (key == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, key);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, maxValue);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfIncrement.release(_stmt);
    }
  }

  @Override
  public Flow<Integer> get(final String key) {
    final String _sql = "SELECT `value` FROM GameState WHERE `key` = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"GameState"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfValue = 0;
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final int _tmpValue;
            _tmpValue = _cursor.getInt(_cursorIndexOfValue);
            _result = new Integer(_tmpValue);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
