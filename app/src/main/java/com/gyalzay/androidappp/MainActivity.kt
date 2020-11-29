package com.gyalzay.androidappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reference / Binding
        val etFirst: EditText = findViewById(R.id.etFirst)
        val etSecond: EditText = findViewById(R.id.etSecond)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val tvResult: TextView = findViewById(R.id.tvResult)

        //Setting click listener on button
        btnCalculate.setOnClickListener{
            val first = etFirst.text.toString().toInt()
            val second = etSecond.text.toString().toInt()
            val result: Int = first + second

            tvResult.text = result.toString()
        }
    }
}