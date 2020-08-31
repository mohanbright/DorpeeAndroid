// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChooseCustomerTypeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView backbtn;

  @NonNull
  public final ImageView customerRegister;

  @NonNull
  public final Guideline guideline10;

  @NonNull
  public final Guideline guideline11;

  @NonNull
  public final Guideline guideline12;

  @NonNull
  public final Guideline guideline13;

  @NonNull
  public final Guideline guideline14;

  @NonNull
  public final Guideline guideline9;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textViewEmployerReg;

  @NonNull
  public final ImageView venueRegister;

  private ActivityChooseCustomerTypeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView backbtn, @NonNull ImageView customerRegister,
      @NonNull Guideline guideline10, @NonNull Guideline guideline11,
      @NonNull Guideline guideline12, @NonNull Guideline guideline13,
      @NonNull Guideline guideline14, @NonNull Guideline guideline9, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView4,
      @NonNull TextView textViewEmployerReg, @NonNull ImageView venueRegister) {
    this.rootView = rootView;
    this.backbtn = backbtn;
    this.customerRegister = customerRegister;
    this.guideline10 = guideline10;
    this.guideline11 = guideline11;
    this.guideline12 = guideline12;
    this.guideline13 = guideline13;
    this.guideline14 = guideline14;
    this.guideline9 = guideline9;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textViewEmployerReg = textViewEmployerReg;
    this.venueRegister = venueRegister;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChooseCustomerTypeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChooseCustomerTypeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_choose_customer_type, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChooseCustomerTypeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backbtn;
      TextView backbtn = rootView.findViewById(id);
      if (backbtn == null) {
        break missingId;
      }

      id = R.id.customerRegister;
      ImageView customerRegister = rootView.findViewById(id);
      if (customerRegister == null) {
        break missingId;
      }

      id = R.id.guideline10;
      Guideline guideline10 = rootView.findViewById(id);
      if (guideline10 == null) {
        break missingId;
      }

      id = R.id.guideline11;
      Guideline guideline11 = rootView.findViewById(id);
      if (guideline11 == null) {
        break missingId;
      }

      id = R.id.guideline12;
      Guideline guideline12 = rootView.findViewById(id);
      if (guideline12 == null) {
        break missingId;
      }

      id = R.id.guideline13;
      Guideline guideline13 = rootView.findViewById(id);
      if (guideline13 == null) {
        break missingId;
      }

      id = R.id.guideline14;
      Guideline guideline14 = rootView.findViewById(id);
      if (guideline14 == null) {
        break missingId;
      }

      id = R.id.guideline9;
      Guideline guideline9 = rootView.findViewById(id);
      if (guideline9 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textViewEmployerReg;
      TextView textViewEmployerReg = rootView.findViewById(id);
      if (textViewEmployerReg == null) {
        break missingId;
      }

      id = R.id.venueRegister;
      ImageView venueRegister = rootView.findViewById(id);
      if (venueRegister == null) {
        break missingId;
      }

      return new ActivityChooseCustomerTypeBinding((ConstraintLayout) rootView, backbtn,
          customerRegister, guideline10, guideline11, guideline12, guideline13, guideline14,
          guideline9, textView2, textView3, textView4, textViewEmployerReg, venueRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}