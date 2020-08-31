package com.droid.dorpee.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityForgotPasswordBinding
import com.droid.dorpee.ui.LoginRequest
import com.droid.dorpee.ui.auth.viewmodel.AuthViewModel
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.showSnackBarCustom

class ForgotPasswordActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityForgotPasswordBinding
    var viewModel: AuthViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as AuthViewModel
        attachObserver()
    }

    override fun bindData() {
    }

    override fun initListeners() {
    }

    private fun attachObserver() {
        this.viewModel?.apiForgotResponse?.observe(this, Observer {
//            startActivity(Intent(this, DashboardActivity::class.java))
            if (!it.message.isNullOrEmpty())
                showSnackBarCustom(
                        it.message!!,
                        binding.alertView,
                        ContextCompat.getColor(this, R.color.colorPrimaryDark)
                )
            Log.e("Forgot Password","Message is : "+it.message);
        })
        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(it,
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
                binding.buttonForgot.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.buttonForgot.visibility = View.VISIBLE
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
            binding.buttonForgot.id -> {
                if (!viewModel?.isLoading?.value!! && validated()) {
                    val req = LoginRequest(binding.email.text.toString(), "")
                    hideKeyboard()
                    viewModel?.forgotPasswordApi(req)
                }
            }

            binding.backbtn.id -> {
                onBackPressed()
            }
        }
    }


    private fun validated(): Boolean {
        return if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()
                        ?.isValidEmail() == false
        ) {
            showSnackBarCustom(
                    "Enter valid email!",
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            false
        } else {
            true
        }
    }
}
