package com.droid.dorpee.ui.personaldashboard.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.R
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.auth.model.PlanModel
import com.droid.dorpee.ui.personaldashboard.models.MDBookingX
import com.droid.dorpee.ui.personaldashboard.models.MDBookingsList
import com.droid.dorpee.ui.personaldashboard.models.PlansList
import com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse
import com.droid.dorpee.ui.personaldashboard.personalItem.TopUpActivity
import com.droid.dorpee.ui.venue.model.ServicesResponse
import com.droid.dorpee.ui.venue.venueresponse.VenueResponse
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.HttpException

class PersonalViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiServicesResponse: MutableLiveData<ServicesResponse> = MutableLiveData()
    var apiBookingsResponse: MutableLiveData<MDBookingsList> = MutableLiveData()
    var apiBookingChangeStatus: MutableLiveData<MDBookingX> = MutableLiveData()
    var apiResponse: MutableLiveData<ResponseBody> = MutableLiveData()
    var apiVenueResponse: MutableLiveData<VenueResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var apiPlansResponse: MutableLiveData<PlansList> = MutableLiveData()
    var apiDelSearchReference: MutableLiveData<PreferencesResponse> = MutableLiveData()
    var apiSearchReference: MutableLiveData<PreferencesResponse> = MutableLiveData()
    var apiCreditPriceResponse: MutableLiveData<PlanModel> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun searchPreference(auth: RequestWithHeader) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getPreferences(auth.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiSearchReference.value = response.body()
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

    fun cancelBooking(auth: RequestWithHeader, bookingId: Int, request: CancelRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.cancelBooking(auth.authentication, bookingId, request)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiBookingChangeStatus.value = response.body()
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


/*
    fun getCreditPrice(topUpActivity: TopUpActivity) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.creditPrice()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        Log.e("The Data is","Credit Price is "+ response.body()!!.data.credit_price)
                        apiCreditPriceResponse.value = response.body()
                        topUpActivity.setPriceData(0,apiCreditPriceResponse.value?.data?.credit_price!!)
                        //  apiContactsResponse.value = response.body()
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
*/
    fun changeStatus(auth: RequestWithHeader, request: ChangeStatusRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.changeStatus(auth.authentication, request)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiBookingChangeStatus.value = response.body()
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

    fun extendBooking(auth: RequestWithHeader, extendReq: ExtendRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.extendBooking(auth.authentication, extendReq)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiResponse.value = response.body()
                    } else if (response.code() == 401 || response.code() == 404) {
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

    fun getPlans() {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getPlans()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiPlansResponse.value = response.body()
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
    fun deleteSearchPreference(auth: RequestWithHeader, id : Int) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.deletePreferencesItem(auth.authentication, id)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiDelSearchReference.value = response.body()
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

    fun purchaseCredit(header: RequestWithHeader, purchaseCredit: purchaseCreditRequest, context: Context, activity: TopUpActivity) {
        Log.e("Plan id to ","Purchase Plan Id : "+purchaseCredit.credits);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.purchaseCredits(header.authentication, purchaseCredit)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        apiPurchasePlanRequest.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.credits_added), Toast.LENGTH_LONG).show()
                        AppPreferences.getInstance(context)?.setRemainingCredit(response.body()!!.data.total_credits!!)
                        activity.onBackPressed()
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