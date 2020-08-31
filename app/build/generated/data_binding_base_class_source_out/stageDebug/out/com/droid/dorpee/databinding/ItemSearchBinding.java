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
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSearchBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivSsearchClose;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat2;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat3;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat4;

  @NonNull
  public final TextView textView35;

  @NonNull
  public final TextView textView37;

  @NonNull
  public final TextView textView39;

  @NonNull
  public final TextView textView40;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final TextView textView42;

  private ItemSearchBinding(@NonNull MaterialCardView rootView, @NonNull ImageView ivSsearchClose,
      @NonNull LinearLayoutCompat linearLayoutCompat2,
      @NonNull LinearLayoutCompat linearLayoutCompat3,
      @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull TextView textView35,
      @NonNull TextView textView37, @NonNull TextView textView39, @NonNull TextView textView40,
      @NonNull TextView textView41, @NonNull TextView textView42) {
    this.rootView = rootView;
    this.ivSsearchClose = ivSsearchClose;
    this.linearLayoutCompat2 = linearLayoutCompat2;
    this.linearLayoutCompat3 = linearLayoutCompat3;
    this.linearLayoutCompat4 = linearLayoutCompat4;
    this.textView35 = textView35;
    this.textView37 = textView37;
    this.textView39 = textView39;
    this.textView40 = textView40;
    this.textView41 = textView41;
    this.textView42 = textView42;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivSsearchClose;
      ImageView ivSsearchClose = rootView.findViewById(id);
      if (ivSsearchClose == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat2;
      LinearLayoutCompat linearLayoutCompat2 = rootView.findViewById(id);
      if (linearLayoutCompat2 == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat3;
      LinearLayoutCompat linearLayoutCompat3 = rootView.findViewById(id);
      if (linearLayoutCompat3 == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat4;
      LinearLayoutCompat linearLayoutCompat4 = rootView.findViewById(id);
      if (linearLayoutCompat4 == null) {
        break missingId;
      }

      id = R.id.textView35;
      TextView textView35 = rootView.findViewById(id);
      if (textView35 == null) {
        break missingId;
      }

      id = R.id.textView37;
      TextView textView37 = rootView.findViewById(id);
      if (textView37 == null) {
        break missingId;
      }

      id = R.id.textView39;
      TextView textView39 = rootView.findViewById(id);
      if (textView39 == null) {
        break missingId;
      }

      id = R.id.textView40;
      TextView textView40 = rootView.findViewById(id);
      if (textView40 == null) {
        break missingId;
      }

      id = R.id.textView41;
      TextView textView41 = rootView.findViewById(id);
      if (textView41 == null) {
        break missingId;
      }

      id = R.id.textView42;
      TextView textView42 = rootView.findViewById(id);
      if (textView42 == null) {
        break missingId;
      }

      return new ItemSearchBinding((MaterialCardView) rootView, ivSsearchClose, linearLayoutCompat2,
          linearLayoutCompat3, linearLayoutCompat4, textView35, textView37, textView39, textView40,
          textView41, textView42);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}