package com.droid.dorpee.ui.personaldashboard.personalItem

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityTopupCreditsBinding
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.PersonalDashboardActivity
import com.droid.dorpee.ui.personaldashboard.fragments.CreditFragment
import com.droid.dorpee.ui.personaldashboard.fragments.TransactionFragment
import com.droid.dorpee.ui.venuedashboard.VenueDashboardActivity
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.material.tabs.TabLayout


class TopUpActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityTopupCreditsBinding
    var viewModel: VenueDashViewModel? = null
    private var user: User? = null

    var apiError: MutableLiveData<String> = MutableLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopupCreditsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user?.user
        AppPreferences.getInstance(this)?.user
        viewModel = setUpVM() as VenueDashViewModel
    }


    override fun bindData() {
        Glide
                .with(this)
                .load(user?.avatar)
                .circleCrop()
                .dontAnimate()
                .centerInside()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
        loadFragment(CreditFragment())
    }

    override fun initListeners() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> loadFragment(CreditFragment())
                    1 -> loadFragment(TransactionFragment())
                    else -> loadFragment(CreditFragment())
                }
            }
        })
        binding.imageViewProfilePic.setOnClickListener {
            val user = AppPreferences.getInstance(this)?.user
            if (user == null) {
                val navController =
                        Navigation.findNavController(this, R.id.nav_host_fragment)
                navController.popBackStack()
            } else {
                if (user.user?.role != null && user.user?.role?.size ?: 0 > 0) {
                    val roleList = user.user?.role?.map { it.id!! }
                    if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                        startActivity(Intent(this, VenueDashboardActivity::class.java))
                    } else {
                        startActivity(
                                Intent(
                                        this,
                                        PersonalDashboardActivity::class.java
                                )
                        )
                    }
                }
            }
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
//            binding.addConstraint.id ->
        }
    }

    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }
}
