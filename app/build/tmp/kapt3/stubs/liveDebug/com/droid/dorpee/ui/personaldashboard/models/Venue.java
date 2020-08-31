package com.droid.dorpee.ui.personaldashboard.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bb\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0012\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0005\u00a2\u0006\u0002\u0010+J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\bH\u00c6\u0003J\t\u0010U\u001a\u00020\bH\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\bH\u00c6\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\bH\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020&0\u0012H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\t\u0010p\u001a\u00020\bH\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\bH\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\u0085\u0003\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00032\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00122\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010\bH\u00d6\u0003J\t\u0010z\u001a\u00020\u0005H\u00d6\u0001J\t\u0010{\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010-R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010<R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010-R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010-R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010-R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010/R\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010/R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010-R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0011\u0010\'\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0011\u0010)\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0011\u0010(\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010/R\u0011\u0010*\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010/\u00a8\u0006|"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/models/Venue;", "Ljava/io/Serializable;", "address", "", "average_rating", "", "bonus_offer", "capacity", "", "country", "created_at", "deleted_at", "description", "distance_from_city", "email", "featured", "id", "images", "", "images_link", "lat", "lng", "lowest_price", "media", "Lcom/droid/dorpee/ui/personaldashboard/models/MediaX;", "name", "phone_number", "photos", "postcode", "price", "slug", "state", "status", "suburb", "total_available", "total_reviews", "updated_at", "uploaded_images", "Lcom/droid/dorpee/ui/personaldashboard/models/UploadedImageX;", "user_id", "venue_type_id", "venue_id", "workspace_count", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;IIII)V", "getAddress", "()Ljava/lang/String;", "getAverage_rating", "()I", "getBonus_offer", "getCapacity", "()Ljava/lang/Object;", "getCountry", "getCreated_at", "getDeleted_at", "getDescription", "getDistance_from_city", "getEmail", "getFeatured", "getId", "getImages", "()Ljava/util/List;", "getImages_link", "getLat", "getLng", "getLowest_price", "getMedia", "getName", "getPhone_number", "getPhotos", "getPostcode", "getPrice", "getSlug", "getState", "getStatus", "getSuburb", "getTotal_available", "getTotal_reviews", "getUpdated_at", "getUploaded_images", "getUser_id", "getVenue_id", "getVenue_type_id", "getWorkspace_count", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_liveDebug"})
public final class Venue implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    private final int average_rating = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bonus_offer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object capacity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object deleted_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String distance_from_city = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object featured = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String images_link = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lat = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lng = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lowest_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaX> media = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object phone_number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> photos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String postcode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String suburb = null;
    private final int total_available = 0;
    private final int total_reviews = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.droid.dorpee.ui.personaldashboard.models.UploadedImageX> uploaded_images = null;
    private final int user_id = 0;
    private final int venue_type_id = 0;
    private final int venue_id = 0;
    private final int workspace_count = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final int getAverage_rating() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBonus_offer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCapacity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDeleted_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistance_from_city() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFeatured() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImages_link() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLng() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLowest_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaX> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPhone_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPostcode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuburb() {
        return null;
    }
    
    public final int getTotal_available() {
        return 0;
    }
    
    public final int getTotal_reviews() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.UploadedImageX> getUploaded_images() {
        return null;
    }
    
    public final int getUser_id() {
        return 0;
    }
    
    public final int getVenue_type_id() {
        return 0;
    }
    
    public final int getVenue_id() {
        return 0;
    }
    
    public final int getWorkspace_count() {
        return 0;
    }
    
    public Venue(@org.jetbrains.annotations.NotNull()
    java.lang.String address, int average_rating, @org.jetbrains.annotations.NotNull()
    java.lang.String bonus_offer, @org.jetbrains.annotations.NotNull()
    java.lang.Object capacity, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.Object deleted_at, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String distance_from_city, @org.jetbrains.annotations.NotNull()
    java.lang.Object email, @org.jetbrains.annotations.NotNull()
    java.lang.Object featured, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String images_link, @org.jetbrains.annotations.Nullable()
    java.lang.String lat, @org.jetbrains.annotations.Nullable()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lowest_price, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaX> media, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object phone_number, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> photos, @org.jetbrains.annotations.NotNull()
    java.lang.String postcode, @org.jetbrains.annotations.NotNull()
    java.lang.Object price, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String suburb, int total_available, int total_reviews, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.UploadedImageX> uploaded_images, int user_id, int venue_type_id, int venue_id, int workspace_count) {
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
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
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
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaX> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    public final int component28() {
        return 0;
    }
    
    public final int component29() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.UploadedImageX> component31() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int component33() {
        return 0;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final int component35() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.Venue copy(@org.jetbrains.annotations.NotNull()
    java.lang.String address, int average_rating, @org.jetbrains.annotations.NotNull()
    java.lang.String bonus_offer, @org.jetbrains.annotations.NotNull()
    java.lang.Object capacity, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.Object deleted_at, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String distance_from_city, @org.jetbrains.annotations.NotNull()
    java.lang.Object email, @org.jetbrains.annotations.NotNull()
    java.lang.Object featured, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String images_link, @org.jetbrains.annotations.Nullable()
    java.lang.String lat, @org.jetbrains.annotations.Nullable()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lowest_price, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaX> media, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object phone_number, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> photos, @org.jetbrains.annotations.NotNull()
    java.lang.String postcode, @org.jetbrains.annotations.NotNull()
    java.lang.Object price, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String suburb, int total_available, int total_reviews, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.UploadedImageX> uploaded_images, int user_id, int venue_type_id, int venue_id, int workspace_count) {
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