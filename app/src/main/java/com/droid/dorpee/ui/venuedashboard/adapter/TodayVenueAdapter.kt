package com.droid.dorpee.ui.venuedashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ItemVenueTodayBinding
import com.droid.dorpee.ui.venuedashboard.model.VenueBooking
import org.jetbrains.anko.layoutInflater
import java.text.ParseException
import java.text.SimpleDateFormat


class TodayVenueAdapter(internal val context: Context, var bookingList: ArrayList<VenueBooking>) :
        RecyclerView.Adapter<TodayVenueAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): TodayVenueAdapter.ViewHolder {
        val binding = ItemVenueTodayBinding.inflate(context.layoutInflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bookingList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val booking = bookingList[pos]
        holder.binding.customename.text = "${booking?.bookingAs?:""} : ${booking?.user?.fullName?:""}"

        holder.binding.phoneNo.text = booking?.user?.phoneNumber ?: ""
        holder.binding.nameTV.text = booking?.space?.name ?: ""
        holder.binding.venue.text = "At ${booking?.space?.venue?.name ?: ""}"
        var strPeople = "person"
        if (booking.noOfPeople?:0 > 1) {
            strPeople = "people"
        }
        var strWorkspace = "workspace"
        if (booking.noOfBookedSpaces?:0> 1) {
            strWorkspace = "workspaces"
        }
        holder.binding.bookedForTV.text =
                "Booked for ${booking?.noOfPeople ?: 0}  $strPeople - ${booking?.noOfBookedSpaces ?: 0}  $strWorkspace"
        holder.binding.textViewPaid.text = "Paid ${booking.amount ?: 0}"
        holder.binding.textViewdate.text =
                formatDate(booking.endDate, booking.startTime, booking.endTime);
        holder.binding.imageVieId.clipToOutline = true

            Glide
                    .with(holder.binding.profilePic.context)
                    .load(booking.user?.avatar ?: "")
                    .dontAnimate()
                    .centerCrop()
                    .circleCrop()
                    .placeholder(R.drawable.profile_holder)
                    .into(holder.binding.profilePic)
        if (booking.space?.images?.isNullOrEmpty() == false) {
            Glide
                    .with(holder.binding.imageVieId.context)
                    .load(booking.space.images[0])
                    .centerInside()
                    .placeholder(R.drawable.placeholder)
                    .into(holder.binding.imageVieId);
        } else {
            Glide
                    .with(holder.binding.imageVieId.context)
                    .load(R.drawable.placeholder)
                    .centerInside()
                    .placeholder(R.drawable.placeholder)
                    .into(holder.binding.imageVieId);
        }
        holder.binding.buttonStay.visibility = View.GONE
        holder.binding.imageViewCancel.visibility = View.GONE
        holder.binding.imageViewEdit.visibility = View.GONE
        when (booking.status) {
            "Checked-In" -> {
                holder.binding.buttonCheckin.text = "Check Out"
                holder.binding.buttonCheckin.visibility = View.VISIBLE

            }
            "Scheduled"-> {
                holder.binding.buttonCheckin.visibility = View.VISIBLE
                holder.binding.buttonCheckin.text = "Check In"
            }
            "Checked-Out" -> {
                holder.binding.buttonCheckin.visibility = View.GONE
                holder.binding.buttonCheckin.text = "Check In"

            }
            else -> {
            }
        }
        holder.binding.buttonCheckin.setOnClickListener {
            itemClick?.invoke(holder.binding.buttonCheckin.text.toString(), booking, pos)
        }

        holder.binding.mapIV.setOnClickListener {
            itemClick?.invoke("map", booking, pos)
        }

        holder.binding.phoneNo.setOnClickListener {
            itemClick?.invoke("phone", booking, pos)
        }

    }

    var itemClick: ((type: String, booking: VenueBooking, position: Int) -> Unit)? = null

    class ViewHolder(var binding: ItemVenueTodayBinding) : RecyclerView.ViewHolder(binding.root)

    fun setData(list: ArrayList<VenueBooking>) {
        bookingList.clear()
        bookingList.addAll(list)
        notifyDataSetChanged()
    }

    @SuppressLint("SimpleDateFormat")
    fun formatDate(date: String?, startTime: String?, endTiem: String?): String {
        try {
            val dateFormat = SimpleDateFormat("MM/dd/yyyy");
            val endFormat = SimpleDateFormat("dd MMM yyyy");
            val timeFormat = SimpleDateFormat("hh:mm:ss");
            val endTimeFormat = SimpleDateFormat("hh:mm");
            val formattedEndDate = endFormat.format(dateFormat.parse(date!!)!!)
            val formattedStartTime = endTimeFormat.format(timeFormat.parse(startTime!!)!!)
            val formattedEndTime = endTimeFormat.format(timeFormat.parse(endTiem!!)!!)
            return String.format(
                    "%s %s - %s",
                    formattedEndDate,
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
