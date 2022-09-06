package com.psdemo.outdoorexplorer.ui.workout;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.psdemo.outdoorexplorer.R;

public class WorkoutFragmentDirections {
  private WorkoutFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationWorkoutToNavigationWorkouts() {
    return new ActionOnlyNavDirections(R.id.action_navigation_workout_to_navigation_workouts);
  }
}
