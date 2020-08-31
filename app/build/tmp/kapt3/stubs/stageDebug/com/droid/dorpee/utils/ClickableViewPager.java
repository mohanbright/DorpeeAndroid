package com.droid.dorpee.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/droid/dorpee/utils/ClickableViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "", "OnSingleTapConfirmedGestureListener", "app_stageDebug"})
public final class ClickableViewPager extends androidx.viewpager.widget.ViewPager {
    private android.view.View.OnClickListener onClickListener;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void setOnClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener onClickListener) {
    }
    
    public ClickableViewPager(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ClickableViewPager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/droid/dorpee/utils/ClickableViewPager$OnSingleTapConfirmedGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "view", "Landroid/view/View;", "(Lcom/droid/dorpee/utils/ClickableViewPager;Landroid/view/View;)V", "onSingleTapConfirmed", "", "e", "Landroid/view/MotionEvent;", "app_stageDebug"})
    final class OnSingleTapConfirmedGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private final android.view.View view = null;
        
        @java.lang.Override()
        public boolean onSingleTapConfirmed(@org.jetbrains.annotations.Nullable()
        android.view.MotionEvent e) {
            return false;
        }
        
        public OnSingleTapConfirmedGestureListener(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super();
        }
    }
}