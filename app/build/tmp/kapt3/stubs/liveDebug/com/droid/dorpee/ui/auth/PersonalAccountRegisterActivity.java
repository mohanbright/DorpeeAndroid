package com.droid.dorpee.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0016J\u0006\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020 H\u0016J$\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u00052\n\b\u0001\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0012\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020 H\u0014J\b\u00101\u001a\u00020 H\u0002J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\u0017\u00106\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010\u0015J\u000e\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020\fJ\b\u0010:\u001a\u00020\u0012H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006;"}, d2 = {"Lcom/droid/dorpee/ui/auth/PersonalAccountRegisterActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "IMAGE_PROFILE_IMAGE_CODE", "", "getIMAGE_PROFILE_IMAGE_CODE", "()I", "binding", "Lcom/droid/dorpee/databinding/ActivityPersonalAccountRegisterBinding;", "imageList", "Ljava/util/ArrayList;", "", "getImageList", "()Ljava/util/ArrayList;", "setImageList", "(Ljava/util/ArrayList;)V", "isEditProfile", "", "()Ljava/lang/Boolean;", "setEditProfile", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "user", "Lcom/droid/dorpee/ui/auth/model/LoginResponse;", "viewModel", "Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;)V", "EditProfile", "", "attachObserver", "bindData", "editProfileApi", "initListeners", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "registerFun", "selectImage", "setUInterestList", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "showUpSnackError", "msg", "validated", "app_liveDebug"})
public final class PersonalAccountRegisterActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.ui.auth.model.LoginResponse user;
    private com.droid.dorpee.databinding.ActivityPersonalAccountRegisterBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.auth.viewmodel.AuthViewModel viewModel;
    private final int IMAGE_PROFILE_IMAGE_CODE = 34113;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imageList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isEditProfile = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.auth.viewmodel.AuthViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.viewmodel.AuthViewModel p0) {
    }
    
    public final int getIMAGE_PROFILE_IMAGE_CODE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageList() {
        return null;
    }
    
    public final void setImageList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isEditProfile() {
        return null;
    }
    
    public final void setEditProfile(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    private final void attachObserver() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void selectImage() {
    }
    
    private final void registerFun() {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    private final boolean validated() {
        return false;
    }
    
    private final void setUInterestList() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.content.Intent data) {
    }
    
    public final void EditProfile() {
    }
    
    public final void editProfileApi() {
    }
    
    public PersonalAccountRegisterActivity() {
        super();
    }
}