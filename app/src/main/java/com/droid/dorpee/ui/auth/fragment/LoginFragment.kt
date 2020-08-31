package com.droid.dorpee.ui.auth.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentLoginBinding
import com.droid.dorpee.ui.LoginRequest
import com.droid.dorpee.ui.auth.ChooseCustomerTypeActivity
import com.droid.dorpee.ui.auth.ForgotPasswordActivity
import com.droid.dorpee.ui.auth.viewmodel.AuthViewModel
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom

class LoginFragment : BaseFragment() {

    private lateinit var binding: FragmentLoginBinding
    var viewModel: AuthViewModel? = null

    var space: Space? = null
    var scondition: String? = null
    var isFromLoginActivity: Boolean? = false

    override fun bindData() {

    }

    override fun initListeners() {
        binding.buttonLogin.setOnClickListener {
            loginFun()
//                startActivity(Intent(this, VenueDashboardActivity::class.java))
        }
        binding.buttonsignUp.setOnClickListener {
            signUpFun()
        }
        binding.textViewPassword.setOnClickListener {
            startActivity(Intent(requireContext(), ForgotPasswordActivity::class.java))
        }
        /*  binding.backbtn.setOnClickListener {
              onBackPressed()
          }*/
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(AuthViewModel())
        return ViewModelProvider(this, provider).get(AuthViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        if (arguments != null) {
            space = arguments?.getSerializable("space") as? Space
            scondition = arguments?.getString("scondition")
            isFromLoginActivity = arguments?.getBoolean("isFromLogin", false)
        }
        viewModel = setUpVM() as AuthViewModel
        attachObserver()
        return binding.root
    }

    private fun attachObserver() {
        this.viewModel?.apiLoginResponse?.observe(viewLifecycleOwner, Observer {
            AppPreferences.getInstance(requireContext())?.user = it
            AppPreferences.getInstance(requireContext())?.cards = it.user?.cards!!
            if (it.user?.cards?.size!! > 0) {
                AppPreferences.getInstance(requireContext())?.setIsCardActive(true)
                Log.e("The Data", "Cards are saved" + it.user?.cards?.get(0)?.last4)

//                AppPreferences.getInstance(this)?.setIsCardActive(true)
//                AppPreferences.getInstance(this)?.setCardBrand(it.user?.cards!!.get(0).brand)
//                AppPreferences.getInstance(this)?.setLastFour(it.user?.cards!!.get(0).last4)
            } else {
//                AppPreferences.getInstance(this)?.setIsCardActive(false)
//                Log.e("The Data","Cards are not saved")
            }
            if (it.user?.planId != null) {
                Log.e("The Data", "Cards are saved")
                AppPreferences.getInstance(requireContext())?.setPlanId(it.user?.planId!!)
                AppPreferences.getInstance(requireContext())?.setPlanCredits(it.user?.plan!!.credits)
                AppPreferences.getInstance(requireContext())?.setPlanName(it.user?.plan!!.name)
                AppPreferences.getInstance(requireContext())?.setPlaneExpiry(it.user?.planExpiry!!)
                AppPreferences.getInstance(requireContext())?.setIsActivePlan(true)
            }

            if (it.user?.totalCredits != null)
                AppPreferences.getInstance(requireContext())?.setRemainingCredit(it.user?.totalCredits!!)

            openBooking()
//            (activity as DashboardActivity).afterLogin()
         startActivity(Intent(requireContext(), DashboardActivity::class.java))
            activity?.finishAffinity()
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })
        viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
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

    private fun loginFun() {
        if (!viewModel?.isLoading?.value!! && validated()) {
            val req = LoginRequest(binding.email.text.toString(), binding.password.text.toString())
            hideKeyboard(requireContext())
            viewModel?.loginApi(req, null)
        }
    }

    public fun openBooking() {
        if (isFromLoginActivity!!) {
//            finish()
            this.startActivity(
                    Intent(
                            requireContext(),
                            BookingActivity::class.java
                    ).apply {
                        putExtra("space", space)
                        putExtra("scondition", scondition)
                        putExtra("isFromRebook",false)
                        putExtra("isFromUpcomming",false)
                    })
        }
    }

    private fun signUpFun() {
        startActivity(Intent(requireContext(), ChooseCustomerTypeActivity::class.java))
    }

    private fun validated(): Boolean {
        return if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()?.isValidEmail() == false
        ) {
            showSnackBarCustom(
                    getString(R.string.enter_valid_email),
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
            false
        } else if (binding.password.text.isNullOrEmpty() || binding.password.text?.length!! < 4) {
            showSnackBarCustom(
                    "Enter valid password!",
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
            false
        } else {
            true
        }
    }
}