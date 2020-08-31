// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEditBasicVenueInfoBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AutoCompleteTextView address;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final ConstraintLayout basicInfo;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextInputEditText description;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final ImageView firstRemoveImg;

  @NonNull
  public final FrameLayout firstl;

  @NonNull
  public final ImageView fourthRemoveImg;

  @NonNull
  public final FrameLayout fourthl;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final AppCompatImageView imageViewAdd1;

  @NonNull
  public final AppCompatImageView imageViewAdd2;

  @NonNull
  public final AppCompatImageView imageViewAdd3;

  @NonNull
  public final AppCompatImageView imageViewAdd4;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final ImageView secondRemoveImg;

  @NonNull
  public final FrameLayout secondl;

  @NonNull
  public final PowerSpinnerView spinnerVenueType;

  @NonNull
  public final TextInputLayout textInputLayoutDescription;

  @NonNull
  public final LinearLayoutCompat textLayoutAddress;

  @NonNull
  public final TextInputLayout textLayoutEmail;

  @NonNull
  public final TextInputLayout textLayoutVenueName;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textViewStepText;

  @NonNull
  public final ImageView thirdRemoveImg;

  @NonNull
  public final FrameLayout thirdl;

  @NonNull
  public final TextInputEditText venueName;

  private FragmentEditBasicVenueInfoBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AutoCompleteTextView address, @NonNull CoordinatorLayout alertView,
      @NonNull ConstraintLayout basicInfo, @NonNull ConstraintLayout constraintLayout,
      @NonNull TextInputEditText description, @NonNull TextInputEditText email,
      @NonNull ImageView firstRemoveImg, @NonNull FrameLayout firstl,
      @NonNull ImageView fourthRemoveImg, @NonNull FrameLayout fourthl,
      @NonNull Guideline guideline15, @NonNull Guideline guideline16,
      @NonNull Guideline guideline17, @NonNull ImageView imageView2,
      @NonNull AppCompatImageView imageViewAdd1, @NonNull AppCompatImageView imageViewAdd2,
      @NonNull AppCompatImageView imageViewAdd3, @NonNull AppCompatImageView imageViewAdd4,
      @NonNull ContentLoadingProgressBar loginLoader, @NonNull ImageView secondRemoveImg,
      @NonNull FrameLayout secondl, @NonNull PowerSpinnerView spinnerVenueType,
      @NonNull TextInputLayout textInputLayoutDescription,
      @NonNull LinearLayoutCompat textLayoutAddress, @NonNull TextInputLayout textLayoutEmail,
      @NonNull TextInputLayout textLayoutVenueName, @NonNull TextView textView6,
      @NonNull TextView textView7, @NonNull TextView textViewStepText,
      @NonNull ImageView thirdRemoveImg, @NonNull FrameLayout thirdl,
      @NonNull TextInputEditText venueName) {
    this.rootView = rootView;
    this.address = address;
    this.alertView = alertView;
    this.basicInfo = basicInfo;
    this.constraintLayout = constraintLayout;
    this.description = description;
    this.email = email;
    this.firstRemoveImg = firstRemoveImg;
    this.firstl = firstl;
    this.fourthRemoveImg = fourthRemoveImg;
    this.fourthl = fourthl;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.imageView2 = imageView2;
    this.imageViewAdd1 = imageViewAdd1;
    this.imageViewAdd2 = imageViewAdd2;
    this.imageViewAdd3 = imageViewAdd3;
    this.imageViewAdd4 = imageViewAdd4;
    this.loginLoader = loginLoader;
    this.secondRemoveImg = secondRemoveImg;
    this.secondl = secondl;
    this.spinnerVenueType = spinnerVenueType;
    this.textInputLayoutDescription = textInputLayoutDescription;
    this.textLayoutAddress = textLayoutAddress;
    this.textLayoutEmail = textLayoutEmail;
    this.textLayoutVenueName = textLayoutVenueName;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textViewStepText = textViewStepText;
    this.thirdRemoveImg = thirdRemoveImg;
    this.thirdl = thirdl;
    this.venueName = venueName;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditBasicVenueInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditBasicVenueInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit_basic_venue_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditBasicVenueInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      AutoCompleteTextView address = rootView.findViewById(id);
      if (address == null) {
        break missingId;
      }

      id = R.id.alertView;
      CoordinatorLayout alertView = rootView.findViewById(id);
      if (alertView == null) {
        break missingId;
      }

      id = R.id.basicInfo;
      ConstraintLayout basicInfo = rootView.findViewById(id);
      if (basicInfo == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = rootView.findViewById(id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.description;
      TextInputEditText description = rootView.findViewById(id);
      if (description == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.firstRemoveImg;
      ImageView firstRemoveImg = rootView.findViewById(id);
      if (firstRemoveImg == null) {
        break missingId;
      }

      id = R.id.firstl;
      FrameLayout firstl = rootView.findViewById(id);
      if (firstl == null) {
        break missingId;
      }

      id = R.id.fourthRemoveImg;
      ImageView fourthRemoveImg = rootView.findViewById(id);
      if (fourthRemoveImg == null) {
        break missingId;
      }

      id = R.id.fourthl;
      FrameLayout fourthl = rootView.findViewById(id);
      if (fourthl == null) {
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

      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageViewAdd1;
      AppCompatImageView imageViewAdd1 = rootView.findViewById(id);
      if (imageViewAdd1 == null) {
        break missingId;
      }

      id = R.id.imageViewAdd2;
      AppCompatImageView imageViewAdd2 = rootView.findViewById(id);
      if (imageViewAdd2 == null) {
        break missingId;
      }

      id = R.id.imageViewAdd3;
      AppCompatImageView imageViewAdd3 = rootView.findViewById(id);
      if (imageViewAdd3 == null) {
        break missingId;
      }

      id = R.id.imageViewAdd4;
      AppCompatImageView imageViewAdd4 = rootView.findViewById(id);
      if (imageViewAdd4 == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.secondRemoveImg;
      ImageView secondRemoveImg = rootView.findViewById(id);
      if (secondRemoveImg == null) {
        break missingId;
      }

      id = R.id.secondl;
      FrameLayout secondl = rootView.findViewById(id);
      if (secondl == null) {
        break missingId;
      }

      id = R.id.spinnerVenueType;
      PowerSpinnerView spinnerVenueType = rootView.findViewById(id);
      if (spinnerVenueType == null) {
        break missingId;
      }

      id = R.id.textInputLayoutDescription;
      TextInputLayout textInputLayoutDescription = rootView.findViewById(id);
      if (textInputLayoutDescription == null) {
        break missingId;
      }

      id = R.id.textLayoutAddress;
      LinearLayoutCompat textLayoutAddress = rootView.findViewById(id);
      if (textLayoutAddress == null) {
        break missingId;
      }

      id = R.id.textLayoutEmail;
      TextInputLayout textLayoutEmail = rootView.findViewById(id);
      if (textLayoutEmail == null) {
        break missingId;
      }

      id = R.id.textLayoutVenueName;
      TextInputLayout textLayoutVenueName = rootView.findViewById(id);
      if (textLayoutVenueName == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textViewStepText;
      TextView textViewStepText = rootView.findViewById(id);
      if (textViewStepText == null) {
        break missingId;
      }

      id = R.id.thirdRemoveImg;
      ImageView thirdRemoveImg = rootView.findViewById(id);
      if (thirdRemoveImg == null) {
        break missingId;
      }

      id = R.id.thirdl;
      FrameLayout thirdl = rootView.findViewById(id);
      if (thirdl == null) {
        break missingId;
      }

      id = R.id.venueName;
      TextInputEditText venueName = rootView.findViewById(id);
      if (venueName == null) {
        break missingId;
      }

      return new FragmentEditBasicVenueInfoBinding((LinearLayoutCompat) rootView, address,
          alertView, basicInfo, constraintLayout, description, email, firstRemoveImg, firstl,
          fourthRemoveImg, fourthl, guideline15, guideline16, guideline17, imageView2,
          imageViewAdd1, imageViewAdd2, imageViewAdd3, imageViewAdd4, loginLoader, secondRemoveImg,
          secondl, spinnerVenueType, textInputLayoutDescription, textLayoutAddress, textLayoutEmail,
          textLayoutVenueName, textView6, textView7, textViewStepText, thirdRemoveImg, thirdl,
          venueName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
