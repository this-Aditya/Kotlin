package com.aditya.aSingletions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.kotlinfirst.R
import com.aditya.kotlinfirst.table_management__singleton.RestaurantTables

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        // Removing the customer from singleton
        RestaurantTables.removeCustomer("Rohit")
        RestaurantTables.removeCustomer("Raj")
    }
}