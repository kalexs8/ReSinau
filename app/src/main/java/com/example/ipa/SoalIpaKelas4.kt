package com.example.ipa

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.EnergyManager
import com.example.alat.ScoreManagerIpa

import com.example.myapplication.R


class SoalIpaKelas4 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd4: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. jatuhnya benang sari ke kepala putik dinamakan ...""", 0),
            Pair("""2. Berikut adalah hewan yang mengalami metamorfosis sempurna, kecuali ...""", 0),
            Pair("""3. Berikut ini adalah fungsi akar tumbuhan, kecuali ...""", 0)),

        listOf(Pair("""4. Berikut ini pengelompokan hewan berdasarkan makanannya, kecuali ...""", 0),
            Pair("""5. Berikut hewan herbivora dari bangsa mamalia adalah ...""", 0),
            Pair("""6. Contoh di bawah ini yang tidak termasuk penyakit atau gangguan yang terjadi pada tulang adalah ...""", 0)),

        listOf(Pair("""7. Rangka manusia yang melindungi paru-paru dan jantung adalah ...""", 0),
            Pair("""8. Berikut yang bukan merupakan fungsi rangka dalam tubuh manusia adalah ...""", 0),
            Pair("""9. Alat pernafasan pada tumbuhan yang terdapat pada daun adalah ...""", 0)),

        listOf(Pair("""10. Bagian pangkal lidah sangat peka terhadap rasa ...""", 0),
            Pair("""11. Berikut ini adalah hal-hal yang dapat merusak ekosistem sungai, kecuali ...""", 0),
            Pair("""12. Contoh simbiosis parasitisme adalah ...""", 0)),

        listOf(Pair("""13. Urutan dari rantai makan di bawah ini yang benar adalah ...""", 0),
            Pair("""14. Berikut ini yang termasuk benda cair adalah ...""", 0),
            Pair("""15. Benda gas dapat menempati ruang, contohnya adalah ...""", 0)),

        listOf(Pair("""16. Berikut merupakan urutan daur hidup kupu-kupu adalah ...""", 0),
            Pair("""17. Hubungan antara dua makhluk hidup saling menguntungkan dinamakan ...""", 0),
            Pair("""18. Keuntungan yang diperoleh oleh kerbau yang dihinggapi burung jalak adalah ...""", 0)),

        listOf(Pair("""19. Dalam rantai makanan, rumput dan padi berperan sebagai ...""", 0),
            Pair("""20. Jika petani membasmi ular yang ada di sawah maka ...""", 0),
            Pair("""21. Benda yang mempunyai sifat ringan dan kedap air adalah ...""", 0)),

        listOf(Pair("""22. Peralatan dapur banyak yang menggunakan logam karena ...""", 0),
            Pair("""23. Berikut adalah sifat-sifat yang dimiliki kain adalah ...""", 0),
            Pair("""24. Contoh perubahan mencari terjadi pada ...""", 0)),

        listOf(
            Pair("""25. Menyublin adalah peristiwa perubahan benda dari ...""", 0),
            Pair("""26. Semua bentuk tarikan dan dorongan disebut ....""", 0),
            Pair("""27. Contoh gaya gesek adalah antara ....""", 0)),

        listOf(Pair("""28. Alat untuk mengukur besar kecilnya gaya adalah ....""", 0),
            Pair("""29. Piring yang dilempar jatuh kemudian pecah, hal itu membuktikan bahwa ....""", 0),
            Pair("""30. Contoh gaya pegas dapat kita lihat pada ....""", 0)),

        listOf(Pair("""31. Berikut ini adalah hal-hal yang mempengaruhi gerak jatuh benda karena gaya gravitasi, kecuali ....""", 0),
            Pair("""32. Kemampuan melakukan usaha disebut ....""", 0),
            Pair("""33. Pada zaman dahulu masyarakat membuat api dengan cara ....""", 0)),

        listOf(Pair("""34. Ketika kita memegang gagang teko yang terisi air panas, lalu tangan kita merasakan panas. Maka hal itu membuktikan bahwa energi panas dapat ....""", 0),
            Pair("""35. Terjadinya angin darat dan angin laut termasuk perpindahan panas dengan cara ….
""", 0),
            Pair("""36. Panas Matahari sampai ke bumi dengan cara ....""", 0)),

        listOf(Pair("""37. Benda yang tidak dapat menghantarkan panas dengan baik disebut ....""", 0),
            Pair("""38. Keadaan permukaan air laut yang naik sehingga air laut tampak bertambah banyak dan garis pantai bergeser naik disebut peristiwa ....""", 0),
            Pair("""39. Daerah pegunungan yang memiliki sedikit pepohonan bisa mudah terjadi ....""", 0)),

        listOf(Pair("""40. Matahari terlihat sangat kecil karena ....""", 0),
            Pair("""41. Pengikisan lapisan tanah yang disebabkan oleh gerakan air disebut ....""", 0),
            Pair("""42. Benda Langit yang memancarkan cahayanya sendiri adalah ....""", 0)),

        listOf(Pair("""43. Agar tidak mudah terkena erosi, maka tanah banyak ditanami tumbuhan karena ….
