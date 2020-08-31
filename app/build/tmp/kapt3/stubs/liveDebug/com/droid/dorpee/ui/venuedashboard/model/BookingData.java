package com.droid.dorpee.ui.venuedashboard.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0016H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u00bd\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019\u00a8\u0006E"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/model/BookingData;", "", "booking_as", "", "credits", "", "end_date", "end_time", "no_of_booked_spaces", "no_of_people", "space_id", "start_date", "start_time", "user_id", "booking_number", "amount", "updated_at", "created_at", "id", "duration", "employer", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/droid/dorpee/ui/venuedashboard/model/Space;)V", "getAmount", "()I", "getBooking_as", "()Ljava/lang/String;", "getBooking_number", "getCreated_at", "getCredits", "getDuration", "getEmployer", "getEnd_date", "getEnd_time", "getId", "getNo_of_booked_spaces", "getNo_of_people", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace_id", "getStart_date", "getStart_time", "getUpdated_at", "getUser_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_liveDebug"})
public final class BookingData {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "booking_as")
    private final java.lang.String booking_as = null;
    @com.google.gson.annotations.SerializedName(value = "credits")
    private final int credits = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "end_date")
    private final java.lang.String end_date = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "end_time")
    private final java.lang.String end_time = null;
    @com.google.gson.annotations.SerializedName(value = "no_of_booked_spaces")
    private final int no_of_booked_spaces = 0;
    @com.google.gson.annotations.SerializedName(value = "no_of_people")
    private final int no_of_people = 0;
    @com.google.gson.annotations.SerializedName(value = "space_id")
    private final int space_id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "start_date")
    private final java.lang.String start_date = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "start_time")
    private final java.lang.String start_time = null;
    @com.google.gson.annotations.SerializedName(value = "user_id")
    private final int user_id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "booking_number")
    private final java.lang.String booking_number = null;
    @com.google.gson.annotations.SerializedName(value = "amount")
    private final int amount = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String created_at = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "duration")
    private final int duration = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "employer")
    private final java.lang.String employer = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "space")
    private final com.droid.dorpee.ui.venuedashboard.model.Space space = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBooking_as() {
        return null;
    }
    
    public final int getCredits() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_time() {
        return null;
    }
    
    public final int getNo_of_booked_spaces() {
        return 0;
    }
    
    public final int getNo_of_people() {
        return 0;
    }
    
    public final int getSpace_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart_time() {
        return null;
    }
    
    public final int getUser_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBooking_number() {
        return null;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venuedashboard.model.Space getSpace() {
        return null;
    }
    
    public BookingData(@org.jetbrains.annotations.NotNull()
    java.lang.String booking_as, int credits, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_time, int no_of_booked_spaces, int no_of_people, int space_id, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String start_time, int user_id, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_number, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int id, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String employer, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venuedashboard.model.Space space) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venuedashboard.model.Space component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venuedashboard.model.BookingData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String booking_as, int credits, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_time, int no_of_booked_spaces, int no_of_people, int space_id, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String start_time, int user_id, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_number, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int id, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String employer, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.venuedashboard.model.Space space) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}