package com.droid.dorpee.ui.baseClasses

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.IntentSender
import android.location.LocationManager
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.BuildConfig
import com.droid.dorpee.R
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.AUTOCOMPLETE_REQUEST_CODE
import com.droid.dorpee.utils.ProgressRequestBody
import com.droid.dorpee.utils.REQUEST_CHECK_SETTINGS
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.propane.ui.signup.locationModel.AddressInfo
import com.propane.ui.signup.locationModel.Zza
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.jetbrains.anko.locationManager
import org.json.JSONException
import org.json.JSONObject
import java.io.File

/**
 * Created by Vishal on 10/10/19.
 */

abstract class BaseActivity : AppCompatActivity() {
    // since its going to be common for all the activities

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
//            window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        }
        Places.initialize(applicationContext, getString(R.string.maps_key) )

    }
    fun jsonobjectToClassObject(response: String): AddressInfo {
        val zzalist = ArrayList<Zza>()
        try {
            val jsonObject = JSONObject(response)
            val results = jsonObject.getJSONArray("zza")

            for (i in 0 until results.length()) {
                val zzaOutside = results.getJSONObject(i)
                val zza = zzaOutside.getString("zza")
                val zzb = zzaOutside.getString("zzb")
                val zzc = zzaOutside.getJSONArray("zzc")
                val zzaObj = Zza(zza, zzb, zzc[0].toString())
                zzalist.add(zzaObj)

            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return AddressInfo(zzalist)
    }
    override fun onStart() {
        super.onStart()

        bindData()
        initListeners()
    }
    fun onSearchCalled() {
        // Set the fields to specify which types of place data to return.
        val fields = listOf(
            Place.Field.ID,
            Place.Field.NAME,
            Place.Field.ADDRESS,
            Place.Field.LAT_LNG,
            Place.Field.ADDRESS_COMPONENTS
        )
        // Start the autocomplete intent.
        val intent = Autocomplete.IntentBuilder(
            AutocompleteActivityMode.OVERLAY, fields
        ).setCountry("AUS")
            .build(this)
        startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE)
    }
    abstract fun bindData()

    abstract fun initListeners()

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun createPartFromString(param: String) : RequestBody {
        return param.toRequestBody("multipart/form-data".toMediaTypeOrNull())
    }

    fun requestUploadImage(multiPartImage: String,name:String): MultipartBody.Part? {
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
    /**
     * Common function for Set Up ViewModel...
     * if no ViewModel Available then use BaseViewModel ...
     * You can also send parameters in constructor ...
     */
    fun setUpViewModel(activity: AppCompatActivity, obj: ViewModel): ViewModel {
        val provider = AppVMProvider()
        provider.createParams(obj)
        return ViewModelProvider(
            activity, provider
        ).get(obj::class.java)
    }

    abstract fun setUpVM(): ViewModel?
    //fun to Check thise GPS Is turned OFF/ON

    fun isNetworkAvailable(): Boolean {
        val connectivityManager = application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        val activeNetworkInfo = connectivityManager?.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }


    //fun to show dialog for turning on the GPS


}

