package com.example.pai

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.EnergyManager
import com.example.alat.ScoreManagerPai
import com.example.myapplication.R


class SoalPaiKelas2 : Fragment() {

    private var jawabanBenar = 0
    private val soalPaisd2: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Dibawah ini adalah ayat Q.S. al-‘Asr ke …
""", R.mipmap.pai_kelas2_soal1),
            Pair("""2. Nabi Luth a.s. mengajak umatnya untuk meninggalkan perbuatan ...""", 0),
            Pair("""3. Gambar di bawah dibaca ...""", R.mipmap.pai_kelas2_soal3)),

        listOf(Pair("""4. Ucapan ... adalah salah satu cara memahasucikan Allah Swt.  
""", 0),
            Pair("""5. Berprilku bersih adalah salah satu yang mencerminkan Asmaul Husna ...""", 0),
            Pair("""6 . Kita harus senantiasa jujur baik dalam perkataan maupun…
""", 0)),

        listOf(Pair("""7 . Rasulullah terkenal sebagai pribadi yang jujur sehingga beliau mendapat julukan…
""", 0),
            Pair("""8 . Tidak mencontek ketika sedang ujian adalah contoh perbuatan jujur kepada…
""", 0),
            Pair("""9 . Berkata benar kepada guru maupun orang tua adalah contoh perilaku jujur kepada…
""", 0)),

        listOf(Pair("""10. Lawan kata jujur adalah…
""", 0),
            Pair("""11. Surat An-Naas terdiri atas berapa ayat?""", 0),
            Pair("""12. Surat An-Nas berisi pesan agar kita senantiasa meminta perlindungan kepada…
""", 0)),

        listOf(Pair("""13. Selain kejahatan setan dan jin, kita juga perlu berlindung dari kejahatan manusia misalnya…
""", 0),
            Pair("""14. “Ilaahinnaas” adalah bacaan Surat An-Naas ayat ke…
""", 0),
            Pair("""15.  سَبِلَ        Bacaan dari kalimat di samping yang benar adalah…
""", 0)),

        listOf(Pair("""16.  بَيْتِ         Huruf ت pada kalimat di samping mengandung harakat…
""", 0),
            Pair("""17. Allah SWT Maha Menciptakan bumi, langit, dan…
""", 0),
            Pair("""18. Sebagai manusia kita disebut Mahluk, sedang yang Maha Menciptakan dinamakan…
""", 0)),

        listOf(Pair("""19. Syukur yang paling ringan bagi kita adalah dengan mengucapkan…
""", 0),
            Pair("""20. Jika pekerjaan terasa berat untuk dilakukan sendiri, maka sebaiknya…
""", 0),
            Pair("""21. Di Indonesia, bekerja sama biasanya dikenal dengan kegiatan…
""", 0)),

        listOf(Pair("""22. Salah satu contoh perbuatan kerja sama yang bisa dilakukan bersama teman adalah…
""", 0),
            Pair("""23. Jangan hanya ingin menjadi manusia yang ditolong, tapi jadilah manusia yang…
""", 0),
            Pair("""24. Jadilah pribadi yang bersih dan sehat karena kebersihan adalah ciri-ciri…
""", 0)),

        listOf(Pair("""25. Mukmin yang kuat lebih dicintai daripada mukmin yang…
""", 0),
            Pair("""26. “Berikan keberkahan atas rezeki yang telah Engkau anugerahkan kepada kami” merupakan arti bacaan tentang…
""", 0),
            Pair("""27. “Segala puji bagi Allah yang telah memberikan makan dan minum…” merupakan arti bacaan tentang…
""", 0)),

        listOf(Pair("""28. Wudhu seseorang akan batal bila tidak membaca basmalah. Dalam wudhu, basmalah termasuk dalam…
""", 0),
            Pair("""29. Perbuatan berikut ini yang tidak membatalkan wudhu adalah…
""", 0),
            Pair("""30. Dalam berwudhu, sebaiknya kita…
""", 0)
        )
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. 1","b. 2","c. 3"),
            listOf("a. Tepuji","b. Maksiat","c. Benar"),
            listOf("a. Al-Kaddas","b. Ul-Quduus","c. Al-Qudduus")
        ),
        listOf(
            listOf("a. Subhanallah ","b. Alhamdulillah ","c. Allahu akbar"),
            listOf("a. ar-Rahman","b. ar-Rahiim","c. al-Quddus"),
            listOf("a. Perbuatan","b. Ucapan","c. Saat disuruh guru")
        ),
        listOf(
            listOf("a. Al-Ikhlas","b. Al-Amin","c. As-Shiddiq"),
            listOf("a. Teman","b. Diri sendiri","c. Allah"),
            listOf("a. Allah","b. Sesama manusia","c. Diri sendiri")
        ),
        listOf(
            listOf("a. Cerdas","b. Baik","c. Bohong"),
            listOf("a. 4","b. 5.","c. 6"),
            listOf("a. Allah","b. Malaikat","c. Nabi")
        ),
        listOf(
            listOf("a. Ajakan untuk belajar","b. Ajakan untuk mencuri","c. Ajakan utnuk beribadah"),
            listOf("a. 1","b. 2","c. 3"),
            listOf("a. Sa-ba-la","b. Sa-bi-la","c. La-bi-sa")
        ),
        listOf(
            listOf("a. Kasrah","b. Fathah","c. Dommah"),
            listOf("a. Bintang-bintang","b. Segala isinya","c. Planet-planet"),
            listOf("a. Al-Khaliq","b. Al-Ghaffar","c. Al-Malik")
        ),
        listOf(
            listOf("a. Basmalah","b. Hamdalah","c. Subhanallah"),
            listOf("a. Bekerja sama","b. Tolong-menolong","c. Tinggalkan saja"),
            listOf("a. Keadilan sosial","b. Persatuan","c. Gotong-royong")
        ),
        listOf(
            listOf("a. Mengerjakan ujian mandiri","b. Mengejek anak tetangga","c. Belajar sambil bermain"),
            listOf("a. Suka menolong","b. Suka ditolong","c. Suka melakukan apa saja"),
            listOf("a. Orang yang malas","b. Orang yang biasa saja","c. Orang yang beriman")
        ),
        listOf(
            listOf("a. Malas","b. Lemah","c. Bersih"),
            listOf("a. Doa sebelum tidur","b. Doa sebelum makan","c. Doa sesudah makan"),
            listOf("a. Doa sesudah makan","b. Doa sebelum makan","c. Doa bangun tidur")
        ),
        listOf(
            listOf("a. Sunnah Wudhu","b. Rukun Wudhu","c. Hal yang membatalkan Wudhu"),
            listOf("a. Buang air kecil","b. Buang angin","c. Minum air putih"),
            listOf("a. Bergegas agar tidak ketinggalan sholat","b. Memulai dari anggota badan sebelah kanan","c. Menghidupkan keran air dengan deras")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(1,1,2),
        listOf(0,2,0),
        listOf(1,1,1),
        listOf(2,2,0),
        listOf(1,2,1),
        listOf(0,1,0),
        listOf(1,0,2),
        listOf(2,0,2),
        listOf(1,1,0),
        listOf(1,2,1)




    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas2, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerPai.scorePaiKelas2 < 1) 0 else scoreManagerPai.scorePaiKelas2 / 5
        val energy = EnergyManager(requireContext())

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
            val getData = soalPaisd2[jawabanBenar][i]
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
                        var scorePaiSd = scoreManagerPai.scorePaiKelas2
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar++

                            if (jawabanBenar == soalPaisd2.size) {
                                scorePaiSd += 5
                                scoreManagerPai.scorePaiKelas2 = scorePaiSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scorePaiSd += 5
                                scoreManagerPai.scorePaiKelas2 = scorePaiSd
                                Toast.makeText(
                                    activity,
                                    R.string.segments_sukses,
                                    Toast.LENGTH_SHORT
                                ).show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalPaisd2[jawabanBenar][i]
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