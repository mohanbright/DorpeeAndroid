package com.droid.dorpee.ui.personaldashboard.fragments


import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentCreditBinding
import com.droid.dorpee.ui.AddCardRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.model.MDCard
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.adapter.PaymentsAdapter
import com.droid.dorpee.ui.purchaseCreditRequest
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.stripe.android.ApiResultCallback
import com.stripe.android.PaymentConfiguration
import com.stripe.android.Stripe
import com.stripe.android.model.Card
import com.stripe.android.model.Token


class CreditFragment : BaseFragment() {
    private lateinit var binding: FragmentCreditBinding
    var viewModel: VenueDashViewModel? = null
    private  var paymentIntentClientSecret: String = ""
    private var price: Double = 0.0
    private var roundoff: Double = 0.0
    private  var  minCredit: Int = 0
    private lateinit var stripe: Stripe
    private var user: User? = null

    var apiError: MutableLiveData<String> = MutableLiveData()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreditBinding.inflate(layoutInflater)
        user = AppPreferences.getInstance(requireContext())?.user?.user
        viewModel = setUpVM() as VenueDashViewModel
        viewModel?.getCreditPrice(this)

        binding.addConstraint.setOnClickListener { view ->
            if(minCredit >= 100){
                if (AppPreferences.getInstance(requireContext())?.getISCardActive()!!){
                    purchaseCredits()
                }else{
                    addCard()
                }
            }
            else{
                Toast.makeText(requireContext(),this.resources.getString(R.string.please_enter_at_least), Toast.LENGTH_LONG).show()
            }
        }
        attachObserver()
        return binding.root
    }

    private fun attachObserver() {
        viewModel?.apiAddCardResponse?.observe(requireActivity(), Observer {
            val loginResponse: LoginResponse? = AppPreferences.getInstance(requireContext())?.user
            val list: List<MDCard>
            list = arrayListOf(it.data)
            loginResponse?.user?.cards = list
            AppPreferences.getInstance(requireContext())?.user = loginResponse
            val cardInputWidget = binding.cardInputWidget
            AppPreferences.getInstance(requireContext())?.setIsCardActive(true)
            cardInputWidget.postalCodeEnabled = false
            val card = Card.create(
                    cardInputWidget.card?.number,
                    Integer.valueOf(cardInputWidget.card?.expMonth!!),
                    Integer.valueOf(cardInputWidget.card?.expYear!!),
                    cardInputWidget.card?.cvc
            )
            stripe = Stripe(
                    requireContext(),
                    PaymentConfiguration.getInstance(requireContext()).publishableKey
            )
            stripe.createCardToken(card, null, null, object : ApiResultCallback<Token> {
                override fun onError(e: Exception) {
                    e.printStackTrace()
                }

                override fun onSuccess(result: Token) {
                    Log.e("Token", result.id)
                    AppPreferences.getInstance(requireContext())?.setTokenId(result.id)
                    setUPaymentList()
                    val intent = Intent()
                    intent.putExtra("token", result.id)

                }
            })
        })

        this.viewModel?.apiError?.observe(requireActivity(), Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })
        this.viewModel?.isLoading?.observe(requireActivity(), Observer {
            showProgress(it)
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindData()
        if(AppPreferences.getInstance(requireContext())?.getISCardActive()!!){
           // binding.addConstraint.visibility = View.GONE
            binding.tvTotal.visibility = View.GONE
            binding.cardInputWidget.visibility = View.GONE
        }
        else{
           // binding.addConstraint.visibility = View.VISIBLE
            binding.tvTotal.visibility = View.VISIBLE
            binding.cardInputWidget.visibility = View.VISIBLE
        }
        this.viewModel?.apiError?.observe(requireActivity(), Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })
        this.viewModel?.isLoading?.observe(requireActivity(), Observer {
            showProgress(it)
        })

        binding.amoutET.addTextChangedListener(object: TextWatcher {override fun afterTextChanged(s: Editable?) {
            Log.e("The add ","addTextChangedListener")
        }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.e("The add ","beforeTextChanged : "+s +" "+count+" "+after)
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.e("The add ","onTextChanged : "+s +" "+start+" "+before +" "+count)
                if(s?.trim()!=null && !s.trim().equals("") && !s.trim().isEmpty()){
                    setPriceData(s.toString().toInt(),price);
                }
            }
        })
        setUPaymentList()
    }

    fun setPriceData(credits: Int, price: Double) {
        binding.tvTotal.visibility= View.VISIBLE
         this.price = price
        minCredit = credits
        var finalPrice = minCredit * price
        roundoff = Math.round(finalPrice * 1000.0) / 1000.0
        binding.tvTotal.setText("Total: $"+roundoff +" ($"+ price +"/ per credit)");
    }

    override fun bindData() {
    }

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

