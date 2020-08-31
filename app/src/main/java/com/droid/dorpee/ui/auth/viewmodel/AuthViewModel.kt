package com.droid.dorpee.ui.auth.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.R
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.auth.LoginActivity
import com.droid.dorpee.ui.auth.PersonalAccountRegisterActivity
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.log
import com.droid.dorpee.utils.preference.AppPreferences
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

class AuthViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiLoginResponse: MutableLiveData<LoginResponse> = MutableLiveData()
    var apiForgotResponse: MutableLiveData<ForgotResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun loginApi(request: LoginRequest, loginActivity: LoginActivity?) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.login(request)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiLoginResponse.value = response.body()
                            loginActivity?.openBooking()
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

    fun forgotPasswordApi(request: LoginRequest) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.forgetpassword(request)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            log(response.body())
                            apiForgotResponse.value = response.body()
                        } else if (response.code() == 400) {
                            val type = object : TypeToken<ForgotResponse>() {}.type
                            val errorResponse =
                                    Gson().fromJson<ForgotResponse>(
                                            response.errorBody()?.charStream(),
                                            type
                                    )
                            log(errorResponse)
                            apiForgotResponse.value = errorResponse
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

    fun registerApi(mapList: Map<String, RequestBody>,
                    imagePart: MultipartBody.Part?) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.signUpApi(imagePart,mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                            apiLoginResponse.value = response.body()
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

    fun  editProfileCustomer(header: RequestWithHeader, editPersonalProfile: editPersonalProfile, context: Context) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.editProfileCustomer(header.authentication!!, editPersonalProfile)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        Toast.makeText(context, context.getString(R.string.profile_updated), Toast.LENGTH_LONG).show()
                        val loginResponse: LoginResponse? = AppPreferences.getInstance(context)?.user
                        loginResponse?.user = response.body()!!.user
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


    fun editProfileCustomerss(token: RequestWithHeader,
                              mapList: Map<String, RequestBody>,
                              imagePart: MultipartBody.Part?,
                              context: Context,
                              personalAccountRegisterActivity: PersonalAccountRegisterActivity) {
        isLoading.value = true
        try {
            CoroutineScope(Dispatchers.IO).launch {
                val service = RetrofitFactory.makeRetrofitService()
                val response = service.editProfileCustomers(token.authentication,imagePart,mapList)
                withContext(Dispatchers.Main) {
                    try {
                        if (response.isSuccessful && response.body() != null) {
                       //     apiLoginResponse.value = response.body()
                            val loginResponse: LoginResponse? = AppPreferences.getInstance(context)?.user
                            val loginResponse1: LoginResponse? = AppPreferences.getInstance(context)?.user

                            loginResponse?.user = response.body()!!.data
                            loginResponse?.user!!.role = loginResponse1?.user?.role
                            AppPreferences.getInstance(context)?.user = loginResponse
                            Toast.makeText(context, context.getString(R.string.profile_updated), Toast.LENGTH_LONG).show()
                        }
                        else if (response.code() == 422) {
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
}