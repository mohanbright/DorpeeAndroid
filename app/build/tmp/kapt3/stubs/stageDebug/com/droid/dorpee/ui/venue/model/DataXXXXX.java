package com.droid.dorpee.ui.venue.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00c9\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\"J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010D\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010N\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010O\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u00d2\u0002\u0010U\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Z\u001a\u00020\bH\u00d6\u0001J\t\u0010[\u001a\u00020\nH\u00d6\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b/\u0010\'R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b2\u0010\'R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b4\u0010\'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u001a\u0010!\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b=\u0010\'\u00a8\u0006\\"}, d2 = {"Lcom/droid/dorpee/ui/venue/model/DataXXXXX;", "", "assets", "", "Lcom/droid/dorpee/ui/venue/model/Asset;", "availability", "Lcom/droid/dorpee/ui/venue/model/AvailabilityX;", "capacity", "", "createdAt", "", "deletedAt", "description", "environments", "Lcom/droid/dorpee/ui/venue/model/Environment;", "freeSpace", "id", "images", "imagesLink", "maxBookingHours", "media", "Lcom/droid/dorpee/ui/venue/model/Media;", "minBookingHours", "name", "photos", "price", "quantity", "status", "types", "Lcom/droid/dorpee/ui/venue/model/Type;", "updatedAt", "uploadedImages", "Lcom/droid/dorpee/ui/venue/model/UploadedImage;", "venueId", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getAssets", "()Ljava/util/List;", "getAvailability", "getCapacity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatedAt", "()Ljava/lang/String;", "getDeletedAt", "getDescription", "getEnvironments", "getFreeSpace", "getId", "getImages", "getImagesLink", "getMaxBookingHours", "getMedia", "getMinBookingHours", "getName", "getPhotos", "getPrice", "getQuantity", "getStatus", "getTypes", "getUpdatedAt", "getUploadedImages", "getVenueId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/droid/dorpee/ui/venue/model/DataXXXXX;", "equals", "", "other", "hashCode", "toString", "app_stageDebug"})
public final class DataXXXXX {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "assets")
    private final java.util.List<com.droid.dorpee.ui.venue.model.Asset> assets = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "availability")
    private final java.util.List<com.droid.dorpee.ui.venue.model.AvailabilityX> availability = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "capacity")
    private final java.lang.Integer capacity = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "deleted_at")
    private final java.lang.String deletedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "environments")
    private final java.util.List<com.droid.dorpee.ui.venue.model.Environment> environments = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "free_space")
    private final java.lang.String freeSpace = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "images")
    private final java.util.List<java.lang.String> images = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "images_link")
    private final java.lang.String imagesLink = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "max_booking_hours")
    private final java.lang.Integer maxBookingHours = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "media")
    private final java.util.List<com.droid.dorpee.ui.venue.model.Media> media = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "min_booking_hours")
    private final java.lang.Integer minBookingHours = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "photos")
    private final java.util.List<java.lang.Object> photos = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "price")
    private final java.lang.String price = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "quantity")
    private final java.lang.String quantity = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "types")
    private final java.util.List<com.droid.dorpee.ui.venue.model.Type> types = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "uploaded_images")
    private final java.util.List<com.droid.dorpee.ui.venue.model.UploadedImage> uploadedImages = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "venue_id")
    private final java.lang.Integer venueId = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Asset> getAssets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.AvailabilityX> getAvailability() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCapacity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeletedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Environment> getEnvironments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFreeSpace() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagesLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaxBookingHours() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Media> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinBookingHours() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuantity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Type> getTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.UploadedImage> getUploadedImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVenueId() {
        return null;
    }
    
    public DataXXXXX(@org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Asset> assets, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.AvailabilityX> availability, @org.jetbrains.annotations.Nullable()
    java.lang.Integer capacity, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String deletedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Environment> environments, @org.jetbrains.annotations.Nullable()
    java.lang.String freeSpace, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.lang.String imagesLink, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxBookingHours, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Media> media, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minBookingHours, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> photos, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Type> types, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.UploadedImage> uploadedImages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer venueId) {
        super();
    }
    
    public DataXXXXX() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Asset> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.AvailabilityX> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Environment> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Media> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.Type> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venue.model.UploadedImage> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venue.model.DataXXXXX copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Asset> assets, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.AvailabilityX> availability, @org.jetbrains.annotations.Nullable()
    java.lang.Integer capacity, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String deletedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Environment> environments, @org.jetbrains.annotations.Nullable()
    java.lang.String freeSpace, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.lang.String imagesLink, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxBookingHours, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Media> media, @org.jetbrains.annotations.Nullable()
    java.lang.Integer minBookingHours, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> photos, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.Type> types, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venue.model.UploadedImage> uploadedImages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer venueId) {
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