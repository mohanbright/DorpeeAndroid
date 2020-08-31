package com.droid.dorpee.utils

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatSeekBar


open class CustomSeekbar : AppCompatSeekBar {
    val paint = Paint()
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val thumb_x = (this.progress.toDouble() / this.max * this.width.toDouble()).toInt()
        val middle = this.height.toFloat()

        paint.color = Color.BLACK
        paint.textSize = 20f
        c.drawText("" + this.progress, thumb_x.toFloat(), middle, paint)
    }
}