// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySuccessWorksapceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton addMoreWorkspace;

  @NonNull
  public final ImageView imageView19;

  @NonNull
  public final TextView textView65;

  @NonNull
  public final TextView textView66;

  @NonNull
  public final AppCompatButton toDashboard;

  private ActivitySuccessWorksapceBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton addMoreWorkspace, @NonNull ImageView imageView19,
      @NonNull TextView textView65, @NonNull TextView textView66,
      @NonNull AppCompatButton toDashboard) {
    this.rootView = rootView;
    this.addMoreWorkspace = addMoreWorkspace;
    this.imageView19 = imageView19;
    this.textView65 = textView65;
    this.textView66 = textView66;
    this.toDashboard = toDashboard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySuccessWorksapceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySuccessWorksapceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_success_worksapce, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySuccessWorksapceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addMoreWorkspace;
      AppCompatButton addMoreWorkspace = rootView.findViewById(id);
      if (addMoreWorkspace == null) {
        break missingId;
      }

      id = R.id.imageView19;
      ImageView imageView19 = rootView.findViewById(id);
      if (imageView19 == null) {
        break missingId;
      }

      id = R.id.textView65;
      TextView textView65 = rootView.findViewById(id);
      if (textView65 == null) {
        break missingId;
      }

      id = R.id.textView66;
      TextView textView66 = rootView.findViewById(id);
      if (textView66 == null) {
        break missingId;
      }

      id = R.id.toDashboard;
      AppCompatButton toDashboard = rootView.findViewById(id);
      if (toDashboard == null) {
        break missingId;
      }

      return new ActivitySuccessWorksapceBinding((ConstraintLayout) rootView, addMoreWorkspace,
          imageView19, textView65, textView66, toDashboard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}