package dev.giolaq.trivialdrivesample;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import dev.giolaq.trivialdrivesample.databinding.ActivityMainBindingImpl;
import dev.giolaq.trivialdrivesample.databinding.FragmentGameBindingImpl;
import dev.giolaq.trivialdrivesample.databinding.FragmentMakePurchaseBindingImpl;
import dev.giolaq.trivialdrivesample.databinding.InventoryHeaderBindingImpl;
import dev.giolaq.trivialdrivesample.databinding.InventoryItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTGAME = 2;

  private static final int LAYOUT_FRAGMENTMAKEPURCHASE = 3;

  private static final int LAYOUT_INVENTORYHEADER = 4;

  private static final int LAYOUT_INVENTORYITEM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.giolaq.trivialdrivesample.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.giolaq.trivialdrivesample.R.layout.fragment_game, LAYOUT_FRAGMENTGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.giolaq.trivialdrivesample.R.layout.fragment_make_purchase, LAYOUT_FRAGMENTMAKEPURCHASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.giolaq.trivialdrivesample.R.layout.inventory_header, LAYOUT_INVENTORYHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.giolaq.trivialdrivesample.R.layout.inventory_item, LAYOUT_INVENTORYITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGAME: {
          if ("layout/fragment_game_0".equals(tag)) {
            return new FragmentGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_game is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAKEPURCHASE: {
          if ("layout/fragment_make_purchase_0".equals(tag)) {
            return new FragmentMakePurchaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_make_purchase is invalid. Received: " + tag);
        }
        case  LAYOUT_INVENTORYHEADER: {
          if ("layout/inventory_header_0".equals(tag)) {
            return new InventoryHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for inventory_header is invalid. Received: " + tag);
        }
        case  LAYOUT_INVENTORYITEM: {
          if ("layout/inventory_item_0".equals(tag)) {
            return new InventoryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for inventory_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "gameFragment");
      sKeys.put(2, "gasTankImages");
      sKeys.put(3, "gvm");
      sKeys.put(4, "makePurchaseFragment");
      sKeys.put(5, "mpvm");
      sKeys.put(6, "sku");
      sKeys.put(7, "skuDetails");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", dev.giolaq.trivialdrivesample.R.layout.activity_main);
      sKeys.put("layout/fragment_game_0", dev.giolaq.trivialdrivesample.R.layout.fragment_game);
      sKeys.put("layout/fragment_make_purchase_0", dev.giolaq.trivialdrivesample.R.layout.fragment_make_purchase);
      sKeys.put("layout/inventory_header_0", dev.giolaq.trivialdrivesample.R.layout.inventory_header);
      sKeys.put("layout/inventory_item_0", dev.giolaq.trivialdrivesample.R.layout.inventory_item);
    }
  }
}
