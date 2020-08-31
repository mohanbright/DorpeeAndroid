package com.droid.dorpee.ui.search.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J(\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020-H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/droid/dorpee/ui/search/map/MapsActivity;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroid/view/View$OnClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "TAG", "", "binding", "Lcom/droid/dorpee/databinding/ActivityMapsSearchBinding;", "data", "Lcom/droid/dorpee/ui/search/model/SearchResponse;", "lastMarker", "Lcom/google/android/gms/maps/model/Marker;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "viewModel", "Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/search/ui/search/SearchViewModel;)V", "bindData", "", "initListeners", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInfoWindowClick", "p0", "onMapReady", "googleMap", "onMarkerClick", "", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showVenue", "creditPerHour", "", "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "Lcom/droid/dorpee/ui/search/model/Data;", "Companion", "app_stageDebug"})
public final class MapsActivity extends com.droid.dorpee.ui.baseClasses.BaseActivity implements com.google.android.gms.maps.OnMapReadyCallback, android.view.View.OnClickListener, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.google.android.gms.maps.model.Marker lastMarker;
    private final java.lang.String TAG = "MapsActivity";
    private com.droid.dorpee.ui.search.model.SearchResponse data;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.droid.dorpee.databinding.ActivityMapsSearchBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.ui.search.SearchViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private static com.droid.dorpee.ui.search.model.Data infoData;
    public static final com.droid.dorpee.ui.search.map.MapsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.ui.search.SearchViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.ui.search.SearchViewModel p0) {
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
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onInfoWindowClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    private final void showVenue(int creditPerHour, com.google.android.gms.maps.GoogleMap mMap, com.google.android.gms.maps.model.MarkerOptions markerOptions, com.droid.dorpee.ui.search.model.Data data) {
    }
    
    public MapsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/droid/dorpee/ui/search/map/MapsActivity$Companion;", "", "()V", "infoData", "Lcom/droid/dorpee/ui/search/model/Data;", "getInfoData", "()Lcom/droid/dorpee/ui/search/model/Data;", "setInfoData", "(Lcom/droid/dorpee/ui/search/model/Data;)V", "app_stageDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.ui.search.model.Data getInfoData() {
            return null;
        }
        
        public final void setInfoData(@org.jetbrains.annotations.Nullable()
        com.droid.dorpee.ui.search.model.Data p0) {
        }
        
        private Companion() {
            super();
        }
    }
}