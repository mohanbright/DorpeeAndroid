package com.droid.dorpee.ui.auth

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivitySplashBinding
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.utils.preference.AppPreferences

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private var user: LoginResponse? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user
        Glide.with(binding.splash.context).asGif().load(R.raw.spalsh_giph).listener(object : RequestListener<GifDrawable> {
            override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<GifDrawable>?, isFirstResource: Boolean): Boolean {
                return false
            }

            override fun onResourceReady(resource: GifDrawable?, model: Any?, target: Target<GifDrawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                if (resource is GifDrawable) {
                    resource.setLoopCount(1)
                }
                return false;
            }
        }).into(binding.splash)

        Handler().postDelayed({ /* Create an Intent that will start the Menu-Activity. */
            val mainIntent = Intent(this@SplashActivity, DashboardActivity::class.java)
            this@SplashActivity.startActivity(mainIntent)
            this@SplashActivity.finish()
        }, 5000)
    }
}
