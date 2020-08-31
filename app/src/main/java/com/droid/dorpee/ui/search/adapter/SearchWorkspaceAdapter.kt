package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droid.dorpee.databinding.ItemSearchWorkspaceBinding
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import org.jetbrains.anko.layoutInflater
import kotlin.math.ceil

class SearchWorkspaceAdapter(internal val context: Context, var searchList: List<Space>?) :
        RecyclerView.Adapter<SearchWorkspaceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = ItemSearchWorkspaceBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return searchList?.size ?: 0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val space = searchList!![pos]
        holder.binding.textViewName.text = space.name
        holder.binding.textViewCapcity.text = (space.capacity ?: 0).toString()
        holder.binding.textViewQuantity.text = space.quantity ?: ""
//        holder.binding.recyclerEnvAndType.text = space.quantity ?: ""
        val list = ArrayList<EnvType>()
        space.environments?.map {
            list.add(EnvType("env", it.environment ?: ""))
        }
        space.types?.map {
            list.add(EnvType("type", it.type ?: ""))
        }
        val layoutManager = when (list.size) {
            1, 2, 3 -> StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
            4, 5, 6-> StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
            7, 8, 9 -> StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)
            else -> StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL)
        }

        layoutManager.isItemPrefetchEnabled = true
        holder.binding.recyclerEnvAndType.layoutManager = layoutManager
        holder.binding.recyclerEnvAndType.setHasFixedSize(true)
        if (list.isNotEmpty()) {
            holder.binding.recyclerEnvAndType.visibility = View.VISIBLE
            holder.binding.recyclerEnvAndType.adapter = EnvtypeAdapter(context, list)
        } else {
            holder.binding.recyclerEnvAndType.visibility = View.GONE
        }
        val creditPerHour = if (space.price.isNullOrEmpty()) 0 else ceil(
                space.price.toDouble().div(0.3)
        ).toInt()
        holder.binding.textViewPrice.text = creditPerHour.toString()
   /*     val width = context.displayMetrics.widthPixels
        val height = context.resources.getDimension(R.dimen._150sdp).toInt()
        holder.binding.imageViewWorkSpace.layoutParams = ConstraintLayout.LayoutParams(width, height)
        space.images?.first {
            Picasso.get().load(it).into(holder.binding.imageViewWorkSpace)
            true
        }*/

        val user = AppPreferences.getInstance(context)?.user?.user
        if (user != null) {
            if (user.plan?.free_space.equals("yes", true)) {
                holder.binding.root.visibility = View.VISIBLE
            } else {
                if (creditPerHour == 0) {
                    holder.binding.root.visibility = View.GONE
                } else {
                    holder.binding.root.visibility = View.VISIBLE
                }
            }
        } else {
            if (creditPerHour == 0) {
                holder.binding.root.visibility = View.GONE
            } else {
                holder.binding.root.visibility = View.VISIBLE
            }
        }
        val width =  holder.binding.imageViewpager.width
        val height =  holder.binding.imageViewpager.height
        holder.binding.imageViewpager.adapter = ImageSliderAdapter(context, space.images ?:
        emptyList(),width,height)


        holder.binding.imageViewNext.setOnClickListener {
            holder.binding.imageViewpager.arrowScroll(View.FOCUS_RIGHT)
        }
        if (!space.images.isNullOrEmpty() && space.images.size > 1)
            holder.binding.imageViewNext.visibility = View.VISIBLE
        else
            holder.binding.imageViewNext.visibility = View.INVISIBLE
        Log.e("textViewBuyCredit", "onBindViewHolder: ${user?.totalCredits}  $creditPerHour")
        if (user != null) {
            if (creditPerHour > user.totalCredits ?: 0) {
                holder.binding.textViewBuyCredit.visibility = View.VISIBLE
                holder.binding.textViewBuyCredit.setOnClickListener {
                    itemClick?.invoke("buyCredit", pos, space)
                }
            } else {
                holder.binding.textViewBuyCredit.visibility = View.GONE
            }
        }else{
            holder.binding.textViewBuyCredit.visibility = View.GONE
        }
        holder.binding.buttonBook.setOnClickListener {
            itemClick?.invoke("book", pos, space)
        }

    }

    var itemClick: ((type: String, pos: Int, space: Space) -> Unit)? = null

    class ViewHolder(var binding: ItemSearchWorkspaceBinding) : RecyclerView.ViewHolder(binding.root)

}

data class EnvType(val type: String, val name: String)