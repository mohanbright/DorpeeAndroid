package com.droid.dorpee.ui.personaldashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemPastBinding
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import org.jetbrains.anko.layoutInflater
import java.text.ParseException
import java.text.SimpleDateFormat


class PastAdapter(internal val context: Context, var pastBooking: ArrayList<MDBooking>) :
    RecyclerView.Adapter<PastAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): PastAdapter.ViewHolder {
        val binding = ItemPastBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pastBooking.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val booking = pastBooking[pos]

        holder.binding.nameTV.text = booking.space?.name?:""
        holder.binding.venue.text = "At ${booking?.space?.venue?.name?:""}"
        holder.binding.tvAddress.text = booking.space?.venue?.address
        holder.binding.tvAddress.text =
                "${booking.space?.venue?.address?:""} , ${booking.space?.venue?.suburb} ${booking.space?.venue?.state?:""} ${booking.space?.venue?.postcode?:""}"

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

        holder.binding.mapIV.setOnClickListener {
            itemClick?.invoke(0, booking, pos)
        }

        holder.binding.buttonStay.setOnClickListener {
            itemClick?.invoke(1, booking, pos)
        }
    }

    var itemClick: ((type: Int, booking: MDBooking, pos: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemPastBinding) : RecyclerView.ViewHolder(binding.root)

    fun setSelected(list: ArrayList<MDBooking>) {
        pastBooking.clear()
        pastBooking.addAll(list)
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

