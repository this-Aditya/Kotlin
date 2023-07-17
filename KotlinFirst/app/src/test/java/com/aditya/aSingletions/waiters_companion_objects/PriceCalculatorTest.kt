package com.aditya.aSingletions.waiters_companion_objects

import org.junit.Test
import org.junit.Assert.*

class PriceCalculatorTest {

    val priceCalculator = PriceCalculator()
    @Test
    fun `validate price`() {
        val result = priceCalculator.calculatePrice(
            item1Price = 3.00,
            item2Price = 5.00,
            taxRate = .20
        )
        assertEquals(8.20001, result, 0.001)
    }
}