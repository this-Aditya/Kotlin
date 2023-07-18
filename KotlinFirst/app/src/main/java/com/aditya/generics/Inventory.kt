package com.aditya.generics

class Inventory<INGREDIENT: Ingredient> {

    val contents: MutableList<INGREDIENT> = mutableListOf()

    fun addIngredient(ingredient: INGREDIENT) = contents.add(ingredient)

    fun count() = contents.size

    companion object {
        fun<INGREDIENT: Ingredient> newInventory() = Inventory<INGREDIENT>()
    }
}
