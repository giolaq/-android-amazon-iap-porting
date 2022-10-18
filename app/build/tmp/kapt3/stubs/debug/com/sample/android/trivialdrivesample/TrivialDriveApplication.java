package com.sample.android.trivialdrivesample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/android/trivialdrivesample/TrivialDriveApplication;", "Landroid/app/Application;", "()V", "appContainer", "Lcom/sample/android/trivialdrivesample/TrivialDriveApplication$AppContainer;", "getAppContainer", "()Lcom/sample/android/trivialdrivesample/TrivialDriveApplication$AppContainer;", "setAppContainer", "(Lcom/sample/android/trivialdrivesample/TrivialDriveApplication$AppContainer;)V", "getInstallerPackageName", "", "onCreate", "", "AppContainer", "app_debug"})
public final class TrivialDriveApplication extends android.app.Application {
    public com.sample.android.trivialdrivesample.TrivialDriveApplication.AppContainer appContainer;
    
    public TrivialDriveApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.android.trivialdrivesample.TrivialDriveApplication.AppContainer getAppContainer() {
        return null;
    }
    
    public final void setAppContainer(@org.jetbrains.annotations.NotNull()
    com.sample.android.trivialdrivesample.TrivialDriveApplication.AppContainer p0) {
    }
    
    private final java.lang.String getInstallerPackageName() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/sample/android/trivialdrivesample/TrivialDriveApplication$AppContainer;", "", "billingDataSource", "Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;", "(Lcom/sample/android/trivialdrivesample/TrivialDriveApplication;Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;)V", "applicationScope", "Lkotlinx/coroutines/GlobalScope;", "gameStateModel", "Lcom/sample/android/trivialdrivesample/db/GameStateModel;", "trivialDriveRepository", "Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "getTrivialDriveRepository", "()Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "app_debug"})
    public final class AppContainer {
        private final com.sample.android.trivialdrivesample.billing.IBillingDataSource billingDataSource = null;
        private final kotlinx.coroutines.GlobalScope applicationScope = null;
        private final com.sample.android.trivialdrivesample.db.GameStateModel gameStateModel = null;
        @org.jetbrains.annotations.NotNull()
        private final com.sample.android.trivialdrivesample.TrivialDriveRepository trivialDriveRepository = null;
        
        public AppContainer(@org.jetbrains.annotations.NotNull()
        com.sample.android.trivialdrivesample.billing.IBillingDataSource billingDataSource) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.android.trivialdrivesample.TrivialDriveRepository getTrivialDriveRepository() {
            return null;
        }
    }
}