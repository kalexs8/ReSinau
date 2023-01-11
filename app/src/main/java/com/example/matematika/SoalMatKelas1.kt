package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManagerMatematika
import com.example.myapplication.R


class SoalMatKelas1 : Fragment() {

    private var jawabanBenar = 0
    private val soalMatsd1: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("1.	Nama lambang bilangan 25 adalah ...", 0),
            Pair("2.	Nama lambang bilangan 37 adalah ...", 0),
            Pair("3.	Lambang bilangan dari enam puluh sembilan adalah ...", 0)),

        listOf(Pair("4. 18–15–17–14–16.Bilangan yang terkecil adalah ...", 0),
            Pair("5. 25–23–32–36–26.Urutan dari yang paling kecil adalah ...", 0),
            Pair("6. 34 = ...", 0)),

        listOf(Pair("7. Angka yang menempati puluhan pada lambang bilangan 156 adalah ...", 0),
            Pair("8.  6 puluhan + 8 satuan = ...", 0),
            Pair("9.	25 + 37 = ...", 0)),

        listOf(Pair("10.	32 + 19 =...", 0),
            Pair("11.	45 – 23 =...", 0),
            Pair("12.30 + 21–5 =...", 0)),

        listOf(Pair("13.45 – 11 – 23 = ...", 0),
            Pair("14. Andi mempunyai 10 permen. Andi membeli lagi 14. Permen Andi sekarang adalah ...", 0),
            Pair("15. Ibu mempunyai 25 ekor ayam. Ayam milik ibu mati 15. Ayam milik ibu sekarang adalah ...", 0)),

        listOf(Pair("16. Berat andi 20 kg dan berat budi 23 kg. Siapakah yang badannya lebih berat?", 0),
            Pair("17. Di kandang ada ayam, kambing dan sapi. Binatang yang paling ringan adalah ...", 0),
            Pair("18. Di meja belajar ada buku, pensil dan bolpoin. Benda yang paling berat adalah ...", 0)),

        listOf(Pair("19. Roda sepeda berbentuk ...", 0),
            Pair("20. Benda yang berbentuk persegi panjang adalah ...", 0),
            Pair("21.	Gambar dibawah adalah bangun ...", R.mipmap.soal_pat_kelas1_21)),

        listOf(Pair("22. Jumlah sisi pada segi empat ada ...", 0),
            Pair("23. Bangun yang sisinya ada 3 adalah ...", 0),
            Pair("24. Buah semangka ..... dari buah jeruk?", 0)),

        listOf(Pair("25.	Gambar yang temasuk lingkaran adalah ...", R.mipmap.soal_pat_kelas1_25),
            Pair("26.	Lambang bilangan dari tujuh puluh lima adalah...", 0),
            Pair("27.	Bagas membeli 50 buku.Diberikan kepada Budi sebanyak 12 buku Diberikan kepada Ani sebanyak 23 buku.Berapa jumlah buku sekarang yang dipunyai bagas?", 0)),

        listOf(Pair("28.	Rina membeli 10 buah jeruk Doni membeli 12 buah apel Diki membeli 15 buah manggis Berapakah jumlah buah mereka semua?", 0),
            Pair("29.	Bangun segi empat memiliki ....sisi?", 0),
            Pair("30.	gambar dibawah adalah bangun ...", R.mipmap.soal_pat_kelas1_30))
    )
    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Dua lima","b. Dua puluh lima","c. Dua dan lima"),
            listOf("a. Tiga puluh tujuh","b. Tiga dan tujuh","c. Tiga tujuh"),
            listOf("a. 609","b. 69","c. 6 dan 9")
        ),
        listOf(
            listOf("a. 15       ","b. 16        ","c. 14"),
            listOf("a. 32–23–25-26–36","b. 23–25–26–32–36","c. 23-32–25–36-26"),
            listOf("a. 3 satuan dan 4 puluhan","b. 3 puluhan dan 4 puluhan","c. 3 puluhan dan 4 satuan")
        ),
        listOf(
            listOf("a. 1","b. 5","c. 6"),
            listOf("a. 14","b. 68","c. 86"),
            listOf("a. 62","b. 42","c. 52")
        ),
        listOf(
            listOf("a. 52","b. 57","c. 51"),
            listOf("a. 21","b. 68","c. 22"),
            listOf("a. 46","b. 56","c. 36")
        ),
        listOf(
            listOf("a. 13	","b. 12","c. 11"),
            listOf("a. 24        ","b. 4        ","c. 12"),
            listOf("a. 3        ","b. 10        ","c. 25")
        ),
        listOf(
            listOf("a. Andi        ","b. Budi        ","c. Sama"),
            listOf("a. Ayam        ","b. Kambing        ","c. Sapi"),
            listOf("a. Bolpoin","b. Pensil","c. Buku")
        ),
        listOf(
            listOf("a. Segiempat","b. Segitiga","c. Lingkaran"),
            listOf("a. Uang logam","b. Uang kertas","c. Bola"),
            listOf("a. Segiempat","b. Segitiga","c. Lingkaran")
        ),
        listOf(
            listOf("a. 3","b. 4","c. 5"),
            listOf("a. Persegi","b. Lingkaran","c. Segitiga"),
            listOf("a. Lebih berat","b. Lebih ringan","c. Sama")
        ),
        listOf(
            listOf("a. 2 , 5 dan 7","b. 1 , 4 dan 6","c. 3 , 4 dan 5"),
            listOf("a. 75","b. 85","c. 95"),
            listOf("a. 15","b. 23","c. 37")
        ),
        listOf(
            listOf("a. 37","b. 50","c. 75"),
            listOf("a. 3","b. 4","c. 5"),
            listOf("a. persegi panjang","b. segitiga","c. persegi")
        )
    )
    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(1,0,1),
        listOf(2,1,2),
        listOf(1,1,0),
        listOf(2,2,0),
        listOf(2,0,1),
        listOf(1,0,2),
        listOf(2,1,1),
        listOf(1,2,0),
        listOf(1,0,0),
        listOf(0,1,2)


    )
    private lateinit var scoreManagerMatematika: ScoreManagerMatematika


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas1, container, false)
        scoreManagerMatematika = ScoreManagerMatematika(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerMatematika.scoreMatKelas1 < 1) 0 else scoreManagerMatematika.scoreMatKelas1 / 5

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
            val getData = soalMatsd1[jawabanBenar][i]
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
            var scoreMatSd = scoreManagerMatematika.scoreMatKelas1
            if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                jawabanBenar++

                if(jawabanBenar == soalMatsd1.size){
                    scoreMatSd +=5
                    scoreManagerMatematika.scoreMatKelas1 = scoreMatSd
                    Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                    done = true
                }else {
                    scoreMatSd +=5
                    scoreManagerMatematika.scoreMatKelas1 = scoreMatSd
                    Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                    // refresh ui
                    for(i in 0 until (listRadiogrup.size)){
                        val getData = soalMatsd1[jawabanBenar][i]
                        (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                        val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                        if (getData.second != 0){
                            getImg.setImageResource(getData.second)
                            getImg.visibility = View.VISIBLE
                        }else{
                            getImg.visibility = View.GONE
                        }
                        for(j in 2 until (listRadiogrup[i].childCount)){
                            (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda[jawabanBenar][i][j-2]
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