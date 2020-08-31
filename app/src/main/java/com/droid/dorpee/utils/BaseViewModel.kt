package com.droid.dorpee.utils

import android.content.ContentValues
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.droid.dorpee.networkOperator.ErrorModel
import com.droid.dorpee.ui.baseClasses.AppApplication
import org.mach15group.paanivaale.networkOperator.ResponseCodes
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.text.ParseException
import java.util.concurrent.TimeoutException

open class BaseViewModel : ViewModel() {


    fun setUpErrors(t: Throwable): String {
        Log.e(ContentValues.TAG, "setUpError statusCode: " + "statusCode " + t.message)
        val errorModel = ErrorModel()
        try {
            // Exception comes by Java
            when (t) {
                is SocketTimeoutException -> {
                    errorModel.error_code = ResponseCodes.SOCKET_TIME_OUT
                            errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                is TimeoutException -> {
                    errorModel.error_code = ResponseCodes.URL_CONNECTION_ERROR
                    errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                is ClassCastException -> {
                    errorModel.error_code = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                is com.google.gson.stream.MalformedJsonException -> {
                    errorModel.error_code = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                is ParseException -> {
                    errorModel.error_code = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                is UnknownHostException -> {
                    errorModel.error_code = ResponseCodes.INTERNET_NOT_AVAILABLE
                    errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                is ConnectException ->{
                    errorModel.error_code = ResponseCodes.INTERNET_NOT_AVAILABLE
                    errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
                }
                else -> {
                    val errorMessage =
                        (t as HttpException).response()?.message()//errorBody()?.string()
                    val responseCode = t.response()?.code()!!
                    errorModel.error_code = responseCode
                    errorModel.error_message = errorMessage ?: "UnKnown Error"
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            errorModel.error_code = ResponseCodes.UNKNOWN_ERROR
            errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
        }

        return errorModel.error_message
    }


}