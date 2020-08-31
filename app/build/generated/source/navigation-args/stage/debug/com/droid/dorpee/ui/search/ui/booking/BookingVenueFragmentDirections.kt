package com.droid.dorpee.ui.search.ui.booking

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.droid.dorpee.R

class BookingVenueFragmentDirections private constructor() {
  companion object {
    fun actionBookingVenueFragmentToVenueDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_bookingVenueFragment_to_venueDashFragment)

    fun actionBookingVenueFragmentToPersonalDashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_bookingVenueFragment_to_personalDashFragment)
  }
}
