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
            Pair("""1. Apakah makna kemerdekaan bagi seorang pelajar ialah …..
""", 0),
            Pair("""2. Berikut ini yang bukan penyebab hancurnya perekonomian di awal masa kemerdekaan Indonesia ialah ……
""", 0),
            Pair("""3. Untuk membantu penyelesaian sengketa antara Indonesia dan Belanda, PBB membentuk KTN yang terdiri atas …….
""", 0)),

        listOf(Pair("""4. Pertempuran yang terjadi pada tanggal 10 November 1954 ialah …….
""", 0),
            Pair("""5. Siapakah tokoh pemuda yang pertama kali mengetahui bahwa Jepang telah menyerah?""", 0),
            Pair("""6. Supaya Indonesia mampu bersaing dengan produk-produk luar negeri, Sebaiknya Indonesia ……
""", 0)),

        listOf(Pair("""7. Kawasan Masyarakat ASEAN memiliki ciri ekonomi seperti berikut, kecuali …….
""", 0),
            Pair("""8. Berikut ini yang merupakan bentuk kerja sama ASEAN dibidang ekonomi, kecuali …..
""", 0),
            Pair("""9. Indonesia merupakan pelaku kegiatan ekspor impor merupakan peranan dan posisi Indonesia di ASEAN dalam bidang …….
""", 0)),

        listOf(Pair("""10. Pembentukan Masyarakat Ekonomi ASEAN (MEA) bertujuan untuk?""", 0),
            Pair("""11. Penanggulangan bencana alam merupakan bentuk kerja sama negara-negara ASEAN dalam bidang?""", 0),
            Pair("""12. Bentuk kerja sama ASEAN dalam bidang politik, ialah?""", 0)),

        listOf(Pair("""13. Kerja sama ASEAN di bidang pendidikan, ialah?""", 0),
            Pair("""14. Berikut ini adalah tujuan berdirinya ASEAN, kecuali?""", 0),
            Pair("""15. Mengadakan festival lagu dan lomba menyanyi negaraa-negaraa ASEAN merupakan contoh kerjasama dalam bidang?""", 0)),

        listOf(Pair("""16. Salah satu manfaat dengan adanya perkembangan alat transportasi, ialah?""", 0),
            Pair("""17. Sebuah tayangan di TV menampilkan sebuah festival budaya di salah satu daerah. Dampak dari adanya penayangan festival budaya tersebut, ialah?""", 0),
            Pair("""18. Manfaat ditemukan bola lampu, ialah?""", 0)),

        listOf(
            Pair("""19. Garis yang membagi bola bumi menjadi dua, yaitu bagian barat dan timur disebut garis ....""", 0),
            Pair("""20. Yang termasuk zona Waktu Indonesia Bagian Barat (WIB) antara lain ....""", 0),
            Pair("""21. Jika di Semarang pukul 09.00 maka di Merauke pukul ....""", 0)),

        listOf(Pair("""22. Selisih waktu antara Greenwich Mean Time (GMT) dengan zona  Waktu Indonesia Tengah (WITA) adalah ... jam?""", 0),
            Pair("""23. Berikut ini merupakan faktor penyebab banjir, kecuali ....""", 0),
            Pair("""24. Salah satu dampak banjir dalam bidang ekonomi adalah ....""", 0)),

        listOf(Pair("""25. Salah satu penyakit yang sering mendera pada musim hujan adalah ....""", 0),
            Pair("""26. Kekeringan, tanah tandus, pohon mati adalah gejala saat musim ....""", 0),
            Pair("""27. Pekerjaan yang tidak dipengaruhi oleh musim adalah ....""", 0)),

        listOf(Pair("""28. Daerah yang cocok dijadikan wilayah pertanian, perkebunan, peternakan, perindustrian, dan sentra-sentra bisnis adalah ....""", 0),
            Pair("""29. Ruang angkasa yang luasnya tidak terukur dan semua benda langit berada di dalamnya disebut ....""", 0),
            Pair("""30. Berikut merupakan penyebab pemanasan global, kecuali ....""", 0)),

        listOf(Pair("""31. Salah satu dampak pemanasan global yaitu ....""", 0),
            Pair("""32. Berikut ini yang bukan kegiatan untuk mengurangi pemanasan global adalah ....""", 0),
            Pair("""33. Komet yang terpanjang lintasannya dan muncul setiap 76 tahun sekali yaitu komet ....""", 0)),

        listOf(Pair("""34. Salah satu penemuan Galileo adalah ....""", 0),
            Pair("""35. Salah satu keunikan planet bumi dibandingkan dengan planet lainnya yaitu ....""", 0),
            Pair("""36. Ilmu yang mempelajari tentang benda langit serta fenomena-fenomena alam yang terjadi di luar atmosfer bumi disebut ....""", 0)),

        listOf(Pair("""37. Observatorium Bosscha merupakan tempat peneropongan bintang yang terletak di ....""", 0),
            Pair("""38. Alat yang digunakan untuk melihat benda angkasa luar yang sangat jauh agar tampak jelas dan besar adalah ....""", 0),
            Pair("""39. Organisasi kemasyarakatan yang dibentuk melalui musyawarah masyarakat setempat dalam rangka pelayanan pemerintahan dan kemasyarakatan yang ditetapkan oleh Desa atau Kelurahan dan dibina oleh Pemerintah disebut ....""", 0)),

        listOf(Pair("""40. Badan yang mengatur untuk memilih pemimpin yang berwibawa adalah lembaga ....""", 0),
            Pair("""41. Lembaga sosial terkecil dalam masyarakat adalah ....""", 0),
            Pair("""42. Salah satu fungsi lembaga pendidikan yaitu ....""", 0)),

        listOf(Pair("""43. Seorang lurah diangkat berdasarkan ....""", 0),
            Pair("""44. Lembaga ekonomi berikut termasuk Badan Usaha Milik Negara (BUMN), kecuali ....""", 0),
            Pair("""45. Pemilihan umum dilaksanakan di kabupaten dan provinsi untuk memilih ....""", 0)),

        listOf(Pair("""46. Faktor utama penyebab keanekaragaman suku bangsa, budaya, dan bahasa lokal di Indonesia adalah ....""", 0),
            Pair("""47. Hak pemerintah daerah untuk mengatur pemerintahan sendiri disebut ....""", 0),
            Pair("""48. Yang berperan dalam pengembangan budaya, ilmu pengetahuan, seni, lingkungan, dan pendidikan pada masyarakat yang ada pada suatu daerah atau negara adalah lembaga ....""", 0)),

        listOf(Pair("""49. Badan yang mengawasi obat dan makanan di Indonesia adalah ....""", 0),
            Pair("""50. Manusia adalah makhluk rasional yang berusaha dengan seefisien mungkin dan sebaik-baiknya dalam memakai sumber daya alam untuk memenuhi kebutuhan hidupnya. Oleh karena itu manusia disebut sebagai makhluk ....""", 0),
            Pair("""51. Untuk melaksanakan PHBS sekolah dapat bekerja sama dengan ....""", 0)),

        listOf(Pair("""52. Menghemat biaya pengharum ruangan adalah salah satu manfaat potpourri dalam bidang ....""", 0),
            Pair("""53. Berikut ini cara untuk menjaga udara yang bersih, kecuali ....""", 0),
            Pair("""54. Salah satu negara yang dikenal sebagai negara yang ramah lingkungan adalah ....""", 0)),

        listOf(Pair("""55. Berikut merupakan kegiatan Posyandu, kecuali ....""", 0),
            Pair("""56. Hasil interaksi manusia dengan lingkungan alam melalui kegiatan penghijauan adalah ....""", 0),
            Pair("""57. Segala sesuatu yang ada di lingkungan dan bukan makhluk hidup disebut komponen ....""", 0)),

        listOf(Pair("""58. Gotong royong antaranggota masyarakat untuk mencapai suatu tujuan merupakan contoh interaksi manusia dengan lingkungan .... """, 0),
            Pair("""59. Keberadaan komputer dapat memudahkan dan menunjang pembelajaran di sekolah. Hal tersebut merupakan salah satu manfaat komputer di bidang?""", 0),
            Pair("""60. Salah satu pengaruh penemuan listrik di bidang komunikasi, ialah?""", 0))
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. memperboleh kebebasan dalam melakukan pekerjaan","b. memiliki hak yang sama dalam memberikan pendapat","c. memiliki hak untuk memperoleh pendidikan","d. memperolah kebebasan memilih dalam pemilihan umum (pemilu)"),
            listOf("a. Kekosongan kas negara","b. Adanya pinjaman nasional","c. Inflasi yang sangat tinggi","d. Blokade ekonomi oleh Belanda"),
            listOf("a. Australia, Swedia, dan Belgia","b. Belgia, Amerika Serikat, dan Belgia","c. Amerika Serikat, Belgia, dan Swedia","d. Amerika Serikat, Australia, dan Belgia")
        ),
        listOf(
            listOf("a. Pertempuran Surabaya","b. Pertemuran Ambarawa","c. Pertempuran Bandung Lautan Api","d. Pertempuran Medan Area"),
            listOf("a. Sayuti Melik","b. Yusuf Kunto","c. Sutan Syahrir","d. Sukarni"),
            listOf("a. Menambah modal","b. Meningkatkan kwalitas barang","c. Meningkatkan penggunaan tenaga kerja","d. Menambah berbagai jenis produk")
        ),
        listOf(
            listOf("a. Iklim ekonomi menjadi kompetitif","b. Terjadi integrasi dengan adanya pasar tunggal","c. Perkembangan ekonomi terasa lambat","d. Terdapat usaha pemerataan ekonomi ASEAN"),
            listOf("a. Kawasan perdagangan bebas","b. Pembukaan pusat promosi ASEAN","c. Penyediaan cadangan pangan","d. Penawaran beasiswa pendidikan"),
            listOf("a. Ekonomi","b. Pendidikan","c. Sosial budaya","d. Politik")
        ),
        listOf(
            listOf("a. Memajukan teknologi komunikasi dan informasi","b. Meningkatkan stabilitas ekonomi negara-negara ASEAN","c. Menjaga negara-negara ASEAN supaya terhindar dari kriminalitas","d. Meningkatkan sumber daya manusia yang berkualitas"),
            listOf("a. Budaya","b. Politik","c. Sosial","d. IPTEK"),
            listOf("a. Menyediakan cadangan pangan untuk negara-negara ASEAN","b. Penandatanganan kesepakatan bersama ASEAN Tourism Agreement","c. Menegakkan Perjanjian Ekstradisi di Kawasan ASEAN","d. Penyelenggaraan pesta dua tahun sekali SEA GAMES")
        ),
        listOf(
            listOf("a. Perlindungan terhadap anak cacat","b. Pertukaran pelajar antar negara ASEAN","c. Mendirikan ASCC (ASEAN Socio Cultural Community)","d. Penanganan narkoba dan solusinya"),
            listOf("a. Memajukan kerja sama dalam bidang IPTEK","b. Memajukan perdamaian di kawasan Asia Tenggara","c. Mempercepat pertumbuhan ekonomi sosial budaya di Asia Tenggara","d. Memajukan persiapan perang negara-negara ASEAN melawan penjajah"),
            listOf("a. Perdagangan","b. Sosial budaya","c. Politik","d. industri")
        ),
        listOf(
            listOf("a. Kegiatan distribusi menjadi lebih mudah","b. Masyarakat kesulitan memenuhi kebutuhan","c. Harga semua barang menjadi sangat mahal","d. Membuat jalan menjadi macet"),
            listOf("a. Menimbulkan perpecahan antar warga","b. Menambah pengetahuan dan wawasan","c. Menimbulkan kesan sombong dan angkuh","d. Menimbulkan rasa iri dan benci"),
            listOf("a. Suasana menjadi gelap di malam hari","b. Komunikasi tidak terhalang jarak dan waktu","c. Dapat melakukan kegiatan di malam hari","d. Jarak antar tempat menjadi lebih dekat")
        ),
        listOf(
            listOf("a. bujur","b. lintang","c. khatulistiwa","d. astronomis"),
            listOf("a. Kalimantan Timur, Bali, dan Sulawesi","b. Papua dan Kepulauan Maluku","c. Jawa, Bali, dan Kepulauan Nusa Tenggara","d. Sumatera, Jawa, dan Madura"),
            listOf("a. 07.00","b. 08.00","c. 10.00","d. 11.00")
        ),
        listOf(
            listOf("a. 6","b. 7","c. 8","d. 9"),
            listOf("a. adanya daerah peresapan air","b. pendangkalan sungai akibat sampah","c. penebangan pohon yang berlebihan","d. curah hujan yang tinggi"),
            listOf("a. menimbulkan berbagai macam penyakit","b. pencemaran lingkungan","c. pemicu tanah longsor","d. kerusakan sarana dan prasarana")
        ),
        listOf(
            listOf("a. hepatitis","b. hipertensi","c. diare","d. vertigo"),
            listOf("a. kemarau","b. dingin","c. semi","d. gugur"),
            listOf("a. bercocok tanam","b. karyawan pabrik","c. pembuatan batu bata","d. petani garam")
        ),
        listOf(
            listOf("a. daerah pantai","b. dataran rendah","c. dataran tinggi","d. pegunungan"),
            listOf("a. tata surya","b. galaksi","c. jagad raya","d. astronomi"),
            listOf("a. efek rumah kaca","b. gas buang dari industri","c. pengrusakan hutan","d. perubahan iklim")
        ),
        listOf(
            listOf("a. menurunnya tinggi permukaan laut","b. meningkatnya temperatur udara","c. meningkatnya kesehatan masyarakat","d. meningkatnya tingkat kesuburan tumbuhan"),
            listOf("a. menanam pohon atau reboisasi","b. menggunakan energi alternatif ","c. meningkatkan penggunaan bahan bakar fosil","d. menghemat pemakaian energi listrik"),
            listOf("a. Halley","b. Encke","c. Biella","d. Halle-Bop")
        ),
        listOf(
            listOf("a. telegrap","b. mikroskop","c. stetoskop","d. termometer"),
            listOf("a. memiliki kawah berwarna biru","b. mempunyai cincin yang indah","c. dapat dihuni makhluk hidup","d. memiliki banyak satelit"),
            listOf("a. astronomi","b. astrologi","c. geografi","d. kosmologi")
        ),
        listOf(
            listOf("a. Semarang","b. Jakarta","c. Lembang","d. Malang"),
            listOf("a. mikroskop","b. teleskop","c. periskop","d. kaleidoskop"),
            listOf("a. Rukun Tetangga","b. Rukun Warga","c. Kelurahan","d. Kecamatan")
        ),
        listOf(
            listOf("a. politik","b. sosial","c. ekonomi","d. pendidikan"),
            listOf("a. individu","b. keluarga","c. RT","d. RW"),
            listOf("a. memelihara ketertiban dalam masyarakat","b. mengatur tata cara hubungan manusia dengan Tuhan","c. sebagai sarana untuk mewujudkan keadilan sosial","d. mempersiapkan anggota masyarakat untuk mencari nafkah")
        ),
        listOf(
            listOf("a. pemilihan langsung oleh penduduk","b. Surat Keputusan Bupati/Walikota","c. Surat Keputusan Gubernur","d. Surat Keputusan Presiden"),
            listOf("a. Persero","b. Perum/Perusahaan Umum","c. Perusahaan Jawatan","d. Koperasi"),
            listOf("a. kepala dinas","b. kepala daerah","c. kepala departemen","d. kepala divisi")
        ),
        listOf(
            listOf("a. bangsa Indonesia dibangun dari berbagai macam ras","b. kesamaan kondisi alam dari Sabang sampai Merauke","c. nenek moyang bangsa Indonesia berasal dari berbagai daerah","d. letak wilayah Indonesia yang sangat strategis"),
            listOf("a. otonomi daerah","b. sentralisasi","c. dekonsentrasi","d. ekonomi daerah"),
            listOf("a. sosial","b. ekonomi","c. budaya","d. agama")
        ),
        listOf(
            listOf("a. BPOM","b. WHO","c. Litbangkes","d. Depkes"),
            listOf("a. sosial","b. budaya","c. ekonomi","d. individu"),
            listOf("a. Puskesmas","b. Partai Politik","c. Karang Taruna","d. Koperasi")
        ),
        listOf(
            listOf("a. budaya","b. sosial","c. ekonomi","d. lingkungan"),
            listOf("a. menanam pohon","b. mengurangi penggunaan bahan bakar fosil","c. membakar sampah plastik","d. menggunakan energi alternatif"),
            listOf("a. Indonesia","b. Finlandia","c. Cina","d. India")
        ),
        listOf(
            listOf("a. imunisasi gratis","b. pengecekan tumbuh kembang","c. penyuluhan tentang makanan sehat untuk bayi","d. kerja bakti membersihkan lingkungan"),
            listOf("a. mendapatkan berbagai jenis ikan","b. tersedianya sumber air bersih","c. mudah mendapatkan susu dan daging","d. tersedianya bahan bakar fosil"),
            listOf("a. biotik","b. abiotik","c. biologis","d. ekosistem")
        ),
        listOf(
            listOf("a. alam","b. budaya","c. ekonomi","d. sosial"),
            listOf("a. Sosial","b. Budaya","c. Pendidikan","d. Ekonomi"),
            listOf("a. Komunikasi tidak terhalang jarak dan waktu","b. Sumber penerangan menjadi berkurang","c. Jarak antar tempat menjadi lebih dekat","d. Komunikasi semakin sulit danlambat")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,2,3),
        listOf(0,2,1),
        listOf(2,3,0),
        listOf(1,1,2),
        listOf(1,3,1),
        listOf(0,1,2),
        listOf(0,3,3),
        listOf(2,0,3),
        listOf(2,0,1),
        listOf(1,2,3),
        listOf(1,2,0),
        listOf(3,2,0),
        listOf(2,1,0),
        listOf(0,1,3),
        listOf(1,3,1),
        listOf(3,0,2),
        listOf(0,2,0),
        listOf(2,2,1),
        listOf(3,1,1),
        listOf(3,2,0)






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