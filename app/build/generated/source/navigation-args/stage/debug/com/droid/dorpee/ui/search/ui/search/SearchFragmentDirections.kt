package com.droid.dorpee.ui.search.ui.search

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.droid.dorpee.R

class SearchFragmentDirections private constructor() {
  companion object {
    fun actionAdvanceSearch(): NavDirections = ActionOnlyNavDirections(R.id.action_advance_search)

    fun actionNavigationSearchToNavigationLogin(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_search_to_navigation_login)
  }
}
