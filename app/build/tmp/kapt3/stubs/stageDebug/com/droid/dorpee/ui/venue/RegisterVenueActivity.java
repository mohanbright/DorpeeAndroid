package com.droid.dorpee.ui.venue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\u0010\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-J$\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\n\b\u0001\u00102\u001a\u0004\u0018\u000103H\u0014J\u0012\u00104\u001a\u00020\u001a2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\b\u0010:\u001a\u00020\u001aH\u0014J \u0010;\u001a\u00020\u001a2\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?H\u0002J\u001e\u0010@\u001a\u00020\u001a2\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?J\n\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u000e\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\t\u00a8\u0006F"}, d2 = {"Lcom/droid/dorpee/ui/venue/RegisterVenueActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "address1", "", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "address2", "getAddress2", "setAddress2", "binding", "Lcom/droid/dorpee/databinding/ActivityRegisterVenueBinding;", "city", "getCity", "setCity", "country", "getCountry", "setCountry", "state", "getState", "setState", "venueTypes", "Lkotlin/Function0;", "", "getVenueTypes", "()Lkotlin/jvm/functions/Function0;", "setVenueTypes", "(Lkotlin/jvm/functions/Function0;)V", "viewModel", "Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;)V", "zipcode", "getZipcode", "setZipcode", "attachObserver", "bindData", "initListeners", "loadFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setUpTabLineHere", "listOfTab", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "setUpTabline", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showUpSnackError", "msg", "Companion", "app_stageDebug"})
public final class RegisterVenueActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityRegisterVenueBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.droid.dorpee.ui.venue.viewmodel.VenueViewModel viewModel;
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
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> venueTypes;
    @org.jetbrains.annotations.Nullable()
    private static com.droid.dorpee.ui.venue.PlaceAddress placesAddress;
    private static final int IMAGE_REQUEST_CODE = 12311;
    @org.jetbrains.annotations.Nullable()
    private static java.util.ArrayList<java.lang.String> mResults;
    @org.jetbrains.annotations.Nullable()
    private static java.util.ArrayList<com.droid.dorpee.ui.venue.model.Data> listOfAmenitie;
    @org.jetbrains.annotations.Nullable()
    private static com.droid.dorpee.ui.venue.venueresponse.VenueResponse venueRes;
    @org.jetbrains.annotations.Nullable()
    private static com.droid.dorpee.ui.venue.RequestVenue request;
    @org.jetbrains.annotations.Nullable()
    private static com.droid.dorpee.ui.VenueAvailityReq availityReq;
    private static final int AUTOCOMPLETE_REQUEST_CODE = 3223;
    public static final com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venue.viewmodel.VenueViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venue.viewmodel.VenueViewModel p0) {
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
    
    public RegisterVenueActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006-"}, d2 = {"Lcom/droid/dorpee/ui/venue/RegisterVenueActivity$Companion;", "", "()V", "AUTOCOMPLETE_REQUEST_CODE", "", "getAUTOCOMPLETE_REQUEST_CODE", "()I", "IMAGE_REQUEST_CODE", "getIMAGE_REQUEST_CODE", "availityReq", "Lcom/droid/dorpee/ui/VenueAvailityReq;", "getAvailityReq", "()Lcom/droid/dorpee/ui/VenueAvailityReq;", "setAvailityReq", "(Lcom/droid/dorpee/ui/VenueAvailityReq;)V", "listOfAmenitie", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venue/model/Data;", "Lkotlin/collections/ArrayList;", "getListOfAmenitie", "()Ljava/util/ArrayList;", "setListOfAmenitie", "(Ljava/util/ArrayList;)V", "mResults", "", "getMResults", "setMResults", "placesAddress", "Lcom/droid/dorpee/ui/venue/PlaceAddress;", "getPlacesAddress", "()Lcom/droid/dorpee/ui/venue/PlaceAddress;", "setPlacesAddress", "(Lcom/droid/dorpee/ui/venue/PlaceAddress;)V", "request", "Lcom/droid/dorpee/ui/venue/RequestVenue;", "getRequest", "()Lcom/droid/dorpee/ui/venue/RequestVenue;", "setRequest", "(Lcom/droid/dorpee/ui/venue/RequestVenue;)V", "venueRes", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "getVenueRes", "()Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "setVenueRes", "(Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;)V", "app_stageDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.ui.venue.PlaceAddress getPlacesAddress() {
            return null;
        }
        
        public final void setPlacesAddress(@org.jetbrains.annotations.Nullable()
        com.droid.dorpee.ui.venue.PlaceAddress p0) {
        }
        
        public final int getIMAGE_REQUEST_CODE() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.String> getMResults() {
            return null;
        }
        
        public final void setMResults(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<com.droid.dorpee.ui.venue.model.Data> getListOfAmenitie() {
            return null;
        }
        
        public final void setListOfAmenitie(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.droid.dorpee.ui.venue.model.Data> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.ui.venue.venueresponse.VenueResponse getVenueRes() {
            return null;
        }
        
        public final void setVenueRes(@org.jetbrains.annotations.Nullable()
        com.droid.dorpee.ui.venue.venueresponse.VenueResponse p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.ui.venue.RequestVenue getRequest() {
            return null;
        }
        
        public final void setRequest(@org.jetbrains.annotations.Nullable()
        com.droid.dorpee.ui.venue.RequestVenue p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.ui.VenueAvailityReq getAvailityReq() {
            return null;
        }
        
        public final void setAvailityReq(@org.jetbrains.annotations.Nullable()
        com.droid.dorpee.ui.VenueAvailityReq p0) {
        }
        
        public final int getAUTOCOMPLETE_REQUEST_CODE() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}