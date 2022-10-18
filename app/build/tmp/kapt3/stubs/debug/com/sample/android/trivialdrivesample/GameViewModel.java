package com.sample.android.trivialdrivesample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/android/trivialdrivesample/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "tdr", "Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "(Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;)V", "gasUnitsRemaining", "Landroidx/lifecycle/LiveData;", "", "getGasUnitsRemaining", "()Landroidx/lifecycle/LiveData;", "isPremium", "", "canDrive", "drive", "", "Companion", "GameViewModelFactory", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    private final com.sample.android.trivialdrivesample.TrivialDriveRepository tdr = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.android.trivialdrivesample.GameViewModel.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static final java.lang.String TAG = null;
    
    public GameViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.android.trivialdrivesample.TrivialDriveRepository tdr) {
        super();
    }
    
    public final void drive() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> canDrive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isPremium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getGasUnitsRemaining() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sample/android/trivialdrivesample/GameViewModel$GameViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "trivialDriveRepository", "Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "(Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class GameViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.sample.android.trivialdrivesample.TrivialDriveRepository trivialDriveRepository = null;
        
        public GameViewModelFactory(@org.jetbrains.annotations.NotNull()
        com.sample.android.trivialdrivesample.TrivialDriveRepository trivialDriveRepository) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/android/trivialdrivesample/GameViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}