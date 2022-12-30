package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManager
import com.example.myapplication.R


class SoalMatKelas1 : Fragment() {

    private var jawabanBenar = 0
    private val soalMatsd1: List<List<String>> = listOf(
        listOf(
        "1. 3 + 5 =",
        "2. Delapan ditambah enam sama dengan . . .",
        "3. Di dalam kandang ada 17 ekor ayam.Paman menjual 8 ekor ayam. \n" +
                "Jumlah ayam paman sekarang adalah . . . ekor. "),
        listOf(
            "4. 18 16 12 20 14 Dari bilangan di atas, \n" +
                    "jika diurutkan mulai dari yang terkecil adalah . . .",
            "5. 14 - a = 6, Nilai untuk a adalah. . .",
            "6. 18 - 5 - 2 =")
    )
    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. 7","b. 6","c. 8 "),
            listOf("a. Empat belas","b. Dua belas","c. Tiga belas"),
            listOf("a. 10","b. 9","c. 8")
        ),
        listOf(
            listOf("a. 20, 18, 14, 16, 12","b. 12 , 14, 16, 18, 20","c. 20, 18, 16, 14, 12"),
            listOf("a. 9","b. 8","c. 7"),
            listOf("a. 14","b. 11","c. 10")
        )
    )
    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(2, 0, 1),
        listOf(1,1,1)
    )
    private lateinit var scoreManager: ScoreManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas1, container, false)

        scoreManager = ScoreManager(requireActivity().applicationContext)
        jawabanBenar = if(scoreManager.scoreMatKelas1 < 1) 0 else scoreManager.scoreMatKelas1 / 5

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupmatSDpertama)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupmatSDkedua)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupmatSDketiga)

        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3

        )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            (listRadiogrup[i].getChildAt(0) as TextView).text = soalMatsd1[jawabanBenar][i]
            for(j in 1 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda[jawabanBenar][i][j-1]
            }
        }

        val button = view.findViewById<Button>(R.id.buttonNextSoal1)
        var done = false

        button.setOnClickListener {
            val grup1 = listRadiogrup[0]
            val grup2 = listRadiogrup[1]
            val grup3 = listRadiogrup[2]
            if(grup1.checkedRadioButtonId != -1 && grup2.checkedRadioButtonId != -1 && grup3.checkedRadioButtonId != -1){
            if(done){
                Toast.makeText(requireActivity().applicationContext, "Anda telah mengerjakan ini", Toast.LENGTH_SHORT).show()
            }else{
            val pilihGrup1 = view.findViewById<RadioButton>(grup1.checkedRadioButtonId).text.toString()
            val pilihGrup2 = view.findViewById<RadioButton>(grup2.checkedRadioButtonId).text.toString()
            val pilihGrup3 = view.findViewById<RadioButton>(grup3.checkedRadioButtonId).text.toString()
            val ch1 = pilihanGanda[jawabanBenar][0][kunciJawaban[jawabanBenar][0]]
            val ch2 = pilihanGanda[jawabanBenar][1][kunciJawaban[jawabanBenar][1]]
            val ch3 = pilihanGanda[jawabanBenar][2][kunciJawaban[jawabanBenar][2]]
            var scoreMatSd = scoreManager.scoreMatKelas1
            if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                jawabanBenar++

                if(jawabanBenar == soalMatsd1.size){
                    scoreMatSd +=5
                    scoreManager.scoreMatKelas1 = scoreMatSd
                    Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                    done = true
                }else {
                    scoreMatSd +=5
                    scoreManager.scoreMatKelas1 = scoreMatSd
                    // refresh ui
                    for (i in 0 until (listRadiogrup.size)) {
                        (listRadiogrup[i].getChildAt(0) as TextView).text =
                            soalMatsd1[jawabanBenar][i]
                        for (j in 1 until (listRadiogrup[i].childCount)) {
                            (listRadiogrup[i].getChildAt(j) as RadioButton).text =
                                pilihanGanda[jawabanBenar][i][j - 1]
                            (listRadiogrup[i].getChildAt(j) as RadioButton).isChecked = false
                        }
                    }
                }

            }else{
                // kalau jawaban salah
                Toast.makeText(activity,getString(R.string.toast_salah), Toast.LENGTH_SHORT).show()
            }
            } // end cek jawab
            }else {
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT).show()
            } // end cek semua jawaban telah di centang
        }
        return view
    }
}