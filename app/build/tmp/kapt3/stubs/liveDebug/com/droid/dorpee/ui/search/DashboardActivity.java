package com.droid.dorpee.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0016J\u0006\u0010%\u001a\u00020\"J\b\u0010&\u001a\u00020\"H\u0016J\"\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0012\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\n\u00103\u001a\u0004\u0018\u000104H\u0016J\u000e\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\t\u00a8\u00067"}, d2 = {"Lcom/droid/dorpee/ui/search/DashboardActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "address1", "", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "address2", "getAddress2", "setAddress2", "binding", "Lcom/droid/dorpee/databinding/ActivityDashboardBinding;", "city", "getCity", "setCity", "country", "getCountry", "setCountry", "state", "getState", "setState", "viewModel", "Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;)V", "zipcode", "getZipcode", "setZipcode", "afterLogin", "", "attachObserver", "bindData", "clearFragment", "initListeners", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showUpSnackError", "msg", "app_liveDebug"})
public final class DashboardActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityDashboardBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.viewmodel.DashboardViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address1 = "";
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.viewmodel.DashboardViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.viewmodel.DashboardViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress1() {
        return null;
    }
    
    public final void setAddress1(@org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void clearFragment() {
    }
    
    public final void afterLogin() {
    }
    
    public DashboardActivity() {
        super();
    }
}