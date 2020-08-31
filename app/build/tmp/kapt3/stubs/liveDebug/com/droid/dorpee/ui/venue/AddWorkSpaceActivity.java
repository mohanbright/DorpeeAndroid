package com.droid.dorpee.ui.venue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J$\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0014H\u0014J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0017\u0010(\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/droid/dorpee/ui/venue/AddWorkSpaceActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityAddWorkSpaceBinding;", "from", "", "isFreeSpace", "", "venuName", "venueId", "", "viewModel", "Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;)V", "attachObserver", "", "bindData", "initListeners", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setUpAmenitieAsset", "setUpEnvironment", "setUpTypes", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "(Ljava/lang/Boolean;)V", "showUpSnackError", "msg", "Companion", "app_liveDebug"})
public final class AddWorkSpaceActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private java.lang.String venuName = "";
    private int venueId = 0;
    private java.lang.String from = "";
    private boolean isFreeSpace = false;
    private com.droid.dorpee.databinding.ActivityAddWorkSpaceBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.droid.dorpee.ui.venue.viewmodel.VenueViewModel viewModel;
    private static final int IMAGE_WORK_REQUEST_CODE = 12523;
    @org.jetbrains.annotations.Nullable()
    private static java.util.ArrayList<java.lang.String> mResultswork;
    @org.jetbrains.annotations.Nullable()
    private static java.util.ArrayList<com.droid.dorpee.ui.venue.model.DataXXXX> listOfAsset;
    public static final com.droid.dorpee.ui.venue.AddWorkSpaceActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venue.viewmodel.VenueViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venue.viewmodel.VenueViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
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
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void setUpAmenitieAsset() {
    }
    
    private final void setUpTypes() {
    }
    
    private final void setUpEnvironment() {
    }
    
    private final void attachObserver() {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.content.Intent data) {
    }
    
    public AddWorkSpaceActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/droid/dorpee/ui/venue/AddWorkSpaceActivity$Companion;", "", "()V", "IMAGE_WORK_REQUEST_CODE", "", "getIMAGE_WORK_REQUEST_CODE", "()I", "listOfAsset", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venue/model/DataXXXX;", "Lkotlin/collections/ArrayList;", "getListOfAsset", "()Ljava/util/ArrayList;", "setListOfAsset", "(Ljava/util/ArrayList;)V", "mResultswork", "", "getMResultswork", "setMResultswork", "app_liveDebug"})
    public static final class Companion {
        
        public final int getIMAGE_WORK_REQUEST_CODE() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.String> getMResultswork() {
            return null;
        }
        
        public final void setMResultswork(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<com.droid.dorpee.ui.venue.model.DataXXXX> getListOfAsset() {
            return null;
        }
        
        public final void setListOfAsset(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.droid.dorpee.ui.venue.model.DataXXXX> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}