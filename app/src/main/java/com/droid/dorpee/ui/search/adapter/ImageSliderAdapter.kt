package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.squareup.picasso.Picasso

class ImageSliderAdapter internal constructor(var mContext: Context, val list: List<String>,val
width:Int ,val height:Int) :
        PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ImageView
    }

    private val sliderImageId = intArrayOf()
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(mContext)
//        imageView.scaleType = ImageView.ScaleType.FIT_CENTER
//        log("width ${width} , height  ${height}")
        Picasso.get().load(list[position]).fit().centerCrop().into(imageView)
//        imageView.setImageResource(sliderImageId[position])
        (container as ViewPager).addView(imageView, 0)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        (container as ViewPager).removeView(`object` as ImageView)
    }

    override fun getCount(): Int {
        return list.size
    }

}