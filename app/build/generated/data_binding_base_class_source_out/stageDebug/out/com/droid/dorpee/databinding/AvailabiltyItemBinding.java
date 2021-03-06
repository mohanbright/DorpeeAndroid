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
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AvailabiltyItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextNoOfSpace;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final ConstraintLayout itemView;

  @NonNull
  public final TextView textViewError;

  @NonNull
  public final TextView textViewTime;

  private AvailabiltyItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editTextNoOfSpace, @NonNull ImageView imageView12,
      @NonNull ConstraintLayout itemView, @NonNull TextView textViewError,
      @NonNull TextView textViewTime) {
    this.rootView = rootView;
    this.editTextNoOfSpace = editTextNoOfSpace;
    this.imageView12 = imageView12;
    this.itemView = itemView;
    this.textViewError = textViewError;
    this.textViewTime = textViewTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AvailabiltyItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AvailabiltyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.availabilty_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AvailabiltyItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextNoOfSpace;
      EditText editTextNoOfSpace = rootView.findViewById(id);
      if (editTextNoOfSpace == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = rootView.findViewById(id);
      if (imageView12 == null) {
        break missingId;
      }

      ConstraintLayout itemView = (ConstraintLayout) rootView;

      id = R.id.textViewError;
      TextView textViewError = rootView.findViewById(id);
      if (textViewError == null) {
        break missingId;
      }

      id = R.id.textViewTime;
      TextView textViewTime = rootView.findViewById(id);
      if (textViewTime == null) {
        break missingId;
      }

      return new AvailabiltyItemBinding((ConstraintLayout) rootView, editTextNoOfSpace, imageView12,
          itemView, textViewError, textViewTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
