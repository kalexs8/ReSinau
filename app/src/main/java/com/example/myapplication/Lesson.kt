package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView



class Lesson : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_lesson, container, false)


        val materisd: Button = view.findViewById(R.id.jenjangSD)
        val materismp: Button = view.findViewById(R.id.jenjangSMP)
        val materisma: Button = view.findViewById(R.id.jenjangSMA)
        val changeLog: TextView = view.findViewById(R.id.changeLog)
        changeLog.text = getString(R.string.changelog)





        materisd.setOnClickListener {
            val intent = Intent(context, MateriSd::class.java)
            startActivity(intent)
        }

        return view

    }
}