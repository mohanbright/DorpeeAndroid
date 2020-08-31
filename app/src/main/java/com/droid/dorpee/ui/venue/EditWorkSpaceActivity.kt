package com.droid.dorpee.ui.venue

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityEditWorkSpaceBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity.Companion.IMAGE_WORK_REQUEST_CODE
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity.Companion.listOfAsset
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity.Companion.mResultswork
import com.droid.dorpee.ui.venue.adapter.AssetAdapter
import com.droid.dorpee.ui.venue.adapter.EnvironmentAdapter
import com.droid.dorpee.ui.venue.adapter.TypesAdapter
import com.droid.dorpee.ui.venue.model.DataXXXXX
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.fileNameWithoutExtn
import com.droid.dorpee.utils.log
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.toJson
import com.squareup.picasso.Picasso
import com.squareup.picasso.Target
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.io.IOException


class EditWorkSpaceActivity : BaseActivity(), View.OnClickListener {
    private val TAG = "EditWorkSpaceActivity"
    private var spaceId: Int = 0
    private var addedImage: Boolean? = null
    private var venuName: String = ""
    private var venueId: Int = 0
    private var from: String = ""
    private var isFreeSpace: Boolean = false
    private lateinit var binding: ActivityEditWorkSpaceBinding
    lateinit var viewModel: VenueViewModel
    private var space: Space? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditWorkSpaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueViewModel
        binding.textView6.text = getString(R.string.edit_workspace)
        listOfAsset = ArrayList()
        venueId = intent.getIntExtra("venueId", 0)
        spaceId = intent.getIntExtra("spaceId", 0)
        venuName = intent.getStringExtra("venueName") ?: ""
        binding.venueId.text = venuName
        from = intent.getStringExtra("from") ?: ""
        mResultswork = ArrayList(4)
        val user = AppPreferences.getInstance(this)?.user
        if (isNetworkAvailable()) {
            viewModel.getSuggestedPrice(venueId)
            viewModel.getSingleSpace("Bearer " + user?.token, spaceId)
        } else {
            showUpSnackError(getString(R.string.network_unavailble))
        }

        attachObserver()
    }

    override fun onResume() {
        super.onResume()
      setWorkSpaceImages()
    }

    private fun setWorkSpaceImages() {
        mResultswork?.let {
            addedImage = true
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd1)
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd2)
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd3)
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd4)
            binding.firstRemoveImg.visibility = View.GONE
            binding.secondRemoveImg.visibility = View.GONE
            binding.thirdRemoveImg.visibility = View.GONE
            binding.fourthRemoveImg.visibility = View.GONE

            it.mapIndexed { index, s ->
                log("mResults", it)
                when (index) {
                    0 -> {
                        Picasso.get().load("file://$s").into(binding.imageViewAdd1)
                        binding.firstRemoveImg.visibility = View.VISIBLE

                    }
                    1 -> {Picasso.get().load("file://$s").into(binding.imageViewAdd2)
                        binding.secondRemoveImg.visibility = View.VISIBLE

                    }
                    2 ->{ Picasso.get().load("file://$s").into(binding.imageViewAdd3)
                        binding.thirdRemoveImg.visibility = View.VISIBLE

                    }
                    3 -> {Picasso.get().load("file://$s").into(binding.imageViewAdd4)
                        binding.fourthRemoveImg.visibility = View.VISIBLE

                    }
                    else -> {
                    }
                }
            }
        }
    }

    override fun bindData() {}

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

            binding.imageViewAdd1.id -> {
                setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
            }
            binding.imageViewAdd2.id -> {
                setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
            }
            binding.imageViewAdd3.id -> {
                setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
            }
            binding.imageViewAdd4.id -> {
                setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
            }
            binding.firstRemoveImg.id -> {
                mResultswork?.removeAt(0)
                setWorkSpaceImages()

            }
            binding.secondRemoveImg.id -> {
                mResultswork?.removeAt(1)
                setWorkSpaceImages()

            }
            binding.thirdRemoveImg.id -> {
                mResultswork?.removeAt(2)
                setWorkSpaceImages()

            }
            binding.fourthRemoveImg.id -> {
                mResultswork?.removeAt(3)
                setWorkSpaceImages()

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
                /*  else if (minHour.isEmpty()) {
                      showUpSnackError(getString(R.string.minhour_error))
                  } else if (maxHour.isEmpty()) {
                      showUpSnackError(getString(R.string.maxhour_error))
                  }*/
                var priceerror = false
                priceerror = if (isFreeSpace) {
                    false
                } else {
                    pricePerhour.isEmpty()
                }
                var imag = false
                imag = if (addedImage == null) {
                    false
                } else {
                    addedImage == true
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
                } else if (!imag) {
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
                    map["min_booking_hours"] = createPartFromString(minHour)
                    map["max_booking_hours"] = createPartFromString(maxHour)
                    map["_method"] = createPartFromString("PUT")
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
                        viewModel.workspaceUpdate(map, "Bearer " + user?.token, addImagesPart, spaceId)
                    } else {
                        showUpSnackError(getString(R.string.network_unavailble))
                    }
                }
            }
        }
    }

    private fun setUploadImage() {
        val intent = Intent(this, ImagesSelectorActivity::class.java)
        intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, mResultswork?.size?.plus(1))
        intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true)
        intent.putStringArrayListExtra(
                SelectorSettings.SELECTOR_INITIAL_SELECTED_LIST,
                mResultswork
        )
        imagesResult.launch(intent)
    }

    val imagesResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
