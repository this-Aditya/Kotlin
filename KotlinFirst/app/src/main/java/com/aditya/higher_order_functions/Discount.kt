package com.aditya.higher_order_functions

import kotlin.random.Random

inline fun repeat(times: Int, action: (Int) -> Unit) {
    for (i in 1..times) {
        action(i)
    }
}

fun main() {
    var maxDiscount = 0
    repeat(3) { repetition ->
        val discount = Random.nextInt(10)
        println("Attempt $repetition, discount: $discount")
        maxDiscount = discount.takeIf { it > maxDiscount } ?: maxDiscount
    }
    println("Max Discount: $maxDiscount")
}
