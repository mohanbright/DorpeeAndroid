package com.droid.dorpee.ui.search.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.VenueAvailityReq
import com.droid.dorpee.ui.auth.model.InterestResponse
import com.droid.dorpee.ui.venue.model.*
import com.droid.dorpee.ui.venue.venueresponse.VenueResponse
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*
import retrofit2.HttpException
import java.net.UnknownHostException

class DashboardViewModel() : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiServicesResponse: MutableLiveData<ServicesResponse> = MutableLiveData()
    var apiTypesResponse: MutableLiveData<TypesResponse> = MutableLiveData()
    var apiInterestResponse: MutableLiveData<InterestResponse> = MutableLiveData()
    var apiVeneueTypes: MutableLiveData<VenueTypeResponse> = MutableLiveData()
    var apiEnvironmentResponse: MutableLiveData<EnvironmentResponse> = MutableLiveData()
    var apiAssetsResponse: MutableLiveData<AssetsResponse> = MutableLiveData()
    var apiVenueResponse: MutableLiveData<VenueResponse> = MutableLiveData()
    var apiWorkspaceResponse: MutableLiveData<WorkspaceResponse> = MutableLiveData()
    var apiVenueAvailibiltyResponse: MutableLiveData<VenueAvailibiltyResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isLoading.value = false
    }

    val handler = CoroutineExceptionHandler { _, exception ->
        //Handle your exception
        log(exception)
    }

    fun getServices() {
        isLoading.value = true
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
    }

    fun getTypes() {
//        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service.getTypes()
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiTypesResponse.value = response.body()
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
//                isLoading.value = false
                    }
                }
            }
        } catch (e: UnknownHostException) {

        }
    }

    fun getInterests() {
//        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service. getInterest()
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiInterestResponse.value = response.body()
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
//                isLoading.value = false
                    }
                }
            }
        } catch (e: UnknownHostException) {

        }
    }

    fun getVenueTypes() {
//        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service. getVenueTypes()
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiVeneueTypes.value = response.body()
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
//                isLoading.value = false
                    }
                }
            }
        } catch (e: UnknownHostException) {

        }
    }

    fun getEnvironment() {
//        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service.getEnvironment()
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiEnvironmentResponse.value = response.body()
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
//                isLoading.value = false
                    }
                }
            }
        } catch (e: UnknownHostException) {

        }
    }

    fun getAssets() {
//        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service.getAssets()
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiAssetsResponse.value = response.body()
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
//                isLoading.value = false
                    }
                }
            }
        } catch (e: UnknownHostException) {

        }
    }

    fun addvenueAvailabilty(token: String, req: VenueAvailityReq) {
        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service.venueAvailabilty(token, req)
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiVenueAvailibiltyResponse.value = response.body()
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
            }
        } catch (e: UnknownHostException) {

        }
    }

    fun getWorkSpaces(token: String) {

        isLoading.value = true
        try {
            viewModelScope.launch(handler) {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service.getWorkSpaces(token)
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiWorkspaceResponse.value = response.body()
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
            }
        } catch (e: UnknownHostException) {
        }
    }
}