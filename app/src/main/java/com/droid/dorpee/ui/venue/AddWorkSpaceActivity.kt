package com.droid.dorpee.ui.venue

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityAddWorkSpaceBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venue.adapter.AssetAdapter
import com.droid.dorpee.ui.venue.adapter.EnvironmentAdapter
import com.droid.dorpee.ui.venue.adapter.TypesAdapter
import com.droid.dorpee.ui.venue.model.DataXXXX
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.log
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.squareup.picasso.Picasso
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings
import okhttp3.MultipartBody
import okhttp3.RequestBody

class AddWorkSpaceActivity : BaseActivity(), View.OnClickListener {

    private var venuName: String = ""
    private var venueId: Int = 0
    private var from: String = ""
    private var isFreeSpace: Boolean = false
    private lateinit var binding: ActivityAddWorkSpaceBinding
    lateinit var viewModel: VenueViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddWorkSpaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueViewModel
        binding.textView6.text = getString(R.string.add_workspace)
        listOfAsset = ArrayList()
        venueId = intent.getIntExtra("venueId", 0)
        venuName = intent.getStringExtra("venueName") ?: ""
        binding.venueId.text = "To $venuName"
        from = intent.getStringExtra("from") ?: ""
        mResultswork = ArrayList(4)
        viewModel.getSuggestedPrice(venueId)
        setUpAmenitieAsset()
        setUpTypes()
        setUpEnvironment()
        attachObserver()
    }

    override fun onResume() {
        super.onResume()
        mResultswork?.let {
            it.mapIndexed { index, s ->
                log("mResults", it)
                when (index) {
                    0 -> Picasso.get().load("file://$s").into(binding.imageView4)
                    1 -> Picasso.get().load("file://$s").into(binding.imageView6)
                    2 -> Picasso.get().load("file://$s").into(binding.imageView7)
                    3 -> Picasso.get().load("file://$s").into(binding.imageView8)
                    else -> {
                    }
                }
            }
        }
    }

    override fun bindData() {
        binding.textView6.text = getString(R.string.add_workspace)
        binding.imageView10.visibility = View.VISIBLE
        binding.venueId.visibility = View.VISIBLE
    }

    override fun initListeners() {
        isFreeSpace = binding.switch3.isChecked
        binding.switch3.setOnCheckedChangeListener { _, isChecked ->
            isFreeSpace = isChecked
            if (isChecked)
                binding.layoutHourPrice.visibility = View.INVISIBLE
            else
                binding.layoutHourPrice.visibility = View.VISIBLE
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(
                VenueViewModel()
        )
        return ViewModelProvider(this, provider).get(VenueViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> {
                onBackPressed()
            }
            binding.buttonUpload.id -> {
                val intent = Intent(this, ImagesSelectorActivity::class.java)
                intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, 4)
                intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true)
                intent.putStringArrayListExtra(
                        SelectorSettings.SELECTOR_INITIAL_SELECTED_LIST,
                        mResultswork
                )
                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
            }
            binding.publishWorksapce.id -> {
                val name = binding.worksapceName.text.toString()
                val pricePerhour = binding.pricePerHour.text.toString()
                val minHour = binding.minHours.text.toString()
                val maxHour = binding.maxhour.text.toString()
                val description = binding.description.text.toString()
                val noOfSpace = binding.editTextNoOfSpace.text.toString()
                val noOfPeoples = binding.editTextNoOfpeoples.text.toString()
                val environMentList =
                        (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter)
                                .environmentList?.filter { it.checked }
                val typesList = (binding.recyclerViewTypes.adapter as TypesAdapter).typeList?.filter { it.checked }
                var priceerror = false
                priceerror = if (isFreeSpace) {
                    false
                } else {
                    pricePerhour.isEmpty()
                }
                if (name.isEmpty()) {
                    showUpSnackError(getString(R.string.workspace_name_error))
                } else if (priceerror) {
                    showUpSnackError(getString(R.string.price_per_hour_error))
                } else if (description.isEmpty()) {
                    showUpSnackError(getString(R.string.workspace_description_error))
                } else if (noOfSpace.isEmpty()) {
                    showUpSnackError(getString(R.string.no_of_workspace_error))
                } else if (noOfPeoples.isEmpty()) {
                    showUpSnackError(getString(R.string.max_no_of_peoples))
                } else if (mResultswork == null || mResultswork?.isEmpty()!!) {
                    showUpSnackError(getString(R.string.upload_workspace_image))
                } else if (typesList.isNullOrEmpty()) {
                    showUpSnackError(getString(R.string.select_atleast_type))
                } else if (environMentList.isNullOrEmpty()) {
                    showUpSnackError(getString(R.string.select_atleast_environment))
                } else if (listOfAsset.isNullOrEmpty()) {
                    showUpSnackError(getString(R.string.select_atleast_asset))
                } else {
                    val user = AppPreferences.getInstance(this)?.user
                    val map = HashMap<String, RequestBody>()
                    if (isFreeSpace) {
                        map["free_space"] = createPartFromString("Yes")
                        map["price"] = createPartFromString("0")
                    } else {
                        map["free_space"] = createPartFromString("No")
                        map["price"] = createPartFromString(pricePerhour)
                    }
                    map["venue_id"] = createPartFromString(venueId.toString())//venueRes?.data?.id?.toString()?:""
                    map["name"] = createPartFromString(name)
                    map["description"] = createPartFromString(description)
                    map["capacity"] = createPartFromString(noOfPeoples)
                    map["min_booking_hours"] = createPartFromString(binding.minHours.text.toString())
                    map["max_booking_hours"] = createPartFromString(binding.maxhour.text.toString())
                    val assets = listOfAsset?.map { it.id }
                    val types = typesList.map { it.id }
                    val environments = environMentList.map { it.id }
                    Log.e("list.toString()", assets.toString().removePrefix("[").removeSuffix("]"))
                    map["assets"] =
                            createPartFromString(assets.toString().removePrefix("[").removeSuffix("]"))
                    map["types"] =
                            createPartFromString(types.toString().removePrefix("[").removeSuffix("]"))
                    map["environments"] = createPartFromString(environments.toString().removePrefix("[").removeSuffix("]"))
                    showProgress(true)
                    val addImagesPart = ArrayList<MultipartBody.Part>()
                    mResultswork?.mapIndexed { ind, s ->
                        val imagesPart = requestUploadImage(s, "images[$ind]")
                        addImagesPart.add(imagesPart!!)
                    }
                    if (isNetworkAvailable()) {
                        viewModel.workspaceCreate(map, "Bearer " + user?.token, addImagesPart)
                    } else {
                        showUpSnackError(getString(R.string.network_unavailble))
                    }
                }
            }

        }
    }

    private fun setUpAmenitieAsset() {
        val list = AppPreferences.getInstance(this)?.assets
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerAmenities.layoutManager = layoutManager
        binding.recyclerAmenities.setHasFixedSize(true)
        list?.let {
            binding.recyclerAmenities.adapter =
                    AssetAdapter(this, it, null)
        }
    }

    private fun setUpTypes() {
        val type = AppPreferences.getInstance(this)?.types
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerViewTypes.layoutManager = layoutManager
        binding.recyclerViewTypes.setHasFixedSize(true)
        type?.let {
            if (!type.data.isNullOrEmpty())
                binding.recyclerViewTypes.adapter =
                        TypesAdapter(this, type.data, null)

            (binding.recyclerViewTypes.adapter as TypesAdapter).itemClick = {
                (binding.recyclerViewTypes.adapter as TypesAdapter).typeList?.mapIndexed { pos, week ->
                    val checked =
                            (binding.recyclerViewTypes.adapter as TypesAdapter).typeList!![pos].checked
                    if (pos == it && !checked) {
                        (binding.recyclerViewTypes.adapter as TypesAdapter).typeList!![pos].checked =
                                true
                    } else if (pos == it && checked) {
                        (binding.recyclerViewTypes.adapter as TypesAdapter).typeList!![pos].checked =
                                false
                    } else {
                        (binding.recyclerViewTypes.adapter as TypesAdapter).typeList!![pos].checked =
                                checked
                    }
                }
                (binding.recyclerViewTypes.adapter as TypesAdapter).notifyDataSetChanged()
            }
            (binding.recyclerViewTypes.adapter as TypesAdapter).notifyDataSetChanged()
        }
    }

    private fun setUpEnvironment() {
        val environment = AppPreferences.getInstance(this)?.environment
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerViewEnviornment.layoutManager = layoutManager
        binding.recyclerViewEnviornment.setHasFixedSize(true)
        environment?.let {
            if (!environment.data.isNullOrEmpty())
                binding.recyclerViewEnviornment.adapter =
                        EnvironmentAdapter(this, environment.data, null)

            (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).itemClick = {
                (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).environmentList?.mapIndexed { pos, week ->
                    val checked =
                            (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).environmentList!![pos].checked
                    if (pos == it && !checked) {
                        (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).environmentList!![pos].checked =
                                true
                    } else if (pos == it && checked) {
                        (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).environmentList!![pos].checked =
                                false
                    } else {
                        (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).environmentList!![pos].checked =
                                checked
                    }
                }
                (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).notifyDataSetChanged()
            }
            (binding.recyclerViewEnviornment.adapter as EnvironmentAdapter).notifyDataSetChanged()
        }
    }

    private fun attachObserver() {
        this.viewModel.apiEditSpaceRespnce.observe(this, Observer {
//            AppPreferences.getInstance(this)?.venueResponse = it
            when (from) {
                "dashboard" -> onBackPressed()
                "signup" -> {
                    startActivity(Intent(this, SuccessWorksapceActivity::class.java).apply {
                        putExtra("venueName", venuName ?: "")
                        putExtra("venueId", venueId )
                        putExtra("from", from )
                    })
                }
                else -> {
                    onBackPressed()
                }
            }

        })
        this.viewModel.apiSuggestedPriceResponse.observe(this, Observer {
            it.data?.price?.let {
                binding.suggestedPriceId.text = "$it/hour"
            }
        })
        this.viewModel.apiError.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.viewModel.isLoading.observe(this, Observer {
            showProgress(it)
        })
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.publishWorksapce.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.publishWorksapce.visibility = View.VISIBLE
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        if (requestCode == IMAGE_WORK_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                mResultswork = data?.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS)
                assert(mResultswork != null)
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object {
        val IMAGE_WORK_REQUEST_CODE = 12523
        var mResultswork: ArrayList<String>? = null
        var listOfAsset: ArrayList<DataXXXX>? = null

    }
}