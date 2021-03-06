// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPersonalDashboardBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final TextView backbtn;

  @NonNull
  public final ProgressBar circularProgressBar;

  @NonNull
  public final TextView currentBookingTV;

  @NonNull
  public final TextView currentPlanTV;

  @NonNull
  public final RecyclerView dashList;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final Guideline guideline21;

  @NonNull
  public final Guideline guideline22;

  @NonNull
  public final Guideline guideline24;

  @NonNull
  public final TextView imageViewEdit;

  @NonNull
  public final CircleImageView imageViewProfilePic;

  @NonNull
  public final TextView nameTV;

  @NonNull
  public final TextView planRenewalTV;

  @NonNull
  public final TextView remainingCreditsTV;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textViewLogOut;

  @NonNull
  public final TextView textViewSwitch;

  @NonNull
  public final TextView totalCreditsTV;

  @NonNull
  public final TextView typeTV;

  private ActivityPersonalDashboardBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull CoordinatorLayout alertView, @NonNull TextView backbtn,
      @NonNull ProgressBar circularProgressBar, @NonNull TextView currentBookingTV,
      @NonNull TextView currentPlanTV, @NonNull RecyclerView dashList,
      @NonNull Guideline guideline15, @NonNull Guideline guideline16,
      @NonNull Guideline guideline17, @NonNull Guideline guideline21,
      @NonNull Guideline guideline22, @NonNull Guideline guideline24,
      @NonNull TextView imageViewEdit, @NonNull CircleImageView imageViewProfilePic,
      @NonNull TextView nameTV, @NonNull TextView planRenewalTV,
      @NonNull TextView remainingCreditsTV, @NonNull TextView textView13,
      @NonNull TextView textView14, @NonNull TextView textView19, @NonNull TextView textView20,
      @NonNull TextView textView21, @NonNull TextView textViewLogOut,
      @NonNull TextView textViewSwitch, @NonNull TextView totalCreditsTV,
      @NonNull TextView typeTV) {
    this.rootView = rootView;
    this.alertView = alertView;
    this.backbtn = backbtn;
    this.circularProgressBar = circularProgressBar;
    this.currentBookingTV = currentBookingTV;
    this.currentPlanTV = currentPlanTV;
    this.dashList = dashList;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.guideline21 = guideline21;
    this.guideline22 = guideline22;
    this.guideline24 = guideline24;
    this.imageViewEdit = imageViewEdit;
    this.imageViewProfilePic = imageViewProfilePic;
    this.nameTV = nameTV;
    this.planRenewalTV = planRenewalTV;
    this.remainingCreditsTV = remainingCreditsTV;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView19 = textView19;
    this.textView20 = textView20;
    this.textView21 = textView21;
    this.textViewLogOut = textViewLogOut;
    this.textViewSwitch = textViewSwitch;
    this.totalCreditsTV = totalCreditsTV;
    this.typeTV = typeTV;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPersonalDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPersonalDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_personal_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPersonalDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertView;
      CoordinatorLayout alertView = rootView.findViewById(id);
      if (alertView == null) {
        break missingId;
      }

      id = R.id.backbtn;
      TextView backbtn = rootView.findViewById(id);
      if (backbtn == null) {
        break missingId;
      }

      id = R.id.circular_progress_bar;
      ProgressBar circularProgressBar = rootView.findViewById(id);
      if (circularProgressBar == null) {
        break missingId;
      }

      id = R.id.currentBookingTV;
      TextView currentBookingTV = rootView.findViewById(id);
      if (currentBookingTV == null) {
        break missingId;
      }

      id = R.id.currentPlanTV;
      TextView currentPlanTV = rootView.findViewById(id);
      if (currentPlanTV == null) {
        break missingId;
      }

      id = R.id.dashList;
      RecyclerView dashList = rootView.findViewById(id);
      if (dashList == null) {
        break missingId;
      }

      id = R.id.guideline15;
      Guideline guideline15 = rootView.findViewById(id);
      if (guideline15 == null) {
        break missingId;
      }

      id = R.id.guideline16;
      Guideline guideline16 = rootView.findViewById(id);
      if (guideline16 == null) {
        break missingId;
      }

      id = R.id.guideline17;
      Guideline guideline17 = rootView.findViewById(id);
      if (guideline17 == null) {
        break missingId;
      }

      id = R.id.guideline21;
      Guideline guideline21 = rootView.findViewById(id);
      if (guideline21 == null) {
        break missingId;
      }

      id = R.id.guideline22;
      Guideline guideline22 = rootView.findViewById(id);
      if (guideline22 == null) {
        break missingId;
      }

      id = R.id.guideline24;
      Guideline guideline24 = rootView.findViewById(id);
      if (guideline24 == null) {
        break missingId;
      }

      id = R.id.imageViewEdit;
      TextView imageViewEdit = rootView.findViewById(id);
      if (imageViewEdit == null) {
        break missingId;
      }

      id = R.id.imageViewProfilePic;
      CircleImageView imageViewProfilePic = rootView.findViewById(id);
      if (imageViewProfilePic == null) {
        break missingId;
      }

      id = R.id.nameTV;
      TextView nameTV = rootView.findViewById(id);
      if (nameTV == null) {
        break missingId;
      }

      id = R.id.planRenewalTV;
      TextView planRenewalTV = rootView.findViewById(id);
      if (planRenewalTV == null) {
        break missingId;
      }

      id = R.id.remainingCreditsTV;
      TextView remainingCreditsTV = rootView.findViewById(id);
      if (remainingCreditsTV == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = rootView.findViewById(id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = rootView.findViewById(id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = rootView.findViewById(id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = rootView.findViewById(id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = rootView.findViewById(id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textViewLogOut;
      TextView textViewLogOut = rootView.findViewById(id);
      if (textViewLogOut == null) {
        break missingId;
      }

      id = R.id.textViewSwitch;
      TextView textViewSwitch = rootView.findViewById(id);
      if (textViewSwitch == null) {
        break missingId;
      }

      id = R.id.totalCreditsTV;
      TextView totalCreditsTV = rootView.findViewById(id);
      if (totalCreditsTV == null) {
        break missingId;
      }

      id = R.id.typeTV;
      TextView typeTV = rootView.findViewById(id);
      if (typeTV == null) {
        break missingId;
      }

      return new ActivityPersonalDashboardBinding((LinearLayoutCompat) rootView, alertView, backbtn,
          circularProgressBar, currentBookingTV, currentPlanTV, dashList, guideline15, guideline16,
          guideline17, guideline21, guideline22, guideline24, imageViewEdit, imageViewProfilePic,
          nameTV, planRenewalTV, remainingCreditsTV, textView13, textView14, textView19, textView20,
          textView21, textViewLogOut, textViewSwitch, totalCreditsTV, typeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
