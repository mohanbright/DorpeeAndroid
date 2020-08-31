package com.droid.dorpee.ui.venuedashboard.venueItem

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityVeneueWorksapceBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity
import com.droid.dorpee.ui.venuedashboard.adapter.AddWorkspaceAdapter
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.ui.venuedashboard.viewmodel.MyVenueViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class VeneueWorksapceActivity : BaseActivity(), View.OnClickListener {
    private var venueName: String = ""
    private var venueNameWork: String = ""
    private lateinit var binding: ActivityVeneueWorksapceBinding
    var viewModel: MyVenueViewModel? = null
    private var venueId: Int = 0

    var workspaceList: ArrayList<Space>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVeneueWorksapceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as MyVenueViewModel
        intent.getStringExtra("venuename")?.let { s ->
            binding.textViewHeading.text = s
            intent.getIntExtra("venueId", 0).let {
                venueId = it
                venueName = s
                setworkspaceList(it, s)
                venueNameWork = s
                setworkspaceList(it, venueNameWork)
            }
        }
    /*    binding.addMore.setOnClickListener {
            Log.e("New Add Log","Venue Work Button Clicked")
            startActivity(Intent(this, AddWorkSpaceActivity::class.java).apply {
                putExtra("venueId",venueId)
                putExtra("venueName", venueName)
                putExtra("from","dashboard")
            })
        }*/

        attachObserver()
    }

    override fun onResume() {
        super.onResume()
        viewModel?.getSingleVenues(
                RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                venueId
        )
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
        binding.imageViewProfilePic.setOnClickListener {
            onBackPressed()
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(MyVenueViewModel())
        return ViewModelProvider(this, provider).get(MyVenueViewModel::class.java)
    }

    private fun setworkspaceList(venueId: Int, venueName: String) {
//        workspaceList?.add(Space(isSpace = false))
//        workspaceList?.add(Space(isSpace = false))
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewWorkspace.layoutManager = layoutManager
        binding.recyclerViewWorkspace.adapter =
                AddWorkspaceAdapter(this, venueId, venueName, workspaceList ?: ArrayList())
        (binding.recyclerViewWorkspace.adapter as AddWorkspaceAdapter).itemClick = { type, space, _ ->
            when (type) {
                "Cancel" -> {
                    confirmDeleteDialog(space)
                }
                else -> {
                }
            }
        }
    }

    private  fun attachObserver() {
        viewModel?.apiSingleVenueResponse?.observe(this, Observer {
            workspaceList?.clear()
            if (it.data != null && !it.data.spaces.isNullOrEmpty())
                workspaceList?.addAll(it.data.spaces)

//            workspaceList?.add(Space(isSpace = false))
//            workspaceList?.add(Space(isSpace = false))
            (binding.recyclerViewWorkspace.adapter as AddWorkspaceAdapter).notifyDataSetChanged()
        })

        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })
        this.viewModel?.apiDeleteResponse?.observe(this, Observer {
            viewModel?.getSingleVenues(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token), venueId)
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
                startActivity(Intent(this, AddWorkSpaceActivity::class.java).apply {
                    putExtra("venueId", venueId)
                    putExtra("venueName", venueNameWork)
                    putExtra("from", "dashboard")
                })
            }
            /*        binding.addMore.id -> {
                if (binding.recyclerViewWorkspace.adapter is AddWorkspaceAdapter) {
                    workspaceList?.add(Space(isSpace = false))
                    (binding.recyclerViewWorkspace.adapter as AddWorkspaceAdapter).notifyDataSetChanged()
                }
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

    private fun confirmDeleteDialog(space: Space) {
        val dialogBuilder = MaterialAlertDialogBuilder(this)
        dialogBuilder.setMessage(getString(R.string.delete_workspace_txt))
                .setCancelable(false)
                .setPositiveButton("YES") { dialog, _ ->
                    if (isNetworkAvailable()) {
                        viewModel?.deleteWorkspace(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token), space.id!!)
                    } else {
                        showUpSnackError(getString(R.string.network_unavailble))
                    }
                    dialog.cancel()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.cancel()
                }
        val alert = dialogBuilder.create()
        alert.setTitle(getString(R.string.delete_worksp))
        alert.show()
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

}

