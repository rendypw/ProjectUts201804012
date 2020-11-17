package com.rendyanto.uts201804012

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tvtampil : TextView = findViewById(R.id.tv_tampil)
        val bundle = intent.extras
        if(bundle != null){
            tvtampil.setText(bundle.getString("data1"))
        }
    }
}