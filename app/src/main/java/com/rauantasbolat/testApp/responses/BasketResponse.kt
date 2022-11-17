package com.rauantasbolat.testApp.responses

import com.rauantasbolat.testApp.model.Basket

data class BasketResponse(
    val basket: List<Basket>,
    val delivery: String,
    val id: String,
    val total: Int
)