//            if (resultCode == Activity.RESULT_OK) {
            mResultswork = result.data?.getStringArrayListExtra(SelectorSettings
                    .SELECTOR_RESULTS)
            Log.e(TAG, "imagesResult: ${mResultswork?.toJson()}")

//            if (!image.isNullOrEmpty() && mResultswork != null)
//                mResultswork?.add(image[mResultswork?.size?.minus(1)?:0])
            assert(mResultswork != null)
//            }
        }

    }

    private fun setUpAmenitieAsset(space: DataXXXXX) {
        val list = AppPreferences.getInstance(this)?.assets
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerAmenities.layoutManager = layoutManager
        binding.recyclerAmenities.setHasFixedSize(true)
        list?.let {
            binding.recyclerAmenities.adapter = AssetAdapter(this, it, space.assets)
        }
    }

    private fun setUpTypes(space: DataXXXXX) {
        val type = AppPreferences.getInstance(this)?.types
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerViewTypes.layoutManager = layoutManager
        binding.recyclerViewTypes.setHasFixedSize(true)
        type?.let {
            if (!type.data.isNullOrEmpty())
                binding.recyclerViewTypes.adapter = TypesAdapter(this, type.data, space.types)

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

    private fun setUpEnvironment(space: DataXXXXX) {
        val environment = AppPreferences.getInstance(this)?.environment
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerViewEnviornment.layoutManager = layoutManager
        binding.recyclerViewEnviornment.setHasFixedSize(true)
        environment?.let {
            if (!environment.data.isNullOrEmpty())
                binding.recyclerViewEnviornment.adapter =
                        EnvironmentAdapter(this, environment.data, space.environments)

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
                        putExtra("venueId", venueId)
                        putExtra("from", from)
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
        this.viewModel.apiSingleSpaceRespnce.observe(this, Observer {
            it.data?.let {
                binding.venueId.text = venuName
                binding.worksapceName.setText(it.name)
                binding.pricePerHour.setText(it.price ?: "0")
                binding.minHours.setText(it.minBookingHours?.toString() ?: "0")
                binding.maxhour.setText(it.maxBookingHours?.toString() ?: "0")
                binding.description.setText(it.description ?: "")
                binding.editTextNoOfSpace.setText(it.quantity ?: "0")
                binding.editTextNoOfpeoples.setText(it.capacity?.toString() ?: "0")
                binding.switch3.isChecked = if (it.freeSpace.isNullOrEmpty()) false else {
                    it.freeSpace == "Yes"
                }
                setUpAmenitieAsset(it)
                setUpTypes(it)
                setUpEnvironment(it)
                it.images?.mapIndexed { index, s ->
                    addedImage = true
                    Log.e("mResults", "bindData: $s")
                    when (index) {
                        0 -> saveImageFromUrl(s, binding.imageViewAdd1, index, binding.firstRemoveImg)
                        1 -> saveImageFromUrl(s, binding.imageViewAdd2, index, binding.secondRemoveImg)
                        2 -> saveImageFromUrl(s, binding.imageViewAdd3, index, binding.thirdRemoveImg)
                        3 -> saveImageFromUrl(s, binding.imageViewAdd4, index, binding.fourthRemoveImg)
                        else -> {
                        }
                    }
                }
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

    private fun saveImageFromUrl(url: String, imageView: ImageView, index: Int, removeImge: ImageView) {
        Picasso.get().load(url).into(object : Target {
            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}

            override fun onBitmapFailed(e: java.lang.Exception?, errorDrawable: Drawable?) {
            }

            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                Log.e(TAG, "onBitmapLoaded: loaded")
                Thread(Runnable {
                    val file = File(externalCacheDir, url.fileNameWithoutExtn()
                            ?: "image$index")
                    try {
                        Log.e(TAG, "file.exists() : ${file.exists()} ${url.fileNameWithoutExtn()}")

                        if (!file.exists())
                            file.createNewFile()
                        Log.e(TAG, "externalCacheDir: ${file.exists()} ${file.path}")
                        file.writeBitmap(bitmap!!, Bitmap.CompressFormat.JPEG, 100)
                        mResultswork?.add(file.path)
                        runOnUiThread {
                            Picasso.get().load("file://${file.path}").into(imageView)
                            removeImge.visibility = View.VISIBLE
                        }
                        Log.e(TAG, "file.path: ${file.path}")
                    } catch (e: IOException) {
                        Log.e("IOException", e.localizedMessage ?: "")
                    }
                }).start()
            }
        })
    }

    private fun File.writeBitmap(bitmap: Bitmap, format: Bitmap.CompressFormat, quality: Int) {
        outputStream().use { out ->
            bitmap.compress(format, quality, out)
            out.flush()
            out.close()
        }
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
                Log.e(TAG, "onActivityResult: ${mResultswork?.toJson()}")
                mResultswork = data?.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS)
                assert(mResultswork != null)
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }


}