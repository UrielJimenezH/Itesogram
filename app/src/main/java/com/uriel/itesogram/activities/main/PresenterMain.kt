package com.uriel.itesogram.activities.main

import com.parse.ParseObject
import com.parse.ParseQuery

class PresenterMain(private val view: ContractMain.View): ContractMain.Presenter {
    override fun fetchPhotos() {
        val query = ParseQuery.getQuery<ParseObject>("Feed")
        query.findInBackground { photos, e ->
            if (e == null) {
                view.showPhotos(photos)
            } else {
                //Log.d("score", "Error: " + e!!.getMessage())
            }
        }
    }
}