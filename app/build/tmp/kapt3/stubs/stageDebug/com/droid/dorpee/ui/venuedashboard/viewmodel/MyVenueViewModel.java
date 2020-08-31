package com.droid.dorpee.ui.venuedashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(J\u0016\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\'\u001a\u00020(J\u0016\u0010-\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010.\u001a\u00020(J\u0016\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\'\u001a\u00020(J\u000e\u00100\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b \u0010\t\u00a8\u00061"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/viewmodel/MyVenueViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiAllVenuesResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/venuedashboard/model/AllVenuesResponse;", "getApiAllVenuesResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiAllVenuesResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiBookingChangeStatus", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBookingX;", "getApiBookingChangeStatus", "setApiBookingChangeStatus", "apiDeleteResponse", "Lcom/droid/dorpee/ui/DeleteResponse;", "getApiDeleteResponse", "setApiDeleteResponse", "apiError", "", "getApiError", "setApiError", "apiResponse", "Lokhttp3/ResponseBody;", "getApiResponse", "setApiResponse", "apiSingleVenueResponse", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "getApiSingleVenueResponse", "setApiSingleVenueResponse", "isLoading", "", "setLoading", "changeVenueStatus", "", "auth", "Lcom/droid/dorpee/ui/RequestWithHeader;", "request", "Lcom/droid/dorpee/ui/ChangeVenueStatusRequest;", "venueId", "", "checkIn", "checkInReq", "Lcom/droid/dorpee/ui/CheckInRequest;", "deleteVenue", "deleteWorkspace", "spaceId", "getSingleVenues", "getVenues", "app_stageDebug"})
public final class MyVenueViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse> apiAllVenuesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> apiSingleVenueResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingX> apiBookingChangeStatus;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.DeleteResponse> apiDeleteResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> apiResponse;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiError() {
        return null;
    }
    
    public final void setApiError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse> getApiAllVenuesResponse() {
        return null;
    }
    
    public final void setApiAllVenuesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> getApiSingleVenueResponse() {
        return null;
    }
    
    public final void setApiSingleVenueResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingX> getApiBookingChangeStatus() {
        return null;
    }
    
    public final void setApiBookingChangeStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingX> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.DeleteResponse> getApiDeleteResponse() {
        return null;
    }
    
    public final void setApiDeleteResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.DeleteResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> getApiResponse() {
        return null;
    }
    
    public final void setApiResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> p0) {
    }
    
    public final void getVenues(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void getSingleVenues(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int venueId) {
    }
    
    public final void deleteWorkspace(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int spaceId) {
    }
    
    public final void deleteVenue(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int venueId) {
    }
    
    public final void changeVenueStatus(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.ChangeVenueStatusRequest request, int venueId) {
    }
    
    public final void checkIn(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.CheckInRequest checkInReq) {
    }
    
    public MyVenueViewModel() {
        super();
    }
}