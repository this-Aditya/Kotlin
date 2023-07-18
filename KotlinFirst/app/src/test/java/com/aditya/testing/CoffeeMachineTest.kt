package com.aditya.testing

import org.junit.Assert.*
import org.junit.Test

class CoffeeMachineTest {

    private val milkForther = FakeMilkForther()

    private val classUnderTest = CoffeeMachine(milkForther)

    lateinit var coffee: String

    @Test
    fun testCoffee(){
        coffee = classUnderTest.makeCoffee()
    assertEquals(coffee, "Coffee with Hot Milk")
    }


}