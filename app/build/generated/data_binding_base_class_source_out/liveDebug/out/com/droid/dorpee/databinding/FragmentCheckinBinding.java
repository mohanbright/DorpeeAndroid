// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCheckinBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonManualCheckIn;

  @NonNull
  public final Button buttonScanCheckIn;

  @NonNull
  public final Guideline guideline18;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline25;

  @NonNull
  public final ImageView imageViewProfilePic;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat8;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  private FragmentCheckinBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonManualCheckIn, @NonNull Button buttonScanCheckIn,
      @NonNull Guideline guideline18, @NonNull Guideline guideline19,
      @NonNull Guideline guideline25, @NonNull ImageView imageViewProfilePic,
      @NonNull LinearLayoutCompat linearLayoutCompat8,
      @NonNull ContentLoadingProgressBar loginLoader) {
    this.rootView = rootView;
    this.buttonManualCheckIn = buttonManualCheckIn;
    this.buttonScanCheckIn = buttonScanCheckIn;
    this.guideline18 = guideline18;
    this.guideline19 = guideline19;
    this.guideline25 = guideline25;
    this.imageViewProfilePic = imageViewProfilePic;
    this.linearLayoutCompat8 = linearLayoutCompat8;
    this.loginLoader = loginLoader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCheckinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCheckinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_checkin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCheckinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonManualCheckIn;
      Button buttonManualCheckIn = rootView.findViewById(id);
      if (buttonManualCheckIn == null) {
        break missingId;
      }

      id = R.id.buttonScanCheckIn;
      Button buttonScanCheckIn = rootView.findViewById(id);
      if (buttonScanCheckIn == null) {
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

      id = R.id.guideline25;
      Guideline guideline25 = rootView.findViewById(id);
      if (guideline25 == null) {
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

      return new FragmentCheckinBinding((ConstraintLayout) rootView, buttonManualCheckIn,
          buttonScanCheckIn, guideline18, guideline19, guideline25, imageViewProfilePic,
          linearLayoutCompat8, loginLoader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
