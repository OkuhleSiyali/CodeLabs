package com.example.android.trackmysleepquality.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.trackmysleepquality.database.SleepNight;
import com.example.android.trackmysleepquality.sleeptracker.SleepNightListener;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemSleepNightBinding extends ViewDataBinding {
  @NonNull
  public final ImageView qualityImage;

  @NonNull
  public final TextView qualityString;

  @Bindable
  protected SleepNight mSleep;

  @Bindable
  protected SleepNightListener mClickListener;

  protected ListItemSleepNightBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView qualityImage, TextView qualityString) {
    super(_bindingComponent, _root, _localFieldCount);
    this.qualityImage = qualityImage;
    this.qualityString = qualityString;
  }

  public abstract void setSleep(@Nullable SleepNight sleep);

  @Nullable
  public SleepNight getSleep() {
    return mSleep;
  }

  public abstract void setClickListener(@Nullable SleepNightListener clickListener);

  @Nullable
  public SleepNightListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static ListItemSleepNightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_sleep_night, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemSleepNightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemSleepNightBinding>inflateInternal(inflater, com.example.android.trackmysleepquality.R.layout.list_item_sleep_night, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemSleepNightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_sleep_night, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemSleepNightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemSleepNightBinding>inflateInternal(inflater, com.example.android.trackmysleepquality.R.layout.list_item_sleep_night, null, false, component);
  }

  public static ListItemSleepNightBinding bind(@NonNull View view) {
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
  public static ListItemSleepNightBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemSleepNightBinding)bind(component, view, com.example.android.trackmysleepquality.R.layout.list_item_sleep_night);
  }
}
