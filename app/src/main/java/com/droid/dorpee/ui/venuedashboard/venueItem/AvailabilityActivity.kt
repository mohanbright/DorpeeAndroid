package com.droid.dorpee.ui.venuedashboard.venueItem

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityAvailbiltyBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venuedashboard.fragments.BlockoutTimeFragment
import com.droid.dorpee.ui.venuedashboard.fragments.WorkspaceAvailbilityFragment
import com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.material.tabs.TabLayout

class AvailabilityActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityAvailbiltyBinding
    var viewModel: VenueDashViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAvailbiltyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueDashViewModel
        val auth = RequestWithHeader(AppPreferences.getInstance(this)?.user?.token)
        viewModel?.getAvailability(auth)
        attachObserver()
        loadFragment(WorkspaceAvailbilityFragment())
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
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        Thread(Runnable {
                            val bundle = Bundle()
//                            bundle.putSerializable("data", todaysBookings)
                            val fragment = WorkspaceAvailbilityFragment()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                    1 -> {
                        Thread(Runnable {
                            val bundle = Bundle()
//                            bundle.putSerializable("data", upComingBookings)
                            val fragment = BlockoutTimeFragment()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                    else -> {
                        Thread(Runnable {
                            val bundle = Bundle()
//                            bundle.putSerializable("data", pastBookings)
                            val fragment = WorkspaceAvailbilityFragment()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                }
            }

        })
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
        }
    }

    private fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }


    private fun attachObserver() {
        viewModel?.apiBlockIntResponse?.observe(this, androidx.lifecycle.Observer {
            AppPreferences.getInstance(this)?.blockInOutResponse = it
            blockRes?.invoke(it)
        })

        this.viewModel?.isLoading?.observe(this, androidx.lifecycle.Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(this, androidx.lifecycle.Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })

    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }


    fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
//                binding.submit.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
//                binding.submit.visibility = View.VISIBLE
            }
        }
    }

    companion object {
        var blockRes: ((it: BlockInOutResponse?) -> Unit)? = null
    }
}


