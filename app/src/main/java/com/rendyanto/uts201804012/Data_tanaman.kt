package com.rendyanto.uts201804012

import java.util.ArrayList

object Data_tanaman {
    private val kodebarang = arrayOf(
        "T101",
        "T102",
        "T103",
        "T104",
        "T105",
        "T106",
        "T107",
        "T108",
        "T109",
        "T110",
        "T111",
        "T112",
        "T113",
        "T114",
        "T115",
        "T116",
        "T117",
        "T118",
        "T119",
        "T120")
    private val hrgatnmn =  arrayOf(
        "Rp.20000",
        "Rp.30000",
        "Rp.35000",
        "Rp.26000",
        "Rp.15000",
        "Rp.40000",
        "Rp.30000",
        "Rp.10000",
        "Rp.15000",
        "Rp.25000",
        "Rp.45000",
        "Rp.35000",
        "Rp.20000",
        "Rp.10000",
        "Rp.25000",
        "Rp.30000",
        "Rp.35000",
        "Rp.20000",
        "Rp.15000",
        "Rp.20000")
    private val ukurantnmn = arrayOf(
        "10",
        "8",
        "10",
        "12",
        "10",
        "10",
        "12",
        "12",
        "10",
        "8",
        "10",
        "12",
        "8",
        "12",
        "12",
        "8",
        "10",
        "10",
        "8",
        "12")
    private val jnstnmn = arrayOf(
        "kaktus",
        "kaktus",
        "kaktus",
        "kaktus",
        "skulen",
        "kaktus",
        "skulen",
        "kaktus",
        "bunga",
        "skulen",
        "kaktus",
        "skulen",
        "kaktus",
        "kaktus",
        "kaktus",
        "bunga",
        "bunga",
        "kaktus",
        "skulen",
        "kaktus")
    private val gmbrtnmn = intArrayOf(R.drawable.g1,R.drawable.g2,R.drawable.g3,R.drawable.g4,R.drawable.g5,R.drawable.g6, R.drawable.g7, R.drawable.g8, R.drawable.g9, R.drawable.g10, R.drawable.g11, R.drawable.g12, R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18, R.drawable.g19, R.drawable.g20)
    val lisdata: ArrayList<Tanaman>
        get() {
            val listtanaman = arrayListOf<Tanaman>()
            for (position in kodebarang.indices){
                val tanaman = Tanaman()
                tanaman.kodebrg = kodebarang[position]
                tanaman.ukuran = ukurantnmn[position]
                tanaman.jenis = jnstnmn[position]
                tanaman.harga = hrgatnmn[position]
                tanaman.logo = gmbrtnmn[position]
                listtanaman.add(tanaman)
            }
            return listtanaman
        }
}