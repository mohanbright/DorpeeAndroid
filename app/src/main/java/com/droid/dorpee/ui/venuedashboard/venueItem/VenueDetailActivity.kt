package com.droid.dorpee.ui.venuedashboard.venueItem

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentVenueDetailsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.LoginActivity
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.personaldashboard.personalItem.Maps
import com.droid.dorpee.ui.personaldashboard.personalItem.TopUpActivity
import com.droid.dorpee.ui.search.adapter.AmenitieVenueAdapter
import com.droid.dorpee.ui.search.adapter.AvailbiltyAdapter
import com.droid.dorpee.ui.search.adapter.ImageSliderAdapter
import com.droid.dorpee.ui.search.adapter.SearchWorkspaceAdapter
import com.droid.dorpee.ui.search.ui.search.SearchViewModel
import com.droid.dorpee.ui.venue.model.Availability
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.droid.dorpee.ui.venue.venueresponse.Service
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.span.makeTextViewResizable
import com.droid.dorpee.utils.toJson
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import kotlin.math.ceil

class VenueDetailActivity : BaseActivity() {
    private lateinit var binding: FragmentVenueDetailsBinding
    var venueDetailData: Data? = null
    var scondition: String? = null
    var viewModel: SearchViewModel? = null
    private val TAG = "VenueDetailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentVenueDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as SearchViewModel
        intent.getStringExtra("venueData")?.let {
            venueDetailData = Gson().fromJson(it, Data::class.java)
            venueDetailData?.let {
                viewModel?.getSingleWithoutTokenVenue(
                        RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                        it.id ?: 0
                )
                setVenueDetails(venueDetailData)
            }
        }
        attachObserver()

    }


    override fun bindData() {}

    override fun initListeners() {
        binding.textViewAddress.setOnClickListener {
            try {
                if (venueDetailData != null) {
                    val intent = Intent(this, Maps::class.java)
                    val bundle = Bundle()
                    bundle.putParcelable("venueDetail", LatLng(venueDetailData?.lat?.toDoubleOrNull()
                            ?: 0.0,
                            venueDetailData?.lng?.toDoubleOrNull() ?: 0.0))
                    bundle.putString("title",venueDetailData?.name?:"")
                    intent.putExtras(bundle)
                    startActivity(intent)

                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        binding.backbtn.setOnClickListener {
             onBackPressed()
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SearchViewModel())
        return ViewModelProvider(this, provider).get(SearchViewModel::class.java)
    }



    private fun setVenueDetails(data: Data?) {
        venueDetailData = data
        venueDetailData?.let {
            Log.e(TAG, "setVenueDetails: ${it.availability?.availability?.toJson()}")
            binding.imageViewSheild.visibility = View.GONE
            it.assessment?.let {
                if (it.result == "Pass") {
                    binding.imageViewSheild.visibility = View.VISIBLE
                } else {
                    binding.imageViewSheild.visibility = View.GONE
                }
            }
            it.availability?.availability?.let { lis ->
                binding.imageViewAvailvility.setOnClickListener {
                    showaVialDialog(lis)
                }
            }
            val width = binding.imageViewpager.width
            val height = binding.imageViewpager.height
            binding.imageViewpager.adapter = ImageSliderAdapter(this, it.images
                    ?: emptyList(), width, height)
            binding.imageViewNext.setOnClickListener {
                binding.imageViewpager.arrowScroll(View.FOCUS_RIGHT)
            }
            if (!it.images.isNullOrEmpty() && it.images.size > 1)
                binding.imageViewNext.visibility = View.VISIBLE
            else
                binding.imageViewNext.visibility = View.INVISIBLE

            binding.textViewHotel.text = it.name ?: ""
            AppPreferences.getInstance(this)?.setVenueName(it.name!!)
            binding.textViewAbout.text = it.description ?: ""
            makeTextViewResizable(binding.textViewAbout, 3, "Show More", true);
            binding.textViewAddress.text = "${it.address ?: ""} ${it.suburb} ${it.state ?: ""} ${it.postcode ?: ""}"
//                val price = it.lowestPrice?.toDoubleOrNull()?.toInt()
            val creditPerHour = if (it.lowestPrice.isNullOrEmpty()) 0 else ceil(
                    it.lowestPrice.toDouble().div(0.3)
            ).toInt()
            if (creditPerHour != 0) {
                binding.textViewPrice.text = creditPerHour.toString()
                binding.linearLayoutCompat9.visibility = View.VISIBLE
                binding.textViewFrom.visibility = View.VISIBLE
            } else {
                binding.linearLayoutCompat9.visibility = View.INVISIBLE
                binding.textViewFrom.visibility = View.INVISIBLE
            }

            val spcesPriceList = it.spaces?.map { (it.price ?: "0.00").toFloat() } as
                    ArrayList<Float>?
            if (!spcesPriceList.isNullOrEmpty()) {
                Log.e(TAG, "onBindViewHolder: spcesPriceList ${spcesPriceList.toJson()}")
                val sum = spcesPriceList.sum()
                Log.e(TAG, "onBindViewHolder: sum ${sum}")
                try {
                    if (sum ?: 0f > 0f) {
                        spcesPriceList.remove(0f)
                        val price =  ceil(spcesPriceList.min()?.toDouble()?.div(0.3)?:0.0).toInt()
                        binding.textViewPrice.text = price.toString()
                        binding.linearLayoutCompat9.visibility = View.VISIBLE
                        binding.textViewFrom.visibility = View.VISIBLE
                    } else {
                        binding.linearLayoutCompat9.visibility = View.INVISIBLE
                        binding.textViewFrom.visibility = View.INVISIBLE
                    }
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
            binding.textViewRating.visibility = View.VISIBLE
            if (it.averageRating ?: 0 > 0)
                binding.textViewRating.text = it.averageRating?.toString()
            else
                binding.textViewRating.visibility = View.INVISIBLE
            it.services?.let {
                setUpAmenitie(it)
            }
            it.spaces?.let {
                setUpWorkspace(it)
            }
        }
    }

    private fun setUpAmenitie(services: List<Service>) {
        val list = arrayListOf<Service>()
        val layoutManager = when (services.size) {
            1, 2, 3 -> StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            else -> StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        }
        Log.e(TAG, "setUpAmenitie: ${services.size}" )
        layoutManager.isItemPrefetchEnabled = true
        binding.amenitieRecycler.layoutManager = layoutManager
        binding.amenitieRecycler.setHasFixedSize(true)
        binding.amenitieRecycler.adapter = AmenitieVenueAdapter(this, list)
        if (services.size <= 8) {
            binding.textViewShowmOre.visibility = View.GONE
            list.clear()
            list.addAll(services)
            binding.amenitieRecycler.adapter?.notifyDataSetChanged()
        } else {
            binding.textViewShowmOre.visibility = View.VISIBLE
            binding.textViewShowmOre.text = "show more"
            list.clear()
            list.addAll(services.subList(0, 8))
            binding.amenitieRecycler.adapter?.notifyDataSetChanged()
            binding.textViewShowmOre.setOnClickListener {
                if (list.size == 8) {
                    list.clear()
                    list.addAll(services)
                    binding.textViewShowmOre.text = "show less"
                    binding.amenitieRecycler.adapter?.notifyDataSetChanged()

                } else {
                    list.clear()
                    list.addAll(services.subList(0, 8))
                    binding.textViewShowmOre.text = "show more"
                    binding.amenitieRecycler.adapter?.notifyDataSetChanged()
                }
            }
        }


    }

    private fun setUpWorkspace(spaces: List<Space>) {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.isItemPrefetchEnabled = true
        binding.workspaceRecycler.layoutManager = layoutManager
        binding.workspaceRecycler.setHasFixedSize(true)
        binding.workspaceRecycler.adapter = SearchWorkspaceAdapter(this, spaces)
        (binding.workspaceRecycler.adapter as SearchWorkspaceAdapter).itemClick = { type, pos, space ->
            val user = AppPreferences.getInstance(this)?.user?.user
            scondition = "${space.venue?.address}+${space.createdAt} + ${space.deletedAt} + ${space.createdAt}";
            when (type) {
                "book" -> {
                    if (user != null) {
                        this.startActivity(
                                Intent(
                                        this,
                                        BookingActivity::class.java
                                ).apply {
                                    putExtra("space", space)
                                    putExtra("scondition", scondition)
                                    putExtra("isFromRebook",false)
                                    putExtra("isFromUpcomming",false)
                                })
                    } else {
                        this.startActivity(Intent(this,
                                LoginActivity::class.java
                        ).apply {
                            putExtra("space", space)
                            putExtra("scondition", scondition)
                            putExtra("isFromLogin", true)
                        })
                    }
                }
                "buyCredit" -> {
                        startActivity(Intent(this, TopUpActivity::class.java))
                }
            }
        }
    }

    private fun attachObserver() {
        this.viewModel?.apiSingleVenueResponse?.observe(this, Observer {
            setVenueDetails(it.data)
        })
        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
           showUpSnackError(it)
        })

        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })
    }

    private fun showaVialDialog(lissst: List<Availability>?) {

        val dialog = Dialog(this)

        val view = layoutInflater.inflate(R.layout.availvilty_dialog, null);
        val metrics = resources.displayMetrics
        val width = metrics.widthPixels
        val height = metrics.heightPixels

        val list = view.findViewById<RecyclerView>(R.id.list);
        val layoutManager = LinearLayoutManager(this)
        layoutManager.isItemPrefetchEnabled = true
        list.layoutManager = layoutManager
        list.setHasFixedSize(true)
        val adapter = AvailbiltyAdapter(this, lissst ?: emptyList());

        list.adapter = adapter;
        dialog.setContentView(view)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));

        dialog.show();
        dialog.window?.setLayout((5 * width) / 7, LinearLayout.LayoutParams.WRAP_CONTENT);

    }

    fun showProgress(it: Boolean?) {
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
}

