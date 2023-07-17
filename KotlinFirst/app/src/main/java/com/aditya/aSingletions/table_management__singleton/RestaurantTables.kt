package com.aditya.kotlinfirst.table_management__singleton

object RestaurantTables{

    val customers: MutableList<String> = mutableListOf()

    fun addCustomer(customerName: String){
        customers.add(customerName)
    }

    fun removeCustomer(customerName: String){
        customers.remove(customerName)
    }
}