package com.droid.dorpee.ui.search.ui.checkin

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.droid.dorpee.R

class CheckInFragmentDirections private constructor() {
  companion object {
    fun actionNavigationCheckInToPersonalDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_check_in_to_personalDashFragment)

    fun actionNavigationCheckInToVenueDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_check_in_to_venueDashFragment)
  }
}
