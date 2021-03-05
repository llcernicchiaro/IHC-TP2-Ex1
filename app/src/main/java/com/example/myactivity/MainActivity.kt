package com.example.myactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

var number1: EditText? = null
var number2: EditText? = null
var button: Button? = null
var result: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1= findViewById(R.id.number1);
        number2= findViewById(R.id.number2);
        button= findViewById(R.id.button);
        result =  findViewById(R.id.result);

        button!!.setOnClickListener() {
            var value1 = findViewById<EditText>(R.id.number1);
            var value2 = findViewById<EditText>(R.id.number2);

            var result = value1.text.toString().toInt() + value2.text.toString()?.toInt();
            val resultText = findViewById<TextView>(R.id.result);
            resultText.text = result.toString();
        }
    }
}
