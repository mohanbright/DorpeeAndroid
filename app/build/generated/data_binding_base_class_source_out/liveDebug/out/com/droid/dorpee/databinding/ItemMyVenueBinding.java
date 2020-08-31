// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMyVenueBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonWorkspace;

  @NonNull
  public final ImageView imageVieId;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final ImageView imageViewCancel;

  @NonNull
  public final ImageView imageViewEdit;

  @NonNull
  public final ImageView imageViewShow;

  @NonNull
  public final ImageView imageViewStatus;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat6;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewStatus;

  @NonNull
  public final View view3;

  private ItemMyVenueBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonWorkspace,
      @NonNull ImageView imageVieId, @NonNull ImageView imageView16,
      @NonNull ImageView imageViewCancel, @NonNull ImageView imageViewEdit,
      @NonNull ImageView imageViewShow, @NonNull ImageView imageViewStatus,
      @NonNull LinearLayoutCompat linearLayoutCompat6, @NonNull TextView textViewName,
      @NonNull TextView textViewStatus, @NonNull View view3) {
    this.rootView = rootView;
    this.buttonWorkspace = buttonWorkspace;
    this.imageVieId = imageVieId;
    this.imageView16 = imageView16;
    this.imageViewCancel = imageViewCancel;
    this.imageViewEdit = imageViewEdit;
    this.imageViewShow = imageViewShow;
    this.imageViewStatus = imageViewStatus;
    this.linearLayoutCompat6 = linearLayoutCompat6;
    this.textViewName = textViewName;
    this.textViewStatus = textViewStatus;
    this.view3 = view3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMyVenueBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMyVenueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_my_venue, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMyVenueBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonWorkspace;
      Button buttonWorkspace = rootView.findViewById(id);
      if (buttonWorkspace == null) {
        break missingId;
      }

      id = R.id.imageVieId;
      ImageView imageVieId = rootView.findViewById(id);
      if (imageVieId == null) {
        break missingId;
      }

      id = R.id.imageView16;
      ImageView imageView16 = rootView.findViewById(id);
      if (imageView16 == null) {
        break missingId;
      }

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

      id = R.id.imageViewShow;
      ImageView imageViewShow = rootView.findViewById(id);
      if (imageViewShow == null) {
        break missingId;
      }

      id = R.id.imageViewStatus;
      ImageView imageViewStatus = rootView.findViewById(id);
      if (imageViewStatus == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat6;
      LinearLayoutCompat linearLayoutCompat6 = rootView.findViewById(id);
      if (linearLayoutCompat6 == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = rootView.findViewById(id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.textViewStatus;
      TextView textViewStatus = rootView.findViewById(id);
      if (textViewStatus == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = rootView.findViewById(id);
      if (view3 == null) {
        break missingId;
      }

      return new ItemMyVenueBinding((ConstraintLayout) rootView, buttonWorkspace, imageVieId,
          imageView16, imageViewCancel, imageViewEdit, imageViewShow, imageViewStatus,
          linearLayoutCompat6, textViewName, textViewStatus, view3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}