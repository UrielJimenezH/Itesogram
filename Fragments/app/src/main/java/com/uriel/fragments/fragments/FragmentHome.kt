package com.uriel.fragments.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.uriel.fragments.R

class FragmentHome: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val tvTitle = view.findViewById<TextView>(R.id.fragment_home_tv_title)
        tvTitle.setOnClickListener {
            Log.d("FRAGMENT HOME", "CLICKED ON FRAGMENT HOME")
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}