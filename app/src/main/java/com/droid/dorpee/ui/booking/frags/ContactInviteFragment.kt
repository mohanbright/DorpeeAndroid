package com.droid.dorpee.ui.booking.frags


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentInviteContactsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.static.CapacityCheck
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.adapter.ContactsInviteAdapter
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import com.droid.dorpee.ui.personaldashboard.personalItem.AddContact
import com.droid.dorpee.ui.personaldashboard.viewmodel.ContactsViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import org.jetbrains.anko.support.v4.startActivity

class ContactsInviteFragment(var bookingStep2Fragment: BookingStep2Fragment) : BaseFragment() {
    private lateinit var binding: FragmentInviteContactsBinding
    var viewModel: ContactsViewModel? = null
    private var contactList = java.util.ArrayList<MDContact>()
    private var index = -1
    override fun bindData() {

    }

    override fun initListeners() {
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(ContactsViewModel())
        return ViewModelProvider(this, provider).get(ContactsViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInviteContactsBinding.inflate(layoutInflater)
        viewModel = setUpVM() as ContactsViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachObserver()

    }


    private fun attachObserver() {
        viewModel?.apiContactsResponse?.observe(viewLifecycleOwner, Observer {
            contactList.clear()
            contactList.addAll(it.data)
            setUPUpcomingList(contactList)
        })

        viewModel?.apiDeleteResponse?.observe(viewLifecycleOwner, Observer {
            if (it.success.equals("Deleted Successfully")) {
                contactList.removeAt(index)
                binding.recyclerContancts.adapter?.notifyItemRemoved(index)
                binding.recyclerContancts.adapter?.notifyItemRangeChanged(index, contactList.size);
            }
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    requireActivity().findViewById(R.id.alertView),
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })

        binding.buttonTeam.setOnClickListener {
            openContact(0, null)
        }
    }


    fun openContact(type: Int, contact: MDContact?) {
        if (type == 0) {
            startActivity<AddContact>()
        } else {
            val intent = Intent(requireContext(), AddContact::class.java)
            val bundle = Bundle()
            bundle.putSerializable("data", contact)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        if (isNetworkAvailable()) {
            viewModel?.getContacts(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        } else {
            showSnackBarCustom(
                    getString(R.string.network_unavailble),
                    requireActivity().findViewById(R.id.alertView),
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        }

    }

    private fun setUPUpcomingList(data: ArrayList<MDContact>) {
        val layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerContancts.layoutManager = layoutManager
        binding.recyclerContancts.adapter =
                ContactsInviteAdapter(requireContext(), data)
        (binding.recyclerContancts.adapter as ContactsInviteAdapter).itemClick = {
            (binding.recyclerContancts.adapter as ContactsInviteAdapter).dashList.mapIndexed { index, inviteItem ->
                if (index == it) {
                    val clicked =
                            (binding.recyclerContancts.adapter as ContactsInviteAdapter).dashList[it].isChecked

                    (binding.recyclerContancts.adapter as ContactsInviteAdapter).dashList[it].isChecked =
                            !clicked
                    (binding.recyclerContancts.adapter as ContactsInviteAdapter).notifyItemChanged(
                            it
                    )
                    if (data.get(index).isChecked){
                        CapacityCheck.setValue(CapacityCheck.getValue() + 1)
                        bookingStep2Fragment.checkValidity()
                        Log.e("The Clicked Invite","Clicked Invite final : "+ CapacityCheck.getValue())
                    }
                    else{
                        CapacityCheck.setValue(CapacityCheck.getValue() - 1)
                        Log.e("The Clicked Invite","Clicked UN UN is After :  "+ CapacityCheck.getValue())
                        bookingStep2Fragment.checkValidity()
                    }
                }
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
}
