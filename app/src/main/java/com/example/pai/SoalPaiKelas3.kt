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


class SoalPaiKelas3 : Fragment() {

    private var jawabanBenar = 0
    private val soalPaisd3: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Sikap yakin dengan kemampuan diri sendiri disebut…
""", 0),
            Pair("""2. Sebagai seorang muslim kita harus berperilaku percaya diri, karena…….adalah sifat setan.
""", 0),
            Pair("""3. Sikap percaya diri saat menghadapi ujian ditunjukkan dengan cara…
""", 0)),

        listOf(Pair("""4. Selain percaya diri, kita juga perlu bersikap mandiri. Keuntungan perilaku mandiri adalah…
""", 0),
            Pair("""5. “Pertolongan” adalah arti dari Surat…
""", 0),
            Pair("""6. Dalam menghadapi ujian dan cobaan kita tidak boleh berputus asa karena pasti akan ada…
""", 0)),

        listOf(Pair("""7. Surat An-Nasr bisa kita jadikan bacaan dalam sholat terutama setelah membaca…
""", 0),
            Pair("""8. اَفْوَاجًا    Bacaan yang benar untuk kalimat di samping adalah…
""", 0),
            Pair("""9. دُوْعًا         Huruf  د pada kalimat di samping memiliki harakat…
""", 0)),

        listOf(Pair("""10. Allah itu Maha Esa. Esa artinya adalah tunggal, yang berarti bahwa…
""", 0),
            Pair("""11. Karena kita meyakini bahwa Allah itu Esa, maka kita tidak boleh percaya kepada…
""", 0),
            Pair("""12. Saat memberikan bantuan kepada orang lain, kita sebaiknya....""", 0)),

        listOf(Pair("""13. Jika tidak ikhlas dalam membantu orang lain, maka kita juga tidak akan mendapat…
""", 0),
            Pair("""14. Berbakti, taat, serta santun adalah contoh tanggung jawab kita kepada…
""", 0),
            Pair("""15. Pada hari Jumat Fahri bolos sekolah karena takut disuruh guru agama mengisi ceramah. Sikap Fahri mencerminkan perilaku…
""", 0)),

        listOf(Pair("""16. Bila seseorang tidak bertanggung jawab, maka lama-kelamaan dirinya akan….
""", 0),
            Pair("""17. Berusaha untuk bertawaduk, artinya kita sedang menjauhkan diri dari sifat…
""", 0),
            Pair("""18. Tono sering kali pamer saat berinfak maupun menyumbangkan makanan ke panti asuhan. Sikap Tono tidak mencerminkan perilaku…
""", 0)),

        listOf(Pair("""19. Sholat adalah kewajiban yang ditentukan waktunya atas orang-orang beriman. Karena wajib, barangsiapa yang tidak sholat maka dirinya akan mendapat…
""", 0),
            Pair("""20. Sholat artinya…
""", 0),
            Pair("""21. Takbir pertama dalam sholat disebut…
""", 0)),

        listOf(Pair("""22. Jika seseorang lupa niat, maka hukum sholatnya adalah…
""", 0),
            Pair("""23. Berikut yang merupakan hikmah sholat adalah…
""", 0),
            Pair("""24. Salah satu kelebihan yang Allah berikan kepada Nabi Yusuf AS yaitu…
""", 0)),

        listOf(Pair("""25. Dari kisah Nabi Syu’aib kita bisa belajar bahwa saat berjualan harus jujur dan tidak boleh…
""", 0),
            Pair("""26. Mengerjakan suatu kebaikan dengan niat hanya kepada Allah Swt adalah …
""", 0),
            Pair("""27. Cara memohon pertolongan kepada Allah Swt. dengan  …
""", 0)),

        listOf(Pair("""28. Arti Surat Al Kausar adalah . . . 
""", 0),
            Pair("""29. Surat Al Kautsar terdiri dari....ayat
""", 0),
            Pair("""30. Surat Al Kautsar diturunkan di kota . . . 
""", 0)),

        listOf(Pair("""31. Allah mempunyai Asmaul husna Al 'Alim yang artinya ...""", 0),
            Pair("""32. Di antara bentuk pengamalan dari keyakinan terhadap Al 'Alim adalah...""", 0),
            Pair("""33. Allah mempunyai Asmaul husna As-Sami’ yang artinya ...""", 0)),

        listOf(Pair("""34. Bersyukur adalah rasa  … kepada Allah Swt.
""", 0),
            Pair("""35. Sebagai rasa syukur atas nikmat Allah yang banyak, kita harus ....""", 0),
            Pair("""36. Zikir artinya … Allah Swt
""", 0)),

        listOf(Pair("""37. Berdoa artinya … sesuatu
""", 0),
            Pair("""38. Dalam bacaan zikir sesudah sholat ada yang disebut istigfar berbunyi …
""", R.mipmap.pai_kelas3_soal38),
            Pair("""39. Dibawah ini adalah doa …
""", R.mipmap.pai_kelas3_soal39)),

        listOf(Pair("""40. Perilaku Nabi Ibrahim yang perlu kita teladani dalam hal akidah adalah ...""", 0),
            Pair("""41. Sifat Nabi Ismail yang bisa kita tiru terhadap ayahnya adalah ...""", 0),
            Pair("""42. Ketika nabi ibrahim menyembelih putranya, iblis datang menggodanya. Namun akhirnya nabi Ibrahim a.s ....""", 0)),

        listOf(Pair("""43. Saat Nabi Ismail diperintah akan disembelih oleh ayahnya maka ia tetap ...""", 0),
            Pair("""44. Allah Mengetahui segala sesuatu, meskipun itu tersembunyi  itu alasannya Allah ialah …
""", 0),
            Pair("""45. Allah mendengar lebih dari yang kita ucapkan, adalah pengamalan dari asmaul husna ...""", 0)
        )
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Percaya diri","b. Percaya dengan teman","c. Jujur"),
            listOf("a. Malas","b. Ragu-ragu","c. Baik"),
            listOf("a. Optimis dan tidak perlu belajar sebelum ujian","b. Semangat ujian karena bisa mencontek","c. Mempersiapkan diri dengan cara belajar di rumah")
        ),
        listOf(
            listOf("a. Menyusahkan diri sendiri","b. Tidak menyusahkan orang lain","c. Mendapat banyak uang"),
            listOf("a. Al-Ikhlas","b. An-Nasr","c. Al-Fatihah"),
            listOf("a. Kesulitan yang berlipat ganda","b. Pertolongan dari Allah","c. Ujian dan cobaan yang lebih berat")
        ),
        listOf(
            listOf("a. Niat","b. Surat Al-Fatihah","c. Salam"),
            listOf("a. Af-wa-jan","b. Afa-wa-jan","c. Jan-waf-a"),
            listOf("a. Fathah","b. Kasrah","c. Dommah")
        ),
        listOf(
            listOf("a. Tiada Tuhan Selain Allah","b. Allah adalah Maharaja","c. Allah adalah Maha Pemaaf"),
            listOf("a. Perkataan teman yang baik","b. Perkataan penceramah","c. Perkataan dukun dan ramalan nasib"),
            listOf("a. Memberi dengan mengharapkan imbalan","b. Ikhlas","c. Meminta upah")
        ),
        listOf(
            listOf("a. Dosa","b. Pahala","c. Uang"),
            listOf("a. Diri sendiri","b. Allah","c. Orang tua"),
            listOf("a. Percaya diri","b. Lari dari tanggung jawab","c. Mandiri")
        ),
        listOf(
            listOf("a. Dipercaya teman","b. Tidak dipercaya orang","c. Baik-baik saja"),
            listOf("a. Baik hati","b. Menyombongkan diri","c. Tanggung jawab"),
            listOf("a. Percaya diri","b. Jujur","c. Tawaduk")
        ),
        listOf(
            listOf("a. Dosa","b. Pahala","c. Tidak mendapat apa-apa"),
            listOf("a. Ibadah","b. Doa","c. Syukur"),
            listOf("a. Takbiran","b. Takbiratul ihram","c. Takbir intiqal")
        ),
        listOf(
            listOf("a. Sah","b. Kurang sempurna","c. Batal"),
            listOf("a. Kaya raya","b. Hidup tambah miskin","c. Mendekatkan diri kepada Allah SWT"),
            listOf("a. Nabi Yusuf bisa menafsirkan mimpi","b. Nabi Yusuf membuat kapal di atas bukit","c. Nabi Yusuf tongkatnya dapat membelah lautan")
        ),
        listOf(
            listOf("a. Mengurangi takaran dan timbangan","b. Menaikkan harga menjadi lebih mahal","c. Memberikan lebih sebagai tanda syukur"),
            listOf("a. Ikhlas ","b. Sabar","c. jujur"),
            listOf("a. Bertawakal ","b. Bersabar ","c. Berdoa")
        ),
        listOf(
            listOf("a. Berkurban","b. Melaksanakan shalat","c. Nikmat yang banyak"),
            listOf("a. Dua ayat","b. Tiga ayat","c. Empat ayat"),
            listOf("a. Mekah","b. Jeddah","c. Bagdad ")
        ),
        listOf(
            listOf("a. Maha pengasih","b. Maha penyayang","c. Maha menyelamatkan"),
            listOf("a. Rajin dalam menimba ilmu","b. Bersikap pemaaf kepada sesama","c. Berusaha menghindari kemungkaran"),
            listOf("a. Maha penyayang","b. Maha mengetahui","c. Maha Mendengar")
        ),
        listOf(
            listOf("a. Berterima kasih","b. Bertanggung jawab","c. Berdoa"),
            listOf("a. Shalat Jika mendapatkan uang","b. Menggunakan ni'mat Allah semuanya","c. Bersyukur dengan shalat dan berkurban jika mampu"),
            listOf("a. Melihat ","b. Mengingat","c. Bersuci kepada ")
        ),
        listOf(
            listOf("a. Bersyukur atas","b. Mengingat","c. Memohon  "),
            listOf("a.","b.","c."),
            listOf("a. Doa untuk kedua orang tua","b. Doa dibimbing ke jalan yang baik","c. Doa kebaikan dunia dan akhirat")
        ),
        listOf(
            listOf("a. Menyayangi anaknya","b. Tidak pernah menyekutukan Allah  ","c. Belajar dengan rajin"),
            listOf("a. Merasa kasihan","b. Membangunkan rumah","c. Tidak pendendam"),
            listOf("a. Tetap melaksanakan","b. Mengurungkan ","c. Ragu-ragu")
        ),
        listOf(
            listOf("a. Kabur ","b. Menolaknya","c. Ikhlas karena perintah Allah SWT"),
            listOf("a. al-Quddus","b. al-‘Alim","c. as-Salam"),
            listOf("a. al-‘Alim","b. as-Salam.","c. as-Sami‘")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(0,1,2),
        listOf(1,1,1),
        listOf(1,0,2),
        listOf(0,2,1),
        listOf(1,2,1),
        listOf(1,1,2),
        listOf(0,1,1),
        listOf(2,2,0),
        listOf(0,0,2),
        listOf(2,1,0),
        listOf(2,2,2),
        listOf(0,2,1),
        listOf(2,0,2),
        listOf(1,2,0),
        listOf(2,1,2)



    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas3, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerPai.scorePaiKelas3 < 1) 0 else scoreManagerPai.scorePaiKelas3 / 5
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
            val getData = soalPaisd3[jawabanBenar][i]
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
                    val ch1 = pilihanGanda[jawabanBenar][0][kunciJawaban[jawabanBenar][0]]
                    val ch2 = pilihanGanda[jawabanBenar][1][kunciJawaban[jawabanBenar][1]]
                    val ch3 = pilihanGanda[jawabanBenar][2][kunciJawaban[jawabanBenar][2]]
                    var scorePaiSd = scoreManagerPai.scorePaiKelas3
                    if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                        jawabanBenar++

                        if (jawabanBenar == soalPaisd3.size) {
                            scorePaiSd += 5
                            scoreManagerPai.scorePaiKelas3 = scorePaiSd
                            Toast.makeText(
                                activity,
                                "Selamat anda telah menyelesaikan misi",
                                Toast.LENGTH_SHORT
                            ).show()
                            done = true
                        } else {
                            scorePaiSd += 5
                            scoreManagerPai.scorePaiKelas3 = scorePaiSd
                            Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                .show()
                            // refresh ui
                            for (i in 0 until (listRadiogrup.size)) {
                                val getData = soalPaisd3[jawabanBenar][i]
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
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT)
                    .show()
            }
        }// end cek semua jawaban telah di centang
        }
        return view
    }
}