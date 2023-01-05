package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManager
import com.example.myapplication.R


class SoalMatKelas3 : Fragment() {

    private var jawabanBenar3 = 0
    private val soalMatsd3: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("1. Sudut yang besarnya 90° adalah dinamakan sudut ...", 0),
            Pair("2. Bangun datar yang memiliki sudut lancip adalah ...", 0),
            Pair("3. Benda yang memiliki sudut siku-siku adalah ...", 0)),

        listOf(Pair("4. Perhatikan gambar!Gambar dibawah menunjukkan sudut...", R.mipmap.soal_mat_pat_kelas3_soal4),
            Pair("5. Bangun segiempat memiliki sisi yang sama sebanyak ...", 0),
            Pair("6. Bangun layang-layang mempunyai...pasang sisi yang sama panjang?", 0)),

        listOf(Pair("7. Sudut tumpul adalah sudut yang besar sudutnya lebih dari...", 0),
            Pair("8. Sudut tumpul yang dimiliki bangun layang-layang berjumlah...", 0),
            Pair("9. Segitiga yang mempunyai 3 sudut sama besar adalah segitiga...", 0)),

        listOf(Pair("10. Bangun segitiga mempunyai sudut sebanyak...", 0),
            Pair("11. Bangun jajar genjang memiliki sudut .... dan...", 0),
            Pair("12. Bangun yang memiliki 4 sudut siku-siku dan 2 pasang sisi yang sama adalah...", 0)),

        listOf(Pair("13. Cara untuk mencari keliling persegi adalah...", 0),
            Pair("14. Sebuah persegi mempunyai sisi sepanjang 10 cm. Maka kelilingnya adalah...", 0),
            Pair("15. Cara untuk mencari luas persegi panjang adalah...", 0)),

        listOf(Pair("16. Luas persegi yang panjang sisinya 12 cm adalah...", 0),
            Pair("17. Perhatikan gambar!Luas persegi panjang dibawah adalah...", R.mipmap.soal_mat_pat_kelas3_soal17),
            Pair("18. Sebuah persgi yang mempunyai keliling 60 satuan. Maka panjang sisinya adalah...", 0)),

        listOf(Pair("19. Sebuah persegi panjang memiliki panjang 8 cm dan lebar 7 cm. Luas persegi panjang tersebut adalah...", 0),
            Pair("20. Perhatikan gambar!Keliling persegi panjang dibawah adalah...", R.mipmap.soal_mat_pat_kelas3_soal20),
            Pair("21. Sebuah bangun persegi yang mempunyai keliling 100 cm maka panjang sisinya adalah...", 0)),

        listOf(Pair("22. Persegi panjang mempunyai luas 90 dan panjang 10 cm. Maka lebarnya adalah...", 0),
            Pair("23. Kolam berbentuk persegi panjang luasnya 76 Maka  panjang dan lebarnya  adalah...", 0),
            Pair("24. Sebuah taman berbentuk persegi memiliki panjang sisi 57 m. Maka kelilingnya adalah...", 0)),
        listOf(Pair("25. Sebuah buku yang panjangnya 30 cm dan lebarnya 20 m, luasnya adalah .....", 0),
            Pair("26. Cara  untuk mencari keliling persegi panjang adalah...", 0),
            Pair("27. Gambar di bawah ini memiliki sudut tumpul sebanyak ...", R.mipmap.soal_mat_pat_kelas3_soalb4)),

        listOf(Pair("28. Luas persegi panjang dibawah ini adalah ...",R.mipmap.soal_mat_pat_kelas3_soalb8),
            Pair("29. Diketahui : Sawah berbentuk persegi panjang.Panjang  = 100m,Lebar  = 50m.Ditanya keliling = ?", 0),
            Pair("30. Pak Rudi memiliki kebun yang panjangnya 25 m dan lebarnya 20 m. Sedangkan Pak Diki memiliki kebun yang panjangnya 30 m dan lebarnya 15 m. Siapakah yang memiliki kebun lebih luas ?", 0))
    )


    private  val pilihanGanda3: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Lancip","b. Siku-siku","c. Tumpul","d. Kecil"),
            listOf("a. Segitiga","b. Persegi","c. Persegi panjang","d. Lingkaran"),
            listOf("a. Gelas","b. Bola","c. Botol","d. Meja")
        ),
        listOf(
            listOf("a. Lancip","b. Sama sisi","c. Siku-siku","d. Tumpul"),
            listOf("a. 3 ","b. 4","c. 5","d. 6"),
            listOf("a. 2","b. 3","c. 4","d. 5")
        ),
        listOf(
            listOf("a. 80°","b. 90°","c. 100°","d. 60°"),
            listOf("a. 1","b. 2","c. 3","b. 4"),
            listOf("a. Sama kaki","b. Siku-siku","c. Lancip","d. Sama sisi")
        ),
        listOf(
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. Tumpul dan siku-siku","b. Tumpul dan lancip","c. Lancip dan siku-siku","d. Tumpul dan lingkaran "),
            listOf("a. Trapesium","b. Layang-layang","c. Jajar genjang","d. Persegi panjang")
        ),
        listOf(
            listOf("a. 4 x luas","b. 4 x lebar","c. 4 x sisi","d. Sisi x sisi"),
            listOf("a. 100 cm","b. 40 cm","c. 60 cm","d. 20 cm"),
            listOf("a. Sisi x sisi","b. Panjang x sisi","c. 4 x panjang","d. Panjang x lebar")
        ),
        listOf(
            listOf("a. 100 ","b. 24 ","c. 48 ","d. 144 "),
            listOf("a. 40 cm","b. 80 cm","c. 40 satuan","d. 80 satuan"),
            listOf("a. 30 satuan","b. 25 satuan","c. 20 satuan","d. 15 satuan")
        ),
        listOf(
            listOf("a. 87","b. 30","c. 56 ","d. 78"),
            listOf("a. 40 cm ","b. 26 cm","c. 13 cm   ","d. 20 cm"),
            listOf("a. 10 cm","b. 40 cm","c. 25 cm","d. 20 cm")
        ),
        listOf(
            listOf("a. 900 cm","b. 45 cm","c. 9 cm","d. 15 cm"),
            listOf("a. 70 m dan 6 m","b.  19 m dan 4 m","c. 7 m dan 6 m","d.  9 m x 8 m"),
            listOf("a. 114 m","b. 171 m","c. 128 m","d. 228 m")
        ),
        listOf(
            listOf("a. 50","b. 100","c. 600","d. 150"),
            listOf("a. 2 x ( panjang + lebar )","b. 2 x ( panjang + luas )","c. 2 x ( lebar + luas)","d. 2 x ( lebar + lebar )"),
            listOf("a. 2","b. 3","c. 4","d. 5")
        ),
        listOf(
            listOf("a. 45","b. 35","c. 40","d. 50"),
            listOf("a. Luas = 2 x (Panjang + lebar)= 2 x ( 100m + 50m) = 2 x 150 m = 300m","b. Panjang = 2 x (Keliling + lebar)= 2 x ( 100m + 50m) = 2 x 150m = 300m","c. Keliling = 2 x (Panjang + lebar)= 2 x ( 100m + 50m) = 2 x 150m = 500m","d. Keliling = 2 x (Panjang + lebar)= 2 x ( 100m + 50m) = 2 x 150m = 300m"),
            listOf("a. Kebun Pak Rudi Panjang = 25 m,Lebar = 20 m,Luas = Panjang x lebar =  25 m x 20 m = 500.Kebun Pak Diki Panjang  = 30 m,Lebar  = 15 m,Luas  = panjang x lebar = 30 m x 15 m = 450 Jadi yang lebih luas adalah kebun pak Diki","b. Kebun Pak Rudi Panjang = 25 m,Lebar = 20 m,Luas = Panjang x lebar =  25 m x 20 m = 500.Kebun Pak Diki Panjang  = 30 m,Lebar  = 15 m,Luas  = panjang x lebar = 30 m x 15 m = 550 Jadi yang lebih luas adalah kebun pak Diki","c. Kebun Pak Rudi Panjang = 25 m,Lebar = 20 m,Luas = Panjang x lebar =  25 m x 20 m = 500.Kebun Pak Diki Panjang  = 30 m,Lebar  = 15 m,Luas  = panjang x lebar = 30 m x 15 m = 450 Jadi yang lebih luas adalah kebun pak Rudi","d. Kebun Pak Rudi Panjang = 25 m,Lebar = 20 m,Luas = Panjang x lebar =  25 m x 20 m = 400.Kebun Pak Diki Panjang  = 30 m,Lebar  = 15 m,Luas  = panjang x lebar = 30 m x 15 m = 450 Jadi yang lebih luas adalah kebun pak Diki")
        )
    )


    private val kunciJawaban3: List<List<Int>> = listOf(
        listOf(1,0,3),
        listOf(0,1,0),
        listOf(1,1,2),
        listOf(2,1,3),
        listOf(2,1,3),
        listOf(2,2,3),
        listOf(2,1,2),
        listOf(2,1,3),
        listOf(2,0,0),
        listOf(2,3,2)
    )


    private lateinit var scoreManager3: ScoreManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas3, container, false)
        scoreManager3 = ScoreManager(requireActivity().applicationContext)
        jawabanBenar3 = if(scoreManager3.scoreMatKelas3 < 1) 0 else scoreManager3.scoreMatKelas3 / 5

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
            val getData = soalMatsd3[jawabanBenar3][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda3[jawabanBenar3][i][j-2]
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
                    val ch1 = pilihanGanda3[jawabanBenar3][0][kunciJawaban3[jawabanBenar3][0]]
                    val ch2 = pilihanGanda3[jawabanBenar3][1][kunciJawaban3[jawabanBenar3][1]]
                    val ch3 = pilihanGanda3[jawabanBenar3][2][kunciJawaban3[jawabanBenar3][2]]

                    var scoreMatSd = scoreManager3.scoreMatKelas3
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar3++

                        if(jawabanBenar3 == soalMatsd3.size){
                            scoreMatSd +=5
                            scoreManager3.scoreMatKelas3 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManager3.scoreMatKelas3 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd3[jawabanBenar3][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda3[jawabanBenar3][i][j-2]
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