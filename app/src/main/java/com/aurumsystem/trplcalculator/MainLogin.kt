package com.aurumsystem.trplcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var TRPL = findViewById<CheckBox>(R.id.ckTRPL)

        TRPL.setOnClickListener{
            if(TRPL.isChecked){
                Toast.makeText(this@MainLogin,"TRPL Dipilih", Toast.LENGTH_LONG).show()
            }
        }
    }
}