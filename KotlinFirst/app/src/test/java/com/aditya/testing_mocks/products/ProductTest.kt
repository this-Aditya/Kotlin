package com.aditya.testing_mocks.products

import org.junit.Test
import org.junit.Assert.*

class ProductTest {
    val spaghetti = Product("spaghetti", 20, 3)
    val pasta = Product("pasta", 30, 8)
    val lasanga = Product("lasanga", 30, 0)

    @Test
    fun `apply discount on spaghetti` () {
        val newPrice = spaghetti.applyDiscount(3)
        assertNotEquals(spaghetti.price, newPrice)
    }
    @Test
    fun `apply discount on pasta` () {
        val newPrice = pasta.applyDiscount(3)
        assertEquals(pasta.price, newPrice)
    }
    @Test
    fun `apply discount on lasanga` () {
        val newPrice = lasanga.applyDiscount(3)
        assertEquals(lasanga.price, newPrice)
    }

}