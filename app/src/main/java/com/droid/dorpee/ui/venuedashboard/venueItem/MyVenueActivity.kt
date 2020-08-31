package com.droid.dorpee.ui.venuedashboard.venueItem

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.BuildConfig
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityMyVenueBinding
import com.droid.dorpee.ui.ChangeVenueStatusRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venue.EditVenueActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.droid.dorpee.ui.venuedashboard.adapter.MyVenueAdapter
import com.droid.dorpee.ui.venuedashboard.viewmodel.MyVenueViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.toJson
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class MyVenueActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMyVenueBinding
    var viewModel: MyVenueViewModel? = null
    var venueList: ArrayList<Data>? = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyVenueBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as MyVenueViewModel

        attachObserver()
        setVenueList()
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

    override fun onResume() {
        super.onResume()
        viewModel?.getVenues(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
    }

    override fun initListeners() {
        binding.imageViewProfilePic.setOnClickListener {
            onBackPressed()
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(MyVenueViewModel())
        return ViewModelProvider(this, provider).get(MyVenueViewModel::class.java)
    }

    private fun setVenueList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewMyVenue.layoutManager = layoutManager
        binding.recyclerViewMyVenue.adapter = MyVenueAdapter(this, venueList ?: ArrayList())
        (binding.recyclerViewMyVenue.adapter as MyVenueAdapter).itemClick = { type, venue, pos ->
            when (type) {
                "workspace" -> {
                    startActivity(Intent(this, VeneueWorksapceActivity::class.java).apply {
                        putExtra("venueId", venue.id)
                        putExtra("venuename", venue.name)
                    })
                }
                "edit" -> {
                    startActivity(Intent(this, EditVenueActivity::class.java).apply {
                        putExtra("do", "edit")
                        putExtra("venue", venue)
                    })
                }
                "cancel" -> {
                    confirmDeleteVenueDialog(venue)
                }
                "status" -> {
                    changeVenueStatus(venue)
                }
                "ohspass" -> {
                    ohsDialog(venue, "ohspass")
                }
                "ohsfail" -> {
                    ohsDialog(venue,"ohsfail")
                }
                "show" -> {
                    startActivity(Intent(this,VenueDetailActivity::class.java).apply {
                        putExtra("venueData",venue.toJson())
                    })
                }
                else -> {
                }
            }
        }
    }

    private fun attachObserver() {
        viewModel?.apiAllVenuesResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.allVenueResponse = it
            venueList?.clear()
            if (!it.data.isNullOrEmpty())
                venueList?.addAll(it.data)
            (binding.recyclerViewMyVenue.adapter as MyVenueAdapter).notifyDataSetChanged()

        })
        viewModel?.apiSingleVenueResponse?.observe(this, Observer {
            if (it.data != null) {
//                viewModel?.getVenues(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
                (binding.recyclerViewMyVenue.adapter as MyVenueAdapter).venueList.mapIndexed { index, data ->
                    if (it.data.id == data.id) {
                        showUpSnackError(getString(R.string.status_updatd))
                        (binding.recyclerViewMyVenue.adapter as MyVenueAdapter).venueList[index] = it.data
                        (binding.recyclerViewMyVenue.adapter as MyVenueAdapter).notifyItemChanged(index, it.data)
                    }
                }
            }
        })

        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })
        this.viewModel?.apiDeleteResponse?.observe(this, Observer {
            viewModel?.getVenues(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
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

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
            binding.addConstraintVenue.id -> {
                startActivity(Intent(this, RegisterVenueActivity::class.java).apply {
                    putExtra("do", "create")
                })
            }
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

    private fun confirmDeleteVenueDialog(venue: Data) {
        val dialogBuilder = MaterialAlertDialogBuilder(this)
        dialogBuilder.setMessage(getString(R.string.delete_venue_txt))
                .setCancelable(false)
                .setPositiveButton("YES") { dialog, _ ->
                    if (isNetworkAvailable()) {
                        viewModel?.deleteVenue(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token), venue.id!!)
                    } else {
                        showUpSnackError(getString(R.string.network_unavailble))
                    }
                    dialog.cancel()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.cancel()
                }
        val alert = dialogBuilder.create()
        alert.setTitle(getString(R.string.delete_venue))
        alert.show()
    }

    private fun changeVenueStatus(venue: Data) {
        val builder = MaterialAlertDialogBuilder(this)
        builder.setTitle(getString(R.string.change_status))
//        builder.setMessage(getString(R.string.change_status_to))
        val list = arrayOf<CharSequence>("Publish", "Closed", "Unpublish")
        builder.setItems(list) { dialog, which ->
            val status = when (list[which]) {
                "Publish" -> {
                    "Published"
                }
                "Closed" -> {
                    "Closed"
                }
                "Unpublish" -> {
                    "Unpublished"
                }
                else -> {
                    ""
                }
            }
            viewModel?.changeVenueStatus(RequestWithHeader(
                    AppPreferences.getInstance(this)?.user?.token),
                    ChangeVenueStatusRequest(status = status), venue.id ?: 0)
        }
        val dialog = builder.create()
//        dialog.setMessage(getString(R.string.change_status_to))
        dialog.show()
    }

    private fun ohsDialog(venue: Data, ohs: String) {
        val builder = MaterialAlertDialogBuilder(this)
        builder.setTitle(getString(R.string.ohs_title))
        if (ohs=="ohspass") {
            builder.setMessage(getString(R.string.ohs_completed_msg)+" ${venue.assessment?.completed_date?:""}")
                    .setNeutralButton("Ok") { dialog, _ ->
                        dialog.cancel()
                    }
        } else {
            builder.setMessage(getString(R.string.ohs_msg))
                    .setCancelable(false)
                    .setPositiveButton("YES") { dialog, _ ->
                        try {
//                            val url = "http://dorpee.com/"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(BuildConfig.WebUrl)
                            startActivity(i)
                        } catch (e: ActivityNotFoundException) {
                            e.printStackTrace()
                        }
                        dialog.cancel()
                    }
                    .setNegativeButton("No") { dialog, _ ->
                        dialog.cancel()
                    }
        }
        val dialog = builder.create()
        dialog.show()
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }
}

