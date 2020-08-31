package com.droid.dorpee.ui.booking.frags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 m2\u00020\u0001:\u0001mB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010M\u001a\u00020NH\u0015J\b\u0010O\u001a\u00020NH\u0014J&\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010X\u001a\u00020NH\u0016J\u0010\u0010Y\u001a\u00020N2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u001f\u0010Z\u001a\u00020N2\b\u0010[\u001a\u0004\u0018\u00010\u001e2\b\u0010\\\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010]J\u001f\u0010^\u001a\u00020N2\b\u0010[\u001a\u0004\u0018\u00010\u001e2\b\u0010\\\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010]J$\u0010_\u001a\u00020N2\u0006\u0010`\u001a\u00020\u001e2\u0006\u0010a\u001a\u00020\u00042\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cJ\u0006\u0010e\u001a\u00020NJ\n\u0010f\u001a\u0004\u0018\u00010gH\u0016J\u0006\u0010h\u001a\u00020NJ\u0006\u0010i\u001a\u00020NJ\u0012\u0010j\u001a\u0004\u0018\u00010k2\b\u0010\u0011\u001a\u0004\u0018\u00010lR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\b\u00a8\u0006n"}, d2 = {"Lcom/droid/dorpee/ui/booking/frags/BookingStep1Fragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "availability", "", "getAvailability", "()Ljava/lang/String;", "setAvailability", "(Ljava/lang/String;)V", "binding", "Lcom/droid/dorpee/databinding/FragmentBookingStep1Binding;", "bookingId", "getBookingId", "setBookingId", "closingTime", "getClosingTime", "setClosingTime", "date", "isFromRebook", "", "()Ljava/lang/Boolean;", "setFromRebook", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isFromUpcomming", "setFromUpcomming", "maxHour", "getMaxHour", "setMaxHour", "max_available", "", "getMax_available", "()I", "setMax_available", "(I)V", "minHour", "getMinHour", "setMinHour", "numberPeople", "getNumberPeople", "setNumberPeople", "numberWorkspace", "getNumberWorkspace", "setNumberWorkspace", "openingTime", "getOpeningTime", "setOpeningTime", "positionSelected", "getPositionSelected", "setPositionSelected", "scondition", "getScondition", "setScondition", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setSpace", "(Lcom/droid/dorpee/ui/venuedashboard/model/Space;)V", "spinVenue", "getSpinVenue", "setSpinVenue", "validata", "Lcom/droid/dorpee/ui/search/model/BookingValidation;", "getValidata", "()Lcom/droid/dorpee/ui/search/model/BookingValidation;", "setValidata", "(Lcom/droid/dorpee/ui/search/model/BookingValidation;)V", "viewModel", "Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;)V", "workspace_msg", "getWorkspace_msg", "setWorkspace_msg", "bindData", "", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setAvailable", "setButtonAvailability", "enterValue", "capacity", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setButtonAvailabilityCapacity", "setEmpData", "position", "text", "employeeList", "", "Lcom/droid/dorpee/ui/booking/model/EmployeeList;", "setEmployeeList", "setUpVM", "Landroidx/lifecycle/ViewModel;", "setWorkspaceAvailability", "setvalidTime", "toCalendar", "Ljava/util/Calendar;", "Ljava/util/Date;", "Companion", "app_liveDebug"})
public final class BookingStep1Fragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentBookingStep1Binding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel viewModel;
    private java.lang.String date = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String openingTime = "9:00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String closingTime = "9:00";
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.model.Space space;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scondition;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String spinVenue;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.model.BookingValidation validata;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String availability = "false";
    private int max_available = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String workspace_msg = "";
    private int positionSelected = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String minHour;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String maxHour;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isFromRebook = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isFromUpcomming = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String numberWorkspace = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String numberPeople = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bookingId = "0";
    public static final com.droid.dorpee.ui.booking.frags.BookingStep1Fragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpeningTime() {
        return null;
    }
    
    public final void setOpeningTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClosingTime() {
        return null;
    }
    
    public final void setClosingTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.Space getSpace() {
        return null;
    }
    
    public final void setSpace(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.Space p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScondition() {
        return null;
    }
    
    public final void setScondition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpinVenue() {
        return null;
    }
    
    public final void setSpinVenue(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.model.BookingValidation getValidata() {
        return null;
    }
    
    public final void setValidata(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.model.BookingValidation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvailability() {
        return null;
    }
    
    public final void setAvailability(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMax_available() {
        return 0;
    }
    
    public final void setMax_available(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWorkspace_msg() {
        return null;
    }
    
    public final void setWorkspace_msg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPositionSelected() {
        return 0;
    }
    
    public final void setPositionSelected(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinHour() {
        return null;
    }
    
    public final void setMinHour(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaxHour() {
        return null;
    }
    
    public final void setMaxHour(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFromRebook() {
        return null;
    }
    
    public final void setFromRebook(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFromUpcomming() {
        return null;
    }
    
    public final void setFromUpcomming(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberWorkspace() {
        return null;
    }
    
    public final void setNumberWorkspace(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberPeople() {
        return null;
    }
    
    public final void setNumberPeople(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBookingId() {
        return null;
    }
    
    public final void setBookingId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar toCalendar(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void setWorkspaceAvailability() {
    }
    
    public final void setButtonAvailability(@org.jetbrains.annotations.Nullable()
    java.lang.Integer enterValue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer capacity) {
    }
    
    public final void setEmpData(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.model.EmployeeList> employeeList) {
    }
    
    public final void setButtonAvailabilityCapacity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer enterValue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer capacity) {
    }
    
    public final void setEmployeeList() {
    }
    
    public final void setvalidTime() {
    }
    
    public final void setAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.String availability) {
    }
    
    public BookingStep1Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lcom/droid/dorpee/ui/booking/frags/BookingStep1Fragment$Companion;", "", "()V", "newInstance", "Lcom/droid/dorpee/ui/booking/frags/BookingStep1Fragment;", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "scondition", "", "isFromRebook", "", "isFromupcomming", "numberPeople", "numberWorkspace", "bookingId", "app_liveDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.ui.booking.frags.BookingStep1Fragment newInstance(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.ui.venuedashboard.model.Space space, @org.jetbrains.annotations.NotNull()
        java.lang.String scondition, boolean isFromRebook, boolean isFromupcomming, @org.jetbrains.annotations.NotNull()
        java.lang.String numberPeople, @org.jetbrains.annotations.NotNull()
        java.lang.String numberWorkspace, @org.jetbrains.annotations.NotNull()
        java.lang.String bookingId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}