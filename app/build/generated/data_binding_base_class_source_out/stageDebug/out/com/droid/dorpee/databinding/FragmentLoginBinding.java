// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final AppCompatImageView appCompatImageView;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final Button buttonsignUp;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final ConstraintLayout linearLayoutCompat8;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextView textViewPassword;

  private FragmentLoginBinding(@NonNull FrameLayout rootView, @NonNull CoordinatorLayout alertView,
      @NonNull AppCompatImageView appCompatImageView, @NonNull Button buttonLogin,
      @NonNull Button buttonsignUp, @NonNull TextInputEditText email, @NonNull Guideline guideline,
      @NonNull Guideline guideline2, @NonNull Guideline guideline3, @NonNull Guideline guideline4,
      @NonNull ConstraintLayout linearLayoutCompat8, @NonNull ContentLoadingProgressBar loginLoader,
      @NonNull TextInputEditText password, @NonNull TextInputLayout textInputLayout,
      @NonNull TextInputLayout textInputLayout2, @NonNull TextView textViewPassword) {
    this.rootView = rootView;
    this.alertView = alertView;
    this.appCompatImageView = appCompatImageView;
    this.buttonLogin = buttonLogin;
    this.buttonsignUp = buttonsignUp;
    this.email = email;
    this.guideline = guideline;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.linearLayoutCompat8 = linearLayoutCompat8;
    this.loginLoader = loginLoader;
    this.password = password;
    this.textInputLayout = textInputLayout;
    this.textInputLayout2 = textInputLayout2;
    this.textViewPassword = textViewPassword;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertView;
      CoordinatorLayout alertView = rootView.findViewById(id);
      if (alertView == null) {
        break missingId;
      }

      id = R.id.appCompatImageView;
      AppCompatImageView appCompatImageView = rootView.findViewById(id);
      if (appCompatImageView == null) {
        break missingId;
      }

      id = R.id.buttonLogin;
      Button buttonLogin = rootView.findViewById(id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.buttonsignUp;
      Button buttonsignUp = rootView.findViewById(id);
      if (buttonsignUp == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = rootView.findViewById(id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = rootView.findViewById(id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat8;
      ConstraintLayout linearLayoutCompat8 = rootView.findViewById(id);
      if (linearLayoutCompat8 == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = rootView.findViewById(id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = rootView.findViewById(id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.textViewPassword;
      TextView textViewPassword = rootView.findViewById(id);
      if (textViewPassword == null) {
        break missingId;
      }

      return new FragmentLoginBinding((FrameLayout) rootView, alertView, appCompatImageView,
          buttonLogin, buttonsignUp, email, guideline, guideline2, guideline3, guideline4,
          linearLayoutCompat8, loginLoader, password, textInputLayout, textInputLayout2,
          textViewPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}