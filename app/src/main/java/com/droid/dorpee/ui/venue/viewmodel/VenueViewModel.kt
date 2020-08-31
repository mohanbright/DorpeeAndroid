package com.droid.dorpee.ui.venue.viewmodel

import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.VenueAvailityReq
import com.droid.dorpee.ui.venue.model.*
import com.droid.dorpee.ui.venue.venueresponse.VenueResponse
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.toJson
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException
import java.net.UnknownHostException

class VenueViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiServicesResponse: MutableLiveData<ServicesResponse> = MutableLiveData()
    var apiTypesResponse: MutableLiveData<TypesResponse> = MutableLiveData()
    var apiEnvironmentResponse: MutableLiveData<EnvironmentResponse> = MutableLiveData()
    var apiAssetsResponse :MutableLiveData<AssetsResponse> = MutableLiveData()
    var apiVenueResponse: MutableLiveData<VenueResponse> = MutableLiveData()
    var apiWorkspaceResponse: MutableLiveData<WorkspaceResponse> = MutableLiveData()
    var apiSingleSpaceRespnce: MutableLiveData<SingleSpaceRespnce> = MutableLiveData()
    var apiEditSpaceRespnce: MutableLiveData<EditSpaceRespnce> = MutableLiveData()
    var apiVenueAvailibiltyResponse: MutableLiveData<VenueAvailibiltyResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var apiVeneueTypes: MutableLiveData<VenueTypeResponse> = MutableLiveData()
    var apiSuggestedPriceResponse: MutableLiveData<SuggestedPriceResponse> = MutableLiveData()

    init {
        isLoading.value = false
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

    fun getTypes() {
//        isLoading.value = true
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
//                isLoading.value = false
            }
        }
    }

    fun getEnvironment() {
//        isLoading.value = true
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
//                isLoading.value = false
            }
        }
    }
    fun getAssets() {
//        isLoading.value = true
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
//                isLoading.value = false
            }
        }
    }



    fun venueCreate(
        mapList: Map<String, RequestBody>,
        token: String,
        addImagesList: List<MultipartBody.Part>?
    ) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.createVenue(token, addImagesList, mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiVenueResponse.value = response.body()
                        } else if (response.code() == 422) {
                            val errorResponse =
                                Gson().fromJson(
                                    response.errorBody()?.string()?.toJson(),
                                    String::class.java
                                )
                            if (errorResponse.contains("email", true))
                                apiError.value = "The email has already been taken."
                            else
                                apiError.value = "The given data was invalid."
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

    fun venueUpdate(
            mapList: Map<String, RequestBody>,
            token: String,
            addImagesList: List<MultipartBody.Part>?,
            venueId: Int
    ) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.updateVenue(token, addImagesList, mapList,venueId)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiVenueResponse.value = response.body()
                        } else if (response.code() == 422) {
                            val errorResponse =
                                Gson().fromJson<String>(
                                    response.errorBody()?.string()?.toJson(),
                                    String::class.java
                                )
                            if (errorResponse.contains("email", true))
                                apiError.value = "The email has already been taken."
                            else
                                apiError.value = "The given data was invalid."
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

    fun workspaceCreate(
        mapList: Map<String, RequestBody>,
        token: String,
        addImagesList: List<MultipartBody.Part>?
    ) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.createWorkspace(token, addImagesList, mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiEditSpaceRespnce.value = response.body()
                        } else if (response.code() == 422) {
                            val errorResponse =
                                Gson().fromJson<String>(
                                    response.errorBody()?.string()?.toJson(),
                                    String::class.java
                                )
                            if (errorResponse.contains("email", true))
                                apiError.value = "The email has already been taken."
                            else
                                apiError.value = "The given data was invalid."
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

    fun workspaceUpdate(
        mapList: Map<String, RequestBody>,
        token: String,
        addImagesList: List<MultipartBody.Part>?,
        spaceId:Int
    ) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.updateWorkspace(token, addImagesList, mapList,spaceId)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiEditSpaceRespnce.value = response.body()
                        } else if (response.code() == 422) {
                            val errorResponse =
                                Gson().fromJson<String>(
                                    response.errorBody()?.string()?.toJson(),
                                    String::class.java
                                )
                            if (errorResponse.contains("email", true))
                                apiError.value = "The email has already been taken."
                            else
                                apiError.value = "The given data was invalid."
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

    fun addvenueAvailabilty(token: String, req: VenueAvailityReq) {
        isLoading.value = true
        try {
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
        } catch (e: Exception) {

        }
    }

    fun getWorkSpaces(token: String) {
        isLoading.value = true
        try {
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
        } catch (e: Exception) {

        }
    }
    fun getSingleSpace(token: String,spaceId:Int) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.getSingleWorkSpaces(token,spaceId)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiSingleSpaceRespnce.value = response.body()
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

    fun getVenueTypes() {
//        isLoading.value = true
        try {
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
        } catch (e: UnknownHostException) {

        }
    }

    fun getSuggestedPrice(venueId:Int) {
//        isLoading.value = true
        try {
                CoroutineScope(Dispatchers.IO).launch {
                    val service = RetrofitFactory.makeRetrofitService()
                    val response = service. getSuggestedPrice(venueId)
                    withContext(Dispatchers.Main) {
                        try {
                            if (response.isSuccessful && response.body() != null) {
                                apiSuggestedPriceResponse.value = response.body()
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
        } catch (e: UnknownHostException) {

        }
    }

}