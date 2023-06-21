package com.aditya.kotlinfirst.waiters_companion_objects

import com.aditya.kotlinfirst.table_management__singleton.Personal

class Waiter: Personal {
    private var id: Int = 1
    var name: String = ""
    override fun manageCustomers() {
        //Waiter can manage customers
    }

    companion object {
        val hotelName: String = "The Grand Budapest Hotel"
        val hotelAddress: String = "123, ABC Street, XYZ City"
    }
}