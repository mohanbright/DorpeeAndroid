// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBookingStep1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final TextView dateId;

  @NonNull
  public final LinearLayoutCompat dateLayout;

  @NonNull
  public final EditText editTextNoOFWorkSpace;

  @NonNull
  public final EditText editTextNopeople;

  @NonNull
  public final LinearLayoutCompat fromLayout;

  @NonNull
  public final TextView fromTimeId;

  @NonNull
  public final ImageView imageViewSpace;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat9;

  @NonNull
  public final PowerSpinnerView spinnerVenues;

  @NonNull
  public final TextView textView71;

  @NonNull
  public final TextView textView76;

  @NonNull
  public final TextView textView77;

  @NonNull
  public final TextView textView84;

  @NonNull
  public final TextView textViewAt;

  @NonNull
  public final TextView textViewCapcity;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewPrice;

  @NonNull
  public final TextView textViewspces;

  @NonNull
  public final LinearLayoutCompat toLayout;

  @NonNull
  public final TextView toTimeId;

  @NonNull
  public final TextView tvErrCapacity;

  @NonNull
  public final TextView tvMessageWS;

  @NonNull
  public final TextView tvTime;

  private FragmentBookingStep1Binding(@NonNull ConstraintLayout rootView,
      @NonNull CoordinatorLayout alertView, @NonNull Button buttonNext, @NonNull TextView dateId,
      @NonNull LinearLayoutCompat dateLayout, @NonNull EditText editTextNoOFWorkSpace,
      @NonNull EditText editTextNopeople, @NonNull LinearLayoutCompat fromLayout,
      @NonNull TextView fromTimeId, @NonNull ImageView imageViewSpace,
      @NonNull LinearLayoutCompat linearLayoutCompat9, @NonNull PowerSpinnerView spinnerVenues,
      @NonNull TextView textView71, @NonNull TextView textView76, @NonNull TextView textView77,
      @NonNull TextView textView84, @NonNull TextView textViewAt, @NonNull TextView textViewCapcity,
      @NonNull TextView textViewName, @NonNull TextView textViewPrice,
      @NonNull TextView textViewspces, @NonNull LinearLayoutCompat toLayout,
      @NonNull TextView toTimeId, @NonNull TextView tvErrCapacity, @NonNull TextView tvMessageWS,
      @NonNull TextView tvTime) {
    this.rootView = rootView;
    this.alertView = alertView;
    this.buttonNext = buttonNext;
    this.dateId = dateId;
    this.dateLayout = dateLayout;
    this.editTextNoOFWorkSpace = editTextNoOFWorkSpace;
    this.editTextNopeople = editTextNopeople;
    this.fromLayout = fromLayout;
    this.fromTimeId = fromTimeId;
    this.imageViewSpace = imageViewSpace;
    this.linearLayoutCompat9 = linearLayoutCompat9;
    this.spinnerVenues = spinnerVenues;
    this.textView71 = textView71;
    this.textView76 = textView76;
    this.textView77 = textView77;
    this.textView84 = textView84;
    this.textViewAt = textViewAt;
    this.textViewCapcity = textViewCapcity;
    this.textViewName = textViewName;
    this.textViewPrice = textViewPrice;
    this.textViewspces = textViewspces;
    this.toLayout = toLayout;
    this.toTimeId = toTimeId;
    this.tvErrCapacity = tvErrCapacity;
    this.tvMessageWS = tvMessageWS;
    this.tvTime = tvTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBookingStep1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBookingStep1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_booking_step1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBookingStep1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertView;
      CoordinatorLayout alertView = rootView.findViewById(id);
      if (alertView == null) {
        break missingId;
      }

      id = R.id.buttonNext;
      Button buttonNext = rootView.findViewById(id);
      if (buttonNext == null) {
        break missingId;
      }

      id = R.id.dateId;
      TextView dateId = rootView.findViewById(id);
      if (dateId == null) {
        break missingId;
      }

      id = R.id.dateLayout;
      LinearLayoutCompat dateLayout = rootView.findViewById(id);
      if (dateLayout == null) {
        break missingId;
      }

      id = R.id.editTextNoOFWorkSpace;
      EditText editTextNoOFWorkSpace = rootView.findViewById(id);
      if (editTextNoOFWorkSpace == null) {
        break missingId;
      }

      id = R.id.editTextNopeople;
      EditText editTextNopeople = rootView.findViewById(id);
      if (editTextNopeople == null) {
        break missingId;
      }

      id = R.id.fromLayout;
      LinearLayoutCompat fromLayout = rootView.findViewById(id);
      if (fromLayout == null) {
        break missingId;
      }

      id = R.id.fromTimeId;
      TextView fromTimeId = rootView.findViewById(id);
      if (fromTimeId == null) {
        break missingId;
      }

      id = R.id.imageViewSpace;
      ImageView imageViewSpace = rootView.findViewById(id);
      if (imageViewSpace == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat9;
      LinearLayoutCompat linearLayoutCompat9 = rootView.findViewById(id);
      if (linearLayoutCompat9 == null) {
        break missingId;
      }

      id = R.id.spinnerVenues;
      PowerSpinnerView spinnerVenues = rootView.findViewById(id);
      if (spinnerVenues == null) {
        break missingId;
      }

      id = R.id.textView71;
      TextView textView71 = rootView.findViewById(id);
      if (textView71 == null) {
        break missingId;
      }

      id = R.id.textView76;
      TextView textView76 = rootView.findViewById(id);
      if (textView76 == null) {
        break missingId;
      }

      id = R.id.textView77;
      TextView textView77 = rootView.findViewById(id);
      if (textView77 == null) {
        break missingId;
      }

      id = R.id.textView84;
      TextView textView84 = rootView.findViewById(id);
      if (textView84 == null) {
        break missingId;
      }

      id = R.id.textViewAt;
      TextView textViewAt = rootView.findViewById(id);
      if (textViewAt == null) {
        break missingId;
      }

      id = R.id.textViewCapcity;
      TextView textViewCapcity = rootView.findViewById(id);
      if (textViewCapcity == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = rootView.findViewById(id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.textViewPrice;
      TextView textViewPrice = rootView.findViewById(id);
      if (textViewPrice == null) {
        break missingId;
      }

      id = R.id.textViewspces;
      TextView textViewspces = rootView.findViewById(id);
      if (textViewspces == null) {
        break missingId;
      }

      id = R.id.toLayout;
      LinearLayoutCompat toLayout = rootView.findViewById(id);
      if (toLayout == null) {
        break missingId;
      }

      id = R.id.toTimeId;
      TextView toTimeId = rootView.findViewById(id);
      if (toTimeId == null) {
        break missingId;
      }

      id = R.id.tv_errCapacity;
      TextView tvErrCapacity = rootView.findViewById(id);
      if (tvErrCapacity == null) {
        break missingId;
      }

      id = R.id.tv_messageWS;
      TextView tvMessageWS = rootView.findViewById(id);
      if (tvMessageWS == null) {
        break missingId;
      }

      id = R.id.tv_time;
      TextView tvTime = rootView.findViewById(id);
      if (tvTime == null) {
        break missingId;
      }

      return new FragmentBookingStep1Binding((ConstraintLayout) rootView, alertView, buttonNext,
          dateId, dateLayout, editTextNoOFWorkSpace, editTextNopeople, fromLayout, fromTimeId,
          imageViewSpace, linearLayoutCompat9, spinnerVenues, textView71, textView76, textView77,
          textView84, textViewAt, textViewCapcity, textViewName, textViewPrice, textViewspces,
          toLayout, toTimeId, tvErrCapacity, tvMessageWS, tvTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
