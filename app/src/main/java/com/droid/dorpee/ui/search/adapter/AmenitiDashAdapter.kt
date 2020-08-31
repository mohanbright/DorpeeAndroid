package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.AmentiDashItemBinding
import com.droid.dorpee.ui.venue.adapter.Amenitie
import org.jetbrains.anko.layoutInflater

class AmenitiDashAdapter(internal val context: Context, var amenitieList: ArrayList<Amenitie>?) :
    RecyclerView.Adapter<AmenitiDashAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = AmentiDashItemBinding.inflate(context.layoutInflater)
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

        val mLayoutManager = GridLayoutManager(context, 2)
        mLayoutManager.isItemPrefetchEnabled = true
        amenitie.list?.size?.let {
            holder.binding.listamentie.layoutManager = mLayoutManager
            holder.binding.listamentie.setHasFixedSize(true)
//        holder.binding.listamentie.itemAnimator = DefaultItemAnimator()
            holder.binding.listamentie.adapter = AmenitieInsideDashAdapter(context, amenitie.list!!)
        }

    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: AmentiDashItemBinding) : RecyclerView.ViewHolder(binding.root)

}

