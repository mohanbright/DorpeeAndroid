package com.droid.dorpee.ui.baseClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/ui/baseClasses/AppApplication;", "Landroid/app/Application;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "onCreate", "", "onEnterBackground", "onEnterForeground", "app_stageDebug"})
public final class AppApplication extends android.app.Application implements androidx.lifecycle.LifecycleObserver {
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onEnterForeground() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onEnterBackground() {
    }
    
    public AppApplication() {
        super();
    }
}