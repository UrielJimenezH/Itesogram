package com.uriel.itesogram.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.parse.ParseFile
import com.parse.ParseObject
import com.uriel.itesogram.R
import org.jetbrains.anko.find
import java.io.File

class AdapterPhoto(private val photos: List<ParseObject>): RecyclerView.Adapter<PhotoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return PhotoViewHolder(view)
    }

    override fun getItemCount(): Int = photos.size

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bindView(photos[position])
    }
}

class PhotoViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    private val tvUsername = view.find<TextView>(R.id.item_photo_tv_username)
    private val ivPhoto = view.find<ImageView>(R.id.item_photo_iv_photo)
    private val tvLikes = view.find<TextView>(R.id.item_photo_tv_likes)

    fun bindView(photo: ParseObject) {
        tvUsername.text = photo["username"].toString()
        Glide
            .with(view.context)
            .load((photo["photo"] as ParseFile).url)
            .into(ivPhoto)
        tvLikes.text = "${photo["commentsNumber"].toString()} likes"
    }
}