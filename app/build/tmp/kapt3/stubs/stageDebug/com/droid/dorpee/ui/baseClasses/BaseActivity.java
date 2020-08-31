package com.droid.dorpee.ui.baseClasses;

import java.lang.System;

/**
 * Created by Vishal on 10/10/19.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H&J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0006\u0010\u0013\u001a\u00020\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001a\u00a8\u0006\u001e"}, d2 = {"Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bindData", "", "createPartFromString", "Lokhttp3/RequestBody;", "param", "", "hideKeyboard", "initListeners", "isNetworkAvailable", "", "jsonobjectToClassObject", "Lcom/propane/ui/signup/locationModel/AddressInfo;", "response", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSearchCalled", "onStart", "requestUploadImage", "Lokhttp3/MultipartBody$Part;", "multiPartImage", "name", "setUpVM", "Landroidx/lifecycle/ViewModel;", "setUpViewModel", "activity", "obj", "app_stageDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.propane.ui.signup.locationModel.AddressInfo jsonobjectToClassObject(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public final void onSearchCalled() {
    }
    
    public abstract void bindData();
    
    public abstract void initListeners();
    
    public final void hideKeyboard() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody createPartFromString(@org.jetbrains.annotations.NotNull()
    java.lang.String param) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part requestUploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String multiPartImage, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    /**
     * Common function for Set Up ViewModel...
     * if no ViewModel Available then use BaseViewModel ...
     * You can also send parameters in constructor ...
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModel setUpViewModel(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModel obj) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.ViewModel setUpVM();
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
}