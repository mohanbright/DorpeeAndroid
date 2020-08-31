package com.droid.dorpee.ui.personaldashboard.personalItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0017\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/personalItem/AddCardActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityAddCardBinding;", "stripe", "Lcom/stripe/android/Stripe;", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "getUser", "()Lcom/droid/dorpee/ui/auth/model/User;", "setUser", "(Lcom/droid/dorpee/ui/auth/model/User;)V", "viewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PlansViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PlansViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PlansViewModel;)V", "addCard", "", "attachObserver", "bindData", "initListeners", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_liveDebug"})
public final class AddCardActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityAddCardBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.PlansViewModel viewModel;
    private com.stripe.android.Stripe stripe;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.auth.model.User user;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.PlansViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.PlansViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.auth.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.model.User p0) {
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
    
    private final void addCard() {
    }
    
    private final void attachObserver() {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    public AddCardActivity() {
        super();
    }
}