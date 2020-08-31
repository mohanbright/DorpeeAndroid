package com.droid.dorpee.ui.search.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000206J\u0006\u0010;\u001a\u000206J\u0006\u0010<\u001a\u000206J\u0006\u0010=\u001a\u000206J\u0006\u0010>\u001a\u000206J\u0006\u0010?\u001a\u000206J\u000e\u0010@\u001a\u0002062\u0006\u00107\u001a\u00020\u000fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR \u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u0011\u0010.\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R \u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b4\u0010\t\u00a8\u0006A"}, d2 = {"Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiAssetsResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/venue/model/AssetsResponse;", "getApiAssetsResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiAssetsResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiEnvironmentResponse", "Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;", "getApiEnvironmentResponse", "setApiEnvironmentResponse", "apiError", "", "getApiError", "setApiError", "apiInterestResponse", "Lcom/droid/dorpee/ui/auth/model/InterestResponse;", "getApiInterestResponse", "setApiInterestResponse", "apiServicesResponse", "Lcom/droid/dorpee/ui/venue/model/ServicesResponse;", "getApiServicesResponse", "setApiServicesResponse", "apiTypesResponse", "Lcom/droid/dorpee/ui/venue/model/TypesResponse;", "getApiTypesResponse", "setApiTypesResponse", "apiVeneueTypes", "Lcom/droid/dorpee/ui/venue/model/VenueTypeResponse;", "getApiVeneueTypes", "setApiVeneueTypes", "apiVenueAvailibiltyResponse", "Lcom/droid/dorpee/ui/venue/model/VenueAvailibiltyResponse;", "getApiVenueAvailibiltyResponse", "setApiVenueAvailibiltyResponse", "apiVenueResponse", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "getApiVenueResponse", "setApiVenueResponse", "apiWorkspaceResponse", "Lcom/droid/dorpee/ui/venue/model/WorkspaceResponse;", "getApiWorkspaceResponse", "setApiWorkspaceResponse", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "isLoading", "", "setLoading", "addvenueAvailabilty", "", "token", "req", "Lcom/droid/dorpee/ui/VenueAvailityReq;", "getAssets", "getEnvironment", "getInterests", "getServices", "getTypes", "getVenueTypes", "getWorkSpaces", "app_liveDebug"})
public final class DashboardViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.ServicesResponse> apiServicesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.TypesResponse> apiTypesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.InterestResponse> apiInterestResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueTypeResponse> apiVeneueTypes;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> apiEnvironmentResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.AssetsResponse> apiAssetsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> apiVenueResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> apiWorkspaceResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> apiVenueAvailibiltyResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiError() {
        return null;
    }
    
    public final void setApiError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.ServicesResponse> getApiServicesResponse() {
        return null;
    }
    
    public final void setApiServicesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.ServicesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.TypesResponse> getApiTypesResponse() {
        return null;
    }
    
    public final void setApiTypesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.TypesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.InterestResponse> getApiInterestResponse() {
        return null;
    }
    
    public final void setApiInterestResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.InterestResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueTypeResponse> getApiVeneueTypes() {
        return null;
    }
    
    public final void setApiVeneueTypes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueTypeResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> getApiEnvironmentResponse() {
        return null;
    }
    
    public final void setApiEnvironmentResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.AssetsResponse> getApiAssetsResponse() {
        return null;
    }
    
    public final void setApiAssetsResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.AssetsResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> getApiVenueResponse() {
        return null;
    }
    
    public final void setApiVenueResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> getApiWorkspaceResponse() {
        return null;
    }
    
    public final void setApiWorkspaceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> getApiVenueAvailibiltyResponse() {
        return null;
    }
    
    public final void setApiVenueAvailibiltyResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineExceptionHandler getHandler() {
        return null;
    }
    
    public final void getServices() {
    }
    
    public final void getTypes() {
    }
    
    public final void getInterests() {
    }
    
    public final void getVenueTypes() {
    }
    
    public final void getEnvironment() {
    }
    
    public final void getAssets() {
    }
    
    public final void addvenueAvailabilty(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.VenueAvailityReq req) {
    }
    
    public final void getWorkSpaces(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public DashboardViewModel() {
        super();
    }
}