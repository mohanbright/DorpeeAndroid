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
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityPersonalAccountRegisterBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.viewmodel.AuthViewModel
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.adapter.InterestAdapter
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.utils.ANDROID
import com.droid.dorpee.utils.CUSTOMER
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings
import okhttp3.RequestBody
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class PersonalAccountRegisterActivity : BaseActivity(), View.OnClickListener {
    private var user: LoginResponse? = null
    private lateinit var binding: ActivityPersonalAccountRegisterBinding
    var viewModel: AuthViewModel? = null
    val IMAGE_PROFILE_IMAGE_CODE = 34113
    var imageList = ArrayList<String>(1)
    var isEditProfile : Boolean? =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalAccountRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as AuthViewModel
        attachObserver()
        setUInterestList()
        isEditProfile = intent.getBooleanExtra("isEditProfile", false)
        Log.e("Extra : ","isEditProfile : "+isEditProfile)
        if(isEditProfile!!){
            EditProfile()
        }
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
            startActivity(Intent(this, DashboardActivity::class.java))
            finishAffinity()
        })
        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(it, binding.alertView, ContextCompat.getColor(this, R.color.colorPrimaryDark))
        })
        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })

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
//                Picasso.get().load("file://$s").into(binding.imageViewProfilePic)
            }
        }
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> {
                onBackPressed()
            }
            binding.register.id -> {
                if(isEditProfile!!){
                    editProfileApi()
                }else{
                    registerFun()
                }
            }
            binding.textViewClickImage.id -> {
                selectImage()
            }
            binding.imageViewProfilePic.id -> {
                selectImage()
            }
        }
    }

    private fun selectImage() {
        imageList = ArrayList<String>(1)
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
            val list = (binding.interestGrid.adapter as InterestAdapter).interestList.filter {
                it
                        .checked
            }
           val map = HashMap<String, RequestBody>()
            map["first_name"] = createPartFromString(firstname)
            map["last_name"] = createPartFromString(lastname)//venueRes?.data?.id?.toString()?:""
            map["email"] = createPartFromString(email)
            map["password"] = createPartFromString(password)
            map["user_type"] = createPartFromString(CUSTOMER)
            map["device_type"] = createPartFromString(ANDROID)
            val uniqueID = UUID.randomUUID().toString()
            map["device_id"] = createPartFromString(uniqueID)
            val interest = list.map { it.id ?: 0 }
            Log.e("list.toString()", assets.toString().removePrefix("[").removeSuffix("]"))
            map["interests"] = createPartFromString(interest.toString().removePrefix("[").removeSuffix("]"))
            showProgress(true)
            if (!imageList.isNullOrEmpty()) {
                val addImage = requestUploadImage(imageList[0], "file")
                if (isNetworkAvailable()) {
                    viewModel?.registerApi(map, addImage)
                } else {
                    showUpSnackError(getString(R.string.network_unavailble))
                }
            }else{
                if (isNetworkAvailable()) {
                    viewModel?.registerApi(map, null)
                } else {
                    showUpSnackError(getString(R.string.network_unavailble))
                }
            }
        }
    }
    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
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

    private fun validated(): Boolean {
        return if (binding.firstname.text.isNullOrEmpty()) {
            showUpSnackError("Enter valid first name!")
            false
        } else if (binding.lastname.text.isNullOrEmpty()) {
            showUpSnackError("Enter valid last name!")
            false
        } else if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()
                        ?.isValidEmail() == false
        ) {
            showSnackBarCustom(
                    "Enter valid email!",
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            false
        } else if (binding.password.text.isNullOrEmpty() || binding.password.text?.length!! < 4) {
            showUpSnackError("Enter valid password!")
            false
        } else if (binding.repeatPassword.text.isNullOrEmpty() || binding.repeatPassword.text.toString() != binding.password.text.toString()) {
            showUpSnackError("Password does not match!")
            false
        }/*
        else if (imageList.isEmpty()) {
            showUpSnackError("Upload profile image")
            false
        }*/
        else {
            true
        }
    }

    private fun setUInterestList() {
        val interests = AppPreferences.getInstance(this)?.interests
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.orientation = GridLayoutManager.VERTICAL
        binding.interestGrid.layoutManager = layoutManager
        binding.interestGrid.adapter =
                InterestAdapter(this, interests?.data ?: emptyList())
        (binding.interestGrid.adapter as InterestAdapter).itemClick = {
            (binding.interestGrid.adapter as InterestAdapter).interestList.mapIndexed { pos, week ->
                val checked = (binding.interestGrid.adapter as InterestAdapter).interestList[pos].checked
                if (pos == it && !checked) {
                    (binding.interestGrid.adapter as InterestAdapter).interestList[pos].checked = true
                } else if (pos == it && checked) {
                    (binding.interestGrid.adapter as InterestAdapter).interestList[pos].checked = false
                } else {
                    (binding.interestGrid.adapter as InterestAdapter).interestList[pos].checked = checked
                }
            }
            (binding.interestGrid.adapter as InterestAdapter).notifyDataSetChanged()
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        if (requestCode == IMAGE_PROFILE_IMAGE_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                imageList = data?.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS) as ArrayList<String>
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    fun EditProfile(){
        binding.password.visibility = View.GONE
        binding.repeatPassword.visibility = View.GONE
        binding.interestGrid.visibility = View.GONE
        binding.textView7.setText("Update")
        binding.textView11.visibility = View.GONE
         user = AppPreferences.getInstance(this)?.user
        if (user!=null){
            Glide
                    .with(this)
                    .load(user!!.user?.avatar ?: "")
                    .dontAnimate()
                    .centerCrop()
                    .circleCrop()
                    .placeholder(R.drawable.profile_holder)
                    .into(binding.imageViewProfilePic)
            binding.firstname.setText(user!!.user?.firstName)
            binding.lastname.setText(user!!.user?.lastName)
            binding.email.setText(user!!.user?.email)
        }
    }

    fun editProfileApi() {
        val firstname = binding.firstname.text.toString()
        val lastname = binding.lastname.text.toString()
        val email = binding.email.text.toString()

//        viewModel?.editProfileCustomer(
//                RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
//                editPersonalProfile(firstname!!, lastname!!, email), this)
//
//
        val map = HashMap<String, RequestBody>()
        map["first_name"] = createPartFromString(firstname)
        map["last_name"] = createPartFromString(lastname)//venueRes?.data?.id?.toString()?:""
        map["email"] = createPartFromString(email)
        showProgress(true)

        if (!imageList.isNullOrEmpty()) {
            val addImage = requestUploadImage(imageList[0], "file")
            if (isNetworkAvailable()) {
                viewModel?.editProfileCustomerss(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token), map, addImage, this,this)
            } else {
                showUpSnackError(getString(R.string.network_unavailble))
            }
        } else {
            if (isNetworkAvailable()) {
                viewModel?.editProfileCustomerss(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token), map, null, this, this)
            } else {
                showUpSnackError(getString(R.string.network_unavailble))
            }
        }
    }
}

