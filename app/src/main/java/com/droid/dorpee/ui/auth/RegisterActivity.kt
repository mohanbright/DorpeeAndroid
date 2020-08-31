package com.droid.dorpee.ui.auth

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityRegisterBinding
import com.droid.dorpee.ui.auth.viewmodel.AuthViewModel
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.utils.ANDROID
import com.droid.dorpee.utils.VENUE
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings
import okhttp3.RequestBody
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class RegisterActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityRegisterBinding
    var viewModel: AuthViewModel? = null
    var imageList = ArrayList<String>(1)
    val IMAGE_PROFILE_IMAGE_CODE = 34113332
//    var isEditProfile : Boolean? =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imageList = ArrayList<String>(1)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as AuthViewModel
//        isEditProfile = intent.getBooleanExtra("isEditProfile", false)
//        Log.e("Extra : ","isEditProfile : "+isEditProfile)
        attachObserver()
    }

    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(
                AuthViewModel()
        )
        return ViewModelProvider(this, provider).get(AuthViewModel::class.java)
    }

    private fun attachObserver() {
        this.viewModel?.apiLoginResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.user = it
            startActivity(Intent(this, RegisterVenueActivity::class.java).apply {
                putExtra("do","create")
            })
            finishAffinity()
        })
        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> {
                onBackPressed()
            }
            binding.register.id -> {
//                startActivity(Intent(this, RegisterVenueActivity::class.java))
//                finishAffinity()
                registerFun()
            }
            binding.textViewClickImage.id -> {
                selectImage()
            }
            binding.imageViewProfilePic.id -> {
                selectImage()
            }
        }
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.register.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.register.visibility = View.VISIBLE
            }
        }
    }

    override fun onResume() {
        super.onResume()
        imageList.let {
            it.mapIndexed { _, s ->
                Glide.with(this)
                        .load("file://$s")
                        .dontAnimate()
                        .centerCrop()
                        .circleCrop()
                        .placeholder(R.drawable.profile_holder)
                        .into(binding.imageViewProfilePic)
            }
        }
    }

    private fun selectImage() {
        val intent = Intent(this, ImagesSelectorActivity::class.java)
        intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, 1)
        intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true)
        intent.putStringArrayListExtra(
                SelectorSettings.SELECTOR_INITIAL_SELECTED_LIST, imageList
        )
        startActivityForResult(intent, IMAGE_PROFILE_IMAGE_CODE)
    }

    private fun registerFun() {
        hideKeyboard()
        if (!viewModel?.isLoading?.value!! && validated()) {
            val firstname = binding.firstname.text.toString()
            val lastname = binding.lastname.text.toString()
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            val companyName = binding.companyName.text.toString()
            val map = HashMap<String, RequestBody>()
            map["first_name"] = createPartFromString(firstname)
            map["last_name"] = createPartFromString(lastname)//venueRes?.data?.id?.toString()?:""
            map["email"] = createPartFromString(email)
            map["password"] = createPartFromString(password)
            map["company_name"] = createPartFromString(companyName)
            map["device_type"] = createPartFromString(ANDROID)
            map["user_type"] = createPartFromString(VENUE)
            val uniqueID = UUID.randomUUID().toString()
            map["device_id"] = createPartFromString(uniqueID)
            showProgress(true)
            if (!imageList.isNullOrEmpty()) {
                val addImage = requestUploadImage(imageList[0], "file")
                if (isNetworkAvailable()) {
                    viewModel?.registerApi(map, addImage)
                } else {
                    showUpSnackError(getString(R.string.network_unavailble))
                }
            } else {
                if (isNetworkAvailable()) {
                    viewModel?.registerApi(map, null)
                } else {
                    showUpSnackError(getString(R.string.network_unavailble))
                }
            }
        }
    }

    private fun validated(): Boolean {
        return if (binding.companyName.text.isNullOrEmpty()) {
            showUpSnackError(
                    "Enter  company name!"
            )
            false
        } else if (binding.firstname.text.isNullOrEmpty()) {
            showUpSnackError(
                    "Enter valid first name!"
            )
            false
        } else if (binding.lastname.text.isNullOrEmpty()) {
            showUpSnackError(
                    "Enter valid last name!")
            false
        } else if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()
                        ?.isValidEmail() == false
        ) {
            showUpSnackError("Enter valid email!")
            false
        } else if (binding.password.text.isNullOrEmpty() || binding.password.text?.length!! < 4) {
            showUpSnackError("Enter valid password!")
            false
        } else if (binding.repeatPassword.text.isNullOrEmpty() || binding.repeatPassword.text.toString() != binding.password.text.toString()) {
            showUpSnackError("Password does not match!")

            false
        } /*else if (imageList.isEmpty()) {
            showUpSnackError("Upload profile image")
            false
        }*/ else {
            true
        }
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        if (requestCode == IMAGE_PROFILE_IMAGE_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                imageList = data?.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS) as ArrayList<String>
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}
