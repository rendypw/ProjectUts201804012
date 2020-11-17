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

class ListTanamanAdapter (private val listTanaman: ArrayList<Tanaman>): RecyclerView.Adapter<ListTanamanAdapter.ListViewHolder>() {
    inner class  ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvkode: TextView = itemView.findViewById(R.id.tv_kode)
        var tvharga: TextView = itemView.findViewById(R.id.tv_harga)
        var tvjenis: TextView = itemView.findViewById(R.id.tv_jenis)
        var tvukuran: TextView = itemView.findViewById(R.id.tv_ukuran)
        var ivlogo: ImageView = itemView.findViewById(R.id.civ_gg)
        var btnpindah: Button = itemView.findViewById(R.id.btnkrj)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListTanamanAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_gg, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTanaman.size
    }

    override fun onBindViewHolder(holder: ListTanamanAdapter.ListViewHolder, position: Int) {
        val tanaman = listTanaman[position]
        Glide.with(holder.itemView.context)
            .load(tanaman.logo)
            .apply (RequestOptions().override(60,60))
            .into(holder.ivlogo)
        holder.tvkode.text = tanaman.kodebrg
        holder.tvukuran.text = tanaman.ukuran
        holder.tvjenis.text = tanaman.jenis
        holder.tvharga.text = tanaman.harga
        holder.btnpindah.setOnClickListener{
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("data1", tanaman.harga)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)
    }
}}