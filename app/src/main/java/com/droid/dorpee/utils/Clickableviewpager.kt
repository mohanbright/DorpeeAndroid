package com.droid.dorpee.utils

import android.content.Context
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.viewpager.widget.ViewPager


class ClickableViewPager(context: Context?, attrs: AttributeSet?) : ViewPager(context!!, attrs) {
    private var onClickListener: OnClickListener? = null

    constructor(context: Context?) : this(context, null) {}

    override fun setOnClickListener( onClickListener: OnClickListener?) {
        this.onClickListener = onClickListener
    }

    private inner class OnSingleTapConfirmedGestureListener(view: View) : GestureDetector.SimpleOnGestureListener() {
        private val view: View
        override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
            if (onClickListener != null) {
                onClickListener!!.onClick(view)
            }
            return true
        }

        init {
            this.view = view
        }
    }

    init {
        val onSingleTapConfirmedGestureDetector = GestureDetector(context, OnSingleTapConfirmedGestureListener(this))
        setOnTouchListener { v, event ->
            onSingleTapConfirmedGestureDetector.onTouchEvent(event)
            false
        }
    }
}