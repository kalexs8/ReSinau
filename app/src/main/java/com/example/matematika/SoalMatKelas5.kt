package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManagerMatematika
import com.example.myapplication.R


class SoalMatKelas5 : Fragment() {

    private var jawabanBenar5 = 0
    private val soalMatsd5: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("1. Bentuk pecahan desimal dari 2 1⁄2 adalah...", 0),
            Pair("2. Pecahan desimal yang paling besar nilainya adalah...", 0),
            Pair("3. Bentuk pecahan dari 128 % adalah ...", 0)),

        listOf(Pair("4. Hasil dari 10 7⁄8 + 12 125⁄100 = ...", 0),
            Pair("5. Hasil dari 5 4⁄8  x 2 5⁄10 = ...", 0),
            Pair("6. 40 % + 0,25 - 1⁄2 = ...", 0)),

        listOf(Pair("7. Skala sebuah peta adalah 1 : 1.00.000. Apabila jarak pada peta 8 cm, jarak sesungguhnya adalah ...", 0),
            Pair("8. Panjang lapangan adalah 150 m. Panjang lapangan dalam sebuah peta adalah 5 cm. Maka skala peta tersebut adalah ...", 0),
            Pair("9. Perbandingan antara usia Andi dan Iqbal adalah 7 : 5. Jika usia Andi adalah 21 tahun. Maka usia Iqbal adalah ...", 0)),

        listOf(Pair("10. Perbandingan jumlah sapi dan ayam dalam kandang adalah 3 : 8. Jika jumlah semua sapi dan ayam adalah 33 ekor. Maka jumlah sapi adalah ...", 0),
            Pair("11. Bangun yang mempunyai jumlah simetri putar tak terhingga adalah ...", 0),
            Pair("12. Jumlah simetri lipat segiempat adalah ...", 0)),

        listOf(Pair("13. Luas persegi yang kelilingnya 56 cm adalah...cm2?", 0),
            Pair("14. Luas bangun dibawah ini adalah...cm2?", R.mipmap.soal_mat_pat_kelas5_soal14),
            Pair("15. Luas lingkaran yang berdiameter 28 cm adalah...cm2?", 0)),

        listOf(Pair("16. Keliling persegi yang luasnya 100 cm2 adalah...", 0),
            Pair("17. Bentuk pecahan desimal dari 240% adalah...", 0),
            Pair("18. Sudut yang ukurannya lebih kecil dari sudut siku-siku adalah sudut...", 0)),

        listOf(Pair("19. Berikut yang merupakan jaring-jaring kubus adalah...", R.mipmap.soal_mat_pat_kelas5_soal19),
            Pair("20. Jumlah sisi pada bangun kubus adalah...", 0),
            Pair("21. Perhatikan gambar!.Gambar dibawah merupakan bangun...", R.mipmap.soal_mat_pat_kelas5_soal21)),

        listOf(Pair("22. Tabung adalah bangun ruang yang alasnya berbentuk...", 0),
            Pair("23. Jumlah rusuk yang dimiliki bangun limas segi empat adalah...", 0),
            Pair("24. Bangun di bawah ini mempunyai simetri lipat sebanyak...", R.mipmap.soal_mat_pat_kelas5_soal24)),

        listOf(Pair("25. Perhatikan gambar!.Persegi panjang KNTU berhadapan dengan persegi panjang...", R.mipmap.soal_mat_pat_kelas5_soal25),
            Pair("26. 14³ + ³√ 5832 =...", 0),
            Pair("27. Jumlah satuan kubus yang menyusun bangun dibawah adalah...", R.mipmap.soal_mat_pat_kelas5_soal27)),

        listOf(Pair("28. Volume kubus dengan panjang sisi 13 cm adalah...", 0),
            Pair("29. Panjang sisi kubus jika diketahui volume kubus 4.913 cm adalah...", 0),
            Pair("30. Volume bangun ruang berikut adalah...", R.mipmap.soal_mat_pat_kelas5_soal30)),

        listOf(Pair("31. Sebuah kolam renang panjangnya 20 meter dan lebarnya 12 meter,Jika volume kolam renang 336.000 liter,Kedalaman kolam renang adalah...", 0),
            Pair("32. Damar mempunyai 2 buah kubus dengan panjang sisi 15 cm dan 18 cm.Selisih volume kedua kubus Damar adalah...", 0),
            Pair("33. Jika (e) adalah alas kubus,atap kubus adalah...", R.mipmap.soal_mat_pat_kelas5_soal33)),

        listOf(Pair("34. Jika diketahui panjang sisi kubus 14 cm. Berapa luas jaring jaring kubus?", 0),
            Pair("35. Sebuah balok dengan panjang 20 cm, lebar 8 cm dan tinggi 5 cm. Luas jaring – jaring balok adalah...", 0),
            Pair("36. Pengumpulan data dengan pengamatan langsung pada objek yang diteliti disebut...", 0))
    )


    private  val pilihanGanda5: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. 2,2","b. 2, 1","c. 2, 5","d. 2, 10"),
            listOf("a. 2,3","b. 2,25","c. 2,18","d. 2,6"),
            listOf("a. a. 128⁄10","b. 1 7⁄25","c. 128⁄50","d. 1 1⁄28")),
        listOf(
            listOf("a. 23","b. 23,5","c. 24,7","d. 25"),
            listOf("a. 13 3⁄8","b. 13 2⁄4","c. 13 3⁄4","d. 14 3⁄8"),
            listOf("a. 0,15","b. 0,5","c. 0,25","d. 0,35")),
        listOf(
            listOf("a. 80 km ","b. 8 km ","c. 800 m  ","d. 800 km"),
            listOf("a. 1 : 4.500 ","b. 1 : 150 ","c. 1 : 3.000","d. 1 : 1.500"),
            listOf("a. 35 tahun ","b. 12 tahun","c. 20 tahun","d. 15 tahun")),
        listOf(
            listOf("a. 11 ekor","b. 6 ekor","c. 9 ekor","d. 24 ekor"),
            listOf("a. Segiempat","b. Segitiga","c. Lingkaran","d. Persegi panjang"),
            listOf("a. 4","b. 5","c. 2","d. 6")),
        listOf(
            listOf("a. 144","b. 225","c. 196","d. 121"),
            listOf("a. 234","b. 300","c. 584","d. 764"),
            listOf("a. 1.028","b. 2.156","c. 536","d. 1964")),
    listOf(
        listOf("a. 10 cm","b. 40 cm","c. 10.000 cm","d. 400 cm"),
        listOf("a. 0, 24","b. 24, 0","c. 2,4","d. 0, 240"),
        listOf("a. Tumpul","b. Lancip","c. Simetris","d. Persegi")),
    listOf(
        listOf("a.","b.","c.","d."),
        listOf("a. 4","b. 5","c. 6","d. 8"),
        listOf("a. Prisma segitiga","b. Balok","c. Kubus","d. Limas segitiga")),
    listOf(
        listOf("a. Persegi","b. Segitiga","c. Lingkaran","d. Persegi Panjang"),
        listOf("a. 12","b. 8","c. 6","d. 18"),
        listOf("a. 4","b. 3","c. 2","d. 15")),
    listOf(
        listOf("a. NTWS","b. KRVU","c. RSWV","d. KNSR"),
        listOf("a. 2.761","b. 2.762","c. 2.671","d. 2.672"),
        listOf("a. 24","b. 32","c. 36","d. 40")),
    listOf(
        listOf("a. 2.197 cm³","b. 2.297 cm³","c. 2.744 cm³","d. 2.774 cm³"),
        listOf("a. 16 cm","b. 17 cm","c. 18 cm","d. 19 cm"),
        listOf("a. 3.200 cm³","b. 3.600 cm³","c. 4.000 cm³","d. 4.500 cm³")),
    listOf(
        listOf("a. 120 cm","b. 140 cm","c. 150 cm","d. 180 cm"),
        listOf("a. 1544 cm","b. 1457 cm","c. 2445 cm","d. 2457 cm"),
        listOf("a. A","b. B","c. C","d. D")),
    listOf(
        listOf("a. 876 cm","b. 976 cm","c. 1076 cm","d. 1176 cm"),
        listOf("a. 480 cm","b. 560 cm","c. 600 cm","d. 640 cm"),
        listOf("a. Studi kasus","b. Observasi","c. Wawancara","d. Kajian pustaka")
    )
    )


    private val kunciJawaban5: List<List<Int>> = listOf(
        listOf(2,3,1),
        listOf(0,2,0),
        listOf(1,2,3),
        listOf(2,2,0),
        listOf(2,0,2),
        listOf(1,2,1),
        listOf(2,2,0),
        listOf(2,1,0),
        listOf(2,1,2),
        listOf(0,1,1),
        listOf(1,3,0),
        listOf(3,2,1)





    )
    private lateinit var scoreManagerMatematika5: ScoreManagerMatematika


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas5, container, false)
        scoreManagerMatematika5 = ScoreManagerMatematika(requireActivity().applicationContext)
        jawabanBenar5 = if(scoreManagerMatematika5.scoreMatKelas5 < 1) 0 else scoreManagerMatematika5.scoreMatKelas5 / 5

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3c)



        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3,


            )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalMatsd5[jawabanBenar5][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda5[jawabanBenar5][i][j-2]
            }
        }

        val button = view.findViewById<Button>(R.id.buttonNextSoal2)
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
                    val ch1 = pilihanGanda5[jawabanBenar5][0][kunciJawaban5[jawabanBenar5][0]]
                    val ch2 = pilihanGanda5[jawabanBenar5][1][kunciJawaban5[jawabanBenar5][1]]
                    val ch3 = pilihanGanda5[jawabanBenar5][2][kunciJawaban5[jawabanBenar5][2]]

                    var scoreMatSd = scoreManagerMatematika5.scoreMatKelas5
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar5++

                        if(jawabanBenar5 == soalMatsd5.size){
                            scoreMatSd +=5
                            scoreManagerMatematika5.scoreMatKelas5 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManagerMatematika5.scoreMatKelas5 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd5[jawabanBenar5][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda5[jawabanBenar5][i][j-2]
                                    listRadiogrup[i].clearCheck()
                                }
                            }
                        }

                    }else{
                        // kalau jawaban salah
                        Toast.makeText(activity,getString(R.string.toast_salah), Toast.LENGTH_SHORT).show()
                        for(i in listRadiogrup){
                            i.clearCheck()
                        }
                    }
                } // end cek jawab
            }else {
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT).show()
            } // end cek semua jawaban telah di centang
        }
        return view
    }
}