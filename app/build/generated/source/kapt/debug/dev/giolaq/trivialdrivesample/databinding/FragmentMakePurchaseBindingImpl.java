package dev.giolaq.trivialdrivesample.databinding;
import dev.giolaq.trivialdrivesample.R;
import dev.giolaq.trivialdrivesample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMakePurchaseBindingImpl extends FragmentMakePurchaseBinding  {

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
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMakePurchaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentMakePurchaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.inappInventory.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.mpvm == variableId) {
            setMpvm((com.sample.android.trivialdrivesample.MakePurchaseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMpvm(@Nullable com.sample.android.trivialdrivesample.MakePurchaseViewModel Mpvm) {
        this.mMpvm = Mpvm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mpvm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMpvmBillingFlowInProcess((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMpvmBillingFlowInProcess(androidx.lifecycle.LiveData<java.lang.Boolean> MpvmBillingFlowInProcess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.sample.android.trivialdrivesample.MakePurchaseViewModel mpvm = mMpvm;
        boolean androidxDatabindingViewDataBindingSafeUnboxMpvmBillingFlowInProcessGetValue = false;
        boolean mpvmBillingFlowInProcess = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> MpvmBillingFlowInProcess1 = null;
        java.lang.Boolean mpvmBillingFlowInProcessGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMpvmBillingFlowInProcess = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (mpvm != null) {
                    // read mpvm.billingFlowInProcess
                    MpvmBillingFlowInProcess1 = mpvm.getBillingFlowInProcess();
                }
                updateLiveDataRegistration(0, MpvmBillingFlowInProcess1);


                if (MpvmBillingFlowInProcess1 != null) {
                    // read mpvm.billingFlowInProcess.getValue()
                    mpvmBillingFlowInProcessGetValue = MpvmBillingFlowInProcess1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(mpvm.billingFlowInProcess.getValue())
                androidxDatabindingViewDataBindingSafeUnboxMpvmBillingFlowInProcessGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mpvmBillingFlowInProcessGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(mpvm.billingFlowInProcess.getValue())
                mpvmBillingFlowInProcess = !androidxDatabindingViewDataBindingSafeUnboxMpvmBillingFlowInProcessGetValue;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(mpvm.billingFlowInProcess.getValue()))
                androidxDatabindingViewDataBindingSafeUnboxMpvmBillingFlowInProcess = androidx.databinding.ViewDataBinding.safeUnbox(mpvmBillingFlowInProcess);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.inappInventory.setEnabled(androidxDatabindingViewDataBindingSafeUnboxMpvmBillingFlowInProcess);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mpvm.billingFlowInProcess
        flag 1 (0x2L): mpvm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}