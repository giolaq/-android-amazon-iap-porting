package com.sample.android.trivialdrivesample.billing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\fH&J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\fH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J3\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0017\"\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;", "", "canPurchase", "Lkotlinx/coroutines/flow/Flow;", "", "sku", "", "consumeInappPurchase", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowInProcess", "getConsumedPurchases", "Lkotlinx/coroutines/flow/SharedFlow;", "", "getNewPurchases", "getSkuDescription", "getSkuPrice", "getSkuTitle", "isPurchased", "launchBillingFlow", "activity", "Landroid/app/Activity;", "upgradeSkusVarargs", "", "(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;)V", "refreshPurchases", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IBillingDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.SharedFlow<java.util.List<java.lang.String>> getNewPurchases();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshPurchases(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void launchBillingFlow(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String... upgradeSkusVarargs);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> isPurchased(@org.jetbrains.annotations.NotNull()
    java.lang.String sku);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> canPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String sku);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getSkuTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String sku);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getSkuPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String sku);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getSkuDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String sku);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> getBillingFlowInProcess();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object consumeInappPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.SharedFlow<java.util.List<java.lang.String>> getConsumedPurchases();
}