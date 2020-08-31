package com.droid.dorpee.ui.search.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/droid/dorpee/ui/search/map/CustomInfoWindow;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/droid/dorpee/databinding/MarkerInfoWindowBinding;", "getBinding", "()Lcom/droid/dorpee/databinding/MarkerInfoWindowBinding;", "setBinding", "(Lcom/droid/dorpee/databinding/MarkerInfoWindowBinding;)V", "getContext", "()Landroid/content/Context;", "iconHeight", "", "iconWidth", "inflater", "Landroid/view/LayoutInflater;", "lastMarker", "Lcom/google/android/gms/maps/model/Marker;", "popup", "Landroid/view/View;", "getInfoContents", "marker", "getInfoWindow", "MarkerCallback", "app_stageDebug"})
public final class CustomInfoWindow implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter {
    private android.view.LayoutInflater inflater;
    @org.jetbrains.annotations.NotNull()
    public com.droid.dorpee.databinding.MarkerInfoWindowBinding binding;
    private android.view.View popup;
    private com.google.android.gms.maps.model.Marker lastMarker;
    private int iconWidth = -1;
    private int iconHeight = -1;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.databinding.MarkerInfoWindowBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.databinding.MarkerInfoWindowBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getInfoWindow(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getInfoContents(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker marker) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public CustomInfoWindow(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/droid/dorpee/ui/search/map/CustomInfoWindow$MarkerCallback;", "Lcom/squareup/picasso/Callback;", "marker", "Lcom/google/android/gms/maps/model/Marker;", "context", "Landroid/content/Context;", "(Lcom/google/android/gms/maps/model/Marker;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "onError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "app_stageDebug"})
    public static final class MarkerCallback implements com.squareup.picasso.Callback {
        @org.jetbrains.annotations.Nullable()
        private com.google.android.gms.maps.model.Marker marker;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.gms.maps.model.Marker getMarker() {
            return null;
        }
        
        public final void setMarker(@org.jetbrains.annotations.Nullable()
        com.google.android.gms.maps.model.Marker p0) {
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.Nullable()
        java.lang.Exception e) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public MarkerCallback(@org.jetbrains.annotations.Nullable()
        com.google.android.gms.maps.model.Marker marker, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}