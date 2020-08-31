package com.droid.dorpee.ui.search.adapter

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemSearchResultBinding
import com.droid.dorpee.ui.search.model.Data
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.toJson
import org.jetbrains.anko.displayMetrics
import org.jetbrains.anko.layoutInflater
import java.util.*
import kotlin.math.ceil


class SearchResultAdapter(internal val context: Context, var searchList: List<Data>?) :
        RecyclerView.Adapter<SearchResultAdapter.ViewHolder>() {
    private val TAG = "SearchResultAdapter"
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        val binding = ItemSearchResultBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return searchList?.size ?: 0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val search = searchList!![pos]
        holder.binding.textViewHotel.text = search.name
        if (search.averageRating ?: 0 > 0) {
            holder.binding.textViewRating.text = search.averageRating?.toString()
            holder.binding.textViewRating.visibility = View.VISIBLE
        } else
            holder.binding.textViewRating.visibility = View.INVISIBLE
        holder.binding.imageViewSheild.visibility = View.GONE
        search.assessment?.let {
            if (it.result == "Pass") {
                holder.binding.imageViewSheild.visibility = View.VISIBLE
            } else {
                holder.binding.imageViewSheild.visibility = View.GONE
            }
        }

        holder.binding.textViewHotelName.text =
                if (search.distanceFromSearchedSuburb.isNullOrEmpty()) "${search.suburb}" else
                    "${search.suburb} - ${search.distanceFromSearchedSuburb}km away"
//        val price =   search.lowestPrice?.toDoubleOrNull()?.toInt()
        val creditPerHour = if (search.lowestPrice.isNullOrEmpty()) 0 else ceil(
                search.lowestPrice.toDouble().div(0.3) ?: 0.0
        ).toInt()
        if (creditPerHour != 0) {
            holder.binding.textViewPrice.text = creditPerHour.toString()
            holder.binding.linearLayoutCompat9.visibility = View.VISIBLE
        } else {
            holder.binding.linearLayoutCompat9.visibility = View.INVISIBLE
        }
        val availbleWorkspace = if (search.totalAvailable ?: 0 > 1) "${search.totalAvailable ?: 0} workspaces Available" else "${search.totalAvailable ?: 0} workspace available"
        val typesWorkspace = if (search.workspaceCount ?: 0 > 1) "${search.workspaceCount ?: 0} workspace Types" else "${search.workspaceCount ?: 0} workspace type"
        holder.binding.textViewTotalSpace.text = ("$availbleWorkspace | $typesWorkspace").toLowerCase(Locale.getDefault())

        holder.binding.textViewType.visibility = View.INVISIBLE
        search.venueType?.type?.let {
            holder.binding.textViewType.visibility = View.VISIBLE
            holder.binding.textViewType.text = it
        }
        val width = context.displayMetrics.widthPixels
        val height = context.resources.getDimension(R.dimen._160sdp).toInt()
        holder.binding.imageViewpager.layoutParams = ConstraintLayout.LayoutParams(width, height)
        holder.binding.imageViewpager.adapter = ImageSliderAdapter(context, search.images
                ?: emptyList(), width, height)

        val spcesPriceList = search.spaces?.map { (it.price ?: "0.00").toFloat() }
        val user = AppPreferences.getInstance(context)?.user?.user
        if (user != null) {
            Log.e(TAG, "onBindViewHolder: free_space ${user.plan?.free_space}")
            if (user.plan?.free_space.equals("yes", true)) {
                if (creditPerHour != 0) {
                    holder.binding.textViewFree.visibility = View.INVISIBLE
                    holder.binding.textViewHotel.text = search.name
                } else {
                    holder.binding.textViewFree.visibility = View.VISIBLE
                    holder.binding.textViewHotel.text = search.name
                }
                holder.binding.searchItem.setOnClickListener {
                    itemClick?.invoke("venue", pos)
                }
                holder.binding.imageViewpager.setOnClickListener {
                    itemClick?.invoke("venue", pos)
                }
            } else {
                if (!spcesPriceList.isNullOrEmpty()) {
                    Log.e(TAG, "onBindViewHolder: spcesPriceList ${spcesPriceList?.toJson()}")
                    val sum = spcesPriceList.sum()
                    Log.e(TAG, "onBindViewHolder: sum ${sum}")
                    if (sum ?: 0f > 0f) {
                        holder.binding.textViewFree.visibility = View.INVISIBLE
                        holder.binding.textViewHotel.text = search.name
                        holder.binding.searchItem.setOnClickListener {
                            itemClick?.invoke("venue", pos)
                        }
                        holder.binding.imageViewpager.setOnClickListener {
                            itemClick?.invoke("venue", pos)
                        }
                    } else {
                        holder.binding.textViewHotel.text = search.name
                        holder.binding.textViewFree.visibility = View.INVISIBLE
                        holder.binding.searchItem.setOnClickListener {
                            itemClick?.invoke("plan", pos)
                        }
                        holder.binding.imageViewpager.setOnClickListener {
                            itemClick?.invoke("plan", pos)
                        }
                    }
                }
            }
        } else {
            if (!spcesPriceList.isNullOrEmpty()) {
                Log.e(TAG, "onBindViewHolder: spcesPriceList ${spcesPriceList.toJson()}")
                val sum = spcesPriceList.sum()
                Log.e(TAG, "onBindViewHolder: sum $sum")
                if (sum ?: 0f > 0f) {
                    holder.binding.textViewFree.visibility = View.INVISIBLE
                    holder.binding.textViewHotel.text = search.name
                    holder.binding.searchItem.setOnClickListener {
                        itemClick?.invoke("venue", pos)
                    }
                    holder.binding.imageViewpager.setOnClickListener {
                        itemClick?.invoke("venue", pos)
                    }
                } else {
                    holder.binding.textViewHotel.text = "FREE SPACE"
                    holder.binding.imageViewSheild.visibility = View.GONE
                    holder.binding.textViewFree.visibility = View.VISIBLE
                    holder.binding.searchItem.setOnClickListener {
                        itemClick?.invoke("login", pos)
                    }
                    holder.binding.imageViewpager.setOnClickListener {
                        itemClick?.invoke("login", pos)
                    }
                }
            }
        }

        holder.binding.imageViewNext.setOnClickListener {
            holder.binding.imageViewpager.arrowScroll(View.FOCUS_RIGHT)
        }
        if (!search.images.isNullOrEmpty() && search.images.size > 1)
            holder.binding.imageViewNext.visibility = View.VISIBLE
        else
            holder.binding.imageViewNext.visibility = View.INVISIBLE


    }

    var itemClick: ((to: String, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemSearchResultBinding) : RecyclerView.ViewHolder(binding.root)

}
