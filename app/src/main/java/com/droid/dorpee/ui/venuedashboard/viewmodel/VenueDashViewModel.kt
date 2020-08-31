package com.droid.dorpee.ui.venuedashboard.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.R
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.auth.model.PlanModel
import com.droid.dorpee.ui.auth.model.TransactionData
import com.droid.dorpee.ui.personaldashboard.fragments.CreditFragment
import com.droid.dorpee.ui.personaldashboard.fragments.TransactionFragment
import com.droid.dorpee.ui.personaldashboard.models.MDBookingsList
import com.droid.dorpee.ui.personaldashboard.models.MDCards
import com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse
import com.droid.dorpee.ui.venuedashboard.model.*
import com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.BarChartResponse
import com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.PieChartResponse
import com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.HttpException

class VenueDashViewModel : BaseViewModel() {
    private  val TAG = "VenueDashViewModel"
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiVenueDashboardResponse: MutableLiveData<VenueDashboardResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var apiBookingsResponse: MutableLiveData<MDBookingsList> = MutableLiveData()
    var apiBlockIntResponse: MutableLiveData<BlockInOutResponse> = MutableLiveData()
    var apiBlockResponse: MutableLiveData<BlockResponse> = MutableLiveData()
    var apiUnBlockResponse: MutableLiveData<UnBlockResponse> = MutableLiveData()
    var apiBookingChangeStatus: MutableLiveData<VenueBooking> = MutableLiveData()
    var apiResponse: MutableLiveData<ResponseBody> = MutableLiveData()
    var apiAllVenuesResponse: MutableLiveData<AllVenuesResponse> = MutableLiveData()
    var apiVenueDurationResponse: MutableLiveData<VenueDurationResponse> = MutableLiveData()
    var apiBlockedSpaceResponse: MutableLiveData<BlockedSpaceResponse> = MutableLiveData()
    var apiSearchReference: MutableLiveData<PreferencesResponse> = MutableLiveData()
    var apiDelSearchReference: MutableLiveData<PreferencesResponse> = MutableLiveData()
    var apiCreditPriceResponse: MutableLiveData<PlanModel> = MutableLiveData()
    var apiTransactionList: MutableLiveData<List<TransactionData>> = MutableLiveData()
    var apiPieChartResponse: MutableLiveData<PieChartResponse> = MutableLiveData()
    var apiBarChartResponse: MutableLiveData<BarChartResponse> = MutableLiveData()
    var apiPaymentProfileResponse: MutableLiveData<PaymentProfileResponse> = MutableLiveData()
    var apiProfileResponse: MutableLiveData<PaymentProfileResponse> = MutableLiveData()
    var apiAddCardResponse: MutableLiveData<MDCards> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun getVenueDashboard(auth: RequestWithHeader) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.getVenueDashboard(auth.authentication)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiVenueDashboardResponse.value = response.body()
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

    fun blockAvailability(auth: RequestWithHeader, request: BlockAvailbilityRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.blockAvailability(auth.authentication, request)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {

                        apiBlockResponse.value = response.body()
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

    fun unBlockAvailability(auth: RequestWithHeader, request: UnblockRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.unblockAvailabilty(auth.authentication, request)
            withContext(Dispatchers.Main) {
                try {
                    isLoading.value = false
                    if (response.isSuccessful && response.body() != null) {
                        apiUnBlockResponse.value = response.body()
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

            }
        }
    }

    fun getAvailability(auth: RequestWithHeader) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getAvailability(auth.authentication)
            withContext(Dispatchers.Main) {
                try {
                    isLoading.value = false
                    if (response.isSuccessful && response.body() != null) {
                        apiBlockIntResponse.value = response.body()
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

            }
        }
    }



    fun getVenues(auth: RequestWithHeader) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.getVenues(auth.authentication)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiAllVenuesResponse.value = response.body()
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

    fun getVenueRevenue(auth: RequestWithHeader, filter: String, venue_id: Int) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = if (venue_id == 0)
                    service.getAllVenueRevenue(auth.authentication, filter)
                else
                    service.getSingleVenueRevenue(auth.authentication, filter, venue_id)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiVenueDurationResponse.value = response.body()
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

    fun getBlockedSpace(auth: RequestWithHeader, space_id: Int) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response=  service.getBlockedSpaces(auth.authentication, space_id)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiBlockedSpaceResponse.value = response.body()
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

    fun updateBlockedSpace(auth: RequestWithHeader,request :DataBlocked) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response=  service.updateBlockedSpaces(auth.authentication, request)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiBlockedSpaceResponse.value = response.body()
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


    fun changeVenueBookingStatus(auth: RequestWithHeader, request: ChangeStatusRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.changeVenueBookingStatus(auth.authentication, request)
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
    fun checkIn(auth: RequestWithHeader, checkInReq: CheckInRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.checkIn(auth.authentication, checkInReq)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiResponse.value = response.body()
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

    fun getCreditPrice(fragmentActivity: CreditFragment) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.creditPrice()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        Log.e("The Data is","Credit Price is "+ response.body()!!.data.credit_price)
                        apiCreditPriceResponse.value = response.body()
                        fragmentActivity.setPriceData(0,apiCreditPriceResponse.value?.data?.credit_price!!)
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

    fun purchaseCredit(header: RequestWithHeader, purchaseCredit: purchaseCreditRequest, context: Context, activity: CreditFragment) {
        Log.e("Plan id to ","Purchase Plan Id : "+purchaseCredit.credits);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.purchaseCredits(header.authentication, purchaseCredit)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        apiPurchasePlanRequest.value = response.body()
                        AppPreferences.getInstance(context)?.setRemainingCredit(response.body()!!.data.total_credits!!)
                        Toast.makeText(context, context.resources.getString(R.string.credits_added), Toast.LENGTH_LONG).show()
                        activity.setRefreshData()
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
    fun getBarChart(header: RequestWithHeader) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getBarChart(header.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        log(response.body()?:"".toJson())
                        apiBarChartResponse.value = response.body()
//                        Log.e(TAG, "getBarChart: ${response.body()?.toJson()}" )
                    } else if (response.code() == 422) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }else if (response.code() == 401) {
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

    fun getPieChart(header: RequestWithHeader) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getPieChart(header.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiPieChartResponse.value = response.body()
                    }  else if (response.code() == 422) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }else if (response.code() == 401) {
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
    fun addCard(header: RequestWithHeader, addCardRequest: AddCardRequest, creditFragment: CreditFragment) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.addCard(header.authentication, addCardRequest)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                         apiAddCardResponse.value = response.body()
                        creditFragment.purchaseCredits()
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

    fun getTransactions(header: RequestWithHeader, context: Context, activity: TransactionFragment) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getTransactions(header.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        Log.e("Transaction ","Transaction Data is "+response.body()!!.data.get(0).amount)
                        apiTransactionList.value = response.body()?.data
                        activity.setTransactionAdapter( apiTransactionList.value!!)
                    }
                    else if (response.code() == 401) {
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
    fun updatePaymentDetailsVenue(header: RequestWithHeader,mapList: Map<String, RequestBody> ) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.updatePaymentDetailsVenue(header.authentication,mapList)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiPaymentProfileResponse.value = response.body()
                    }
                    else if (response.code() == 422) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }
                    else if (response.code() == 401) {
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
    fun getProfile(header: RequestWithHeader ) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getProfile(header.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiProfileResponse.value = response.body()
                    }
                    else if (response.code() == 422) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }
                    else if (response.code() == 401) {
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