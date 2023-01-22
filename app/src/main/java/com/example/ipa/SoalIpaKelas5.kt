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


class SoalIpaKelas5 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd5: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Zat-zat yang diperlukan dalam proses fotosintesis adalah….
""", 0),
            Pair("""2.Proses menghirup oksigen dan melepaskan karbondioksida disebut....""", 0),
            Pair("""3.Bagian alat pernapasan manusia yang berfungsi sebagai tempat pertukaran Oksigen dan Karbondioksida adalah….
""", 0)),

        listOf(Pair("""4. Cara cicak dan kadal melindungi diri dari musuh adalah ....""", 0),
            Pair("""5. Ciri-ciri tumbuhan yang hidup di air (hidrofit) adalah….
""", 0),
            Pair("""6. Berikut yang tidak dibutuhkan ketika fotosintesis adalah ….
""", 0)),

        listOf(Pair("""7. Katak dewasa bernafas dengan menggunakan ….
""", 0),
            Pair("""8. Gangguan pencernaan pada manusia berupa sering buang air besar adalah ….
""", 0),
            Pair("""9. Pada proses pernafasan dada pada manusia ketika udara dihirup maka ….
""", 0)),

        listOf(Pair("""10. Enzim amilase pada usus halus berfungsi untuk ….
""", 0),
            Pair("""11. Gerakan menarik makanan yang terjadi di kerongkongan dinamakan gerakan ….
""", 0),
            Pair("""12. Alur peredaran darah besar yang benar adalah sebagai berikut ….
""", 0)),

        listOf(Pair("""13. Perhatikan pohon-pohon di bawah ini
i) Mangga 
ii) Kentang 
iii) Bambu 
iv) Apel 
v) Durian
Tumbuhan di atas yang menyimpan cadangan makanannya pada buah adalah ….
""", 0),
            Pair("""14. Tumbuhan yang memiliki cadangan makanan pada umbi adalah ….
""", 0),
            Pair("""15. Yang termasuk hewan langka dan hamper punah adalah ….
""", 0)),

        listOf(Pair("""16. Jenis bahan pakaian yang cocok dengan lingkungan dingin adalah ….
""", 0),
            Pair("""17. Perubahan zat yang menimbulkan zat baru dan sifatnya tetap disebut perubahan ...""", 0),
            Pair("""18. Perhatikan perubahan benda berikut
(1) singkong menjadi tape
(2) cokelat yang dilelehkan
(3) kayu yang dibakar
(4) garam yang dilarutkan dalam air
Perubahan benda yang sifatnya sementara adalah....
""", 0)),

        listOf(Pair("""19. Jenis-jenis penyakit yang berhubungan dengan alat pencernaan manusia adalah ….
""", 0),
            Pair("""20. Penyesuaian diri makhluk hidup terhadap lingkungan dinamakan….
""", 0),
            Pair("""21. Bentuk paruh yang dimiliki burung menyesuaikan ….
""", 0)),

        listOf(Pair("""22. Unta mempunyai punuk di punggungnya yang berguna untuk ….
""", 0),
            Pair("""23. Kemampuan bunglon merubah warna tubuhnya disebut ….
""", 0),
            Pair("""24. Berikut ini adalah ciri-ciri yang dimiliki tumbuhan teratai adalah ….
""", 0)),

        listOf(Pair("""25. Fungsi paruh bebek yang lebar dan tipis adalah ….
""", 0),
            Pair("""26. Semua benda yang ada di alam ini meliputi tiga wujud yaitu ….
""", 0),
            Pair("""27. Perubahan benda cair menjadi padat dinamakan ….
""", 0)),

        listOf(Pair("""28. Berikut ini adalah contoh dari peristiwa menyublim adalah ….
""", 0),
            Pair("""29. Perubahan benda yang dapat kembali ke bentuk asalnya dinamakan ….
""", 0),
            Pair("""30. Buah yang busuk akan mengalami perubahan pada hal-hal berikut, kecuali ….
