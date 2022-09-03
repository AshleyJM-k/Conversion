package com.cis.conversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }//end onCreate lifecycle method. Main


    //convert currency function
    fun convertCurrency(view : View) {
        val dollarText = findViewById<EditText>(R.id.dollarText)//create variable to ref dollarText.
        var outputTV = findViewById<TextView>(R.id.outputTV)
        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()
            val euroValue = dollarValue * 0.85f
            outputTV.text = euroValue.toString()
        }
        else {
            outputTV.text = getString(R.string.no_value_string);
        }//end convertCurrency

    }
}//end MainActivity XML
