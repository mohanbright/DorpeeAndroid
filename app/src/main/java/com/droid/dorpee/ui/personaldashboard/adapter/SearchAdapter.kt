package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemSearchBinding
import com.droid.dorpee.ui.personaldashboard.models.PreferenceData
import org.jetbrains.anko.layoutInflater


class SearchAdapter(internal val context: Context, var searchList: ArrayList<PreferenceData>) :
    RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): SearchAdapter.ViewHolder {
        val binding = ItemSearchBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return searchList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val searchItem = searchList[pos]
        holder.binding.textView37.text = searchItem.typesText?.get(0)
        holder.binding.textView40.text = searchItem.environmentsText?.get(0)
        var services = ""
        searchItem.servicesText?.forEach {
            services += it + ", "
        }
        holder.binding.textView42.text = services

        holder.binding.ivSsearchClose.setOnClickListener{
            itemClick?.invoke(searchItem, pos)
        }
    }

    var itemClick: ((searchItem : PreferenceData, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemSearchBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<PreferenceData>) {
        searchList.clear()
        searchList.addAll(list)
        notifyDataSetChanged()
    }
}

