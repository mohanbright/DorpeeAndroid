package com.droid.dorpee.ui.venue.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemAddWorkspaceBinding
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.venueRes
import com.droid.dorpee.ui.venuedashboard.model.Space
import org.jetbrains.anko.layoutInflater

class AddAdapter(internal val context: Context, var list: ArrayList<String>?) :
    RecyclerView.Adapter<AddAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = ItemAddWorkspaceBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list?.size?:0
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val item = list!![pos]
        holder.binding.textWorkspace.text = "Workspace ${pos + 1}"
        holder.binding.addSpaceLayout.visibility = View.VISIBLE
        holder.binding.workspaceLayout.visibility = View.GONE
        holder.binding.addWorkspace.setOnClickListener {
//            val venueRes=   AppPreferences.getInstance(context)?.venueResponse
            context.startActivity(Intent(context,AddWorkSpaceActivity::class.java).apply {
                putExtra("venueId",venueRes?.data?.id?:0)
                putExtra("venueName",venueRes?.data?.name?:"")
                putExtra("from","signup")
            }
            )
        }
    }

    var itemClick:( (type:String, space:Space, pos :Int )-> Unit)? = null

    class ViewHolder(var binding: ItemAddWorkspaceBinding) : RecyclerView.ViewHolder(binding.root)

}
