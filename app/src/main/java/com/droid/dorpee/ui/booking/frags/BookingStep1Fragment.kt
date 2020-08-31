package com.droid.dorpee.ui.booking.frags

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBookingStep1Binding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.booking.model.EmployeeList
import com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel
import com.droid.dorpee.ui.search.model.BookingValidation
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.skydoves.powerspinner.IconSpinnerAdapter
import com.skydoves.powerspinner.IconSpinnerItem
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener
import com.squareup.picasso.Picasso
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import okhttp3.RequestBody
import java.util.*
import kotlin.math.ceil


class BookingStep1Fragment : BaseFragment() {
    private lateinit var binding: FragmentBookingStep1Binding
    var viewModel: BookingStepsViewModel? = null
    private var date: String = ""
    var openingTime: String = "9:00"
    var closingTime: String = "9:00"
    var space: Space? = null
    var scondition: String? = null
    var spinVenue: String? = null
    var validata: BookingValidation? = null
    var availability: String = "false"
    var max_available: Int = 0;
    var workspace_msg: String = ""
    var positionSelected: Int = 0
    var minHour:String? = null
    var maxHour: String? = null
    var isFromRebook:Boolean? = false
    var isFromUpcomming:Boolean? = false
    var numberWorkspace: String =""
    var numberPeople: String = ""
    var bookingId : String = "0"

