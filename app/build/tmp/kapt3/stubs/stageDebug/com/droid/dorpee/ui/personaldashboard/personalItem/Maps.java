package com.droid.dorpee.ui.personaldashboard.personalItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\nH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/personalItem/Maps;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityMapsBinding;", "booking", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBooking;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mTitle", "", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "venueDetailLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "viewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;)V", "bindData", "", "initListeners", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "setUpVM", "Landroidx/lifecycle/ViewModel;", "app_stageDebug"})
public final class Maps extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener, com.google.android.gms.maps.OnMapReadyCallback {
    private java.lang.String mTitle = "";
    private com.google.android.gms.maps.model.LatLng venueDetailLatLng;
    private com.droid.dorpee.databinding.ActivityMapsBinding binding;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.droid.dorpee.ui.auth.model.User user;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel viewModel;
    private com.droid.dorpee.ui.personaldashboard.models.MDBooking booking;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void bindData() {
    }
    
    @java.lang.Override()
    public void initListeners() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public Maps() {
        super();
    }
}