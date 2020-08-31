package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemPaymentBinding
import com.droid.dorpee.ui.auth.model.MDCard
import org.jetbrains.anko.layoutInflater


class PaymentsAdapter(internal val context: Context, var cardList: ArrayList<MDCard>, var isFromTopUp: Boolean) :
    RecyclerView.Adapter<PaymentsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): PaymentsAdapter.ViewHolder {
        val binding = ItemPaymentBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val card = cardList[pos]
        holder.binding.cardType.text = card.brand
        holder.binding.textViewName.text = "**** **** **** **** ${card.last4}"
        holder.binding.imageViewCancel.setOnClickListener {
            itemClick?.invoke(0, card, pos)
        }
        if (isFromTopUp){
            holder.binding.imageViewEdit.visibility = View.GONE
            holder.binding.imageViewCancel.visibility = View.GONE
        }else{
            holder.binding.imageViewEdit.visibility = View.VISIBLE
            holder.binding.imageViewCancel.visibility = View.VISIBLE
        }
        holder.itemView.setOnClickListener{
            itemClick?.invoke(1, card, pos)
        }

        holder.binding.imageViewEdit.setOnClickListener {
            itemClick?.invoke(1, card, pos)
        }
    }

    var itemClick: ((type: Int, card: MDCard, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemPaymentBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDCard>) {
        cardList.clear()
        cardList.addAll(list)
        notifyDataSetChanged()
    }
}

