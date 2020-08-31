package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.SpaceTypeDashItemBinding
import com.droid.dorpee.ui.venue.model.DataXX
import org.jetbrains.anko.layoutInflater

class TypeDashAdapter(internal val context: Context, var typeList: List<DataXX>?) :
    RecyclerView.Adapter<TypeDashAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = SpaceTypeDashItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return typeList?.size?:0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() ?: 0L
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val type = typeList!![pos]
        holder.binding.textType.text = type.type
        holder.binding.clicktype.isSelected = type.checked
        holder.binding.clicktype.setOnClickListener {
            itemClick?.invoke(pos)
        }
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: SpaceTypeDashItemBinding) : RecyclerView.ViewHolder(binding.root)

}
