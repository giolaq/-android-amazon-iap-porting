package com.sample.android.trivialdrivesample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/sample/android/trivialdrivesample/MakePurchaseViewModel;", "Landroidx/lifecycle/ViewModel;", "tdr", "Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "(Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;)V", "billingFlowInProcess", "Landroidx/lifecycle/LiveData;", "", "getBillingFlowInProcess", "()Landroidx/lifecycle/LiveData;", "buySku", "", "activity", "Landroid/app/Activity;", "sku", "", "canBuySku", "getSkuDetails", "Lcom/sample/android/trivialdrivesample/MakePurchaseViewModel$SkuDetails;", "isPurchased", "sendMessage", "message", "", "Companion", "MakePurchaseViewModelFactory", "SkuDetails", "app_debug"})
public final class MakePurchaseViewModel extends androidx.lifecycle.ViewModel {
    private final com.sample.android.trivialdrivesample.TrivialDriveRepository tdr = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.android.trivialdrivesample.MakePurchaseViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> skuToResourceIdMap = null;
    
    public MakePurchaseViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.android.trivialdrivesample.TrivialDriveRepository tdr) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.android.trivialdrivesample.MakePurchaseViewModel.SkuDetails getSkuDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> canBuySku(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isPurchased(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    /**
     * Starts a billing flow for purchasing gas.
     * @param activity
     * @return whether or not we were able to start the flow
     */
    public final void buySku(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getBillingFlowInProcess() {
        return null;
    }
    
    public final void sendMessage(int message) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/sample/android/trivialdrivesample/MakePurchaseViewModel$SkuDetails;", "", "sku", "", "tdr", "Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "(Ljava/lang/String;Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;)V", "description", "Landroidx/lifecycle/LiveData;", "getDescription", "()Landroidx/lifecycle/LiveData;", "iconDrawableId", "", "getIconDrawableId", "()I", "price", "getPrice", "getSku", "()Ljava/lang/String;", "title", "getTitle", "app_debug"})
    public static final class SkuDetails {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.lifecycle.LiveData<java.lang.String> title = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.lifecycle.LiveData<java.lang.String> description = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.lifecycle.LiveData<java.lang.String> price = null;
        private final int iconDrawableId = 0;
        
        public SkuDetails(@org.jetbrains.annotations.NotNull()
        java.lang.String sku, @org.jetbrains.annotations.NotNull()
        com.sample.android.trivialdrivesample.TrivialDriveRepository tdr) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.lang.String> getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.lang.String> getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.lang.String> getPrice() {
            return null;
        }
        
        public final int getIconDrawableId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sample/android/trivialdrivesample/MakePurchaseViewModel$MakePurchaseViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "trivialDriveRepository", "Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "(Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class MakePurchaseViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.sample.android.trivialdrivesample.TrivialDriveRepository trivialDriveRepository = null;
        
        public MakePurchaseViewModelFactory(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/sample/android/trivialdrivesample/MakePurchaseViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "skuToResourceIdMap", "", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}