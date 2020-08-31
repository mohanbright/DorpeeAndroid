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
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContanctsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageViewCancel;

  @NonNull
  public final ImageView imageViewEdit;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final View view;

  private ItemContanctsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageViewCancel, @NonNull ImageView imageViewEdit,
      @NonNull TextView textViewName, @NonNull View view) {
    this.rootView = rootView;
    this.imageViewCancel = imageViewCancel;
    this.imageViewEdit = imageViewEdit;
    this.textViewName = textViewName;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContanctsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContanctsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_contancts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContanctsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewCancel;
      ImageView imageViewCancel = rootView.findViewById(id);
      if (imageViewCancel == null) {
        break missingId;
      }

      id = R.id.imageViewEdit;
      ImageView imageViewEdit = rootView.findViewById(id);
      if (imageViewEdit == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = rootView.findViewById(id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new ItemContanctsBinding((ConstraintLayout) rootView, imageViewCancel, imageViewEdit,
          textViewName, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}