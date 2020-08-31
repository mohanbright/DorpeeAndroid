package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.AmenitieItemSearchBinding
import org.jetbrains.anko.layoutInflater

class AmenitieVenueAdapter(
        val context: Context,
        var amenitieList: List<com.droid.dorpee.ui.venue.venueresponse.Service>
) :
        RecyclerView.Adapter<AmenitieVenueAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = AmenitieItemSearchBinding.inflate(context.layoutInflater)
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
        holder.binding.textAmenitie.text = amenitie.service
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: AmenitieItemSearchBinding) : RecyclerView.ViewHolder(binding.root)

}

