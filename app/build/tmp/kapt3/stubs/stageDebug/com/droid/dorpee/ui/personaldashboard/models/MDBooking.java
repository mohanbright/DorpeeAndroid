package com.droid.dorpee.ui.personaldashboard.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00ef\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u00a2\u0006\u0002\u0010$J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\bH\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Q\u001a\u00020\u000bH\u00c6\u0003J\t\u0010R\u001a\u00020\u000bH\u00c6\u0003J\t\u0010S\u001a\u00020\bH\u00c6\u0003J\t\u0010T\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u000bH\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\bH\u00c6\u0003J\t\u0010\\\u001a\u00020\bH\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020!H\u00c6\u0003J\t\u0010_\u001a\u00020\u000bH\u00c6\u0003J\t\u0010`\u001a\u00020\u000bH\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\bH\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u000bH\u00c6\u0003J\u00ad\u0002\u0010h\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010\bH\u00d6\u0003J\t\u0010l\u001a\u00020\u000bH\u00d6\u0001J\t\u0010m\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010+R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010&\"\u0004\bC\u0010+R\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010-R\u0011\u0010\u001e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010&R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\"\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u0011\u0010#\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00100\u00a8\u0006n"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/models/MDBooking;", "Ljava/io/Serializable;", "amount", "", "booking_as", "booking_number", "booking_status", "contacts", "", "created_at", "credits", "", "deleted_at", "duration", "employer", "employer_id", "end_date", "end_time", "id", "no_of_booked_spaces", "no_of_people", "notes", "review_sent", "space", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "space_id", "start_date", "start_time", "status", "teams", "type", "updated_at", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "user_id", "venue_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;ILcom/droid/dorpee/ui/venuedashboard/model/Space;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lcom/droid/dorpee/ui/auth/model/User;II)V", "getAmount", "()Ljava/lang/String;", "getBooking_as", "getBooking_number", "getBooking_status", "setBooking_status", "(Ljava/lang/String;)V", "getContacts", "()Ljava/lang/Object;", "getCreated_at", "getCredits", "()I", "getDeleted_at", "getDuration", "getEmployer", "getEmployer_id", "getEnd_date", "setEnd_date", "getEnd_time", "getId", "getNo_of_booked_spaces", "getNo_of_people", "getNotes", "getReview_sent", "getSpace", "()Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "getSpace_id", "getStart_date", "getStart_time", "getStatus", "setStatus", "getTeams", "getType", "getUpdated_at", "getUser", "()Lcom/droid/dorpee/ui/auth/model/User;", "getUser_id", "getVenue_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_stageDebug"})
public final class MDBooking implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String amount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String booking_as = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String booking_number = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String booking_status;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object contacts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_at = null;
    private final int credits = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deleted_at = null;
    private final int duration = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object employer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object employer_id = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String end_date;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String end_time = null;
    private final int id = 0;
    private final int no_of_booked_spaces = 0;
    private final int no_of_people = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object notes = null;
    private final int review_sent = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.droid.dorpee.ui.venuedashboard.model.Space space = null;
    private final int space_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String start_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String start_time = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object teams = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull()
    private final com.droid.dorpee.ui.auth.model.User user = null;
    private final int user_id = 0;
    private final int venue_id = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBooking_as() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBooking_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBooking_status() {
        return null;
    }
    
    public final void setBooking_status(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    public final int getCredits() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeleted_at() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployer_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_date() {
        return null;
    }
    
    public final void setEnd_date(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_time() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getNo_of_booked_spaces() {
        return 0;
    }
    
    public final int getNo_of_people() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getNotes() {
        return null;
    }
    
    public final int getReview_sent() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.Space getSpace() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTeams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.auth.model.User getUser() {
        return null;
    }
    
    public final int getUser_id() {
        return 0;
    }
    
    public final int getVenue_id() {
        return 0;
    }
    
    public MDBooking(@org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_as, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_number, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_status, @org.jetbrains.annotations.NotNull()
    java.lang.Object contacts, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int credits, @org.jetbrains.annotations.NotNull()
    java.lang.String deleted_at, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.Object employer, @org.jetbrains.annotations.NotNull()
    java.lang.Object employer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_time, int id, int no_of_booked_spaces, int no_of_people, @org.jetbrains.annotations.NotNull()
    java.lang.Object notes, int review_sent, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.Space space, int space_id, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.Object teams, @org.jetbrains.annotations.NotNull()
    java.lang.Object type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.auth.model.User user, int user_id, int venue_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.Space component19() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.auth.model.User component27() {
        return null;
    }
    
    public final int component28() {
        return 0;
    }
    
    public final int component29() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.MDBooking copy(@org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_as, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_number, @org.jetbrains.annotations.NotNull()
    java.lang.String booking_status, @org.jetbrains.annotations.NotNull()
    java.lang.Object contacts, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int credits, @org.jetbrains.annotations.NotNull()
    java.lang.String deleted_at, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.Object employer, @org.jetbrains.annotations.NotNull()
    java.lang.Object employer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_time, int id, int no_of_booked_spaces, int no_of_people, @org.jetbrains.annotations.NotNull()
    java.lang.Object notes, int review_sent, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.Space space, int space_id, @org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.Object teams, @org.jetbrains.annotations.NotNull()
    java.lang.Object type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.auth.model.User user, int user_id, int venue_id) {
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