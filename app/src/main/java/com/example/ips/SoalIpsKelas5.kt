package com.example.ips

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.EnergyManager
import com.example.alat.ScoreManagerIps

import com.example.myapplication.R


class SoalIpsKelas5 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpssd5: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Kerajaan Islam pertama di Indonesia adalah ….
""", 0),
            Pair("""2. Berikut adalah peninggalan kerajaan Islam, kecuali …
""", 0),
            Pair("""3. Kerajaan Majapahit dikenal dengan kerajaan yang mempunyai ….
""", 0)),

        listOf(Pair("""4. Kerajaan Hindu tertua di Indonesia adalah kerajaan ….
""", 0),
            Pair("""5. Prasasti Batu Bertulis, Prasasti Tugu dan Prasasti Kebon Kopi adalah peninggalan kerajaan ….
""", 0),
            Pair("""6. Kerajaan Mataram Islam mencapai puncak kejayaan pada masa pemerintahan ….
""", 0)),

        listOf(Pair("""7. Berikut ini candi peninggalan Agama Hindu adalah candi . . . .
""", 0),
            Pair("""8. Candi Borobudur salah satu peninggalan sejarah Agama . . . .
""", 0),
            Pair("""9. Di Sriwijaya terdapat perguruan tinggi agama Budha , maha guru yang terkenal    adalah . . . .
""", 0)),

        listOf(Pair("""10. Mapandes adalah upacara potong...""", 0),
            Pair("""11.   Bhineka Tunggal Ika diambil dari kitab . . . .
""", 0),
            Pair("""12. Kitab Bustan Al Salatin  yang berisi riwayat sultan – sultan Aceh di karang oleh
""", 0)),

        listOf(Pair("""13.Tiang Masjid yang terbuat dari tatal atau potongan kayu terdapat pada masjid. . . . .
""", 0),
            Pair("""14.Julukan Ayam Jantan dari Timur ” diberikan belanda kepada . . . .
""", 0),
            Pair("""15.Pendiri Pondok Pesantren pertama di Indonesia . . . .
""", 0)),

        listOf(Pair("""16.Tugu Katulistiwa terdapat di kota . . . .
""", 0),
            Pair("""17. Bukit Barisan terdapat di Pulau . . . .
""", 0),
            Pair("""18.Sungai terpanjang di Indonesia adalah . . . .
""", 0)),

        listOf(Pair("""19.Garis Bujur 0 derajat melalui kota . . . .
""", 0),
            Pair("""20. Berikut ini yang bukan termasuk kenampakan alam adalah ….
""", 0),
            Pair("""21. Daratan yang menjorok ke laut dinamakan ….
""", 0)),

        listOf(Pair("""22. Wilayah Indonesia dibagi menjadi …. waktu.
""", 0),
            Pair("""23. Dataran tinggi Dieng terdapat di Provinsi ….
""", 0),
            Pair("""24. Kota Semarang, Palembang dan Padang termasuk wilayah Indonesia dengan pembagian waktu …
""", 0)),

        listOf(Pair("""25. Keanekaragaman suku-suku bangsa Indonesia antara lain dipengaruhi oleh ….
""", 0),
            Pair("""26. Suku Asmat, Bintuni dan Sentani berasal dari pulau ….
""", 0),
            Pair("""27. Upacara pembakaran jenazah di Bali dikenal dengan nama ….
""", 0)),

        listOf(Pair("""28. Berikut adalah suku-suku yang ada di pulau Jawa, kecuali ….
""", 0),
            Pair("""29. Alat musik berikut ini yang berasal dari daerah Nusa Tenggara adalah ….
""", 0),
            Pair("""30.Rumah adat Papua bernama . . . .
""", 0)),

        listOf(Pair("""31.Suku Asmat terdapat di pulau . . . .
""", 0),
            Pair("""32.Tari Reog berasal dari  kota . . . .
""", 0),
            Pair("""33.Lagu gundul – gundul pacul berasal dari . . . .
""", 0)),

        listOf(Pair("""34.Pertunjukan ondel – ondel berasal dari . . . .
""", 0),
            Pair("""35. Berikut yang tidak termasuk kebudayaan daerah Indonesia adalah ….
