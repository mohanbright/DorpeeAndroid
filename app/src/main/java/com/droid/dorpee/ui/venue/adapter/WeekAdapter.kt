package com.droid.dorpee.ui.venue.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.WeekItemBinding
import com.droid.dorpee.ui.Availability
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.layoutInflater


class WeekAdapter(internal val context: Context, var weekList: ArrayList<Availability>) :
        RecyclerView.Adapter<WeekAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = WeekItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return weekList.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val week = weekList[pos]
        holder.binding.textWeek.text = week.day
        holder.binding.toTimeId.text = week.closingTime
        holder.binding.fromTimeId.text = week.openingTime
        holder.binding.clickweek.isSelected = week.checked
        if (pos == 0) {
            holder.binding.textViewFrom.visibility = View.VISIBLE
            holder.binding.textViewTo.visibility = View.VISIBLE
        } else {
            holder.binding.textViewFrom.visibility = View.GONE
            holder.binding.textViewTo.visibility = View.GONE
        }
        val width = context.displayMetrics.widthPixels.minus(context.resources.getDimension(R.dimen._18sdp).toInt())
        val height = context.resources.getDimension(R.dimen._160sdp).toInt()
        holder.binding.layout.layoutParams = ConstraintLayout.LayoutParams(width,
                ConstraintLayout.LayoutParams.WRAP_CONTENT)
        if (week.checked) {
            holder.binding.textWeek.setTextColor(ContextCompat.getColor(context, R.color.white))
        } else {
            holder.binding.textWeek.setTextColor(ContextCompat.getColor(context, R.color.black))
        }
        holder.binding.clickweek.setOnClickListener {
            itemClick?.invoke("day", pos)
        }
        holder.binding.fromTimeId.setOnClickListener {
            itemClick?.invoke("from", pos)
        }
        holder.binding.toTimeId.setOnClickListener {
            itemClick?.invoke("to", pos)
        }
    }

    var itemClick: ((type: String, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: WeekItemBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<Availability>) {
        weekList.clear()
        weekList.addAll(list)
        notifyDataSetChanged()
    }
}

data class Week(val day: String, var checked: Boolean, val id: Int)