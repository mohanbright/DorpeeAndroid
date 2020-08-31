package com.droid.dorpee.ui.venuedashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemAddWorkspaceBinding
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity
import com.droid.dorpee.ui.venue.EditWorkSpaceActivity
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.squareup.picasso.Picasso
import org.jetbrains.anko.layoutInflater

class AddWorkspaceAdapter(internal val context: Context,val venueId:Int,val venueName:String, var list: List<Space>?) :
        RecyclerView.Adapter<AddWorkspaceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = ItemAddWorkspaceBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val space = list?.get(pos)
/*        val width = context.displayMetrics.widthPixels.minus(context.resources.getDimension(R.dimen._18sdp).toInt())
//        val height = context.resources.getDimension(R.dimen._160sdp).toInt()
        holder.binding.layout.layoutParams = ConstraintLayout.LayoutParams(width,
                ConstraintLayout.LayoutParams.WRAP_CONTENT)*/
        if (space?.isSpace == true) {
            holder.binding.addSpaceLayout.visibility = View.GONE
            holder.binding.workspaceLayout.visibility = View.VISIBLE
            holder.binding.textSpace.text = space.name
            holder.binding.editTextNoOfSpace.text = (space.quantity?:0).toString()
            holder.binding.textViewNos.text = (space.capacity?:0).toString()
            holder.binding.imageViewEdit.setOnClickListener {
                context.startActivity(Intent(context, EditWorkSpaceActivity::class.java).apply {
                    putExtra("spaceId",space.id!!)
                    putExtra("space",space)
                    putExtra("venueId",venueId)
                    putExtra("venueName", venueName)
                    putExtra("from","dashboard")
                })
            }
            holder.binding.imageViewCancel.setOnClickListener {
                itemClick?.invoke("Cancel",space,pos)
            }
            holder.binding.imageVieId.clipToOutline = true
            if (!space.images.isNullOrEmpty()) {
        /*        Glide.with(holder.binding.imageVieId.context)
                        .load(space.images[0])
                        .fitCenter()
                        .optionalFitCenter()
                        .centerCrop()
                        .placeholder(R.drawable.placeholder)
                        .into(holder.binding.imageVieId);*/
                Picasso.get().load(space.images[0]).fit().centerCrop().placeholder(R.drawable.placeholder).into(holder.binding
                        .imageVieId)
            }else{
                Picasso.get().load(R.drawable.placeholder).fit().centerCrop()
                        .into(holder.binding
                        .imageVieId)
            }
        } else {
            holder.binding.addSpaceLayout.visibility = View.GONE
            holder.binding.workspaceLayout.visibility = View.GONE
            holder.binding.textWorkspace.text = "Workspace ${pos + 1}"
            holder.binding.addWorkspace.setOnClickListener {
                context.startActivity(Intent(context, AddWorkSpaceActivity::class.java).apply {
                    putExtra("venueId",venueId)
                    putExtra("venueName", venueName)
                    putExtra("from","dashboard")
                })
            }

        }
    }

    var itemClick: ((type: String, space: Space, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemAddWorkspaceBinding) : RecyclerView.ViewHolder(binding.root)

}
