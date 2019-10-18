package com.uriel.itesogram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.uriel.itesogram.R
import com.uriel.itesogram.activities.main.ActivityMain
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class ActivityLogin : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLogin: Button


    private lateinit var tvRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        bindViews()
        setListeners()
    }

    private fun bindViews() {
        btnLogin = find(R.id.activity_login_btn_login)
        tvRegister = find(R.id.activity_login_tv_register)
    }

    private fun setListeners() {
        btnLogin.setOnClickListener(this)
        tvRegister.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            btnLogin.id -> {
                //startActivity<SaveInParse>()
                startActivity<ActivityMain>()
            } tvRegister.id -> {
                startActivity<ActivityRegister>()
            }
        }
    }
}
