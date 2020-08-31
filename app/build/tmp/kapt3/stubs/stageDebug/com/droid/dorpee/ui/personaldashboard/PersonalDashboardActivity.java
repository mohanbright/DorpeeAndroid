package com.droid.dorpee.ui.personaldashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0006\u0010$\u001a\u00020 J\b\u0010%\u001a\u00020 H\u0016J\u0012\u0010&\u001a\u00020 2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0015J\b\u0010,\u001a\u00020 H\u0014J\b\u0010-\u001a\u00020 H\u0002J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0017\u00100\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0002\u00a2\u0006\u0002\u00103R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00064"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/PersonalDashboardActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityPersonalDashboardBinding;", "planExpiry", "", "planName", "plan_credits", "", "Ljava/lang/Integer;", "plans", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venue/venueresponse/PlanX;", "Lkotlin/collections/ArrayList;", "total_credits", "upComingBookings", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBooking;", "getUpComingBookings", "()Ljava/util/ArrayList;", "setUpComingBookings", "(Ljava/util/ArrayList;)V", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "viewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;)V", "attachObserver", "", "bindData", "compareDate", "input", "getData", "initListeners", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setUPdashList", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_stageDebug"})
public final class PersonalDashboardActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityPersonalDashboardBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel viewModel;
    private java.lang.Integer plan_credits = 0;
    private java.lang.Integer total_credits = 0;
    private com.droid.dorpee.ui.auth.model.User user;
    private java.lang.String planName;
    private java.lang.String planExpiry;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDBooking> upComingBookings;
    private java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.PlanX> plans;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDBooking> getUpComingBookings() {
        return null;
    }
    
    public final void setUpComingBookings(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDBooking> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getData() {
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
    
    private final void attachObserver() {
    }
    
    private final void setUPdashList() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    private final int compareDate(java.lang.String input) {
        return 0;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public PersonalDashboardActivity() {
        super();
    }
}