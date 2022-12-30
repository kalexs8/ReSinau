package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.myapplication.R

class SoalMatKelas2 : Fragment() {
    private lateinit var soalTextview: TextView
    private lateinit var pilihanradioGroup: RadioGroup
    private lateinit var soalLanjutanButton: Button


    private val soalMathSDKelas1 = listOf(
        "11. berapa 10 + 10 = ",
        "12. Pak Kadir memiliki 10 ayam betina dan 5 ayam jantan,jumlah telor ayam betina\n" +
                "ada 30 butir dan yang sudah menetas telornya ada 25 telor. \n" +
                "Jadi berapa jumlah ayam pak kadir? ",
        "13. Ibu Beli semangka dari pasar 1 buah lalu dipotong-potong menjadi 8 bagian,\n" +
                "serta dibagikan kepada anaknya yang 4 orang, jadi dapat berapa potong semangka\n" +
                "anak ibu? ",
        "14. Bilangan 28 jika dibaca . . . .",
        "15. Empat puluh tujuh ditulis dalam bilangan . . .")

    private val jawabanMathSDKelas1 = listOf(
        listOf("30","18","20"),
        listOf("15","30","25"),
        listOf("8","4","2"),
        listOf("dua puluh delapan","dua puluh tujuh","dua puluh enam"),
        listOf("17","47","27 "))

    private val kunciJawaban = listOf("30", "15", "2", "dua puluh delapan", "47")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas2, container, false)


        soalTextview = view.findViewById(R.id.textViewsoal)
        pilihanradioGroup = view.findViewById(R.id.radioGroupjawaban)

        var soalMathSDKelas1Index = 0
        soalTextview.text = soalMathSDKelas1[soalMathSDKelas1Index]

        for (choice in jawabanMathSDKelas1[soalMathSDKelas1Index]){
            val radioButtonPilihan = RadioButton(view.context)
            radioButtonPilihan.text = choice
            pilihanradioGroup.addView(radioButtonPilihan)
            radioButtonPilihan.id = View.generateViewId()
        }

        soalLanjutanButton = view.findViewById(R.id.buttonSoal_selanjutnya)
        soalLanjutanButton.setOnClickListener {

            val kunciJawaban = kunciJawaban[soalMathSDKelas1Index]
            val pilihanUser = view.findViewById<RadioButton>(
                pilihanradioGroup.checkedRadioButtonId).
                text.toString()

            if (pilihanUser == kunciJawaban)


            {
                soalTextview.setTextColor(ContextCompat.getColor(view.context,
                    android.R.color.holo_green_dark))


            } else {
                soalTextview.setTextColor(ContextCompat.getColor(view.context,
                    android.R.color.holo_red_dark))
            }

            // Menambahkan 1 ke index soal
            soalMathSDKelas1Index++

            // Jika index soal sudah melebihi panjang list soal, kembali ke index 0
            if (soalMathSDKelas1Index >= soalMathSDKelas1.size) {
                soalMathSDKelas1Index = 0
            }

            // Menampilkan soal baru
            soalTextview.text = soalMathSDKelas1[soalMathSDKelas1Index]

            // Menghapus semua pilihan jawaban yang ada
            pilihanradioGroup.removeAllViews()

            // Menambahkan pilihan jawaban baru
            for (choice in jawabanMathSDKelas1[soalMathSDKelas1Index]) {
                val radioButtonPilihan = RadioButton(view.context)
                radioButtonPilihan.text = choice
                pilihanradioGroup.addView(radioButtonPilihan)
            }
        }





        return view


    }

}