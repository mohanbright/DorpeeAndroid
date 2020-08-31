package com.droid.dorpee.ui.search.ui.checkin

import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.search.ui.checkin.model.AutoCheckinResponse
import com.droid.dorpee.ui.venue.model.EnvironmentResponse
import com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse
import com.droid.dorpee.ui.venue.model.WorkspaceResponse
import com.droid.dorpee.utils.BaseViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class CheckInViewModel  : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiEnvironmentResponse: MutableLiveData<EnvironmentResponse> = MutableLiveData()
    var apiAutoCheckInResponse: MutableLiveData<AutoCheckinResponse> = MutableLiveData()
    var apiWorkspaceResponse: MutableLiveData<WorkspaceResponse> = MutableLiveData()
    var apiVenueAvailibiltyResponse: MutableLiveData<VenueAvailibiltyResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isLoading.value = false
    }


    fun autoCheckIn(auth: RequestWithHeader,venueId:Int) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.autoCheckIn(auth.authentication,venueId)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiAutoCheckInResponse.value = response.body()
                        } else if (response.code() == 401) {
                            val type = object : TypeToken<ErrorResponse>() {}.type
                            val errorResponse =
                                    Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                            apiError.value = errorResponse.error
                        } else if (response.code() == 422) {
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
