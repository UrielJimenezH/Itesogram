package com.uriel.fragments.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.uriel.fragments.R
import com.uriel.fragments.fragments.FragmentHome
import com.uriel.fragments.fragments.FragmentSearch

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation = findViewById<BottomNavigationView>(R.id.activity_main_btm_navigation)
        navigation.setOnNavigationItemSelectedListener(this)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_main_fl_main_content, FragmentHome())
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val fragment = when(item.itemId) {
            R.id.action_home -> {
                FragmentHome()
            } R.id.action_search -> {
                FragmentSearch()
            } R.id.action_profile -> {
                //FragmentProfile()
            } else -> {
                null
            }
        }


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_main_fl_main_content, fragment)
            .commit()
        return true
    }
}
