// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPrivacyBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final Button buttonTeam;

  @NonNull
  public final SwitchCompat interstsSwitch;

  @NonNull
  public final SwitchCompat linkedInSwitch;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final SwitchCompat nametSwitch;

  @NonNull
  public final TextInputEditText profileLinked;

  @NonNull
  public final TextInputLayout textLayoutLastName;

  @NonNull
  public final TextView textView48;

  @NonNull
  public final TextView textView49;

  @NonNull
  public final TextView textView50;

  private FragmentPrivacyBinding(@NonNull ConstraintLayout rootView,
      @NonNull CoordinatorLayout alertView, @NonNull Button buttonTeam,
      @NonNull SwitchCompat interstsSwitch, @NonNull SwitchCompat linkedInSwitch,
      @NonNull ContentLoadingProgressBar loginLoader, @NonNull SwitchCompat nametSwitch,
      @NonNull TextInputEditText profileLinked, @NonNull TextInputLayout textLayoutLastName,
      @NonNull TextView textView48, @NonNull TextView textView49, @NonNull TextView textView50) {
    this.rootView = rootView;
    this.alertView = alertView;
    this.buttonTeam = buttonTeam;
    this.interstsSwitch = interstsSwitch;
    this.linkedInSwitch = linkedInSwitch;
    this.loginLoader = loginLoader;
    this.nametSwitch = nametSwitch;
    this.profileLinked = profileLinked;
    this.textLayoutLastName = textLayoutLastName;
    this.textView48 = textView48;
    this.textView49 = textView49;
    this.textView50 = textView50;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPrivacyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPrivacyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_privacy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPrivacyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertView;
      CoordinatorLayout alertView = rootView.findViewById(id);
      if (alertView == null) {
        break missingId;
      }

      id = R.id.buttonTeam;
      Button buttonTeam = rootView.findViewById(id);
      if (buttonTeam == null) {
        break missingId;
      }

      id = R.id.interstsSwitch;
      SwitchCompat interstsSwitch = rootView.findViewById(id);
      if (interstsSwitch == null) {
        break missingId;
      }

      id = R.id.linkedInSwitch;
      SwitchCompat linkedInSwitch = rootView.findViewById(id);
      if (linkedInSwitch == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.nametSwitch;
      SwitchCompat nametSwitch = rootView.findViewById(id);
      if (nametSwitch == null) {
        break missingId;
      }

      id = R.id.profileLinked;
      TextInputEditText profileLinked = rootView.findViewById(id);
      if (profileLinked == null) {
        break missingId;
      }

      id = R.id.textLayoutLastName;
      TextInputLayout textLayoutLastName = rootView.findViewById(id);
      if (textLayoutLastName == null) {
        break missingId;
      }

      id = R.id.textView48;
      TextView textView48 = rootView.findViewById(id);
      if (textView48 == null) {
        break missingId;
      }

      id = R.id.textView49;
      TextView textView49 = rootView.findViewById(id);
      if (textView49 == null) {
        break missingId;
      }

      id = R.id.textView50;
      TextView textView50 = rootView.findViewById(id);
      if (textView50 == null) {
        break missingId;
      }

      return new FragmentPrivacyBinding((ConstraintLayout) rootView, alertView, buttonTeam,
          interstsSwitch, linkedInSwitch, loginLoader, nametSwitch, profileLinked,
          textLayoutLastName, textView48, textView49, textView50);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
