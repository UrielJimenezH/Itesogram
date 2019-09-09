package com.uriel.itesogram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.uriel.itesogram.R
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class Login : AppCompatActivity() {

    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnLogin = find(R.id.activity_login_btn_login)

        btnLogin.setOnClickListener {
            startActivity<SaveInParse>()
        }
    }
}
