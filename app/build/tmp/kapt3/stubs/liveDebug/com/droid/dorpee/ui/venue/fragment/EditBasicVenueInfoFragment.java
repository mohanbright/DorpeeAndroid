package com.droid.dorpee.ui.venue.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0014J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0019H\u0017J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(H\u0002J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lcom/droid/dorpee/ui/venue/fragment/EditBasicVenueInfoFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "TAG", "", "addedImage", "", "Ljava/lang/Boolean;", "binding", "Lcom/droid/dorpee/databinding/FragmentBasicVenueInfoBinding;", "place", "Lin/madapps/placesautocomplete/model/Place;", "placeData", "Lin/madapps/placesautocomplete/model/PlaceDetails;", "placesApi", "Lcom/droid/dorpee/utils/place/CustomPlaceApi;", "venueTypeId", "", "viewModel", "Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;)V", "bindData", "", "getPlaceDetails", "placeId", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setEditVenueType", "data", "Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "app_liveDebug"})
public final class EditBasicVenueInfoFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private java.lang.Boolean addedImage;
    private int venueTypeId = 0;
    private com.droid.dorpee.databinding.FragmentBasicVenueInfoBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venue.viewmodel.VenueViewModel viewModel;
    private in.madapps.placesautocomplete.model.Place place;
    private in.madapps.placesautocomplete.model.PlaceDetails placeData;
    private com.droid.dorpee.utils.place.CustomPlaceApi placesApi;
    private final java.lang.String TAG = "EditBasicVenueInfoFragment";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.viewmodel.VenueViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.viewmodel.VenueViewModel p0) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    private final void getPlaceDetails(java.lang.String placeId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setEditVenueType(com.droid.dorpee.ui.venue.venueresponse.Data data) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onResume() {
    }
    
    public EditBasicVenueInfoFragment() {
        super();
    }
}