package com.aditya.generics

sealed class Ingredient {
    object cheese : Ingredient()
    object flour : Ingredient()
    object egg : Ingredient()
    object onion : Ingredient()
}
