package com.droid.dorpee.ui.baseClasses

import `in`.madapps.placesautocomplete.model.Address
import android.content.Context
import android.net.ConnectivityManager
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.ui.venue.PlaceAddress
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.utils.ProgressRequestBody
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File

abstract class BaseFragment : Fragment() {
    var street = ""
    var address2 = ""
    var city = ""
    var state = ""
    var zipcode = ""
    var country = ""
    override fun onStart() {
        super.onStart()
        bindData()
        initListeners()
    }

    protected abstract fun bindData()

    protected abstract fun initListeners()

    abstract fun setUpVM(): ViewModel?

    fun hideKeyboard(context: Context) {
        val view = (context as BaseActivity).currentFocus
        if (view != null) {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun requestUploadImage(multiPartImage: String, name: String): MultipartBody.Part? {
        val file = File(multiPartImage)

        val surveyBody = ProgressRequestBody(file, object : ProgressRequestBody.UploadCallbacks {
            override fun onProgressUpdate(percentage: Int) {

            }

            override fun onError() {
            }

            override fun onFinish() {
            }

            override fun uploadStart() {
            }

        }, "image")
        return MultipartBody.Part.createFormData(
                name,
                file.name,
                surveyBody
        )

    }

    fun createPartFromString(param: String): RequestBody {
        return param.toRequestBody("multipart/form-data".toMediaTypeOrNull())
    }

    /**
     * Common function for Set Up ViewModel...
     * if no ViewModel Available then use BaseViewModel ...
     * You can also send parameters in constructor ...
     */
    fun setUpVM(fragment: Fragment, obj: ViewModel): ViewModel {
        val provider = AppVMProvider()
        provider.createParams(obj)
        return ViewModelProvider(
                fragment, provider
        ).get(obj::class.java)
    }

    fun isNetworkAvailable(): Boolean {
        val connectivityManager =
                requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        val activeNetworkInfo = connectivityManager?.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    fun emptyAdress() {
        street = ""
        address2 = ""
        city = ""
        state = ""
        zipcode = ""
        country = ""
        RegisterVenueActivity.placesAddress = null
    }

    fun parseAddress(address: ArrayList<Address>) {
        emptyAdress()
        (0 until address.size).forEach { i ->
            when {
                address[i].type.contains("street_number") -> street = address[i].shortName + " "
                address[i].type.contains("route") -> street = address[i].shortName
                address[i].type.contains("locality") -> city = address[i].shortName
                address[i].type.contains("administrative_area_level_1") -> state =
                        address[i].shortName
                address[i].type.contains("country") -> country = address[i].shortName
                address[i].type.contains("postal_code") -> zipcode = address[i].shortName
            }
        }
        RegisterVenueActivity.placesAddress = PlaceAddress(street, address2, city, state, zipcode, country)

    }
}