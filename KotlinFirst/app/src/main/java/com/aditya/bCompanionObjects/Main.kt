package com.aditya.bCompanionObjects

    fun main() {
        val order = Orders(500)
        val netOrder = Orders.getNetOrderAmount(order.amountBeforeTax)
        println(netOrder)
    }

