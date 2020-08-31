// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemUpcomingBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView bookedForTV;

  @NonNull
  public final Button buttonCheckin;

  @NonNull
  public final Button buttonStay;

  @NonNull
  public final ImageView imageVieId;

  @NonNull
  public final ImageView imageView14;

  @NonNull
  public final ImageView imageViewCancel;

  @NonNull
  public final ImageView imageViewEdit;

  @NonNull
  public final ImageView mapIV;

  @NonNull
  public final TextView nameTV;

  @NonNull
  public final RelativeLayout relative;

  @NonNull
  public final TextView textView30;

  @NonNull
  public final TextView textViewdate;

  @NonNull
  public final TextView usedCreditesTV;

  @NonNull
  public final TextView venue;

  private ItemUpcomingBinding(@NonNull MaterialCardView rootView, @NonNull TextView bookedForTV,
      @NonNull Button buttonCheckin, @NonNull Button buttonStay, @NonNull ImageView imageVieId,
      @NonNull ImageView imageView14, @NonNull ImageView imageViewCancel,
      @NonNull ImageView imageViewEdit, @NonNull ImageView mapIV, @NonNull TextView nameTV,
      @NonNull RelativeLayout relative, @NonNull TextView textView30,
      @NonNull TextView textViewdate, @NonNull TextView usedCreditesTV, @NonNull TextView venue) {
    this.rootView = rootView;
    this.bookedForTV = bookedForTV;
    this.buttonCheckin = buttonCheckin;
    this.buttonStay = buttonStay;
    this.imageVieId = imageVieId;
    this.imageView14 = imageView14;
    this.imageViewCancel = imageViewCancel;
    this.imageViewEdit = imageViewEdit;
    this.mapIV = mapIV;
    this.nameTV = nameTV;
    this.relative = relative;
    this.textView30 = textView30;
    this.textViewdate = textViewdate;
    this.usedCreditesTV = usedCreditesTV;
    this.venue = venue;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemUpcomingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemUpcomingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_upcoming, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemUpcomingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookedForTV;
      TextView bookedForTV = rootView.findViewById(id);
      if (bookedForTV == null) {
        break missingId;
      }

      id = R.id.buttonCheckin;
      Button buttonCheckin = rootView.findViewById(id);
      if (buttonCheckin == null) {
        break missingId;
      }

      id = R.id.buttonStay;
      Button buttonStay = rootView.findViewById(id);
      if (buttonStay == null) {
        break missingId;
      }

      id = R.id.imageVieId;
      ImageView imageVieId = rootView.findViewById(id);
      if (imageVieId == null) {
        break missingId;
      }

      id = R.id.imageView14;
      ImageView imageView14 = rootView.findViewById(id);
      if (imageView14 == null) {
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

      id = R.id.mapIV;
      ImageView mapIV = rootView.findViewById(id);
      if (mapIV == null) {
        break missingId;
      }

      id = R.id.nameTV;
      TextView nameTV = rootView.findViewById(id);
      if (nameTV == null) {
        break missingId;
      }

      id = R.id.relative;
      RelativeLayout relative = rootView.findViewById(id);
      if (relative == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = rootView.findViewById(id);
      if (textView30 == null) {
        break missingId;
      }

      id = R.id.textViewdate;
      TextView textViewdate = rootView.findViewById(id);
      if (textViewdate == null) {
        break missingId;
      }

      id = R.id.usedCreditesTV;
      TextView usedCreditesTV = rootView.findViewById(id);
      if (usedCreditesTV == null) {
        break missingId;
      }

      id = R.id.venue;
      TextView venue = rootView.findViewById(id);
      if (venue == null) {
        break missingId;
      }

      return new ItemUpcomingBinding((MaterialCardView) rootView, bookedForTV, buttonCheckin,
          buttonStay, imageVieId, imageView14, imageViewCancel, imageViewEdit, mapIV, nameTV,
          relative, textView30, textViewdate, usedCreditesTV, venue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
