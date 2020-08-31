package com.droid.dorpee.ui.personaldashboard.adapter


import android.content.Context
import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemTableLayoutBinding
import com.droid.dorpee.ui.auth.model.MDCard
import com.droid.dorpee.ui.auth.model.TransactionData
import com.droid.dorpee.ui.auth.model.TransactionResponse
import org.jetbrains.anko.layoutInflater


class TransactionAdapter(internal val context: Context, var transactionList: ArrayList<TransactionData>) :
        RecyclerView.Adapter<TransactionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): TransactionAdapter.ViewHolder {
        val binding = ItemTableLayoutBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val traData = transactionList[pos]
        holder.binding.tvTime.text = traData.created_at
        if (traData.type.equals("Plan")){
            holder.binding.tvType.text = traData.type + " Payment"
        }else{
            holder.binding.tvType.text = traData.type + " Purchase"
        }
        holder.binding.tvAmount.text = "$"+ traData.amount.toString()
    }

    var itemClick: ((type: Int, card: MDCard, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemTableLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<TransactionData>) {
        transactionList.clear()
        transactionList.addAll(list)
        notifyDataSetChanged()
    }

}
