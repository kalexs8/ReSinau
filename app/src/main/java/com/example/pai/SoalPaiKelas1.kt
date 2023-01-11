package com.example.pai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManagerPai
import com.example.myapplication.R


class SoalPaiKelas1 : Fragment() {

    private var jawabanBenar = 0
    private val soalPaisd1: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Adalah doa ... """, R.mipmap.pai_kelas1_soal1),
            Pair("""2. Arti nya adalah …
""", R.mipmap.pai_kelas1_soal2),
            Pair("""3. Nabi Idris AS menjadi pandai karena …
""", 0)),

        listOf(Pair("""4. Surah Al-Ikhlas isinya tentang ...""", 0),
            Pair("""5. Jumlah ayat pada surah Al-Ikhlas adalah ...""", 0),
            Pair("""6. Surah Al-Ikhlas diturunkan di kota Mekah, maka termasuk kategori surah ...""", 0)),

        listOf(Pair("""7. Allah Dzat yang Maharaja adalah makna Al-Asma Al-Husna yang diterangkan dalam sifat …
""", 0),
            Pair("""8. Al Malik artinya Allah SWT Maha …
""", 0),
            Pair("""9. Febri menjalankan tugas kepemimpinan atau kekuasaan dengan niat ikhlas sematamata karena Allah SWT adalah salah satu pengamalan asmaul husna …
""", 0)),

        listOf(Pair("""10. Syahadat tauhid merupakan kesaksian terhadap ...""", 0),
            Pair("""11. Syahadat Rasul adalah persaksian atas ...""", 0),
            Pair("""12. Salat wajib 2 rakaat adalah ...""", 0)),

        listOf(Pair("""13. Salat ... dilaksanakan pada siang hari
""", 0),
            Pair("""14. Salat Asar dilaksanakan setelah Salat...""", 0),
            Pair("""15. Salat yang dikerjakan 3 rakaat adalah ...""", 0)),

        listOf(Pair("""16. Salah yang dikerjakan 4 rakaat adalah ...""", 0),
            Pair("""17. Salah satu hormat dan patuh kepada orang tua adalah …
""", 0),
            Pair("""18. Menghormati orang yang lebih tua adalah salah satu sikap …
""", 0)),

        listOf(Pair("""19. Salah satu contoh prilaku sopan santun disekolah adalah ...""", 0),
            Pair("""20. Ucapan hamdalah adalah....""", 0),
            Pair("""21. Menghilangkan kotoran baik dari badan, pakain maupun tempat ibadah disebut dengan…
""", 0)),

        listOf(Pair("""22. Bila tidak ada air, sebaiknya dengan benda apa kita bersuci?""", 0),
            Pair("""23. Membersihkan kotoran setelah buang air kecil maupun besar disebut juga dengan…
""", 0),
            Pair("""24. Allah mencintai orang-orang yang senantiasa menjaga kebersihan, karena kebersihan adalah setengah daripada…
""", 0)),

        listOf(Pair("""25. Orang yang diutus Allah untuk menyempurnakan akhlak manusia disebut…
""", 0),
            Pair("""26. Nabi pertama yang diutus Allah ke dunia adalah…
""", 0),
            Pair("""27. Nabi Nuh AS pernah membuat kapal di atas bukit atas perintah Allah. Perilaku yang bisa kita teladani dari Nabi Nuh adalah…
""", 0)),

        listOf(Pair("""28. Teladan Nabi Hud AS mengajarkan kita untuk tidak mudah marah dan mau…
""", 0),
            Pair("""29. Sebelum dan sesudah belajar kita sebaiknya…
""", 0),
            Pair("""30. Doa kita sebelum belajar adalah untuk meminta…
""", 0))
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Sebelum belajar","b. Sebelum tidur","c. Sebelum makan "),
            listOf("a. beri aku pemahaman","b. Ya Allah, tambahkan ilmu kepadaku","c. Segala puji bagi Allah, Tuhan semesta alam "),
            listOf("a. Rajin belajar","b. Rajin berdoa","c. Rajin bekerja")
        ),
        listOf(
            listOf("a. Nikmat surga","b. Adzab dan siksa","c. Ketauhidan Allah  "),
            listOf("a. 4","b. 5","c. 3"),
            listOf("a. Madanniyah","b. Mukaromah","c. Makkiyah ")
        ),
        listOf(
            listOf("a. al-Hasib","b. al-Razzaq","c. al-Malik"),
            listOf("a. Esa","b. Raja ","c. Kuasa "),
            listOf("a. al-Malik","b. al-Razzaq","c. al-Hasib")
        ),
        listOf(
            listOf("a. Rasul","b. Malaikat","c. Allah "),
            listOf("a. Keesaan Allah SWT","b. Kerasulan Nabi Muhammad saw","c. Malaikat Allah"),
            listOf("a. Subuh","b. Magrib","c. Zuhur")
        ),
        listOf(
            listOf("a. Isya’","b. Zuhur","c. Subuh"),
            listOf("a. ‘Ashar","b. Magrib","c. Zuhur"),
            listOf("a. Isya’","b. Subuh","c. Magrib ")
        ),
        listOf(
            listOf("a. Magrib dan Isya’","b. Isya’ dan Dhuhur","c. Subuh dan Magrib"),
            listOf("a. Menaati peraturan sekolah","b. Membantu membersihkan sekolah","c. Membantu pekerjaan rumah"),
            listOf("a. Bersyukur","b. Pemaaf","c. Sopan")
        ),
        listOf(
            listOf("a. Menyapa guru saat bertemu","b. Melawan guru maupun teman di sekolah","c. Diam saat bertemu guru"),
            listOf("a. Bersyukur ","b. Pemaaf ","c. Sopan "),
            listOf("a. Berdoa","b. Mandi","c. Bersuci")
        ),
        listOf(
            listOf("a. Batu atau tisu","b. Tanah liat","c. Dibiarkan saja"),
            listOf("a. Wudhu","b. Mandi","c. Istinja’"),
            listOf("a. Iman","b. Kecantikan","c. Ketampanan")
        ),
        listOf(
            listOf("a. Malaikat","b. Manusia","c. Nabi dan Rasul"),
            listOf("a. Nabi Adam AS","b. Nabi Muhammad AS","c. Nabi Yunus AS"),
            listOf("a. Semangat dan bekerja keras","b. Bermalas-malasan","c. Bekerja kita ingin saja")
        ),
        listOf(
            listOf("a. Bekerja sama","b. Menerima nasihat","c. Menolong teman"),
            listOf("a. Sarapan dulu","b. Memeriksa PR","c. Berdoa"),
            listOf("a. Ditambahkan ilmu pengetahuan","b. Uang jajan","c. Kesehatan")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(0,2,0),
        listOf(2,0,2),
        listOf(2,1,0),
        listOf(2,1,0),
        listOf(1,2,2),
        listOf(1,2,2),
        listOf(0,0,2),
        listOf(0,2,0),
        listOf(2,0,0),
        listOf(1,2,0)


    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas1, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerPai.scorePaiKelas1 < 1) 0 else scoreManagerPai.scorePaiKelas1 / 5

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGruppaiSD3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGruppaiSD3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGruppaiSD3c)

        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3

        )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalPaisd1[jawabanBenar][i]
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
                    var scorePaiSd = scoreManagerPai.scorePaiKelas1
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar++

                        if(jawabanBenar == soalPaisd1.size){
                            scorePaiSd +=5
                            scoreManagerPai.scorePaiKelas1 = scorePaiSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scorePaiSd +=5
                            scoreManagerPai.scorePaiKelas1 = scorePaiSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalPaisd1[jawabanBenar][i]
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