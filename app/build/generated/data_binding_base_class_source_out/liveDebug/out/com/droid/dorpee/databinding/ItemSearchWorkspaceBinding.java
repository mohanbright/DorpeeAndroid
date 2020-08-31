// Generated by view binder compiler. Do not edit!
package com.droid.dorpee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.borjabravo.readmoretextview.ReadMoreTextView;
import com.droid.dorpee.R;
import com.droid.dorpee.utils.ClickableViewPager;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSearchWorkspaceBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final Button buttonBook;

  @NonNull
  public final ImageView imageViewNext;

  @NonNull
  public final ClickableViewPager imageViewpager;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat10;

  @NonNull
  public final LinearLayoutCompat linearLayoutCompat9;

  @NonNull
  public final RecyclerView recyclerEnvAndType;

  @NonNull
  public final ReadMoreTextView textViewAbout;

  @NonNull
  public final TextView textViewBuyCredit;

  @NonNull
  public final TextView textViewCapcity;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewPrice;

  @NonNull
  public final TextView textViewQuantity;

  private ItemSearchWorkspaceBinding(@NonNull MaterialCardView rootView, @NonNull Button buttonBook,
      @NonNull ImageView imageViewNext, @NonNull ClickableViewPager imageViewpager,
      @NonNull LinearLayoutCompat linearLayoutCompat10,
      @NonNull LinearLayoutCompat linearLayoutCompat9, @NonNull RecyclerView recyclerEnvAndType,
      @NonNull ReadMoreTextView textViewAbout, @NonNull TextView textViewBuyCredit,
      @NonNull TextView textViewCapcity, @NonNull TextView textViewName,
      @NonNull TextView textViewPrice, @NonNull TextView textViewQuantity) {
    this.rootView = rootView;
    this.buttonBook = buttonBook;
    this.imageViewNext = imageViewNext;
    this.imageViewpager = imageViewpager;
    this.linearLayoutCompat10 = linearLayoutCompat10;
    this.linearLayoutCompat9 = linearLayoutCompat9;
    this.recyclerEnvAndType = recyclerEnvAndType;
    this.textViewAbout = textViewAbout;
    this.textViewBuyCredit = textViewBuyCredit;
    this.textViewCapcity = textViewCapcity;
    this.textViewName = textViewName;
    this.textViewPrice = textViewPrice;
    this.textViewQuantity = textViewQuantity;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSearchWorkspaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSearchWorkspaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_search_workspace, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSearchWorkspaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBook;
      Button buttonBook = rootView.findViewById(id);
      if (buttonBook == null) {
        break missingId;
      }

      id = R.id.imageViewNext;
      ImageView imageViewNext = rootView.findViewById(id);
      if (imageViewNext == null) {
        break missingId;
      }

      id = R.id.imageViewpager;
      ClickableViewPager imageViewpager = rootView.findViewById(id);
      if (imageViewpager == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat10;
      LinearLayoutCompat linearLayoutCompat10 = rootView.findViewById(id);
      if (linearLayoutCompat10 == null) {
        break missingId;
      }

      id = R.id.linearLayoutCompat9;
      LinearLayoutCompat linearLayoutCompat9 = rootView.findViewById(id);
      if (linearLayoutCompat9 == null) {
        break missingId;
      }

      id = R.id.recyclerEnvAndType;
      RecyclerView recyclerEnvAndType = rootView.findViewById(id);
      if (recyclerEnvAndType == null) {
        break missingId;
      }

      id = R.id.textViewAbout;
      ReadMoreTextView textViewAbout = rootView.findViewById(id);
      if (textViewAbout == null) {
        break missingId;
      }

      id = R.id.textViewBuyCredit;
      TextView textViewBuyCredit = rootView.findViewById(id);
      if (textViewBuyCredit == null) {
        break missingId;
      }

      id = R.id.textViewCapcity;
      TextView textViewCapcity = rootView.findViewById(id);
      if (textViewCapcity == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = rootView.findViewById(id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.textViewPrice;
      TextView textViewPrice = rootView.findViewById(id);
      if (textViewPrice == null) {
        break missingId;
      }

      id = R.id.textViewQuantity;
      TextView textViewQuantity = rootView.findViewById(id);
      if (textViewQuantity == null) {
        break missingId;
      }

      return new ItemSearchWorkspaceBinding((MaterialCardView) rootView, buttonBook, imageViewNext,
          imageViewpager, linearLayoutCompat10, linearLayoutCompat9, recyclerEnvAndType,
          textViewAbout, textViewBuyCredit, textViewCapcity, textViewName, textViewPrice,
          textViewQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
