package com.droid.dorpee.ui.venuedashboard.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0014J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010\'\u001a\u00020\u00172\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001`)H\u0002J\u0018\u0010*\u001a\u00020\u00172\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u00060"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/fragments/BlockoutTimeFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "TAG", "", "availActivity", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/AvailabilityActivity;", "getAvailActivity", "()Lcom/droid/dorpee/ui/venuedashboard/venueItem/AvailabilityActivity;", "setAvailActivity", "(Lcom/droid/dorpee/ui/venuedashboard/venueItem/AvailabilityActivity;)V", "binding", "Lcom/droid/dorpee/databinding/FragmentBlockoutTimeBinding;", "selectSpaceId", "", "selectVenueId", "viewModel", "Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;)V", "attachObserver", "", "bindData", "confirmUnblockeDialog", "data", "Lcom/droid/dorpee/ui/venuedashboard/model/BlockData;", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setBlockList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setSpinnerWorkSpace", "spaces", "", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "app_stageDebug"})
public final class BlockoutTimeFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentBlockoutTimeBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel viewModel;
    private final java.lang.String TAG = "BlockoutTimeFragment";
    private int selectVenueId = 0;
    private int selectSpaceId = 0;
    @org.jetbrains.annotations.NotNull()
    public com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity availActivity;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity getAvailActivity() {
        return null;
    }
    
    public final void setAvailActivity(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity p0) {
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
    
    private final void setBlockList(java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.BlockData> data) {
    }
    
    private final void setSpinnerWorkSpace(java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> spaces) {
    }
    
    private final void confirmUnblockeDialog(com.droid.dorpee.ui.venuedashboard.model.BlockData data) {
    }
    
    private final void attachObserver() {
    }
    
    public BlockoutTimeFragment() {
        super();
    }
}