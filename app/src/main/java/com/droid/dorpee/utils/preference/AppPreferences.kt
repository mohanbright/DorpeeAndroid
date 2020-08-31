package com.droid.dorpee.utils.preference

import android.content.Context
import android.content.SharedPreferences
import com.droid.dorpee.ui.auth.model.InterestResponse
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.model.MDCard
import com.droid.dorpee.ui.venue.adapter.Amenitie
import com.droid.dorpee.ui.venue.adapter.Asset
import com.droid.dorpee.ui.venue.model.EnvironmentResponse
import com.droid.dorpee.ui.venue.model.TypesResponse
import com.droid.dorpee.ui.venue.model.VenueTypeResponse
import com.droid.dorpee.ui.venue.venueresponse.VenueResponse
import com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse
import com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.ALL_VENUE_RES
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.ASSETS
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.BLOCK_OUT_RES
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.ENVIRONMENT
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.INTERESTS
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.SERVICES
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.TYPES
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.VENUE_RES
import com.droid.dorpee.utils.preference.PreferenceAttribute.Companion.VENUE_TYPES
import com.droid.dorpee.utils.toJson
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/*Shared preference.. */
class AppPreferences private constructor(context: Context) : PreferenceAttribute {
        private val preference: SharedPreferences = context.getSharedPreferences(
        PreferenceAttribute.PREFERENCE_NAME,
        Context.MODE_PRIVATE
    )
    private val editor: SharedPreferences.Editor

    /**
     * Sets user login status
     *
     * @param isLogin
     */
    var isUserLogin: Boolean
        get() = preference.getBoolean(PreferenceAttribute.IS_USER_LOGIN, false)
        set(isLogin) {
            editor.putBoolean(PreferenceAttribute.IS_USER_LOGIN, isLogin)
            editor.commit()
        }

    private val card = object : TypeToken<List<MDCard>?>() {}.type
    var cards: List<MDCard>?
        get() = Gson().fromJson(preference.getString(PreferenceAttribute.CARD, null), card)
        set(services) {
            editor.putString(SERVICES, services?.toJson())
            editor.commit()
        }

    var user: LoginResponse?
        get() = Gson().fromJson(
                preference.getString(PreferenceAttribute.USER, null),
                LoginResponse::class.java
        )
        set(user) {
            editor.putString(PreferenceAttribute.USER, user?.toJson())
            editor.commit()
        }

    private val type = object : TypeToken<ArrayList<Amenitie>?>() {}.type
    var services: ArrayList<Amenitie>?
        get() = Gson().fromJson(preference.getString(PreferenceAttribute.SERVICES, null), type)
        set(services) {
            editor.putString(SERVICES, services?.toJson())
            editor.commit()
        }

    private val assettype = object : TypeToken<ArrayList<Asset>?>() {}.type
    var assets: ArrayList<Asset>?
        get() = Gson().fromJson(preference.getString(ASSETS, null), assettype)
        set(assets) {
            editor.putString(ASSETS, assets?.toJson())
            editor.commit()
        }



    var types: TypesResponse?
        get() = Gson().fromJson(preference.getString(TYPES, null), TypesResponse::class.java)
        set(types) {
            editor.putString(TYPES, types?.toJson())
            editor.commit()
        }

    var interests: InterestResponse?
        get() = Gson().fromJson(preference.getString(INTERESTS, null), InterestResponse::class.java)
        set(types) {
            editor.putString(INTERESTS, types?.toJson())
            editor.commit()
        }
    var venueTypes: VenueTypeResponse?
        get() = Gson().fromJson(preference.getString(VENUE_TYPES, null), VenueTypeResponse::class.java)
        set(types) {
            editor.putString(VENUE_TYPES, types?.toJson())
            editor.commit()
        }
    var venueResponse: VenueResponse?
        get() = Gson().fromJson(preference.getString(VENUE_RES, null), VenueResponse::class.java)
        set(venueResponse) {
            editor.putString(VENUE_RES, venueResponse?.toJson())
            editor.commit()
        }
    var allVenueResponse: AllVenuesResponse?
        get() = Gson().fromJson(preference.getString(ALL_VENUE_RES, null), AllVenuesResponse::class.java)
        set(allVenueResponse) {
            editor.putString(ALL_VENUE_RES, allVenueResponse?.toJson())
            editor.commit()
        }
    var blockInOutResponse: BlockInOutResponse?
        get() = Gson().fromJson(preference.getString(BLOCK_OUT_RES, null), BlockInOutResponse::class.java)
        set(blockInOutResponse) {
            editor.putString(BLOCK_OUT_RES, blockInOutResponse?.toJson())
            editor.commit()
        }

