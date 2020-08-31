package com.droid.dorpee.ui.search.ui.search

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentVenueDetailsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.personaldashboard.personalItem.Maps
import com.droid.dorpee.ui.personaldashboard.personalItem.TopUpActivity
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.search.adapter.AmenitieVenueAdapter
import com.droid.dorpee.ui.search.adapter.AvailbiltyAdapter
import com.droid.dorpee.ui.search.adapter.ImageSliderAdapter
import com.droid.dorpee.ui.search.adapter.SearchWorkspaceAdapter
import com.droid.dorpee.ui.venue.model.Availability
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.droid.dorpee.ui.venue.venueresponse.Service
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.span.makeTextViewResizable
import com.droid.dorpee.utils.toJson
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import kotlin.math.ceil


class VenueDetailsFragment : BaseFragment() {

    private var venueData: Data? = null
    private lateinit var binding: FragmentVenueDetailsBinding
    var viewModel: SearchViewModel? = null
    var scondition: String? = null
    private val TAG = "VenueDetailsFragment"
    override fun bindData() {}

    override fun initListeners() {
        binding.backbtn.setOnClickListener {
//            val navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
//            navController.navigate(R.id.action_back_venue_detail)
            val navController =
                    Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
            navController.popBackStack()
//            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
        binding.textViewAddress.setOnClickListener {
            try {
                if (venueData != null) {
                    val intent = Intent(requireContext(), Maps::class.java)
                    val bundle = Bundle()
                    bundle.putParcelable("venueDetail", LatLng(venueData?.lat?.toDoubleOrNull()
                            ?: 0.0,
                            venueData?.lng?.toDoubleOrNull() ?: 0.0))
                    bundle.putString("title", venueData?.name ?: "")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SearchViewModel())
        return ViewModelProvider(this, provider).get(SearchViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVenueDetailsBinding.inflate(layoutInflater)
        viewModel = setUpVM() as SearchViewModel
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let { it ->
            scondition = VenueDetailsFragmentArgs.fromBundle(it).searchCondition
            VenueDetailsFragmentArgs.fromBundle(it).venueData?.let {
                viewModel?.getSingleWithoutTokenVenue(
                        RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                        it.id ?: 0
                )
                venueData = Gson().fromJson<Data>(it.toJson(), Data::class.java)
                setVenueDetails(venueData)
            }
        }
        attachObserver()

    }

    private fun setVenueDetails(data: Data?) {
        venueData = data
        venueData?.let {
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
                    showDialog(lis)
                }
            }
            val width = binding.imageViewpager.width
            val height = binding.imageViewpager.height
            binding.imageViewpager.adapter = ImageSliderAdapter(requireContext(), it.images
                    ?: emptyList(), width, height)
            binding.imageViewNext.setOnClickListener {
                binding.imageViewpager.arrowScroll(View.FOCUS_RIGHT)
            }
            if (!it.images.isNullOrEmpty() && it.images.size > 1)
                binding.imageViewNext.visibility = View.VISIBLE
            else
                binding.imageViewNext.visibility = View.INVISIBLE

            binding.textViewHotel.text = it.name ?: ""
            AppPreferences.getInstance(requireContext())?.setVenueName(it.name!!)
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
                Log.e(TAG, "onBindViewHolder: spcesPriceList ${spcesPriceList?.toJson()}")
                val sum = spcesPriceList.sum()
                Log.e(TAG, "onBindViewHolder: sum ${sum}")
                try {
                    if (sum ?: 0f > 0f) {
                        spcesPriceList.remove(0f)
                        val price = ceil(spcesPriceList.min()?.toDouble()?.div(0.3) ?: 0.0).toInt()
                        binding.textViewPrice.text = price.toString()
                        binding.linearLayoutCompat9.visibility = View.VISIBLE
                        binding.textViewFrom.visibility = View.VISIBLE
                    } else {
                        binding.linearLayoutCompat9.visibility = View.INVISIBLE
                        binding.textViewFrom.visibility = View.INVISIBLE
                    }
                } catch (e: Exception) {
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
        binding.amenitieRecycler.adapter = AmenitieVenueAdapter(requireContext(), list)
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
        val navController =
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.isItemPrefetchEnabled = true
        binding.workspaceRecycler.layoutManager = layoutManager
        binding.workspaceRecycler.setHasFixedSize(true)
        binding.workspaceRecycler.adapter = SearchWorkspaceAdapter(requireContext(), spaces)
        (binding.workspaceRecycler.adapter as SearchWorkspaceAdapter).itemClick = { type, pos, space ->
            val user = AppPreferences.getInstance(requireContext())?.user?.user
            when (type) {
                "book" -> {
                    if (user != null) {
                        requireContext().startActivity(
                                Intent(
                                        requireContext(),
                                        BookingActivity::class.java
                                ).apply {
                                    putExtra("space", space)
                                    putExtra("scondition", scondition)
                                    putExtra("isFromRebook",false)
                                    putExtra("isFromUpcomming",false)
                                })
                    } else {
                        val bundle = Bundle()
                        bundle.putSerializable("space", space)
                        bundle.putString("scondition", scondition)
                        bundle.putBoolean("isFromLogin", true)
                        navController.navigate(R.id.navigation_login, bundle)

                        /*  requireContext().startActivity(
                                  Intent(
                                          requireContext(),
                                          LoginActivity::class.java
                                  ).apply {
                                      putExtra("space", space)
                                      putExtra("scondition", scondition)
                                      putExtra("isFromLogin",true)
                                  })*/
                    }
                }
                "buyCredit" -> {
                    startActivity(Intent(requireContext(), TopUpActivity::class.java))
                }
            }
        }
    }

    private fun attachObserver() {
        this.viewModel?.apiSingleVenueResponse?.observe(viewLifecycleOwner, Observer {

            setVenueDetails(it.data)
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            (activity as DashboardActivity).showUpSnackError(it)
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })
    }

    private fun showDialog(lissst: List<Availability>?) {

        val dialog = Dialog(requireContext())

        val view = layoutInflater.inflate(R.layout.availvilty_dialog, null);
        val metrics = resources.displayMetrics
        val width = metrics.widthPixels
        val height = metrics.heightPixels

        val list = view.findViewById<RecyclerView>(R.id.list);
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.isItemPrefetchEnabled = true
        list.layoutManager = layoutManager
        list.setHasFixedSize(true)
        val adapter = AvailbiltyAdapter(requireContext(), lissst ?: emptyList());

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
}

