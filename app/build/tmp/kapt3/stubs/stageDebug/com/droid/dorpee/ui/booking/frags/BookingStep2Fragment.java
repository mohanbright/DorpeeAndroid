package com.droid.dorpee.ui.booking.frags;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 c2\u00020\u0001:\u0001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0015J\u0006\u0010C\u001a\u00020AJ\b\u0010D\u001a\u00020AH\u0002J\u0017\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002\u00a2\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020FJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020MJ\b\u0010N\u001a\u00020AH\u0014J\b\u0010O\u001a\u00020\u0019H\u0002J\u0006\u0010P\u001a\u00020AJ\u0010\u0010Q\u001a\u00020A2\b\u0010R\u001a\u0004\u0018\u00010SJ\u0010\u0010T\u001a\u00020A2\b\u0010R\u001a\u0004\u0018\u00010SJ&\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u001a\u0010]\u001a\u00020A2\u0006\u0010^\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010_\u001a\u00020AH\u0002J\b\u0010`\u001a\u00020aH\u0002J\n\u0010b\u001a\u0004\u0018\u00010aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u001a\u0010\'\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u00a8\u0006d"}, d2 = {"Lcom/droid/dorpee/ui/booking/frags/BookingStep2Fragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentBookingStep2Binding;", "bookingId", "", "getBookingId", "()Ljava/lang/String;", "setBookingId", "(Ljava/lang/String;)V", "closingTime", "getClosingTime", "setClosingTime", "contactList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContact;", "date", "dialogContact", "Landroid/app/Dialog;", "getDialogContact", "()Landroid/app/Dialog;", "setDialogContact", "(Landroid/app/Dialog;)V", "fromUpcomming", "", "getFromUpcomming", "()Ljava/lang/Boolean;", "setFromUpcomming", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "openingTime", "getOpeningTime", "setOpeningTime", "popupbinding", "Lcom/droid/dorpee/databinding/PopupContactBinding;", "scondition", "getScondition", "setScondition", "selectedDate", "getSelectedDate", "setSelectedDate", "selectedTeamId", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "setSpace", "(Lcom/droid/dorpee/ui/venuedashboard/model/Space;)V", "teams", "teamsList", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeamX;", "teamsViewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "getTeamsViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "setTeamsViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;)V", "viewModel", "Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/booking/viewmodel/BookingStepsViewModel;)V", "attachObserver", "", "bindData", "checkValidity", "createContact", "getTeamId", "", "id", "(Ljava/lang/Integer;)I", "handleFragments", "pos", "hideKeyboard", "activity", "Landroid/app/Activity;", "initListeners", "isValid", "loadFragmensts", "loadFragment1", "fragment", "Landroidx/fragment/app/Fragment;", "loadFragment2", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUPInviteContactList", "setUpTeamVM", "Landroidx/lifecycle/ViewModel;", "setUpVM", "Companion", "app_stageDebug"})
public final class BookingStep2Fragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentBookingStep2Binding binding;
    private com.droid.dorpee.databinding.PopupContactBinding popupbinding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel viewModel;
    private java.lang.String date = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String openingTime = "9:00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String closingTime = "9:00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedDate = "";
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.venuedashboard.model.Space space;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String scondition;
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDContact> contactList;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialogContact;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bookingId = "0";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean fromUpcomming = false;
    private java.util.ArrayList<java.lang.String> teams;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel teamsViewModel;
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDTeamX> teamsList;
    private java.lang.String selectedTeamId = "";
    public static final com.droid.dorpee.ui.booking.frags.BookingStep2Fragment.Companion Companion = null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedDate() {
        return null;
    }
    
    public final void setSelectedDate(@org.jetbrains.annotations.NotNull()
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
    public final android.app.Dialog getDialogContact() {
        return null;
    }
    
    public final void setDialogContact(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookingId() {
        return null;
    }
    
    public final void setBookingId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFromUpcomming() {
        return null;
    }
    
    public final void setFromUpcomming(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel getTeamsViewModel() {
        return null;
    }
    
    public final void setTeamsViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    public final void loadFragmensts() {
    }
    
    public final void loadFragment1(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    public final void loadFragment2(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    private final androidx.lifecycle.ViewModel setUpTeamVM() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void attachObserver() {
    }
    
    private final void setUPInviteContactList() {
    }
    
    private final int getTeamId(java.lang.Integer id) {
        return 0;
    }
    
    private final boolean isValid() {
        return false;
    }
    
    private final void createContact() {
    }
    
    public final void handleFragments(int pos) {
    }
    
    public final void checkValidity() {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public BookingStep2Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lcom/droid/dorpee/ui/booking/frags/BookingStep2Fragment$Companion;", "", "()V", "newInstance", "Lcom/droid/dorpee/ui/booking/frags/BookingStep2Fragment;", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "scondition", "", "fromUpcomming", "", "bookingId", "app_stageDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.ui.booking.frags.BookingStep2Fragment newInstance(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.ui.venuedashboard.model.Space space, @org.jetbrains.annotations.NotNull()
        java.lang.String scondition, boolean fromUpcomming, @org.jetbrains.annotations.NotNull()
        java.lang.String bookingId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}