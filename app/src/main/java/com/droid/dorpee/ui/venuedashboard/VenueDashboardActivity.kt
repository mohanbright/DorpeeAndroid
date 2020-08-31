package com.droid.dorpee.ui.venuedashboard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityVenueDashboardBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.PersonalDashboardActivity
import com.droid.dorpee.ui.personaldashboard.adapter.DashItem
import com.droid.dorpee.ui.personaldashboard.adapter.PersonalDashboardAdapter
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.venuedashboard.venueItem.*
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import java.util.*

class VenueDashboardActivity : BaseActivity(), View.OnClickListener {
    private var earnedThisTime ="Earned This Week"
    private var timeType: String = "weekly"
    private var selectVenueId: Int = 0
    private lateinit var binding: ActivityVenueDashboardBinding
    private var user: User? = null
    var viewModel: VenueDashViewModel? = null
    private  val TAG = "VenueDashboardActivity"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVenueDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueDashViewModel
        user = AppPreferences.getInstance(this)?.user?.user
        setUPdashList()
        attachObserver()
        val timeList = arrayListOf("This Week", "This Month", "This Year")
        getTimelyRevenue()
        binding.spinnerWeek.apply {
            setItems(timeList)
            selectItemByIndex(0)
            lifecycleOwner = this@VenueDashboardActivity
            setOnSpinnerItemSelectedListener<String> { index, text ->
                earnedThisTime = "Earned $text"
                timeList.map {
                    if (it == text) {
                        timeType = when (index) {
                            0 -> "weekly"
                            1 -> "monthly"
                            2 -> "yearly"
                            else -> "weekly"
                        }
                    }
                }
                getTimelyRevenue()
            }
        }

        viewModel?.getVenues(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
        viewModel?.getVenueDashboard(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))

    }

    override fun bindData() {
        user = AppPreferences.getInstance(this)?.user?.user
        Glide
                .with(this)
                .load(user?.avatar)
                .dontAnimate()
                .centerCrop()
                .circleCrop()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
        binding.textViewName.text = user?.fullName
        binding.textViewRole.text =
                if (user?.role != null && user?.role?.size ?: 0 > 0) user?.role?.get(0)?.title else ""


        if (user?.role != null && user?.role?.size ?: 0 > 0) {
            binding.textViewSwitch.visibility = View.GONE
            val roleList = user?.role?.map { it.id!! }
            if (!roleList.isNullOrEmpty() && roleList.contains(2)&& roleList.contains(3) ){
                binding.textViewSwitch.visibility = View.VISIBLE
            } else {
                binding.textViewSwitch.visibility = View.GONE
            }
        }
    }

    override fun onResume() {
        super.onResume()
        AppPreferences.getInstance(this)?.allVenueResponse?.data?.let { allList ->
            if (!allList.isNullOrEmpty()) {
                val list = allList.map { it.name ?: "" } as ArrayList<String>
                list.add(0, "All Venues")
                binding.spinnerVenues.apply {
                    setItems(list)
                    selectItemByIndex(0)
                    lifecycleOwner = this@VenueDashboardActivity
//                          selectItemByIndex(0)
                    setOnSpinnerItemSelectedListener<String> { index, text ->
                        if (index != 0) {
                            allList.map {
                                if (it.name == text) {
                                    selectVenueId = it.id!!
                                }
                            }
                        } else {
                            selectVenueId = 0
                        }
                        getTimelyRevenue()
                    }
                }
            }
        }
        val calendar = Calendar.getInstance(Locale.getDefault())
        val totolDays: Int = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        Log.e(TAG, "onCreate: days $totolDays  day $day")
        binding.circularProgressBar.max = totolDays
        binding.circularProgressBar.progress = day
        binding.circularProgressBar.animate()
    }

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.textViewLogOut.id -> {
                AppPreferences.getInstance(this)?.clearPreferenceData()
                startActivity(Intent(this, DashboardActivity::class.java))
                finishAffinity()
            }
            binding.textViewSwitch.id -> {
                startActivity(Intent(this, PersonalDashboardActivity::class.java))
                finish()
//                finishAffinity()
            }
            binding.backbtn.id -> {
                onBackPressed()
            }
        }
    }

    private fun attachObserver() {

        this.viewModel?.apiVenueDashboardResponse?.observe(this, Observer {
            binding.totalBookingTV.text = (it.data?.venues?.allBookings?.size ?: 0).toString()
            binding.activeVenueTV.text = (it.data?.venues?.activeVenues ?: 0).toString()
            binding.activeWorkspaceTV.text = (it.data?.venues?.activeSpaces ?: 0).toString()
        })
        this.viewModel?.apiAllVenuesResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.allVenueResponse = it
            AppPreferences.getInstance(this)?.allVenueResponse?.data?.let { allList ->
                if (!allList.isNullOrEmpty()) {
                    val list = allList.map { it.name!! } as ArrayList<String>
                    list.add(0, "All Venues")
                    binding.spinnerVenues.apply {
                        setItems(list)
                        selectItemByIndex(0)
                        lifecycleOwner = this@VenueDashboardActivity
//                          selectItemByIndex(0)
                        setOnSpinnerItemSelectedListener<String> { index, text ->
                            if (index != 0) {
                                allList.map {
                                    if (it.name == text) {
                                        selectVenueId = it.id!!
                                    }
                                }
                            } else {
                                selectVenueId = 0
                            }
                            getTimelyRevenue()
                        }
                        getTimelyRevenue()
                    }
                }
            }
        })

        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.viewModel?.apiVenueDurationResponse?.observe(this, Observer {
            showProgress(false)
            binding.progressBarearned.visibility =View.GONE
            it.data?.venues?.let {
                binding.textViewTimeType.text = earnedThisTime
                binding.earnedCreditsTV.text ="$${it.totalBookingsRevenue}"
                binding.hoursBookedTV.text ="${it.totalBookingsHours} Hours booked"
            }
        })
        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })
    }

    private fun getTimelyRevenue() {
        binding.progressBarearned.visibility =View.VISIBLE
        val header = RequestWithHeader(AppPreferences.getInstance(this@VenueDashboardActivity)?.user?.token)
        viewModel?.getVenueRevenue(header, timeType, selectVenueId)
    }

    private fun setUPdashList() {
        val listOfDash = arrayListOf<DashItem>()
        listOfDash.add(
                DashItem(
                        "Bookings",
                        R.drawable.ic_dorpee,
                        Intent(this, VenueBookingActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "My Venues",
                        R.drawable.ic_book_open_light,
                        Intent(this, MyVenueActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Manage Availability",
                        R.drawable.ic_clock_light,
                        Intent(this, AvailabilityActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Block Out Times",
                        R.drawable.ic_calendar,
                        Intent(this, BlockOutActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Statistics",
                        R.drawable.ic_chart,
                        Intent(this, StaticsActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Payment Details",
                        R.drawable.ic_crdits,
                        Intent(this, PaymentDetailsActivity::class.java)
                )
        )
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.orientation = GridLayoutManager.VERTICAL
        binding.dashList.layoutManager = layoutManager
        binding.dashList.adapter = PersonalDashboardAdapter(this, listOfDash)
        (binding.dashList.adapter as PersonalDashboardAdapter).itemClick = {
        }
    }

    private fun showProgress(it: Boolean?) {
        /*  it?.let {
              if (it) {
                  binding.loginLoader.visibility = View.VISIBLE
                  binding.register.visibility = View.INVISIBLE
              } else {
                  binding.loginLoader.visibility = View.INVISIBLE
                  binding.register.visibility = View.VISIBLE
              }
          }*/
    }

}
