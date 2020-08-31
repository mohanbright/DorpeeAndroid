package com.droid.dorpee.ui.personaldashboard.viewmodel


import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.R
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.ErrorResponse
import com.droid.dorpee.ui.PrivacySettings
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.MDCard
import com.droid.dorpee.ui.personaldashboard.fragments.PrivacyFragment
import com.droid.dorpee.ui.personaldashboard.models.MDResponse
import com.droid.dorpee.ui.personaldashboard.models.MDUser
import com.droid.dorpee.utils.BaseViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class SettingsViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiResponse: MutableLiveData<MDUser> = MutableLiveData()
    var apiRemoveCardResponse: MutableLiveData<MDResponse> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun updateSettings(auth: RequestWithHeader, privacy: PrivacySettings, context: Context, privacyFragment: PrivacyFragment) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.updateSettings(auth.authentication, privacy)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiResponse.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.settings_updated), Toast.LENGTH_LONG).show()
                        privacyFragment.moveDashBoard();
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


    fun removeCard(auth: RequestWithHeader, id: Int, arrayList: ArrayList<MDCard>) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.deleteCard(auth.authentication, id)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiRemoveCardResponse.value = response.body()

                        arrayList.addAll(emptyList())
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
