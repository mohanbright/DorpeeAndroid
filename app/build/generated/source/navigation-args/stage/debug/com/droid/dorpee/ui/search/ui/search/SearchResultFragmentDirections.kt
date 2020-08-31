package com.droid.dorpee.ui.search.ui.search

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.droid.dorpee.R
import com.droid.dorpee.ui.search.model.Data
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

class SearchResultFragmentDirections private constructor() {
  private data class ActionVenueDetail(
    val venueData: Data? = null,
    val searchCondition: String = ""
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_venue_detail

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Data::class.java)) {
        result.putParcelable("venueData", this.venueData as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(Data::class.java)) {
        result.putSerializable("venueData", this.venueData as Serializable?)
      }
      result.putString("searchCondition", this.searchCondition)
      return result
    }
  }

  companion object {
    fun actionBackAdvanceSearch(): NavDirections =
        ActionOnlyNavDirections(R.id.action_back_advance_search)

    fun actionVenueDetail(venueData: Data? = null, searchCondition: String = ""): NavDirections =
        ActionVenueDetail(venueData, searchCondition)
  }
}
