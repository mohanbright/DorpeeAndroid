package com.droid.dorpee.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J$\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0018H\u0014J\b\u0010\'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0017\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010-H\u0002\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\fJ\b\u00101\u001a\u00020-H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00062"}, d2 = {"Lcom/droid/dorpee/ui/auth/RegisterActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "IMAGE_PROFILE_IMAGE_CODE", "", "getIMAGE_PROFILE_IMAGE_CODE", "()I", "binding", "Lcom/droid/dorpee/databinding/ActivityRegisterBinding;", "imageList", "Ljava/util/ArrayList;", "", "getImageList", "()Ljava/util/ArrayList;", "setImageList", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;)V", "attachObserver", "", "bindData", "initListeners", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "registerFun", "selectImage", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "showUpSnackError", "msg", "validated", "app_liveDebug"})
public final class RegisterActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityRegisterBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.auth.viewmodel.AuthViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imageList;
    private final int IMAGE_PROFILE_IMAGE_CODE = 34113332;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.auth.viewmodel.AuthViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.viewmodel.AuthViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageList() {
        return null;
    }
    
    public final void setImageList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final int getIMAGE_PROFILE_IMAGE_CODE() {
        return 0;
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
    
    private final void attachObserver() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void selectImage() {
    }
    
    private final void registerFun() {
    }
    
    private final boolean validated() {
        return false;
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.content.Intent data) {
    }
    
    public RegisterActivity() {
        super();
    }
}