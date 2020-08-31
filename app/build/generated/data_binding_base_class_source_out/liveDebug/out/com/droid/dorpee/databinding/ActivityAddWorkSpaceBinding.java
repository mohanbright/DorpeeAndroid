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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddWorkSpaceBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final TextView backbtn;

  @NonNull
  public final Button buttonUpload;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextInputEditText description;

  @NonNull
  public final EditText editTextNoOfSpace;

  @NonNull
  public final EditText editTextNoOfpeoples;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final AppCompatImageView imageView4;

  @NonNull
  public final AppCompatImageView imageView6;

  @NonNull
  public final AppCompatImageView imageView7;

  @NonNull
  public final AppCompatImageView imageView8;

  @NonNull
  public final TextInputLayout layoutHourPrice;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat7;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final TextInputEditText maxhour;

  @NonNull
  public final TextInputEditText minHours;

  @NonNull
  public final TextInputEditText pricePerHour;

  @NonNull
  public final ConstraintLayout publishWorksapce;

  @NonNull
  public final RecyclerView recyclerAmenities;

  @NonNull
  public final RecyclerView recyclerViewEnviornment;

  @NonNull
  public final RecyclerView recyclerViewTypes;

  @NonNull
  public final TextView suggestedPriceId;

  @NonNull
  public final SwitchCompat switch3;

  @NonNull
  public final TextInputLayout textInputLayoutDescription;

  @NonNull
  public final TextInputLayout textLayoutAddress;

  @NonNull
  public final TextInputLayout textLayoutVenueName;

  @NonNull
  public final TextInputLayout textLayoutmaxhour;

  @NonNull
  public final TextView textView58;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView60;

  @NonNull
  public final TextView textView61;

  @NonNull
  public final TextView textView62;

  @NonNull
  public final TextView textView63;

  @NonNull
  public final TextView textView64;

  @NonNull
  public final TextView textView67;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView venueId;

  @NonNull
  public final TextInputEditText worksapceName;

  private ActivityAddWorkSpaceBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull CoordinatorLayout alertView, @NonNull TextView backbtn, @NonNull Button buttonUpload,
      @NonNull ConstraintLayout constraintLayout, @NonNull TextInputEditText description,
      @NonNull EditText editTextNoOfSpace, @NonNull EditText editTextNoOfpeoples,
      @NonNull Guideline guideline15, @NonNull Guideline guideline16,
      @NonNull Guideline guideline17, @NonNull ImageView imageView10, @NonNull ImageView imageView2,
      @NonNull AppCompatImageView imageView4, @NonNull AppCompatImageView imageView6,
      @NonNull AppCompatImageView imageView7, @NonNull AppCompatImageView imageView8,
      @NonNull TextInputLayout layoutHourPrice, @NonNull LinearLayoutCompat linearLayoutCompat7,
      @NonNull ContentLoadingProgressBar loginLoader, @NonNull TextInputEditText maxhour,
      @NonNull TextInputEditText minHours, @NonNull TextInputEditText pricePerHour,
      @NonNull ConstraintLayout publishWorksapce, @NonNull RecyclerView recyclerAmenities,
      @NonNull RecyclerView recyclerViewEnviornment, @NonNull RecyclerView recyclerViewTypes,
      @NonNull TextView suggestedPriceId, @NonNull SwitchCompat switch3,
      @NonNull TextInputLayout textInputLayoutDescription,
      @NonNull TextInputLayout textLayoutAddress, @NonNull TextInputLayout textLayoutVenueName,
      @NonNull TextInputLayout textLayoutmaxhour, @NonNull TextView textView58,
      @NonNull TextView textView6, @NonNull TextView textView60, @NonNull TextView textView61,
      @NonNull TextView textView62, @NonNull TextView textView63, @NonNull TextView textView64,
      @NonNull TextView textView67, @NonNull TextView textView7, @NonNull TextView venueId,
      @NonNull TextInputEditText worksapceName) {
    this.rootView = rootView;
    this.alertView = alertView;
    this.backbtn = backbtn;
    this.buttonUpload = buttonUpload;
    this.constraintLayout = constraintLayout;
    this.description = description;
    this.editTextNoOfSpace = editTextNoOfSpace;
    this.editTextNoOfpeoples = editTextNoOfpeoples;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.imageView10 = imageView10;
    this.imageView2 = imageView2;
    this.imageView4 = imageView4;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.layoutHourPrice = layoutHourPrice;
    this.linearLayoutCompat7 = linearLayoutCompat7;
    this.loginLoader = loginLoader;
    this.maxhour = maxhour;
    this.minHours = minHours;
    this.pricePerHour = pricePerHour;
    this.publishWorksapce = publishWorksapce;
    this.recyclerAmenities = recyclerAmenities;
    this.recyclerViewEnviornment = recyclerViewEnviornment;
    this.recyclerViewTypes = recyclerViewTypes;
    this.suggestedPriceId = suggestedPriceId;
    this.switch3 = switch3;
    this.textInputLayoutDescription = textInputLayoutDescription;
    this.textLayoutAddress = textLayoutAddress;
    this.textLayoutVenueName = textLayoutVenueName;
    this.textLayoutmaxhour = textLayoutmaxhour;
    this.textView58 = textView58;
    this.textView6 = textView6;
    this.textView60 = textView60;
    this.textView61 = textView61;
    this.textView62 = textView62;
    this.textView63 = textView63;
    this.textView64 = textView64;
    this.textView67 = textView67;
    this.textView7 = textView7;
    this.venueId = venueId;
    this.worksapceName = worksapceName;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddWorkSpaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddWorkSpaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_work_space, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddWorkSpaceBinding bind(@NonNull View rootView) {
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

      id = R.id.buttonUpload;
      Button buttonUpload = rootView.findViewById(id);
      if (buttonUpload == null) {
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

      id = R.id.editTextNoOfSpace;
      EditText editTextNoOfSpace = rootView.findViewById(id);
      if (editTextNoOfSpace == null) {
        break missingId;
      }

      id = R.id.editTextNoOfpeoples;
      EditText editTextNoOfpeoples = rootView.findViewById(id);
      if (editTextNoOfpeoples == null) {
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

      id = R.id.imageView10;
      ImageView imageView10 = rootView.findViewById(id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      AppCompatImageView imageView4 = rootView.findViewById(id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      AppCompatImageView imageView6 = rootView.findViewById(id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      AppCompatImageView imageView7 = rootView.findViewById(id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      AppCompatImageView imageView8 = rootView.findViewById(id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.layoutHourPrice;
      TextInputLayout layoutHourPrice = rootView.findViewById(id);
      if (layoutHourPrice == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat7;
      LinearLayoutCompat linearLayoutCompat7 = rootView.findViewById(id);
      if (linearLayoutCompat7 == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.maxhour;
      TextInputEditText maxhour = rootView.findViewById(id);
      if (maxhour == null) {
        break missingId;
      }

      id = R.id.minHours;
      TextInputEditText minHours = rootView.findViewById(id);
      if (minHours == null) {
        break missingId;
      }

      id = R.id.pricePerHour;
      TextInputEditText pricePerHour = rootView.findViewById(id);
      if (pricePerHour == null) {
        break missingId;
      }

      id = R.id.publishWorksapce;
      ConstraintLayout publishWorksapce = rootView.findViewById(id);
      if (publishWorksapce == null) {
        break missingId;
      }

      id = R.id.recyclerAmenities;
      RecyclerView recyclerAmenities = rootView.findViewById(id);
      if (recyclerAmenities == null) {
        break missingId;
      }

      id = R.id.recyclerViewEnviornment;
      RecyclerView recyclerViewEnviornment = rootView.findViewById(id);
      if (recyclerViewEnviornment == null) {
        break missingId;
      }

      id = R.id.recyclerViewTypes;
      RecyclerView recyclerViewTypes = rootView.findViewById(id);
      if (recyclerViewTypes == null) {
        break missingId;
      }

      id = R.id.suggestedPriceId;
      TextView suggestedPriceId = rootView.findViewById(id);
      if (suggestedPriceId == null) {
        break missingId;
      }

      id = R.id.switch3;
      SwitchCompat switch3 = rootView.findViewById(id);
      if (switch3 == null) {
        break missingId;
      }

      id = R.id.textInputLayoutDescription;
      TextInputLayout textInputLayoutDescription = rootView.findViewById(id);
      if (textInputLayoutDescription == null) {
        break missingId;
      }

      id = R.id.textLayoutAddress;
      TextInputLayout textLayoutAddress = rootView.findViewById(id);
      if (textLayoutAddress == null) {
        break missingId;
      }

      id = R.id.textLayoutVenueName;
      TextInputLayout textLayoutVenueName = rootView.findViewById(id);
      if (textLayoutVenueName == null) {
        break missingId;
      }

      id = R.id.textLayoutmaxhour;
      TextInputLayout textLayoutmaxhour = rootView.findViewById(id);
      if (textLayoutmaxhour == null) {
        break missingId;
      }

      id = R.id.textView58;
      TextView textView58 = rootView.findViewById(id);
      if (textView58 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView60;
      TextView textView60 = rootView.findViewById(id);
      if (textView60 == null) {
        break missingId;
      }

      id = R.id.textView61;
      TextView textView61 = rootView.findViewById(id);
      if (textView61 == null) {
        break missingId;
      }

      id = R.id.textView62;
      TextView textView62 = rootView.findViewById(id);
      if (textView62 == null) {
        break missingId;
      }

      id = R.id.textView63;
      TextView textView63 = rootView.findViewById(id);
      if (textView63 == null) {
        break missingId;
      }

      id = R.id.textView64;
      TextView textView64 = rootView.findViewById(id);
      if (textView64 == null) {
        break missingId;
      }

      id = R.id.textView67;
      TextView textView67 = rootView.findViewById(id);
      if (textView67 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.venueId;
      TextView venueId = rootView.findViewById(id);
      if (venueId == null) {
        break missingId;
      }

      id = R.id.worksapceName;
      TextInputEditText worksapceName = rootView.findViewById(id);
      if (worksapceName == null) {
        break missingId;
      }

      return new ActivityAddWorkSpaceBinding((LinearLayoutCompat) rootView, alertView, backbtn,
          buttonUpload, constraintLayout, description, editTextNoOfSpace, editTextNoOfpeoples,
          guideline15, guideline16, guideline17, imageView10, imageView2, imageView4, imageView6,
          imageView7, imageView8, layoutHourPrice, linearLayoutCompat7, loginLoader, maxhour,
          minHours, pricePerHour, publishWorksapce, recyclerAmenities, recyclerViewEnviornment,
          recyclerViewTypes, suggestedPriceId, switch3, textInputLayoutDescription,
          textLayoutAddress, textLayoutVenueName, textLayoutmaxhour, textView58, textView6,
          textView60, textView61, textView62, textView63, textView64, textView67, textView7,
          venueId, worksapceName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