    var environment: EnvironmentResponse?
        get() = Gson().fromJson(preference.getString(ENVIRONMENT, null), EnvironmentResponse::class.java)
        set(environment) {
            editor.putString(ENVIRONMENT, environment?.toJson())
            editor.commit()
        }

    val clearEnvironment: Unit
        get() = clearPreferenceKey(ENVIRONMENT)

    val clearServices: Unit
        get() = clearPreferenceKey(SERVICES)

    val clearTypes: Unit
        get() = clearPreferenceKey(TYPES)

    /**
     * Sets user type
     *
     * @param userType
     */
    var userId: String?
        get() = preference.getString(PreferenceAttribute.USER_TYPE, null)
        set(userType) {
            editor.putString(PreferenceAttribute.USER_TYPE, userType)
            editor.commit()
        }

    var userName: String?
        get() = preference.getString(PreferenceAttribute.USER_NAME, null)
        set(userName) {
            editor.putString(PreferenceAttribute.USER_NAME, userName)
            editor.commit()
        }

    var firstName: String?
        get() = preference.getString(PreferenceAttribute.FIRST_NAME, null)
        set(firstName) {
            editor.putString(PreferenceAttribute.FIRST_NAME, firstName)
            editor.commit()
        }

    var lastName: String?
        get() = preference.getString(PreferenceAttribute.LAST_NAME, null)
        set(lastName) {
            editor.putString(PreferenceAttribute.LAST_NAME, lastName)
            editor.commit()
        }

    var address: String?
        get() = preference.getString(PreferenceAttribute.ADDRESS, "")
        set(address) {
            editor.putString(PreferenceAttribute.ADDRESS, address)
            editor.commit()
        }

    fun setIsAddress(isAddress: Boolean) {
        editor.putBoolean(PreferenceAttribute.IS_ADDRESS, isAddress)
        editor.commit()
    }
    fun setPlanId(planId: Int) {
        editor.putInt(PreferenceAttribute.PLANID, planId)
        editor.commit()
    }
    fun getPlanId(): Int {
        return preference.getInt(PreferenceAttribute.PLANID, 0)
    }

    fun setWorkSpaces(planId: Int) {
        editor.putInt(PreferenceAttribute.WORKSPACE, planId)
        editor.commit()
    }
    fun getWorkSpaces(): Int {
        return preference.getInt(PreferenceAttribute.WORKSPACE, 0)
    }

    fun setPlanCredits(planId: Int) {
        editor.putInt(PreferenceAttribute.PLANCREDITS, planId)
        editor.commit()
    }
    fun getPlanCredits(): Int {
        return preference.getInt(PreferenceAttribute.PLANCREDITS, 0)
    }
    fun setPlanName(planId: String) {
        editor.putString(PreferenceAttribute.PLANNAME, planId)
        editor.commit()
    }
    fun getPlanName(): String {
        return preference.getString(PreferenceAttribute.PLANNAME,"")!!
    }

    fun setNumberPeople(planId: Int) {
        editor.putInt(PreferenceAttribute.NUMBERPEOPLE, planId)
        editor.commit()
    }
    fun getNumberPeople(): Int {
        return preference.getInt(PreferenceAttribute.NUMBERPEOPLE,0)
    }

    fun setEmpId(planId: Int) {
        editor.putInt(PreferenceAttribute.EMPID, planId)
        editor.commit()
    }
    fun getEmpId(): Int {
        return preference.getInt(PreferenceAttribute.EMPID,1)
    }

    fun setEmpCredits(planId: Int) {
        editor.putInt(PreferenceAttribute.EMPCREDITS, planId)
        editor.commit()
    }
    fun getEmpCredits(): Int {
        return preference.getInt(PreferenceAttribute.EMPCREDITS,0)
    }

    fun setPlaneExpiry(planId: String) {
        editor.putString(PreferenceAttribute.EXPIRYPLAN, planId)
        editor.commit()
    }

    fun getClosingDate(): String {
        return preference.getString(PreferenceAttribute.CLOSINGDATE,"")!!
    }

    fun setclosingDate(planId: String) {
        editor.putString(PreferenceAttribute.CLOSINGDATE, planId)
        editor.commit()
    }

