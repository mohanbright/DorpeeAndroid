package com.droid.dorpee.ui.personaldashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentPrivacyBinding
import com.droid.dorpee.ui.PrivacySettings
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.viewmodel.SettingsViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom

class PrivacyFragment : BaseFragment() {
    private lateinit var binding: FragmentPrivacyBinding
    var viewModel: SettingsViewModel? = null
    var user: LoginResponse? = null
    override fun bindData() {

    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SettingsViewModel())
        return ViewModelProvider(this, provider).get(SettingsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrivacyBinding.inflate(layoutInflater)
        viewModel = setUpVM() as SettingsViewModel
        user = AppPreferences.getInstance(requireContext())?.user
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        bind()
        attachObserver()
    }

    private fun attachObserver() {
        viewModel?.apiResponse?.observe(viewLifecycleOwner, Observer {
            val loginResponse: LoginResponse? = AppPreferences.getInstance(requireContext())?.user
            loginResponse?.user = it.data
            AppPreferences.getInstance(requireContext())?.user = loginResponse
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            showSnackBarCustom(
                it,
                binding.alertView,
                ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })
    }

    override fun initListeners() {
        binding.buttonTeam.setOnClickListener {
            updateSettings()
        }
    }


    private fun bind() {
        if (user?.user?.privacyInterests!=null)
            binding.interstsSwitch.isChecked = user?.user?.privacyInterests?.equals("Yes")!!
        if (user?.user?.privacyName!=null)
            binding.nametSwitch.isChecked = user?.user?.privacyName?.equals("Yes")!!
        if (user?.user?.privacyLinkedin!=null)
            binding.linkedInSwitch.isChecked = user?.user?.privacyLinkedin?.equals("Yes")!!
        if (user?.user?.linkedin!=null)
            binding.profileLinked.setText(user?.user?.linkedin.toString())

    }

    private fun updateSettings() {
        val privacy: String = if (binding.interstsSwitch.isChecked) "Yes" else "No"
        val name: String = if (binding.nametSwitch.isChecked) "Yes" else "No"
        val linked: String = if (binding.linkedInSwitch.isChecked) "Yes" else "No"
        viewModel?.updateSettings(
            RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
            PrivacySettings(
                binding.profileLinked.text.toString(),
                linked,
                name,
                privacy
            ), requireContext(),this
        )
    }

    fun moveDashBoard(){
        requireActivity().onBackPressed();
    }

    private fun showProgress(it: Boolean) {
        if (it) {
            binding.loginLoader.visibility = View.VISIBLE
            binding.buttonTeam.visibility = View.INVISIBLE
        } else {
            binding.loginLoader.visibility = View.INVISIBLE
            binding.buttonTeam.visibility = View.VISIBLE
        }
    }

}
