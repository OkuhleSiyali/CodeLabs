package com.example.android.trackmysleepquality.sleeptracker;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SleepTrackerFragmentDirections {
  @NonNull
  public static ActionSleepTrackerFragmentToSleepQualityFragment actionSleepTrackerFragmentToSleepQualityFragment(long sleepNightKey) {
    return new ActionSleepTrackerFragmentToSleepQualityFragment(sleepNightKey);
  }

  @NonNull
  public static ActionSleepTrackerFragmentToSleepDetailFragment actionSleepTrackerFragmentToSleepDetailFragment(long sleepNightKey) {
    return new ActionSleepTrackerFragmentToSleepDetailFragment(sleepNightKey);
  }

  public static class ActionSleepTrackerFragmentToSleepQualityFragment implements NavDirections {
    private long sleepNightKey;

    public ActionSleepTrackerFragmentToSleepQualityFragment(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
    }

    @NonNull
    public ActionSleepTrackerFragmentToSleepQualityFragment setSleepNightKey(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putLong("sleepNightKey", this.sleepNightKey);
      return __outBundle;
    }

    public int getActionId() {
      return com.example.android.trackmysleepquality.R.id.action_sleepTrackerFragment_to_sleepQualityFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSleepTrackerFragmentToSleepQualityFragment that = (ActionSleepTrackerFragmentToSleepQualityFragment) object;
      if (sleepNightKey != that.sleepNightKey) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (int)(sleepNightKey ^ (sleepNightKey >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSleepTrackerFragmentToSleepQualityFragment(actionId=" + getActionId() + "){"
          + "sleepNightKey=" + sleepNightKey
          + "}";
    }
  }

  public static class ActionSleepTrackerFragmentToSleepDetailFragment implements NavDirections {
    private long sleepNightKey;

    public ActionSleepTrackerFragmentToSleepDetailFragment(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
    }

    @NonNull
    public ActionSleepTrackerFragmentToSleepDetailFragment setSleepNightKey(long sleepNightKey) {
      this.sleepNightKey = sleepNightKey;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putLong("sleepNightKey", this.sleepNightKey);
      return __outBundle;
    }

    public int getActionId() {
      return com.example.android.trackmysleepquality.R.id.action_sleep_tracker_fragment_to_sleepDetailFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSleepTrackerFragmentToSleepDetailFragment that = (ActionSleepTrackerFragmentToSleepDetailFragment) object;
      if (sleepNightKey != that.sleepNightKey) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (int)(sleepNightKey ^ (sleepNightKey >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSleepTrackerFragmentToSleepDetailFragment(actionId=" + getActionId() + "){"
          + "sleepNightKey=" + sleepNightKey
          + "}";
    }
  }
}
