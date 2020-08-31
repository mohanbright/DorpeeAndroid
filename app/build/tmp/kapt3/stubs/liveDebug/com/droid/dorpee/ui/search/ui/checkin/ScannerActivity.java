package com.droid.dorpee.ui.search.ui.checkin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/droid/dorpee/ui/search/ui/checkin/ScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityScannerBinding;", "viewModel", "Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/search/viewmodel/DashboardViewModel;)V", "handleResult", "", "p0", "Lcom/google/zxing/Result;", "onCameraPermission", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "app_liveDebug"})
public final class ScannerActivity extends androidx.appcompat.app.AppCompatActivity implements me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler {
    private com.droid.dorpee.databinding.ActivityScannerBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.search.viewmodel.DashboardViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.viewmodel.DashboardViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.viewmodel.DashboardViewModel p0) {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.Nullable()
    com.google.zxing.Result p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onCameraPermission() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public ScannerActivity() {
        super();
    }
}