package com.rendyanto.uts201804012

import java.util.ArrayList

object Data_Perawatan {
    private val gmbrtutor = intArrayOf(R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4)

    val lisdata: ArrayList<Tutorial>
        get() {
            val listtutor = arrayListOf<Tutorial>()
            for (position in gmbrtutor.indices){
                val tutorial = Tutorial()
                tutorial.gamtut = gmbrtutor[position]
                listtutor.add(tutorial)
            }
            return listtutor
        }
}