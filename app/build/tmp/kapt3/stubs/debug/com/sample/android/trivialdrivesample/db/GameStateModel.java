package com.sample.android.trivialdrivesample.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0019\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/sample/android/trivialdrivesample/db/GameStateModel;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lcom/sample/android/trivialdrivesample/db/GameStateDatabase;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "gameStateDao", "Lcom/sample/android/trivialdrivesample/db/GameStateDao;", "gasTankLevel", "Lkotlinx/coroutines/flow/Flow;", "", "decrementGas", "minLevel", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementGas", "maxLevel", "Companion", "app_debug"})
public final class GameStateModel {
    private final com.sample.android.trivialdrivesample.db.GameStateDatabase db = null;
    private final com.sample.android.trivialdrivesample.db.GameStateDao gameStateDao = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> gasTankLevel = null;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.android.trivialdrivesample.db.GameStateModel.Companion Companion = null;
    private static final java.lang.String GAS_LEVEL = "gas";
    
    public GameStateModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object decrementGas(int minLevel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object incrementGas(int maxLevel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> gasTankLevel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/sample/android/trivialdrivesample/db/GameStateModel$Companion;", "", "()V", "GAS_LEVEL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}