""", 0),
            Pair("""44. Indonesia mempunyai sumber daya alam yang melimpah karena .....""", 0),
            Pair("""45. Bahan berikut yang berasal dari tumbuhan adalah ....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Peneyrapan","b. Gravitasi","c. Penyerbukan","d. Fotosintesis"),
            listOf("a. Kupu-kupu","b. Kecoa","c. Lalat","d. Katak"),
            listOf("a. Memperkokoh tumbuhan","b. Menjadi alat pernapasan","c. Menyerap air dan zat ahra","d. Menyerap cahata matahari")
        ),
        listOf(
            listOf("a. Karnivora","b. Omnivora","c. Herbivora","d. Ovipar"),
            listOf("a. Kelinci, marmut, dan rusa","b. Burung pipit, jangkrik, dan sapi","c. Kerbau, kolibri, dan sapi","d. Belalang, sapi, dan kerbau"),
            listOf("a. Rakitis","b. Osteoporosis","c. Tifus","d. Folio")
        ),
        listOf(
            listOf("a. Rangka badan","b. Rangka tengkorak","c. Rangka anggota gerak","d. Rangka diafragma"),
            listOf("a. Sebagai alat peraba tubuh","b. Sebagai alat gerak tubuh","c. Melindungi organ-organ tubuh yang penting","d. Tempat melekatnya otot dan daging"),
            listOf("a. Fotogenesis","b. Pembuluh Floem","c. Fotosintesis","d. Stomata")
        ),
        listOf(
            listOf("a. Manis","b. Asin","c. Pahit","d. Asam"),
            listOf("a. Menebar racun ikan di sungai","b. Membuang limbah ke sungai","c. Membuang sampah di sungai","d. Memasang jala ikan di sungai"),
            listOf("a. Ikan hiu dan ikan remora","b. Cacing perut di tubuh manusia","c. Kerbau dan burung jalak","d. Bakteri Colli di tubuh manusia")
        ),
        listOf(
            listOf("a. Rumput - belalang - katak - elang - ular","b. Rumput - belalang - katak - ular - elang","c. Rumput - katak - belalang - ular - elang","d. Elang - ular - katak - belalang - rumput"),
            listOf("a. Susu","b. Tepung","c. Agar-agar","d. Lilin"),
            listOf("a. Udara yang ditiupkan ke dalam balon","b. Asap knalpot yang terasa panas","c. Angin yang bertiup kencang","d. Pohon tumbang tertipup angin")
        ),
        listOf(
            listOf("a. Telur - kepompong - ulat - kupu-kupu","b. Kupu-kupu - kepompong - ulat - telur","c. Telur - ulat - kupu-kupu - kepompong","d. Telur - ulat - kepompong - kupu-kupu"),
            listOf("a. Simbiosis mutualisme","b. Simbiosis organisme","c. Simbiosis komensalisme","d. Simbiosis parasitisme"),
            listOf("a. Kerbau bisa memakan kotoran burung jalak","b. Kutu di atas kulit kerbau hilang dimakan burung jalak","c. Kerbau bisa memakan burung jalak","d. Burung jalak bisa memakan daging kerbau yang gatal")
        ),
        listOf(
            listOf("a. Konsumen tingkat 2","b. Produsen","c. Konsumen tingkat 3","d. Konsumen tingkat 1"),
            listOf("a. Padi akan tumbuh subur","b. Jumlah tikus akan semakin turun","c. Jumlah belalang akan meningkat","d. Jumlah tikus akan semakin banyak"),
            listOf("a. Plastik","b. Kain","c. Besi","d. Logam")
        ),
        listOf(
            listOf("a. Sifatnya lunak dan ringan","b. Sifatnya elastis dan tahan panas","c. Sifatnya yang keras dan tahan lama","d. Sifatnya yang tahan panas dan ringan"),
            listOf("a. Keras dan ringan","b. Tahan panas dan air","c. Ringan dan menyerap air","d. Berat dan elastis"),
            listOf("a. Air panas yang berubah menjadi uap","b. Semen yang menjadi keras terkena air","c. Es batu yang berubah menjadi air","d. Kamper yang semakin lama semakin habis")
        ),
        listOf(
            listOf("a. Padat menjadi gas","b. Cair menjadi padat","c. Gas menjadi air","d. Padat menjadi cair"),
            listOf("a. Daya   ","b. Gaya   ","c. Energi  ","d. Kekuatan"),
            listOf("a. Ban mobil dan jalan raya    ","b. Kipas angin dan tembok    ","c. uah kelapa jatuh dan tanah","d. Dua magnet yang berdekatan")
        ),
        listOf(
            listOf("a. Speedometer  ","b. Dinamometer  ","c. Meteran   ","d. Penggaris"),
            listOf("a. Gaya dapat mengubah bentuk benda","b. Gaya dapat membuat benda diam menjadi bergerak","c. Gaya dapat membuat benda bergerak menjadi diam","d. Gaya dapat mengubah arah benda"),
            listOf("a. Kompor  ","b. Ketapel   ","c. Mobil  ","d. Kelerengsd")
        ),
        listOf(
            listOf("a. Berat benda  ","b. Bentuk benda ","c. Luas permukaan benda  ","d. Harga benda"),
            listOf("a. Energi   ","b. Gaya   ","c. Kekuatan   ","d. Daya"),
            listOf("a. Menggesek-gesek air   ","b. Menggosok telapak tangan ","c. Menggesekan dua batu ","d. Menggosok tubuh hewan")
        ),
        listOf(
            listOf("a. Menyengat  ","b. Berpindah   ","c. Melukai   ","d. Merubah"),
            listOf("a. Konduksi  ","b. Konveksi   ","c. Radiasi   ","d. Evaporasi"),
            listOf("a. Konduksi  ","b. Konduktor   ","c. Konveksi   ","d. Radiasi")
        ),
        listOf(
            listOf("a. Radiator  ","b. Kontraktor   ","c. Konduktor   ","d. Isolator"),
            listOf("a. Pasang surut  ","b. Naik surut   ","c. Pasang naik  ","d. Angin darat"),
            listOf("a. Tsunami  ","b. Gempa   ","c. Badai   ","d. Tanah longsor")
        ),
        listOf(
            listOf("a. Memang ukurannya kecil   ","b. Terletak jauh dari bumi   ","c. Terhalangi oleh awan","d. Terhalang oleh cahaya bulan"),
            listOf("a. Abrasi   ","b. Reboisasi   ","c. Erosi   ","d. Organisasi"),
            listOf("a. Bulan   ","b. Bumi   ","c. Planet   ","d. Bintang")
        ),
        listOf(
            listOf("a. Akar tumbuhan dapat menyimpan air","b. Air akan menghanyutkan tanaman","c. Akar tumbuhan dapat menahan tanah dari air","d. Tumbuhan banyak menampung zat hara tanah"),
            listOf("a. Tanahnya sangat tandus   ","b. Tanahnya sangat luas   ","c. Tanahnya sangat gersang","d. Tanahnya sangat subur"),
            listOf("a. Wol   ","b. Sutera   ","c. Kayu  ","d. Keju")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,1,3),
        listOf(3,0,2),
        listOf(0,0,3),
        listOf(2,3,1),
        listOf(1,0,0),
        listOf(3,0,1),
        listOf(1,3,0),
        listOf(2,2,2),
        listOf(0,1,0),
        listOf(1,0,1),
        listOf(3,0,2),
        listOf(1,1,3),
        listOf(3,2,3),
        listOf(0,2,3),
        listOf(2,3,3)




    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas4, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIpa.scoreIpaKelas4 < 1) 0 else scoreManagerIpa.scoreIpaKelas4 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupIpaSd3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupIpaSd3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupIpaSd3c)



        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3,


            )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalIpasd4[jawabanBenar6][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda6[jawabanBenar6][i][j-2]
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
            }else{
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
                        val ch1 = pilihanGanda6[jawabanBenar6][0][kunciJawaban6[jawabanBenar6][0]]
                        val ch2 = pilihanGanda6[jawabanBenar6][1][kunciJawaban6[jawabanBenar6][1]]
                        val ch3 = pilihanGanda6[jawabanBenar6][2][kunciJawaban6[jawabanBenar6][2]]

                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas4
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpasd4.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas4 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas4 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd4[jawabanBenar6][i]
                                    (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                    val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                    if (getData.second != 0) {
                                        getImg.setImageResource(getData.second)
                                        getImg.visibility = View.VISIBLE
                                    } else {
                                        getImg.visibility = View.GONE
                                    }
                                    for (j in 2 until (listRadiogrup[i].childCount)) {
                                        (listRadiogrup[i].getChildAt(j) as RadioButton).text =
                                            pilihanGanda6[jawabanBenar6][i][j - 2]
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
                    Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT)
                        .show()
                }
            }// end cek semua jawaban telah di centang
        }
        return view
    }
}