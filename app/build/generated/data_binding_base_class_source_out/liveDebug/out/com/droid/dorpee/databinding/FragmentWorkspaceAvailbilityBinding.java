// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWorkspaceAvailbilityBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView addCardBtn;

  @NonNull
  public final ConstraintLayout addConstraintBlockOut;

  @NonNull
  public final RecyclerView availibilityRecycler;

  @NonNull
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline16;

  @NonNull
  public final ContentLoadingProgressBar loginLoader;

  @NonNull
  public final PowerSpinnerView spinnerDays;

  @NonNull
  public final PowerSpinnerView spinnerSpace;

  @NonNull
  public final PowerSpinnerView spinnerVenues;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView textViewMsg;

  private FragmentWorkspaceAvailbilityBinding(@NonNull NestedScrollView rootView,
      @NonNull TextView addCardBtn, @NonNull ConstraintLayout addConstraintBlockOut,
      @NonNull RecyclerView availibilityRecycler, @NonNull Guideline guideline15,
      @NonNull Guideline guideline16, @NonNull ContentLoadingProgressBar loginLoader,
      @NonNull PowerSpinnerView spinnerDays, @NonNull PowerSpinnerView spinnerSpace,
      @NonNull PowerSpinnerView spinnerVenues, @NonNull TextView textView10,
      @NonNull TextView textView9, @NonNull TextView textViewMsg) {
    this.rootView = rootView;
    this.addCardBtn = addCardBtn;
    this.addConstraintBlockOut = addConstraintBlockOut;
    this.availibilityRecycler = availibilityRecycler;
    this.guideline15 = guideline15;
    this.guideline16 = guideline16;
    this.loginLoader = loginLoader;
    this.spinnerDays = spinnerDays;
    this.spinnerSpace = spinnerSpace;
    this.spinnerVenues = spinnerVenues;
    this.textView10 = textView10;
    this.textView9 = textView9;
    this.textViewMsg = textViewMsg;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWorkspaceAvailbilityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWorkspaceAvailbilityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_workspace_availbility, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWorkspaceAvailbilityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addCardBtn;
      TextView addCardBtn = rootView.findViewById(id);
      if (addCardBtn == null) {
        break missingId;
      }

      id = R.id.addConstraintBlockOut;
      ConstraintLayout addConstraintBlockOut = rootView.findViewById(id);
      if (addConstraintBlockOut == null) {
        break missingId;
      }

      id = R.id.availibilityRecycler;
      RecyclerView availibilityRecycler = rootView.findViewById(id);
      if (availibilityRecycler == null) {
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

      id = R.id.loginLoader;
      ContentLoadingProgressBar loginLoader = rootView.findViewById(id);
      if (loginLoader == null) {
        break missingId;
      }

      id = R.id.spinnerDays;
      PowerSpinnerView spinnerDays = rootView.findViewById(id);
      if (spinnerDays == null) {
        break missingId;
      }

      id = R.id.spinnerSpace;
      PowerSpinnerView spinnerSpace = rootView.findViewById(id);
      if (spinnerSpace == null) {
        break missingId;
      }

      id = R.id.spinnerVenues;
      PowerSpinnerView spinnerVenues = rootView.findViewById(id);
      if (spinnerVenues == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = rootView.findViewById(id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.textViewMsg;
      TextView textViewMsg = rootView.findViewById(id);
      if (textViewMsg == null) {
        break missingId;
      }

      return new FragmentWorkspaceAvailbilityBinding((NestedScrollView) rootView, addCardBtn,
          addConstraintBlockOut, availibilityRecycler, guideline15, guideline16, loginLoader,
          spinnerDays, spinnerSpace, spinnerVenues, textView10, textView9, textViewMsg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
