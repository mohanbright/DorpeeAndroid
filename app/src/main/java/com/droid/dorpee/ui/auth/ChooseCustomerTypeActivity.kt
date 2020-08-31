package com.droid.dorpee.ui.auth

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.droid.dorpee.databinding.ActivityChooseCustomerTypeBinding

class ChooseCustomerTypeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChooseCustomerTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseCustomerTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customerRegister.setOnClickListener {
            startActivity(Intent(this, PersonalAccountRegisterActivity::class.java))
        }
        binding.venueRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        binding.textViewEmployerReg.setOnClickListener {
            try {
                val url = "http://dorpee.com/"
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            }catch (e:ActivityNotFoundException){
                e.printStackTrace()
            }
        }
        binding.backbtn.setOnClickListener {
            onBackPressed()
        }
    }
}
