package com.aditya.testing

class FakeMilkForther : MilkForther {

    val getMilkLogic: () -> String = { " Hot Milk" }

    override fun getMilk(): String = getMilkLogic()

}