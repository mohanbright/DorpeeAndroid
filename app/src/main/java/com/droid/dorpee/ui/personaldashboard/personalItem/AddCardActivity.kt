package com.droid.dorpee.ui.personaldashboard.personalItem

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityAddCardBinding
import com.droid.dorpee.ui.AddCardRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.model.MDCard
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.viewmodel.PlansViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.stripe.android.ApiResultCallback
import com.stripe.android.PaymentConfiguration
import com.stripe.android.Stripe
import com.stripe.android.model.Card
import com.stripe.android.model.Token


class AddCardActivity : BaseActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAddCardBinding
    var viewModel: PlansViewModel? = null
    private lateinit var stripe: Stripe
    var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        stripe = Stripe(this, PaymentConfiguration.getInstance(applicationContext).publishableKey)
        user = AppPreferences.getInstance(this)?.user?.user
        viewModel = setUpVM() as PlansViewModel
        initListeners()
        attachObserver()
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

    }

    override fun initListeners() {
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(PlansViewModel())
        return ViewModelProvider(this, provider).get(PlansViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
            binding.addConstraint.id -> addCard()
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
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
                )
                return
            }
            stripe = Stripe(
                applicationContext,
                PaymentConfiguration.getInstance(applicationContext).publishableKey
            )
            stripe.createCardToken(card, null, null, object : ApiResultCallback<Token> {
                override fun onError(e: Exception) {
                    e.printStackTrace()
                }

                override fun onSuccess(result: Token) {
                    Log.e("Token", result.id)
                    viewModel?.addCard(
                        RequestWithHeader(AppPreferences.getInstance(this@AddCardActivity)?.user?.token),
                        AddCardRequest(result.id, user?.fullName!!)
                    )
                }
            })
        } else {
            showSnackBarCustom(
                getString(R.string.network_unavailble),
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        }
    }

    private fun attachObserver() {
        viewModel?.apiAddCardResponse?.observe(this, Observer {
            val loginResponse: LoginResponse? = AppPreferences.getInstance(this)?.user
            val list: List<MDCard>
            list = arrayListOf(it.data)
            loginResponse?.user?.cards = list
            AppPreferences.getInstance(this)?.user = loginResponse
            AppPreferences.getInstance(this)?.setIsCardActive(true)
            val cardInputWidget = binding.cardInputWidget
            cardInputWidget.postalCodeEnabled = false
            val card = Card.create(
                cardInputWidget.card?.number,
                Integer.valueOf(cardInputWidget.card?.expMonth!!),
                Integer.valueOf(cardInputWidget.card?.expYear!!),
                cardInputWidget.card?.cvc
            )
            stripe = Stripe(
                applicationContext,
                PaymentConfiguration.getInstance(applicationContext).publishableKey
            )
            stripe.createCardToken(card, null, null, object : ApiResultCallback<Token> {
                override fun onError(e: Exception) {
                    e.printStackTrace()
                }

                override fun onSuccess(result: Token) {
                    Log.e("Token", result.id)
                    val intent = Intent()
                    intent.putExtra("token", result.id)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                }
            })
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
                binding.addConstraint.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.addConstraint.visibility = View.VISIBLE
            }
        }
    }
}
