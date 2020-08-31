package com.droid.dorpee.ui.venuedashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ&\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\"\u001a\u00020\u0017H\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0017H\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0017H\u0016J\u001e\u0010*\u001a\u00020\u00192\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRa\u0010\u0010\u001aI\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/adapter/UpcomingVenueAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/droid/dorpee/ui/venuedashboard/adapter/UpcomingVenueAdapter$ViewHolder;", "context", "Landroid/content/Context;", "bookingList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueBooking;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getBookingList", "()Ljava/util/ArrayList;", "setBookingList", "(Ljava/util/ArrayList;)V", "getContext$app_stageDebug", "()Landroid/content/Context;", "itemClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "booking", "", "position", "", "getItemClick", "()Lkotlin/jvm/functions/Function3;", "setItemClick", "(Lkotlin/jvm/functions/Function3;)V", "formatDate", "date", "startTime", "endTiem", "getItemCount", "onBindViewHolder", "holder", "pos", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "p1", "setData", "list", "ViewHolder", "app_stageDebug"})
public final class UpcomingVenueAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.droid.dorpee.ui.venuedashboard.adapter.UpcomingVenueAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super java.lang.String, ? super com.droid.dorpee.ui.venuedashboard.model.VenueBooking, ? super java.lang.Integer, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> bookingList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.droid.dorpee.ui.venuedashboard.adapter.UpcomingVenueAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venuedashboard.adapter.UpcomingVenueAdapter.ViewHolder holder, int pos) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.String, com.droid.dorpee.ui.venuedashboard.model.VenueBooking, java.lang.Integer, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super java.lang.String, ? super com.droid.dorpee.ui.venuedashboard.model.VenueBooking, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String formatDate(@org.jetbrains.annotations.Nullable()
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTiem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_stageDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> getBookingList() {
        return null;
    }
    
    public final void setBookingList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> p0) {
    }
    
    public UpcomingVenueAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.venuedashboard.model.VenueBooking> bookingList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/adapter/UpcomingVenueAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/droid/dorpee/databinding/ItemVenueTodayBinding;", "(Lcom/droid/dorpee/databinding/ItemVenueTodayBinding;)V", "getBinding", "()Lcom/droid/dorpee/databinding/ItemVenueTodayBinding;", "setBinding", "app_stageDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.droid.dorpee.databinding.ItemVenueTodayBinding binding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.databinding.ItemVenueTodayBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemVenueTodayBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemVenueTodayBinding binding) {
            super(null);
        }
    }
}