package com.droid.dorpee.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.location.LocationManager
import android.os.Handler
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.droid.dorpee.R
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import org.jetbrains.anko.locationManager
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern


fun Snackbar.withColor(@ColorInt colorInt: Int): Snackbar {
    this.view.setBackgroundColor(colorInt)
    return this
}

fun Activity.showError(message: String, viewGroup: ViewGroup, id: Int = R.color.colorPrimary) {
    try {
        val duration: Long = 2000
        val snackBar = Snackbar.make(viewGroup, message, duration.toInt())
        snackBar.withColor(ContextCompat.getColor(this, id))

        val params = snackBar.view.layoutParams as FrameLayout.LayoutParams
        params.gravity = Gravity.TOP
//    params.height = 600
        snackBar.view.layoutParams = params

        val messageTv =
            snackBar.view.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
        messageTv.textSize = 16.0f
        snackBar.view.visibility = View.INVISIBLE
        snackBar.addCallback(object : Snackbar.Callback() {
            override fun onShown(snackbar: Snackbar?) {
                super.onShown(snackbar)
                snackbar?.view?.visibility = View.VISIBLE
                Handler().postDelayed({
                    snackbar?.view?.visibility = View.INVISIBLE
                }, duration)
            }

        })

        snackBar.show()
    }catch (e:Exception){
        e.printStackTrace()
    }
}
fun showSnackBarCustom(message: String, coordinatorLayout: ViewGroup,color:Int) {
//    coordinatorLayout.rotation = 180.0f
    val snackBar = Snackbar
        .make(coordinatorLayout, message, Snackbar.LENGTH_SHORT)
    val snackBarView = snackBar.view
    snackBarView.setBackgroundColor(color)
    val textView = snackBarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
    textView.rotation =180.0f
    textView.maxLines = 5
    snackBar.show()
}
fun Activity.showCardError(message: String, viewGroup: ViewGroup, id: Int = R.color.colorPrimary) {
    val duration: Long = 2000
    val snackBar = Snackbar.make(viewGroup, message, duration.toInt())
    snackBar.withColor(ContextCompat.getColor(this, id))

    val params = snackBar.view.layoutParams as CoordinatorLayout.LayoutParams
    params.gravity = Gravity.TOP
//    params.height = 600
    snackBar.view.layoutParams = params

    val messageTv =
        snackBar.view.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
    messageTv.textSize = 16.0f

    snackBar.view.visibility = View.INVISIBLE
    snackBar.addCallback(object : Snackbar.Callback() {
        override fun onShown(snackbar: Snackbar?) {
            super.onShown(snackbar)
            snackbar?.view?.visibility = View.VISIBLE
            Handler().postDelayed({
                snackbar?.view?.visibility = View.INVISIBLE
            }, duration)
        }

    })
    snackBar.show()

}
inline fun <reified T : Activity> Activity.navigate() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}

//Ternary Operator ...
infix fun <T> Boolean.then(param: T): T? = if (this) param else null

fun AppCompatActivity.openFragment(containerId: Int, targetFragment: Fragment) {
    val fragmentName = targetFragment.javaClass.name
    supportFragmentManager.beginTransaction()
        .replace(containerId, targetFragment, fragmentName)
        .addToBackStack(fragmentName)
        .commit()
}

fun Fragment.openFragment(containerId: Int, targetFragment: Fragment) {
    val fragmentName = targetFragment.javaClass.name
    parentFragmentManager?.beginTransaction()
        ?.replace(containerId, targetFragment, fragmentName)
        ?.addToBackStack(fragmentName)
        ?.commit()
}

