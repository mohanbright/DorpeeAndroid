package com.droid.dorpee.networkOperator

import android.net.ParseException
import android.util.Log
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import org.mach15group.paanivaale.networkOperator.ResponseCodes
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.TimeoutException

class ApiUtils {
    protected lateinit var compositeDisposable: Disposable
    val TAG = ApiUtils::class.java.simpleName

    fun <V> createApiRequest(observables: Observable<V>, callBack: ServiceListener<V>) {
        this.compositeDisposable = observables
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableObserver<V>() {
                override fun onComplete() {}

                override fun onNext(t: V) {
                    callBack.getServerResponse(t, 0)
                    //  Log.e("onNext" ,t?.toJson()!!)
                }

                override fun onError(e: Throwable) {
                    callBack.getError(setUpErrors(e), 0)
                    // Log.e("onNext" ,e.toJson())
                }
            })
    }

    // Handling Java Exceptions
    private fun setUpErrors(t: Throwable): ErrorModel {
        Log.e(TAG, "setUpError statusCode: " + "statusCode " + t.message)
        val errorModel = ErrorModel()
        try {
            // Exception comes by Java
            if (t is SocketTimeoutException) {
                errorModel.error_code = ResponseCodes.INTERNET_NOT_AVAILABLE
                errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
            } else if (t is TimeoutException) {
                errorModel.error_code = ResponseCodes.URL_CONNECTION_ERROR
                errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
            } else if (t is ClassCastException) {
                errorModel.error_code = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
            } else if (t is com.google.gson.stream.MalformedJsonException) {
                errorModel.error_code = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
            } else if (t is ParseException) {
                errorModel.error_code = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
            } else if (t is UnknownHostException) {
                errorModel.error_code = ResponseCodes.INTERNET_NOT_AVAILABLE
                errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
            } else {
                val errorMessage = (t as HttpException).response()?.message()//errorBody()?.string()
                val responseCode = t.response()!!.code()
                errorModel.error_code = responseCode
                errorModel.error_message = errorMessage ?: "UnKnown Error"
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            errorModel.error_code = ResponseCodes.UNKNOWN_ERROR
            errorModel.error_message = ResponseCodes.logErrorMessage(errorModel.error_code)
        }

        return errorModel
    }

}