package com.droid.dorpee.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0002J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u001f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0006\u0010)\u001a\u00020\u001fJ\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0017\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010\nJ\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/droid/dorpee/ui/auth/LoginActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityLoginBinding;", "isFromLoginActivity", "", "()Ljava/lang/Boolean;", "setFromLoginActivity", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "scondition", "", "getScondition", "()Ljava/lang/String;", "setScondition", "(Ljava/lang/String;)V", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setSpace", "(Lcom/droid/dorpee/ui/venuedashboard/model/Space;)V", "viewModel", "Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;)V", "attachObserver", "", "bindData", "initListeners", "loginFun", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openBooking", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "signUpFun", "validated", "app_stageDebug"})
public final class LoginActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityLoginBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.auth.viewmodel.AuthViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.model.Space space;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scondition;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isFromLoginActivity = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.auth.viewmodel.AuthViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.viewmodel.AuthViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.Space getSpace() {
        return null;
    }
    
    public final void setSpace(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.Space p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScondition() {
        return null;
    }
    
    public final void setScondition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFromLoginActivity() {
        return null;
    }
    
    public final void setFromLoginActivity(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
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
    
    private final void attachObserver() {
    }
    
    private final void showProgress(java.lang.Boolean it) {
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
    
    private final void loginFun() {
    }
    
    public final void openBooking() {
    }
    
    private final void signUpFun() {
    }
    
    private final boolean validated() {
        return false;
    }
    
    public LoginActivity() {
        super();
    }
}