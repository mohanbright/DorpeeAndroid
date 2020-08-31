package com.droid.dorpee.ui.personaldashboard.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.databinding.ItemTeamsBinding
import com.droid.dorpee.ui.personaldashboard.models.MDTeamX
import org.jetbrains.anko.layoutInflater


class TeamsAdapter(internal val context: Context, var teamsList: java.util.ArrayList<MDTeamX>) :
    RecyclerView.Adapter<TeamsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): TeamsAdapter.ViewHolder {
        val binding = ItemTeamsBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return teamsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val team = teamsList[pos]
        holder.binding.nameTV.text = team.name
        holder.binding.peopleCountTV.text = "${team.contact_count} people"
        holder.binding.imageViewCancel.setOnClickListener{
            itemClick?.invoke(0, team, pos)
        }

        holder.binding.imageViewEdit.setOnClickListener{
            itemClick?.invoke(1, team, pos)
        }
    }

    var itemClick: ((type: Int, team: MDTeamX, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemTeamsBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDTeamX>) {
        teamsList.clear()
        teamsList.addAll(list)
        notifyDataSetChanged()
    }
}

