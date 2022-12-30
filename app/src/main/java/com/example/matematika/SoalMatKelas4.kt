package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R

class SoalMatKelas4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas4, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.view_pager_bilangan)
        val selanjutnya = view.findViewById<Button>(R.id.halaman_selanjutnya)


        selanjutnya.setOnClickListener {
            // Tentukan aksi yang akan dilakukan saat TextView diklik
            viewPager?.currentItem = 1
        }
        return view
    }
}
