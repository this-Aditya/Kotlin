package com.aditya.kotlinfirst.table_management__singleton

//Creating a singleton Manager, which implements the Personal interface

object Manager: Personal {
    override fun manageCustomers() {
        //Manager can manage customers
    }
}