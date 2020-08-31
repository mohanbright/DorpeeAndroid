package com.droid.dorpee.ui.venuedashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020\u0015H\u0002J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0017\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010%H\u0002\u00a2\u0006\u0002\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/VenueDashboardActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "binding", "Lcom/droid/dorpee/databinding/ActivityVenueDashboardBinding;", "earnedThisTime", "selectVenueId", "", "timeType", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "viewModel", "Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;)V", "attachObserver", "", "bindData", "getTimelyRevenue", "initListeners", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setUPdashList", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_stageDebug"})
public final class VenueDashboardActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private java.lang.String earnedThisTime = "Earned This Week";
    private java.lang.String timeType = "weekly";
    private int selectVenueId = 0;
    private com.droid.dorpee.databinding.ActivityVenueDashboardBinding binding;
    private com.droid.dorpee.ui.auth.model.User user;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel viewModel;
    private final java.lang.String TAG = "VenueDashboardActivity";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void bindData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
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
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void attachObserver() {
    }
    
    private final void getTimelyRevenue() {
    }
    
    private final void setUPdashList() {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    public VenueDashboardActivity() {
        super();
    }
}