package com.droid.dorpee.ui.venuedashboard.venueItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0016\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010%\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0!H\u0002J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\rH\u0002J\u0015\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010,\u00a2\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0004J\u0018\u00100\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00063"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/venueItem/VenueDetailActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "()V", "TAG", "", "binding", "Lcom/droid/dorpee/databinding/FragmentVenueDetailsBinding;", "scondition", "getScondition", "()Ljava/lang/String;", "setScondition", "(Ljava/lang/String;)V", "venueDetailData", "Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "getVenueDetailData", "()Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "setVenueDetailData", "(Lcom/droid/dorpee/ui/venue/venueresponse/Data;)V", "viewModel", "Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;)V", "attachObserver", "", "bindData", "initListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpAmenitie", "services", "", "Lcom/droid/dorpee/ui/venue/venueresponse/Service;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "setUpWorkspace", "spaces", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setVenueDetails", "data", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "showUpSnackError", "msg", "showaVialDialog", "lissst", "Lcom/droid/dorpee/ui/venue/model/Availability;", "app_liveDebug"})
public final class VenueDetailActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity {
    private com.droid.dorpee.databinding.FragmentVenueDetailsBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venue.venueresponse.Data venueDetailData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scondition;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.ui.search.SearchViewModel viewModel;
    private final java.lang.String TAG = "VenueDetailActivity";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.venueresponse.Data getVenueDetailData() {
        return null;
    }
    
    public final void setVenueDetailData(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.venueresponse.Data p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScondition() {
        return null;
    }
    
    public final void setScondition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.ui.search.SearchViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.ui.search.SearchViewModel p0) {
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
    
    private final void setVenueDetails(com.droid.dorpee.ui.venue.venueresponse.Data data) {
    }
    
    private final void setUpAmenitie(java.util.List<com.droid.dorpee.ui.venue.venueresponse.Service> services) {
    }
    
    private final void setUpWorkspace(java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> spaces) {
    }
    
    private final void attachObserver() {
    }
    
    private final void showaVialDialog(java.util.List<com.droid.dorpee.ui.venue.model.Availability> lissst) {
    }
    
    public final void showProgress(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean it) {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public VenueDetailActivity() {
        super();
    }
}