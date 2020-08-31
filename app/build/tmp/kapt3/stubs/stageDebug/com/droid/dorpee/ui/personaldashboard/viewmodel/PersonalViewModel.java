package com.droid.dorpee.ui.personaldashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000209J\u0016\u0010:\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010;\u001a\u000205J\u0016\u0010<\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u0002012\u0006\u00102\u001a\u000203J\u0006\u0010@\u001a\u000201J&\u0010A\u001a\u0002012\u0006\u0010B\u001a\u0002032\u0006\u0010A\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u0002012\u0006\u00102\u001a\u000203R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR \u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0007\"\u0004\b(\u0010\tR \u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR \u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b/\u0010\t\u00a8\u0006I"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PersonalViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiBookingChangeStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBookingX;", "getApiBookingChangeStatus", "()Landroidx/lifecycle/MutableLiveData;", "setApiBookingChangeStatus", "(Landroidx/lifecycle/MutableLiveData;)V", "apiBookingsResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBookingsList;", "getApiBookingsResponse", "setApiBookingsResponse", "apiCreditPriceResponse", "Lcom/droid/dorpee/ui/auth/model/PlanModel;", "getApiCreditPriceResponse", "setApiCreditPriceResponse", "apiDelSearchReference", "Lcom/droid/dorpee/ui/personaldashboard/models/PreferencesResponse;", "getApiDelSearchReference", "setApiDelSearchReference", "apiError", "", "getApiError", "setApiError", "apiPlansResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/PlansList;", "getApiPlansResponse", "setApiPlansResponse", "apiResponse", "Lokhttp3/ResponseBody;", "getApiResponse", "setApiResponse", "apiSearchReference", "getApiSearchReference", "setApiSearchReference", "apiServicesResponse", "Lcom/droid/dorpee/ui/venue/model/ServicesResponse;", "getApiServicesResponse", "setApiServicesResponse", "apiVenueResponse", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "getApiVenueResponse", "setApiVenueResponse", "isLoading", "", "setLoading", "cancelBooking", "", "auth", "Lcom/droid/dorpee/ui/RequestWithHeader;", "bookingId", "", "request", "Lcom/droid/dorpee/ui/CancelRequest;", "changeStatus", "Lcom/droid/dorpee/ui/ChangeStatusRequest;", "deleteSearchPreference", "id", "extendBooking", "extendReq", "Lcom/droid/dorpee/ui/ExtendRequest;", "getBookings", "getPlans", "purchaseCredit", "header", "Lcom/droid/dorpee/ui/purchaseCreditRequest;", "context", "Landroid/content/Context;", "activity", "Lcom/droid/dorpee/ui/personaldashboard/personalItem/TopUpActivity;", "searchPreference", "app_stageDebug"})
public final class PersonalViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.ServicesResponse> apiServicesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList> apiBookingsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingX> apiBookingChangeStatus;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> apiResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> apiVenueResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PlansList> apiPlansResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> apiDelSearchReference;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> apiSearchReference;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> apiCreditPriceResponse;
    
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList> getApiBookingsResponse() {
        return null;
    }
    
    public final void setApiBookingsResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingX> getApiBookingChangeStatus() {
        return null;
    }
    
    public final void setApiBookingChangeStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingX> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> getApiResponse() {
        return null;
    }
    
    public final void setApiResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.venueresponse.VenueResponse> getApiVenueResponse() {
        return null;
    }
    
    public final void setApiVenueResponse(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PlansList> getApiPlansResponse() {
        return null;
    }
    
    public final void setApiPlansResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PlansList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> getApiDelSearchReference() {
        return null;
    }
    
    public final void setApiDelSearchReference(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> getApiSearchReference() {
        return null;
    }
    
    public final void setApiSearchReference(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> getApiCreditPriceResponse() {
        return null;
    }
    
    public final void setApiCreditPriceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> p0) {
    }
    
    public final void searchPreference(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void getBookings(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void cancelBooking(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int bookingId, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.CancelRequest request) {
    }
    
    public final void changeStatus(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.ChangeStatusRequest request) {
    }
    
    public final void extendBooking(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.ExtendRequest extendReq) {
    }
    
    public final void getPlans() {
    }
    
    public final void deleteSearchPreference(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int id) {
    }
    
    public final void purchaseCredit(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.purchaseCreditRequest purchaseCredit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.personalItem.TopUpActivity activity) {
    }
    
    public PersonalViewModel() {
        super();
    }
}