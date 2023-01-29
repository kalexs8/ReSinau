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


class SoalIpsKelas3 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpssd3: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Penebangan liar di hutan dapat mengakibatkan ...""", 0),
            Pair("""2. Salah satu alat yang dapat membantu menunjukkan arah adalah ...""", 0),
            Pair("""3. Untuk mencegah erosi, tanah-tanah di lahan perbukitan dibuat ...""", 0)),

        listOf(Pair("""4. Utara pada gambar arah mata angin ditunjukkan ke bagian ...""", 0),
            Pair("""5. Berikut ini adalah tempat-tempat umum yang ada di desa, kecuali ...""", 0),
            Pair("""6. Kenampakan lingkungan alam merupakan ciptaan ...""", 0)),

        listOf(Pair("""7. Lingkungan yang sudah ada dengan sendirinya tanpa dibuat oleh manusia dinamakan lingkungan ...""", 0),
            Pair("""8. Genangan air yang luas yang dikelilingi daratan dinamakan ...""", 0),
            Pair("""9. Sawah dimanfaatkan oleh petani untuk ...""", 0)),

        listOf(Pair("""10. Berikut ini yang termasuk lingkungan buatan adalah ...""", 0),
            Pair("""11. Kerjasama dapat membuat diri kita mempunyai ...""", 0),
            Pair("""12. Berikut yang bukan manfaat kerjasama adalah ...""", 0)),

        listOf(Pair("""13. Kerjasama dapat membuat pekerjaan yang berat menjadi terasa lebih ...""", 0),
            Pair("""14. Orang yang tisak suka kerjasama di lingkungan masyarakat maka akan ...""", 0),
            Pair("""15. Contoh kerjasama di lingkungan sekolah yang perlu dipertahankan adalah ...""", 0)),

        listOf(Pair("""16. Arah mata angin yang pokok ada ...""", 0),
            Pair("""17. Tiang bendera Merah Putih sekolah biasanya diletakkan di ...""", 0),
            Pair("""18. Denah ruangan kelas menunjukkan ...""", 0)),

        listOf(Pair("""19. Seorang anak dapat ikut bekerja sama di rumah sesuai dengan ...""", 0),
            Pair("""20. Contoh kerjasama di rumah adalah ...""", 0),
            Pair("""21. Kerjasama di lingkungan sekolah dilakukan oleh orang-orang berikut, kecuali ...""", 0)),

        listOf(Pair("""22. Menjaga kebersihan di lingkungan sekolah merupakan tanggung jawab dari ...""", 0),
            Pair("""23. Kerjasama harus dibiasakan mulai dari lingkungan ...""", 0),
            Pair("""24. Tujuan dari kerjasama membersihkan sungai salah satunya adalah untuk ...""", 0)),

        listOf(
            Pair("""25. Manusia bekerja untuk ....""", 0),
            Pair("""26. Negara Indonesia adalah negara yang mempunyai banyak laut, maka banyak warganya yang bekerja sebagai ....""", 0),
            Pair("""27. Berikut ini adalah sifat yang harus dilakukan saat bekerja, kecuali ....""", 0)),

        listOf(Pair("""28. Penduduk di daerah pegunungan biasa bekerja sebagai ....""", 0),
            Pair("""29. Berikut ini adalah pekerjaan-pekerjaan yang menghasilkan jasa adalah ....""", 0),
            Pair("""30. Untuk mendapatkan hasil pekerjaan yang baik maka kita harus ....""", 0)),

        listOf(Pair("""31. Berikut yang bukan manfaat bekerja dengan semangat adalah ....""", 0),
            Pair("""32. Berikut ini adalah kebutuhan pokok manusia adalah ....""", 0),
            Pair("""33. Kegiatan yang dilakukan untuk memperoleh barang dengan memberikan uang dengan kesepakatan bersama dinamakan kegiatan ....""", 0)),

        listOf(Pair("""34. Untuk bisa mendapatkan harga yang disepakati maka penjual dan pembeli melakukan ....""", 0),
            Pair("""35. Pasar yang menjual beraneka ragam barang kebutuhan secara lengkap adalah ....""", 0),
            Pair("""36. Supaya tidak mudah tertipu maka seorang pembeli harus ....""", 0)),

        listOf(Pair("""37. Nilai suatu barang untuk dibayar dengan uang dinamakan ....""", 0),
            Pair("""38. Berikut ini adalah pasar-pasar nyata, kecuali ....""", 0),
            Pair("""39. Harga yang diberikan di pasar swalayan biasanya adalah harga ....""", 0)),

        listOf(Pair("""40. Saat belanja makanan maka kita harus memperhatikan tanggal ....""", 0),
            Pair("""41. Tempat melakukan pembayaran di pasar swalayan adalah ....""", 0),
            Pair("""42. Tempat menjual makanan dan minuman di sekolah adalah ....""", 0)),

        listOf(Pair("""43. Untuk membayar ketika membeli barang maka kita menggunakan ....""", 0),
            Pair("""44. Sebelum ada uang, masyarakat zaman dahulu bertukar barang dengan cara ....""", 0),
            Pair("""45. Berikut ini adalah fungsi uang, kecuali ....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Air terjun semakin banyak","b. Banyak hewan berkembang biak","c. Tanah menjadi lebih mahal","d. Banjir dan tanah longsor"),
            listOf("a. Kompas","b. Sepeda","c. Jam tangan","d. Topi"),
            listOf("a. Bendungan","b. Terasering","c. Sungai","d. Rumah")
        ),
        listOf(
            listOf("a. Kiri","b. Atas","c. Bawah","d. Kanan"),
            listOf("a. Gereja","b. Lapangan","c. Rumah kepala desa","d. Puskesmas"),
            listOf("a. Petani","b. Insinyur","c. Tuhan","d. Tukang kayu")
        ),
        listOf(
            listOf("a. Buatan","b. Hutan","c. Fisik","d. Alam"),
            listOf("a. Danau","b. Samudra","c. Sungai","d. Laut"),
            listOf("a. Menanam palawija","b. Membuang sampah","c. Merawat ikan","d. Menjemur pakaian")
        ),
        listOf(
            listOf("a. Kebun","b. Pantai","c. Danau","d. Gunung"),
            listOf("a. Kurang teman","b. Sulit berteman","c. Banyak teman","d. Sedikit teman"),
            listOf("a. Pekerjaan menjadi semakin lama","b. Mempererat tali persaudaraan","c. Pekerjaan menjadi terasa ringan","d. Pekerjaan menjadi cepat selesai")
        ),
        listOf(
            listOf("a. Lama","b. Seru","c. Tambah sulit","d. Ringan"),
            listOf("a. Memiliki sedikit teman","b. Diidolakan masyarakat","c. Disukai masyarakat","d. Dibenci masyarakat"),
            listOf("a. Menyapu halaman","b. Berkelahi dengan kelas lain","c. Mengerjakan PR","d. Mengerjakan ulangan")
        ),
        listOf(
            listOf("a. 4","b. 10","c. 2","d. 3"),
            listOf("a. Belakang ruang kelas","b. Depan gudang sekolag","c. Pagar sekolah","d. Halaman utama sekolah"),
            listOf("a. Tempat buku-buku","b. Tempat bunga-bunga","c. Tempat bermain di dalam kelas","d. Tempat duduk siswa")
        ),
        listOf(
            listOf("a. Kemampuannya","b. Kepintarannya","c. Hobinya","d. Makanannya"),
            listOf("a. Menyapu teras kelas","b. Menyapu lantai masjid","c. Membersihkan jalan desa","d. Membersihkan halaman rumah"),
            listOf("a. Kepala desa","b. Para murid","c. Para guru","d. Kepala sekolah")
        ),
        listOf(
            listOf("a. Siswa","b. Seluruh warga sekolah","c. Tukang kebun","d. Guru"),
            listOf("a. Keluarga","b. Desa","c. Sekolah","d. Masyarakat"),
            listOf("a. Mencegah terjadinya pergaulan bebas","b. Mencegah terjadinya banjir","c. Mencegah tanah longsor","d. Menjaga keamanan dari pencuri")
        ),
        listOf(
            listOf("a. Memenuhi gaya hidup  ","b. Memenuhi kebutuhan  ","c. Menjalani kebutuhan","d. Menikmati kebutuhan"),
            listOf("a. Tukang kebun ","b. Peternak  ","c. Pengrajin   ","d. Nelayan"),
            listOf("a. Korupsi  ","b. Semangat   ","c. Rajin  ","d. Tanggung jawab")
        ),
        listOf(
            listOf("a. Pekerja tambak   ","b. Pekerja kebun   ","c. Nelayan","d. Petani garam"),
            listOf("a. Dokter, petani dan nelayan  ","b. Nelayan, guru dan sopir    ","c. Sopir, guru dan dokter","d. Sopir, nahkoda dan peternak"),
            listOf("a. Bekerja dengan malas    ","b. Bekerja tergantung upah    ","c. Bekerja menunggu diawasi","d. Bekerja dengan semangat")
        ),
        listOf(
            listOf("a. Pekerjaan dapat mudah terselesaikan   ","b. Pekerjaan menjadi lebih sulit   ","c. Pekerjaan dapat selesai tepat waktu","d. Hasil yang diperoleh lebih baik"),
            listOf("a. Rumah, makanan dan mobil   ","b. Rumah, televisi dan pakaian   ","c. Handphone, pakaian dan rumah","d. Rumah, pakaian dan makanan"),
            listOf("a. Tawar menawar ","b. Nego harga  ","c. Jual beli  ","d. Barter")
        ),
        listOf(
            listOf("a. Paksa-paksaan   ","b. Tawar-menawar   ","c. Tukar-menukar","d. Saling memberi"),
            listOf("a. Swalayan  ","b. Toko   ","c. Warung  ","d. Kaki lima"),
            listOf("a. Pandai menawar   ","b. Teliti memilih    ","c. Cekatan memilih","d. Rajin menawar")
        ),
        listOf(
            listOf("a. Diskon   ","b. Label   ","c. Harga  ","d. Tabel"),
            listOf("a. Pasar loak  ","b. Pasar swalayan ","c. Pasar ikan  ","d. Pasar saham"),
            listOf("a. Pas   ","b. Kurang   ","c. Lebih  ","d. Recehan")
        ),
        listOf(
            listOf("a. Pembelian  ","b. Penjualan  ","c. Kadaluarsa  ","d. Harga"),
            listOf("a. Lobi   ","b. Kasir   ","c. Teras   ","d. Ruko"),
            listOf("a. Koperasi sekolah   ","b. Teras sekolah    ","c. Perpustakaan sekolah","d. Kantin sekolah")
        ),
        listOf(
            listOf("a. Kertas  ","b. Daun   ","c. Uang   ","d. Batu"),
            listOf("a. Menukar barang dengan barang   ","b. Merampas milik orang lain   ","c. Menukar barang dengan uang","d. Mencuri barang milik orang lains"),
            listOf("a. Sebagai alat tukar menukar ","b. Alat untuk bergaya    ","c. Alat penimbun kekayaan","d. Alat pembayaran yang sah")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(3,0,1),
        listOf(1,2,2),
        listOf(3,0,0),
        listOf(0,2,0),
        listOf(3,0,0),
        listOf(0,3,3),
        listOf(0,3,0),
        listOf(1,0,1),
        listOf(1,3,0),
        listOf(1,2,3),
        listOf(1,3,2),
        listOf(1,0,1),
        listOf(2,3,0),
        listOf(2,1,3),
        listOf(2,0,1)



    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas3, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIps.scoreIpsKelas3 < 1) 0 else scoreManagerIps.scoreIpsKelas3 / 5
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
            val getData = soalIpssd3[jawabanBenar6][i]
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

                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas3
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpssd3.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas3 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas3 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd3[jawabanBenar6][i]
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