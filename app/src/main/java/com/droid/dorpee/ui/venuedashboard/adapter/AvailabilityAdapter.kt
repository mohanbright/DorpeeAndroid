package com.droid.dorpee.ui.venuedashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.AvailabiltyItemBinding
import com.droid.dorpee.ui.venue.model.WorkingHours
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.layoutInflater


class AvailabilityAdapter(internal val context: Context, val blockDataList: List<WorkingHours>,val  selectSpaceQuantity: Int) : RecyclerView.Adapter<AvailabilityAdapter
.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
      val  binding = AvailabiltyItemBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return blockDataList?.size?:0
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val blockData = blockDataList!![pos]
        val width = context.displayMetrics.widthPixels.minus(context.resources.getDimension(R
                .dimen._24sdp).toInt())
        holder.binding.itemView.layoutParams = ConstraintLayout.LayoutParams(width,
                ConstraintLayout.LayoutParams.WRAP_CONTENT)
        holder.binding.textViewTime.text = blockData.time?:"0"
        holder.binding.editTextNoOfSpace.setText(blockData.quantity?:"0")
        holder.binding.editTextNoOfSpace.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                try {
                    val no = (s?.toString()?: "0").toInt()
                    blockData.quantity = s?.toString() ?: "0"
                    if (no > selectSpaceQuantity) {
                        holder.binding.textViewError.visibility = View.VISIBLE
                        holder.binding.textViewError.text = "Quantity exceed space quantity $selectSpaceQuantity"
                    } else {
                        holder.binding.textViewError.visibility = View.GONE
                    }
                }catch (e:Exception){
                    holder.binding.textViewError.visibility = View.VISIBLE
                    holder.binding.textViewError.text = "Enter quantity"
                    e.printStackTrace()
                }
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
    }
    var itemClick: ((type: String, blockData: WorkingHours, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: AvailabiltyItemBinding) : RecyclerView.ViewHolder(binding.root)

}


