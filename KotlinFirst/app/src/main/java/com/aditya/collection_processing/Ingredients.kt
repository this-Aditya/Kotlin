package com.aditya.collection_processing

data class Ingredient(
    val name: String,
    val stockUnits: Int
)

fun main(){
    val ingredientList = listOf(
        Ingredient("Olive Oil", 7),
        Ingredient("Wheat", 3),
        Ingredient("Soda", 10),
        Ingredient("Egg", 0),
        Ingredient("Yeast", 2)
    )

    val outOfStockIngredients  = ingredientList.filter {
        it.stockUnits <=5
    }
    println(outOfStockIngredients)
}



