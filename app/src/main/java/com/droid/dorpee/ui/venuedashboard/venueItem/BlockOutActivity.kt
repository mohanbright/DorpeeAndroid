package com.droid.dorpee.ui.venuedashboard.venueItem

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.Constraints
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityBlockOutBinding
import com.droid.dorpee.ui.BlockAvailbilityRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venuedashboard.model.BlockData
import com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.toJson
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import org.json.JSONArray
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*


class BlockOutActivity : BaseActivity(), View.OnClickListener {
    private var repeatType: String = "Daily"
    private var selectedDate: String = ""
    private val TAG = "BlockOutActivity"
    private lateinit var binding: ActivityBlockOutBinding
    var viewModel: VenueDashViewModel? = null
    private var selectVenueId: Int = 0
    private var selectSpaceId: Int = 0
    private var repeat = "no"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlockOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueDashViewModel

        AppPreferences.getInstance(this)?.allVenueResponse?.data?.let { allList ->
            if (!allList.isNullOrEmpty()) {
                val list = allList.map { it.name!! }
                selectVenueId = 0
                binding.spinnerVenues.apply {
                    setItems(list)
                    lifecycleOwner = this@BlockOutActivity
                    setOnSpinnerItemSelectedListener<String> { index, text ->
                        allList.map {
                            if (it.name == text) {
                                selectVenueId = it.id!!
                                setSpinnerWorkSpace(it.spaces)
                            }
                        }
                    }
                    if (list.isNotEmpty()) {
                        selectItemByIndex(0)
//                        selectVenueId = allList[0].id!!
//                        setSpinnerWorkSpace(allList[0].spaces)
                    }
                }
            }
        }
        setSpinnerTimetype()
        attachObserver()

    }

    private fun setSpinnerWorkSpace(spaces: List<Space>?) {
        spaces?.let { spaceList ->
            selectSpaceId = 0
            val list = spaceList.map { it.name!! }
            binding.spinnerSpace.apply {
                setItems(list)
                lifecycleOwner = this@BlockOutActivity
                setOnSpinnerItemSelectedListener<String> { index, text ->
                    spaceList.map {
                        if (it.name == text) {
                            selectSpaceId = it.id!!
                        }
                    }
                }
                if (list.isNotEmpty()) {
                    selectItemByIndex(0)
//                    selectSpaceId = spaceList[0].id!!
                }
            }
        }
    }

    private fun setSpinnerTimetype() {
        val lissst = arrayListOf("Daily", "Weekly", "Monthly")
        binding.textLayoutdaily.apply {
            setItems(lissst)
            selectItemByIndex(0)
            lifecycleOwner = this@BlockOutActivity
            setOnSpinnerItemSelectedListener<String> { _, text ->
                repeatType = text
            }
//            repeatType = lissst[0]
        }
    }

    override fun bindData() {
        val user = AppPreferences.getInstance(this)?.user?.user
        Glide
                .with(this)
                .load(user?.avatar)
                .dontAnimate()
                .centerCrop()
                .circleCrop()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {
        binding.imageViewProfilePic.setOnClickListener {
            onBackPressed()
        }
        binding.textEndTime.setOnClickListener {
            val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                binding.textEndTime.text = String.format("%02d:%02d:00", hourOfDay, minute)
            }, 20, 0, 0, true)
            dpd.show(supportFragmentManager, "textEndTimeTodialog")
        }
        binding.textStartTime.setOnClickListener {
            val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                binding.textStartTime.text = String.format("%02d:%02d:00", hourOfDay, minute)
            }, 20, 0, 0, true)
            dpd.show(supportFragmentManager, "textStartTimeTodialog")
        }
//        binding.textLayoutTimeFrame.visibility = View.GONE
        val layoutParams = binding.linearLayout.layoutParams
        layoutParams.height = 0
        binding.linearLayout.layoutParams  =layoutParams
        binding.switch3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                repeat = "yes"
                layoutParams.height = Constraints.LayoutParams.WRAP_CONTENT
                binding.linearLayout.layoutParams  =layoutParams

            } else {
                repeat = "no"
                layoutParams.height = 0
                binding.linearLayout.layoutParams  =layoutParams

            }
        }
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        selectedDate = dateFormat.format(binding.calendarView.date)
        binding.calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            Log.e(TAG, "onClick: $selectedDate")
            selectedDate = String.format("%02d/%02d/%04d", month + 1, dayOfMonth, year)
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
            binding.submit.id -> {
                val dateFormat = SimpleDateFormat("MM/dd/yyyy")
                Log.e(TAG, "onClick: $selectedDate")
                val selectedDateInMillies = dateFormat.parse(selectedDate)?.time
                val noOfSpaces = binding.noOworkspces.text.toString()
                val startTime = binding.textStartTime.text.toString()
                val endTime = binding.textEndTime.text.toString()
                val timeframe = binding.timeframe.text.toString()
                val isChecked = binding.switch3.isChecked
                if (selectedDateInMillies!! <= binding.calendarView.date) {
                    showUpSnackError("Select future date")
                } else if (selectVenueId == 0) {
                    showUpSnackError("Select Venue")
                } else if (selectSpaceId == 0) {
                    showUpSnackError("Select Workspace")
                } else if (startTime.isEmpty()) {
                    showUpSnackError("Select Start Time")
                } else if (endTime.isEmpty()) {
                    showUpSnackError("Select End Time")
                } else if (noOfSpaces.isEmpty()) {
                    showUpSnackError("Enter number of workspaces")
                } else if (isChecked && timeframe.isEmpty()) {
                    showUpSnackError("Enter time frame")
                } else {
                    val request = BlockAvailbilityRequest(endTime, selectedDate, startTime, noOfSpaces.toInt(),
                            repeat, arrayListOf(selectSpaceId))
                    if (repeat == "yes") {
                        request.repeatType = repeatType.toLowerCase(Locale.ENGLISH)
                        request.timeframe = timeframe
                    }
                    Log.e(TAG, "onClick: ${request.toJson()}")
                    val auth = RequestWithHeader(AppPreferences.getInstance(this)?.user?.token)

                    viewModel?.blockAvailability(auth, request)
                }
            }
        }
    }

    private fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.submit.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.submit.visibility = View.VISIBLE
            }
        }
    }

    private fun attachObserver() {
        this.viewModel?.apiBlockResponse?.observe(this, androidx.lifecycle.Observer {
            val obj = JSONObject(it.toJson()?:"")
          val data =  obj.get("data")
            Log.e(TAG, "attachObserver: ")
            if (data is JSONArray){
                Log.e(TAG, "attachObserver: array" )
                val type = object : TypeToken<List<BlockData>?>() {}.type
                val response =
                        Gson().fromJson<List<BlockData>?>(it.data?.toJson(), type)
                AppPreferences.getInstance(this)?.blockInOutResponse = BlockInOutResponse(response)
                showUpSnackError("Workspace updated successfully!")
            }else{
                val has = (data as JSONObject).has("message")
                if (has){
                    Log.e(TAG, "attachObserver: msg" )

                    val msg = (data as JSONObject).getString("message")
                    showUpSnackError(msg)
                }else{
                    Log.e(TAG, "attachObserver: error" )

                    showUpSnackError("Invalid data!")
                }
            }


        })

        this.viewModel?.isLoading?.observe(this, androidx.lifecycle.Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(this, androidx.lifecycle.Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })

    }
}

