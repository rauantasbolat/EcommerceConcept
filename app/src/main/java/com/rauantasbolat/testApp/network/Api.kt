package com.rauantasbolat.testApp.network

import com.rauantasbolat.testApp.responses.BasketResponse
import com.rauantasbolat.testApp.responses.HomePageResponse
import com.rauantasbolat.testApp.responses.ProductDetailResponse
import retrofit2.Call
import retrofit2.http.GET


interface Api {

    @GET("/654bd15e-b121-49ba-a588-960956b15175")
    fun getHomeProducts() : Call<HomePageResponse>

    @GET("/6c14c560-15c6-4248-b9d2-b4508df7d4f5")
    fun getProductDetails() : Call<ProductDetailResponse>

    @GET("/53539a72-3c5f-4f30-bbb1-6ca10d42c149")
    fun getBasket() : Call<BasketResponse>



}