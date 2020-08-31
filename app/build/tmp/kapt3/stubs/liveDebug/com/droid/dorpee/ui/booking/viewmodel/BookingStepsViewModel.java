package com.droid.dorpee.ui.booking.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J.\u00106\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u0002072\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u0016\u00108\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u00109\u001a\u00020:J6\u0010;\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020<2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010=\u001a\u00020\u001cJ6\u0010>\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020?2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010=\u001a\u00020\u001cJ\u000e\u0010@\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u001e\u0010A\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u00100\u001a\u0002012\u0006\u00104\u001a\u00020BJ\u0006\u0010C\u001a\u00020+J\"\u0010D\u001a\u00020+2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020BR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR \u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR \u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0007\"\u0004\b)\u0010\t\u00a8\u0006I"}, d2 = {"Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiBookingValidate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/search/model/DataModel;", "getApiBookingValidate", "()Landroidx/lifecycle/MutableLiveData;", "setApiBookingValidate", "(Landroidx/lifecycle/MutableLiveData;)V", "apiContactsResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContactsList;", "getApiContactsResponse", "setApiContactsResponse", "apiCreateContactResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContact;", "getApiCreateContactResponse", "setApiCreateContactResponse", "apiDeleteResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDResponse;", "getApiDeleteResponse", "setApiDeleteResponse", "apiEmployeeList", "", "Lcom/droid/dorpee/ui/booking/model/EmployeeList;", "getApiEmployeeList", "setApiEmployeeList", "apiError", "", "getApiError", "setApiError", "apiServicesResponse", "Lcom/droid/dorpee/ui/venue/model/ServicesResponse;", "getApiServicesResponse", "setApiServicesResponse", "apiWorkspaceResponse", "Lcom/droid/dorpee/ui/venue/model/WorkspaceResponse;", "getApiWorkspaceResponse", "setApiWorkspaceResponse", "isLoading", "", "setLoading", "createBookingEmployee", "", "header", "Lcom/droid/dorpee/ui/RequestWithHeader;", "purchaseCredit", "Lcom/droid/dorpee/ui/createBookingEmployeeRequest;", "context", "Landroid/content/Context;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Lcom/droid/dorpee/ui/booking/frags/BookingStep3Fragment;", "createBookingPersonal", "Lcom/droid/dorpee/ui/createBookingPersonalRequest;", "deleteContact", "id", "", "editBookingEmployee", "Lcom/droid/dorpee/ui/editBookingEmployeeRequest;", "bookingId", "editBookingpersonal", "Lcom/droid/dorpee/ui/editBookingPersonalRequest;", "getContacts", "getEmployeeList", "Lcom/droid/dorpee/ui/booking/frags/BookingStep1Fragment;", "getServices", "validateBooking", "mapList", "", "Lokhttp3/RequestBody;", "bookingStep1Fragment", "app_liveDebug"})
public final class BookingStepsViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.ServicesResponse> apiServicesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> apiWorkspaceResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.search.model.DataModel> apiBookingValidate;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContact> apiCreateContactResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContactsList> apiContactsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> apiDeleteResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.droid.dorpee.ui.booking.model.EmployeeList>> apiEmployeeList;
    
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> getApiWorkspaceResponse() {
        return null;
    }
    
    public final void setApiWorkspaceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.search.model.DataModel> getApiBookingValidate() {
        return null;
    }
    
    public final void setApiBookingValidate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.search.model.DataModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContact> getApiCreateContactResponse() {
        return null;
    }
    
    public final void setApiCreateContactResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContact> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContactsList> getApiContactsResponse() {
        return null;
    }
    
    public final void setApiContactsResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContactsList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> getApiDeleteResponse() {
        return null;
    }
    
    public final void setApiDeleteResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.droid.dorpee.ui.booking.model.EmployeeList>> getApiEmployeeList() {
        return null;
    }
    
    public final void setApiEmployeeList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.droid.dorpee.ui.booking.model.EmployeeList>> p0) {
    }
    
    public final void getServices() {
    }
    
    public final void validateBooking(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends okhttp3.RequestBody> mapList, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.frags.BookingStep1Fragment bookingStep1Fragment) {
    }
    
    public final void getContacts(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header) {
    }
    
    public final void deleteContact(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, int id) {
    }
    
    public final void createBookingEmployee(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.createBookingEmployeeRequest purchaseCredit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.frags.BookingStep3Fragment fragment) {
    }
    
    public final void createBookingPersonal(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.createBookingPersonalRequest purchaseCredit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.frags.BookingStep3Fragment fragment) {
    }
    
    public final void getEmployeeList(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.frags.BookingStep1Fragment fragment) {
    }
    
    public final void editBookingpersonal(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.editBookingPersonalRequest purchaseCredit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.frags.BookingStep3Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String bookingId) {
    }
    
    public final void editBookingEmployee(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.editBookingEmployeeRequest purchaseCredit, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.frags.BookingStep3Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String bookingId) {
    }
    
    public BookingStepsViewModel() {
        super();
    }
}