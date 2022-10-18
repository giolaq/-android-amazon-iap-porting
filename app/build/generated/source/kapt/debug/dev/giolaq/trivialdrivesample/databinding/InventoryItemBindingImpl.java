package dev.giolaq.trivialdrivesample.databinding;
import dev.giolaq.trivialdrivesample.R;
import dev.giolaq.trivialdrivesample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InventoryItemBindingImpl extends InventoryItemBinding implements dev.giolaq.trivialdrivesample.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InventoryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private InventoryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.skuDescription.setTag(null);
        this.skuImage.setTag(null);
        this.skuPrice.setTag(null);
        this.skuTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new dev.giolaq.trivialdrivesample.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.makePurchaseFragment == variableId) {
            setMakePurchaseFragment((com.sample.android.trivialdrivesample.ui.MakePurchaseFragment) variable);
        }
        else if (BR.sku == variableId) {
            setSku((java.lang.String) variable);
        }
        else if (BR.skuDetails == variableId) {
            setSkuDetails((com.sample.android.trivialdrivesample.MakePurchaseViewModel.SkuDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMakePurchaseFragment(@Nullable com.sample.android.trivialdrivesample.ui.MakePurchaseFragment MakePurchaseFragment) {
        this.mMakePurchaseFragment = MakePurchaseFragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.makePurchaseFragment);
        super.requestRebind();
    }
    public void setSku(@Nullable java.lang.String Sku) {
        this.mSku = Sku;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.sku);
        super.requestRebind();
    }
    public void setSkuDetails(@Nullable com.sample.android.trivialdrivesample.MakePurchaseViewModel.SkuDetails SkuDetails) {
        this.mSkuDetails = SkuDetails;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.skuDetails);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSkuDetailsPrice((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSkuDetailsDescription((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMakePurchaseFragmentCanBuySkuSkuDetailsSku((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeMakePurchaseFragmentSkuTitleSku((androidx.lifecycle.LiveData<java.lang.CharSequence>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSkuDetailsPrice(androidx.lifecycle.LiveData<java.lang.String> SkuDetailsPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSkuDetailsDescription(androidx.lifecycle.LiveData<java.lang.String> SkuDetailsDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMakePurchaseFragmentCanBuySkuSkuDetailsSku(androidx.lifecycle.LiveData<java.lang.Boolean> MakePurchaseFragmentCanBuySkuSkuDetailsSku, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMakePurchaseFragmentSkuTitleSku(androidx.lifecycle.LiveData<java.lang.CharSequence> MakePurchaseFragmentSkuTitleSku, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> skuDetailsPrice = null;
        androidx.lifecycle.LiveData<java.lang.String> skuDetailsDescription = null;
        java.lang.String skuTitleAndroidStringDebugTitleNotFoundSku = null;
        com.sample.android.trivialdrivesample.ui.MakePurchaseFragment makePurchaseFragment = mMakePurchaseFragment;
        boolean skuDetailsPriceJavaLangObjectNull = false;
        java.lang.Object makePurchaseFragmentSkuTitleSkuJavaLangObjectNullSkuTitleAndroidStringDebugTitleNotFoundSkuMakePurchaseFragmentSkuTitleSku = null;
        java.lang.String skuDetailsPriceGetValue = null;
        java.lang.CharSequence makePurchaseFragmentSkuTitleSkuGetValue = null;
        java.lang.String sku = mSku;
        androidx.lifecycle.LiveData<java.lang.Boolean> makePurchaseFragmentCanBuySkuSkuDetailsSku = null;
        java.lang.String skuDetailsDescriptionJavaLangObjectNullSkuDescriptionAndroidStringDebugDescriptionNotFoundSkuDetailsDescription = null;
        com.sample.android.trivialdrivesample.MakePurchaseViewModel.SkuDetails skuDetails = mSkuDetails;
        androidx.lifecycle.LiveData<java.lang.CharSequence> makePurchaseFragmentSkuTitleSku = null;
        boolean makePurchaseFragmentSkuTitleSkuJavaLangObjectNull = false;
        int skuDetailsIconDrawableId = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxMakePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue = false;
        java.lang.String skuDetailsPriceJavaLangObjectNullSkuPriceAndroidStringDebugPriceNotFoundSkuDetailsPrice = null;
        java.lang.Boolean makePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue = null;
        android.graphics.drawable.Drawable contextGetDrawableSkuDetailsIconDrawableId = null;
        java.lang.String skuDetailsDescriptionGetValue = null;
        java.lang.String skuDetailsSku = null;
        boolean skuDetailsDescriptionJavaLangObjectNull = false;

        if ((dirtyFlags & 0xfcL) != 0) {
        }
        if ((dirtyFlags & 0xb8L) != 0) {



                if (makePurchaseFragment != null) {
                    // read makePurchaseFragment.skuTitle(sku)
                    makePurchaseFragmentSkuTitleSku = makePurchaseFragment.skuTitle(sku);
                }
                updateLiveDataRegistration(3, makePurchaseFragmentSkuTitleSku);


                if (makePurchaseFragmentSkuTitleSku != null) {
                    // read makePurchaseFragment.skuTitle(sku).getValue()
                    makePurchaseFragmentSkuTitleSkuGetValue = makePurchaseFragmentSkuTitleSku.getValue();
                }


                // read makePurchaseFragment.skuTitle(sku).getValue() == null
                makePurchaseFragmentSkuTitleSkuJavaLangObjectNull = (makePurchaseFragmentSkuTitleSkuGetValue) == (null);
            if((dirtyFlags & 0xb8L) != 0) {
                if(makePurchaseFragmentSkuTitleSkuJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
        }
        if ((dirtyFlags & 0xd7L) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (skuDetails != null) {
                        // read skuDetails.price
                        skuDetailsPrice = skuDetails.getPrice();
                    }
                    updateLiveDataRegistration(0, skuDetailsPrice);


                    if (skuDetailsPrice != null) {
                        // read skuDetails.price.getValue()
                        skuDetailsPriceGetValue = skuDetailsPrice.getValue();
                    }


                    // read skuDetails.price.getValue() == null
                    skuDetailsPriceJavaLangObjectNull = (skuDetailsPriceGetValue) == (null);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(skuDetailsPriceJavaLangObjectNull) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (skuDetails != null) {
                        // read skuDetails.description
                        skuDetailsDescription = skuDetails.getDescription();
                    }
                    updateLiveDataRegistration(1, skuDetailsDescription);


                    if (skuDetailsDescription != null) {
                        // read skuDetails.description.getValue()
                        skuDetailsDescriptionGetValue = skuDetailsDescription.getValue();
                    }


                    // read skuDetails.description.getValue() == null
                    skuDetailsDescriptionJavaLangObjectNull = (skuDetailsDescriptionGetValue) == (null);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(skuDetailsDescriptionJavaLangObjectNull) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (skuDetails != null) {
                        // read skuDetails.iconDrawableId
                        skuDetailsIconDrawableId = skuDetails.getIconDrawableId();
                    }


                    // read context.getDrawable(skuDetails.iconDrawableId)
                    contextGetDrawableSkuDetailsIconDrawableId = getRoot().getContext().getDrawable(skuDetailsIconDrawableId);
            }
            if ((dirtyFlags & 0xd4L) != 0) {

                    if (skuDetails != null) {
                        // read skuDetails.sku
                        skuDetailsSku = skuDetails.getSku();
                    }


                    if (makePurchaseFragment != null) {
                        // read makePurchaseFragment.canBuySku(skuDetails.sku)
                        makePurchaseFragmentCanBuySkuSkuDetailsSku = makePurchaseFragment.canBuySku(skuDetailsSku);
                    }
                    updateLiveDataRegistration(2, makePurchaseFragmentCanBuySkuSkuDetailsSku);


                    if (makePurchaseFragmentCanBuySkuSkuDetailsSku != null) {
                        // read makePurchaseFragment.canBuySku(skuDetails.sku).getValue()
                        makePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue = makePurchaseFragmentCanBuySkuSkuDetailsSku.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(makePurchaseFragment.canBuySku(skuDetails.sku).getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMakePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue = androidx.databinding.ViewDataBinding.safeUnbox(makePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                // read @android:string/debug_title_not_found
                skuTitleAndroidStringDebugTitleNotFoundSku = skuTitle.getResources().getString(R.string.debug_title_not_found, sku);
        }
        if ((dirtyFlags & 0xc2L) != 0) {

                // read skuDetails.description.getValue() == null ? @android:string/debug_description_not_found : skuDetails.description.getValue()
                skuDetailsDescriptionJavaLangObjectNullSkuDescriptionAndroidStringDebugDescriptionNotFoundSkuDetailsDescription = ((skuDetailsDescriptionJavaLangObjectNull) ? (skuDescription.getResources().getString(R.string.debug_description_not_found)) : (skuDetailsDescriptionGetValue));
        }
        if ((dirtyFlags & 0xc1L) != 0) {

                // read skuDetails.price.getValue() == null ? @android:string/debug_price_not_found : skuDetails.price.getValue()
                skuDetailsPriceJavaLangObjectNullSkuPriceAndroidStringDebugPriceNotFoundSkuDetailsPrice = ((skuDetailsPriceJavaLangObjectNull) ? (skuPrice.getResources().getString(R.string.debug_price_not_found)) : (skuDetailsPriceGetValue));
        }

        if ((dirtyFlags & 0xb8L) != 0) {

                // read makePurchaseFragment.skuTitle(sku).getValue() == null ? @android:string/debug_title_not_found : makePurchaseFragment.skuTitle(sku).getValue()
                makePurchaseFragmentSkuTitleSkuJavaLangObjectNullSkuTitleAndroidStringDebugTitleNotFoundSkuMakePurchaseFragmentSkuTitleSku = ((makePurchaseFragmentSkuTitleSkuJavaLangObjectNull) ? (skuTitleAndroidStringDebugTitleNotFoundSku) : (makePurchaseFragmentSkuTitleSkuGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0xd4L) != 0) {
            // api target 1

            this.mboundView0.setEnabled(androidxDatabindingViewDataBindingSafeUnboxMakePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue);
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView0, mCallback1, androidxDatabindingViewDataBindingSafeUnboxMakePurchaseFragmentCanBuySkuSkuDetailsSkuGetValue);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skuDescription, skuDetailsDescriptionJavaLangObjectNullSkuDescriptionAndroidStringDebugDescriptionNotFoundSkuDetailsDescription);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.skuImage, contextGetDrawableSkuDetailsIconDrawableId);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skuPrice, skuDetailsPriceJavaLangObjectNullSkuPriceAndroidStringDebugPriceNotFoundSkuDetailsPrice);
        }
        if ((dirtyFlags & 0xb8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skuTitle, (java.lang.CharSequence) makePurchaseFragmentSkuTitleSkuJavaLangObjectNullSkuTitleAndroidStringDebugTitleNotFoundSkuMakePurchaseFragmentSkuTitleSku);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // skuDetails
        com.sample.android.trivialdrivesample.MakePurchaseViewModel.SkuDetails skuDetails = mSkuDetails;
        // skuDetails != null
        boolean skuDetailsJavaLangObjectNull = false;
        // makePurchaseFragment
        com.sample.android.trivialdrivesample.ui.MakePurchaseFragment makePurchaseFragment = mMakePurchaseFragment;
        // makePurchaseFragment != null
        boolean makePurchaseFragmentJavaLangObjectNull = false;
        // skuDetails.sku
        java.lang.String skuDetailsSku = null;



        makePurchaseFragmentJavaLangObjectNull = (makePurchaseFragment) != (null);
        if (makePurchaseFragmentJavaLangObjectNull) {



            skuDetailsJavaLangObjectNull = (skuDetails) != (null);
            if (skuDetailsJavaLangObjectNull) {


                skuDetailsSku = skuDetails.getSku();

                makePurchaseFragment.makePurchase(skuDetailsSku);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): skuDetails.price
        flag 1 (0x2L): skuDetails.description
        flag 2 (0x3L): makePurchaseFragment.canBuySku(skuDetails.sku)
        flag 3 (0x4L): makePurchaseFragment.skuTitle(sku)
        flag 4 (0x5L): makePurchaseFragment
        flag 5 (0x6L): sku
        flag 6 (0x7L): skuDetails
        flag 7 (0x8L): null
        flag 8 (0x9L): makePurchaseFragment.skuTitle(sku).getValue() == null ? @android:string/debug_title_not_found : makePurchaseFragment.skuTitle(sku).getValue()
        flag 9 (0xaL): makePurchaseFragment.skuTitle(sku).getValue() == null ? @android:string/debug_title_not_found : makePurchaseFragment.skuTitle(sku).getValue()
        flag 10 (0xbL): skuDetails.description.getValue() == null ? @android:string/debug_description_not_found : skuDetails.description.getValue()
        flag 11 (0xcL): skuDetails.description.getValue() == null ? @android:string/debug_description_not_found : skuDetails.description.getValue()
        flag 12 (0xdL): skuDetails.price.getValue() == null ? @android:string/debug_price_not_found : skuDetails.price.getValue()
        flag 13 (0xeL): skuDetails.price.getValue() == null ? @android:string/debug_price_not_found : skuDetails.price.getValue()
    flag mapping end*/
    //end
}