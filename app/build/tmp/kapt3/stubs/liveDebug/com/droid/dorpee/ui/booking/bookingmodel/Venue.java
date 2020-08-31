package com.droid.dorpee.ui.booking.bookingmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00d5\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 \u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 \u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0 \u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0 \u00a2\u0006\u0002\u0010/J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\u0017H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\u0017H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050 H\u00c6\u0003J\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050 H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020$0 H\u00c6\u0003J\t\u0010s\u001a\u00020\u0017H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010z\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020.0 H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0005H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00c6\u0003J\u00a8\u0003\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 2\b\b\u0002\u0010\"\u001a\u00020\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020$0 2\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00052\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020.0 H\u00c6\u0001J\u0016\u0010\u0083\u0001\u001a\u00030\u0084\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0016\u0010*\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0016\u0010%\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010CR\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0016\u0010+\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0016\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0016\u0010,\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0016\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0016\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010@R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00103R\u0016\u0010\'\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00103\u00a8\u0006\u0088\u0001"}, d2 = {"Lcom/droid/dorpee/ui/booking/bookingmodel/Venue;", "", "id", "", "name", "", "slug", "address", "suburb", "postcode", "state", "country", "price", "capacity", "description", "created_at", "updated_at", "deleted_at", "user_id", "featured", "phone_number", "email", "lat", "", "lng", "bonus_offer", "distance_from_city", "status", "venue_type_id", "qr_pdf", "qr_code", "photos", "", "images", "images_link", "uploaded_images", "Lcom/droid/dorpee/ui/booking/bookingmodel/Uploaded_images;", "lowest_price", "average_rating", "workspace_count", "total_available", "total_reviews", "featured_venue", "pdf_link", "qrcode_link", "media", "Lcom/droid/dorpee/ui/booking/bookingmodel/Media;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;DIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getAverage_rating", "()I", "getBonus_offer", "getCapacity", "getCountry", "getCreated_at", "getDeleted_at", "getDescription", "getDistance_from_city", "getEmail", "getFeatured", "getFeatured_venue", "getId", "getImages", "()Ljava/util/List;", "getImages_link", "getLat", "()D", "getLng", "getLowest_price", "getMedia", "getName", "getPdf_link", "getPhone_number", "getPhotos", "getPostcode", "getPrice", "getQr_code", "getQr_pdf", "getQrcode_link", "getSlug", "getState", "getStatus", "getSuburb", "getTotal_available", "getTotal_reviews", "getUpdated_at", "getUploaded_images", "getUser_id", "getVenue_type_id", "getWorkspace_count", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_liveDebug"})
public final class Venue {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "slug")
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address")
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "suburb")
    private final java.lang.String suburb = null;
    @com.google.gson.annotations.SerializedName(value = "postcode")
    private final int postcode = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "state")
    private final java.lang.String state = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country")
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "price")
    private final java.lang.String price = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "capacity")
    private final java.lang.String capacity = null;
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
    @com.google.gson.annotations.SerializedName(value = "user_id")
    private final int user_id = 0;
    @com.google.gson.annotations.SerializedName(value = "featured")
    private final int featured = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "phone_number")
    private final java.lang.String phone_number = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "email")
    private final java.lang.String email = null;
    @com.google.gson.annotations.SerializedName(value = "lat")
    private final double lat = 0.0;
    @com.google.gson.annotations.SerializedName(value = "lng")
    private final double lng = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "bonus_offer")
    private final java.lang.String bonus_offer = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "distance_from_city")
    private final java.lang.String distance_from_city = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @com.google.gson.annotations.SerializedName(value = "venue_type_id")
    private final int venue_type_id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "qr_pdf")
    private final java.lang.String qr_pdf = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "qr_code")
    private final java.lang.String qr_code = null;
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
    @com.google.gson.annotations.SerializedName(value = "lowest_price")
    private final double lowest_price = 0.0;
    @com.google.gson.annotations.SerializedName(value = "average_rating")
    private final int average_rating = 0;
    @com.google.gson.annotations.SerializedName(value = "workspace_count")
    private final int workspace_count = 0;
    @com.google.gson.annotations.SerializedName(value = "total_available")
    private final int total_available = 0;
    @com.google.gson.annotations.SerializedName(value = "total_reviews")
    private final int total_reviews = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "featured_venue")
    private final java.lang.String featured_venue = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pdf_link")
    private final java.lang.String pdf_link = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "qrcode_link")
    private final java.lang.String qrcode_link = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "media")
    private final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> media = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuburb() {
        return null;
    }
    
    public final int getPostcode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCapacity() {
        return null;
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
    
    public final int getUser_id() {
        return 0;
    }
    
    public final int getFeatured() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final double getLng() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBonus_offer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistance_from_city() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int getVenue_type_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQr_pdf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQr_code() {
        return null;
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
    
    public final double getLowest_price() {
        return 0.0;
    }
    
    public final int getAverage_rating() {
        return 0;
    }
    
    public final int getWorkspace_count() {
        return 0;
    }
    
    public final int getTotal_available() {
        return 0;
    }
    
    public final int getTotal_reviews() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeatured_venue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPdf_link() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQrcode_link() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> getMedia() {
        return null;
    }
    
    public Venue(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String suburb, int postcode, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String capacity, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String deleted_at, int user_id, int featured, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.NotNull()
    java.lang.String email, double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String bonus_offer, @org.jetbrains.annotations.NotNull()
    java.lang.String distance_from_city, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int venue_type_id, @org.jetbrains.annotations.NotNull()
    java.lang.String qr_pdf, @org.jetbrains.annotations.NotNull()
    java.lang.String qr_code, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String images_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> uploaded_images, double lowest_price, int average_rating, int workspace_count, int total_available, int total_reviews, @org.jetbrains.annotations.NotNull()
    java.lang.String featured_venue, @org.jetbrains.annotations.NotNull()
    java.lang.String pdf_link, @org.jetbrains.annotations.NotNull()
    java.lang.String qrcode_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> media) {
        super();
    }
    
    public final int component1() {
        return 0;
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
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
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
    public final java.lang.String component18() {
        return null;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
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
    
    public final int component24() {
        return 0;
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
    public final java.util.List<java.lang.String> component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> component30() {
        return null;
    }
    
    public final double component31() {
        return 0.0;
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
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.booking.bookingmodel.Venue copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String suburb, int postcode, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String capacity, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String deleted_at, int user_id, int featured, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.NotNull()
    java.lang.String email, double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String bonus_offer, @org.jetbrains.annotations.NotNull()
    java.lang.String distance_from_city, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int venue_type_id, @org.jetbrains.annotations.NotNull()
    java.lang.String qr_pdf, @org.jetbrains.annotations.NotNull()
    java.lang.String qr_code, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String images_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Uploaded_images> uploaded_images, double lowest_price, int average_rating, int workspace_count, int total_available, int total_reviews, @org.jetbrains.annotations.NotNull()
    java.lang.String featured_venue, @org.jetbrains.annotations.NotNull()
    java.lang.String pdf_link, @org.jetbrains.annotations.NotNull()
    java.lang.String qrcode_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.booking.bookingmodel.Media> media) {
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