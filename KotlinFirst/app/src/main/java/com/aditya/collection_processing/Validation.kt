package com.aditya.collection_processing

fun main() {
mapToDiscounted()
}

    val orderAmount = 134

    val discountCoupons = listOf(
        DiscountCoupon(10, 150),
        DiscountCoupon(5, 75),
        DiscountCoupon(8, 100),
        DiscountCoupon(6, 90)
    )


fun mapToDiscounted() {
    val validOffer =    discountCoupons.filter { it.minOrderAmount <= orderAmount }
            .map { orderAmount - it.percentage * .01 * orderAmount }
    println(validOffer)
}