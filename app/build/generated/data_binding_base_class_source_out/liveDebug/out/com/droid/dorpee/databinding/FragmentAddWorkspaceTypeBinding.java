// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddWorkspaceTypeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout addWorkSpaceNext;

  @NonNull
  public final EditText editTextNoOfSpace;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView20;

  @NonNull
  public final ImageView imageViewDown;

  @NonNull
  public final ImageView imageViewUp;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final TextView textView56;

  @NonNull
  public final TextView textView58;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textViewStepText;

  private FragmentAddWorkspaceTypeBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout addWorkSpaceNext, @NonNull EditText editTextNoOfSpace,
      @NonNull Guideline guideline15, @NonNull Guideline guideline16,
      @NonNull Guideline guideline17, @NonNull ImageView imageView2, @NonNull ImageView imageView20,
      @NonNull ImageView imageViewDown, @NonNull ImageView imageViewUp,
      @NonNull ContentLoadingProgressBar loginLoader, @NonNull TextView textView56,
      @NonNull TextView textView58, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull TextView textViewStepText) {
    this.rootView = rootView;
    this.addWorkSpaceNext = addWorkSpaceNext;
    this.editTextNoOfSpace = editTextNoOfSpace;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.imageView2 = imageView2;
    this.imageView20 = imageView20;
    this.imageViewDown = imageViewDown;
    this.imageViewUp = imageViewUp;
    this.loginLoader = loginLoader;
    this.textView56 = textView56;
    this.textView58 = textView58;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textViewStepText = textViewStepText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddWorkspaceTypeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddWorkspaceTypeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_workspace_type, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddWorkspaceTypeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addWorkSpaceNext;
      ConstraintLayout addWorkSpaceNext = rootView.findViewById(id);
      if (addWorkSpaceNext == null) {
        break missingId;
      }

      id = R.id.editTextNoOfSpace;
      EditText editTextNoOfSpace = rootView.findViewById(id);
      if (editTextNoOfSpace == null) {
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

      id = R.id.imageView20;
      ImageView imageView20 = rootView.findViewById(id);
      if (imageView20 == null) {
        break missingId;
      }

      id = R.id.imageViewDown;
      ImageView imageViewDown = rootView.findViewById(id);
      if (imageViewDown == null) {
        break missingId;
      }

      id = R.id.imageViewUp;
      ImageView imageViewUp = rootView.findViewById(id);
      if (imageViewUp == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.textView56;
      TextView textView56 = rootView.findViewById(id);
      if (textView56 == null) {
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

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textViewStepText;
      TextView textViewStepText = rootView.findViewById(id);
      if (textViewStepText == null) {
        break missingId;
      }

      return new FragmentAddWorkspaceTypeBinding((ConstraintLayout) rootView, addWorkSpaceNext,
          editTextNoOfSpace, guideline15, guideline16, guideline17, imageView2, imageView20,
          imageViewDown, imageViewUp, loginLoader, textView56, textView58, textView6, textView7,
          textView8, textViewStepText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
