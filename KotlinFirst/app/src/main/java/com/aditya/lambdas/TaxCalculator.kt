package com.aditya.lambdas

class TaxCalculator {
    fun findTax() {
        println(200.0.calculateTax(0.065))
    }

    val calculator: (Double, Double) -> Double = { price, taxRatio ->
        price * taxRatio
    }

    val calculateTax: Double.(Double) -> Double = {taxRatio ->
        taxRatio * this
    }

}

fun main() {
    println(TaxCalculator().calculator(200.0, 0.065))
    println(TaxCalculator().findTax())
}