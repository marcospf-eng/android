package com.studies.mark.architecturecomponents.repository

import com.studies.mark.architecturecomponents.AppConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebserviceManager {

    fun getWebservice() : Webservice {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(AppConstants.REMOTE_SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit.create(Webservice::class.java)
    }

}