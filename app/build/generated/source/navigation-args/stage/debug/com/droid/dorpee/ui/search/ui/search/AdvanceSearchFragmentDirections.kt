package com.droid.dorpee.ui.search.ui.search

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.droid.dorpee.R
import com.droid.dorpee.ui.search.model.SearchResponse
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

class AdvanceSearchFragmentDirections private constructor() {
  private data class ActionSearchResult(
    val searchData: SearchResponse? = null,
    val searchCondition: String = ""
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_search_result

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(SearchResponse::class.java)) {
        result.putParcelable("searchData", this.searchData as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(SearchResponse::class.java)) {
        result.putSerializable("searchData", this.searchData as Serializable?)
      }
      result.putString("searchCondition", this.searchCondition)
      return result
    }
  }

  companion object {
    fun actionCancelSearch(): NavDirections = ActionOnlyNavDirections(R.id.action_cancel_search)

    fun actionSearchResult(searchData: SearchResponse? = null, searchCondition: String = ""):
        NavDirections = ActionSearchResult(searchData, searchCondition)

    fun actionNavigationAdvanceSearchToPersonalDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_advance_search_to_personalDashFragment)

    fun actionNavigationAdvanceSearchToVenueDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_advance_search_to_venueDashFragment)
  }
}
