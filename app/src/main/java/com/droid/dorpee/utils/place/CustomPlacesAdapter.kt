package com.droid.dorpee.utils.place


import `in`.madapps.placesautocomplete.model.Place
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.droid.dorpee.R
import com.droid.dorpee.utils.NEAR_ME

/**
 * Created by mukeshsolanki on 28/02/19.
 */
class CustomPlacesAdapter(mContext: Context, val placesApi: CustomPlaceApi, val addNearME
: Boolean = true) :
        ArrayAdapter<Place>(mContext, R.layout.autocomplete_list_item), Filterable {

    var resultList: ArrayList<Place>? = ArrayList()

    override fun getCount(): Int {
        return when {
            resultList.isNullOrEmpty() -> 0
            else -> resultList?.size ?: 0
        }
    }

    override fun getItem(position: Int): Place? {
        try {
            return when {
                resultList.isNullOrEmpty() -> null
                else -> resultList?.get(position)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val viewHolder: ViewHolder
        if (view == null) {
            viewHolder = ViewHolder()
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.autocomplete_list_item, parent, false)
            viewHolder.description = view.findViewById(R.id.autocompleteText) as TextView
            viewHolder.footerImageView = view.findViewById(R.id.footerImageView) as ImageView
            view.tag = viewHolder
//            resultList?.add()
        } else {
            viewHolder = view.tag as ViewHolder
        }
        val place = resultList!![position]
        bindView(viewHolder, place, position)
        return view!!
    }

    private fun bindView(viewHolder: ViewHolder, place: Place, position: Int) {

        if (!resultList.isNullOrEmpty()) {
            if (position != resultList!!.size - 1) {
                viewHolder.description?.text = place.description
                viewHolder.footerImageView?.visibility = View.GONE
                viewHolder.description?.visibility = View.VISIBLE
            } else {
                viewHolder.footerImageView?.visibility = View.VISIBLE
                viewHolder.description?.visibility = View.GONE
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                if (results != null && results.count > 0) {
                    notifyDataSetChanged()
                } else {
                    notifyDataSetInvalidated()
                }
            }

            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filterResults = FilterResults()
                if (!constraint.isNullOrEmpty()) {
                    if (constraint.isBlank()) {
                        resultList = ArrayList()
                        resultList?.add(Place("-1", "footer"))
                        if (addNearME) {
                            resultList?.add(0, Place(NEAR_ME, NEAR_ME))
                        }
                    } else {
                        resultList = placesApi.autocomplete(constraint.toString())
                        resultList?.add(Place("-1", "footer"))
                        if (addNearME)
                            resultList?.add(0, Place(NEAR_ME, NEAR_ME))
                    }
                    filterResults.values = resultList
                    filterResults.count = resultList!!.size
                } else {
                    resultList = ArrayList()
                    resultList?.add(Place("-1", "footer"))
                    if (addNearME) {
                        resultList?.add(0, Place(NEAR_ME, NEAR_ME))
                    }
                    filterResults.values = resultList
                    filterResults.count = resultList!!.size
                }
                return filterResults
            }
        }
    }

    internal class ViewHolder {
        var description: TextView? = null
        var footerImageView: ImageView? = null
    }

}
