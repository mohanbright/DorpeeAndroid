package com.droid.dorpee.ui.venue.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020:J\u0006\u0010?\u001a\u00020:J\u0006\u0010@\u001a\u00020:J\u0016\u0010A\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00132\u0006\u0010B\u001a\u00020CJ\u000e\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020CJ\u0006\u0010F\u001a\u00020:J\u0006\u0010G\u001a\u00020:J\u000e\u0010H\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0013J2\u0010I\u001a\u00020:2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020L0K2\u0006\u0010;\u001a\u00020\u00132\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010NJ:\u0010P\u001a\u00020:2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020L0K2\u0006\u0010;\u001a\u00020\u00132\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N2\u0006\u0010E\u001a\u00020CJ2\u0010Q\u001a\u00020:2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020L0K2\u0006\u0010;\u001a\u00020\u00132\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010NJ:\u0010R\u001a\u00020:2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020L0K2\u0006\u0010;\u001a\u00020\u00132\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N2\u0006\u0010B\u001a\u00020CR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR \u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR \u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR \u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR \u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b8\u0010\t\u00a8\u0006S"}, d2 = {"Lcom/droid/dorpee/ui/venue/viewmodel/VenueViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiAssetsResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/venue/model/AssetsResponse;", "getApiAssetsResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiAssetsResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiEditSpaceRespnce", "Lcom/droid/dorpee/ui/venue/model/EditSpaceRespnce;", "getApiEditSpaceRespnce", "setApiEditSpaceRespnce", "apiEnvironmentResponse", "Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;", "getApiEnvironmentResponse", "setApiEnvironmentResponse", "apiError", "", "getApiError", "setApiError", "apiServicesResponse", "Lcom/droid/dorpee/ui/venue/model/ServicesResponse;", "getApiServicesResponse", "setApiServicesResponse", "apiSingleSpaceRespnce", "Lcom/droid/dorpee/ui/venue/model/SingleSpaceRespnce;", "getApiSingleSpaceRespnce", "setApiSingleSpaceRespnce", "apiSuggestedPriceResponse", "Lcom/droid/dorpee/ui/venue/model/SuggestedPriceResponse;", "getApiSuggestedPriceResponse", "setApiSuggestedPriceResponse", "apiTypesResponse", "Lcom/droid/dorpee/ui/venue/model/TypesResponse;", "getApiTypesResponse", "setApiTypesResponse", "apiVeneueTypes", "Lcom/droid/dorpee/ui/venue/model/VenueTypeResponse;", "getApiVeneueTypes", "setApiVeneueTypes", "apiVenueAvailibiltyResponse", "Lcom/droid/dorpee/ui/venue/model/VenueAvailibiltyResponse;", "getApiVenueAvailibiltyResponse", "setApiVenueAvailibiltyResponse", "apiVenueResponse", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "getApiVenueResponse", "setApiVenueResponse", "apiWorkspaceResponse", "Lcom/droid/dorpee/ui/venue/model/WorkspaceResponse;", "getApiWorkspaceResponse", "setApiWorkspaceResponse", "isLoading", "", "setLoading", "addvenueAvailabilty", "", "token", "req", "Lcom/droid/dorpee/ui/VenueAvailityReq;", "getAssets", "getEnvironment", "getServices", "getSingleSpace", "spaceId", "", "getSuggestedPrice", "venueId", "getTypes", "getVenueTypes", "getWorkSpaces", "venueCreate", "mapList", "", "Lokhttp3/RequestBody;", "addImagesList", "", "Lokhttp3/MultipartBody$Part;", "venueUpdate", "workspaceCreate", "workspaceUpdate", "app_stageDebug"})
public final class VenueViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.ServicesResponse> apiServicesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.TypesResponse> apiTypesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> apiEnvironmentResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.AssetsResponse> apiAssetsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> apiVenueResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> apiWorkspaceResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.SingleSpaceRespnce> apiSingleSpaceRespnce;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EditSpaceRespnce> apiEditSpaceRespnce;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> apiVenueAvailibiltyResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueTypeResponse> apiVeneueTypes;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.SuggestedPriceResponse> apiSuggestedPriceResponse;
    
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.SingleSpaceRespnce> getApiSingleSpaceRespnce() {
        return null;
    }
    
    public final void setApiSingleSpaceRespnce(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.SingleSpaceRespnce> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EditSpaceRespnce> getApiEditSpaceRespnce() {
        return null;
    }
    
    public final void setApiEditSpaceRespnce(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EditSpaceRespnce> p0) {
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueTypeResponse> getApiVeneueTypes() {
        return null;
    }
    
    public final void setApiVeneueTypes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueTypeResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.SuggestedPriceResponse> getApiSuggestedPriceResponse() {
        return null;
    }
    
    public final void setApiSuggestedPriceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.SuggestedPriceResponse> p0) {
    }
    
    public final void getServices() {
    }
    
    public final void getTypes() {
    }
    
    public final void getEnvironment() {
    }
    
    public final void getAssets() {
    }
    
    public final void venueCreate(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.List<okhttp3.MultipartBody.Part> addImagesList) {
    }
    
    public final void venueUpdate(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.List<okhttp3.MultipartBody.Part> addImagesList, int venueId) {
    }
    
    public final void workspaceCreate(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.List<okhttp3.MultipartBody.Part> addImagesList) {
    }
    
    public final void workspaceUpdate(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.util.List<okhttp3.MultipartBody.Part> addImagesList, int spaceId) {
    }
    
    public final void addvenueAvailabilty(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.VenueAvailityReq req) {
    }
    
    public final void getWorkSpaces(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void getSingleSpace(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int spaceId) {
    }
    
    public final void getVenueTypes() {
    }
    
    public final void getSuggestedPrice(int venueId) {
    }
    
    public VenueViewModel() {
        super();
    }
}