""", 0),
            Pair("""36. Tujuan Belanda datang ke Indonesia untuk ....        """, 0)),

        listOf(Pair("""37. Sistem tanam paksa pada masa penjajahan belanda disebut ....        """, 0),
            Pair("""38. Pertama kali belanda mendarat di indonesia dipimpin oleh Cornelis De Houtman di wilayah ....""", 0),
            Pair("""39. Pahlawan yang mendapat gelar ”Ayam Jantan dari Timur” adalah ....""", 0)),

        listOf(Pair("""40. Penderitaan para petani ini diungkapkan oleh Edward Douwes Dekker dalam buku ....""", 0),
            Pair("""41. Strategi perang Pangeran Diponegoro melawan Belanda adalah dengan ....""", 0),
            Pair("""42. Raja Sisingamangaraja XII memimpin rakyat batak melakukan perlawanan terhadap Belanda di daerah ....""", 0)),

        listOf(Pair("""43. Kerja paksa pada masa penjajahan Jepang disebut .…        
""", 0),
            Pair("""44. Sebab mengapa perjuangan bangsa Indonesia melawan penjajah sering mengalami kegagalan adalah ....""", 0),
            Pair("""45. Sarekat Islam adalah salah satu organisasi yang gigih melawan penjajah yang didirikan oleh ....""", 0)),

        listOf(Pair("""46. Pada tanggal 1 Maret 1943 Jepang membentuk suatu organisasi yang bertujuan memusatkan tenaga rakyat untuk mendukung Jepang yaitu ....""", 0),
            Pair("""47. Surat-surat dari R.A. Kartini diterbitkan menjadi sebuah buku oleh sahabatnya, J.H. Abendanon. Buku tersebut diterjemahkan Armijn Pane dengan judul ....""", 0),
            Pair("""48. Dua kota di Jepang yang dijatuhi bom atom oleh sekutu adalah ....""", 0)),

        listOf(Pair("""49. BPUPKI singkatan dari ....""", 0),
            Pair("""50. BPUPKI diketuai oleh ....""", 0),
            Pair("""51. Tujuan Jepang memberikan janji kemerdekaan kepada Indonesia adalah ....""", 0)),

        listOf(Pair("""52. Jepang menyerah tanpa syarat pada sekutu pada tanggal ....""", 0),
            Pair("""53. Para pemuda membawa Ir. Soekarno dan Drs. Moh. Hatta ke Rengasdengklok bertujuan untuk ....""", 0),
            Pair("""54. Sidang BPUPKI yang pertama menyepakai bahwa negara Indonesia berbentuk ....""", 0)),

        listOf(Pair("""55. Pembacaan teks proklamasi dilakukan di .... """, 0),
            Pair("""56. Sikap pahlawan yang bisa kita teladani adalah ....""", 0),
            Pair("""57. Sebagai siswa kita dapat meneruskan perjuangan para pahlawan dengan ....""", 0)),

        listOf(Pair("""58. Kemerdekaan bangsa indonesia diperoleh dari ....""", 0),
            Pair("""59. Tujuan mengheningkan cipta pada saat upacara adalah untuk ....""", 0),
            Pair("""60. Tujuan mengubah isi dalam Piagam Jakarta dari kalimat “Ketuhanan dengan berkewajiban menjalankan syariat-syariat Islam bagi para pemeluknya” dengan diganti dengan “Ketuhanan yang Maha Esa” adalah ....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Aceh   ","b. Demak   ","c. Gowa-Tallo  ","d. Samudra Pasai"),
            listOf("a. Masjid Demak","b. Menara Kudus","c. Candi Borobudur","d. Pondok Pesantren"),
            listOf("a. Permaisuri yang cantik-cantik  ","b. Angkatan darat yang banyak  ","c. Raja-raja yang bijak","d. Kekuatan maritim yang besar")
        ),
        listOf(
            listOf("a. Sriwijaya  ","b. Singasari   ","c. Kutai  ","d. Majapahit"),
            listOf("a. Majapahit  ","b. Demak   ","c. Tarumanegara","d. Gowa-Tallo"),
            listOf("a. Hayam Wuruk    ","b. Sultan Agung","c. Sultan Ageng Tirtayasa","d. Sultan Hasanudin")
        ),
        listOf(
            listOf("a. Prambanan                                     ","b. Pawon           ","c. Muaran Takus                                 ","d. Tikus"),
            listOf("a. Hindu                                               ","b. Budha       ","c. Animisme                                     ","d. Kong hu cu"),
            listOf("a. I Tsing                                             ","b. Dapunta Hyang   ","c. Sakyakirti                           ","d. Putra Dewa")
        ),
        listOf(
            listOf("a. gigi                                                 ","b. kuku   ","c. Rambut                                           ","d. Tumpang"),
            listOf("a. Arjuna Wiwaha                                 ","b. Sotasoma           ","c. Negara Kertagama                           ","d. Barata Yuda"),
            listOf("a. Nuruddi ar roini                                 ","b. Nurul ar roini     ","c. Sunan Giri                             ","d. Nuruddin")
        ),
        listOf(
            listOf("a. Demak                                             ","b. Banten       ","c. Baiturrahman                                     ","d. Menara Kudus"),
            listOf("a. Sultan Iskandar Muda                       ","b. Sultan Hasanuddin   ","c. Sultan Trenggono                     ","d. Sultan Ternate."),
            listOf("a. Sunan Ampel                                   ","b. Sunan Giri     ","c. Sunan Gersik                                 ","d. Sunan Bonang")
        ),
        listOf(
            listOf("a. Jakarta                                             ","b. Surabaya     ","c. Balik Papan                                   ","d. Pontianak"),
            listOf("a. Sumatra                                           ","b. Kalimantan     ","c. Jawa                                 ","d. Papua"),
            listOf("a. Batanghari                                       ","b. Kapuas       ","c. Bengawan Solo                                   ","d. Barito")
        ),
        listOf(
            listOf("a. Paris                                               ","b. London       ","c. Greenwich                                   ","d. Pontianak"),
            listOf("a. Sungai  ","b. Pelabuhan  ","c. Danau ","d. Gunung"),
            listOf("a. Lembah ","b. Teluk  ","c. Selat ","d. Tanjung")
        ),
        listOf(
            listOf("a. 3 bagian ","b. 4 bagian  ","c. 2 bagian ","d. 1 bagian"),
            listOf("a. Jawa Tengah ","b. Jawa timur ","c. Jawa barat ","d. Banten"),
            listOf("a. WITA  ","b. WIB   ","c. WIT  ","d. WIS")
        ),
        listOf(
            listOf("a. Perbedaan kondisi lingkungan yang ditempati","b. Persamaan lingkungan pulau yang ditempati","c. Banyaknya gunung berapi di Indonesia","d. Perbedaan jenis iklim antar pulau di Indonesia"),
            listOf("a. Kalimantan ","b. Sumatra  ","c. Papua ","d. Jawa"),
            listOf("a. Wiwit  ","b. Legong  ","c. Ngaben ","d. Kecak")
        ),
        listOf(
            listOf("a. Jawa  ","b. Sunda  ","c. Toraja ","d. Tengger"),
            listOf("a. Bonang ","b. Sasando  ","c. Popondi","d. Rebab"),
            listOf("a. Joglo                                               ","b. Betang     ","c. Kariwari                                     ","d. Gudang")
        ),
        listOf(
            listOf("a. Madura                                           ","b. Jawa       ","c. Sumatra                                       ","d. Papua."),
            listOf("a. Ponorogo                                         ","b. Bojonegoro     ","c. Purworejo                                 ","d. Malioboro"),
            listOf("a. Jawa Timur                                     ","b. Jawa Tengah       ","c. Jawa Barat                           ","d. Yogyakarta")
        ),
        listOf(
            listOf("a. Surabaya                                         ","b. Semarang           ","c. Jakarta                           ","d. Yogyakarta."),
            listOf("a. Tarian daerah","b. Lagu daerah  ","c. Bahasa daerah  ","d. Tanah daerah"),
            listOf("a. Bertamasya        ","b. Berdagang                ","c. Mengembara        ","d. Berpetualang")
        ),
        listOf(
            listOf("a. Cultuur Stelsel        ","b. Rodi                        ","c. Romusha                ","d. Devide et impera"),
            listOf("a. Sumatra                ","b. Banten                ","c. Jawa tengah        ","d. Kalimantan"),
            listOf("a. Pangeran Antasari                                   ","b. Imam Bonjol                                ","c. Sisingamangaraja XII     ","d. Sultan Hasanudin        ")
        ),
        listOf(
            listOf("a. max havelaar        ","b. Trias politica        ","c. Sutasoma                ","d. Raflesia"),
            listOf("a. Perang senjata        ","b. Perang gerilya        ","c. Perang bom                ","d. Perang saudara"),
            listOf("a. Jakarta                ","b. Tapanuli                ","c. Sulawesi                ","d. Makasar")
        ),
        listOf(
            listOf("a. Rodi                ","b. Kempetai                ","c. Sheikirei                 ","d. Romusha"),
            listOf("a. Kurangnya bahan makanan                ","b. Kurangnya pasokan senjata","c. Kurangnya persatuan dan kesatuan","d. Kurangnya orang-orang yang hebat"),
            listOf("a. Agus Salim                                        ","b. H.O.S Cokroaminoto","c. H. Samanhudi","d. K.H. Achmad Dahlan")
        ),
        listOf(
            listOf("a. Sinendan                ","b. Jawa Hokokai        ","c. Keibodan                ","d. Putera"),
            listOf("a. Habis gelap terbitlah matahari                ","b. Habis gelap terbitlah terang","c. Habis terang terlihat cahaya","d. Habis terang gelap tiada"),
            listOf("a. Tokyo dan Nagasaki                        ","b. Tokyo dan Kyoto","c. Hiroshima dan Nagasaki","d. Hiroshima dan Tokyo")
        ),
        listOf(
            listOf("a. Badan Persiapan Usaha-Usaha Perjuangan Kemerdekaan Indonesia","b. Badan Penyelidik Usaha-Usaha Persiapan Kemerdekaan Indonesia","c. Badan Penyelidik Usaha-Usaha Perjuangan Kemerdekaan Indonesia","d. Badan Penyelidik Usaha-Usaha Proklamasi Kemerdekaan Indonesia"),
            listOf("a. Ir. Soekarno                                ","b. Drs. Moh Hatta                                ","c. Dr. Radjiman Wedyodiningrat","d. Ki Hajar Dewantoro"),
            listOf("a. Agar Indonesia menjadi negara maju","b. Agar Indonesia mau membantu Jepang melawan sekutu","c. Agar Indonesia mau menyerah kepada Jepang","d. Agar Indonesia bisa diadu dengan sekutu")
        ),
        listOf(
            listOf("a. 17 Agustus 1945                                ","b. 15 Agustus 1945                                ","c. 14 Agustus 1945","d. 13 Agustus 1945"),
            listOf("a. Mengamankan Ir. Sokarno dan Drs. Moh. Hatta dari pengaruh Jepang","b. Memaksa Ir. Soekarno dan Drs. Moh. Hatta mundur dari PPKI","c. Memaksa Ir. Sokarno dan Drs, Moh. Hatta untuk meminta bantuan Jepang","d. Mengharap Ir. Sokarno dan Drs. Moh. Hatta untuk bergabung dengan sekutu"),
            listOf("a. Kerajaan                ","b. Kesultanan                ","c. Komunis                ","d. Republik")
        ),
        listOf(
            listOf("a. Rumah laksamana Tadashi Maeda        ","b. Rengasdengklok","c. Jalan Pegangsaan Timur No. 56        ","d. Istana merdeka"),
            listOf("a. Cinta negara lain                                ","b. Cinta tanah air","c. Mengkhianati bangsa","d. Melakukan pemberontokan"),
            listOf("a. Melawan negara lain                        ","b. Menghancurkan negara lain","c. Belajar dengan tekun","d. Menyerang negara penjajah")
        ),
        listOf(
            listOf("a. Hadiah negara lain                                ","b. Perjuangan bangsa sendiri","c. Kenang-kenangan Jepang","d. Bonus dari negara sekutu"),
            listOf("a. Istirahat sejenak                                ","b. Mengenang jasa pahlawan                ","c. Menghafal lagu","d. Meneruskan jasa pahlawan"),
            listOf("a. Menghormati pemeluk agama lain","b. Menyingkat kalimat yang terlalu panjang","c. Menghormati negara lain","d. Memudahkan pengucapan pembaca")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(3,2,3),
        listOf(2,2,1),
        listOf(0,1,2),
        listOf(0,1,0),
        listOf(0,1,2),
        listOf(3,0,1),
        listOf(2,1,3),
        listOf(0,0,1),
        listOf(0,2,2),
        listOf(2,1,2),
        listOf(3,0,1),
        listOf(2,3,1),
        listOf(0,1,3),
        listOf(0,1,1),
        listOf(3,2,2),
        listOf(3,1,2),
        listOf(1,2,1),
        listOf(1,0,3),
        listOf(2,1,2),
        listOf(1,1,0)







    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas5, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIps.scoreIpsKelas5 < 1) 0 else scoreManagerIps.scoreIpsKelas5 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSd3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSd3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSd3c)



        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3,


            )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalIpssd5[jawabanBenar6][i]
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

                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas5
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpssd5.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas5 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas5 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd5[jawabanBenar6][i]
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