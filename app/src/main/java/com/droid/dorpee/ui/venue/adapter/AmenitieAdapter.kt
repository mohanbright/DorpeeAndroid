package com.droid.dorpee.ui.venue.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.AmenitiesItemBinding
import com.droid.dorpee.ui.venue.model.Data
import com.droid.dorpee.ui.venue.venueresponse.Service
import org.jetbrains.anko.layoutInflater


class AmenitieAdapter(internal val context: Context, var amenitieList: ArrayList<Amenitie>?, val services: List<Service>?) :
    RecyclerView.Adapter<AmenitieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = AmenitiesItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return amenitieList?.size?:0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() ?: 0L
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val amenitie = amenitieList!![pos]
        holder.binding.textViewHead.text = amenitie.collection

        val mLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        mLayoutManager.isItemPrefetchEnabled = true
        amenitie.list?.size?.let {
            holder.binding.listamentie.layoutManager = mLayoutManager
            holder.binding.listamentie.setHasFixedSize(true)
            holder.binding.listamentie.adapter = AmenitieInsideAdapter(context, amenitie.list!!,services)
        }

    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: AmenitiesItemBinding) : RecyclerView.ViewHolder(binding.root)

}

data class Amenitie(val collection: String?, var list: List<Data>?)

