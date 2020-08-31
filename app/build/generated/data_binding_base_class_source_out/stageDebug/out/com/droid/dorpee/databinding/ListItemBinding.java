// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AppCompatCheckBox checkboxId;

  @NonNull
  public final LinearLayoutCompat layout;

  private ListItemBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AppCompatCheckBox checkboxId, @NonNull LinearLayoutCompat layout) {
    this.rootView = rootView;
    this.checkboxId = checkboxId;
    this.layout = layout;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkboxId;
      AppCompatCheckBox checkboxId = rootView.findViewById(id);
      if (checkboxId == null) {
        break missingId;
      }

      LinearLayoutCompat layout = (LinearLayoutCompat) rootView;

      return new ListItemBinding((LinearLayoutCompat) rootView, checkboxId, layout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}