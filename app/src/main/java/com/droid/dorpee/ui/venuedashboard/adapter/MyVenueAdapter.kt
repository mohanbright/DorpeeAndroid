package com.droid.dorpee.ui.venuedashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.util.Log
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemMyVenueBinding
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.squareup.picasso.Picasso
import org.jetbrains.anko.layoutInflater
import java.util.*


class MyVenueAdapter(internal val context: Context, var venueList: ArrayList<Data>) :
        RecyclerView.Adapter<MyVenueAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = ItemMyVenueBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return venueList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val venue = venueList[pos]
        if (venue.assessment!=null && venue.assessment.result=="Pass") {
            ImageViewCompat.setImageTintList(holder.binding.imageViewStatus, null)
            holder.binding.imageViewStatus.setOnClickListener {
                itemClick?.invoke("ohspass", venue, pos)
            }
        } else {
            holder.binding.imageViewStatus.setOnClickListener {
                itemClick?.invoke("ohsfail", venue, pos)
            }
            ImageViewCompat.setImageTintList(holder.binding.imageViewStatus, ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorUnpublish)))
        }
        holder.binding.textViewName.text = venue.name ?: ""
        when (venue.status) {
            "Published" -> {
                holder.binding.textViewStatus.setTextColor(ContextCompat.getColor(context, R.color.colorGreen))
            }
            "Closed" -> {
                holder.binding.textViewStatus.setTextColor(ContextCompat.getColor(context, R.color.colorYellow))
            }
            "Unpublished" -> {
                holder.binding.textViewStatus.setTextColor(ContextCompat.getColor(context, R.color.colorUnpublish))
            }
            else -> holder.binding.textViewStatus.setTextColor(ContextCompat.getColor(context, R.color.colorGreen))
        }
        holder.binding.textViewStatus.text = "STATUS ${(venue.status ?: "").toUpperCase(Locale.getDefault())}"
        holder.binding.imageVieId.clipToOutline = true


        if (!venue.images.isNullOrEmpty()) {
            Log.e("imageVieId", "onBindViewHolder: ${venue.images[0]} ")
           /* Glide.with(holder.binding.imageVieId.context)
                    .load(venue.images[0])
                    .fitCenter()
                    .placeholder(R.drawable.placeholder)
                    .into(holder.binding.imageVieId);*/
            Picasso.get().load(venue.images[0]).fit().centerCrop().placeholder(R.drawable.placeholder).into(holder.binding
                    .imageVieId)

//            holder.binding.imageVieId.background =context.getDrawable(R.drawable.gray_background)
        }else{
            Glide
                    .with(holder.binding.imageVieId.context)
                    .load(R.drawable.placeholder)
                    .fitCenter()
                    .placeholder(R.drawable.placeholder)
                    .into(holder.binding.imageVieId);
        }
        holder.binding.buttonWorkspace.setOnClickListener {
            itemClick?.invoke("workspace", venue, pos)
        }
        holder.binding.imageViewEdit.setOnClickListener {
            itemClick?.invoke("edit", venue, pos)
        }
        holder.binding.imageViewCancel.setOnClickListener {
            itemClick?.invoke("cancel", venue, pos)
        }
        holder.binding.textViewStatus.setOnClickListener {
            itemClick?.invoke("status", venue, pos)
        }
        holder.binding.imageViewShow.setOnClickListener {
            itemClick?.invoke("show", venue, pos)
        }
    }

    var itemClick: ((type: String, venue: Data, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemMyVenueBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<Data>) {
        venueList.clear()
        venueList.addAll(list)
        notifyDataSetChanged()
    }

}


