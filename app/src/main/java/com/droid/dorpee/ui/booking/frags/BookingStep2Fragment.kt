package com.droid.dorpee.ui.booking.frags

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBookingStep2Binding
import com.droid.dorpee.databinding.PopupContactBinding
import com.droid.dorpee.ui.CreateContact
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.static.CapacityCheck
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel
import com.droid.dorpee.ui.personaldashboard.models.MDContact
import com.droid.dorpee.ui.personaldashboard.models.MDTeamX
import com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.material.tabs.TabLayout
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.popup_contact.view.*
import kotlin.math.ceil


/**
 * A simple [Fragment] subclass.
 */
class BookingStep2Fragment : BaseFragment() {
    private lateinit var binding: FragmentBookingStep2Binding
    private lateinit var popupbinding: PopupContactBinding
    var viewModel: BookingStepsViewModel? = null
    private var date: String = ""
    var openingTime: String = "9:00"
    var closingTime: String = "9:00"
    var selectedDate: String = ""
    var space: Space? = null
    var scondition: String? = null
    private var contactList = java.util.ArrayList<MDContact>()
    var dialogContact: Dialog? = null
    var bookingId :String? = "0"
    var fromUpcomming : Boolean ?= false

    private var teams = ArrayList<String>()
    var teamsViewModel: TeamsViewModel? = null
    private var teamsList = java.util.ArrayList<MDTeamX>()
    private var selectedTeamId: String = ""

