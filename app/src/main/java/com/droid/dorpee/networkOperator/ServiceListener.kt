package com.droid.dorpee.networkOperator

/**
 * Created by parmil.
 */
interface ServiceListener<T> {
    fun getServerResponse(response: T, requestcode: Int)
    fun getError(error: ErrorModel, requestcode: Int)
}