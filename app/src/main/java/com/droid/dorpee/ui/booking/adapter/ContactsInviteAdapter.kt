package com.droid.dorpee.ui.booking.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemContanctsInviteBinding
import com.droid.dorpee.ui.booking.frags.InviteItem
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.layoutInflater


class ContactsInviteAdapter(internal val context: Context, var dashList: ArrayList<MDContact>) :
    RecyclerView.Adapter<ContactsInviteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        p1: Int
    ): ContactsInviteAdapter.ViewHolder {
        val binding = ItemContanctsInviteBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dashList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val dashItem = dashList[pos]
        val width = context.displayMetrics.widthPixels
        if (dashItem.isChecked) {
            holder.binding.imageViewEdit.isPressed = dashItem.isChecked
            holder.binding.imageViewEdit.setTextColor(ContextCompat.getColor(context,R.color.colorDark))
            holder.binding.imageViewEdit.background = context.getDrawable(R.drawable.button_unpressed)
            holder.binding.imageViewEdit.text = "Invited"
        } else {
            holder.binding.imageViewEdit.isPressed = dashItem.isChecked
            holder.binding.imageViewEdit.background = context.getDrawable(R.drawable.blue_btn_background)
            holder.binding.imageViewEdit.setTextColor(ContextCompat.getColor(context,R.color.colorWhite))
            holder.binding.imageViewEdit.text = "Invite"
        }

        holder.binding.textViewName.setText(dashItem.full_name)
        holder.binding.layout.layoutParams = ConstraintLayout.LayoutParams(
            width.minus(25f).toInt(),
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        holder.binding.imageViewEdit.setOnClickListener {
            itemClick?.invoke(pos)
        }
    }

    var itemClick: ((pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemContanctsInviteBinding) :
        RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDContact>) {
        dashList.clear()
        dashList.addAll(list)
        notifyDataSetChanged()
    }
}

