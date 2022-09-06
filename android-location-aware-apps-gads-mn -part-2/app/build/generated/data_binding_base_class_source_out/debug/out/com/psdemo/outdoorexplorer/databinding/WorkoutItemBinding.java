// Generated by view binder compiler. Do not edit!
package com.psdemo.outdoorexplorer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.psdemo.outdoorexplorer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WorkoutItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView card;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView distance;

  @NonNull
  public final ImageView distanceIcon;

  @NonNull
  public final TextView time;

  @NonNull
  public final ImageView timeIcon;

  private WorkoutItemBinding(@NonNull LinearLayout rootView, @NonNull CardView card,
      @NonNull TextView date, @NonNull TextView distance, @NonNull ImageView distanceIcon,
      @NonNull TextView time, @NonNull ImageView timeIcon) {
    this.rootView = rootView;
    this.card = card;
    this.date = date;
    this.distance = distance;
    this.distanceIcon = distanceIcon;
    this.time = time;
    this.timeIcon = timeIcon;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WorkoutItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WorkoutItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.workout_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WorkoutItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.distance;
      TextView distance = ViewBindings.findChildViewById(rootView, id);
      if (distance == null) {
        break missingId;
      }

      id = R.id.distanceIcon;
      ImageView distanceIcon = ViewBindings.findChildViewById(rootView, id);
      if (distanceIcon == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      id = R.id.timeIcon;
      ImageView timeIcon = ViewBindings.findChildViewById(rootView, id);
      if (timeIcon == null) {
        break missingId;
      }

      return new WorkoutItemBinding((LinearLayout) rootView, card, date, distance, distanceIcon,
          time, timeIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
