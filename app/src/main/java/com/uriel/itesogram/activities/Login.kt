package com.uriel.itesogram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.uriel.itesogram.R
import com.uriel.itesogram.Register
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class Login : AppCompatActivity() {

    private lateinit var btnLogin: Button


    private lateinit var tvRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnLogin = find(R.id.activity_login_btn_login)
        tvRegister = find(R.id.activity_login_tv_register)

        btnLogin.setOnClickListener {
            startActivity<SaveInParse>()
        }

        tvRegister.setOnClickListener {
            startActivity<Register>()
        }
    }
}
