package com.aditya.bCompanionObjects

class Orders(val amountBeforeTax: Int) {

    companion object {
        const val TAX_PRECENTAGE = 5
        fun getNetOrderAmount(orderAmount: Int): Double =
            orderAmount + orderAmount * .5
    }
}