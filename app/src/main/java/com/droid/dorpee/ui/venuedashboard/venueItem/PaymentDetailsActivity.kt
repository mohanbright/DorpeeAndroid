package com.droid.dorpee.ui.venuedashboard.venueItem

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityPaymentDetailsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import okhttp3.RequestBody

class PaymentDetailsActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityPaymentDetailsBinding
    var viewModel: VenueDashViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueDashViewModel
        val user = AppPreferences.getInstance(this)?.user?.user
        user?.let {
            binding.companyName.setText(user.companyLegalName ?: "")
            binding.abnNumber.setText(user.abn ?: "")
            binding.bsbNumaber.setText(user.bsb ?: "")
            binding.accountNumber.setText(user.accountNumber ?: "")
            binding.accountName.setText(user.accountName ?: "")
        }
        val auth = RequestWithHeader(AppPreferences.getInstance(this)?.user?.token)
        viewModel?.getProfile(auth)
        attachObserver()
    }

    override fun bindData() {
        val user = AppPreferences.getInstance(this)?.user?.user
        Glide
                .with(this)
                .load(user?.avatar)
                .dontAnimate()
                .centerCrop()
                .circleCrop()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {
        binding.imageViewProfilePic.setOnClickListener {
            onBackPressed()
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
            binding.sumbit.id -> {
                val companyName = binding.companyName.text.toString()
                val abnNumer = binding.abnNumber.text.toString()
                val bsbnumaber = binding.bsbNumaber.text.toString()
                val accountNumber = binding.accountNumber.text.toString()
                val accountName = binding.accountName.text.toString()
                /*   if (companyName.isEmpty()) {
                       showUpSnackError("Enter valid password!")
                   } else if (abnNumer.isEmpty()) {
                       showUpSnackError("Password does not match!")
                   } else if (accountName.isEmpty()) {
                       showUpSnackError("Password does not match!")
                   } else if (bsbnumaber.isEmpty()) {
                       showUpSnackError("Upload profile image")
                   } else */
                if (accountNumber.isEmpty()) {
                    showUpSnackError("Account Number Required!")
                } else {
                    val auth = RequestWithHeader(AppPreferences.getInstance(this)?.user?.token)
                    val map = HashMap<String, RequestBody>()
                    map["bsb"] = createPartFromString(bsbnumaber)
                    map["account_name"] = createPartFromString(accountName)
                    map["account_number"] = createPartFromString(accountNumber)
                    map["abn"] = createPartFromString(abnNumer)
                    map["company_legal_name"] = createPartFromString(companyName)
                    viewModel?.updatePaymentDetailsVenue(auth, map)
                }
            }
        }
    }

    private fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    private fun attachObserver() {
        viewModel?.apiPaymentProfileResponse?.observe(this, Observer {
            showSnackBarCustom(
                    "Updated Successfully",
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            val user = it.data
            binding.companyName.setText(user?.companyLegalName ?: "")
            binding.abnNumber.setText(user?.abn ?: "")
            binding.bsbNumaber.setText(user?.bsb ?: "")
            binding.accountNumber.setText(user?.accountNumber ?: "")
            binding.accountName.setText(user?.accountName ?: "")

        })
        viewModel?.apiProfileResponse?.observe(this, Observer {
            val user = AppPreferences.getInstance(this)?.user
            user?.user = it.data
            AppPreferences.getInstance(this)?.user = user
            binding.companyName.setText(user?.user?.companyLegalName ?: "")
            binding.abnNumber.setText(user?.user?.abn ?: "")
            binding.bsbNumaber.setText(user?.user?.bsb ?: "")
            binding.accountNumber.setText(user?.user?.accountNumber ?: "")
            binding.accountName.setText(user?.user?.accountName ?: "")

        })

        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })

    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.sumbit.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.sumbit.visibility = View.VISIBLE
            }
        }
    }
}


