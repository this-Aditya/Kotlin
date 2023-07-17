package com.aditya.extensions

class Dish(
    val dishName: String,
    val ingredients: MutableList<String>
)

fun Dish.printIngredients() {
    println(ingredients)
}

fun Dish.removeSalt() {
    ingredients.remove("Cheese")
}

fun main() {
    val onionSoup = Dish("Onion Soup", mutableListOf("Onion", "Cheese", "Water", "Salt"))
    onionSoup.removeSalt()
    onionSoup.printIngredients()
}

