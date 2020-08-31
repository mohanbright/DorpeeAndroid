package com.droid.dorpee.ui.search.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SearchResponse :Serializable{
    @SerializedName("data")
    val `data`: List<Data>? = null
}