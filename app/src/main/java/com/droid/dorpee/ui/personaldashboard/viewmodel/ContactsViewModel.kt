package com.droid.dorpee.ui.personaldashboard.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import com.droid.dorpee.ui.personaldashboard.models.MDContactsList
import com.droid.dorpee.ui.personaldashboard.models.MDResponse
import com.droid.dorpee.utils.BaseViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class ContactsViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiCreateContactResponse: MutableLiveData<MDContact> = MutableLiveData()
    var apiContactsResponse: MutableLiveData<MDContactsList> = MutableLiveData()
    var apiDeleteResponse: MutableLiveData<MDResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isLoading.value = false
    }

//    fun createContact(header: String, createTeamRequest: CreateTeamRequest) {
//        isLoading.value = true
//        CoroutineScope(Dispatchers.IO).launch {
//            val service = RetrofitFactory.makeRetrofitService()
//            val response = service.createContact(header, createTeamRequest)
//            withContext(Dispatchers.Main) {
//                try {
//                    if (response.isSuccessful && response.body() != null) {
//                        apiCreateTeamResponse.value = response.body()
//                    } else if (response.code() == 401) {
//                        val type = object : TypeToken<ErrorResponse>() {}.type
//                        val errorResponse =
//                            Gson().fromJson<ErrorResponse>(response.errorBody()?.charStream(), type)
//                        apiError.value = errorResponse.error
//                    } else {
//                        apiError.value = "UnKnown error"
//                    }
//                } catch (e: HttpException) {
//                    apiError.value = setUpErrors(e)
//                } catch (e: Throwable) {
//                    apiError.value = setUpErrors(e)
//                }
//                isLoading.value = false
//            }
//        }
//    }


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
}