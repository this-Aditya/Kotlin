package com.aditya.generics

fun main() {
    val cheeseInventory = Inventory.newInventory<Ingredient.cheese>()
    cheeseInventory.addIngredient(Ingredient.cheese)
    cheeseInventory.addIngredient(Ingredient.cheese)
    println(cheeseInventory.count())
}