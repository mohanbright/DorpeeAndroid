// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.borjabravo.readmoretextview.ReadMoreTextView;
import com.droid.dorpee.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVenueDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView amenitieRecycler;

  @NonNull
  public final TextView backbtn;

  @NonNull
  public final ImageView hotelImage;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat9;

  @NonNull
  public final MaterialCardView materialCardView3;

  @NonNull
  public final TextView textView78;

  @NonNull
  public final TextView textView80;

  @NonNull
  public final TextView textView81;

  @NonNull
  public final ReadMoreTextView textViewAbout;

  @NonNull
  public final TextView textViewAddress;

  @NonNull
  public final TextView textViewFrom;

  @NonNull
  public final TextView textViewHotel;

  @NonNull
  public final TextView textViewPrice;

  @NonNull
  public final TextView textViewRating;

  @NonNull
  public final RecyclerView workspaceRecycler;

  private ActivityVenueDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView amenitieRecycler, @NonNull TextView backbtn,
      @NonNull ImageView hotelImage, @NonNull LinearLayoutCompat linearLayoutCompat9,
      @NonNull MaterialCardView materialCardView3, @NonNull TextView textView78,
      @NonNull TextView textView80, @NonNull TextView textView81,
      @NonNull ReadMoreTextView textViewAbout, @NonNull TextView textViewAddress,
      @NonNull TextView textViewFrom, @NonNull TextView textViewHotel,
      @NonNull TextView textViewPrice, @NonNull TextView textViewRating,
      @NonNull RecyclerView workspaceRecycler) {
    this.rootView = rootView;
    this.amenitieRecycler = amenitieRecycler;
    this.backbtn = backbtn;
    this.hotelImage = hotelImage;
    this.linearLayoutCompat9 = linearLayoutCompat9;
    this.materialCardView3 = materialCardView3;
    this.textView78 = textView78;
    this.textView80 = textView80;
    this.textView81 = textView81;
    this.textViewAbout = textViewAbout;
    this.textViewAddress = textViewAddress;
    this.textViewFrom = textViewFrom;
    this.textViewHotel = textViewHotel;
    this.textViewPrice = textViewPrice;
    this.textViewRating = textViewRating;
    this.workspaceRecycler = workspaceRecycler;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVenueDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVenueDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_venue_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVenueDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amenitieRecycler;
      RecyclerView amenitieRecycler = rootView.findViewById(id);
      if (amenitieRecycler == null) {
        break missingId;
      }

      id = R.id.backbtn;
      TextView backbtn = rootView.findViewById(id);
      if (backbtn == null) {
        break missingId;
      }

      id = R.id.hotelImage;
      ImageView hotelImage = rootView.findViewById(id);
      if (hotelImage == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat9;
      LinearLayoutCompat linearLayoutCompat9 = rootView.findViewById(id);
      if (linearLayoutCompat9 == null) {
        break missingId;
      }

      id = R.id.materialCardView3;
      MaterialCardView materialCardView3 = rootView.findViewById(id);
      if (materialCardView3 == null) {
        break missingId;
      }

      id = R.id.textView78;
      TextView textView78 = rootView.findViewById(id);
      if (textView78 == null) {
        break missingId;
      }

      id = R.id.textView80;
      TextView textView80 = rootView.findViewById(id);
      if (textView80 == null) {
        break missingId;
      }

      id = R.id.textView81;
      TextView textView81 = rootView.findViewById(id);
      if (textView81 == null) {
        break missingId;
      }

      id = R.id.textViewAbout;
      ReadMoreTextView textViewAbout = rootView.findViewById(id);
      if (textViewAbout == null) {
        break missingId;
      }

      id = R.id.textViewAddress;
      TextView textViewAddress = rootView.findViewById(id);
      if (textViewAddress == null) {
        break missingId;
      }

      id = R.id.textViewFrom;
      TextView textViewFrom = rootView.findViewById(id);
      if (textViewFrom == null) {
        break missingId;
      }

      id = R.id.textViewHotel;
      TextView textViewHotel = rootView.findViewById(id);
      if (textViewHotel == null) {
        break missingId;
      }

      id = R.id.textViewPrice;
      TextView textViewPrice = rootView.findViewById(id);
      if (textViewPrice == null) {
        break missingId;
      }

      id = R.id.textViewRating;
      TextView textViewRating = rootView.findViewById(id);
      if (textViewRating == null) {
        break missingId;
      }

      id = R.id.workspaceRecycler;
      RecyclerView workspaceRecycler = rootView.findViewById(id);
      if (workspaceRecycler == null) {
        break missingId;
      }

      return new ActivityVenueDetailBinding((ConstraintLayout) rootView, amenitieRecycler, backbtn,
          hotelImage, linearLayoutCompat9, materialCardView3, textView78, textView80, textView81,
          textViewAbout, textViewAddress, textViewFrom, textViewHotel, textViewPrice,
          textViewRating, workspaceRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
