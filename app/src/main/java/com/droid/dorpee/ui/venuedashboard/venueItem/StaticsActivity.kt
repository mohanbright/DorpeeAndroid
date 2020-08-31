package com.droid.dorpee.ui.venuedashboard.venueItem

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityStaticsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.VWeekData
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.BarMarker
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.toJson
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis.YAxisLabelPosition
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.formatter.LargeValueFormatter
import com.github.mikephil.charting.formatter.PercentFormatter
import com.google.gson.GsonBuilder
import org.json.JSONException
import org.json.JSONObject
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*
import kotlin.collections.ArrayList


class StaticsActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityStaticsBinding
    var viewModel: VenueDashViewModel? = null
    private var timeType: String = "weekly"
    private var selectVenueId: Int = 0
    private val TAG = "StaticsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStaticsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueDashViewModel

        setSpinnerData()
        val auth = RequestWithHeader(AppPreferences.getInstance(this)?.user?.token)
        viewModel?.getBarChart(auth)
        viewModel?.getPieChart(auth)
        attachObserver()
    }

    private fun setSpinnerData() {
        val timeList = arrayListOf("This Week", "This Month", "This Year")
        binding.spinnerWeek.apply {
            setItems(timeList)
            selectItemByIndex(0)
            lifecycleOwner = this@StaticsActivity
            setOnSpinnerItemSelectedListener<String> { index, text ->
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
        AppPreferences.getInstance(this)?.allVenueResponse?.data?.let { allList ->
            if (!allList.isNullOrEmpty()) {
                val list = allList.map { it.name ?: "" } as ArrayList<String>
                list.add(0, "All Venues")
                binding.spinnerVenues.apply {
                    setItems(list)
                    selectItemByIndex(0)
                    lifecycleOwner = this@StaticsActivity
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
        getTimelyRevenue()
    }

    override fun bindData() {
        val user = AppPreferences.getInstance(this)?.user?.user
        Glide.with(this)
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
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun attachObserver() {
        this.viewModel?.apiPieChartResponse?.observe(this, Observer {
            it.data?.let { itd ->
                Log.e(TAG, "attachObserver: ${itd.toJson()}")
                itd.newVsOld?.let {
                    val newOldPieList = listOf(PieEntry((it.new
                            ?: 0).toFloat(), "new"), PieEntry((it
                            .old ?: 0).toFloat(), "old"))
                    val set = PieDataSet(newOldPieList, "")
                    val data = PieData(set)
                    data.setValueFormatter(PercentFormatter())
                    data.setValueTextSize(resources.getDimension(R.dimen._4ssp))
                    data.setValueTextColor(ContextCompat.getColor(this, R.color.white))
                    binding.newOldPieChat.data = data
                    set.setColors(ContextCompat.getColor(this@StaticsActivity, R.color.colorPrimaryDark),
                            ContextCompat.getColor(this@StaticsActivity, R.color.colorDark));
                    binding.newOldPieChat.invalidate()
                    binding.newOldPieChat.animateY(1400, Easing.EaseInOutQuad)
                    chartDetails(binding.newOldPieChat, Typeface.SANS_SERIF)
                }
                itd.noOfPeople?.let {
                    val noOfPeoplePieList = listOf(PieEntry((it.eqone ?: 0.0).toFloat(), "One"),
                            PieEntry((it.gtfive ?: 0).toFloat(), "Two"),
                            PieEntry((it.gtfifteen ?: 0).toFloat(), "Five+"))
                    val set = PieDataSet(noOfPeoplePieList, "")
                    val data = PieData(set)
                    data.setValueFormatter(PercentFormatter())
                    data.setValueTextSize(resources.getDimension(R.dimen._4ssp))
                    data.setValueTextColor(ContextCompat.getColor(this, R.color.white))
                    binding.bookedGroupPieChart.data = data
                    set.setColors(ContextCompat.getColor(this@StaticsActivity, R.color.colorPrimaryDark),
                            ContextCompat.getColor(this@StaticsActivity, R.color.colorDark),
                            ContextCompat.getColor(this@StaticsActivity, R.color.quantum_yellow800));

                    chartDetails(binding.bookedGroupPieChart, Typeface.SANS_SERIF)

                }
                itd.totalDuration?.let {
                    val totalDurationPieList = listOf(PieEntry((it.durationBtwOneToTwo
                            ?: 0.0).toFloat(), "One-two"),
                            PieEntry((it.durationBtwThreeToSix ?: 0.0).toFloat(), "Three-six"),
                            PieEntry((it.durationGtEight ?: 0.0).toFloat(), "Seven+"))
                    val set = PieDataSet(totalDurationPieList, "")
                    val data = PieData(set)
                    data.setValueFormatter(PercentFormatter())
                    data.setValueTextSize(resources.getDimension(R.dimen._4ssp))
                    data.setValueTextColor(ContextCompat.getColor(this, R.color.white))
                    binding.bookingDurationPieChart.data = data
                    set.setColors(ContextCompat.getColor(this@StaticsActivity, R.color.colorPrimaryDark),
                            ContextCompat.getColor(this@StaticsActivity, R.color.colorDark),
                            ContextCompat.getColor(this@StaticsActivity, R.color.quantum_yellow800));
                    binding.bookingDurationPieChart.invalidate()
                    binding.bookingDurationPieChart.animateY(1400, Easing.EaseInOutQuad)

                    chartDetails(binding.bookingDurationPieChart, Typeface.SANS_SERIF)
                }
            }
        })
        this.viewModel?.apiVenueDurationResponse?.observe(this, Observer {
            showProgress(false)
            it.data?.venues?.let {
//                binding.textViewTimeType.text = earnedThisTime
                binding.earnedCreditsTV.text = "$${it.totalBookingsRevenue ?: 0}"
                binding.hoursBookedTV.text = (it.totalBookingsHours ?: 0).toString()
            }
        })
        this.viewModel?.apiBarChartResponse?.observe(this, Observer {
            showProgress(false)
            try {
                val fObject = JSONObject(it?.toJson() ?: "")
                val data = fObject.get("data")
                if (data is JSONObject) {
                    val jObject = JSONObject(it.data?.toJson() ?: "")
                    val objvenue = jObject.getJSONObject("venues")

                    val keys: Iterator<String> = objvenue.keys()
                    val venueMap: HashMap<String, VWeekData?>? = HashMap()
                    while (keys.hasNext()) {
                        val key = keys.next()
                        val innerJObject = objvenue.getJSONObject(key)
                        val builder = GsonBuilder()
                        builder.serializeSpecialFloatingPointValues()
                        val vData = builder.create().fromJson<VWeekData>(innerJObject.toString(),
                                VWeekData::class.java)
                        venueMap!![key] = vData
                    }
                    venueMap?.let {
                        setChartdata(it)
                    }
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        })
        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showUpSnackError(it)
        })
        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })

    }

    private fun setChartdata(dataMap: HashMap<String, VWeekData?>) {
//        Log.e(TAG, "setChartdata: ${dataMap.toJson()}")
        val weeks = arrayOf("Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun")

        binding.barChatId.setPinchZoom(false)
        /*val dataMap = hashMapOf<String,VWeekData?>()
        dataMap["mee"] = VWeekData(2,3,4,1,2,0,3)
        dataMap["wee"] = VWeekData(3,4,8,0,8,6,3)
        dataMap["mqwewdsadase"] = VWeekData(1,0,3,3,0,8,4)
        dataMap["mqwewdsadase"] = VWeekData(1,0,6,9,1,8,2)
        dataMap["mqweadadase"] = VWeekData(1,0,3,1,3,8,4)
        dataMap["22adase"] = VWeekData(4,0,3,2,0,8,4)
        dataMap["dase"] = VWeekData(1,0,3,0,3,8,4)
        dataMap["mdase"] = VWeekData(1,0,3,3,0,8,4)
        dataMap["sadase"] = VWeekData(1,0,5,3,0,8,4)
        dataMap["ase"] = VWeekData(1,0,3,8,3,8,4)
        dataMap["asse"] = VWeekData(1,0,3,4,3,3,0)
        dataMap["as"] = VWeekData(1,2,3,8,2,1,1)
        dataMap["sse"] = VWeekData(1,0,3,7,8,8,9)
        dataMap["asasse"] = VWeekData(1,5,6,8,3,4,4)*/
        binding.barChatId.setDrawBarShadow(false)

        binding.barChatId.setDrawGridBackground(false)

        val mv = BarMarker(this, R.layout.custom_marker_view)
        mv.chartView = binding.barChatId // For bounds control
        binding.barChatId.marker = mv
        val totalVeunues = dataMap.size
        //times(.01f)
        val barSpace = 0.2.div(totalVeunues).toFloat()//times(.005037f)
        val barWidth = 0.75.div(totalVeunues).toFloat()//2.toPercent(12)//times(.009338f)

        val groupSpace = (1 - (barSpace + barWidth).times(totalVeunues))//.div(7)//0.15.div(7)
        // .toFloat()
        val lenth = 0.toFloat() + groupSpace + barSpace
        Log.e(TAG, "getGroupWidth groupSpace $groupSpace barSpace$barSpace barWidth$barWidth lenth${
        (barSpace + barWidth).times(totalVeunues).plus(groupSpace)}   fsdfds ${(barSpace + barWidth)
                .times(totalVeunues)}")

        val setBarSetList = ArrayList<BarDataSet>()
        Log.e(TAG, "setChartdata: ${dataMap.toJson()}")
        dataMap.keys.map { key ->
            val list = ArrayList<BarEntry>()
            dataMap[key]?.let {
//                if (it.mon?.toFloat() ?: 0f > 0f)
                list.add(BarEntry(0f, it.mon?.toFloat() ?: 0f))
//                if (it.tue?.toFloat() ?: 0f > 0f)
                list.add(BarEntry(1f, it.tue?.toFloat() ?: 0f))
//                if (it.wed?.toFloat() ?: 0f > 0f)
                list.add(BarEntry(2f, it.wed?.toFloat() ?: 0f))
//                if (it.thu?.toFloat() ?: 0f > 0f)
                list.add(BarEntry(3f, it.thu?.toFloat() ?: 0f))
//                if (it.fri?.toFloat() ?: 0f > 0f)
                list.add(BarEntry(4f, it.fri?.toFloat() ?: 0f))
//                if (it.sat?.toFloat() ?: 0f > 0f)/
                list.add(BarEntry(5f, it.sat?.toFloat() ?: 0f))
//                if (it.sun?.toFloat() ?: 0f > 0f)
                list.add(BarEntry(6f, it.sun?.toFloat() ?: 0f))
            }
            val set = BarDataSet(list, key)
            set.setDrawValues(false)
            setBarSetList.add(set)
        }

        val barData = BarData()
        barData.setValueFormatter(LargeValueFormatter())
        val rnd = Random()
        setBarSetList.map {
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(255), rnd.nextInt(254))
            it.color = color
            barData.addDataSet(it)
        }

//        Log.e(TAG, "barData: ${barData.toJson()}")

        binding.barChatId.data = barData
        binding.barChatId.setFitBars(true)
        binding.barChatId.barData.barWidth = barWidth
        binding.barChatId.xAxis.axisMinimum = 0.toFloat()
        Log.e(TAG, "getGroupWidth:${0.toFloat() + binding.barChatId.barData
                .getGroupWidth(groupSpace, barSpace)} ")
        binding.barChatId.xAxis.axisMaximum = 0.toFloat() + binding.barChatId.barData
                .getGroupWidth(groupSpace, barSpace) * 7//totalVeunues //weeks 7
        binding.barChatId.groupBars(0.toFloat(), groupSpace, barSpace)
        binding.barChatId.invalidate()
        binding.barChatId.isHighlightPerTapEnabled = true
        val l: Legend = binding.barChatId.legend
        l.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
        l.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        l.orientation = Legend.LegendOrientation.HORIZONTAL
        l.setDrawInside(false)
        l.yOffset = 15f
        l.xOffset = 0f
        l.yEntrySpace = 0f
        l.textSize = 8f
        val xAxis = binding.barChatId.xAxis
        xAxis.setDrawGridLines(true)
        xAxis.isGranularityEnabled = true // only intervals of 1 day
        xAxis.granularity = 1f//totalVeunues.toFloat()
        xAxis.setCenterAxisLabels(true)
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.valueFormatter = IndexAxisValueFormatter(weeks)
//        xAxis.yOffset = 10f
        binding.barChatId.axisRight.isEnabled = false
        binding.barChatId.setDrawBarShadow(false)
        binding.barChatId.setDrawValueAboveBar(false)
        binding.barChatId.description.isEnabled = false
        binding.barChatId.isDragEnabled = true
        binding.barChatId.axisRight.setDrawGridLines(false);
        val leftAxis = binding.barChatId.axisLeft
        leftAxis.setLabelCount(8, false)
        leftAxis.setPosition(YAxisLabelPosition.OUTSIDE_CHART)
        leftAxis.spaceTop = 30f
        leftAxis.axisMinimum = 0f
        binding.barChatId.animateXY(1500, 1500)
    }

    fun roundOffFloat(number: Float): Float {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.CEILING
        return df.format(number).toFloat() ?: 0f
    }

    private fun getTimelyRevenue() {
//        binding.progressBarearned.visibility =View.VISIBLE
        val header = RequestWithHeader(AppPreferences.getInstance(this@StaticsActivity)?.user?.token)
        viewModel?.getVenueRevenue(header, timeType, selectVenueId)
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
            }
        }
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }


    private fun chartDetails(mChart: PieChart, tf: Typeface) {
        mChart.isDrawHoleEnabled = true
        mChart.setHoleColor(Color.WHITE)
        mChart.setTransparentCircleColor(Color.WHITE)
        mChart.setTransparentCircleAlpha(110)
        mChart.holeRadius = 50f
        mChart.transparentCircleRadius = 56f
        mChart.description.isEnabled = false
        mChart.setDrawCenterText(true)
        mChart.setCenterTextSize(resources.getDimension(R.dimen._8ssp))
        mChart.setCenterTextColor(ContextCompat.getColor(this, R.color.white))
        mChart.setCenterTextTypeface(tf)
        mChart.legend.apply {
            verticalAlignment = Legend.LegendVerticalAlignment.TOP
            horizontalAlignment = Legend.LegendHorizontalAlignment.RIGHT
            orientation = Legend.LegendOrientation.VERTICAL
            this.setDrawInside(false)
            xEntrySpace = 7f
            yEntrySpace = 0f
            yOffset = 0f
        }
        mChart.setTouchEnabled(true)
        mChart.setDrawEntryLabels(true)
        mChart.legend.isWordWrapEnabled = false
        mChart.legend.isEnabled = false
        mChart.invalidate()
        mChart.animateY(1400, Easing.EaseInOutQuad)
        mChart.setUsePercentValues(true)

    }
}

