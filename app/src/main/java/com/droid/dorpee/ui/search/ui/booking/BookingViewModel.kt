package com.droid.dorpee.ui.search.ui.booking

import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.personaldashboard.models.MDBookingsList
import com.droid.dorpee.utils.BaseViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class BookingViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var apiBookingsResponse: MutableLiveData<MDBookingsList> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun getBookings(auth: RequestWithHeader) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getBookings(auth.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiBookingsResponse.value = response.body()
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
    }
}
