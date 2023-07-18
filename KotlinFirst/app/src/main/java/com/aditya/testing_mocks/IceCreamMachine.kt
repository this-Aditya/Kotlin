package com.aditya.testing_mocks

class IceCreamMachine (
    private val engine: Engine
        ) {

    fun powerUp() {
        engine.powerUp()
    }

    fun getVoltage(): String{
        val volt = engine.getVoltage()
    return volt
    }
}