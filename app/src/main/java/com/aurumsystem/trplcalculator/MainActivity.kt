package com.aurumsystem.trplcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var N1 = findViewById<EditText>(R.id.edtBil1)
        var N2 = findViewById<EditText>(R.id.edtBil2)
        var Hasil = findViewById<TextView>(R.id.txtHasil)
        var Tambah = findViewById<Button>(R.id.btnTambah)
        var Kali = findViewById<Button>(R.id.btnKali)
        var Kurang = findViewById<Button>(R.id.btnKurang)
        var Bagi = findViewById<Button>(R.id.btnBagi)

        Tambah.setOnClickListener {
            var HasilTambah = N1.text.toString().toDouble() + N2.text.toString().toDouble()
            Hasil.text = HasilTambah.toString();
            Toast.makeText(this@MainActivity,"Hasil : " + Hasil.text, Toast.LENGTH_LONG).show()
        }
        Kali.setOnClickListener {
            var HasilKali = N1.text.toString().toDouble() * N2.text.toString().toDouble()
            Hasil.text = HasilKali.toString();
        }

        Kurang.setOnClickListener {

            var HasilKurang = N1.text.toString().toDouble() - N2.text.toString().toDouble()
            Hasil.text = HasilKurang.toString();
        }
        Bagi.setOnClickListener {
            var HasilBagi = N1.text.toString().toDouble() / N2.text.toString().toDouble()
            Hasil.text = HasilBagi.toString();
        }
    }
}