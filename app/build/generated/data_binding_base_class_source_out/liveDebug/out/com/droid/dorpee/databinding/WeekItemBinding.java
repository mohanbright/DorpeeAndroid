// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WeekItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayoutCompat clickweek;

  @NonNull
  public final LinearLayoutCompat constraintLayoutFromTime;

  @NonNull
  public final LinearLayoutCompat constraintLayoutToTime;

  @NonNull
  public final TextView fromTimeId;

  @NonNull
  public final Guideline guideline25;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ConstraintLayout layout;

  @NonNull
  public final TextView textViewFrom;

  @NonNull
  public final TextView textViewTo;

  @NonNull
  public final TextView textWeek;

  @NonNull
  public final TextView toTimeId;

  private WeekItemBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayoutCompat clickweek,
      @NonNull LinearLayoutCompat constraintLayoutFromTime,
      @NonNull LinearLayoutCompat constraintLayoutToTime, @NonNull TextView fromTimeId,
      @NonNull Guideline guideline25, @NonNull ImageView imageView5, @NonNull ImageView imageView7,
      @NonNull ConstraintLayout layout, @NonNull TextView textViewFrom,
      @NonNull TextView textViewTo, @NonNull TextView textWeek, @NonNull TextView toTimeId) {
    this.rootView = rootView;
    this.clickweek = clickweek;
    this.constraintLayoutFromTime = constraintLayoutFromTime;
    this.constraintLayoutToTime = constraintLayoutToTime;
    this.fromTimeId = fromTimeId;
    this.guideline25 = guideline25;
    this.imageView5 = imageView5;
    this.imageView7 = imageView7;
    this.layout = layout;
    this.textViewFrom = textViewFrom;
    this.textViewTo = textViewTo;
    this.textWeek = textWeek;
    this.toTimeId = toTimeId;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WeekItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WeekItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.week_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WeekItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clickweek;
      LinearLayoutCompat clickweek = rootView.findViewById(id);
      if (clickweek == null) {
        break missingId;
      }

      id = R.id.constraintLayoutFromTime;
      LinearLayoutCompat constraintLayoutFromTime = rootView.findViewById(id);
      if (constraintLayoutFromTime == null) {
        break missingId;
      }

      id = R.id.constraintLayoutToTime;
      LinearLayoutCompat constraintLayoutToTime = rootView.findViewById(id);
      if (constraintLayoutToTime == null) {
        break missingId;
      }

      id = R.id.fromTimeId;
      TextView fromTimeId = rootView.findViewById(id);
      if (fromTimeId == null) {
        break missingId;
      }

      id = R.id.guideline25;
      Guideline guideline25 = rootView.findViewById(id);
      if (guideline25 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = rootView.findViewById(id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = rootView.findViewById(id);
      if (imageView7 == null) {
        break missingId;
      }

      ConstraintLayout layout = (ConstraintLayout) rootView;

      id = R.id.textViewFrom;
      TextView textViewFrom = rootView.findViewById(id);
      if (textViewFrom == null) {
        break missingId;
      }

      id = R.id.textViewTo;
      TextView textViewTo = rootView.findViewById(id);
      if (textViewTo == null) {
        break missingId;
      }

      id = R.id.textWeek;
      TextView textWeek = rootView.findViewById(id);
      if (textWeek == null) {
        break missingId;
      }

      id = R.id.toTimeId;
      TextView toTimeId = rootView.findViewById(id);
      if (toTimeId == null) {
        break missingId;
      }

      return new WeekItemBinding((ConstraintLayout) rootView, clickweek, constraintLayoutFromTime,
          constraintLayoutToTime, fromTimeId, guideline25, imageView5, imageView7, layout,
          textViewFrom, textViewTo, textWeek, toTimeId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}