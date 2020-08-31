package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.content.Intent
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemPersonalDashboardBinding
import org.jetbrains.anko.layoutInflater


class PersonalDashboardAdapter(internal val context: Context, var dashList: ArrayList<DashItem>) :
    RecyclerView.Adapter<PersonalDashboardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        p1: Int
    ): ViewHolder {
        val binding = ItemPersonalDashboardBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dashList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val dashItem = dashList[pos]
        holder.binding.textViewName.text = dashItem.name
//        holder.binding.clickweek.isSelected = week.checked
        if (pos == 1 || pos == 3 || pos == 5) {
            holder.binding.layout.setPadding(12, 12, 0, 0)
        } else {
            holder.binding.layout.setPadding(0, 12, 0, 0)
        }
        holder.binding.layout.setOnClickListener {
            context.startActivity(dashItem.intent)
        }
        holder.binding.imageView9.setImageDrawable(
            ContextCompat.getDrawable(
                context,
                dashItem.image
            )
        )
//        Picasso.get().load(dashItem.image).error(R.drawable.ic_crdits).into(holder.binding.imageView9)
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemPersonalDashboardBinding) :
        RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<DashItem>) {
        dashList.clear()
        dashList.addAll(list)
        notifyDataSetChanged()
    }
}

data class DashItem(
    val name: String,
    @DrawableRes var image: Int,
    val intent: Intent,
    var past: Boolean = false
)