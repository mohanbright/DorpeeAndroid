package com.droid.dorpee.ui.booking.frags


import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentInviteTeamsBinding
import com.droid.dorpee.ui.CreateTeamRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.UpdateTeamRequest
import com.droid.dorpee.ui.auth.static.CapacityCheck
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.adapter.TeamsInviteAdapter
import com.droid.dorpee.ui.personaldashboard.models.MDTeamX
import com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class TeamsInviteFragment(var bookingStep2Fragment: BookingStep2Fragment) : BaseFragment() {
    private lateinit var binding: FragmentInviteTeamsBinding
    private var teamsList = ArrayList<MDTeamX>()
    private var index = 0
    var viewModel: TeamsViewModel? = null

    override fun bindData() {
    }

    override fun initListeners() {
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(TeamsViewModel())
        return ViewModelProvider(this, provider).get(TeamsViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInviteTeamsBinding.inflate(layoutInflater)
        viewModel = setUpVM() as TeamsViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachObserver()
    }

    private fun attachObserver() {
        if (isNetworkAvailable()) {
            viewModel?.getTeams(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        } else {
            showSnackBarCustom(
                    getString(R.string.network_unavailble),
                    requireActivity().findViewById(R.id.alertView),
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        }
        viewModel?.apiTeamsResponse?.observe(viewLifecycleOwner, Observer {
            teamsList.clear()
            teamsList.addAll(it.data)
            setUPUpcomingList(teamsList)
        })

        viewModel?.apiCreateTeamResponse?.observe(viewLifecycleOwner, Observer {
            teamsList.add(it.data)
            binding.recyclerTeam.adapter?.notifyItemRangeChanged(0, teamsList.size)
        })

        viewModel?.apiUpdateTeamResponse?.observe(viewLifecycleOwner, Observer {
            viewModel?.getTeams(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

        viewModel?.apiDeleteResponse?.observe(viewLifecycleOwner, Observer {
            if (it.success.equals("Deleted Successfully")) {
                teamsList.removeAt(index)
                binding.recyclerTeam.adapter?.notifyItemRemoved(index)
                binding.recyclerTeam.adapter?.notifyItemRangeChanged(index, teamsList.size);
            }
        })

        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    requireActivity().findViewById(R.id.alertView),
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })

        binding.buttonStay.setOnClickListener {
            showDialog(0, null)
        }
    }


    private fun setUPUpcomingList(data: ArrayList<MDTeamX>) {
        val layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerTeam.layoutManager = layoutManager
        binding.recyclerTeam.adapter = TeamsInviteAdapter(requireContext(), data)
        (binding.recyclerTeam.adapter as TeamsInviteAdapter).itemClick = {
            (binding.recyclerTeam.adapter as TeamsInviteAdapter).dashList.mapIndexed { index, inviteItem ->
                if (index == it) {
                    Log.e("THis is s","This iss "+index)
                    val clicked =
                            (binding.recyclerTeam.adapter as TeamsInviteAdapter).dashList[it].isClicked
                    (binding.recyclerTeam.adapter as TeamsInviteAdapter).dashList[it].isClicked =
                            !clicked
                    (binding.recyclerTeam.adapter as TeamsInviteAdapter).notifyItemChanged(it)
                    if (data.get(index).isClicked){
                        CapacityCheck.setValue(CapacityCheck.getValue() + data.get(index).contact_count)
                        bookingStep2Fragment.checkValidity()
                        Log.e("The Clicked Invite","Clicked Invite final : "+ CapacityCheck.getValue())
                    }
                    else{
                        CapacityCheck.setValue(CapacityCheck.getValue() - data.get(index).contact_count)
                        Log.e("The Clicked Invite","Clicked UN UN is After :  "+CapacityCheck.getValue())
                        bookingStep2Fragment.checkValidity()
                      //  BookingStep2Fragment.getInstance().otherList();
                    }
                }
            }
        }

    }


    private fun confirmDialog(team: MDTeamX) {
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setMessage("Are you sure you want to delete this team?")
                .setCancelable(false)
                .setPositiveButton("YES") { dialog, _ ->
                    if (isNetworkAvailable()) {
                        viewModel?.deleteTeam(
                                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                                team.id
                        )
                    } else {
                        showSnackBarCustom(
                                getString(R.string.network_unavailble),
                                requireActivity().findViewById(R.id.alertView),
                                ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
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


    private fun showDialog(type: Int, team: MDTeamX?) {
        val dialog = Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.add_team_dialog)
        val add: Button = dialog.findViewById(R.id.addBtn);
        val nameET: TextInputEditText = dialog.findViewById(R.id.teamNameET)
        val title: TextView = dialog.findViewById(R.id.text)
        if (type == 0) {
            add.text = "Add"
            title.text = "Add new team"
        } else {
            title.text = "Update team"
            add.text = "Update"
            nameET.setText(team?.name)
        }
        add.setOnClickListener {
            if (type == 0) {
                if (isNetworkAvailable()) {
                    createTeam(nameET, dialog)
                } else {
                    showSnackBarCustom(
                            getString(R.string.network_unavailble),
                            requireActivity().findViewById(R.id.alertView),
                            ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
                    )
                }

            } else {
                if (isNetworkAvailable()) {
                    updateTeam(nameET, dialog, team?.id!!)
                } else {
                    showSnackBarCustom(
                            getString(R.string.network_unavailble),
                            requireActivity().findViewById(R.id.alertView),
                            ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
                    )
                }
                updateTeam(nameET, dialog, team?.id!!)
            }

        }
        dialog.show()
        val window: Window? = dialog.getWindow()
        window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    fun createTeam(nameET: TextInputEditText, dialog: Dialog) {
        if (!nameET.text.isNullOrEmpty()) {
            viewModel?.createTeam(
                    RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                    CreateTeamRequest(nameET.text.toString())
            )
            dialog.dismiss()
        } else {
            nameET.error = "Team name is required"
        }
    }

    fun updateTeam(nameET: TextInputEditText, dialog: Dialog, teamId: Int) {
        if (!nameET.text.isNullOrEmpty()) {
            viewModel?.updateTeam(
                    RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                    UpdateTeamRequest(nameET.text.toString(), "PUT"), teamId
            )
            dialog.dismiss()
        } else {
            nameET.error = "Team name is required"
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

}
