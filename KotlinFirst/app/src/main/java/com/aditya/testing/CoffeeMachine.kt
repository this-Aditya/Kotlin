package com.aditya.testing

class CoffeeMachine(
    private val milkForther: MilkForther
) {

    fun makeCoffee(): String {
        return "Coffee with${milkForther.getMilk()}"
    }
}