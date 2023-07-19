package com.aditya.lambdas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.CompoundButton
import android.widget.Toast
import com.aditya.kotlinfirst.R
import com.aditya.kotlinfirst.databinding.ActivityLambdaBinding

class LambdaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLambdaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLambdaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { showToast("Button Clicked ") }
        /*  Above code is being updated from this one
                binding.button.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                showToast("Button Clicked ")
            }
        })
         */

        binding.checkBox.setOnCheckedChangeListener { _, isChecked -> showToast("Is Button Checked -> $isChecked") }
        /*
                binding.checkBox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                TODO("Not yet implemented")
            }
        })
         */
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}