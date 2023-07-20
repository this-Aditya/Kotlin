package com.aditya.collection_processing

data class OrderItem(
    val name: String,
    val amount: Int,
    val quantity: Int
)

val orderItemList = listOf(
    OrderItem("Burger", 6, 2),
    OrderItem("Fries", 2, 1),
    OrderItem("Soda", 3, 3)
)

fun main() {
    val amt = orderItemList.fold(0) { totalAmount, orderItem ->
        totalAmount + (orderItem.amount * orderItem.quantity)
    }
    println(amt)
}
