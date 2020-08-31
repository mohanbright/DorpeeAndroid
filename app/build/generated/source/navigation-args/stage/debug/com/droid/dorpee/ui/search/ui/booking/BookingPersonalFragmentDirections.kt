package com.droid.dorpee.ui.search.ui.booking

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.droid.dorpee.R

class BookingPersonalFragmentDirections private constructor() {
  companion object {
    fun actionNavigationBookingToVenueDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_booking_to_venueDashFragment)

    fun actionNavigationBookingToPersonalDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_booking_to_personalDashFragment)
  }
}
