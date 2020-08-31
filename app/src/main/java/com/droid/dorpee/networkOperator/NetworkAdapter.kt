package com.droid.dorpee.networkOperator


import com.droid.dorpee.BuildConfig
import com.google.gson.GsonBuilder
import java.util.concurrent.TimeUnit

import io.reactivex.schedulers.Schedulers
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


//@AppScope
class NetworkAdapter {
    lateinit var networkServices: ApiService


    fun setupRetrofitJsonClient() {

        try {
            val HEADER_INTERCEPTOR = Interceptor { chain ->
                val original = chain.request()

                val requestBuilder = original.newBuilder()
                    .header("Content-Type", "application/json")
                requestBuilder.method(original.method, original.body)
                val request = requestBuilder.build()
                chain.proceed(request)
            }


            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(HEADER_INTERCEPTOR)
                .cache(null)
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS).build()
            val gson = GsonBuilder().setLenient().excludeFieldsWithoutExposeAnnotation().create()

            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
            networkServices = retrofit.create(ApiService::class.java)

        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }


    companion object {

        var cInstance: NetworkAdapter? = null
        /* Static 'instance' method */
        val instance: NetworkAdapter
            get() {
                if (cInstance == null) {
                    cInstance = NetworkAdapter()
                    cInstance!!.setupRetrofitJsonClient()
                    return cInstance!!
                }
                cInstance!!.setupRetrofitJsonClient()
                return cInstance!!
            }

        fun initInstance() {
            if (cInstance == null) {
                cInstance = NetworkAdapter()
                cInstance!!.setupRetrofitJsonClient()
            }
        }
    }
}
