package com.sample.android.trivialdrivesample.billing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002UVBG\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016H\u0002J\u0016\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00130(2\u0006\u0010)\u001a\u00020\u000bH\u0016J\u0019\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130(H\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001601H\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001601H\u0016J-\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u00105\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0(2\u0006\u0010)\u001a\u00020\u000bH\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0(2\u0006\u0010)\u001a\u00020\u000bH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0(2\u0006\u0010)\u001a\u00020\u000bH\u0016J\b\u0010:\u001a\u00020%H\u0002J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130(2\u0006\u0010)\u001a\u00020\u000bH\u0016J\u0010\u0010<\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u001bH\u0002J3\u0010=\u001a\u00020%2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010)\u001a\u00020\u000b2\u0012\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020%H\u0016J\u0010\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020EH\u0016J \u0010F\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016H\u0016J \u0010H\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0016H\u0002J(\u0010J\u001a\u00020%2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00162\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016H\u0002J\u0011\u0010M\u001a\u00020%H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u0011\u0010O\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\b\u0010P\u001a\u00020%H\u0007J\b\u0010Q\u001a\u00020%H\u0002J\u0018\u0010R\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001bH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00160\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00160\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00120\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00120\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006W"}, d2 = {"Lcom/sample/android/trivialdrivesample/billing/BillingDataSource;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/sample/android/trivialdrivesample/billing/IBillingDataSource;", "application", "Landroid/app/Application;", "defaultScope", "Lkotlinx/coroutines/CoroutineScope;", "knownInappSKUs", "", "", "knownSubscriptionSKUs", "autoConsumeSKUs", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "billingFlowInProcess", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "knownAutoConsumeSKUs", "", "", "newPurchaseFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "purchaseConsumedFlow", "purchaseConsumptionInProcess", "Lcom/android/billingclient/api/Purchase;", "reconnectMilliseconds", "", "skuDetailsMap", "", "Lcom/android/billingclient/api/SkuDetails;", "skuDetailsResponseTime", "skuStateMap", "Lcom/sample/android/trivialdrivesample/billing/BillingDataSource$SkuState;", "addSkuFlows", "", "skuList", "canPurchase", "Lkotlinx/coroutines/flow/Flow;", "sku", "consumeInappPurchase", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePurchase", "purchase", "(Lcom/android/billingclient/api/Purchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowInProcess", "getConsumedPurchases", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewPurchases", "getPurchases", "skus", "skuType", "([Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSkuDescription", "getSkuPrice", "getSkuTitle", "initializeFlows", "isPurchased", "isSignatureValid", "launchBillingFlow", "activity", "Landroid/app/Activity;", "upgradeSkusVarargs", "(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;)V", "onBillingServiceDisconnected", "onBillingSetupFinished", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "onPurchasesUpdated", "list", "onSkuDetailsResponse", "skuDetailsList", "processPurchaseList", "purchases", "skusToUpdate", "querySkuDetailsAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshPurchases", "resume", "retryBillingServiceConnectionWithExponentialBackoff", "setSkuState", "newSkuState", "setSkuStateFromPurchase", "Companion", "SkuState", "app_debug"})
public final class BillingDataSource implements androidx.lifecycle.LifecycleObserver, com.android.billingclient.api.PurchasesUpdatedListener, com.android.billingclient.api.BillingClientStateListener, com.sample.android.trivialdrivesample.billing.IBillingDataSource {
    private final kotlinx.coroutines.CoroutineScope defaultScope = null;
    private final com.android.billingclient.api.BillingClient billingClient = null;
    private final java.util.List<java.lang.String> knownInappSKUs = null;
    private final java.util.List<java.lang.String> knownSubscriptionSKUs = null;
    private final java.util.Set<java.lang.String> knownAutoConsumeSKUs = null;
    private long reconnectMilliseconds = 1000L;
    private long skuDetailsResponseTime = -14400000L;
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<com.sample.android.trivialdrivesample.billing.BillingDataSource.SkuState>> skuStateMap = null;
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<com.android.billingclient.api.SkuDetails>> skuDetailsMap = null;
    private final java.util.Set<com.android.billingclient.api.Purchase> purchaseConsumptionInProcess = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.String>> newPurchaseFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.String>> purchaseConsumedFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> billingFlowInProcess = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.android.trivialdrivesample.billing.BillingDataSource.Companion Companion = null;
    private static final java.lang.String TAG = null;
    @kotlin.jvm.Volatile()
    private static volatile com.sample.android.trivialdrivesample.billing.BillingDataSource sInstance;
    private static final android.os.Handler handler = null;
    
    private BillingDataSource(android.app.Application application, kotlinx.coroutines.CoroutineScope defaultScope, java.lang.String[] knownInappSKUs, java.lang.String[] knownSubscriptionSKUs, java.lang.String[] autoConsumeSKUs) {
        super();
    }
    
    @java.lang.Override()
    public void onBillingSetupFinished(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.BillingResult billingResult) {
    }
    
