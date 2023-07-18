package com.aditya.testing_mocks.products

data class Product(
    val title: String,
    val price: Int,
    val amount: Int
) {
    fun applyDiscount(discountPercent: Int ): Int {
        if (amount in 1..5) {
            return price * discountPercent / 100
        }
        return price
    }
}