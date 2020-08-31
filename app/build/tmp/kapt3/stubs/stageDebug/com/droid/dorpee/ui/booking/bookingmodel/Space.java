package com.droid.dorpee.ui.booking.bookingmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0002\u0010\u001dJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u00c6\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u001cH\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\u0006H\u00c6\u0003J\t\u0010J\u001a\u00020\u0006H\u00c6\u0003J\u00e9\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u00c6\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001J\t\u0010P\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\'R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\'R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001f\u00a8\u0006Q"}, d2 = {"Lcom/droid/dorpee/ui/booking/bookingmodel/Space;", "", "id", "", "venue_id", "name", "", "price", "", "capacity", "description", "created_at", "updated_at", "deleted_at", "free_space", "quantity", "status", "min_booking_hours", "max_booking_hours", "photos", "", "images", "images_link", "uploaded_images", "Lcom/droid/dorpee/ui/booking/bookingmodel/Uploaded_images;", "media", "Lcom/droid/dorpee/ui/booking/bookingmodel/Media;", "venue", "Lcom/droid/dorpee/ui/booking/bookingmodel/Venue;", "(IILjava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/droid/dorpee/ui/booking/bookingmodel/Venue;)V", "getCapacity", "()I", "getCreated_at", "()Ljava/lang/String;", "getDeleted_at", "getDescription", "getFree_space", "getId", "getImages", "()Ljava/util/List;", "getImages_link", "getMax_booking_hours", "getMedia", "getMin_booking_hours", "getName", "getPhotos", "getPrice", "()D", "getQuantity", "getStatus", "getUpdated_at", "getUploaded_images", "getVenue", "()Lcom/droid/dorpee/ui/booking/bookingmodel/Venue;", "getVenue_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_stageDebug"})
public final class Space {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "venue_id")
    private final int venue_id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "price")
    private final double price = 0.0;
    @com.google.gson.annotations.SerializedName(value = "capacity")
    private final int capacity = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "deleted_at")
    private final java.lang.String deleted_at = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "free_space")
    private final java.lang.String free_space = null;
    @com.google.gson.annotations.SerializedName(value = "quantity")
    private final int quantity = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @com.google.gson.annotations.SerializedName(value = "min_booking_hours")
    private final int min_booking_hours = 0;
    @com.google.gson.annotations.SerializedName(value = "max_booking_hours")
    private final int max_booking_hours = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photos")
    private final java.util.List<java.lang.String> photos = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "images")
    private final java.util.List<java.lang.String> images = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "images_link")
    private final java.lang.String images_link = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "uploaded_images")
    private final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> uploaded_images = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "media")
    private final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> media = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "venue")
    private final com.droid.dorpee.ui.booking.bookingmodel.Venue venue = null;
    
    public final int getId() {
        return 0;
    }
    
    public final int getVenue_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final int getCapacity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeleted_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFree_space() {
        return null;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int getMin_booking_hours() {
        return 0;
    }
    
    public final int getMax_booking_hours() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImages_link() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> getUploaded_images() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.booking.bookingmodel.Venue getVenue() {
        return null;
    }
    
    public Space(int id, int venue_id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double price, int capacity, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String deleted_at, @org.jetbrains.annotations.NotNull()
    java.lang.String free_space, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int min_booking_hours, int max_booking_hours, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String images_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> uploaded_images, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> media, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.bookingmodel.Venue venue) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.booking.bookingmodel.Venue component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.booking.bookingmodel.Space copy(int id, int venue_id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double price, int capacity, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String deleted_at, @org.jetbrains.annotations.NotNull()
    java.lang.String free_space, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int min_booking_hours, int max_booking_hours, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String images_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> uploaded_images, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> media, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.booking.bookingmodel.Venue venue) {
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