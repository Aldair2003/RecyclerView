package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val edadbreper =  view.findViewById<TextView>(R.id.tvedad)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)
    val ciudadper = view.findViewById<TextView>(R.id.tvciudad)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.nombre
        edadbreper.text = infoModel.edad.toString()
        ciudadper.text = infoModel.ciudad

        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}