    companion object {
        fun newInstance(space: Space, scondition: String, fromUpcomming: Boolean, bookingId: String): BookingStep2Fragment {
            val args = Bundle()
            args.putSerializable("space", space)
            args.putString("scondition", scondition)
            args.putBoolean("fromUpcomming", fromUpcomming)
            args.putString("bookingId",bookingId)
            val fragment = BookingStep2Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    @SuppressLint("SetTextI18n")
    override fun bindData() {
        val listOfTab = arrayListOf(false, true, false)
        (context as BookingActivity).setUpTabline(listOfTab)

        space?.images?.first {
            Picasso.get().load(it).into(binding.imageViewSpace)
            true
        }
        var venue: String = ""
        val sConditions = scondition?.split("+")
        if (sConditions != null) {
            if (!sConditions.isEmpty()) {
                venue = sConditions[0]
                date = sConditions[1]
                openingTime = sConditions[2]
                closingTime = sConditions[3]

            }

        }
        openingTime =  AppPreferences.getInstance(requireContext())!!.getOpeningDate()
        closingTime =  AppPreferences.getInstance(requireContext())!!.getClosingDate()
        selectedDate = AppPreferences.getInstance(requireContext())!!.getSelectedDate()

        binding.textViewName.text = space?.name ?: ""
//        val venueStr = venue.split(",").toTypedArray()
//        binding.textViewAt.text = "at ${venueStr[0]}"

        binding.textViewAt.text = "at " +AppPreferences.getInstance(requireContext())?.getVenueName()

        val creditPerHour = if (space?.price.isNullOrEmpty()) 0 else ceil(
                space?.price?.toDouble()!!.div(0.3)).toInt()

        binding.textViewPrice.text = creditPerHour.toString()
        binding.textView86.text = "$selectedDate $openingTime $closingTime"
        loadFragment1(TeamsInviteFragment(this))
        loadFragment2(ContactsInviteFragment(this))
        loadFragmensts()
    }


    override fun initListeners() {
        binding.buttonNext.setOnClickListener {
            CapacityCheck.setValue(0)
            (context as BookingActivity).replaceFragment(BookingStep3Fragment.newInstance(space!!, scondition!!,fromUpcomming!!,bookingId))
        }
        binding.buttonCredit.setOnClickListener {
            val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.popup_contact, null)
            teamsViewModel?.apiTeamsResponse?.observe(this, Observer {
                teamsList.clear()
                teamsList.addAll(it.data)
                teams.clear()
                teams.add("Select team")
                for (team in teamsList) {
                    teams.add(team.name)
                }
                dialogView.spinnerTeams.apply {
                    setItems(teams)
                    selectItemByIndex(0)
                }
            })
            dialogView.spinnerTeams.apply {
                setOnSpinnerItemSelectedListener<String> { index, text ->
                    if (index != 0) {
                        selectedTeamId = teamsList.get(index - 1).id.toString()
                        Log.e("TeamId", selectedTeamId)
                    } else {
                        selectedTeamId = ""
                    }
                }
            }
            val dialogBuilder = AlertDialog.Builder(requireContext())
                    .setView(dialogView)
                    .setTitle("")
            val dialogContact = dialogBuilder.show()

            dialogView.addConstraint.setOnClickListener {
                //createContact()
                dialogContact.dismiss()
            }

        }
    }

    fun loadFragmensts() {

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> handleFragments(0)
                    1 -> handleFragments(1)
                }
            }
        })
    }


    fun loadFragment1(fragment: Fragment?) {
        val fragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container1.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }

    fun loadFragment2(fragment: Fragment?) {
        val fragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container2.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(BookingStepsViewModel())
        return ViewModelProvider(this, provider).get(BookingStepsViewModel::class.java)
    }

    private fun setUpTeamVM(): ViewModel {
        val provider = AppVMProvider()
        provider.createParams(TeamsViewModel())
        return ViewModelProvider(this, provider).get(TeamsViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookingStep2Binding.inflate(layoutInflater)
        scondition = arguments?.getString("scondition") as String
        space = arguments?.getSerializable("space") as Space
        fromUpcomming = arguments?.getBoolean("fromUpcomming",false)
        bookingId = arguments?.getString("bookingId")
        viewModel = setUpVM() as BookingStepsViewModel

        //popupbinding = FragmentBookingStep2Binding.inflate(layoutInflater)
        teamsViewModel = setUpTeamVM() as TeamsViewModel
        teamsViewModel?.getTeams(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        hideKeyboard(requireActivity())
        CapacityCheck.setValue(0)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUPInviteContactList()
    }

    private fun attachObserver() {
        viewModel?.apiContactsResponse?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            contactList.clear()
            contactList.addAll(it.data)
            setUPInviteContactList()
        })
    }

    private fun setUPInviteContactList() {
        val listOfDash = arrayListOf<InviteItem>()
        listOfDash.add(
                InviteItem(
                        "Aaron Busary", false
                )
        )
        listOfDash.add(
                InviteItem("Christine Fernandez", false)
        )
    }

    private fun getTeamId(id: Int?): Int {
        Log.e("Get TEam", id.toString())
        if (teamsList.size > 0) {
            for (x in 0 until teamsList.size) {
                if (teamsList.get(x).id == id) {
                    return x
                }
            }
        }
        return 0
    }

    private fun isValid(): Boolean {
        return if (popupbinding.firstname.text.isNullOrEmpty()) {
            showSnackBarCustom(
                    "Enter first name!",
                    popupbinding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
            false
        } else if (popupbinding.lastname.text.isNullOrEmpty()) {
            showSnackBarCustom(
                    "Enter last name!",
                    popupbinding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
            false
        } else if (popupbinding.email.text.isNullOrEmpty() || popupbinding.email.text?.toString()
                        ?.isValidEmail() == false
        ) {
            showSnackBarCustom(
                    "Enter valid email!",
                    popupbinding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
            false
        } else {
            true
        }
    }

    private fun createContact() {
        if (isValid()) {
            if (isNetworkAvailable()) {
                teamsViewModel?.createContact(
                        RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                        CreateContact(
                                popupbinding.firstname.text.toString(),
                                popupbinding.lastname.text.toString(),
                                popupbinding.email.text.toString(),
                                selectedTeamId
                        )
                )
            } else {
                showSnackBarCustom(
                        getString(R.string.network_unavailble),
                        popupbinding.alertView,
                        ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
                )
            }
            hideKeyboard(requireContext())
        }
    }

    fun handleFragments(pos: Int) {
        if (pos == 1) {
            binding.container1.visibility = View.INVISIBLE
            binding.container2.visibility = View.VISIBLE
        } else {
            binding.container2.visibility = View.INVISIBLE
            binding.container1.visibility = View.VISIBLE
        }
    }

    fun checkValidity() {
            Log.e("The Spa", "Space Capacity is " + space?.capacity + "  Added value is " + CapacityCheck.getValue())
            if (CapacityCheck.getValue() > space?.capacity!!) {
                binding.tvInviteError.visibility = View.VISIBLE
                binding.buttonNext.visibility = View.GONE
            } else {
                binding.tvInviteError.visibility = View.GONE
                binding.buttonNext.visibility = View.VISIBLE
            }
        }
    fun hideKeyboard(activity: Activity) {
        try {
            val inputManager = activity
                    .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            val currentFocusedView = activity.currentFocus
            if (currentFocusedView != null) {
                inputManager.hideSoftInputFromWindow(currentFocusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}
data class InviteItem(val name: String, var clicked: Boolean = false)