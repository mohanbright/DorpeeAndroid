package com.droid.dorpee.ui.search.ui.booking.venuefrag;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/droid/dorpee/ui/search/ui/booking/venuefrag/PastVenueBookingFrag;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentPastBookingBinding;", "index", "", "pastBooking", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueBooking;", "Lkotlin/collections/ArrayList;", "getPastBooking", "()Ljava/util/ArrayList;", "setPastBooking", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;)V", "bindData", "", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpPastVenueList", "setUpVM", "Landroidx/lifecycle/ViewModel;", "app_liveDebug"})
public final class PastVenueBookingFrag extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentPastBookingBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> pastBooking;
    private int index = -1;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> getPastBooking() {
        return null;
    }
    
    public final void setPastBooking(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpPastVenueList() {
    }
    
    public PastVenueBookingFrag() {
        super();
    }
}