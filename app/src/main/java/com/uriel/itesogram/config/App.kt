package com.uriel.itesogram.config

import com.parse.Parse
import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("v1kx8QckHwFoOhVF6JqOIkY77Y3ancPhksQnt4k6")
                // if defined
                .clientKey("fVER38fcRHHMHtrS10xq8BnTAsQdrDKvoXSR3maP")
                .server("https://parseapi.back4app.com/")
                .build()
        )
    }
}