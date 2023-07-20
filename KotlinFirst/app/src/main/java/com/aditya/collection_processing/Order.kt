package com.aditya.collection_processing

data class Order(
    val orderId: Int,
    val month: String,
    val amount: Int
)
val orderList = listOf(
    Order(1, "August", 40),
Order(2, "August", 27),
Order(3, "September", 44),
Order(4, "September", 57),
Order(5, "October", 38),
)

fun main() {
    println( orderList.filter { it.month == "August" }
        .map { it.amount * 0.075 }
        .fold(0.0) { acc, tax ->
            acc + tax
        })
}