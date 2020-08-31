package com.droid.dorpee.ui.venue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\bH\u0014J \u0010&\u001a\u00020\b2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*H\u0002J\u001e\u0010+\u001a\u00020\b2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u000e\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u000200R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u00062"}, d2 = {"Lcom/droid/dorpee/ui/venue/EditVenueActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityRegisterVenueBinding;", "venueTypes", "Lkotlin/Function0;", "", "getVenueTypes", "()Lkotlin/jvm/functions/Function0;", "setVenueTypes", "(Lkotlin/jvm/functions/Function0;)V", "viewModel", "Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;)V", "attachObserver", "bindData", "initListeners", "loadFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setUpTabLineHere", "listOfTab", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "setUpTabline", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showUpSnackError", "msg", "", "Companion", "app_stageDebug"})
public final class EditVenueActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityRegisterVenueBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.droid.dorpee.ui.venue.viewmodel.VenueViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> venueTypes;
    @org.jetbrains.annotations.Nullable()
    private static com.droid.dorpee.ui.venue.venueresponse.Data venueData;
    public static final com.droid.dorpee.ui.venue.EditVenueActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venue.viewmodel.VenueViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venue.viewmodel.VenueViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpTabLineHere(java.util.ArrayList<java.lang.Boolean> listOfTab) {
    }
    
    public final void setUpTabline(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Boolean> listOfTab) {
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
    
    private final void attachObserver() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void showUpSnackError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getVenueTypes() {
        return null;
    }
    
    public final void setVenueTypes(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public EditVenueActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/droid/dorpee/ui/venue/EditVenueActivity$Companion;", "", "()V", "venueData", "Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "getVenueData", "()Lcom/droid/dorpee/ui/venue/venueresponse/Data;", "setVenueData", "(Lcom/droid/dorpee/ui/venue/venueresponse/Data;)V", "app_stageDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.ui.venue.venueresponse.Data getVenueData() {
            return null;
        }
        
        public final void setVenueData(@org.jetbrains.annotations.Nullable()
        com.droid.dorpee.ui.venue.venueresponse.Data p0) {
        }
        
        private Companion() {
            super();
        }
    }
}