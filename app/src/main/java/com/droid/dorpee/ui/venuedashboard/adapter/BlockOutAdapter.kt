package com.droid.dorpee.ui.venuedashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.BlockOutItemBinding
import com.droid.dorpee.ui.venuedashboard.model.BlockData
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.layoutInflater
import java.util.*


class BlockOutAdapter(internal val context: Context, var blockDataList: ArrayList<BlockData>) : RecyclerView.Adapter<BlockOutAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
      val  binding = BlockOutItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return blockDataList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val blockData = blockDataList[pos]
        val width = context.displayMetrics.widthPixels.minus(context.resources.getDimension(R
                .dimen._24sdp).toInt())
        holder.binding.itemView.layoutParams = ConstraintLayout.LayoutParams(width,
                ConstraintLayout.LayoutParams.WRAP_CONTENT)
        holder.binding.textViewdate.text = "${blockData.date}-${blockData.openingTime}-${blockData.closingTime}"
        holder.binding.textViewSpace.text = if (blockData.quantity!=null&&blockData.quantity>1)
            "${blockData.quantity} Workspaces" else "${blockData.quantity?:0} Workspace"
        holder.binding.imageViewCancel.setOnClickListener {
            itemClick?.invoke("unblock",blockData,pos)
        }
    }
    var itemClick: ((type: String, blockData: BlockData, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: BlockOutItemBinding) : RecyclerView.ViewHolder(binding.root)

}


