package com.droid.dorpee.ui.personaldashboard.fragments

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentContactsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.adapter.ContanctsAdapter
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import com.droid.dorpee.ui.personaldashboard.personalItem.AddContact
import com.droid.dorpee.ui.personaldashboard.viewmodel.ContactsViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import org.jetbrains.anko.support.v4.startActivity

class ContactsFragment : BaseFragment() {
    private lateinit var binding: FragmentContactsBinding
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
        binding = FragmentContactsBinding.inflate(layoutInflater)
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

        binding.buttonStay.setOnClickListener {
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


    private fun confirmDialog(contact: MDContact?) {
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setMessage("Are you sure you want to delete this contact?")
            .setCancelable(false)
            .setPositiveButton("YES") { dialog, _ ->
                if (isNetworkAvailable()) {
                    viewModel?.deleteContact(
                        RequestWithHeader(
                            AppPreferences.getInstance(
                                requireContext()
                            )?.user?.token
                        ), contact!!.id
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
            ContanctsAdapter(requireContext(), data)
        (binding.recyclerContancts.adapter as ContanctsAdapter).itemClick =
            { type, contact, position ->
                if (type == 0) {
                    // Cancel
                    confirmDialog(contact)
                    index = position
                } else if (type == 1) {
                    // Edit
                    openContact(1, contact)
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
