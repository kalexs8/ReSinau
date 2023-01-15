package com.example.matematika

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.EnergyManager
import com.example.alat.ScoreManagerMatematika
import com.example.myapplication.R


class SoalMatKelas2 : Fragment() {

    private var jawabanBenar = 0
    private val soalMatsd2: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("1.	7 x 5 =", 0),
            Pair("2.	9 x 4 =", 0),
            Pair("3.	56:8=", 0)),

        listOf(Pair("4.	72:8=", 0),
            Pair("5.	12 x 13 =", 0),
            Pair("6.	15 x 10 =", 0)),

        listOf(Pair("7.	( 9 x 5 ) + ( 8 x 2 ) =", 0),
            Pair("8.	( 7 x 10 ) - ( 8 x 5 ) =", 0),
            Pair("9.	( 49 : 7 ) x 9 =", 0)),

        listOf(Pair("10. 150 : ( 6 x 5) =", 0),
            Pair("11. 30 x .... = 210", 0),
            Pair("12. 90 : .... = 9", 0)),
        listOf(Pair("13. Jumlah sisi pada bangun segi empat adalah ....", 0),
                Pair("14. Bangun yang memiliki 3 buah sudut dan 3 buah sisi adalah ....", 0),
                Pair("15. Nama bangun dibawah adalah ....", R.mipmap.soal_pat_kelas2_15)),

            listOf(Pair("16. Bangun jajar genjang memiliki ....", 0),
                Pair("17. Bangun lingkaran memiliki sisi sebanyak ....", 0),
                Pair("18.	Bangun dibawah dibentuk dari rangkaian bangun...", R.mipmap.soal_pat_kelas2_18)),

            listOf(Pair("19.	Nama bangun di bawah adalah ....", R.mipmap.soal_pat_kelas2_19),
                Pair("20. Benda yang berbentuk lingkaran adalah ....", 0),
                Pair("21. Yang tidak termasuk bangun datar adalah ....", 0)),

            listOf(Pair("22. Buku tulis dan meja berbentuk ....", 0),
                Pair("23. Segi empat memiliki sisi-sisi yang ....", 0),
                Pair("24. Bangun datar yang memiliki 3 buah sudut adalah ....", 0)),

            listOf(Pair("25. Bangun datar yang sisi-sisinya sama panjang adalah ....", 0),
                Pair("26. Berapakah jumlah sisi bangun layang-layang ?", 0),
                Pair("27. Jumlah sisi yang dimiliki jajar genjang adalah ....", 0)),

            listOf(Pair("28. Bangun trapesium memiliki sudut sebanyak ....", 0),
                Pair("29. Roni membeli 6 bungkus permen Setiap bungkus berisi 10 permen Berapakah jumlah permen yang diberi Roni?", 0),
                Pair("30. Dina mempunyai 50 buah jeruk", 0))
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. 25","b. 35","c. 45"),
            listOf("a. 32","b. 34","c. 36"),
            listOf("a. 7","b. 8","c. 9")
        ),
        listOf(
            listOf("a. 8","b. 9","c. 10"),
            listOf("a. 120","b. 156","c. 146"),
            listOf("a. 155","b. 154","c. 150")
        ),
        listOf(
            listOf("a. 61","b. 62","c. 63"),
            listOf("a. 50","b. 40","c. 30"),
            listOf("a. 72","b. 63","c. 81")
        ),
        listOf(
            listOf("a. 4","b. 5","c. 6"),
            listOf("a. 8","b. 9","c. 7"),
            listOf("a. 5","b. 11","c. 10")
        ),
        listOf(
            listOf("a. 4 buah","b. 5 buah","c. 8 buah"),
            listOf("a. Segi empat        ","b. Persegi panjang       ","c. Segitiga"),
            listOf("a. Segitiga","b. Jajar genjang","c. Trapesium")
        ),
        listOf(
            listOf("a. 3 sudut","b. 4 sudut","c. 5 sudut"),
            listOf("a. 3 buah","b. 1 buah","c. 4 "),
            listOf("a. Segi empat ","b. Segitiga","c. Persegi panjang")
        ),
        listOf(
            listOf("a. Trapesium","b. Layang-layang","c. Jajar genjang"),
            listOf("a. Uang logam","b. Papan tulis","c. Buku tulis"),
            listOf("a. Segitiga","b. Lingkaran","c. Kubus")
        ),
        listOf(
            listOf("a. Trapesium","b. Persegi panjang","c. Lingkaran"),
            listOf("a. Sama panjang","b. Berbeda","c. Tidak sama"),
            listOf("a. Persegi","b. Lingkaran","c. Segitiga")
        ),
        listOf(
            listOf("a. Jajar genjang","b. Trapesium","c. Segi empat"),
            listOf("a.	4","b.	2","c.	3"),
            listOf("a.	5","b.	4","c.	6")
        ),
        listOf(
            listOf("a.	8","b.	7","c.	4"),
            listOf("a.	5 x 10 = 50 Permen","b.	3 x 15 = 45 Permen","c.	6 x 10 = 60 Permen"),
            listOf("a.	50:10=7","b.	50:10=5","c.	50:10=6")
        )
    )
    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(1,2,0),
        listOf(1,1,2),
        listOf(0,2,1),
        listOf(1,2,2),
        listOf(0,2,2),
        listOf(1,1,1),
        listOf(2,0,2),
        listOf(1,0,2),
        listOf(2,0,2),
        listOf(2,0,1)


    )
    private lateinit var scoreManagerMatematika: ScoreManagerMatematika


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas2, container, false)
        scoreManagerMatematika = ScoreManagerMatematika(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerMatematika.scoreMatKelas2 < 1) 0 else scoreManagerMatematika.scoreMatKelas2 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3c)

        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3

        )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalMatsd2[jawabanBenar][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda[jawabanBenar][i][j-2]
            }
        }

        val button = view.findViewById<Button>(R.id.buttonNextSoal2)
        var done = false

        button.setOnClickListener {
            val grup1 = listRadiogrup[0]
            val grup2 = listRadiogrup[1]
            val grup3 = listRadiogrup[2]
            if(energy.energy == 0){
                val ad = AlertDialog.Builder(requireActivity())
                ad.setTitle("Empty")
                ad.setMessage(R.string.empty_energy)
                ad.setNeutralButton("OK") { _, _ ->
                    requireActivity().finish()
                }
                ad.setCancelable(false)
                ad.create().show()
            }else {

                if (grup1.checkedRadioButtonId != -1 && grup2.checkedRadioButtonId != -1 && grup3.checkedRadioButtonId != -1) {
                    if (done) {
                        Toast.makeText(
                            requireActivity().applicationContext,
                            "Anda telah mengerjakan ini",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        val pilihGrup1 =
                            view.findViewById<RadioButton>(grup1.checkedRadioButtonId).text.toString()
                        val pilihGrup2 =
                            view.findViewById<RadioButton>(grup2.checkedRadioButtonId).text.toString()
                        val pilihGrup3 =
                            view.findViewById<RadioButton>(grup3.checkedRadioButtonId).text.toString()
                        val ch1 = pilihanGanda[jawabanBenar][0][kunciJawaban[jawabanBenar][0]]
                        val ch2 = pilihanGanda[jawabanBenar][1][kunciJawaban[jawabanBenar][1]]
                        val ch3 = pilihanGanda[jawabanBenar][2][kunciJawaban[jawabanBenar][2]]
                        var scoreMatSd = scoreManagerMatematika.scoreMatKelas2
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar++

                            if (jawabanBenar == soalMatsd2.size) {
                                scoreMatSd += 5
                                scoreManagerMatematika.scoreMatKelas2 = scoreMatSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreMatSd += 5
                                scoreManagerMatematika.scoreMatKelas2 = scoreMatSd
                                Toast.makeText(
                                    activity,
                                    R.string.segments_sukses,
                                    Toast.LENGTH_SHORT
                                ).show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalMatsd2[jawabanBenar][i]
                                    (listRadiogrup[i].getChildAt(0) as TextView).text =
                                        getData.first
                                    val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                    if (getData.second != 0) {
                                        getImg.setImageResource(getData.second)
                                        getImg.visibility = View.VISIBLE
                                    } else {
                                        getImg.visibility = View.GONE
                                    }
                                    for (j in 2 until (listRadiogrup[i].childCount)) {
                                        (listRadiogrup[i].getChildAt(j) as RadioButton).text =
                                            pilihanGanda[jawabanBenar][i][j - 2]
                                        listRadiogrup[i].clearCheck()
                                    }
                                }
                            }

                        } else {
                            // kalau jawaban salah
                            Toast.makeText(
                                activity,
                                getString(R.string.toast_salah),
                                Toast.LENGTH_SHORT
                            ).show()
                            for (i in listRadiogrup) {
                                i.clearCheck()
                            }
                            energy.energy = energy.energy - 1
                            energy.saveComp()
                        }
                    } // end cek jawab
                } else {
                    Toast.makeText(
                        activity,
                        "Anda belum memasukkan semua jawaban",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }// end cek semua jawaban telah di centang
        }
        return view
    }
}