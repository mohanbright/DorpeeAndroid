package com.droid.dorpee.ui.personaldashboard.personalItem

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityAddContactBinding
import com.droid.dorpee.ui.CreateContact
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.UpdateContact
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import com.droid.dorpee.ui.personaldashboard.models.MDTeamX
import com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom

class AddContact : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityAddContactBinding
    private var teams = ArrayList<String>()
    private var teamsList = java.util.ArrayList<MDTeamX>()
    private var contact: MDContact? = null
    var teamsViewModel: TeamsViewModel? = null
    private var user: User? = null
    private var selectedTeamId: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user?.user
        contact = intent.extras?.get("data") as MDContact?
        if (contact != null) {
            binding.textView13.text = "Update Contact"
            binding.textView7.text = "Update"
        }
        teamsViewModel = setUpVM() as TeamsViewModel
        if (isNetworkAvailable()) {
            teamsViewModel?.getTeams(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
        } else {
            showSnackBarCustom(
                getString(R.string.network_unavailble),
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        }
        attachObservers()
        bindData()
    }

    override fun bindData() {
        Glide
            .with(this)
            .load(user?.avatar)
            .dontAnimate()
            .circleCrop()
            .centerInside()
            .placeholder(R.drawable.profile_holder)
            .into(binding.imageViewProfilePic)
    }


    override fun initListeners() {
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(TeamsViewModel())
        return ViewModelProvider(this, provider).get(TeamsViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
            binding.addConstraint.id -> {
                if (contact != null) {
                    updateContact()
                } else {
                    createContact()
                }

            }
        }
    }


    private fun bind() {
        binding.firstname.setText(contact?.first_name)
        binding.lastname.setText(contact?.last_name)
        binding.email.setText(contact?.email)
        if (contact?.team_id != null && contact?.team_id != 0) {
            binding.spinnerTeams.selectItemByIndex(getTeamId(contact?.team_id) + 1)
        } else {
            binding.spinnerTeams.selectItemByIndex(0)
        }
    }


    private fun updateContact() {
        teamsViewModel?.updateContact(
            RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
            UpdateContact(
                binding.firstname.text.toString(),
                binding.lastname.text.toString(),
                binding.email.text.toString(),
                selectedTeamId,
                "PUT"
            ),
            contact?.id!!
        )
    }


    private fun attachObservers() {
        teamsViewModel?.apiTeamsResponse?.observe(this, Observer {
            teamsList.addAll(it.data)
            teams.clear()
            teams.add("Select team")
            for (team in teamsList) {
                teams.add(team.name)
            }
            binding.spinnerTeams.apply {
                setItems(teams)
                selectItemByIndex(0)
                lifecycleOwner = this@AddContact
            }
            if (contact != null) {
                bind()
            }
        })

        binding.spinnerTeams.apply {
            setOnSpinnerItemSelectedListener<String> { index, text ->
                if (index != 0) {
                    selectedTeamId = teamsList.get(index - 1).id.toString()
                    Log.e("TeamId", selectedTeamId)
                } else {
                    selectedTeamId = ""
                }
            }
        }

        this.teamsViewModel?.apiContactResponse?.observe(this, Observer {
            finish()
        })

        this.teamsViewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                it,
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.teamsViewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })
    }

    private fun getTeamId(id: Int?): Int {
        Log.e("Get TEam", id.toString());
        if (teamsList.size > 0) {
            for (x in 0 until teamsList.size) {
                if (teamsList.get(x).id == id) {
                    return x
                }
            }
        }
        return 0
    }


    private fun createContact() {
        if (isValid()) {
            if (isNetworkAvailable()) {
                teamsViewModel?.createContact(
                    RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                    CreateContact(
                        binding.firstname.text.toString(),
                        binding.lastname.text.toString(),
                        binding.email.text.toString(),
                        selectedTeamId
                    )
                )
            } else {
                showSnackBarCustom(
                    getString(R.string.network_unavailble),
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
                )
            }
            hideKeyboard()
        }
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


    private fun isValid(): Boolean {
        return if (binding.firstname.text.isNullOrEmpty()) {
            showSnackBarCustom(
                "Enter first name!",
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            false
        } else if (binding.lastname.text.isNullOrEmpty()) {
            showSnackBarCustom(
                "Enter last name!",
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
            false
        } else if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()
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
