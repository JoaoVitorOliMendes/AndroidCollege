package com.example.animaislista

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalRecyclerViewAdapter(val context: Context, val list: ArrayList<Animal>)
    : RecyclerView.Adapter<AnimalRecyclerViewAdapter.ViewHold>() {

    class ViewHold(view: View): RecyclerView.ViewHolder(view) {
        val lblAnimal = view.findViewById<TextView>(R.id.lblAnimal)
        val lblRaca = view.findViewById<TextView>(R.id.lblRaca)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHold {
        val view = LayoutInflater.from(context).inflate(R.layout.animais_row, parent, false)
        return ViewHold(view)
    }

    override fun onBindViewHolder(holder: ViewHold, position: Int) {
        val animal = list.get(position);
        holder?.lblAnimal?.text = animal.nome;
        holder?.lblRaca?.text = animal.raca;
    }

    override fun getItemCount(): Int {
        return list.size
    }
}