package com.droid.dorpee.ui.booking.frags

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBookingStep3Binding
import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel
import com.droid.dorpee.ui.personaldashboard.personalItem.BookingsActivity
import com.droid.dorpee.ui.personaldashboard.personalItem.TopUpActivity
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import com.squareup.picasso.Picasso
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.ceil

class BookingStep3Fragment : BaseFragment() {
    private var dateis: String = ""
    private var monthis: String = ""
    private var formatedDate: String = ""
    private var workspaces: Int? = null
    private var numberPeoples: Int? = null
    private var txtWorkspace: String = "workspaces"
    private var txtCapacity: String = "people"
    private var credit: Double = 0.0
    private lateinit var binding: FragmentBookingStep3Binding
    var viewModel: BookingStepsViewModel? = null
    private var date: String = ""
    var openingTime: String = "9:00"
    var closingTime: String = "9:00"
    var selectedDate: String? = ""
    var AselectedDate: String = ""
    var actualHours: Int = 0
    var fromUpcomming: Boolean? = false
    var bookingId: String = ""

    var space: Space? = null
    override fun bindData() {
        val listOfTab = arrayListOf(false, false, true)
        (context as BookingActivity).setUpTabline(listOfTab)
        space?.images?.first {
            Picasso.get().load(it).into(binding.imageViewSpace)
            true
        }
        var venue: String = ""
        val sConditions = scondition?.split("+")
        if (sConditions != null) {
            if (!sConditions.isEmpty()) {
                venue = sConditions[0]
                date = sConditions[1]
                openingTime = sConditions[2]
                closingTime = sConditions[3]
            }
        }
        openingTime = AppPreferences.getInstance(requireContext())!!.getOpeningDate()
        closingTime = AppPreferences.getInstance(requireContext())!!.getClosingDate()
        selectedDate = AppPreferences.getInstance(requireContext())!!.getSelectedDate()
        val actualDate = selectedDate!!.split("/").toTypedArray()

        if(!actualDate.equals("")){
            if (actualDate[0].toInt()<10){
                actualDate[0]="0"+actualDate[0]
            }
            if (actualDate[1].toInt()<10){
                actualDate[1] ="0"+actualDate[1]
            }

            AselectedDate = actualDate[1]+"/"+actualDate[0]+"/"+actualDate[2]
        }

        binding.textViewName.text = space?.name ?: ""
//        val venueStr = venue.split(",").toTypedArray()
//        binding.textViewAt.text = "at ${venueStr[0]}"

        binding.textViewAt.text = "at " + AppPreferences.getInstance(requireContext())?.getVenueName()


        val creditPerHour = if (space?.price.isNullOrEmpty()) 0 else ceil(
                space?.price?.toDouble()!!.div(0.3)).toInt()

        workspaces = AppPreferences.getInstance(requireContext())?.getWorkSpaces()
        numberPeoples = AppPreferences.getInstance(requireContext())?.getNumberPeople()
        setEstimatedData()
        try {
            val open_str = openingTime.split(":").toTypedArray()
            val close_str = closingTime.split(":").toTypedArray()
            var hours = close_str[0].toInt() - open_str[0].toInt()
            var minutes = close_str[1].toInt() - open_str[1].toInt()
            Log.e("The minimum", "Minimum Booking Hours " + space?.minBookingHours!!)
            if (space?.minBookingHours != null) {
                if (hours < space?.minBookingHours!!)
                    hours = space?.minBookingHours!!
            }
            binding.textViewPrice.setText("" + creditPerHour)
            val finalMin = hours * 60 + minutes
            credit = finalMin * (creditPerHour.toDouble() / 60) * workspaces!!
        } catch (e: Exception) {

        }

        binding.textViewCreidt.setText("" + credit.toInt().toString())
        binding.tvDate.text = "$selectedDate $openingTime $closingTime"
        setEmployeData()
    }

    var scondition: String? = null

    override fun initListeners() {
        binding.buttonBook.setOnClickListener {
            if (fromUpcomming!!) {
                if (AppPreferences.getInstance(requireContext())?.getIsCompanyEmployee()!!) {
                    viewModel?.editBookingEmployee(
                            RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                            editBookingEmployeeRequest(space?.id, AselectedDate
                                    , Datavalidator(space?.updatedAt), openingTime + ":00",
                                    closingTime + ":00", "employer",
                                    AppPreferences.getInstance(requireContext())?.getEmpId(),"PUT", credit.toInt(),
                                    workspaces, numberPeoples), requireContext(), requireActivity(), this, bookingId)
                }
                else {
                    viewModel?.editBookingpersonal(
                                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                            editBookingPersonalRequest(space?.id, AselectedDate
                                        , Datavalidator(space?.updatedAt), openingTime + ":00",
                                        closingTime + ":00", "customer",
                                        AppPreferences.getInstance(requireContext())?.getEmpId(), "PUT",credit.toInt(),
                                        workspaces, numberPeoples), requireContext(), requireActivity(), this, bookingId)
                }
            }
            else{
            if (AppPreferences.getInstance(requireContext())?.getIsCompanyEmployee()!!) {
                viewModel?.createBookingEmployee(
                        RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                        createBookingEmployeeRequest(space?.id,AselectedDate
                                , Datavalidator(space?.updatedAt), openingTime + ":00",
                                closingTime + ":00", "employer",
                                AppPreferences.getInstance(requireContext())?.getEmpId(), credit.toInt(),
                                workspaces, numberPeoples), requireContext(), requireActivity(), this)
            }else{
                viewModel?.createBookingPersonal(
                        RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                        createBookingPersonalRequest(space?.id,AselectedDate
                                , Datavalidator(space?.updatedAt), openingTime + ":00",
                                closingTime + ":00", "customer", credit.toInt(),
                                workspaces, numberPeoples), requireContext(), requireActivity(), this)
            }
            }
        }

        binding.buttonCredit.setOnClickListener {
            val i = Intent(activity, TopUpActivity::class.java)
            i.putExtra("isFromBooking", true)
            startActivityForResult(i, 1)
        }
    }

