package com.droid.dorpee.ui.booking.frags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 X2\u00020\u0001:\u0001XB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010>\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010\u0004J\b\u0010@\u001a\u00020AH\u0014J\u0006\u0010B\u001a\u00020AJ\b\u0010C\u001a\u00020AH\u0014J\"\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010HH\u0017J&\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020AH\u0016J\u0006\u0010R\u001a\u00020AJ\u0006\u0010S\u001a\u00020AJ\b\u0010T\u001a\u00020AH\u0007J\n\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020AH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010#\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%R\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0012\u0010=\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%\u00a8\u0006Y"}, d2 = {"Lcom/droid/dorpee/ui/booking/frags/BookingStep3Fragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "AselectedDate", "", "getAselectedDate", "()Ljava/lang/String;", "setAselectedDate", "(Ljava/lang/String;)V", "actualHours", "", "getActualHours", "()I", "setActualHours", "(I)V", "binding", "Lcom/droid/dorpee/databinding/FragmentBookingStep3Binding;", "bookingId", "getBookingId", "setBookingId", "closingTime", "getClosingTime", "setClosingTime", "credit", "", "date", "dateis", "formatedDate", "fromUpcomming", "", "getFromUpcomming", "()Ljava/lang/Boolean;", "setFromUpcomming", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "monthis", "numberPeoples", "Ljava/lang/Integer;", "openingTime", "getOpeningTime", "setOpeningTime", "scondition", "getScondition", "setScondition", "selectedDate", "getSelectedDate", "setSelectedDate", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setSpace", "(Lcom/droid/dorpee/ui/venuedashboard/model/Space;)V", "txtCapacity", "txtWorkspace", "viewModel", "Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;)V", "workspaces", "Datavalidator", "dateStr", "bindData", "", "bookAsPersonal", "initListeners", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "openBookingScreen", "setEmployeData", "setEstimatedData", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showDialog", "Companion", "app_liveDebug"})
public final class BookingStep3Fragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private java.lang.String dateis = "";
    private java.lang.String monthis = "";
    private java.lang.String formatedDate = "";
    private java.lang.Integer workspaces;
    private java.lang.Integer numberPeoples;
    private java.lang.String txtWorkspace = "workspaces";
    private java.lang.String txtCapacity = "people";
    private double credit = 0.0;
    private com.droid.dorpee.databinding.FragmentBookingStep3Binding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel viewModel;
    private java.lang.String date = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String openingTime = "9:00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String closingTime = "9:00";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedDate = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String AselectedDate = "";
    private int actualHours = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean fromUpcomming = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bookingId = "";
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.model.Space space;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scondition;
    public static final com.droid.dorpee.ui.booking.frags.BookingStep3Fragment.Companion Companion = null;
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
    public final java.lang.String getSelectedDate() {
        return null;
    }
    
    public final void setSelectedDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAselectedDate() {
        return null;
    }
    
    public final void setAselectedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getActualHours() {
        return 0;
    }
    
    public final void setActualHours(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFromUpcomming() {
        return null;
    }
    
    public final void setFromUpcomming(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBookingId() {
        return null;
    }
    
    public final void setBookingId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.Space getSpace() {
        return null;
    }
    
    public final void setSpace(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.Space p0) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScondition() {
        return null;
    }
    
    public final void setScondition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    public final void openBookingScreen() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String Datavalidator(@org.jetbrains.annotations.Nullable()
    java.lang.String dateStr) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void setEstimatedData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void showDialog() {
    }
    
    public final void setEmployeData() {
    }
    
    public final void bookAsPersonal() {
    }
    
    public BookingStep3Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a8\u0006\f"}, d2 = {"Lcom/droid/dorpee/ui/booking/frags/BookingStep3Fragment$Companion;", "", "()V", "newInstance", "Lcom/droid/dorpee/ui/booking/frags/BookingStep3Fragment;", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "scondition", "", "fromUpcomming", "", "bookingId", "app_liveDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.ui.booking.frags.BookingStep3Fragment newInstance(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.ui.venuedashboard.model.Space space, @org.jetbrains.annotations.NotNull()
        java.lang.String scondition, boolean fromUpcomming, @org.jetbrains.annotations.Nullable()
        java.lang.String bookingId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}