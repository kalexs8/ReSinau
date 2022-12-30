package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.alat.ScoreManager


class Profile : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val scoreManager = ScoreManager(requireActivity().applicationContext)
        val skormatSd = view.findViewById<Button>(R.id.resetMatsd1)


        skormatSd.setOnClickListener {

            scoreManager.resetScore()
        }

        return view
    }

}