package com.droid.dorpee.ui.search.ui.search

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.droid.dorpee.ui.search.model.Data
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class VenueDetailsFragmentArgs(
  val venueData: Data? = null,
  val searchCondition: String = ""
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Data::class.java)) {
      result.putParcelable("venueData", this.venueData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Data::class.java)) {
      result.putSerializable("venueData", this.venueData as Serializable?)
    }
    result.putString("searchCondition", this.searchCondition)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): VenueDetailsFragmentArgs {
      bundle.setClassLoader(VenueDetailsFragmentArgs::class.java.classLoader)
      val __venueData : Data?
      if (bundle.containsKey("venueData")) {
        if (Parcelable::class.java.isAssignableFrom(Data::class.java) ||
            Serializable::class.java.isAssignableFrom(Data::class.java)) {
          __venueData = bundle.get("venueData") as Data?
        } else {
          throw UnsupportedOperationException(Data::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __venueData = null
      }
      val __searchCondition : String?
      if (bundle.containsKey("searchCondition")) {
        __searchCondition = bundle.getString("searchCondition")
        if (__searchCondition == null) {
          throw IllegalArgumentException("Argument \"searchCondition\" is marked as non-null but was passed a null value.")
        }
      } else {
        __searchCondition = ""
      }
      return VenueDetailsFragmentArgs(__venueData, __searchCondition)
    }
  }
}
