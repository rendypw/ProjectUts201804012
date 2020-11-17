package com.rendyanto.uts201804012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        val btnReg: Button = findViewById(R.id.btnReg)

        btnReg.setOnClickListener {
            startActivity(Intent(this,daftar::class.java))
        }
        btnLogin.setOnClickListener {
            startActivity(Intent(this,home::class.java))
        }
    }
}