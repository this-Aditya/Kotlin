package com.aditya.collection_processing

class Menu {

    val items = listOf<MenuItem>(
        MenuItem("Pizza", 200.0),
        MenuItem("Pasta", 180.0),
        MenuItem("Sandwich", 160.0),
    )

    fun printDiscounrtedMenu(discount: Double) {
        items.forEach {
            println( it.copy(
                price = it.price * (1- discount)
            )   )
        }
    }

    fun mapMenuToNames(): List<String> {
        return items.map { it.name }
    }

    data class MenuItem(val name: String, val price: Double)
}