    companion object {
        fun newInstance(space: Space, scondition: String, isFromRebook: Boolean, isFromupcomming: Boolean, numberPeople: String, numberWorkspace: String, bookingId: String): BookingStep1Fragment {
            val args = Bundle()
            args.putSerializable("space", space)
            args.putString("scondition", scondition)
            args.putBoolean("isFromRebook",isFromRebook)
            args.putString("isnumberPeople",numberPeople)
            args.putBoolean("isFromUpcomming",isFromupcomming)
            args.putString("isnumberWorkspace",numberWorkspace)
            args.putBoolean("isFromUpcomming",isFromupcomming)
            args.putString("bookingId",bookingId)
            val fragment = BookingStep1Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    @SuppressLint("SetTextI18n")
    override fun bindData() {
        val listOfTab = arrayListOf(true, false, false)
        (context as BookingActivity).setUpTabline(listOfTab)

        space?.images?.first {
            Picasso.get().load(it).into(binding.imageViewSpace)
            true
        }
        var venue: String = ""
        var sConditions = scondition?.split("+")
        if (sConditions != null) {
            if (!sConditions.isEmpty()) {
                venue = sConditions[0]
                date = sConditions[1]
                openingTime = sConditions[2]
                closingTime = sConditions[3]
                if (AppPreferences.getInstance(requireContext())!!.getSelectedDate().equals("")){
                    AppPreferences.getInstance(requireContext())!!.setSelectedDate(date);
                }
            }
        }
        binding.textViewName.text = space?.name ?: ""


        val creditPerHour = if (space?.price.isNullOrEmpty()) 0 else ceil(
                space?.price?.toDouble()!!.div(0.3)).toInt()

        val venueStr = venue.split(",").toTypedArray()
//        binding.textViewAt.text = "at ${venue.[0]}"

        binding.textViewAt.text = "at " +AppPreferences.getInstance(requireContext())?.getVenueName()

        binding.textViewPrice.text = creditPerHour.toString()

        if (!isFromRebook!!){
            binding.fromTimeId.text = openingTime
            binding.toTimeId.text = closingTime
        }
        binding.dateId.text = date
        if (space?.minBookingHours!! > 0 ){
            if (space?.minBookingHours ==1){
                minHour =   " Min " +space?.minBookingHours+ "hour "
            }else{
                minHour =   " Min " +space?.minBookingHours+ " hours "
            }
        }
        if (space?.maxBookingHours!! > 0 ){
            if (space?.maxBookingHours ==1){
                maxHour =   " Min " +space?.maxBookingHours+ " hour "
            }else{
                maxHour =   " Max " +space?.maxBookingHours+ " hours "
            }
        }
        binding.tvTime.text = "Booking Period -"+ minHour +"|"+ maxHour
        binding.textViewCapcity.text = "Capacity: " + space?.capacity ?: ""

        setWorkspaceAvailability()
//        binding.spinnerVenues.apply {
//            setOnSpinnerItemSelectedListener<String> { index, text ->
//                if (index != 0) {
//                    spinVenue = "Personal"
//                    Log.e("spinVenue", "Personal"+"  "+text)
//                } else {
//                    spinVenue = ""
//                }
//            }
//        }
       // setEmployeeList()


        binding.editTextNopeople.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.e("The add ", "onTextChanged : " + s + " " + start + " " + before + " " + count)
                if (s != null && !s.equals("") && !s.isEmpty()) {
                    setButtonAvailabilityCapacity(s.toString().toInt(), space?.capacity);
                }
            }
        })
        binding.editTextNoOFWorkSpace.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.e("The add ", "onTextChanged : " + s + " " + start + " " + before + " " + count)
                if (s != null && !s.equals("") && !s.isEmpty()) {
                    setButtonAvailability(s.toString().toInt(), max_available!!);
                }
            }
        })
        viewModel?.getEmployeeList(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                requireContext(), this)
    }

    override fun initListeners() {
        binding.buttonNext.setOnClickListener {
            setvalidTime()
            /*if (max_available > 0) {
                (context as BookingActivity).loadFragment(BookingStep2Fragment.newInstance(space!!, scondition!!))
            } else {
                showSnackBarCustom(
                        workspace_msg,
                        binding.alertView,
                        ContextCompat.getColor(requireContext(), R.color.colorError)
                )
            }*/
        }

        binding.fromLayout.setOnClickListener {
            val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                openingTime = String.format("%02d:%02d", hourOfDay, minute)
                binding.fromTimeId.setText(openingTime)
                Log.e("Selected ", "openingTime  is " + openingTime)
                AppPreferences.getInstance(requireContext())!!.setOpeningDate(openingTime)
                 setWorkspaceAvailability()
            }, 12, 0, 0, false)
            dpd.show(childFragmentManager, "DatepickerFromdialog")

        }

        binding.toLayout.setOnClickListener {
            val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                closingTime = String.format("%02d:%02d", hourOfDay, minute)
                binding.toTimeId.setText(closingTime)
                setWorkspaceAvailability()
                Log.e("Selected ", "Closing Time is " + closingTime)
                AppPreferences.getInstance(requireContext())!!.setclosingDate(closingTime)
            }, 12, 0, 0, false)
            dpd.show(childFragmentManager, "DatepickerTodialog")

        }
        binding.dateLayout.setOnClickListener {
            val dpd = DatePickerDialog.newInstance { view, year, monthOfYear, dayOfMonth ->
                date = "$dayOfMonth/${monthOfYear + 1}/$year"
                binding.dateId.text = date
                setWorkspaceAvailability()
                Log.e("Selected ", "Selected Date is " + date)
                AppPreferences.getInstance(requireContext())!!.setSelectedDate(date)

            }

            dpd.locale = Locale.getDefault()
            val calender = Calendar.getInstance()
            val today = calender.timeInMillis
            val previousDays = Date(today - 1000)
            dpd.minDate=(toCalendar(previousDays))
            dpd.show(childFragmentManager, "Datepdialog")
        }
    }

    fun toCalendar(date: Date?): Calendar? {
        val cal = Calendar.getInstance()
        cal.time = date
        return cal
    }
    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(BookingStepsViewModel())
        return ViewModelProvider(this, provider).get(BookingStepsViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {

        binding = FragmentBookingStep1Binding.inflate(layoutInflater)
        isFromRebook = arguments?.getBoolean("isFromRebook",false)

        numberPeople = arguments?.getString("isnumberPeople").toString()
        numberWorkspace = arguments?.getString("isnumberWorkspace").toString()
        numberWorkspace = arguments?.getString("isnumberWorkspace").toString()
        isFromUpcomming = arguments?.getBoolean("isFromUpcomming",false)
        bookingId = arguments?.getString("bookingId").toString()
        if (isFromUpcomming!!){
            binding.editTextNoOFWorkSpace.setText(numberWorkspace.toString())
            binding.editTextNopeople.setText(numberPeople.toString())
        }

        scondition = arguments?.getString("scondition") as String
        space = arguments?.getSerializable("space") as Space
        viewModel = setUpVM() as BookingStepsViewModel
        return binding.root
    }


    override fun onResume() {
        super.onResume()
    }

    fun setWorkspaceAvailability() {
        if (isNetworkAvailable()) {
            val mapList = HashMap<String, RequestBody>()
            mapList["date"] = createPartFromString(date)
            mapList["opening_time"] = createPartFromString(openingTime)
            mapList["closing_time"] = createPartFromString(closingTime)
            mapList["space_id"] = createPartFromString(space?.id.toString())
            viewModel?.validateBooking(mapList,this)
        } else {
            showSnackBarCustom(
                    getString(R.string.network_unavailble),
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        }
        viewModel?.apiBookingValidate?.observe(requireActivity(), androidx.lifecycle.Observer {
            validata = it.data
            availability = it.data.availability.toString()
            max_available = it.data.max_available!!
            workspace_msg = it.data.message.toString()
            binding.textViewspces.text = "Workspaces: " + (it.data.max_available ?: "0")
            if (max_available == 0) {
                binding.tvMessageWS.visibility = View.VISIBLE
                binding.tvMessageWS.setText(workspace_msg)
            } else {
                binding.tvMessageWS.visibility = View.GONE
            }
        })
    }

    fun setButtonAvailability(enterValue: Int?, capacity: Int?) {
        if (enterValue!! <= capacity!!) {
            binding.buttonNext.visibility = View.VISIBLE
            AppPreferences.getInstance(requireContext()!!)?.setWorkSpaces(enterValue)
        } else {
            binding.buttonNext.visibility = View.INVISIBLE
        }
    }

    fun setEmpData(position: Int, text: String, employeeList: List<EmployeeList>) {
            AppPreferences.getInstance(requireContext())?.setIsCompanyEmployee(true)
            AppPreferences.getInstance(requireContext())?.setEmployeeCompany(text)
        AppPreferences.getInstance(requireContext())?.setEmpId(employeeList[position].pivot.employer_id)
        AppPreferences.getInstance(requireContext())?.setEmpCredits(employeeList[position].employer_credits)
    }


    fun setButtonAvailabilityCapacity(enterValue: Int?, capacity: Int?) {
        if (enterValue!! <= capacity!!) {
            binding.buttonNext.visibility = View.VISIBLE
            binding.tvErrCapacity.visibility = View.GONE
            AppPreferences.getInstance(requireContext()!!)?.setNumberPeople(enterValue)
        } else {
            binding.buttonNext.visibility = View.INVISIBLE
            binding.tvErrCapacity.visibility = View.VISIBLE
        }
    }

    public  fun setEmployeeList() {
        val iconSpinnerItems: MutableList<IconSpinnerItem> = ArrayList()
        iconSpinnerItems.add(IconSpinnerItem(null, "Personal"))

        var employeeList = viewModel?.apiEmployeeList?.value
        for (i in 0 until employeeList!!.size!!){
             iconSpinnerItems.add(IconSpinnerItem(null,employeeList!![i].company_name))
           }

        val iconSpinnerAdapter = IconSpinnerAdapter(binding.spinnerVenues)
        binding.spinnerVenues.setSpinnerAdapter(iconSpinnerAdapter)
        binding.spinnerVenues.setItems(iconSpinnerItems)
        binding.spinnerVenues.selectItemByIndex(0)
        binding.spinnerVenues.setOnSpinnerItemSelectedListener(object : OnSpinnerItemSelectedListener<IconSpinnerItem?> {
            override fun onItemSelected(position: Int, item: IconSpinnerItem?) {
                if (position>0){
                    setEmpData(position-1,item!!.text,employeeList)
                }else{
                    AppPreferences.getInstance(requireContext())?.setIsCompanyEmployee(false)
                }
            }
        })
    }

    fun setvalidTime(){
        if(!binding.toTimeId.text.toString().equals("") && !binding.fromTimeId.text.toString().equals("")){
            binding.tvMessageWS.visibility = View.GONE
            (context as BookingActivity).replaceFragment(BookingStep2Fragment.newInstance(space!!, scondition!!,isFromUpcomming!!,bookingId))
        }else{
            binding.tvMessageWS.visibility = View.VISIBLE
        }
    }

    public fun setAvailable(availability: String?) {
        if (!availability.equals("true")!!){
            binding.tvMessageWS.visibility = View.VISIBLE
            binding.buttonNext.visibility = View.INVISIBLE
        }
        else{
            binding.tvMessageWS.visibility = View.GONE
            binding.buttonNext.visibility = View.VISIBLE
        }
    }

}


