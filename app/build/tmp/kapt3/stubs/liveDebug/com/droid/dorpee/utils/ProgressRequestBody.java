package com.droid.dorpee.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/droid/dorpee/utils/ProgressRequestBody;", "Lokhttp3/RequestBody;", "mFile", "Ljava/io/File;", "mListener", "Lcom/droid/dorpee/utils/ProgressRequestBody$UploadCallbacks;", "mediaType", "", "(Ljava/io/File;Lcom/droid/dorpee/utils/ProgressRequestBody$UploadCallbacks;Ljava/lang/String;)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "ProgressUpdater", "UploadCallbacks", "app_liveDebug"})
public final class ProgressRequestBody extends okhttp3.RequestBody {
    private final java.io.File mFile = null;
    private final com.droid.dorpee.utils.ProgressRequestBody.UploadCallbacks mListener = null;
    private final java.lang.String mediaType = null;
    private static final int DEFAULT_BUFFER_SIZE = 2048;
    public static final com.droid.dorpee.utils.ProgressRequestBody.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public long contentLength() throws java.io.IOException {
        return 0L;
    }
    
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) throws java.io.IOException {
    }
    
    public ProgressRequestBody(@org.jetbrains.annotations.NotNull()
    java.io.File mFile, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.utils.ProgressRequestBody.UploadCallbacks mListener, @org.jetbrains.annotations.NotNull()
    java.lang.String mediaType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/droid/dorpee/utils/ProgressRequestBody$UploadCallbacks;", "", "onError", "", "onFinish", "onProgressUpdate", "percentage", "", "uploadStart", "app_liveDebug"})
    public static abstract interface UploadCallbacks {
        
        public abstract void onProgressUpdate(int percentage);
        
        public abstract void onError();
        
        public abstract void onFinish();
        
        public abstract void uploadStart();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/utils/ProgressRequestBody$ProgressUpdater;", "Ljava/lang/Runnable;", "mUploaded", "", "mTotal", "(Lcom/droid/dorpee/utils/ProgressRequestBody;JJ)V", "run", "", "app_liveDebug"})
    final class ProgressUpdater implements java.lang.Runnable {
        private final long mUploaded = 0L;
        private final long mTotal = 0L;
        
        @java.lang.Override()
        public void run() {
        }
        
        public ProgressUpdater(long mUploaded, long mTotal) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/droid/dorpee/utils/ProgressRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "app_liveDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}