package com.droid.dorpee.ui.search.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.AvailDialogItemBinding
import com.droid.dorpee.ui.venue.model.Availability
import org.jetbrains.anko.dimen
import org.jetbrains.anko.horizontalGravity
import org.jetbrains.anko.layoutInflater

class AvailbiltyAdapter(internal val context: Context, var typeList: List<Availability>?) :
    RecyclerView.Adapter<AvailbiltyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = AvailDialogItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return typeList?.size?:0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() ?: 0L
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val type = typeList!![pos]
        val width = context.resources.displayMetrics.widthPixels
        holder.itemView.layoutParams = LinearLayout.LayoutParams(((6 * width)/7).minus(context
                .dimen(R.dimen._60sdp)),
                LinearLayout.LayoutParams.WRAP_CONTENT)
        holder.binding.layout.horizontalGravity= Gravity.CENTER
        holder.binding.time.text = "${type.openingTime}-${type.closingTime}"
        holder.binding.day.text = type.day?:""
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: AvailDialogItemBinding) : RecyclerView.ViewHolder(binding.root)

}