//    private fun pay() {
//        val params = cardInputWidget.paymentMethodCreateParams
//        if (params != null) {
//            val confirmParams = ConfirmPaymentIntentParams
//                    .createWithPaymentMethodCreateParams(params, paymentIntentClientSecret)
//            stripe = Stripe(
//                    requireContext(), PaymentConfiguration.getInstance(requireContext()).publishableKey )
//            stripe.confirmPayment(this, confirmParams)
//        }
//    }


    fun setUPaymentList() {

        val layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerCards.layoutManager = layoutManager
        binding.recyclerCards.adapter = PaymentsAdapter(requireContext(), user?.cards as ArrayList<MDCard>,true)

        (binding.recyclerCards.adapter as PaymentsAdapter).itemClick =
                { type, card, position ->
                  /*  if(minCredit >= 10){
                        showDialog()
                    }
                    else{
                        Toast.makeText(requireContext(),this.resources.getString(R.string.please_enter_at_least), Toast.LENGTH_LONG).show()
                }*/
           }
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
            }
        }
    }


    private fun addCard() {
        if (isNetworkAvailable()) {
            val cardInputWidget = binding.cardInputWidget
            cardInputWidget.paymentMethodCreateParams ?: return
            cardInputWidget.postalCodeEnabled = false
            val card = Card.create(
                    cardInputWidget.card?.number,
                    Integer.valueOf(cardInputWidget.card?.expMonth!!),
                    Integer.valueOf(cardInputWidget.card?.expYear!!),
                    cardInputWidget.card?.cvc
            )
            if (!card.validateCard()) {
                showSnackBarCustom(
                        getString(R.string.invalid_card),
                        binding.alertView,
                        ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
                )
                return
            }
            stripe = Stripe(
                    requireContext(),
                    PaymentConfiguration.getInstance(requireContext()).publishableKey
            )
            stripe.createCardToken(card, null, null, object : ApiResultCallback<Token> {
                override fun onError(e: Exception) {
                    e.printStackTrace()
                }

                override fun onSuccess(result: Token) {
                    Log.e("Token", result.id)
                    viewModel?.addCard(
                            RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                            AddCardRequest(result.id, user?.fullName!!),this@CreditFragment
                    )
                }
            })
        } else {
            showSnackBarCustom(
                    getString(R.string.network_unavailble),
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        }
    }

    fun showDialog() {
//        val dialog = Dialog(requireContext())
//        dialog.setCancelable(false)
//        dialog.setContentView(R.layout.layout_dialog)
//        val body = dialog.findViewById(R.id.tv_message) as TextView
//        body.setText(this.resources.getString(R.string.your_credit_charge)+roundoff)
//        val yesBtn = dialog.findViewById(R.id.yes_button) as TextView
//        val noBtn = dialog.findViewById(R.id.no_button) as TextView
//        yesBtn.setOnClickListener { purchaseCredits(dialog) }
//        noBtn.setOnClickListener { dialog.dismiss() }
//        dialog.show()
    }

    fun purchaseCredits() {
        // dialog.dismiss()
        viewModel?.purchaseCredit(
                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                purchaseCreditRequest(minCredit),requireContext(), this)
    }

    fun setRefreshData(){
     binding.amoutET.setText("")
     binding.tvTotal.setText("")
        binding.cardInputWidget.visibility = View.GONE
        setUPaymentList()
    }
}
