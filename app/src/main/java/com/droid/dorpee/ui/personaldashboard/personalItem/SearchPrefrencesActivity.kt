package com.droid.dorpee.ui.personaldashboard.personalItem

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivitySearchPrefrencesBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.PersonalDashboardActivity
import com.droid.dorpee.ui.personaldashboard.adapter.SearchAdapter
import com.droid.dorpee.ui.personaldashboard.models.PreferenceData
import com.droid.dorpee.ui.venuedashboard.VenueDashboardActivity
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom

class SearchPrefrencesActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySearchPrefrencesBinding
    var viewModel: VenueDashViewModel? = null
    private var user: User? = null
    private var index = -1
    var searchPrefers: ArrayList<PreferenceData>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchPrefrencesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user?.user
        viewModel = setUpVM() as VenueDashViewModel
        attachObserver()
        setUpSearchList()
    }

    override fun bindData() {
        Glide
                .with(this)
                .load(user?.avatar)
                .dontAnimate()
                .centerInside()
                .circleCrop()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {

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

    private fun attachObserver() {
        viewModel?.searchPreference(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
        this.viewModel?.apiSearchReference?.observe(this, Observer {
            it.data?.forEach {
                searchPrefers?.add(it)
            }
            binding.recyclerViewSearch.adapter?.notifyDataSetChanged()
        })
        this.viewModel?.apiError?.observe(this, Observer {
            showSnackBarCustom(it, binding.alertView, ContextCompat.getColor(this, R.color.colorPrimaryDark))
        })
        this.viewModel?.isLoading?.observe(this, Observer {
        })

    }

    private fun setUpSearchList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewSearch.layoutManager = layoutManager
        binding.recyclerViewSearch.adapter = SearchAdapter(this, searchPrefers!!)
        (binding.recyclerViewSearch.adapter as SearchAdapter).itemClick = { item, position ->
            confirmDialog(item)
            index = position
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
        }
    }

    private fun confirmDialog(item: PreferenceData) {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage("Are you sure you want to delete this item?")
                .setCancelable(false)
                .setPositiveButton("YES") { dialog, _ ->
                    if (isNetworkAvailable()) {
                        item.id?.let {
                            viewModel?.deleteSearchPreference(
                                    RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                                    it
                            )
                        }
                        binding.recyclerViewSearch.adapter?.notifyDataSetChanged()
                    } else {
                        showSnackBarCustom(
                                getString(R.string.network_unavailble),
                                findViewById(R.id.alertView),
                                ContextCompat.getColor(this, R.color.colorPrimaryDark)
                        )
                    }
                    dialog.cancel()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.cancel()
                }
        val alert = dialogBuilder.create()
        alert.setTitle("Delete")
        alert.show()
    }
}
