package com.sample.android.trivialdrivesample.billing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2 = {"RECONNECT_TIMER_MAX_TIME_MILLISECONDS", "", "RECONNECT_TIMER_START_MILLISECONDS", "SKU_DETAILS_REQUERY_TIME", "app_debug"})
public final class BillingDataSourceKt {
    
    /**
     * The BillingDataSource implements all billing functionality for our test application.
     * Purchases can happen while in the app or at any time while out of the app, so the
     * BillingDataSource has to account for that.
     *
     * Since every SKU (Product ID) can have an individual state, all SKUs have an associated StateFlow
     * to allow their state to be observed.
     *
     * This BillingDataSource knows nothing about the application; all necessary information is either
     * passed into the constructor, exported as observable Flows, or exported through callbacks.
     * This code can be reused in a variety of apps.
     *
     * Beginning a purchase flow involves passing an Activity into the Billing Library, but we merely
     * pass it along to the API.
     *
     * This data source has a few automatic features:
     * 1) It checks for a valid signature on all purchases before attempting to acknowledge them.
     * 2) It automatically acknowledges all known SKUs for non-consumables, and doesn't set the state
     * to purchased until the acknowledgement is complete.
     * 3) The data source will automatically consume skus that are set in knownAutoConsumeSKUs. As
     * SKUs are consumed, a Flow will emit.
     * 4) If the BillingService is disconnected, it will attempt to reconnect with exponential
     * fallback.
     *
     * This data source attempts to keep billing library specific knowledge confined to this file;
     * The only thing that clients of the BillingDataSource need to know are the SKUs used by their
     * application.
     *
     * The BillingClient needs access to the Application context in order to bind the remote billing
     * service.
     *
     * The BillingDataSource can also act as a LifecycleObserver for an Activity; this allows it to
     * refresh purchases during onResume.
     */
    private static final long RECONNECT_TIMER_START_MILLISECONDS = 1000L;
    private static final long RECONNECT_TIMER_MAX_TIME_MILLISECONDS = 900000L;
    private static final long SKU_DETAILS_REQUERY_TIME = 14400000L;
}