package com.droid.dorpee.ui.booking.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.R
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.auth.static.CapacityCheck
import com.droid.dorpee.ui.booking.frags.BookingStep1Fragment
import com.droid.dorpee.ui.booking.frags.BookingStep3Fragment
import com.droid.dorpee.ui.booking.model.EmployeeList
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import com.droid.dorpee.ui.personaldashboard.models.MDContactsList
import com.droid.dorpee.ui.personaldashboard.models.MDResponse
import com.droid.dorpee.ui.search.model.DataModel
import com.droid.dorpee.ui.venue.model.ServicesResponse
import com.droid.dorpee.ui.venue.model.WorkspaceResponse
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.RequestBody
import retrofit2.HttpException

class BookingStepsViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiServicesResponse: MutableLiveData<ServicesResponse> = MutableLiveData()
    var apiWorkspaceResponse: MutableLiveData<WorkspaceResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var apiBookingValidate: MutableLiveData<DataModel> = MutableLiveData()
    var apiCreateContactResponse: MutableLiveData<MDContact> = MutableLiveData()
    var apiContactsResponse: MutableLiveData<MDContactsList> = MutableLiveData()
    var apiDeleteResponse: MutableLiveData<MDResponse> = MutableLiveData()
    var apiEmployeeList: MutableLiveData<List<EmployeeList>> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun getServices() {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.getServices()
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiServicesResponse.value = response.body()
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

    fun validateBooking(mapList: Map<String, RequestBody>, bookingStep1Fragment: BookingStep1Fragment) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                Log.e("The input for Valid","Valid Input is "+mapList)
                val response = service.validateBooking(mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiBookingValidate.value = response.body()
                            bookingStep1Fragment.setAvailable(apiBookingValidate.value?.data?.availability)
                        }
//                        else if (response.code()!= null && response.code() == 401) {
//                            val type = object : TypeToken<ErrorResponse>() {}.type
//                            val errorResponse =
//                                    Gson().fromJson<ErrorResponse>(
//                                            response.errorBody()?.charStream(),
//                                            type
//                                    )
//                            apiError.value = errorResponse.error
//                        }
//                        else if (response.code()!= null &&response.code() == 422) {
//                            var errorBody = DataModel(response.body()!!.data)
//                            errorBody.data.availability ="false"
//                            errorBody.data.message = "Workspace is not available for selected date and time slot"
//                            errorBody.data.max_available = 0
//                            apiBookingValidate.value = errorBody
//                        }
                        else {
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


    fun getContacts(header: RequestWithHeader) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getContacts(header.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiContactsResponse.value = response.body()
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

    fun deleteContact(header: RequestWithHeader, id: Int) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.deleteContact(header.authentication, id)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiDeleteResponse.value = response.body()
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

    fun  createBookingEmployee(header: RequestWithHeader, purchaseCredit: createBookingEmployeeRequest, context: Context, activity: FragmentActivity, fragment: BookingStep3Fragment) {
        Log.e("Plan id to ","Purchase Plan Id : "+purchaseCredit.credits);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.createBookingEmployee(header.authentication, purchaseCredit)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        apiPurchasePlanRequest.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.booking_thankyou_employee), Toast.LENGTH_LONG).show()
                        AppPreferences.getInstance(context)!!.setIsCompanyEmployee(false)
                        activity.finish()
                        fragment.openBookingScreen()
                        CapacityCheck.setValue(0)
                    }
                    else if (response.code() == 401) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }
                   else {
                        apiError.value = "UnKnown error"
                        Toast.makeText(context, context.resources.getString(R.string.booking_creditsError), Toast.LENGTH_LONG).show()
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

    fun  createBookingPersonal(header: RequestWithHeader, purchaseCredit: createBookingPersonalRequest, context: Context, activity: FragmentActivity, fragment: BookingStep3Fragment) {
        Log.e("Plan id to ","Purchase Plan Id : "+purchaseCredit.credits);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.createBookingPersonal(header.authentication, purchaseCredit)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        apiPurchasePlanRequest.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.booking_thankyou), Toast.LENGTH_LONG).show()
                        AppPreferences.getInstance(context)?.setRemainingCredit((AppPreferences.getInstance(context)!!.getRemainingCredit()) - (response.body()!!.data.credits))
                        activity.finish()
                        fragment.openBookingScreen()
                        CapacityCheck.setValue(0)
                    }
                    else if (response.code() == 401) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }
                    else {
                        apiError.value = "UnKnown error"
                        Toast.makeText(context, context.resources.getString(R.string.booking_creditsError), Toast.LENGTH_LONG).show()
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

    fun  getEmployeeList(header: RequestWithHeader, context: Context, fragment: BookingStep1Fragment) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getEmploeeList(header.authentication)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiEmployeeList.value = response.body()
                        fragment.setEmployeeList()
                    }else {
                        apiError.value = "UnKnown error"
                        Toast.makeText(context, context.resources.getString(R.string.booking_creditsError), Toast.LENGTH_LONG).show()
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

    fun  editBookingpersonal(header: RequestWithHeader, purchaseCredit: editBookingPersonalRequest, context: Context, activity: FragmentActivity, fragment: BookingStep3Fragment, bookingId: String) {
        Log.e("Plan id to ","Purchase Plan Id : "+purchaseCredit.credits);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.editBookingPersonal(header.authentication,bookingId, purchaseCredit)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        apiPurchasePlanRequest.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.editbooking_thankyou), Toast.LENGTH_LONG).show()
                        AppPreferences.getInstance(context)!!.setIsCompanyEmployee(false)
                        activity.finish()
                        fragment.openBookingScreen()
                        CapacityCheck.setValue(0)
                    }
                    else if (response.code() == 401) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }
                    else {
                        apiError.value = "UnKnown error"
                        Toast.makeText(context, context.resources.getString(R.string.booking_creditsError), Toast.LENGTH_LONG).show()
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

    fun  editBookingEmployee(header: RequestWithHeader, purchaseCredit: editBookingEmployeeRequest, context: Context, activity: FragmentActivity, fragment: BookingStep3Fragment, bookingId: String) {
        Log.e("Plan id to ","Purchase Plan Id : "+purchaseCredit.credits);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.editBookingEmployee(header.authentication,bookingId, purchaseCredit)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
//                        apiPurchasePlanRequest.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.editbooking_thankyou_employee), Toast.LENGTH_LONG).show()
                        AppPreferences.getInstance(context)!!.setIsCompanyEmployee(false)
                        activity.finish()
                        fragment.openBookingScreen()
                        CapacityCheck.setValue(0)
                    }
                    else if (response.code() == 401) {
                        val type = object : TypeToken<ErrorResponse>() {}.type
                        val errorResponse =
                                Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
                        apiError.value = errorResponse.error
                    }
                    else {
                        apiError.value = "UnKnown error"
                        Toast.makeText(context, context.resources.getString(R.string.booking_creditsError), Toast.LENGTH_LONG).show()
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