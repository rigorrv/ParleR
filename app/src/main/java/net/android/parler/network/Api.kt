package net.android.parler.network

import net.android.parler.model.JsonData
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("data.json")
    fun getJson(): Call<JsonData>
}