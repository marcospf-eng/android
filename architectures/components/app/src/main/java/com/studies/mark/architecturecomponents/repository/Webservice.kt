package com.studies.mark.architecturecomponents.repository

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface Webservice {

    @GET("api/v1/products")
    fun getProducts() : Call<ResponseBody>

}