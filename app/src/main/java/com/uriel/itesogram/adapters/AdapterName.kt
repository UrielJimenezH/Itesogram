package com.uriel.itesogram.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uriel.itesogram.R
import org.jetbrains.anko.find

class AdapterName(private val names: ArrayList<HashMap<String, String>>): RecyclerView.Adapter<NameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)

        return NameViewHolder(view)
    }

    override fun getItemCount(): Int = names.size

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind(names[position])
    }
}

class NameViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private var nameTitle: TextView = view.find(R.id.item_title_name)
    private var lastNameTitle: TextView = view.find(R.id.item_title_lastname)

    fun bind(user: HashMap<String, String>) {
        nameTitle.text = user["name"]
        lastNameTitle.text = user["lastname"]
    }
}