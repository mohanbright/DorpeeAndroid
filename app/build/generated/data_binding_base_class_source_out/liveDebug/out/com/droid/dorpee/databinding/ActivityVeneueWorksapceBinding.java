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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVeneueWorksapceBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final TextView addCardBtn;

  @NonNull
  public final ConstraintLayout addConstraintVenue;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final TextView backbtn;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final ImageView imageViewProfilePic;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final RecyclerView recyclerViewWorkspace;

  @NonNull
  public final TextView textViewHeading;

  private ActivityVeneueWorksapceBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull TextView addCardBtn, @NonNull ConstraintLayout addConstraintVenue,
      @NonNull CoordinatorLayout alertView, @NonNull TextView backbtn,
      @NonNull Guideline guideline15, @NonNull Guideline guideline16,
      @NonNull Guideline guideline17, @NonNull ImageView imageViewProfilePic,
      @NonNull ContentLoadingProgressBar loginLoader, @NonNull RecyclerView recyclerViewWorkspace,
      @NonNull TextView textViewHeading) {
    this.rootView = rootView;
    this.addCardBtn = addCardBtn;
    this.addConstraintVenue = addConstraintVenue;
    this.alertView = alertView;
    this.backbtn = backbtn;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.imageViewProfilePic = imageViewProfilePic;
    this.loginLoader = loginLoader;
    this.recyclerViewWorkspace = recyclerViewWorkspace;
    this.textViewHeading = textViewHeading;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVeneueWorksapceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVeneueWorksapceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_veneue_worksapce, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVeneueWorksapceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addCardBtn;
      TextView addCardBtn = rootView.findViewById(id);
      if (addCardBtn == null) {
        break missingId;
      }

      id = R.id.addConstraintVenue;
      ConstraintLayout addConstraintVenue = rootView.findViewById(id);
      if (addConstraintVenue == null) {
        break missingId;
      }

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

      id = R.id.imageViewProfilePic;
      ImageView imageViewProfilePic = rootView.findViewById(id);
      if (imageViewProfilePic == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.recyclerViewWorkspace;
      RecyclerView recyclerViewWorkspace = rootView.findViewById(id);
      if (recyclerViewWorkspace == null) {
        break missingId;
      }

      id = R.id.textViewHeading;
      TextView textViewHeading = rootView.findViewById(id);
      if (textViewHeading == null) {
        break missingId;
      }

      return new ActivityVeneueWorksapceBinding((LinearLayoutCompat) rootView, addCardBtn,
          addConstraintVenue, alertView, backbtn, guideline15, guideline16, guideline17,
          imageViewProfilePic, loginLoader, recyclerViewWorkspace, textViewHeading);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}