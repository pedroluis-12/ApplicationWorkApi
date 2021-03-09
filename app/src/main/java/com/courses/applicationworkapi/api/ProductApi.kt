package com.courses.applicationworkapi.api

import com.courses.applicationworkapi.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {

    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}