   public fun openBookingScreen(){
        startActivity(Intent(requireActivity(), BookingsActivity::class.java))
    }

    companion object {
        fun newInstance(space: Space, scondition: String, fromUpcomming: Boolean, bookingId: String?): BookingStep3Fragment {
            val args = Bundle()
            args.putSerializable("space", space)
            args.putString("scondition", scondition)
            args.putBoolean("fromUpcomming",fromUpcomming)
            args.putString("bookingId",bookingId)
            val fragment = BookingStep3Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(BookingStepsViewModel())
        return ViewModelProvider(this, provider).get(BookingStepsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookingStep3Binding.inflate(layoutInflater)
        scondition = arguments?.getString("scondition") as String
        space = arguments?.getSerializable("space") as Space
        fromUpcomming = arguments?.getBoolean("fromUpcomming",false)
        bookingId = arguments?.getString("bookingId").toString()
        viewModel = setUpVM() as BookingStepsViewModel
//        val myDouble = java.lang.Double.valueOf(space!!.price!!)
//        val value = Integer.valueOf(myDouble.toInt())
//        binding.textViewPrice.setText(""+ value)
        binding.tvTotalCredits.setText("Available Credits: "+AppPreferences.getInstance(requireContext())?.getRemainingCredit())
        return binding.root
    }

    override fun onResume() {
        super.onResume()
    }

    fun Datavalidator(dateStr: String?): String {
        val formatter: DateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date: Date = formatter.parse(dateStr) as Date
        val cal: Calendar = Calendar.getInstance()
        cal.setTime(date)
        if (cal.get(Calendar.DATE) < 10) {
            dateis = "0" + cal.get(Calendar.DATE).toString()
        } else {
            dateis = cal.get(Calendar.DATE).toString()
        }
        if ((cal.get(Calendar.MONTH) + 1) < 10) {
            monthis = "0" + (cal.get(Calendar.MONTH) + 1).toString()
        } else {
            monthis = (cal.get(Calendar.MONTH) + 1).toString()
        }
        formatedDate = monthis + "/" + dateis + "/" + cal.get(Calendar.YEAR)
        return formatedDate
    }

    @SuppressLint("SetTextI18n")
    fun setEstimatedData() {
        if (workspaces!! <= 1) {
            txtWorkspace = "workspace"
        }
        if (numberPeoples!! <= 1) {
            txtCapacity = "person"
        }
        binding.tvEstimate.setText("You are booking " + workspaces + " " + txtWorkspace + " for " + numberPeoples + " " + txtCapacity + ".")
    }

    @SuppressLint("SetTextI18n")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e("Data is siss ", "OnActvityForResult : " + requestCode)
        if (requestCode == 1) {
            binding.tvTotalCredits.setText("Available Credits: " + AppPreferences.getInstance(requireContext())?.getRemainingCredit())
        }
    }

    @SuppressLint("SetTextI18n")
    fun showDialog() {
        val dialog = Dialog(requireContext())
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.layout_dialog)
        val body = dialog.findViewById(R.id.tv_message) as TextView
        val tvmsg = dialog.findViewById(R.id.tv_confirm) as TextView
        body.setText("Employer does not have enough credits to place the booking.")
        tvmsg.setText("Confirmation")
        val yesBtn = dialog.findViewById(R.id.yes_button) as TextView
        val noBtn = dialog.findViewById(R.id.no_button) as TextView
        yesBtn.setText("Book as Personal")
        noBtn.setText("Cancel Booking")
        yesBtn.setOnClickListener {
            dialog.dismiss()
            bookAsPersonal()
        }
        noBtn.setOnClickListener {
            dialog.dismiss()
            requireActivity().onBackPressed()
        }
        dialog.setCancelable(false)
        dialog.show()
    }

    fun setEmployeData() {
        if (AppPreferences.getInstance(requireContext())?.getIsCompanyEmployee()!!) {
            if (AppPreferences.getInstance(requireContext())?.getEmpCredits()!! < credit) {
                showDialog()
            } else {
                binding.tvTotalCredits.setText("Charge to : " + AppPreferences.getInstance(requireContext())?.getEmployeeCompany())
                binding.buttonCredit.visibility = View.INVISIBLE
            }
        } else {
            binding.tvTotalCredits.setText("Available Credits: " + AppPreferences.getInstance(requireContext())?.getRemainingCredit())
            binding.buttonCredit.visibility = View.VISIBLE
        }
    }

    fun bookAsPersonal(){
        AppPreferences.getInstance(requireContext())?.setIsCompanyEmployee(false)
        setEmployeData()
    }

}