    /**
     * This is a pretty unusual occurrence. It happens primarily if the Google Play Store
     * self-upgrades or is force closed.
     */
    @java.lang.Override()
    public void onBillingServiceDisconnected() {
    }
    
    /**
     * Retries the billing service connection with exponential backoff, maxing out at the time
     * specified by RECONNECT_TIMER_MAX_TIME_MILLISECONDS.
     */
    private final void retryBillingServiceConnectionWithExponentialBackoff() {
    }
    
    /**
     * Called by initializeFlows to create the various Flow objects we're planning to emit.
     * @param skuList a List<String> of SKUs representing purchases and subscriptions.
     *    </String>
     */
    private final void addSkuFlows(java.util.List<java.lang.String> skuList) {
    }
    
    /**
     * Creates a Flow object for every known SKU so the state and SKU details can be observed
     * in other layers. The repository is responsible for mapping this data in ways that are more
     * useful for the application.
     */
    private final void initializeFlows() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.SharedFlow<java.util.List<java.lang.String>> getNewPurchases() {
        return null;
    }
    
    /**
     * This is a flow that is used to observe consumed purchases.
     * @return Flow that contains skus of the consumed purchases.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.SharedFlow<java.util.List<java.lang.String>> getConsumedPurchases() {
        return null;
    }
    
    /**
     * Returns whether or not the user has purchased a SKU. It does this by returning
     * a Flow that returns true if the SKU is in the PURCHASED state and
     * the Purchase has been acknowledged.
     * @return a Flow that observes the SKUs purchase state
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> isPurchased(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    /**
     * Returns whether or not the user can purchase a SKU. It does this by returning
     * a Flow combine transformation that returns true if the SKU is in the UNSPECIFIED state, as
     * well as if we have skuDetails for the SKU. (SKUs cannot be purchased without valid
     * SkuDetails.)
     * @return a Flow that observes the SKUs purchase state
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> canPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    /**
     * The title of our SKU from SkuDetails.
     * @param sku to get the title from
     * @return title of the requested SKU as an observable Flow<String>
     *    </String>
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getSkuTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getSkuPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getSkuDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
        return null;
    }
    
    /**
     * Receives the result from [.querySkuDetailsAsync]}.
     *
     * Store the SkuDetails and post them in the [.skuDetailsMap]. This allows other
     * parts of the app to use the [SkuDetails] to show SKU information and make purchases.
     */
    private final void onSkuDetailsResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<? extends com.android.billingclient.api.SkuDetails> skuDetailsList) {
    }
    
    /**
     * Calls the billing client functions to query sku details for both the inapp and subscription
     * SKUs. SKU details are useful for displaying item names and price lists to the user, and are
     * required to make a purchase.
     */
    private final java.lang.Object querySkuDetailsAsync(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshPurchases(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Used internally to get purchases from a requested set of SKUs. This is particularly
     * important when changing subscriptions, as onPurchasesUpdated won't update the purchase state
     * of a subscription that has been upgraded from.
     *
     * @param skus skus to get purchase information for
     * @param skuType sku type, inapp or subscription, to get purchase information for.
     * @return purchases
     */
    private final java.lang.Object getPurchases(java.lang.String[] skus, java.lang.String skuType, kotlin.coroutines.Continuation<? super java.util.List<? extends com.android.billingclient.api.Purchase>> continuation) {
        return null;
    }
    
    /**
     * Consumes an in-app purchase. Interested listeners can watch the purchaseConsumed LiveEvent.
     * To make things easy, you can send in a list of SKUs that are auto-consumed by the
     * BillingDataSource.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object consumeInappPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Calling this means that we have the most up-to-date information for a Sku in a purchase
     * object. This uses the purchase state (Pending, Unspecified, Purchased) along with the
     * acknowledged state.
     * @param purchase an up-to-date object to set the state for the Sku
     */
    private final void setSkuStateFromPurchase(com.android.billingclient.api.Purchase purchase) {
    }
    
    /**
     * Since we (mostly) are getting sku states when we actually make a purchase or update
     * purchases, we keep some internal state when we do things like acknowledge or consume.
     * @param sku product ID to change the state of
     * @param newSkuState the new state of the sku.
     */
    private final void setSkuState(java.lang.String sku, com.sample.android.trivialdrivesample.billing.BillingDataSource.SkuState newSkuState) {
    }
    
    /**
     * Goes through each purchase and makes sure that the purchase state is processed and the state
     * is available through Flows. Verifies signature and acknowledges purchases. PURCHASED isn't
     * returned until the purchase is acknowledged.
     *
     * https://developer.android.com/google/play/billing/billing_library_releases_notes#2_0_acknowledge
     *
     * Developers can choose to acknowledge purchases from a server using the
     * Google Play Developer API. The server has direct access to the user database,
     * so using the Google Play Developer API for acknowledgement might be more reliable.
     *
     * If the purchase token is not acknowledged within 3 days,
     * then Google Play will automatically refund and revoke the purchase.
     * This behavior helps ensure that users are not charged unless the user has successfully
     * received access to the content.
     * This eliminates a category of issues where users complain to developers
     * that they paid for something that the app is not giving to them.
     *
     * If a skusToUpdate list is passed-into this method, any purchases not in the list of
     * purchases will have their state set to UNPURCHASED.
     *
     * @param purchases the List of purchases to process.
     * @param skusToUpdate a list of skus that we want to update the state from --- this allows us
     * to set the state of non-returned SKUs to UNPURCHASED.
     */
    private final void processPurchaseList(java.util.List<? extends com.android.billingclient.api.Purchase> purchases, java.util.List<java.lang.String> skusToUpdate) {
    }
    
    /**
     * Internal call only. Assumes that all signature checks have been completed and the purchase
     * is ready to be consumed. If the sku is already being consumed, does nothing.
     * @param purchase purchase to consume
     */
    private final java.lang.Object consumePurchase(com.android.billingclient.api.Purchase purchase, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Launch the billing flow. This will launch an external Activity for a result, so it requires
     * an Activity reference. For subscriptions, it supports upgrading from one SKU type to another
     * by passing in SKUs to be upgraded.
     *
     * @param activity active activity to launch our billing flow from
     * @param sku SKU (Product ID) to be purchased
     * @param upgradeSkusVarargs SKUs that the subscription can be upgraded from
     * @return true if launch is successful
     */
    @java.lang.Override()
    public void launchBillingFlow(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String... upgradeSkusVarargs) {
    }
    
    /**
     * Returns a Flow that reports if a billing flow is in process, meaning that
     * launchBillingFlow has returned BillingResponseCode.OK and onPurchasesUpdated hasn't yet
     * been called.
     * @return Flow that indicates the known state of the billing flow.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> getBillingFlowInProcess() {
        return null;
    }
    
    /**
     * Called by the BillingLibrary when new purchases are detected; typically in response to a
     * launchBillingFlow.
     * @param billingResult result of the purchase flow.
     * @param list of new purchases.
     */
    @java.lang.Override()
    public void onPurchasesUpdated(@org.jetbrains.annotations.NotNull()
    com.android.billingclient.api.BillingResult billingResult, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.android.billingclient.api.Purchase> list) {
    }
    
    /**
     * Ideally your implementation will comprise a secure server, rendering this check
     * unnecessary. @see [Security]
     */
    private final boolean isSignatureValid(com.android.billingclient.api.Purchase purchase) {
        return false;
    }
    
    /**
     * It's recommended to requery purchases during onResume.
     */
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void resume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.sample.android.trivialdrivesample.billing.BillingDataSource getInstance(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope defaultScope, @org.jetbrains.annotations.Nullable()
    java.lang.String[] knownInappSKUs, @org.jetbrains.annotations.Nullable()
    java.lang.String[] knownSubscriptionSKUs, @org.jetbrains.annotations.Nullable()
    java.lang.String[] autoConsumeSKUs) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/android/trivialdrivesample/billing/BillingDataSource$SkuState;", "", "(Ljava/lang/String;I)V", "SKU_STATE_UNPURCHASED", "SKU_STATE_PENDING", "SKU_STATE_PURCHASED", "SKU_STATE_PURCHASED_AND_ACKNOWLEDGED", "app_debug"})
    static enum SkuState {
        /*public static final*/ SKU_STATE_UNPURCHASED /* = new SKU_STATE_UNPURCHASED() */,
        /*public static final*/ SKU_STATE_PENDING /* = new SKU_STATE_PENDING() */,
        /*public static final*/ SKU_STATE_PURCHASED /* = new SKU_STATE_PURCHASED() */,
        /*public static final*/ SKU_STATE_PURCHASED_AND_ACKNOWLEDGED /* = new SKU_STATE_PURCHASED_AND_ACKNOWLEDGED() */;
        
        SkuState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JM\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/sample/android/trivialdrivesample/billing/BillingDataSource$Companion;", "", "()V", "TAG", "", "handler", "Landroid/os/Handler;", "sInstance", "Lcom/sample/android/trivialdrivesample/billing/BillingDataSource;", "getInstance", "application", "Landroid/app/Application;", "defaultScope", "Lkotlinx/coroutines/CoroutineScope;", "knownInappSKUs", "", "knownSubscriptionSKUs", "autoConsumeSKUs", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Lcom/sample/android/trivialdrivesample/billing/BillingDataSource;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.sample.android.trivialdrivesample.billing.BillingDataSource getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope defaultScope, @org.jetbrains.annotations.Nullable()
        java.lang.String[] knownInappSKUs, @org.jetbrains.annotations.Nullable()
        java.lang.String[] knownSubscriptionSKUs, @org.jetbrains.annotations.Nullable()
        java.lang.String[] autoConsumeSKUs) {
            return null;
        }
    }
}