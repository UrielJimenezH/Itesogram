package com.uriel.fragments.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.uriel.fragments.R

class FragmentProfile: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val tvTitle = view.findViewById<TextView>(R.id.fragment_profile_tv_title)
        tvTitle.setOnClickListener {
            Log.d("FRAGMENT PROFILE", "CLICKED ON FRAGMENT PROFILE")
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}