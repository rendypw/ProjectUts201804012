package com.rendyanto.uts201804012

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class Belanja : AppCompatActivity() {
    private lateinit var rvTanaman: RecyclerView
    private var list: ArrayList<Tanaman> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belanja)

        rvTanaman = findViewById(R.id.rv_gg)
        rvTanaman.setHasFixedSize(true)

        list.addAll(Data_tanaman.lisdata)
        showRecylerViewListMode()
    }
    private fun showRecylerViewListMode(){
        rvTanaman.layoutManager = LinearLayoutManager(this)
        val listTanamanAdapter = ListTanamanAdapter(list)
        rvTanaman.adapter = listTanamanAdapter
    }
}