package com.droid.dorpee.ui.venue.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ListItemBinding
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity.Companion.listOfAsset
import com.droid.dorpee.ui.venue.model.DataXXXX
import org.jetbrains.anko.layoutInflater


class AssetIieInsideAdapter(internal val context: Context, var list: List<DataXXXX>?, val assets:
List<com.droid.dorpee.ui.venue.model.Asset>?) :
    RecyclerView.Adapter<AssetIieInsideAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = ListItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list?.size?:0
    }

    override fun getItemId(position: Int): Long {
        return list!![position].id?.toLong()?:0L
    }
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val item = list!![pos]
        holder.binding.checkboxId.text = item.asset
       val lines = holder.binding.checkboxId.lineCount
        val params = LinearLayoutCompat.LayoutParams(
            LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                context.resources.getDimension(
                    R.dimen._35sdp
                ).toInt())
        assets?.map {
            if (it.id == item.id){
                list!![pos].checked = true
                listOfAsset?.add(item)
            }
        }
        holder.binding.checkboxId.layoutParams = params
        holder.binding.checkboxId.isChecked = list!![pos].checked
        holder.binding.checkboxId.setOnCheckedChangeListener { _, isChecked ->
            list!![pos].checked = isChecked
            if (isChecked) {
                listOfAsset?.add(item)
            } else {
                listOfAsset?.remove(item)
            }
        }
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

}
