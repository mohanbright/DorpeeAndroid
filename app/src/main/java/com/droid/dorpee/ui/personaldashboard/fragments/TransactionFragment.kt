package com.droid.dorpee.ui.personaldashboard.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentTransactionBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.TransactionData
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.adapter.TransactionAdapter
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.stripe.android.Stripe


class TransactionFragment : BaseFragment() {
    private lateinit var binding: FragmentTransactionBinding
    var viewModel: VenueDashViewModel? = null
    private  var paymentIntentClientSecret: String = ""
    private var price: Double = 4.9
    private var roundoff: Double = 0.0
    private  var  minCredit: Int = 0
    private lateinit var stripe: Stripe
    private var user: User? = null

    var apiError: MutableLiveData<String> = MutableLiveData()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTransactionBinding.inflate(layoutInflater)
        user = AppPreferences.getInstance(requireContext())?.user?.user
        viewModel = setUpVM() as VenueDashViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData()
        viewModel?.getTransactions(
                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                requireContext(), this)

    }


    override fun bindData() {
    }

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    fun setTransactionAdapter(value: List<TransactionData>) {
        val layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvTransaction.layoutManager = layoutManager
        binding.rvTransaction.adapter = TransactionAdapter(requireContext(), value as ArrayList<TransactionData>)

        (binding.rvTransaction.adapter as TransactionAdapter).itemClick =
                { type, card, position ->
                    if(minCredit >= 100){
                    }
                    else{
                        Toast.makeText(requireContext(),this.resources.getString(R.string.please_enter_at_least), Toast.LENGTH_LONG).show()
                    }
                }
    }

}