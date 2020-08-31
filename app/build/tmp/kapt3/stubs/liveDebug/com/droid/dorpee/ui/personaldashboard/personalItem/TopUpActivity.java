package com.droid.dorpee.ui.personaldashboard.personalItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/personalItem/TopUpActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "apiError", "Landroidx/lifecycle/MutableLiveData;", "", "getApiError", "()Landroidx/lifecycle/MutableLiveData;", "setApiError", "(Landroidx/lifecycle/MutableLiveData;)V", "binding", "Lcom/droid/dorpee/databinding/ActivityTopupCreditsBinding;", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "viewModel", "Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;)V", "bindData", "", "initListeners", "loadFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "app_liveDebug"})
public final class TopUpActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityTopupCreditsBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel viewModel;
    private com.droid.dorpee.ui.auth.model.User user;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiError() {
        return null;
    }
    
    public final void setApiError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
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
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void loadFragment(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    public TopUpActivity() {
        super();
    }
}