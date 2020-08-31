package com.droid.dorpee.networkOperator


import com.droid.dorpee.ui.*
import com.droid.dorpee.ui.auth.model.*
import com.droid.dorpee.ui.booking.bookingmodel.BookingData
import com.droid.dorpee.ui.booking.model.ContactList
import com.droid.dorpee.ui.booking.model.EmployeeList
import com.droid.dorpee.ui.personaldashboard.models.*
import com.droid.dorpee.ui.search.model.DataModel
import com.droid.dorpee.ui.search.model.SearchResponse
import com.droid.dorpee.ui.search.ui.checkin.model.AutoCheckinResponse
import com.droid.dorpee.ui.venue.model.*
import com.droid.dorpee.ui.venue.venueresponse.VenueResponse
import com.droid.dorpee.ui.venuedashboard.model.*
import com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.BarChartResponse
import com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.PieChartResponse
import com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*


interface ApiService {


    @POST("/app/v1/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("/app/v1/forgetpassword")
    suspend fun forgetpassword(@Body request: LoginRequest): Response<ForgotResponse>

    @Multipart
    @POST("/app/v1/register")
    suspend fun signUpApi(@Part image: MultipartBody.Part?,
                          @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>): Response<LoginResponse>

    @GET("/app/v1/services")
    suspend fun getServices(): Response<ServicesResponse>

    @GET("/app/v1/types")
    suspend fun getTypes(): Response<TypesResponse>

    @GET("/app/v1/interests")
    suspend fun getInterest(): Response<InterestResponse>

    @GET("/app/v1/venue_types")
    suspend fun getVenueTypes(): Response<VenueTypeResponse>

    @GET("/app/v1/environments")
    suspend fun getEnvironment(): Response<EnvironmentResponse>

    @GET("/app/v1/assets")
    suspend fun getAssets(): Response<AssetsResponse>

    @GET("/app/v1/user/spaces")
    suspend fun getWorkSpaces(@Header("Authorization") value: String): Response<WorkspaceResponse>

    @GET("/app/v1/user/spaces/{spaceId}")
    suspend fun getSingleWorkSpaces(@Header("Authorization") value: String, @Path("spaceId") spaceId: Int): Response<SingleSpaceRespnce>

    @DELETE("/app/v1/user/spaces/{spaceId}")
    suspend fun deleteWorkspace(@Header("Authorization") value: String, @Path("spaceId") spaceId: Int): Response<DeleteResponse>

    @GET("/app/v1/user/venues")
    suspend fun getVenues(@Header("Authorization") value: String): Response<AllVenuesResponse>

    @GET("/app/v1/user/search/preferences")
    suspend fun getPreferences(@Header("Authorization") value: String): Response<PreferencesResponse>

    @DELETE("/app/v1/user/search/preferences/{ID}")
    suspend fun deletePreferencesItem(
            @Header("Authorization") value: String,
            @Path("ID") id: Int): Response<PreferencesResponse>

    @GET("/app/v1/user/venues/{venueId}")
    suspend fun getSingleVenue(@Header("Authorization") value: String, @Path("venueId") venueId: Int): Response<VenueResponse>

    @GET("/app/v1/venues/{venueId}")
    suspend fun getSingleWithoutTokenVenue(@Header("Authorization") value: String, @Path("venueId")
    venueId:
    Int): Response<VenueResponse>

    @DELETE("/app/v1/user/venues/{venueId}")
    suspend fun deleteVenue(@Header("Authorization") value: String, @Path("venueId") venueId: Int): Response<DeleteResponse>

    @Multipart
    @POST("/app/v1/user/venues")
    suspend fun createVenue(
            @Header(
                    "Authorization"
            ) value: String,
            @Part imageList: List<MultipartBody.Part>?,
            @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<VenueResponse>

    @Multipart
    @POST("/app/v1/user/venues/{venueId}")
    suspend fun updateVenue(
            @Header(
                    "Authorization"
            ) value: String,
            @Part imageList: List<MultipartBody.Part>?,
            @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>?,
            @Path("venueId") venueId: Int
    ): Response<VenueResponse>


    @Multipart
    @POST("/app/v1/user/spaces")
    suspend fun createWorkspace(
            @Header(
                    "Authorization"
            ) value: String,
            @Part imageList: List<MultipartBody.Part>?,
            @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<EditSpaceRespnce>

    @Multipart
    @POST("/app/v1/user/spaces/{spaceId}")
    suspend fun updateWorkspace(
            @Header(
                    "Authorization"
            ) value: String,
            @Part imageList: List<MultipartBody.Part>?,
            @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>,
            @Path("spaceId") spaceId: Int
    ): Response<EditSpaceRespnce>


    @POST("/app/v1/user/venue-availabilities")
    suspend fun venueAvailabilty(
            @Header(
                    "Authorization"
            ) value: String,
            @Body request: VenueAvailityReq
    ): Response<VenueAvailibiltyResponse>

    @POST("/app/v1/user/availabilities")
    suspend fun blockAvailability(
            @Header("Authorization") value: String, @Body request: BlockAvailbilityRequest): Response<BlockResponse>

    @POST("/app/v1/user/availabilities/unblock")
    suspend fun unblockAvailabilty(
            @Header("Authorization") value: String, @Body request: UnblockRequest): Response<UnBlockResponse>

    @GET("/app/v1/user/availabilities")
    suspend fun getAvailability(@Header("Authorization") value: String): Response<BlockInOutResponse>

    @Multipart
    @POST("/app/v1/search/basic")
    suspend fun basicSearch(
            @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<SearchResponse>

    @Multipart
    @POST("/app/v1/user/search/advance")
    suspend fun advanceSearch(
            @Header(
                    "Authorization"
            ) value: String, @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<SearchResponse>

    @GET("/app/v1/user/bookings")
    suspend fun getBookings(@Header("Authorization") authHeader: String): Response<MDBookingsList>


    @GET("/app/v1/plans")
    suspend fun getPlans(): Response<PlansList>

    @POST("/app/v1/user/change-plan")
    suspend fun changePlan(
            @Header("Authorization") authHeader: String,
            @Body request: ChangePlanRequest
    ): Response<PlanModel>


    @POST("/app/v1/user/purchase-plan")
    suspend fun purchasePlan(
            @Header("Authorization") authHeader: String,
            @Body request: PurchasePlanRequest
    ): Response<PlanModel>

    @POST("/app/v1/user/cards")
    suspend fun addCard(
            @Header("Authorization") authHeader: String,
            @Body request: AddCardRequest
    ): Response<MDCards>


    @POST("/app/v1/user/teams")
    suspend fun createTeam(
            @Header("Authorization") authHeader: String,
            @Body request: CreateTeamRequest
    ): Response<MDTeam>

    @POST("/app/v1/user/teams/{teamId}")
    suspend fun updateTeam(
            @Header("Authorization") authHeader: String,
            @Body request: UpdateTeamRequest,
            @Path("teamId") teamId: Int

    ): Response<MDTeam>


    @GET("/app/v1/user/teams")
    suspend fun getTeams(@Header("Authorization") authHeader: String): Response<MDTeamList>


    @GET("/app/v1/user/contacts")
    suspend fun getContacts(@Header("Authorization") authHeader: String): Response<MDContactsList>

    @GET("/app/v1/credit-price")
    suspend fun creditPrice(): Response<PlanModel>


    @DELETE("/app/v1/user/teams/{teamId}")
    suspend fun deleteTeam(
            @Header("Authorization") authHeader: String,
            @Path("teamId") teamId: Int
    ): Response<MDResponse>

    @DELETE("/app/v1/user/contacts/{contactId}")
    suspend fun deleteContact(
            @Header("Authorization") authHeader: String,
            @Path("contactId") contactId: Int
    ): Response<MDResponse>


    @POST("/app/v1/user/contacts")
    suspend fun createContact(
            @Header("Authorization") authHeader: String,
            @Body request: CreateContact
    ): Response<MDContact>


    @POST("/app/v1/user/contacts/{contactId}")
    suspend fun updateContact(
            @Header("Authorization") authHeader: String,
            @Body request: UpdateContact,
            @Path("contactId") contactId: Int
    ): Response<MDContact>

    @POST("/app/v1/user/bookings/change-status/{bookingId}")
    suspend fun cancelBooking(
            @Header("Authorization") authHeader: String,
            @Path("bookingId") bookingId: Int,
            @Body() request: CancelRequest
    ): Response<MDBookingX>

    @POST("/app/v1/bookings/changestatus")
    suspend fun changeStatus(
            @Header("Authorization") authHeader: String,
            @Body() request: ChangeStatusRequest
    ): Response<MDBookingX>

    @POST("/app/v1/bookings/changestatus")
    suspend fun changeVenueBookingStatus(
            @Header("Authorization") authHeader: String,
            @Body() request: ChangeStatusRequest
    ): Response<VenueBooking>

    @POST("/app/v1/user/venues/change-status/{venueId}")
    suspend fun changeVenueStatus(
            @Header("Authorization") authHeader: String,
            @Body() request: ChangeVenueStatusRequest, @Path("venueId") venueId: Int
    ): Response<VenueResponse>


    @POST("/app/v1/bookings/extend")
    suspend fun extendBooking(
            @Header("Authorization") authHeader: String,
            @Body extendReq: ExtendRequest
    ): Response<ResponseBody>

    @Multipart
    @POST("/app/v1/user/booking-validate")
    suspend fun validateBooking(
            @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<DataModel>

    @POST("/app/v1/user/checkin")
    suspend fun checkIn(
            @Header("Authorization") authHeader: String,
            @Body checkInReq: CheckInRequest
    ): Response<ResponseBody>


    @POST("/app/v1/profile")
    suspend fun updateSettings(
            @Header("Authorization") authHeader: String,
            @Body privacy: PrivacySettings
    ): Response<MDUser>


    @DELETE("app/v1/user/cards/{cardId}")
    suspend fun deleteCard(
            @Header("Authorization") authHeader: String,
            @Path("cardId") cardId: Int
    ): Response<MDResponse>


    //Venue Dashboard

    @GET("/app/v1/venue/dashboard")
    suspend fun getVenueDashboard(@Header("Authorization") authHeader: String): Response<VenueDashboardResponse>


    @GET("/app/v1/venue/bar-chart")
    suspend fun getBarChart(@Header("Authorization") authHeader: String): Response<BarChartResponse>

    @GET("/app/v1/venue/pie-chart")
    suspend fun getPieChart(@Header("Authorization") authHeader: String): Response<PieChartResponse>


    @GET("/app/v1/venue/revenue-duration/stats")
    suspend fun getSingleVenueRevenue(@Header("Authorization") value: String, @Query("filter") filter:
    String, @Query("venue_id") venue_id: Int): Response<VenueDurationResponse>

    @GET("/app/v1/venue/revenue-duration/stats")
    suspend fun getAllVenueRevenue(@Header("Authorization") value: String, @Query("filter") filter: String): Response<VenueDurationResponse>

    @GET("/app/v1/user/suggestedprice/{venueId}")
    suspend fun getSuggestedPrice(@Path("venueId") venueId: Int): Response<SuggestedPriceResponse>


    @Multipart
    @POST("/app/v1/user/checkin")
    suspend fun autoCheckIn(@Header("Authorization") value: String, @Part("venue_id") venue_id:
    Int): Response<AutoCheckinResponse>

    @Multipart
    @POST("/app/v1/user/contacts")
    suspend fun addContacts(
            @Header(
                    "Authorization"
            ) value: String, @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<ContactList>

    @Multipart
    @GET("/app/v1/user/contacts")
    suspend fun getContacts(
            @Header(
                    "Authorization"
            ) value: String, @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<ContactList>

    @GET("/app/v1/user/contacts/{teamId}")
    suspend fun getContacts(
            @Header("Authorization") value: String,
            @Path("teamId") teamId: Int
    ): Response<ContactList>

    @POST("/app/v1/user/purchase-credits")
    suspend fun purchaseCredits(
            @Header("Authorization") authHeader: String,
            @Body request: purchaseCreditRequest
    ): Response<PlanModel>

    @POST("/app/v1/user/bookings")
    suspend fun createBookingEmployee(
            @Header("Authorization") authHeader: String,
            @Body request: createBookingEmployeeRequest
    ): Response<BookingData>

    @POST("/app/v1/user/bookings/{bookingId}")
    suspend fun editBookingPersonal(
            @Header("Authorization") authHeader: String,
            @Path("bookingId") bookingId: String,
            @Body request: editBookingPersonalRequest
    ): Response<EditBooking>

    @POST("/app/v1/user/bookings/{bookingId}")
    suspend fun editBookingEmployee(
            @Header("Authorization") authHeader: String,
            @Path("bookingId") bookingId: String,
            @Body request: editBookingEmployeeRequest
    ): Response<EditBooking>

    @POST("/app/v1/user/bookings")
    suspend fun createBookingPersonal(
            @Header("Authorization") authHeader: String,
            @Body request: createBookingPersonalRequest
    ): Response<com.droid.dorpee.ui.venuedashboard.model.DataClass>

    @GET("/app/v1/customer/my-employers")
    suspend fun getEmploeeList(@Header("Authorization") authHeader: String): Response<List<EmployeeList>>

    @GET("/app/v1/user/transactions")
    suspend fun getTransactions(@Header("Authorization") authHeader: String): Response<TransactionResponse>

    @GET("/app/v1/user/blocked-spaces/{spaceId}")
    suspend fun getBlockedSpaces(@Header("Authorization") value: String, @Path("spaceId") spaceId: Int): Response<BlockedSpaceResponse>

    @POST("/app/v1/user/blocked-spaces")
    suspend fun updateBlockedSpaces(@Header("Authorization") value: String, @Body request: DataBlocked): Response<BlockedSpaceResponse>

    @Multipart
    @POST("/app/v1/profile")
    suspend fun updatePaymentDetailsVenue(
            @Header(
                    "Authorization"
            ) value: String, @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>
    ): Response<PaymentProfileResponse>

    @GET("/app/v1/profile")
    suspend fun getProfile(@Header("Authorization") value: String):
            Response<PaymentProfileResponse>


    @POST("/app/v1/profile")
    suspend fun editProfileCustomer(
            @Header("Authorization") authHeader: String,
            @Body request: editPersonalProfile
    ): Response<LoginResponse>

    @Multipart
    @POST("/app/v1/profile")
    suspend fun editProfileCustomers
            (@Header("Authorization") authHeader: String,
             @Part image: MultipartBody.Part?,
             @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>): Response<EditProfileData>


    @GET("mobikulhttp/catalog/homepagedata")
    suspend fun getPP(@Header("authKey") value: String,@Query ("storeId") storeId :String):
            Response<JsonObject>
}
