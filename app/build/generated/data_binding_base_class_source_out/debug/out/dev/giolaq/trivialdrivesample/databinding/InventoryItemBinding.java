// Generated by data binding compiler. Do not edit!
package dev.giolaq.trivialdrivesample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sample.android.trivialdrivesample.MakePurchaseViewModel;
import com.sample.android.trivialdrivesample.ui.MakePurchaseFragment;
import dev.giolaq.trivialdrivesample.R;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.String;

public abstract class InventoryItemBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView skuDescription;

  @NonNull
  public final AppCompatImageView skuImage;

  @NonNull
  public final AppCompatTextView skuPrice;

  @NonNull
  public final AppCompatTextView skuTitle;

  @Bindable
  protected String mSku;

  @Bindable
  protected MakePurchaseViewModel.SkuDetails mSkuDetails;

  @Bindable
  protected MakePurchaseFragment mMakePurchaseFragment;

  protected InventoryItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView skuDescription, AppCompatImageView skuImage, AppCompatTextView skuPrice,
      AppCompatTextView skuTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.skuDescription = skuDescription;
    this.skuImage = skuImage;
    this.skuPrice = skuPrice;
    this.skuTitle = skuTitle;
  }

  public abstract void setSku(@Nullable String sku);

  @Nullable
  public String getSku() {
    return mSku;
  }

  public abstract void setSkuDetails(@Nullable MakePurchaseViewModel.SkuDetails skuDetails);

  @Nullable
  public MakePurchaseViewModel.SkuDetails getSkuDetails() {
    return mSkuDetails;
  }

  public abstract void setMakePurchaseFragment(@Nullable MakePurchaseFragment makePurchaseFragment);

  @Nullable
  public MakePurchaseFragment getMakePurchaseFragment() {
    return mMakePurchaseFragment;
  }

  @NonNull
  public static InventoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.inventory_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static InventoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<InventoryItemBinding>inflateInternal(inflater, R.layout.inventory_item, root, attachToRoot, component);
  }

  @NonNull
  public static InventoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.inventory_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static InventoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<InventoryItemBinding>inflateInternal(inflater, R.layout.inventory_item, null, false, component);
  }

  public static InventoryItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static InventoryItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (InventoryItemBinding)bind(component, view, R.layout.inventory_item);
  }
}
