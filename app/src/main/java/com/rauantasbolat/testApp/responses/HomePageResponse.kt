package com.rauantasbolat.testApp.responses

import com.google.gson.annotations.SerializedName
import com.rauantasbolat.testApp.model.BestSeller
import com.rauantasbolat.testApp.model.HomeStore

data class HomePageResponse(
    @SerializedName("best_seller") val best_seller: List<BestSeller>,
    @SerializedName("home_store") val home_store: List<HomeStore>

)



