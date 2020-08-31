package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.AmenitieItemSearchBinding
import com.droid.dorpee.databinding.EnvTypeItemBinding
import com.droid.dorpee.ui.search.model.Service
import org.jetbrains.anko.layoutInflater

class EnvtypeAdapter(
        val context: Context,
        var list: List<EnvType>?
) :
        RecyclerView.Adapter<EnvtypeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = EnvTypeItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() ?: 0L
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val envtype = list!![pos]
        holder.itemView.visibility = View.VISIBLE
        when (envtype.type) {
            "env" -> {
                holder.binding.textEnvType.text = envtype.name
                holder.binding.textEnvType.backgroundTintList = ContextCompat.getColorStateList(context, R.color.lightSky)
            }
            "type" -> {
                holder.binding.textEnvType.text = envtype.name
                holder.binding.textEnvType.backgroundTintList = ContextCompat.getColorStateList(context, R.color.light_blue)
            }
            else -> {
                holder.itemView.visibility = View.GONE
            }
        }
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: EnvTypeItemBinding) : RecyclerView.ViewHolder(binding.root)

}

