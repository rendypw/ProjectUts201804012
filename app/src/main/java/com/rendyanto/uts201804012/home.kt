package com.rendyanto.uts201804012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val btnBelanja: Button = findViewById(R.id.btnbelanja)
        val btnProfil: Button = findViewById(R.id.btnprofil)
        val btnPrwtn: Button = findViewById(R.id.btnperawatan)
        btnBelanja.setOnClickListener {
            startActivity(Intent(this,Belanja::class.java))
        }
        btnProfil.setOnClickListener {
            startActivity(Intent(this,Profil::class.java))
        }
        btnPrwtn.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
    }
}