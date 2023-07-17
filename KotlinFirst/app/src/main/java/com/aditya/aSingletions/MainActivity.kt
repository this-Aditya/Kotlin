package com.aditya.aSingletions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.kotlinfirst.R
import com.aditya.kotlinfirst.waiters_companion_objects.Waiter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ACCESING THE SINGLETON OBJECT
       /* RestaurantTables.addCustomer("Aditya")
        RestaurantTables.addCustomer("Rahul")
        RestaurantTables.addCustomer("Rohit")
        RestaurantTables.addCustomer("Raj")
*/
        // Accesing the Companion object
        // Companion objects are accessed by using the class name as the qualifier it is similar
        // to static in java. If you want to read more about companion objects, you can read documen
        // provided in documentation folder of this repository
//         Waiter.hotelName
//         Waiter.hotelAddress

    }
}