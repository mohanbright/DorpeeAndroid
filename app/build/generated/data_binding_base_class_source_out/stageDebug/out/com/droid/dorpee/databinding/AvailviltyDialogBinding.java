// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AvailviltyDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView list;

  @NonNull
  public final TextView textView16;

  private AvailviltyDialogBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView list,
      @NonNull TextView textView16) {
    this.rootView = rootView;
    this.list = list;
    this.textView16 = textView16;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AvailviltyDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AvailviltyDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.availvilty_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AvailviltyDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list;
      RecyclerView list = rootView.findViewById(id);
      if (list == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = rootView.findViewById(id);
      if (textView16 == null) {
        break missingId;
      }

      return new AvailviltyDialogBinding((ConstraintLayout) rootView, list, textView16);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}