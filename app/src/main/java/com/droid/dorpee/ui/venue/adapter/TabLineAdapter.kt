package com.droid.dorpee.ui.venue.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.TabItemBinding
import kotlinx.android.synthetic.main.tab_item.view.*
import org.jetbrains.anko.layoutInflater


class TabLineAdapter(internal var context: Context, val tabList: ArrayList<Boolean>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val binding = TabItemBinding.inflate(context.layoutInflater)
//        val view = LayoutInflater.from(viewGroup.context).inflate(
//            R.layout.tab_item, viewGroup, false
//        )
        return ViewHolder(
            binding.root
        )
    }

    override fun getItemCount(): Int {
        return tabList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, pos: Int) {
        holder.itemView.select_circle.isSelected = tabList[pos]
        if (tabList[pos]) {
            holder.itemView.arrowUp.visibility = View.VISIBLE
        } else {
            holder.itemView.arrowUp.visibility = View.INVISIBLE
        }
        if (pos == tabList.size - 1) {
            holder.itemView.viewLine.visibility = View.INVISIBLE
        } else {
            holder.itemView.viewLine.visibility = View.VISIBLE
        }
    }

    fun setTabList(list: ArrayList<Boolean>) {
        tabList.clear()
        tabList.addAll(list)
        notifyDataSetChanged()
    }

    private class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
