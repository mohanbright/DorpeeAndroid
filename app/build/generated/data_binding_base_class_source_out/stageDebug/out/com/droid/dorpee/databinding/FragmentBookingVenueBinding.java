// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBookingVenueBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CoordinatorLayout alertView;

  @NonNull
  public final FragmentContainerView container;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final ImageView imageViewProfilePic;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat8;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final TabLayout tabLayout;

  private FragmentBookingVenueBinding(@NonNull FrameLayout rootView,
      @NonNull CoordinatorLayout alertView, @NonNull FragmentContainerView container,
      @NonNull Guideline guideline15, @NonNull Guideline guideline16,
      @NonNull Guideline guideline17, @NonNull ImageView imageViewProfilePic,
      @NonNull LinearLayoutCompat linearLayoutCompat8,
      @NonNull ContentLoadingProgressBar loginLoader, @NonNull TabLayout tabLayout) {
    this.rootView = rootView;
    this.alertView = alertView;
    this.container = container;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.guideline17 = guideline17;
    this.imageViewProfilePic = imageViewProfilePic;
    this.linearLayoutCompat8 = linearLayoutCompat8;
    this.loginLoader = loginLoader;
    this.tabLayout = tabLayout;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBookingVenueBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBookingVenueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_booking_venue, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBookingVenueBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertView;
      CoordinatorLayout alertView = rootView.findViewById(id);
      if (alertView == null) {
        break missingId;
      }

      id = R.id.container;
      FragmentContainerView container = rootView.findViewById(id);
      if (container == null) {
        break missingId;
      }

      id = R.id.guideline15;
      Guideline guideline15 = rootView.findViewById(id);
      if (guideline15 == null) {
        break missingId;
      }

      id = R.id.guideline16;
      Guideline guideline16 = rootView.findViewById(id);
      if (guideline16 == null) {
        break missingId;
      }

      id = R.id.guideline17;
      Guideline guideline17 = rootView.findViewById(id);
      if (guideline17 == null) {
        break missingId;
      }

      id = R.id.imageViewProfilePic;
      ImageView imageViewProfilePic = rootView.findViewById(id);
      if (imageViewProfilePic == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat8;
      LinearLayoutCompat linearLayoutCompat8 = rootView.findViewById(id);
      if (linearLayoutCompat8 == null) {
        break missingId;
      }

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = rootView.findViewById(id);
      if (tabLayout == null) {
        break missingId;
      }

      return new FragmentBookingVenueBinding((FrameLayout) rootView, alertView, container,
          guideline15, guideline16, guideline17, imageViewProfilePic, linearLayoutCompat8,
          loginLoader, tabLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
