package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.InterestItemBinding
import com.droid.dorpee.ui.auth.model.Data
import org.jetbrains.anko.layoutInflater


class InterestAdapter(internal val context: Context, var interestList: List<Data>) :
    RecyclerView.Adapter<InterestAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = InterestItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return interestList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val interest = interestList[pos]
        holder.binding.texInterest.text = interest.interest
        holder.binding.clickItem.isSelected = interest.checked

        if (interest.checked) {
            holder.binding.texInterest.setTextColor(ContextCompat.getColor(context,R.color.white))
            holder.binding.clickItem.background = context.getDrawable(R.drawable.interest_selctor)

        } else {
            holder.binding.texInterest.setTextColor(ContextCompat.getColor(context,R.color.white))
            holder.binding.clickItem.background = context.getDrawable(R.drawable.button_background)
        }

        holder.binding.clickItem.setOnClickListener {
            itemClick?.invoke(pos)
        }
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: InterestItemBinding) : RecyclerView.ViewHolder(binding.root)

}
