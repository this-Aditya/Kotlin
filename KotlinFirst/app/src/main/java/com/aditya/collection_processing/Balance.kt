package com.aditya.collection_processing

import com.aditya.bCompanionObjects.Orders

class Balance(private val balance: Double) {

    fun balanceAfterOrders(orders: Collection<Double>) =
        orders.fold(balance) { accumulator: Double, element: Double ->
            accumulator + element
        }
    }



fun main() {
    val balance = Balance(140.0)
        .balanceAfterOrders(listOf(20.0, 15.0, 30.50))
    println(balance)
}