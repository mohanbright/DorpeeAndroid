package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemPlanBinding
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.venue.venueresponse.PlanX
import org.jetbrains.anko.layoutInflater


class PlansAdapter(internal val context: Context, var planList: ArrayList<PlanX>, var user: User, var planId: Int) :
    RecyclerView.Adapter<PlansAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): PlansAdapter.ViewHolder {
        val binding = ItemPlanBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return planList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val plan = planList[pos]
        holder.binding.textViewIntro.text = plan.name
        holder.binding.textViewprice.text = "$" + plan.price
        holder.binding.textViewcredit.text = plan.credits.toString()
        holder.binding.textViewDescription.text = plan.description
        if (plan.id == 1) {
            holder.binding.textViewFree.visibility = View.INVISIBLE
        } else {
            holder.binding.textViewFree.visibility = View.VISIBLE
        }
//        Log.e("Subscription Plan ","Subscription Plan is  "+user.planId)
        if (plan.id == planId) {
            holder.binding.buttonplan.visibility = View.GONE
            holder.binding.card.setCardBackgroundColor(context.getColor(R.color.quantum_grey200))
            holder.binding.textViewActive.visibility = View.VISIBLE
        } else {
            holder.binding.buttonplan.visibility = View.VISIBLE
            holder.binding.card.setCardBackgroundColor(context.getColor(R.color.white))
            holder.binding.textViewActive.visibility = View.GONE
        }
        holder.binding.buttonplan.setOnClickListener{
            itemClick?.invoke(plan, pos)
        }
    }

    var itemClick: ((plan: PlanX, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemPlanBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<PlanX>) {
        planList.clear()
        planList.addAll(list)
        notifyDataSetChanged()
    }
}

data class Plan(
    val intro: String,
    val price: String,
    val descripation: String,
    val credits: String,
    var checked: Boolean,
    val id: Int
)