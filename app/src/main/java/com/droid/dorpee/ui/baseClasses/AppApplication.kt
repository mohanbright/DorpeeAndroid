package com.droid.dorpee.ui.baseClasses

import android.app.Application
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.facebook.drawee.backends.pipeline.Fresco
import com.stripe.android.PaymentConfiguration


class AppApplication : Application(), LifecycleObserver{


    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(applicationContext)
        PaymentConfiguration.init(
            applicationContext,
            "pk_live_Qeta0dy9XieLn4IjYElHyFXv00BtxZH8Uu"
        )
    }

//    pk_test_IWiLzns3KY1WzNA4x4P63wYi
//    pk_live_Qeta0dy9XieLn4IjYElHyFXv00BtxZH8Uu

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onEnterForeground() {
        Log.d("AppController", "Foreground")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onEnterBackground() {
        Log.d("AppController", "Background")
    }



}