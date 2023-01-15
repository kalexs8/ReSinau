package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.alat.ScoreManagerMatematika
import com.example.alat.ScoreManagerPai


class Profile : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val scoreManagerMatematika = ScoreManagerMatematika(requireActivity().applicationContext)
        val scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        val skormatSd = view.findViewById<Button>(R.id.resetMatsd1)


        skormatSd.setOnClickListener {

            scoreManagerMatematika.resetScoreMat()
            scoreManagerPai.resetScorePai()
        }

        return view
    }

}