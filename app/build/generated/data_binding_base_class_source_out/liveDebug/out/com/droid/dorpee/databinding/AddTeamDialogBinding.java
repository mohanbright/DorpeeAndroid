// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddTeamDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addBtn;

  @NonNull
  public final Guideline guideline18;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline20;

  @NonNull
  public final TextInputEditText teamNameET;

  @NonNull
  public final TextView text;

  @NonNull
  public final TextInputLayout textLayoutfirstName;

  private AddTeamDialogBinding(@NonNull ConstraintLayout rootView, @NonNull Button addBtn,
      @NonNull Guideline guideline18, @NonNull Guideline guideline19,
      @NonNull Guideline guideline20, @NonNull TextInputEditText teamNameET, @NonNull TextView text,
      @NonNull TextInputLayout textLayoutfirstName) {
    this.rootView = rootView;
    this.addBtn = addBtn;
    this.guideline18 = guideline18;
    this.guideline19 = guideline19;
    this.guideline20 = guideline20;
    this.teamNameET = teamNameET;
    this.text = text;
    this.textLayoutfirstName = textLayoutfirstName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddTeamDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddTeamDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_team_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddTeamDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addBtn;
      Button addBtn = rootView.findViewById(id);
      if (addBtn == null) {
        break missingId;
      }

      id = R.id.guideline18;
      Guideline guideline18 = rootView.findViewById(id);
      if (guideline18 == null) {
        break missingId;
      }

      id = R.id.guideline19;
      Guideline guideline19 = rootView.findViewById(id);
      if (guideline19 == null) {
        break missingId;
      }

      id = R.id.guideline20;
      Guideline guideline20 = rootView.findViewById(id);
      if (guideline20 == null) {
        break missingId;
      }

      id = R.id.teamNameET;
      TextInputEditText teamNameET = rootView.findViewById(id);
      if (teamNameET == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = rootView.findViewById(id);
      if (text == null) {
        break missingId;
      }

      id = R.id.textLayoutfirstName;
      TextInputLayout textLayoutfirstName = rootView.findViewById(id);
      if (textLayoutfirstName == null) {
        break missingId;
      }

      return new AddTeamDialogBinding((ConstraintLayout) rootView, addBtn, guideline18, guideline19,
          guideline20, teamNameET, text, textLayoutfirstName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}