package com.rendyanto.uts201804012

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity3 : AppCompatActivity() {
    private lateinit var rvTutorial: RecyclerView
    private var list: ArrayList<Tutorial> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        rvTutorial = findViewById(R.id.rv_gg)
        rvTutorial.setHasFixedSize(true)

        list.addAll(Data_Perawatan.lisdata)
        //showRecylerViewListMode()
        showRecylerViewCardMode()
    }
    private fun showRecylerViewCardMode(){
        rvTutorial.layoutManager = LinearLayoutManager(this)
        val CardTanamanAdapter = CardTanamanAdapter(list)
        rvTutorial.adapter = CardTanamanAdapter
    }
}