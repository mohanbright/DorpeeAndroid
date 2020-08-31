// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.droid.dorpee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAddWorkspaceBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final LinearLayoutCompat addSpaceLayout;

  @NonNull
  public final Button addWorkspace;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final TextView editTextNoOfSpace;

  @NonNull
  public final Guideline guideline23;

  @NonNull
  public final ImageView imageVieId;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final ImageView imageViewCancel;

  @NonNull
  public final ImageView imageViewEdit;

  @NonNull
  public final FrameLayout layout;

  @NonNull
  public final TextView textSpace;

  @NonNull
  public final TextView textViewNos;

  @NonNull
  public final TextView textWorkspace;

  @NonNull
  public final View view2;

  @NonNull
  public final ConstraintLayout workspaceLayout;

  private ItemAddWorkspaceBinding(@NonNull FrameLayout rootView,
      @NonNull LinearLayoutCompat addSpaceLayout, @NonNull Button addWorkspace,
      @NonNull EditText editText2, @NonNull TextView editTextNoOfSpace,
      @NonNull Guideline guideline23, @NonNull ImageView imageVieId, @NonNull ImageView imageView18,
      @NonNull ImageView imageViewCancel, @NonNull ImageView imageViewEdit,
      @NonNull FrameLayout layout, @NonNull TextView textSpace, @NonNull TextView textViewNos,
      @NonNull TextView textWorkspace, @NonNull View view2,
      @NonNull ConstraintLayout workspaceLayout) {
    this.rootView = rootView;
    this.addSpaceLayout = addSpaceLayout;
    this.addWorkspace = addWorkspace;
    this.editText2 = editText2;
    this.editTextNoOfSpace = editTextNoOfSpace;
    this.guideline23 = guideline23;
    this.imageVieId = imageVieId;
    this.imageView18 = imageView18;
    this.imageViewCancel = imageViewCancel;
    this.imageViewEdit = imageViewEdit;
    this.layout = layout;
    this.textSpace = textSpace;
    this.textViewNos = textViewNos;
    this.textWorkspace = textWorkspace;
    this.view2 = view2;
    this.workspaceLayout = workspaceLayout;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAddWorkspaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAddWorkspaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_add_workspace, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAddWorkspaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addSpaceLayout;
      LinearLayoutCompat addSpaceLayout = rootView.findViewById(id);
      if (addSpaceLayout == null) {
        break missingId;
      }

      id = R.id.addWorkspace;
      Button addWorkspace = rootView.findViewById(id);
      if (addWorkspace == null) {
        break missingId;
      }

      id = R.id.editText2;
      EditText editText2 = rootView.findViewById(id);
      if (editText2 == null) {
        break missingId;
      }

      id = R.id.editTextNoOfSpace;
      TextView editTextNoOfSpace = rootView.findViewById(id);
      if (editTextNoOfSpace == null) {
        break missingId;
      }

      id = R.id.guideline23;
      Guideline guideline23 = rootView.findViewById(id);
      if (guideline23 == null) {
        break missingId;
      }

      id = R.id.imageVieId;
      ImageView imageVieId = rootView.findViewById(id);
      if (imageVieId == null) {
        break missingId;
      }

      id = R.id.imageView18;
      ImageView imageView18 = rootView.findViewById(id);
      if (imageView18 == null) {
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

      FrameLayout layout = (FrameLayout) rootView;

      id = R.id.textSpace;
      TextView textSpace = rootView.findViewById(id);
      if (textSpace == null) {
        break missingId;
      }

      id = R.id.textViewNos;
      TextView textViewNos = rootView.findViewById(id);
      if (textViewNos == null) {
        break missingId;
      }

      id = R.id.textWorkspace;
      TextView textWorkspace = rootView.findViewById(id);
      if (textWorkspace == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = rootView.findViewById(id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.workspaceLayout;
      ConstraintLayout workspaceLayout = rootView.findViewById(id);
      if (workspaceLayout == null) {
        break missingId;
      }

      return new ItemAddWorkspaceBinding((FrameLayout) rootView, addSpaceLayout, addWorkspace,
          editText2, editTextNoOfSpace, guideline23, imageVieId, imageView18, imageViewCancel,
          imageViewEdit, layout, textSpace, textViewNos, textWorkspace, view2, workspaceLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}