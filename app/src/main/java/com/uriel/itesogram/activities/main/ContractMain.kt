package com.uriel.itesogram.activities.main

import com.parse.ParseObject

interface ContractMain {
    interface View {
        fun showPhotos(photos: List<ParseObject>)
    }

    interface Presenter {
        fun fetchPhotos()
    }
}