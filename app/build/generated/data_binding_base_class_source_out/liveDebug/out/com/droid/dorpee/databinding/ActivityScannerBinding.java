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
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public final class ActivityScannerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageViewBack;

  @NonNull
  public final ZXingScannerView qrCodeScanner;

  @NonNull
  public final ConstraintLayout rootViewScanner;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final View view5;

  private ActivityScannerBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageViewBack, @NonNull ZXingScannerView qrCodeScanner,
      @NonNull ConstraintLayout rootViewScanner, @NonNull TextView textView26,
      @NonNull View view5) {
    this.rootView = rootView;
    this.imageViewBack = imageViewBack;
    this.qrCodeScanner = qrCodeScanner;
    this.rootViewScanner = rootViewScanner;
    this.textView26 = textView26;
    this.view5 = view5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_scanner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScannerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewBack;
      ImageView imageViewBack = rootView.findViewById(id);
      if (imageViewBack == null) {
        break missingId;
      }

      id = R.id.qrCodeScanner;
      ZXingScannerView qrCodeScanner = rootView.findViewById(id);
      if (qrCodeScanner == null) {
        break missingId;
      }

      ConstraintLayout rootViewScanner = (ConstraintLayout) rootView;

      id = R.id.textView26;
      TextView textView26 = rootView.findViewById(id);
      if (textView26 == null) {
        break missingId;
      }

      id = R.id.view5;
      View view5 = rootView.findViewById(id);
      if (view5 == null) {
        break missingId;
      }

      return new ActivityScannerBinding((ConstraintLayout) rootView, imageViewBack, qrCodeScanner,
          rootViewScanner, textView26, view5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}