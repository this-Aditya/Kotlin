package com.aditya.aSingletions.waiters_companion_objects

class PriceCalculator {

    fun calculatePrice(item1Price: Double, item2Price: Double, taxRate: Double): Double =
        (item1Price +item2Price) + (1.0 * taxRate)

}