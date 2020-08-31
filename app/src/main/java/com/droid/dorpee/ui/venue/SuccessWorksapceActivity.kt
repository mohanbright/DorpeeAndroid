package com.droid.dorpee.ui.venue

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.databinding.ActivitySuccessWorksapceBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel

class SuccessWorksapceActivity : BaseActivity(), View.OnClickListener {

    private lateinit var binding: ActivitySuccessWorksapceBinding
    lateinit var viewModel: VenueViewModel
    private var venuName: String = ""
    private var venueId: Int = 0
    private var from: String = ""

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessWorksapceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueViewModel
        venueId = intent.getIntExtra("venueId", 0)
        from = intent.getStringExtra("from") ?: ""
        intent.getStringExtra("venueName")?.let {
            venuName = it
            binding.textView66.text = "Your venue $it is now published!"
        }
    }

    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(
                VenueViewModel()
        )
        return ViewModelProvider(this, provider).get(VenueViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.toDashboard.id -> {
                startActivity(Intent(this, DashboardActivity::class.java).apply {
                    putExtra("venueName", venuName)
                    putExtra("venueId", venueId)
                    putExtra("from", from)
                })
                finishAffinity()
            }
            binding.addMoreWorkspace.id -> {
                startActivity(Intent(this, AddWorkSpaceActivity::class.java).apply {
                    putExtra("venueName", venuName)
                    putExtra("venueId", venueId)
                    putExtra("from", from)
                })
                finishAffinity()
            }
        }
    }

}