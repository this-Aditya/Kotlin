package com.aditya.generics

import com.aditya.generics.Ingredient.*

fun main() {
    val cheeseInventory = Inventory.newInventory<cheese>()
    cheeseInventory.addIngredient(cheese)
    cheeseInventory.addIngredient(cheese)
    println(cheeseInventory.count())
}