package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemContanctsBinding
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import org.jetbrains.anko.layoutInflater


class ContanctsAdapter(internal val context: Context, var contactsList: ArrayList<MDContact>) :
    RecyclerView.Adapter<ContanctsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ContanctsAdapter.ViewHolder {
        val binding = ItemContanctsBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val contact = contactsList[pos]
        holder.binding.textViewName.text = contact.full_name
        holder.binding.imageViewCancel.setOnClickListener {
            itemClick?.invoke(0, contact, pos)
        }

        holder.binding.imageViewEdit.setOnClickListener {
            itemClick?.invoke(1, contact, pos)
        }
    }

    var itemClick: ((type: Int, contact: MDContact, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemContanctsBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDContact>) {
        contactsList.clear()
        contactsList.addAll(list)
        notifyDataSetChanged()
    }
}

