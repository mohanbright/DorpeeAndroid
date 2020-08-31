package com.droid.dorpee.ui.personaldashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemUpcomingBinding
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import com.droid.dorpee.utils.preference.AppPreferences
import org.jetbrains.anko.layoutInflater
import java.text.ParseException
import java.text.SimpleDateFormat


class UpcomingAdapter(internal val context: Context, var bookingList: ArrayList<MDBooking>) :
    RecyclerView.Adapter<UpcomingAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): UpcomingAdapter.ViewHolder {
        val binding = ItemUpcomingBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bookingList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val booking = bookingList[pos]

        holder.binding.nameTV.text = booking.space?.name?:""
        holder.binding.venue.text = "At ${booking.space?.venue?.name?:""}"
        var strPeople = "person"
        if (booking?.no_of_people > 1) {
            strPeople = "people"
        }
        var strWorkspace = "workspace"
        if (booking?.no_of_booked_spaces > 1) {
            strWorkspace = "workspaces"
        }
        holder.binding.bookedForTV.text =
                "Booked for ${booking?.no_of_people?:0} ${strPeople} - ${booking?.no_of_booked_spaces?:0} ${strWorkspace}"
        holder.binding.usedCreditesTV.text = booking.credits.toString()
        holder.binding.textViewdate.text =
            formatDate(booking.end_date, booking.start_time, booking.end_time);
        holder.binding.imageVieId.clipToOutline = true
        if (booking.space?.images?.isNullOrEmpty() == false) {
            Glide
                .with(holder.binding.imageVieId.context)
                .load(booking.space.images[0])
                .centerInside()
                .placeholder(R.drawable.placeholder)
                .into(holder.binding.imageVieId);
        }
        if (booking.status.equals("Checked-In")) {
            holder.binding.buttonStay.visibility = View.VISIBLE
            holder.binding.buttonCheckin.text = "Check-Out"
        } else {
            holder.binding.buttonStay.visibility = View.GONE
        }

        if (booking.status.equals("Scheduled")) {
            holder.binding.buttonCheckin.text = "Check-In"
            holder.binding.buttonCheckin.visibility = View.VISIBLE
            holder.binding.imageViewCancel.visibility = View.VISIBLE
            holder.binding.imageViewEdit.visibility = View.VISIBLE
        } else {
            holder.binding.imageViewCancel.visibility = View.GONE
            holder.binding.imageViewEdit.visibility = View.GONE
        }

        if (booking.status.equals("Checked-Out") || booking.status.equals("Cancelled")) {
            holder.binding.buttonCheckin.text = "Rebook"
        }

        holder.binding.imageViewCancel.setOnClickListener {
            itemClick?.invoke("cancel", booking, pos)
        }


        holder.binding.imageViewEdit.setOnClickListener {
            itemClick?.invoke("edit", booking, pos)
        }

        holder.binding.buttonCheckin.setOnClickListener {
            itemClick?.invoke(holder.binding.buttonCheckin.text.toString(), booking, pos)
        }

        holder.binding.buttonStay.setOnClickListener {
            itemClick?.invoke("extend-stay", booking, pos)
        }

        holder.binding.mapIV.setOnClickListener {
            itemClick?.invoke("map", booking, pos)
        }

    }

    var itemClick: ((type: String, booking: MDBooking, position: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemUpcomingBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDBooking>) {
        bookingList.clear()
        bookingList.addAll(list)
        notifyDataSetChanged()
    }

    @SuppressLint("SimpleDateFormat")
    fun formatDate(date: String?, startTime: String?, endTiem: String?): String {
        try {
            val dateFormat = SimpleDateFormat("MM/dd/yyyy");
            val endFormat = SimpleDateFormat("dd MMM, yyyy");
            val timeFormat = SimpleDateFormat("hh:mm:ss");
            val endTimeFormat = SimpleDateFormat("hh:mm a");
            val formattedEndDate = endFormat.format(dateFormat.parse(date!!)!!)
            val formattedStartTime = endTimeFormat.format(timeFormat.parse(startTime!!)!!)
            val formattedEndTime = endTimeFormat.format(timeFormat.parse(endTiem!!)!!)
            return String.format(
                    "%s %s - %s",
                    formattedEndDate +"-",
                    formattedStartTime,
                    formattedEndTime
            )
        } catch (e: ParseException) {
            e.printStackTrace()
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }
        return ""
    }


}

