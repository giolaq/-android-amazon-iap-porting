package com.sample.android.trivialdrivesample.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\'J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\'J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/android/trivialdrivesample/db/GameStateDao;", "", "decrement", "", "key", "", "minValue", "get", "Lkotlinx/coroutines/flow/Flow;", "increment", "maxValue", "put", "", "value", "app_debug"})
public abstract interface GameStateDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT `value` FROM GameState WHERE `key` = :key LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> get(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @androidx.room.Query(value = "REPLACE INTO GameState VALUES(:key,:value)")
    public abstract void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value);
    
    @androidx.room.Query(value = "UPDATE GameState SET `value`=`value`-1 WHERE `key`=:key AND `value` > :minValue")
    public abstract int decrement(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int minValue);
    
    @androidx.room.Query(value = "UPDATE GameState SET `value`=`value`+1 WHERE `key`=:key AND `value` < :maxValue")
    public abstract int increment(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int maxValue);
}