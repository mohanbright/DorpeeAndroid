package com.droid.dorpee.networkOperator

import com.droid.dorpee.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitFactory {
//    const val BASE_URL = "https://jsonplaceholder.typicode.com"

    fun makeRetrofitService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://test.wenbantong.com.cn")
            .client(makeOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }

    private fun makeOkHttpClient(): OkHttpClient {
        val HEADER_INTERCEPTOR = Interceptor { chain ->
            val original = chain.request()

            val requestBuilder = original.newBuilder()
                .header("Content-Type", "application/json")
                .header("X-Requested-With","XMLHttpRequest")
            requestBuilder.header("Accept", "application/json")
            requestBuilder.method(original.method, original.body)

            val request = requestBuilder.build()
            chain.proceed(request)
        }
        return OkHttpClient.Builder()
            .addNetworkInterceptor(makeLoggingInterceptor())
            .addNetworkInterceptor(HEADER_INTERCEPTOR)
            .cache(null)
            .connectTimeout(30, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.MINUTES)
            .build()
    }


    private fun makeLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
//        logging.level = HttpLoggingInterceptor.Level.HEADERS
        logging.level = HttpLoggingInterceptor.Level.BODY
        return logging
    }


}