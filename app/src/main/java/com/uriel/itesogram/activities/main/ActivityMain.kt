package com.uriel.itesogram.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.parse.ParseObject
import com.uriel.itesogram.R
import com.uriel.itesogram.adapters.AdapterPhoto
import org.jetbrains.anko.find

class ActivityMain: AppCompatActivity(), ContractMain.View {

    private lateinit var rvPhotos: RecyclerView
    private val presenter = PresenterMain(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPhotos = find(R.id.activity_main_rv_photos)
        presenter.fetchPhotos()

        /*val rvNames = find<RecyclerView>(R.id.activity_main_rv_names)
        val names = arrayListOf<HashMap<String, String>>()
        names.add(HashMap())
        names[0]["name"] = "Carlos"
        names[0]["lastname"] = "Perez"
        names.add(HashMap())
        names[0]["name"] = "Luis"
        names[0]["lastname"] = "Perez"
        rvNames.adapter = AdapterName(names)
        rvNames.layoutManager = LinearLayoutManager(this)*/
    }

    override fun showPhotos(photos: List<ParseObject>) {
        rvPhotos.adapter = AdapterPhoto(photos)
        rvPhotos.layoutManager = LinearLayoutManager(this)
    }
}
