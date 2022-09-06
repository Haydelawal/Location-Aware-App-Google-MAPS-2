package com.psdemo.outdoorexplorer.ui.workouts;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.psdemo.outdoorexplorer.R;

public class WorkoutsFragmentDirections {
  private WorkoutsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationWorkoutsToNavigationWorkout() {
    return new ActionOnlyNavDirections(R.id.action_navigation_workouts_to_navigation_workout);
  }
}
