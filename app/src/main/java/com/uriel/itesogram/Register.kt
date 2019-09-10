package com.uriel.itesogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import org.jetbrains.anko.find

class Register : AppCompatActivity() {

    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister = find(R.id.activity_register_btn_register)

        btnRegister.setOnClickListener {
            Toast.makeText(this, "Nice!", Toast.LENGTH_SHORT).show()
        }
    }
}
