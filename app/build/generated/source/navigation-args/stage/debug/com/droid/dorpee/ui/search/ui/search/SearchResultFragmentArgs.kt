package com.droid.dorpee.ui.search.ui.search

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.droid.dorpee.ui.search.model.SearchResponse
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class SearchResultFragmentArgs(
  val searchData: SearchResponse? = null,
  val searchCondition: String = ""
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(SearchResponse::class.java)) {
      result.putParcelable("searchData", this.searchData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(SearchResponse::class.java)) {
      result.putSerializable("searchData", this.searchData as Serializable?)
    }
    result.putString("searchCondition", this.searchCondition)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): SearchResultFragmentArgs {
      bundle.setClassLoader(SearchResultFragmentArgs::class.java.classLoader)
      val __searchData : SearchResponse?
      if (bundle.containsKey("searchData")) {
        if (Parcelable::class.java.isAssignableFrom(SearchResponse::class.java) ||
            Serializable::class.java.isAssignableFrom(SearchResponse::class.java)) {
          __searchData = bundle.get("searchData") as SearchResponse?
        } else {
          throw UnsupportedOperationException(SearchResponse::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __searchData = null
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
      return SearchResultFragmentArgs(__searchData, __searchCondition)
    }
  }
}
