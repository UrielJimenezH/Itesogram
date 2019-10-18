package com.uriel.fragments.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.uriel.fragments.R

class FragmentSearch: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        val tvTitle = view.findViewById<TextView>(R.id.fragment_search_tv_title)
        tvTitle.setOnClickListener {
            Log.d("FRAGMENT SEARCH", "CLICKED ON FRAGMENT SEARCH")
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}