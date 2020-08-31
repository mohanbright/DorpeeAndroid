package com.droid.dorpee.ui.venuedashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`J\u0016\u0010a\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0006\u0010c\u001a\u00020dJ\u0016\u0010e\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0006\u0010c\u001a\u00020fJ\u0016\u0010g\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0006\u0010h\u001a\u00020iJ\u0016\u0010j\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0006\u0010k\u001a\u00020lJ\u0016\u0010m\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0006\u0010n\u001a\u00020oJ\u000e\u0010p\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\J\u000e\u0010q\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\J\u0016\u0010r\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0006\u0010s\u001a\u00020lJ\u000e\u0010t\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\J\u000e\u0010u\u001a\u00020Z2\u0006\u0010v\u001a\u00020`J\u000e\u0010w\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\J\u000e\u0010x\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\J\u001e\u0010y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}J\u000e\u0010~\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\J \u0010\u007f\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0007\u0010\u0080\u0001\u001a\u00020\u00042\u0007\u0010\u0081\u0001\u001a\u00020lJ\u000f\u0010\u0082\u0001\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\J)\u0010\u0083\u0001\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020`J\u000f\u0010\u0085\u0001\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\J\u0018\u0010\u0086\u0001\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0007\u0010c\u001a\u00030\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020Z2\u0006\u0010b\u001a\u00020\\2\u0007\u0010c\u001a\u00030\u0089\u0001J&\u0010\u008a\u0001\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0015\u0010\u008b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\t\"\u0004\b\'\u0010\u000bR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR \u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR \u00103\u001a\b\u0012\u0004\u0012\u0002040\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u000bR \u00107\u001a\b\u0012\u0004\u0012\u0002080\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR \u0010;\u001a\b\u0012\u0004\u0012\u0002040\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR \u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\t\"\u0004\bA\u0010\u000bR \u0010B\u001a\b\u0012\u0004\u0012\u00020-0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010\u000bR&\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\u000bR \u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010\u000bR \u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\t\"\u0004\bQ\u0010\u000bR \u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\t\"\u0004\bU\u0010\u000bR \u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\t\"\u0004\bX\u0010\u000b\u00a8\u0006\u008e\u0001"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/viewmodel/VenueDashViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "TAG", "", "apiAddCardResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDCards;", "getApiAddCardResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiAddCardResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiAllVenuesResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/AllVenuesResponse;", "getApiAllVenuesResponse", "setApiAllVenuesResponse", "apiBarChartResponse", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/chartmodel/BarChartResponse;", "getApiBarChartResponse", "setApiBarChartResponse", "apiBlockIntResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/BlockInOutResponse;", "getApiBlockIntResponse", "setApiBlockIntResponse", "apiBlockResponse", "Lcom/droid/dorpee/ui/BlockResponse;", "getApiBlockResponse", "setApiBlockResponse", "apiBlockedSpaceResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/BlockedSpaceResponse;", "getApiBlockedSpaceResponse", "setApiBlockedSpaceResponse", "apiBookingChangeStatus", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueBooking;", "getApiBookingChangeStatus", "setApiBookingChangeStatus", "apiBookingsResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBookingsList;", "getApiBookingsResponse", "setApiBookingsResponse", "apiCreditPriceResponse", "Lcom/droid/dorpee/ui/auth/model/PlanModel;", "getApiCreditPriceResponse", "setApiCreditPriceResponse", "apiDelSearchReference", "Lcom/droid/dorpee/ui/personaldashboard/models/PreferencesResponse;", "getApiDelSearchReference", "setApiDelSearchReference", "apiError", "getApiError", "setApiError", "apiPaymentProfileResponse", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/PaymentProfileResponse;", "getApiPaymentProfileResponse", "setApiPaymentProfileResponse", "apiPieChartResponse", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/chartmodel/PieChartResponse;", "getApiPieChartResponse", "setApiPieChartResponse", "apiProfileResponse", "getApiProfileResponse", "setApiProfileResponse", "apiResponse", "Lokhttp3/ResponseBody;", "getApiResponse", "setApiResponse", "apiSearchReference", "getApiSearchReference", "setApiSearchReference", "apiTransactionList", "", "Lcom/droid/dorpee/ui/auth/model/TransactionData;", "getApiTransactionList", "setApiTransactionList", "apiUnBlockResponse", "Lcom/droid/dorpee/ui/UnBlockResponse;", "getApiUnBlockResponse", "setApiUnBlockResponse", "apiVenueDashboardResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueDashboardResponse;", "getApiVenueDashboardResponse", "setApiVenueDashboardResponse", "apiVenueDurationResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueDurationResponse;", "getApiVenueDurationResponse", "setApiVenueDurationResponse", "isLoading", "", "setLoading", "addCard", "", "header", "Lcom/droid/dorpee/ui/RequestWithHeader;", "addCardRequest", "Lcom/droid/dorpee/ui/AddCardRequest;", "creditFragment", "Lcom/droid/dorpee/ui/personaldashboard/fragments/CreditFragment;", "blockAvailability", "auth", "request", "Lcom/droid/dorpee/ui/BlockAvailbilityRequest;", "changeVenueBookingStatus", "Lcom/droid/dorpee/ui/ChangeStatusRequest;", "checkIn", "checkInReq", "Lcom/droid/dorpee/ui/CheckInRequest;", "deleteSearchPreference", "id", "", "extendBooking", "extendReq", "Lcom/droid/dorpee/ui/ExtendRequest;", "getAvailability", "getBarChart", "getBlockedSpace", "space_id", "getBookings", "getCreditPrice", "fragmentActivity", "getPieChart", "getProfile", "getTransactions", "context", "Landroid/content/Context;", "activity", "Lcom/droid/dorpee/ui/personaldashboard/fragments/TransactionFragment;", "getVenueDashboard", "getVenueRevenue", "filter", "venue_id", "getVenues", "purchaseCredit", "Lcom/droid/dorpee/ui/purchaseCreditRequest;", "searchPreference", "unBlockAvailability", "Lcom/droid/dorpee/ui/UnblockRequest;", "updateBlockedSpace", "Lcom/droid/dorpee/ui/venuedashboard/model/DataBlocked;", "updatePaymentDetailsVenue", "mapList", "", "Lokhttp3/RequestBody;", "app_stageDebug"})
public final class VenueDashViewModel extends com.droid.dorpee.utils.BaseViewModel {
    private final java.lang.String TAG = "VenueDashViewModel";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueDashboardResponse> apiVenueDashboardResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList> apiBookingsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse> apiBlockIntResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.BlockResponse> apiBlockResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.UnBlockResponse> apiUnBlockResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> apiBookingChangeStatus;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> apiResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse> apiAllVenuesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueDurationResponse> apiVenueDurationResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.BlockedSpaceResponse> apiBlockedSpaceResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> apiSearchReference;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> apiDelSearchReference;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> apiCreditPriceResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.droid.dorpee.ui.auth.model.TransactionData>> apiTransactionList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.PieChartResponse> apiPieChartResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.BarChartResponse> apiBarChartResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse> apiPaymentProfileResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse> apiProfileResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDCards> apiAddCardResponse;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiError() {
        return null;
    }
    
    public final void setApiError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueDashboardResponse> getApiVenueDashboardResponse() {
        return null;
    }
    
    public final void setApiVenueDashboardResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueDashboardResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList> getApiBookingsResponse() {
        return null;
    }
    
    public final void setApiBookingsResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse> getApiBlockIntResponse() {
        return null;
    }
    
    public final void setApiBlockIntResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.BlockResponse> getApiBlockResponse() {
        return null;
    }
    
    public final void setApiBlockResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.BlockResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.UnBlockResponse> getApiUnBlockResponse() {
        return null;
    }
    
    public final void setApiUnBlockResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.UnBlockResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> getApiBookingChangeStatus() {
        return null;
    }
    
    public final void setApiBookingChangeStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> getApiResponse() {
        return null;
    }
    
    public final void setApiResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<okhttp3.ResponseBody> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse> getApiAllVenuesResponse() {
        return null;
    }
    
    public final void setApiAllVenuesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueDurationResponse> getApiVenueDurationResponse() {
        return null;
    }
    
    public final void setApiVenueDurationResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.VenueDurationResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.BlockedSpaceResponse> getApiBlockedSpaceResponse() {
        return null;
    }
    
    public final void setApiBlockedSpaceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.model.BlockedSpaceResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> getApiSearchReference() {
        return null;
    }
    
    public final void setApiSearchReference(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> getApiDelSearchReference() {
        return null;
    }
    
    public final void setApiDelSearchReference(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> getApiCreditPriceResponse() {
        return null;
    }
    
    public final void setApiCreditPriceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.droid.dorpee.ui.auth.model.TransactionData>> getApiTransactionList() {
        return null;
    }
    
    public final void setApiTransactionList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.droid.dorpee.ui.auth.model.TransactionData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.PieChartResponse> getApiPieChartResponse() {
        return null;
    }
    
    public final void setApiPieChartResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.PieChartResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.BarChartResponse> getApiBarChartResponse() {
        return null;
    }
    
    public final void setApiBarChartResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.BarChartResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse> getApiPaymentProfileResponse() {
        return null;
    }
    
    public final void setApiPaymentProfileResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse> getApiProfileResponse() {
        return null;
    }
    
    public final void setApiProfileResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDCards> getApiAddCardResponse() {
        return null;
    }
    
    public final void setApiAddCardResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDCards> p0) {
    }
    
    public final void getVenueDashboard(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void getBookings(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void blockAvailability(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.BlockAvailbilityRequest request) {
    }
    
    public final void unBlockAvailability(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.UnblockRequest request) {
    }
    
    public final void getAvailability(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void getVenues(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void getVenueRevenue(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    java.lang.String filter, int venue_id) {
    }
    
    public final void getBlockedSpace(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int space_id) {
    }
    
    public final void updateBlockedSpace(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venuedashboard.model.DataBlocked request) {
    }
    
    public final void changeVenueBookingStatus(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.ChangeStatusRequest request) {
    }
    
    public final void extendBooking(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.ExtendRequest extendReq) {
    }
    
    public final void checkIn(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.CheckInRequest checkInReq) {
    }
    
    public final void searchPreference(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth) {
    }
    
    public final void deleteSearchPreference(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int id) {
    }
    
    public final void getCreditPrice(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.fragments.CreditFragment fragmentActivity) {
    }
    
    public final void purchaseCredit(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.purchaseCreditRequest purchaseCredit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.fragments.CreditFragment activity) {
    }
    
    public final void getBarChart(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header) {
    }
    
    public final void getPieChart(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header) {
    }
    
    public final void addCard(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.AddCardRequest addCardRequest, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.fragments.CreditFragment creditFragment) {
    }
    
    public final void getTransactions(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.fragments.TransactionFragment activity) {
    }
    
    public final void updatePaymentDetailsVenue(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList) {
    }
    
    public final void getProfile(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header) {
    }
    
    public VenueDashViewModel() {
        super();
    }
}