package com.droid.dorpee.ui.personaldashboard.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J$\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eJ\b\u0010 \u001a\u00020\u0018H\u0014J\u0006\u0010!\u001a\u00020\u0018J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010,\u001a\u00020\u0018H\u0002J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0017\u0010/\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u000101H\u0002\u00a2\u0006\u0002\u00102R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00063"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/fragments/PastBookingFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentPastBookingBinding;", "pastBookings", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBooking;", "Lkotlin/collections/ArrayList;", "getPastBookings", "()Ljava/util/ArrayList;", "setPastBookings", "(Ljava/util/ArrayList;)V", "searchCondition", "", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "viewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;)V", "bindData", "", "compareDate", "", "input", "formatDate", "date", "startTime", "endTiem", "initListeners", "loadData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUPUpcomingList", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_liveDebug"})
public final class PastBookingFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.ui.venuedashboard.model.Space space;
    private com.droid.dorpee.databinding.FragmentPastBookingBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDBooking> pastBookings;
    private java.lang.String searchCondition = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDBooking> getPastBookings() {
        return null;
    }
    
    public final void setPastBookings(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDBooking> p0) {
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
    
    private final void setUPUpcomingList() {
    }
    
    public final void loadData() {
    }
    
    private final int compareDate(java.lang.String input) {
        return 0;
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(@org.jetbrains.annotations.Nullable()
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTiem) {
        return null;
    }
    
    public PastBookingFragment() {
        super();
    }
}