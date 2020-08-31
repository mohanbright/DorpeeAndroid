package com.droid.dorpee.ui.search.ui.search

import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.search.model.SearchResponse
import com.droid.dorpee.ui.venue.model.AssetsResponse
import com.droid.dorpee.ui.venue.model.EnvironmentResponse
import com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse
import com.droid.dorpee.ui.venue.model.WorkspaceResponse
import com.droid.dorpee.ui.venue.venueresponse.VenueResponse
import com.droid.dorpee.utils.BaseViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.RequestBody
import retrofit2.HttpException

class SearchViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiEnvironmentResponse: MutableLiveData<EnvironmentResponse> = MutableLiveData()
    var apiAssetsResponse: MutableLiveData<AssetsResponse> = MutableLiveData()
    var apiWorkspaceResponse: MutableLiveData<WorkspaceResponse> = MutableLiveData()
    var apiVenueAvailibiltyResponse: MutableLiveData<VenueAvailibiltyResponse> = MutableLiveData()
    var apiSearchResponse: MutableLiveData<SearchResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var apiSingleVenueResponse: MutableLiveData<VenueResponse> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun basicSearch(mapList: Map<String, RequestBody>) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.basicSearch(mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiSearchResponse.value = response.body()
                        } else if (response.code() == 401) {
                            val type = object : TypeToken<ErrorResponse>() {}.type
                            val errorResponse =
                                Gson().fromJson<ErrorResponse>(
                                    response.errorBody()?.charStream(),
                                    type
                                )
                            apiError.value = errorResponse.error
                        } else {
                            apiError.value = "UnKnown error"
                        }
                    } catch (e: HttpException) {
                        apiError.value = setUpErrors(e)
                    } catch (e: Throwable) {
                        apiError.value = setUpErrors(e)
                    }
                    isLoading.value = false
                }
            }
        } catch (e: Exception) {

        }
    }



    fun advanceSearch(token: String, mapList: Map<String, RequestBody>) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.advanceSearch(token, mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiSearchResponse.value = response.body()
                        } else if (response.code() == 401) {
                            val type = object : TypeToken<ErrorResponse>() {}.type
                            val errorResponse =
                                Gson().fromJson<ErrorResponse>(
                                    response.errorBody()?.charStream(),
                                    type
                                )
                            apiError.value = errorResponse.error
                        } else {
                            apiError.value = "UnKnown error"
                        }
                    } catch (e: HttpException) {
                        apiError.value = setUpErrors(e)
                    } catch (e: Throwable) {
                        apiError.value = setUpErrors(e)
                    }
                    isLoading.value = false
                }
            }
        } catch (e: Exception) {

        }
    }

    fun getSingleWithoutTokenVenue(auth: RequestWithHeader, venueId:Int) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.getSingleWithoutTokenVenue(auth.authentication,venueId)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiSingleVenueResponse.value = response.body()
                        } else if (response.code() == 401) {
                            val type = object : TypeToken<ErrorResponse>() {}.type
                            val errorResponse =
                                    Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                            apiError.value = errorResponse.error
                        } else {
                            apiError.value = "UnKnown error"
                        }
                    } catch (e: HttpException) {
                        apiError.value = setUpErrors(e)
                    } catch (e: Throwable) {
                        apiError.value = setUpErrors(e)
                    }
                    isLoading.value = false
                }
            }
        } catch (e: Exception) {

        }
    }


}

