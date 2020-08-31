package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.EnvironmentDashItemBinding
import com.droid.dorpee.ui.venue.model.DataXXX
import org.jetbrains.anko.layoutInflater

class EnvironmentDashAdapter(internal val context: Context, var environmentList: List<DataXXX>?) :
    RecyclerView.Adapter<EnvironmentDashAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = EnvironmentDashItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return environmentList?.size?:0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val type = environmentList!![pos]
        holder.binding.textEnvironment.text = type.environment
        holder.binding.clickenvironment.isSelected = type.checked

        holder.binding.clickenvironment.setOnClickListener {
            itemClick?.invoke(pos)
        }
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: EnvironmentDashItemBinding) : RecyclerView.ViewHolder(binding.root)

}