    fun getOpeningDate(): String {
        return preference.getString(PreferenceAttribute.OPENINGDATE,"")!!
    }

    fun setOpeningDate(planId: String) {
        editor.putString(PreferenceAttribute.OPENINGDATE, planId)
        editor.commit()
    }

    fun getSelectedDate(): String {
        return preference.getString(PreferenceAttribute.SELECTDATE,"")!!
    }

    fun setSelectedDate(planId: String) {
        editor.putString(PreferenceAttribute.SELECTDATE, planId)
        editor.commit()
    }

    fun getTokenId(): String {
        return preference.getString(PreferenceAttribute.TokenId,"")!!
    }

    fun setTokenId(planId: String) {
        editor.putString(PreferenceAttribute.TokenId, planId)
        editor.commit()
    }

    fun getPlanExpiry(): String {
        return preference.getString(PreferenceAttribute.EXPIRYPLAN,"")!!
    }
    fun setEmployeeCompany(planId: String) {
        editor.putString(PreferenceAttribute.EMPCOMPANY, planId)
        editor.commit()
    }
    fun getEmployeeCompany(): String {
        return preference.getString(PreferenceAttribute.EMPCOMPANY,"")!!
    }

    fun setVenueName(planId: String) {
        editor.putString(PreferenceAttribute.VenueName, planId)
        editor.commit()
    }
    fun getVenueName(): String {
        return preference.getString(PreferenceAttribute.VenueName,"")!!
    }

    fun setCardBrand(brand: String) {
        editor.putString(PreferenceAttribute.CARDBRAND, brand)
        editor.commit()
    }
    fun getCardBrand(): String {
        return preference.getString(PreferenceAttribute.CARDBRAND,"")!!
    }

    fun setLastFour(lastFour: String) {
        editor.putString(PreferenceAttribute.LASTFOUR, lastFour)
        editor.commit()
    }
    fun getLastFour(): String {
        return preference.getString(PreferenceAttribute.LASTFOUR,"")!!
    }

    fun setRemainingCredit(planId: Int) {
        editor.putInt(PreferenceAttribute.REMAINCREDITS, planId)
        editor.commit()
    }
    fun getRemainingCredit(): Int {
        return preference.getInt(PreferenceAttribute.REMAINCREDITS, 0)
    }

    fun setIsActivePlan(isActivePlan: Boolean) {
        editor.putBoolean(PreferenceAttribute.ISActivePlan, isActivePlan)
        editor.commit()
    }
    fun getIsActivePlan(): Boolean {
        return preference.getBoolean(PreferenceAttribute.ISActivePlan, false)
    }

    fun setIsCompanyEmployee(isActivePlan: Boolean) {
        editor.putBoolean(PreferenceAttribute.IsEmployee, isActivePlan)
        editor.commit()
    }
    fun getIsCompanyEmployee(): Boolean {
        return preference.getBoolean(PreferenceAttribute.IsEmployee, false)
    }

    fun setIsCardActive(isActivePlan: Boolean) {
        editor.putBoolean(PreferenceAttribute.ISCARDACTIVE, isActivePlan)
        editor.commit()
    }
    fun getISCardActive(): Boolean {
        return preference.getBoolean(PreferenceAttribute.ISCARDACTIVE, false)
    }

    fun getIsAddress(): Boolean {
        return preference.getBoolean(PreferenceAttribute.IS_ADDRESS, false)
    }

    var mobileNumber: String?
        get() = preference.getString(PreferenceAttribute.MOBILE_NUMBER, "")
        set(mobileNumber) {
            editor.putString(PreferenceAttribute.MOBILE_NUMBER, mobileNumber)
            editor.commit()
        }

    var emailAddress: String?
        get() = preference.getString(PreferenceAttribute.EMAIL_ADDRESS, "")
        set(emailAddress) {
            editor.putString(PreferenceAttribute.EMAIL_ADDRESS, emailAddress)
            editor.commit()
        }

    fun clearPreferenceData() {
        editor.clear()
        editor.apply()
    }

    fun clearPreferenceKey(key: String) {
        editor.remove(key)
        editor.apply()
    }

    companion object {
        private var instance: AppPreferences? = null
        fun getInstance(context: Context): AppPreferences? {
            if (instance == null) {
                instance = AppPreferences(context)
                return instance
            }
            return instance
        }
    }

    init {
        editor = preference.edit()
    }
}