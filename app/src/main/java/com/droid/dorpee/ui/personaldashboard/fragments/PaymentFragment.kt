package com.droid.dorpee.ui.personaldashboard.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentPaymentBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.model.MDCard
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.adapter.PaymentsAdapter
import com.droid.dorpee.ui.personaldashboard.viewmodel.SettingsViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom


class PaymentFragment : BaseFragment() {
    private lateinit var binding: FragmentPaymentBinding
    private var user: User? = null
    var viewModel: SettingsViewModel? = null
    private var index = -1
    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SettingsViewModel())
        return ViewModelProvider(this, provider).get(SettingsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPaymentBinding.inflate(layoutInflater)
        user = AppPreferences.getInstance(requireContext())?.user?.user
        viewModel = setUpVM() as SettingsViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (user?.cards?.size!= null){
            setUPaymentList()

        }
        attachObservers()
    }


    private fun attachObservers() {
        viewModel?.apiRemoveCardResponse?.observe(viewLifecycleOwner, Observer {
            val loginResponse: LoginResponse? = AppPreferences.getInstance(requireContext())?.user
            if (it.success.equals("Deleted Successfully")) {
                Toast.makeText(requireContext(),it.success,Toast.LENGTH_SHORT).show()
                loginResponse?.user?.cards = emptyList()
                AppPreferences.getInstance(requireContext())?.user = loginResponse
                AppPreferences.getInstance(requireContext())?.setIsCardActive(false)
                requireActivity().finish()

//                contactList.removeAt(index)
//                binding.recyclerContancts.adapter?.notifyItemRemoved(index)
//                binding.recyclerContancts.adapter?.notifyItemRangeChanged(index, contactList.size);
            }
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
//            showProgress(it)
        })

        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
//            showProgress(false)
            showSnackBarCustom(
                it,
                requireActivity().findViewById(R.id.alertView),
                ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })
    }

    private fun setUPaymentList() {
        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerCards.layoutManager = layoutManager
        binding.recyclerCards.adapter = PaymentsAdapter(requireContext(), user?.cards as ArrayList<MDCard>, false)
        (binding.recyclerCards.adapter as PaymentsAdapter).itemClick =
            { type, card, position ->
                if (type == 0) {
                    //Cancel
                    viewModel?.removeCard(
                        RequestWithHeader(
                            AppPreferences.getInstance(
                                requireContext()
                            )?.user?.token
                        ), card.id,
                            user?.cards as ArrayList<MDCard>
                    )
                    index = position

                } else {
                    // Edit
                }
            }
    }
}
