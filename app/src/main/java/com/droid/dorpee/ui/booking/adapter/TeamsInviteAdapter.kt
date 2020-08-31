package com.droid.dorpee.ui.booking.adapter

import android.content.Context
import android.util.Log
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemTeamsInviteBinding
import com.droid.dorpee.ui.auth.static.CapacityCheck

import com.droid.dorpee.ui.personaldashboard.models.MDTeamX
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.layoutInflater
import org.jetbrains.anko.textColor


class TeamsInviteAdapter(internal val context: Context, var dashList: java.util.ArrayList<MDTeamX>) :
    RecyclerView.Adapter<TeamsInviteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): TeamsInviteAdapter.ViewHolder {
        val binding = ItemTeamsInviteBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dashList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val dashItem = dashList[pos]
        if (dashItem.isClicked) {
            holder.binding.imageViewInvite.isPressed = dashItem.isClicked
            holder.binding.imageViewInvite.text = "Invited"
            holder.binding.imageViewInvite.setTextColor(ContextCompat.getColor(context,R.color.colorDark))
            holder.binding.imageViewInvite.background = context.getDrawable(R.drawable.button_unpressed)

        } else {
            holder.binding.imageViewInvite.isPressed = dashItem.isClicked
            holder.binding.imageViewInvite.text = "Invite"
            holder.binding.imageViewInvite.setTextColor(ContextCompat.getColor(context,R.color.colorWhite))
            holder.binding.imageViewInvite.background = context.getDrawable(R.drawable.blue_btn_background)
        }
        val width = context.displayMetrics.widthPixels
        val height = context.resources.getDimension(R.dimen._150sdp).toInt()
        holder.binding.layout.layoutParams = ConstraintLayout.LayoutParams(width.minus(25f).toInt(),ConstraintLayout.LayoutParams.WRAP_CONTENT)
        holder.binding.imageViewInvite.setOnClickListener {
            itemClick?.invoke(pos)
        }

        holder.binding.name.setText(dashItem.name)
        holder.binding.nuPeople.setText("" + dashItem.contact_count+" people")
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemTeamsInviteBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDTeamX>) {
        dashList.clear()
        dashList.addAll(list)
        notifyDataSetChanged()
    }
}

