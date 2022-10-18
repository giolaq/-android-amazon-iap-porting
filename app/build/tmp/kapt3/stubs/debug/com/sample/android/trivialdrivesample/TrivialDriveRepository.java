package com.sample.android.trivialdrivesample;

import java.lang.System;

/**
 * The repository uses data from the Billing data source and the game state model together to give
 * a unified version of the state of the game to the ViewModel. It works closely with the
 * BillingDataSource to implement consumable items, premium items, etc.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 *2\u00020\u0001:\u0001*B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u0017J\u0011\u0010\u001e\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\nJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010%\u001a\u00020\u0017H\u0002J\u0011\u0010&\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/sample/android/trivialdrivesample/TrivialDriveRepository;", "", "billingDataSource", "Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;", "gameStateModel", "Lcom/sample/android/trivialdrivesample/db/GameStateModel;", "defaultScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;Lcom/sample/android/trivialdrivesample/db/GameStateModel;Lkotlinx/coroutines/CoroutineScope;)V", "billingFlowInProcess", "Lkotlinx/coroutines/flow/Flow;", "", "getBillingFlowInProcess", "()Lkotlinx/coroutines/flow/Flow;", "billingLifecycleObserver", "getBillingLifecycleObserver", "()Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;", "gameMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "messages", "getMessages", "buySku", "", "activity", "Landroid/app/Activity;", "sku", "", "canPurchase", "debugConsumePremium", "drive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gasTankLevel", "getSkuDescription", "getSkuPrice", "getSkuTitle", "isPurchased", "postMessagesFromBillingFlow", "refreshPurchases", "sendMessage", "stringId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class TrivialDriveRepository {
    private final com.sample.android.trivialdrivesample.billing.IBillingDataSource billingDataSource = null;
    private final com.sample.android.trivialdrivesample.db.GameStateModel gameStateModel = null;
    private final kotlinx.coroutines.CoroutineScope defaultScope = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Integer> gameMessages = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.android.trivialdrivesample.TrivialDriveRepository.Companion Companion = null;
    public static final int GAS_TANK_MIN = 0;
    public static final int GAS_TANK_MAX = 4;
    public static final int GAS_TANK_INFINITE = 5;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKU_PREMIUM = "premium";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKU_GAS = "gas";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKU_INFINITE_GAS_MONTHLY = "infinite_gas_monthly";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKU_INFINITE_GAS_YEARLY = "infinite_gas_yearly";
    @org.jetbrains.annotations.Nullable()
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] INAPP_SKUS = {"premium", "gas"};
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] SUBSCRIPTION_SKUS = {"infinite_gas_monthly", "infinite_gas_yearly"};
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] AUTO_CONSUME_SKUS = {"gas"};
    
    public TrivialDriveRepository(@org.jetbrains.annotations.NotNull()
    com.sample.android.trivialdrivesample.billing.IBillingDataSource billingDataSource, @org.jetbrains.annotations.NotNull()
    com.sample.android.trivialdrivesample.db.GameStateModel gameStateModel, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope defaultScope) {
        super();
    }
    
    /**
     * Sets up the event that we can use to send messages up to the UI to be used in Snackbars.
     * This collects new purchase events from the BillingDataSource, transforming the known SKU
     * strings into useful String messages, and emitting the messages into the game messages flow.
     */
    private final void postMessagesFromBillingFlow() {
    }
    
    /**
     * Uses one unit of gas if we don't have a subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object drive(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Automatic support for upgrading/downgrading subscription.
     * @param activity
     * @param sku
     */
    public final void buySku(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
    }
    
    /**
     * Return Flow that indicates whether the sku is currently purchased.
     *
     * @param sku the SKU to get and observe the value for
     * @return Flow that returns true if the sku is purchased.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isPurchased(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    /**
     * We can buy gas if:
     * 1) We can add at least one unit of gas
     * 2) The billing data source allows us to purchase, which means that the item isn't already
     *   purchased.
     * For other skus, we rely on just the data from the billing data source. For subscriptions,
     * only one can be held at a time, and purchasing one subscription will use the billing feature
     * to upgrade or downgrade the user from the other.
     *
     * @param sku the SKU to get and observe the value for
     * @return Flow<Boolean> that returns true if the sku can be purchased
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> canPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    /**
     * Combine the results from our subscription flow with our gas tank level from the game state
     * database to get our displayed gas tank level, which will be infinite if a subscription is
     * active.
     *
     * @return Flow that represents the gasTankLevel by game logic.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> gasTankLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshPurchases(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.android.trivialdrivesample.billing.IBillingDataSource getBillingLifecycleObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getSkuTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getSkuPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getSkuDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMessage(int stringId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getBillingFlowInProcess() {
        return null;
    }
    
    public final void debugConsumePremium() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/sample/android/trivialdrivesample/TrivialDriveRepository$Companion;", "", "()V", "AUTO_CONSUME_SKUS", "", "", "getAUTO_CONSUME_SKUS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "GAS_TANK_INFINITE", "", "GAS_TANK_MAX", "GAS_TANK_MIN", "INAPP_SKUS", "getINAPP_SKUS", "SKU_GAS", "SKU_INFINITE_GAS_MONTHLY", "SKU_INFINITE_GAS_YEARLY", "SKU_PREMIUM", "SUBSCRIPTION_SKUS", "getSUBSCRIPTION_SKUS", "TAG", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getINAPP_SKUS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getSUBSCRIPTION_SKUS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getAUTO_CONSUME_SKUS() {
            return null;
        }
    }
}