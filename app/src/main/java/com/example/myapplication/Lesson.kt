package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Lesson.newInstance] factory method to
 * create an instance of this fragment.
 */
class Lesson : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_lesson, container, false)

        val agamaIslam: TextView = view.findViewById(R.id.agama)
        val agamaIslamSD: TextView = view.findViewById(R.id.AgamaSD)
        val agamaIslamSMP: TextView = view.findViewById(R.id.AgamaSMP)
        val agamaIslamSMA: TextView = view.findViewById(R.id.AgamaSMA)
        val matematika: TextView = view.findViewById(R.id.matematika)
        val matSD: TextView = view.findViewById(R.id.MatSD)
        val matSMP: TextView = view.findViewById(R.id.MatSMP)
        val matSMA: TextView = view.findViewById(R.id.MatSMA)
        val ipa: TextView = view.findViewById(R.id.ipa)
        val ipaSD: TextView = view.findViewById(R.id.ipaSD)
        val ipaSMP: TextView = view.findViewById(R.id.ipaSMP)
        val ipaSMA: TextView = view.findViewById(R.id.ipaSMA)
        val ips: TextView = view.findViewById(R.id.ips)
        val ipsSD: TextView = view.findViewById(R.id.ipsSD)
        val ipsSMP: TextView = view.findViewById(R.id.ipsSMP)
        val ipsSMA: TextView = view.findViewById(R.id.ipsSMA)



        // Set textview lain sebagai gone (tidak ditampilkan) saat fragment pertama kali ditampilkan
        agamaIslamSD.visibility = View.GONE
        agamaIslamSMP.visibility = View.GONE
        agamaIslamSMA.visibility = View.GONE
        ipaSD.visibility = View.GONE
        ipaSMP.visibility = View.GONE
        ipaSMA.visibility = View.GONE
        ipsSD.visibility = View.GONE
        ipsSMP.visibility = View.GONE
        ipsSMA.visibility = View.GONE
        matSD.visibility = View.GONE
        matSMP.visibility = View.GONE
        matSMA.visibility = View.GONE


        agamaIslam.setOnClickListener {
            if (agamaIslamSD.visibility == View.GONE) {
                // Tampilkan textview lain jika saat ini tidak ditampilkan
                agamaIslamSD.visibility = View.VISIBLE
                agamaIslamSMP.visibility = View.VISIBLE
                agamaIslamSMA.visibility = View.VISIBLE
            } else {
                // Sembunyikan textview lain jika saat ini ditampilkan
                agamaIslamSD.visibility = View.GONE
                agamaIslamSMP.visibility = View.GONE
                agamaIslamSMA.visibility = View.GONE
            }

        }

        matematika.setOnClickListener {
            if (matSD.visibility == View.GONE) {
                matSD.visibility = View.VISIBLE
                matSMP.visibility = View.VISIBLE
                matSMA.visibility = View.VISIBLE
            } else {
                matSD.visibility = View.GONE
                matSMP.visibility = View.GONE
                matSMA.visibility = View.GONE
            }
        }

        ipa.setOnClickListener {
            if (ipaSD.visibility == View.GONE) {
                ipaSD.visibility = View.VISIBLE
                ipaSMP.visibility = View.VISIBLE
                ipaSMA.visibility = View.VISIBLE
            } else {
                ipaSD.visibility = View.GONE
                ipaSMP.visibility = View.GONE
                ipaSMA.visibility = View.GONE
            }
        }

        ips.setOnClickListener {
            if (ipsSD.visibility == View.GONE) {
                ipsSD.visibility = View.VISIBLE
                ipsSMP.visibility = View.VISIBLE
                ipsSMA.visibility = View.VISIBLE
            } else {
                ipsSD.visibility = View.GONE
                ipsSMP.visibility = View.GONE
                ipsSMA.visibility = View.GONE
            }
        }
        matSD.setOnClickListener {
            val intent = Intent(context, MateriSd::class.java)
            startActivity(intent)
        }

        return view


    }




    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LessonFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Lesson().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}