fun Fragment.popBackFragment(fragment: Fragment) {
    try {
        if (parentFragmentManager != null) {
            parentFragmentManager.popBackStackImmediate()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.remove(fragment)
            transaction.commit()
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun String?.isValidEmail(): Boolean {
    return if (this.isNullOrBlank()) {
        false
    } else {
        val regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$"
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(this)
        matcher.matches()
    }
}

fun Any.toJson(): String {
    return Gson().toJson(this)
}

fun Any.toLog(tag: String) {
    Log.e(tag, this.toJson())
}

fun Any.getTAG(): String {
    val elements = Thread.currentThread().stackTrace

    var position = 0
    for (i in elements.indices) {
        if (elements[i].fileName.contains(this.javaClass.simpleName) && !elements[i + 1].className?.contains(
                this.javaClass.`package`?.name!!
            )!!
        ) {
            position = i
            break
        }
    }

    val element = elements[position]
    val className = element.fileName.replace(".java", "")
    return "[" + className + "](" + element.methodName + ":" + element.lineNumber + ")"
}


fun Any.log(log: Any?) {
    Log.e(getTAG(), log?.toJson()!!)
}

fun Any.log(TAG: String, log: Any?) {
    Log.e(TAG, log?.toJson()!!)
}

fun String.formatDate(): String {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    val formatter = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())
    return formatter.format(parser.parse(this)!!)
}

fun String.formatDateChatTime(): String {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    parser.timeZone = TimeZone.getTimeZone("UTC")
    val formatter = SimpleDateFormat("MMM dd, yyyy HH:mm a", Locale.getDefault())
    return formatter.format(parser.parse(this)!!)
}

fun String.formatCardDate(): String {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
    parser.timeZone = TimeZone.getTimeZone("UTC")
    val formatter = SimpleDateFormat("MM/yyyy", Locale.getDefault())
    return formatter.format(parser.parse(this)!!)
}

fun String.formatUTCDateToLong(): Long? {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    parser.timeZone = TimeZone.getTimeZone("UTC")
    val date = parser.parse(this)
    return date?.time!!
}

fun Long.formatTimeToUtc(): String {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
//    val formatter = SimpleDateFormat("HH:mm a", Locale.getDefault())
    return parser.format(Date(this))
}

fun String.formatDateYYYYMMdd(): String {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return formatter.format(parser.parse(this)!!)
}

fun String.formatTime(): String {
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault())
    parser.timeZone = TimeZone.getTimeZone("UTC")

    val formatter = SimpleDateFormat("hh:mm a", Locale.getDefault())
    return formatter.format(parser.parse(this)!!)
}

// to change the UTC to Local time use this function only
fun convertUtc2Local(utcTime: String?): String? {
    var time = ""
    if (utcTime != null) {
        val utcFormatter =
            SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault())
        utcFormatter.timeZone = TimeZone.getTimeZone("UTC")
        var gpsUTCDate: Date? = null //from  ww  w.j  a va 2 s  . c  o  m
        try {
            gpsUTCDate = utcFormatter.parse(utcTime)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        val localFormatter =
            SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        localFormatter.timeZone = TimeZone.getDefault()
        assert(gpsUTCDate != null)
        time = localFormatter.format(gpsUTCDate!!.time)
    }
    return time
}

fun Double.format(digits: Int) = "%.${digits}f".format(this)

fun Double.roundTo2Digits() = String.format("%.2f", this).toDouble()


//fun to Check thise GPS Is turned OFF/ON
fun Context?.CheckGpsStatus():Boolean? {
    val locationManager  = this?.locationManager
    assert(locationManager != null)
    return locationManager?.isProviderEnabled(LocationManager.GPS_PROVIDER)
}


fun Activity?.showLocationDialog(){
    this.let {
        val locationRequest = LocationRequest.create()
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY

        val builder = LocationSettingsRequest.Builder()
            .addLocationRequest(locationRequest)

        val task = LocationServices.getSettingsClient(this!!)
            .checkLocationSettings(builder.build())

        task.addOnFailureListener { e ->
            if (e is ResolvableApiException) {
                try {
                    // Handle result in onActivityResult()
                    e.startResolutionForResult(it,
                        REQUEST_CHECK_SETTINGS)
                } catch (sendEx: IntentSender.SendIntentException) { }
            }
        }
    }
}



fun Int?.toPercent(per:Int):Float{
   return this?.times(per)?.toFloat()?.div(1000)?:0f
}

fun String?.fileNameWithoutExtn(): String? {
    val fileName = this?.substring(this.lastIndexOf('/') + 1, this.length ?:0)
   return fileName//?.substring(0, fileName.lastIndexOf('.'))
}
