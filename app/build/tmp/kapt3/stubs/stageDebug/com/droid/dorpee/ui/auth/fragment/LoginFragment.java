package com.droid.dorpee.ui.auth.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010 \u001a\u00020\u001eH\u0014J\b\u0010!\u001a\u00020\u001eH\u0002J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0006\u0010*\u001a\u00020\u001eJ\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0017\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010\tJ\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00061"}, d2 = {"Lcom/droid/dorpee/ui/auth/fragment/LoginFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentLoginBinding;", "isFromLoginActivity", "", "()Ljava/lang/Boolean;", "setFromLoginActivity", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "scondition", "", "getScondition", "()Ljava/lang/String;", "setScondition", "(Ljava/lang/String;)V", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setSpace", "(Lcom/droid/dorpee/ui/venuedashboard/model/Space;)V", "viewModel", "Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;)V", "attachObserver", "", "bindData", "initListeners", "loginFun", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openBooking", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "signUpFun", "validated", "app_stageDebug"})
public final class LoginFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentLoginBinding binding;
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
    
    private final void attachObserver() {
    }
    
    private final void showProgress(java.lang.Boolean it) {
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
    
    public LoginFragment() {
        super();
    }
}