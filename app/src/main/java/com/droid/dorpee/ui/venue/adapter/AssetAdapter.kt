package com.droid.dorpee.ui.venue.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.AmenitiesItemBinding
import com.droid.dorpee.ui.venue.model.DataXXXX
import org.jetbrains.anko.layoutInflater


class AssetAdapter(internal val context: Context, var assetList: ArrayList<Asset>?, val assets:
List<com.droid.dorpee.ui.venue.model.Asset>?) :
    RecyclerView.Adapter<AssetAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = AmenitiesItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return assetList?.size?:0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() ?: 0L
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val asset = assetList!![pos]
        holder.binding.textViewHead.text = asset.collection

        val mLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        mLayoutManager.isItemPrefetchEnabled = true
        asset.list?.size?.let {
            holder.binding.listamentie.layoutManager = mLayoutManager
            holder.binding.listamentie.setHasFixedSize(true)
//        holder.binding.listamentie.itemAnimator = DefaultItemAnimator()
            holder.binding.listamentie.adapter = AssetIieInsideAdapter(context, asset.list!!,assets)
        }

    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: AmenitiesItemBinding) : RecyclerView.ViewHolder(binding.root)

}

data class Asset(val collection: String?, var list: List<DataXXXX>?)

