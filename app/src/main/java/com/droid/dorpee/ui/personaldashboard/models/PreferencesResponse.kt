package com.droid.dorpee.ui.personaldashboard.models

import com.droid.dorpee.ui.search.model.Data
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PreferencesResponse : Serializable {
    @SerializedName("data")
    val `data`: List<PreferenceData>? = null
}