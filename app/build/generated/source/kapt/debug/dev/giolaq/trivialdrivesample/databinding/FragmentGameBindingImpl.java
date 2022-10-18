package dev.giolaq.trivialdrivesample.databinding;
import dev.giolaq.trivialdrivesample.R;
import dev.giolaq.trivialdrivesample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameBindingImpl extends FragmentGameBinding implements dev.giolaq.trivialdrivesample.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint_layout, 5);
        sViewsWithIds.put(R.id.title_view, 6);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.Button) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[6]
            );
        this.buyButton.setTag(null);
        this.driveButton.setTag(null);
        this.freeOrPremium.setTag(null);
        this.gasGauge.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new dev.giolaq.trivialdrivesample.generated.callback.OnClickListener(this, 1);
        mCallback3 = new dev.giolaq.trivialdrivesample.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.gasTankImages == variableId) {
            setGasTankImages((android.content.res.TypedArray) variable);
        }
        else if (BR.gvm == variableId) {
            setGvm((com.sample.android.trivialdrivesample.GameViewModel) variable);
        }
        else if (BR.gameFragment == variableId) {
            setGameFragment((com.sample.android.trivialdrivesample.ui.GameFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGasTankImages(@Nullable android.content.res.TypedArray GasTankImages) {
        this.mGasTankImages = GasTankImages;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.gasTankImages);
        super.requestRebind();
    }
    public void setGvm(@Nullable com.sample.android.trivialdrivesample.GameViewModel Gvm) {
        this.mGvm = Gvm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.gvm);
        super.requestRebind();
    }
    public void setGameFragment(@Nullable com.sample.android.trivialdrivesample.ui.GameFragment GameFragment) {
        this.mGameFragment = GameFragment;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.gameFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGvmGasUnitsRemaining((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeGvmCanDrive((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeGvmPremium((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGvmGasUnitsRemaining(androidx.lifecycle.LiveData<java.lang.Integer> GvmGasUnitsRemaining, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGvmCanDrive(androidx.lifecycle.LiveData<java.lang.Boolean> GvmCanDrive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGvmPremium(androidx.lifecycle.LiveData<java.lang.Boolean> GvmPremium, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.Boolean gvmCanDriveGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxGvmPremiumGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxGvmCanDriveGetValue = false;
        android.graphics.drawable.Drawable gvmPremiumFreeOrPremiumAndroidDrawablePremiumFreeOrPremiumAndroidDrawableFree = null;
        java.lang.Boolean gvmPremiumGetValue = null;
        android.content.res.TypedArray gasTankImages = mGasTankImages;
        android.graphics.drawable.Drawable gasTankImagesGetDrawableGvmGasUnitsRemaining = null;
        java.lang.Integer gvmGasUnitsRemainingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> gvmGasUnitsRemaining = null;
        int androidxDatabindingViewDataBindingSafeUnboxGvmGasUnitsRemainingGetValue = 0;
        com.sample.android.trivialdrivesample.GameViewModel gvm = mGvm;
        androidx.lifecycle.LiveData<java.lang.Boolean> gvmCanDrive = null;
        com.sample.android.trivialdrivesample.ui.GameFragment gameFragment = mGameFragment;
        androidx.lifecycle.LiveData<java.lang.Boolean> gvmPremium = null;

        if ((dirtyFlags & 0x59L) != 0) {
        }
        if ((dirtyFlags & 0x5fL) != 0) {


            if ((dirtyFlags & 0x59L) != 0) {

                    if (gvm != null) {
                        // read gvm.gasUnitsRemaining
                        gvmGasUnitsRemaining = gvm.getGasUnitsRemaining();
                    }
                    updateLiveDataRegistration(0, gvmGasUnitsRemaining);


                    if (gvmGasUnitsRemaining != null) {
                        // read gvm.gasUnitsRemaining.getValue()
                        gvmGasUnitsRemainingGetValue = gvmGasUnitsRemaining.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(gvm.gasUnitsRemaining.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxGvmGasUnitsRemainingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(gvmGasUnitsRemainingGetValue);


                    if (gasTankImages != null) {
                        // read gasTankImages.getDrawable(androidx.databinding.ViewDataBinding.safeUnbox(gvm.gasUnitsRemaining.getValue()))
                        gasTankImagesGetDrawableGvmGasUnitsRemaining = gasTankImages.getDrawable(androidxDatabindingViewDataBindingSafeUnboxGvmGasUnitsRemainingGetValue);
                    }
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (gvm != null) {
                        // read gvm.canDrive()
                        gvmCanDrive = gvm.canDrive();
                    }
                    updateLiveDataRegistration(1, gvmCanDrive);


                    if (gvmCanDrive != null) {
                        // read gvm.canDrive().getValue()
                        gvmCanDriveGetValue = gvmCanDrive.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(gvm.canDrive().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxGvmCanDriveGetValue = androidx.databinding.ViewDataBinding.safeUnbox(gvmCanDriveGetValue);
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (gvm != null) {
                        // read gvm.premium
                        gvmPremium = gvm.isPremium();
                    }
                    updateLiveDataRegistration(2, gvmPremium);


                    if (gvmPremium != null) {
                        // read gvm.premium.getValue()
                        gvmPremiumGetValue = gvmPremium.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(gvm.premium.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxGvmPremiumGetValue = androidx.databinding.ViewDataBinding.safeUnbox(gvmPremiumGetValue);
                if((dirtyFlags & 0x54L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxGvmPremiumGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(gvm.premium.getValue()) ? @android:drawable/premium : @android:drawable/free
                    gvmPremiumFreeOrPremiumAndroidDrawablePremiumFreeOrPremiumAndroidDrawableFree = ((androidxDatabindingViewDataBindingSafeUnboxGvmPremiumGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(freeOrPremium.getContext(), R.drawable.premium)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(freeOrPremium.getContext(), R.drawable.free)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.buyButton.setOnClickListener(mCallback3);
            this.driveButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.driveButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxGvmCanDriveGetValue);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.freeOrPremium, gvmPremiumFreeOrPremiumAndroidDrawablePremiumFreeOrPremiumAndroidDrawableFree);
        }
        if ((dirtyFlags & 0x59L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.gasGauge, gasTankImagesGetDrawableGvmGasUnitsRemaining);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // gameFragment != null
                boolean gameFragmentJavaLangObjectNull = false;
                // gameFragment
                com.sample.android.trivialdrivesample.ui.GameFragment gameFragment = mGameFragment;



                gameFragmentJavaLangObjectNull = (gameFragment) != (null);
                if (gameFragmentJavaLangObjectNull) {


                    gameFragment.drive();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // gameFragment != null
                boolean gameFragmentJavaLangObjectNull = false;
                // gameFragment
                com.sample.android.trivialdrivesample.ui.GameFragment gameFragment = mGameFragment;



                gameFragmentJavaLangObjectNull = (gameFragment) != (null);
                if (gameFragmentJavaLangObjectNull) {



                    gameFragment.purchase(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gvm.gasUnitsRemaining
        flag 1 (0x2L): gvm.canDrive()
        flag 2 (0x3L): gvm.premium
        flag 3 (0x4L): gasTankImages
        flag 4 (0x5L): gvm
        flag 5 (0x6L): gameFragment
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(gvm.premium.getValue()) ? @android:drawable/premium : @android:drawable/free
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(gvm.premium.getValue()) ? @android:drawable/premium : @android:drawable/free
    flag mapping end*/
    //end
}