""", 0)),

        listOf(Pair("""31. Katrol yang tidak berubah posisinya saat memindahkan benda disebut katrol ...""", 0),
            Pair("""32. Contoh penggunaan roda berporos adalah ....""", 0),
            Pair("""33. Berikut  adalah  sifat-sifat yang dimiliki oleh cahaya, kecuali ....""", 0)),

        listOf(Pair("""34. Sinar matahari dapat masuk ke ruangan melalui lubang. Hal itu menandakan bahwa cahaya ....""", 0),
            Pair("""35. Bayangan yang dihasilkan oleh cermin cembung adalah ....""", 0),
            Pair("""36. Mikroskop digunakan untuk melihat ....""", 0)),

        listOf(Pair("""37. Contoh penggunaan cermin cekung adalah pada alat ....""", 0),
            Pair("""38. Lensa yang dekat ke mata pada mikroskop disebut ....""", 0),
            Pair("""39. Lapisan  terluar  bumi  kita adalah ....""", 0)),

        listOf(Pair("""40. Lapisan atmosfer bumi terdiri atas ....""", 0),
            Pair("""41. Batuan  yang  terbentuk dari pembekuan lava atau magma disebut ....""", 0),
            Pair("""42. Contohnya batuan beku dalam atau intrusi adalah ....""", 0)),

        listOf(Pair("""43. Batuan yang mengendap di atas permukaan bumi disebut ....""", 0),
            Pair("""44. Bumi tersusun atas tiga lapisan yaitu ....""", 0),
            Pair("""45. Berikut  yang  bukan  tindakan  penghematan  air adalah ....""", 0))
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a.klorofil, cahaya matahari, oksigen","b.klorofil, cahaya matahari, karbon monoksida","c.klorofil, cahaya matahari, karbondioksida","d.klorofil, cahaya matahari, cahaya lampu"),
            listOf("a.pencernaan","b.peredaran oksigen","c.pernapasan","d.peredaran karbondioksida"),
            listOf("a.trakea","b.bronkus","c.alveolus","d.tenggorokan")
        ),
        listOf(
            listOf("a.otonomi","b.lari secepatnya","c.autotomi","d.melawannya"),
            listOf("a.daun lebar, berduri berlapis, lilin","b.batang berongga, stomata sedikit, akar panjang","c.berakar panjang, daun kecil seperti duri,berlapis lilin","d.berakar banyak, daun lebar, batang berongga"),
            listOf("a. Sinar matahari ","b. Oksigen ","c. Karbondioksida ","d. Air")
        ),
        listOf(
            listOf("a. Paru-paru ","b. Trakea ","c. Kulit ","d. Insang"),
            listOf("a. Diare ","b. Leukimia ","c. Maag ","d. Radang usus buntu"),
            listOf("a. Tulang rusuk terangkat dan rongga dada membesar","b. Tulang rusuk mengendur dan rongga dada membesar","c. Tulang rusuk terangkat dan rongga dada mengecil","d. Tulang rusuk mengendur dan rongga dada mengecil")
        ),
        listOf(
            listOf("a. Mengubah lemak menjadi asam lemak ","b. Mengubah protein menjadi asam amino ","c. Menghancurkan zat tepung menjadi gula","d. Mengubah protein menjadi pepton"),
            listOf("a. Percernaan ","b. Peristaltik ","c. Hidrolik ","d. Kimiawi"),
            listOf("a. Jantung (bilik kanan) – seluruh tubuh – jantung (serambi kanan)","b. Jantung (bilik kiri) – paru-paru – jantung (serambi kanan)","c. Jantung (Serambi kiri) – seluruh tubuh – jantung (serambi kanan)","d. Jantung (bilik kiri) – seluruh tubuh – jantung (serambi kanan)")
        ),
        listOf(
            listOf("a. i , ii , iii ","b. i , iii , v ","c. i , iv , v","a. Singkong, talas, ketela dan jambu"),
            listOf("b. Singkong, talas, ketela dan sagu","c. Singkong, talas, ketela dan bawang merah","d. Singkong, bawang putih, ketela dan jambu","a. ayam, kucing, dan anjing"),
            listOf("b. harimau, badak, burung cenderawasih","c. burung cenderawasih, elang jawa, badak bercula satu","d. badak, burung cenderawasih, ayam potong","a. wol ")
        ),
        listOf(
            listOf("b. nilon","c. katun ","d. polister","a. kimia "),
            listOf("b. fisika","c. biologi ","d. warna","a. (1) dan (2)"),
            listOf("b. (2) dan (4)","c. (3) dan (4)","d. (1) dan (3)","a. mag, tifus asma")
        ),
        listOf(
            listOf("b. sariawan, asma, bronkitis","c. sariawan, gusi berdarah, diare","d. gusi berdarah, radang tenggorokan, TBC","a. Organisasi "),
            listOf("b. Habitat ","c. Ekosistem ","d. Adaptasi","a. Jenis telurnya "),
            listOf("b. Jenis bulunya ","c. Jenis makanannya ","d. Jenis sarangnya","a. Menyimpan cadangan makanan dan air ")
        ),
        listOf(
            listOf("b. Melindungi diri dari pemangsa ","b. Mendinginkan pasir gurun ","d. Menarik perhatian betina","a. Autotomi "),
            listOf("b. Ekolokasi ","c. Mimikri ","d. Reboisasi","a. Memiliki daun berbentuk duri "),
            listOf("b. Memiliki daun tipis dan lebar ","c. Memiliki daun lebar tebal","d. Memiliki daun panjang menyirip","a. Menyaring makanan dari air ")
        ),
        listOf(
            listOf("b. Menggaruk tanah ","c. Meminum air sebanyak-banyaknya","d. Mengoyak daging","a. Padat, cair dan keras "),
            listOf("b. Gas, padat dan beku ","c. Padat, keras dan gas ","d. Cair, padat dan gas","a. Membeku "),
            listOf("b. Mencair ","c. Menyublim ","d. Menguap","a. Air panas yang menguap ")
        ),
        listOf(
            listOf("d. Balok es yang mencair ","c. Air yang membeku di kulkas","d. Kapur barus yang lama-lama habis","a. Perubahan berkala "),
            listOf("b. Perubahan baru ","c. Perubahan sementara","d. Perubahan tetap","a. Baunya "),
            listOf("b. Warnanya ","c. Bentuknya ","d. Namanya","a. majemuk   ")
        ),
        listOf(
            listOf("b. rangkap   ","c. bebas  ","d. tetap","a. katrol dan  baut   "),
            listOf("b. sepeda dan mobil","c. sepatu dan sandal  ","d. pisau dan skop","a. dapat dipantulkan  "),
            listOf("b. dapat dibiaskan   ","c. merambat lurus","d. merambat berbalik","a. merambat lurus   ")
        ),
        listOf(
            listOf("b. dapat diuraikan   ","c. dapat menembus benda bening","d. dapat dibiaskan","a. semu, tegak, diperkecil   "),
            listOf("b. semu,  terbalik,  diperkecil","c. nyata, tegak, diperbesar   ","d. nyata,  terbalik,  diperbesar","a. benda-benda yang ada dilangit    "),
            listOf("b. benda-benda yang ukurannya sangat kecil  ","c. benda-benda di tempat jauh","d. benda-benda di permukaan laut","a. spion mobil  ")
        ),
        listOf(
            listOf("b. kaca rias   ","c. senter   ","d. kaca jendela","a. lensa obyektif "),
            listOf("b. lensa pembalik  ","c. lensa okuler ","d. lensa cembung","a. kerak bumi  "),
            listOf("b. mantel bumi   ","c. inti bumi  ","d. lapisan udara","a. batuan  ")
        ),
        listOf(
            listOf("b. gas-gas   ","c. cairan sedimen  ","d. tanah","a. batuan beku  "),
            listOf("b. batuan endapan  ","c. batuan sedimen     ","d. batuan metamorf","a. batu apung dan batu granit   "),
            listOf("b. batu padas dan batu bata   ","c. batu kapur dan batu kuarsa","d. batu kuarsa dan batu apung","a. batuan beku dalam    ")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,2,2),
        listOf(2,3,1),
        listOf(0,0,0),
        listOf(2,1,3),
        listOf(2,2,1),
        listOf(0,1,1),
        listOf(2,3,2),
        listOf(0,2,1),
        listOf(0,3,0),
        listOf(3,2,3),
        listOf(3,1,3),
        listOf(0,0,1),
        listOf(2,2,0),
        listOf(1,0,0),
        listOf(1,0,1)





    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas5, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIpa.scoreIpaKelas5 < 1) 0 else scoreManagerIpa.scoreIpaKelas5 / 5
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
            val getData = soalIpasd5[jawabanBenar6][i]
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

                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas5
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpasd5.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas5 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas5 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd5[jawabanBenar6][i]
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