// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemVenuePastBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView bookedForTV;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final TextView customename;

  @NonNull
  public final ImageView imageVieId;

  @NonNull
  public final ImageView imageView14;

  @NonNull
  public final ImageView mapIV;

  @NonNull
  public final TextView nameTV;

  @NonNull
  public final TextView phoneNo;

  @NonNull
  public final AppCompatImageView profilePic;

  @NonNull
  public final RelativeLayout relative;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textViewPaid;

  @NonNull
  public final TextView textViewdate;

  @NonNull
  public final TextView venue;

  private ItemVenuePastBinding(@NonNull MaterialCardView rootView, @NonNull TextView bookedForTV,
      @NonNull ConstraintLayout constraintLayout2, @NonNull TextView customename,
      @NonNull ImageView imageVieId, @NonNull ImageView imageView14, @NonNull ImageView mapIV,
      @NonNull TextView nameTV, @NonNull TextView phoneNo, @NonNull AppCompatImageView profilePic,
      @NonNull RelativeLayout relative, @NonNull TextView textView, @NonNull TextView textViewPaid,
      @NonNull TextView textViewdate, @NonNull TextView venue) {
    this.rootView = rootView;
    this.bookedForTV = bookedForTV;
    this.constraintLayout2 = constraintLayout2;
    this.customename = customename;
    this.imageVieId = imageVieId;
    this.imageView14 = imageView14;
    this.mapIV = mapIV;
    this.nameTV = nameTV;
    this.phoneNo = phoneNo;
    this.profilePic = profilePic;
    this.relative = relative;
    this.textView = textView;
    this.textViewPaid = textViewPaid;
    this.textViewdate = textViewdate;
    this.venue = venue;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemVenuePastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemVenuePastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_venue_past, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemVenuePastBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookedForTV;
      TextView bookedForTV = rootView.findViewById(id);
      if (bookedForTV == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = rootView.findViewById(id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.customename;
      TextView customename = rootView.findViewById(id);
      if (customename == null) {
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

      id = R.id.phoneNo;
      TextView phoneNo = rootView.findViewById(id);
      if (phoneNo == null) {
        break missingId;
      }

      id = R.id.profilePic;
      AppCompatImageView profilePic = rootView.findViewById(id);
      if (profilePic == null) {
        break missingId;
      }

      id = R.id.relative;
      RelativeLayout relative = rootView.findViewById(id);
      if (relative == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textViewPaid;
      TextView textViewPaid = rootView.findViewById(id);
      if (textViewPaid == null) {
        break missingId;
      }

      id = R.id.textViewdate;
      TextView textViewdate = rootView.findViewById(id);
      if (textViewdate == null) {
        break missingId;
      }

      id = R.id.venue;
      TextView venue = rootView.findViewById(id);
      if (venue == null) {
        break missingId;
      }

      return new ItemVenuePastBinding((MaterialCardView) rootView, bookedForTV, constraintLayout2,
          customename, imageVieId, imageView14, mapIV, nameTV, phoneNo, profilePic, relative,
          textView, textViewPaid, textViewdate, venue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}