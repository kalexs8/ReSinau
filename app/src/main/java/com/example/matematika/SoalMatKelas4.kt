package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManager
import com.example.myapplication.R


class SoalMatKelas4 : Fragment() {

    private var jawabanBenar4 = 0
    private val soalMatsd4: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("1. Gambar dibawah merupakan bangun...", R.mipmap.soal_mat_pat_kelas4_soal1),
            Pair("2. Segitiga sama sisi mempunyai simetri putar...", 0),
            Pair("3. Sebuah persegi luasnya 289 cm². Panjang sisinya adalah...", 0)),

        listOf(Pair("4.	Keliling bangun dibawah adalah...", 0),
            Pair("5. Luas bangun berikut adalah...", R.mipmap.soal_mat_pat_kelas4_soal5),
            Pair("6. Keliling bangun ruang berikut adalah...", R.mipmap.soal_mat_pat_kelas4_soal6)),

        listOf(Pair("7. Diketahui panjang lahan Pak Budi adalah 42 meter dan lebar nya 8 meter. Luas lahan Pak Budi adalah...", 0),
            Pair("8. Gambar dibawah merupakan hubungan antar garis...", R.mipmap.soal_mat_pat_kelas4_soal8),
            Pair("9. Gambar dibawah merupakan hubungan antar garis...", R.mipmap.soal_mat_pat_kelas4_soal9)),

        listOf(Pair("10. Perhatikan  gambar !Hubungan garis a dan c adalah ...", R.mipmap.soal_mat_pat_kelas4_soal10),
            Pair("11. Berikut bentuk penyajian data kecuali...", 0),
            Pair("12. Perhatikan tabel berikut !.Paling banyak pekerjaan wali adalah?", R.mipmap.soal_mat_pat_kelas4_soal12)),

        listOf(Pair("13. Berikut adalah tabel pegawai di PT Sehat Sentosa berdasarkan umur.Jumlah pegawai yang berumur 21 – 35 adalah ...", R.mipmap.soal_mat_pat_kelas4_soal13),
            Pair("14. Berikut hasil penjualan ikan yang disajikan dalam diagram.Selisih hasil penjualan pada bulan Februari dan April adalah ...", R.mipmap.soal_mat_pat_kelas4_soal14),
            Pair("15. Berikut adalah daftar nilai matematika 20 siswa kelas IV.Tabel yang sesuai dengan data dibawah" +
                    " adalah...", 0)),

        listOf(Pair("16. Dalam sebuah kelas terdiri dari 20 siswa. Tinggi badan 136 - 140 cm ada 4 anak, 141 – 145 ada 8 anak, 146 – 150 ada 6 anak, dan 151 – 155 ada 2 anak. Diagram batang berikut yang sesuai adalah...", R.mipmap.soal_mat_pat_kelas4_soal16),
            Pair("17. Gambar dibawah merupakan...", R.mipmap.soal_mat_pat_kelas4_soal17),
            Pair("18. Gambar dibawah merupakan...", R.mipmap.soal_mat_pat_kelas4_soal18)),

        listOf(Pair("19. Sudut x pada gambar dibawah adalah ...", R.mipmap.soal_mat_pat_kelas4_soal19),
            Pair("20. Besar sudut pada gambar segitiga dibawah ini adalah...", R.mipmap.soal_mat_pat_kelas4_soal20),
            Pair("21. Urutan pecahan berikut dari yang terkecil yang benar adalah ...", R.mipmap.soal_mat_pat_kelas4_soal21)),

        listOf(Pair("22. Bentuk paling sederhana dari 25/100  adalah...", 0),
            Pair("23. Bilangan cacah 78 jika dtiulis dengan bilangan romawi adalah ...", R.mipmap.soal_mat_pat_kelas4_soal23),
            Pair("24. Bangun datar yang memiliki dua pasang sisi berhadapan sama panjang dan memiliki 2 pasang sudut adalah ...", 0)),

        listOf(Pair("25. Bangun yang memiliki simetri lipat berjumlah 4 adalah ...", 0),
            Pair("26. Jumlah simetri lipat bangun layang-layang adalah ...", 0),
            Pair("27. Bangun persegi panjang memiliki simetri putar sebanyak ...", 0)),

        listOf(Pair("28. Hasil penjumlahan dari  2/15   +  2/4  =", 0),
            Pair("29. Ibu membeli gula 3/4 kg. Kemudian ibu membeli lagi 2/3 kg. Sampai di rumah ibu memakai gulanya untuk membuat kue sebanyak 4/5 kg. Maka sekarang berapakah sisi gula yang dibeli ibu?", 0),
            Pair("30. Tentukan ∠A dan  ∠C pada segitiga berikut ini...", R.mipmap.soal_mat_pat_kelas4_soal30))
    )


    private  val pilihanGanda4: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Segitiga sembarang","b. Segitiga sama kaki3","c. Segitiga sama sisi","d. Segitiga siku"),
            listOf("a. Tidak ada","b. 1","c. 2","d. 3"),
            listOf("a. 16 cm","b. 17 cm","c. 18 cm","d. 19 cm")
        ),
        listOf(
            listOf("a. 56 cm","b. 68 cm","c. 72 cm","d. 84 cm"),
            listOf("a. 144 cm²","b. 256 cm²","c. 328 cm²","d. 432 cm²"),
            listOf("a. 51 cm","b. 56 cm","c. 63 cm","d. 72 cm")
        ),
        listOf(
            listOf("a. 252 ","b. 336 m²","c. 420 m²","d. 528 m²"),
            listOf("a. sejajar","b. berhimpit","c. berpotongan","d. tegak lurus"),
            listOf("a. sejajar","b. berhimpit","c. berpotongan","d. tegak lurus")
        ),
        listOf(
            listOf("a. sejajar","b. berhimpit","c. berpotongan","d. tegak lurus"),
            listOf("a. tabel","b. diagram batang","c. diagram garis","d. diagram angka"),
            listOf("a. pegawai negeri","b. pegawai swasta","c. petani","d. wiraswasta")
        ),
        listOf(
            listOf("a. 30 orang","b. 38 orang","c. 42 orang","d. 44 orang"),
            listOf("a. 40 ","b. 45 kg","c. 50 kg","d. 55 kg"),
            listOf("a.	A","b.	B","c.	C","d.	D")
        ),
        listOf(
            listOf("a.	A","b.	B","c.	C","d.	D"),
            listOf("a. sudut lancip","b. sudut tumpul","c. sudut siku","d. sudut sembarang"),
            listOf("a. sudut lancip","b. sudut tumpul","c. sudut siku","d. sudut sembarang")
        ),
        listOf(
            listOf("a. 45°","b. 60°","c. 90°","d. 135°"),
            listOf("a. 45°","b. 50°","c. 55°","d. 60°"),
            listOf("a. 1/2 , 1/8 , 1/10 ,1/25","b. 1/25 , 1/2 , 1/10 , 1/8","c. 1/25 , 1/10 , 1/8 , 1/2","d. 1/2 , 1/8 , 1/25 , 1/10")
        ),
        listOf(
            listOf("a. 5/20","b. 1/20","c. 1/4","d. 1/2"),
            listOf("a. LXIX","b. LXXIIX","c. LIXVIII","d. LXXVIII"),
            listOf("a. Persegi panjang","b. Belah ketupat","c. Jajargenjang","d. Layang-layang")
        ),
        listOf(
            listOf("a. Segitiga","b. Segiempat","c. Trapesium","d. Persegi panjang"),
            listOf("a. 4","b. 3","c. 2","d. 1"),
            listOf("a. 4","b. 3","c. 5","d. 2")
        ),
        listOf(
            listOf("a.	8/60  atau 19/60","b.	8/60  atau 19/30","c.	8/90  atau 19/30","d.  8/30  atau 19/30"),
            listOf("a.	3/4 Kg +  2/3 Kg - 4/5 Kg = 45/60 Kg + 40/60 Kg - 48/60 Kg = 37/60","b.	3/4 Kg +  2/3 Kg - 4/5 Kg = 45/60 Kg + 40/60 Kg - 48/60 Kg = 47/60","c.	3/4 Kg +  2/3 Kg - 4/5 Kg = 45/60 Kg + 40/60 Kg - 48/60 Kg = 57/60","d.	3/4 Kg +  2/3 Kg - 4/5 Kg = 45/60 Kg + 40/60 Kg - 48/60 Kg = 27/60"),
            listOf("a.	∠A = 90° ∠C = 180 – 90 – 35 = 60°","b.	∠A = 90° ∠C = 180 – 90 – 35 = 65°","c.	∠A = 90° C = 180 – ∠90 – 35 = 50°","d.	∠A = 90° C = 180 – ∠90 – 35 = 55°"))
    )


    private val kunciJawaban4: List<List<Int>> = listOf(
        listOf(3,3,1),
        listOf(2,3,1),
        listOf(1,1,0),
        listOf(2,3,1),
        listOf(1,1,3),
        listOf(3,0,1),
        listOf(3,1,2),
        listOf(2,3,2),
        listOf(1,3,3),
        listOf(1,0,3)




    )
    private lateinit var scoreManager4: ScoreManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas4, container, false)
        scoreManager4 = ScoreManager(requireActivity().applicationContext)
        jawabanBenar4 = if(scoreManager4.scoreMatKelas4 < 1) 0 else scoreManager4.scoreMatKelas4 / 5

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
            val getData = soalMatsd4[jawabanBenar4][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda4[jawabanBenar4][i][j-2]
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
                    val ch1 = pilihanGanda4[jawabanBenar4][0][kunciJawaban4[jawabanBenar4][0]]
                    val ch2 = pilihanGanda4[jawabanBenar4][1][kunciJawaban4[jawabanBenar4][1]]
                    val ch3 = pilihanGanda4[jawabanBenar4][2][kunciJawaban4[jawabanBenar4][2]]

                    var scoreMatSd = scoreManager4.scoreMatKelas4
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar4++

                        if(jawabanBenar4 == soalMatsd4.size){
                            scoreMatSd +=5
                            scoreManager4.scoreMatKelas4 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManager4.scoreMatKelas4 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd4[jawabanBenar4][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda4[jawabanBenar4][i][j-2]
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