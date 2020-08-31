package com.droid.dorpee.ui.auth.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ<\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(J\u0018\u0010)\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+J$\u0010,\u001a\u00020\u00162\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0014\u0010\t\u00a8\u0006-"}, d2 = {"Lcom/droid/dorpee/ui/auth/viewmodel/AuthViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiError", "Landroidx/lifecycle/MutableLiveData;", "", "getApiError", "()Landroidx/lifecycle/MutableLiveData;", "setApiError", "(Landroidx/lifecycle/MutableLiveData;)V", "apiForgotResponse", "Lcom/droid/dorpee/ui/ForgotResponse;", "getApiForgotResponse", "setApiForgotResponse", "apiLoginResponse", "Lcom/droid/dorpee/ui/auth/model/LoginResponse;", "getApiLoginResponse", "setApiLoginResponse", "isLoading", "", "setLoading", "editProfileCustomer", "", "header", "Lcom/droid/dorpee/ui/RequestWithHeader;", "editPersonalProfile", "Lcom/droid/dorpee/ui/editPersonalProfile;", "context", "Landroid/content/Context;", "editProfileCustomerss", "token", "mapList", "", "Lokhttp3/RequestBody;", "imagePart", "Lokhttp3/MultipartBody$Part;", "personalAccountRegisterActivity", "Lcom/droid/dorpee/ui/auth/PersonalAccountRegisterActivity;", "forgotPasswordApi", "request", "Lcom/droid/dorpee/ui/LoginRequest;", "loginApi", "loginActivity", "Lcom/droid/dorpee/ui/auth/LoginActivity;", "registerApi", "app_stageDebug"})
public final class AuthViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.LoginResponse> apiLoginResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.ForgotResponse> apiForgotResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiError() {
        return null;
    }
    
    public final void setApiError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.LoginResponse> getApiLoginResponse() {
        return null;
    }
    
    public final void setApiLoginResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.LoginResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.ForgotResponse> getApiForgotResponse() {
        return null;
    }
    
    public final void setApiForgotResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.ForgotResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void loginApi(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.LoginRequest request, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.LoginActivity loginActivity) {
    }
    
    public final void forgotPasswordApi(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.LoginRequest request) {
    }
    
    public final void registerApi(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part imagePart) {
    }
    
    public final void editProfileCustomer(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.editPersonalProfile editPersonalProfile, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void editProfileCustomerss(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader token, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part imagePart, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.auth.PersonalAccountRegisterActivity personalAccountRegisterActivity) {
    }
    
    public AuthViewModel() {
        super();
    }
}