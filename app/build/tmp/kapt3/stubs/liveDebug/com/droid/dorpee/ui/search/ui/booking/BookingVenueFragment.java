package com.droid.dorpee.ui.search.ui.booking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001cH\u0014J\u0010\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\u0015\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u000104\u00a2\u0006\u0002\u00105J\u000e\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00068"}, d2 = {"Lcom/droid/dorpee/ui/search/ui/booking/BookingVenueFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentBookingVenueBinding;", "pastBookings", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueBooking;", "Lkotlin/collections/ArrayList;", "getPastBookings", "()Ljava/util/ArrayList;", "setPastBookings", "(Ljava/util/ArrayList;)V", "todaysBookings", "getTodaysBookings", "setTodaysBookings", "upComingBookings", "getUpComingBookings", "setUpComingBookings", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "viewModel", "Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;)V", "attachObserver", "", "bindData", "compareDate", "", "input", "", "initListeners", "loadFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "showUpSnackError", "msg", "app_liveDebug"})
public final class BookingVenueFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentBookingVenueBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> upComingBookings;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> todaysBookings;
    private com.droid.dorpee.ui.auth.model.User user;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> pastBookings;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> getUpComingBookings() {
        return null;
    }
    
    public final void setUpComingBookings(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> getTodaysBookings() {
        return null;
    }
    
    public final void setTodaysBookings(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> getPastBookings() {
        return null;
    }
    
    public final void setPastBookings(@org.jetbrains.annotations.Nullable()
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
    
    public final void attachObserver() {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void loadFragment(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    private final int compareDate(java.lang.String input) {
        return 0;
    }
    
    public final void showProgress(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean it) {
    }
    
    public BookingVenueFragment() {
        super();
    }
}