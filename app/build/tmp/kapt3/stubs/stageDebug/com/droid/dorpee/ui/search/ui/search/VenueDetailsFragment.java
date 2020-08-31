package com.droid.dorpee.ui.search.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0016\u0010\"\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0016\u0010(\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0$H\u0002J\u0012\u0010+\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010-\u001a\u00020\u00152\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010$H\u0002J\u0015\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u000102\u00a2\u0006\u0002\u00103R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u00064"}, d2 = {"Lcom/droid/dorpee/ui/search/ui/search/VenueDetailsFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "TAG", "", "binding", "Lcom/droid/dorpee/databinding/FragmentVenueDetailsBinding;", "scondition", "getScondition", "()Ljava/lang/String;", "setScondition", "(Ljava/lang/String;)V", "venueData", "Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "viewModel", "Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;)V", "attachObserver", "", "bindData", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpAmenitie", "services", "", "Lcom/droid/dorpee/ui/venue/venueresponse/Service;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "setUpWorkspace", "spaces", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setVenueDetails", "data", "showDialog", "lissst", "Lcom/droid/dorpee/ui/venue/model/Availability;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_stageDebug"})
public final class VenueDetailsFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.ui.venue.venueresponse.Data venueData;
    private com.droid.dorpee.databinding.FragmentVenueDetailsBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.ui.search.SearchViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scondition;
    private final java.lang.String TAG = "VenueDetailsFragment";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.ui.search.SearchViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.ui.search.SearchViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScondition() {
        return null;
    }
    
    public final void setScondition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setVenueDetails(com.droid.dorpee.ui.venue.venueresponse.Data data) {
    }
    
    private final void setUpAmenitie(java.util.List<com.droid.dorpee.ui.venue.venueresponse.Service> services) {
    }
    
    private final void setUpWorkspace(java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> spaces) {
    }
    
    private final void attachObserver() {
    }
    
    private final void showDialog(java.util.List<com.droid.dorpee.ui.venue.model.Availability> lissst) {
    }
    
    public final void showProgress(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean it) {
    }
    
    public VenueDetailsFragment() {
        super();
    }
}