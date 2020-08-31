package com.droid.dorpee.ui.personaldashboard.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.droid.dorpee.R
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.auth.model.PlanModel
import com.droid.dorpee.ui.personaldashboard.models.MDCards
import com.droid.dorpee.ui.personaldashboard.models.PlansList
import com.droid.dorpee.ui.personaldashboard.personalItem.DorpeePlanActivity
import com.droid.dorpee.utils.BaseViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

import kotlinx.coroutines.withContext
import retrofit2.HttpException

class PlansViewModel : BaseViewModel() {
    var apiError: MutableLiveData<String> = MutableLiveData()
    var apiPlansResponse: MutableLiveData<PlansList> = MutableLiveData()
    var apiAddCardResponse: MutableLiveData<MDCards> = MutableLiveData()
    var apiPurchasePlanRequest: MutableLiveData<PlanModel> = MutableLiveData()



    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        isLoading.value = false
    }

    fun getPlans(activity: DorpeePlanActivity) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.getPlans()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiPlansResponse.value = response.body()
                        activity.disableFreePlans()
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

    fun changePlan(header: RequestWithHeader, changePlan: ChangePlanRequest, context: Context, activity: DorpeePlanActivity, credits: Int, name: String) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.changePlan(header.authentication, changePlan)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiPurchasePlanRequest.value = response.body()
                        updateData(context, activity, name, credits,changePlan.planId)
                        AppPreferences.getInstance(context)?.setRemainingCredit(apiPurchasePlanRequest.value?.data?.user?.totalCredits!!)
                        AppPreferences.getInstance(context)?.setPlaneExpiry(apiPurchasePlanRequest.value?.data?.user?.planExpiry!!)
                        Toast.makeText(context,context.resources.getString(R.string.plan_changed_successfully),Toast.LENGTH_LONG).show()
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

    fun addCard(header: RequestWithHeader, addCardRequest: AddCardRequest) {
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.addCard(header.authentication, addCardRequest)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiAddCardResponse.value = response.body()

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

    fun purchasePlan(header: RequestWithHeader, changePlan: PurchasePlanRequest, context: Context, activity: DorpeePlanActivity, planCredits: Int?, planName: String?) {
        Log.e("Plan id to ","Purchase Plan Id : "+changePlan);
        isLoading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitFactory.makeRetrofitService()
            val response = service.purchasePlan(header.authentication, changePlan)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful && response.body() != null) {
                        apiPurchasePlanRequest.value = response.body()
                        Toast.makeText(context, context.resources.getString(R.string.successfully_subscribed_plan), Toast.LENGTH_LONG).show()
                        updateData( context, activity, planName, planCredits, changePlan.planId);
                        AppPreferences.getInstance(context)?.setRemainingCredit(apiPurchasePlanRequest.value?.data?.total_credits!!)
                        AppPreferences.getInstance(context)?.setPlaneExpiry(apiPurchasePlanRequest.value?.data?.plan_expiry!!)
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

    fun  updateData(context: Context, activity: DorpeePlanActivity, planName: String?, planCredits: Int?, planId: Int?) {
        AppPreferences.getInstance(context)?.setPlanId(planId!!)
        AppPreferences.getInstance(context)?.setPlanCredits(planCredits!!)
        AppPreferences.getInstance(context)?.setPlanName(planName!!)
        AppPreferences.getInstance(context)?.setIsActivePlan(true)
        AppPreferences.getInstance(context)?.setIsCardActive(true)
        activity.setAdapterPlan(planId!!)
    }

}