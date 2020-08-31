package com.droid.dorpee.ui.baseClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H$J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0019H$J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u0019H\u0016J\u001e\u0010%\u001a\u00020\u00192\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0\'j\b\u0012\u0004\u0012\u00020(`)J\u0018\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004J\n\u0010.\u001a\u0004\u0018\u00010/H&J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020/R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u00062"}, d2 = {"Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "address2", "", "getAddress2", "()Ljava/lang/String;", "setAddress2", "(Ljava/lang/String;)V", "city", "getCity", "setCity", "country", "getCountry", "setCountry", "state", "getState", "setState", "street", "getStreet", "setStreet", "zipcode", "getZipcode", "setZipcode", "bindData", "", "createPartFromString", "Lokhttp3/RequestBody;", "param", "emptyAdress", "hideKeyboard", "context", "Landroid/content/Context;", "initListeners", "isNetworkAvailable", "", "onStart", "parseAddress", "address", "Ljava/util/ArrayList;", "Lin/madapps/placesautocomplete/model/Address;", "Lkotlin/collections/ArrayList;", "requestUploadImage", "Lokhttp3/MultipartBody$Part;", "multiPartImage", "name", "setUpVM", "Landroidx/lifecycle/ViewModel;", "fragment", "obj", "app_stageDebug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String street = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address2 = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String city = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String state = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String zipcode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String country = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreet() {
        return null;
    }
    
    public final void setStreet(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress2() {
        return null;
    }
    
    public final void setAddress2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZipcode() {
        return null;
    }
    
    public final void setZipcode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    protected abstract void bindData();
    
    protected abstract void initListeners();
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.ViewModel setUpVM();
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part requestUploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String multiPartImage, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody createPartFromString(@org.jetbrains.annotations.NotNull()
    java.lang.String param) {
        return null;
    }
    
    /**
     * Common function for Set Up ViewModel...
     * if no ViewModel Available then use BaseViewModel ...
     * You can also send parameters in constructor ...
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModel setUpVM(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModel obj) {
        return null;
    }
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public final void emptyAdress() {
    }
    
    public final void parseAddress(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<in.madapps.placesautocomplete.model.Address> address) {
    }
    
    public BaseFragment() {
        super();
    }
}