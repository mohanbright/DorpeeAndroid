package com.droid.dorpee.ui.search.ui.checkin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0017\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/droid/dorpee/ui/search/ui/checkin/CheckInFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "TAG", "", "binding", "Lcom/droid/dorpee/databinding/FragmentCheckinBinding;", "scannerResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getScannerResult", "()Landroidx/activity/result/ActivityResultLauncher;", "viewModel", "Lcom/droid/dorpee/ui/search/ui/checkin/CheckInViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/search/ui/checkin/CheckInViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/search/ui/checkin/CheckInViewModel;)V", "attachObserver", "", "bindData", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showDialogYesNo", "msg", "showMsgDialog", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_stageDebug"})
public final class CheckInFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private final java.lang.String TAG = "CheckInFragment";
    private com.droid.dorpee.databinding.FragmentCheckinBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.ui.checkin.CheckInViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> scannerResult = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.ui.checkin.CheckInViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.ui.checkin.CheckInViewModel p0) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getScannerResult() {
        return null;
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
    
    private final void attachObserver() {
    }
    
    private final void showMsgDialog(java.lang.String msg) {
    }
    
    private final void showDialogYesNo(java.lang.String msg) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    public CheckInFragment() {
        super();
    }
}