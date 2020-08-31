package org.mach15group.paanivaale.networkOperator

object ResponseCodes {
    /** System Level Response Codes Starts Here  */

    /**
     * The Constant Success.
     */
    val Success = 200

    /**
     * The Constant Success.
     */
    val Accepted = 201

    /**
     * The Constant AccessToken expired.
     */
    val ACCESS_TOKEN_EXPIRED = 401

    /**
     * The Constant RefreshToken expired.
     */
    val REFRESH_TOKEN_EXPIRED = 400

    /**
     * The Constant InvalidUseridPassword
     */
    val BAD_REQUEST = 400


    // Error Codes
    val REQUEST_CANCEL = -1
    val RESPONSE_JSON_NOT_VALID = 1
    val MODEL_TYPE_CAST_EXCEPTION = 2
    val INTERNET_NOT_AVAILABLE = 3
    val WRONG_URL = 4
    val WRONG_METHOD_NAME = 5
    val URL_CONNECTION_ERROR = 6
    val SOCKET_TIME_OUT = 12
    val UNKNOWN_ERROR = 10
    val GATEWAY_ERROR = 502

    val NOT_ALLOWED = 403


    fun logErrorMessage(code: Int): String {

        when (code) {

            REQUEST_CANCEL -> return "Request Canceled"

            INTERNET_NOT_AVAILABLE -> return "Internet connection is not available. Please check it and try again"

            WRONG_URL -> return "You are trying to hit wrong url, Please check it and try again"

            WRONG_METHOD_NAME -> return "You are passing wrong method name. i.e POST, GET, DELETE etc"

            URL_CONNECTION_ERROR -> return "Connection is not established, Please try again"

            RESPONSE_JSON_NOT_VALID -> return "Json you are getting is not valid"

            MODEL_TYPE_CAST_EXCEPTION -> return "Server is not working. Please try after some time."

            NOT_ALLOWED -> return "Server is not working.Please try after some time."

            GATEWAY_ERROR -> return "GateWay Error."

            else -> return "Unknown error"
        }
    }
}
