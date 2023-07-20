package com.aditya.collection_processing

data class Dish(val name: String, val ingredients: Set<String>)


fun main() {
    val dishes = listOf(
        Dish("Pizza", setOf("FLour", "Sauce", "Cheese")),
        Dish("Pasta", setOf("Pasta", "Oil", "Cheese")),
        Dish("Maggie", setOf("Maggie", "Water", "Oil")),
        Dish("Juice", setOf("Orange"))
    )

    val allIngredients = dishes.fold(mutableSetOf()) { acc: MutableSet<String>, dish: Dish ->
        acc.apply {
            addAll(dish.ingredients)
        }
    }

    val easyDishes = dishes.filter { it.ingredients.size  <= 3 }
        .map { "${it.name} -> ${it.ingredients.size}" }

    println(easyDishes)

//    println(allIngredients)
}
