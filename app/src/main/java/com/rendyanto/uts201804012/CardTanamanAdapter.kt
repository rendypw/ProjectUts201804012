package com.rendyanto.uts201804012

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardTanamanAdapter (private val listTutorial: ArrayList<Tutorial>): RecyclerView.Adapter<CardTanamanAdapter.CardViewHolder>() {
    inner class  CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var logtut: ImageView = itemView.findViewById(R.id.civ_gg)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_tanaman_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTutorial.size
    }

    override fun onBindViewHolder(holder: CardTanamanAdapter.CardViewHolder, position: Int) {
        val tutorial = listTutorial[position]
        Glide.with(holder.itemView.context)
            .load(tutorial.gamtut)
            .apply (RequestOptions().override(500,500))
            .into(holder.logtut)
    }
}