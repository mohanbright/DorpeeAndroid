package com.droid.dorpee.ui.auth

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityLoginBinding
import com.droid.dorpee.networkOperator.RetrofitFactory
import com.droid.dorpee.ui.LoginRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.viewmodel.AuthViewModel
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.toJson
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException

class LoginActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityLoginBinding
    var viewModel: AuthViewModel? = null
    var space : Space? = null
    var scondition : String? = null
    var isFromLoginActivity : Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent!= null){
            space = intent.getSerializableExtra("space") as? Space
            scondition = intent.getStringExtra("scondition")
            isFromLoginActivity = intent.getBooleanExtra("isFromLogin",false)
        }
        viewModel = setUpVM() as AuthViewModel
        attachObserver()

    }

    override fun bindData() {
    }

    override fun initListeners() {
    }

    private fun attachObserver() {
        this.viewModel?.apiLoginResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.user = it
            AppPreferences.getInstance(this)?.cards = it.user?.cards!!
            if (it.user?.cards?.size!!>0){
                AppPreferences.getInstance(this)?.setIsCardActive(true)
                Log.e("The Data","Cards are saved"+it.user?.cards?.get(0)?.last4)

//                AppPreferences.getInstance(this)?.setIsCardActive(true)
//                AppPreferences.getInstance(this)?.setCardBrand(it.user?.cards!!.get(0).brand)
//                AppPreferences.getInstance(this)?.setLastFour(it.user?.cards!!.get(0).last4)
            }
            else{
//                AppPreferences.getInstance(this)?.setIsCardActive(false)
//                Log.e("The Data","Cards are not saved")
            }
            if (it.user?.planId != null) {
                Log.e("The Data","Cards are saved")
                AppPreferences.getInstance(this)?.setPlanId(it.user?.planId!!)
                AppPreferences.getInstance(this)?.setPlanCredits(it.user?.plan!!.credits)
                AppPreferences.getInstance(this)?.setPlanName(it.user?.plan!!.name)
                AppPreferences.getInstance(this)?.setPlaneExpiry(it.user?.planExpiry!!)
                AppPreferences.getInstance(this)?.setIsActivePlan(true)
            }

            if (it.user?.totalCredits != null)
            AppPreferences.getInstance(this)?.setRemainingCredit(it.user?.totalCredits!!)
            startActivity(Intent(this, DashboardActivity::class.java))
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

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.buttonLogin.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.buttonLogin.visibility = View.VISIBLE
            }
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(
                AuthViewModel()
        )
        return ViewModelProvider(this, provider).get(AuthViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.buttonLogin.id -> {
                    loginFun()
//                startActivity(Intent(this, VenueDashboardActivity::class.java))
            }
            binding.buttonsignUp.id -> {
                signUpFun()
            }
            binding.textViewPassword.id -> {
                startActivity(Intent(this, ForgotPasswordActivity::class.java))
            }
            binding.backbtn.id -> {
                onBackPressed()
            }
        }
    }

    private fun loginFun() {
        if (!viewModel?.isLoading?.value!! && validated()) {
            val req = LoginRequest(binding.email.text.toString(), binding.password.text.toString())
            hideKeyboard()
            viewModel?.loginApi(req,this)
        }
    }

    public fun openBooking(){
        if (isFromLoginActivity!!){
            finish()
            this.startActivity(
                    Intent(
                            this,
                            BookingActivity::class.java
                    ).apply {
                        putExtra("space", space)
                        putExtra("scondition",scondition)
                        putExtra("isFromUpcomming",false)
                        putExtra("isFromRebook",false)
                    })
        }
    }

    private fun signUpFun() {
        startActivity(Intent(this, ChooseCustomerTypeActivity::class.java))
    }

    private fun validated(): Boolean {
        return if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()?.isValidEmail() == false
        ) {
            showSnackBarCustom(
                    getString(R.string.enter_valid_email),
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            false
        } else if (binding.password.text.isNullOrEmpty() || binding.password.text?.length!! < 4) {
            showSnackBarCustom(
                    "Enter valid password!",
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            false
        } else {
            true
        }
    }
}
