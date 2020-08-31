package com.droid.dorpee.ui.venuedashboard.venueItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0015H\u0014J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\f\u001a\u00020\u0015H\u0002J\u0017\u0010\'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)H\u0002\u00a2\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/venueItem/MyVenueActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityMyVenueBinding;", "venueList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "Lkotlin/collections/ArrayList;", "getVenueList", "()Ljava/util/ArrayList;", "setVenueList", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/droid/dorpee/ui/venuedashboard/viewmodel/MyVenueViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venuedashboard/viewmodel/MyVenueViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venuedashboard/viewmodel/MyVenueViewModel;)V", "attachObserver", "", "bindData", "changeVenueStatus", "venue", "confirmDeleteVenueDialog", "initListeners", "ohsDialog", "ohs", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "showUpSnackError", "msg", "app_liveDebug"})
public final class MyVenueActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityMyVenueBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.viewmodel.MyVenueViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.Data> venueList;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.viewmodel.MyVenueViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.viewmodel.MyVenueViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.Data> getVenueList() {
        return null;
    }
    
    public final void setVenueList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.Data> p0) {
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
    
    private final void setVenueList() {
    }
    
    private final void attachObserver() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    private final void confirmDeleteVenueDialog(com.droid.dorpee.ui.venue.venueresponse.Data venue) {
    }
    
    private final void changeVenueStatus(com.droid.dorpee.ui.venue.venueresponse.Data venue) {
    }
    
    private final void ohsDialog(com.droid.dorpee.ui.venue.venueresponse.Data venue, java.lang.String ohs) {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public MyVenueActivity() {
        super();
    }
}