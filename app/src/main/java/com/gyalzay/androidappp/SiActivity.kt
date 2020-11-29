package com.gyalzay.androidappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        //Reference _ Binding
        val etPrincipal: EditText = findViewById(R.id.etPrincipal)
        val etRate: EditText = findViewById(R.id.etRate)
        val etTime: EditText = findViewById(R.id.etTime)
        val btnCalculateSI: Button = findViewById(R.id.btnCalcuateSI)
        val tvDisplay: TextView = findViewById(R.id.tvDisplay)

        //Setting Click Listener on Button
        btnCalculateSI.setOnClickListener{
            val Principal = etPrincipal.text.toString().toFloat()
            val Rate = etRate.text.toString().toFloat()
            val Time = etTime.text.toString().toFloat()

            val SI: Float = (Principal * Rate * Time) / 100

            tvDisplay.text = SI.toString()
        }
    }
}