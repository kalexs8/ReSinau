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


class SoalIpsKelas4 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpssd4: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. pasar terapung merupakan salah satu usaha ekonomi masyarakat yang tinggal di daerah .....""", 0),
            Pair("""2. mata pencaharian penduduk di suatu daerah ..... dengan daerah lain?""", 0),
            Pair("""3. berikut mata pencaharian sebagian besar penduduk di kota, kecuali .....""", 0)),

        listOf(Pair("""4. berikut ini pekerjaan yang menghasilkan jasa adalah .....""", 0),
            Pair("""5. suku bangsa yang ada di indonesia sangat beragam. sebagian besar suku bangsa itu berasal dari ras mongoloid, contohnya suku-suku di .....""", 0),
            Pair("""6. rumah adat tongkonan adalah rumah adat daerah .....""", 0)),

        listOf(Pair("""7. kegiatan yang dilakukan oleh manusia untuk mendapatkan penghasilan dengan tujuan kesejahteraan hidupnya disebut kegiatan .....""", 0),
            Pair("""8. penduduk yang tinggal di daerah dataran rendah umumnya bekerja di sektor .....""", 0),
            Pair("""9. perhatikan sumber daya alam berikut 
1) tumbuhan 
2) emas 
3) batu bara
4) hewan
jenis sumber daya alam yang dapat diperbarui ditunjukkan oleh huruf .....
""", 0)),

        listOf(Pair("""10. kegiatan usaha yang memperoleh pendapatan dari memberikan pelayanan kepada konsumen disebut .....""", 0),
            Pair("""11. kegiatan yang menghasilkan barang dan jasa disebut .....""", 0),
            Pair("""12. mata pencaharian masyarakat pedesaan mayoritas sebagai .....""", 0)),

        listOf(Pair("""13. penambangan bahan mineral secara terbuka bisa menyebabkan lahan sekitarnya menjadi .....""", 0),
            Pair("""14. suku bangsa indonesia tersebar di seluruh wilayah indonesia. suku bangsa yang berasal provinsi banten .....""", 0),
            Pair("""15. contoh pekerjaan yang menghasilkan jasa adalah .....""", 0)),

        listOf(Pair("""16. mengubah bahan mentah menjadi bahan setengah jadi atau barang jadi adalah kegiatan .....""", 0),
            Pair("""17. berikut contoh sumber daya alam yang tidak dapat diperbarui, kecuali .....""", 0),
            Pair("""18. julukan untuk kota tangerang adalah .....""", 0)),

        listOf(Pair("""19. candi prambanan terdapat di .....""", 0),
            Pair("""20. pekerjaan yang menghasilkan barang adalah .....""", 0),
            Pair("""21. berikut yang termasuk sumber daya alam hayati adalah .....""", 0)),

        listOf(Pair("""22. salah satu cara melestarikan pakaian adat daerah biasanya dipakai pada saat .....""", 0),
            Pair("""23. rumah gadang cara melestarikan pakaian adat daerah biasanya dipakai pada saat .....""", 0),
            Pair("""24. pakaian adat untuk perempuan sulawesi selatan disebut .....""", 0)),

        listOf(Pair("""25. gendang, marawis, kolintang merupakan jenis alat musik yang digunakan dengan cara .....""", 0),
            Pair("""26. berikut merupakan sumber daya alam hayati, kecuali .....""", 0),
            Pair("""27. daratan yang memiliki ketinggian antara 0-200 meter di atas permukaan laut disebut .....""", 0)),

        listOf(Pair("""28. wilayah datar yang memiliki ketinggian lebih dari 400 meter di atas permukaan air disebut .....""", 0),
            Pair("""29. berikut ini merupakan contoh sumber daya alam yang tidak dapat diperbarui, kecuali .....""", 0),
            Pair("""30. sumber daya alam yang dapat dihasilkan kembali dalam waktu yang tidak lama disebut .....""", 0)),

        listOf(
            Pair("""31. Kegiatan-kegiatan yang menghasilkan barang dan jasa yang bernilai ekonomi dinamakan....""", 0),
            Pair("""32. Berikut ini yang bukan merupakan kegiatan produksi adalah ....""", 0),
            Pair("""33. Berikut ini yang tidak termasuk hasil perkebunan, yaitu ....""", 0)),

        listOf(Pair("""34. Bahan baku industri genteng dan keramik adalah ....""", 0),
            Pair("""35. Berikut ini yang menunjukkan aktivitas konsumsi dalam Kegiatan sehari-hari, yaitu ....""", 0),
            Pair("""36. Kegiatan menyalurkan barang hasil produksi ke berbagai daerah disebut kegiatan ....""", 0)),

        listOf(Pair("""37. Koperasi adalah lembaga ekonomi yang berasaskan ....""", 0),
            Pair("""38. Koperasi memiliki tujuan yaitu untuk ....""", 0),
            Pair("""39. Berikut yang merupakan barang-barang yang disediakan di koperasi sekolah adalah ....""", 0)),

        listOf(Pair("""40. Koperasi yang menyediakan barang-barang kebutuhan sehari-hari adalah koperasi ....""", 0),
            Pair("""41. Keuntungan yang diperoleh koperasi dalam menjalankan usahanya dinamakan ....""", 0),
            Pair("""42. Koperasi sekolah sangat bermanfaat bagi para siswa. Berikut yang bukan manfaat dari koperasi sekolah adalah ....""", 0)),

        listOf(Pair("""43. Pada zaman dahulu orang-orang menumbuk padi masih menggunakan ....""", 0),
            Pair("""44. Kegiatan manusia dalam membuat atau menghasilkan barang disebut ....""", 0),
            Pair("""45. Berikut ini yang bukan merupakan kelebihan dari teknologi tradisional adalah ....""", 0)),

        listOf(Pair("""46. Berikut ini adalah alat komunikasi yang digunakan manusia pada zaman dahulu adalah....""", 0),
            Pair("""47. Berikut ini yang termasuk media elektronik dalam bidang komunikasi adalah ....""", 0),
            Pair("""48. Kekurangan alat komunikasi modern diantaranya adalah ....""", 0)),

        listOf(Pair("""49. Hal-hal yang terjadi di masyarakat yang bertentangan atau tidak sesuai dengan harapan orang banyak dinamakan ....""", 0),
            Pair("""50. Kebiasaan masyarakat yang bisa menyebabkan masalah sosial berupa banjir adalah ....""", 0),
            Pair("""51. Berikut adalah masalah sosial yang terjadi di kota adalah ....""", 0)),

        listOf(Pair("""52. Masalah sosial yang dialami pelajar adalah ....""", 0),
            Pair("""53. Contoh kenakalan remaja adalah ....""", 0),
            Pair("""54. Cara mencegah pengangguran diantaranya adalah ....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. dataran tinggi ","b. dataran rendah ","c. sungai","d. pegunungan"),
            listOf("a. sama ","b. serupa ","c. berbeda","d. sejenis"),
            listOf("a. pekerja jasa c. karyawan","b. petani ","c. karyawan","d. buruh pabrik")
        ),
        listOf(
            listOf("a. petani c. guru","b. nelayan","c. guru","d. peternak"),
            listOf("a. sumatra c. papua","b. kepulauan kai ","c. papua","d. kepulauan aru"),
            listOf("a. maluku ","b. sulawesi selatan ","c. sumatra utara","d. bengkulu")
        ),
        listOf(
            listOf("a. sosial ","b. budaya ","c. ekonomi","d. jasa"),
            listOf("a. perdagangan ","b. industri ","c. pertanian","d. transportasi"),
            listOf("a. 1 dan 3 ","b. 2 dan 3 ","c. 1 dan 2","d. 1 dan 4")
        ),
        listOf(
            listOf("a. usaha dagang ","b. usaha produksi ","c. usaha jasa","d. usaha bersama"),
            listOf("a. produksi ","b. distribusi ","c. konsumsi","d. produsen"),
            listOf("a. dokter ","b. petani ","c. konsultan","d. pengacara")
        ),
        listOf(
            listOf("a. semakin subur ","b. mudah dikelola ","c. makin proaktif","d. tidak produktif"),
            listOf("a. melayu, bajau, dan kubu","b. melayu, madura, dan baduy","c. sunda, baduy dan betawi","d. baduy, sunda, dan banten"),
            listOf("a. guru, petani, dan peternak","b. dokter, perawat, dan polisi","c. perawat, perajin, dan guru","d. nelayan, dokter dan petani")
        ),
        listOf(
            listOf("a. pertambangan ","b. perdagangan ","c. perindustrian","d. distributor"),
            listOf("a. minyak bumi ","b. bauksit ","c. air","d. gas alam"),
            listOf("a. kota santri","b. kota 1000 industri","c. kota bunga","d. kota pahlawan")
        ),
        listOf(
            listOf("a. jawa timur ","b. jawa tengah","c. jawa barat","d. yogyakarta"),
            listOf("a. konsultan ","b. guru ","c. dokter","d. petani"),
            listOf("a. pasir, laut, batuan","b. hasil hutan dan hewan ternak","c. panorama dan pegunungan","d. hewan ternak, nikel, tembaga")
        ),
        listOf(
            listOf("a. upacara adat pernikahan","b. upacara tujuh belas agustusan","c. upacara kematian","d. upacara bendera"),
            listOf("a. aceh ","b. sumatera utara ","c. sumatera barat","d. riau"),
            listOf("a. baju bodo","b. baju pangsi ","c. kebaya","d. baju cele")
        ),
        listOf(
            listOf("a. digesek ","b. ditiup ","c. dipukul","d. dipetik"),
            listOf("a. kuda ","b. sapi ","c. kopi","d. batu kapur"),
            listOf("a. pantai ","b. padang rumput ","c. dataran rendah","d. dataran tinggi")
        ),
        listOf(
            listOf("a. dataran rendah","b. dataran tinggi","c. padang rumput","d. pantai"),
            listOf("a. hasil perikanan ","b. minyak bumi ","c. batu bara","d. gas alam"),
            listOf("a. sumber daya alam yang dapat diperbarui","b. sumber daya alam yang tidak dapat diperbarui","c. sumber daya alam hayati","d. sumber daya alam non hayati"),
        ),
        listOf(
            listOf("a. Kegiatan Pertanian    ","b. kegiatan Ekonomi    ","c. Kegiatan Industri","d. Kegiatan Peternakan"),
            listOf("a. Petani menghasilkan padi   ","b. Penjahit membuat baju   ","c. Nelayan menghasilkan ikan","d. Petani membeli pupuk "),
            listOf("a. Teh, cengkeh, tembakau   ","b. Padi, jagung, kedelai   ","c. Kopi, kelapa, wortel","d. Tebu, sagu, kedelai")
        ),
        listOf(
            listOf("a. Tepung terigu ","b. Kayu lapis  ","c. Serat kapas  ","d. Tanah liat"),
            listOf("a. Ayah membajak sawah   ","b. Kakak merangkai bunga","c. Ibu menanam bunga di pekarangan   ","d. Adik memakan roti"),
            listOf("a. Industri  ","b. Konsumsi   ","c. Distribusi   ","d. Kontruksi")
        ),
        listOf(
            listOf("a. Kekeluargaan ","b.  Keuntungan  ","c. Kesejahteraan  ","d. Keterbukaan"),
            listOf("a. Melindungi kegiatan produksi","b. Meningkatkan kesejahteraan pengurus","c. Meningkatkan kesejahteraan anggota","d. menyedikan kebutuhan pengurus"),
            listOf("a. Beras dan kopi","b. Pensil dan cangkul","c. Buku dan pensil","d. Sabun dan bensin")
        ),
        listOf(
            listOf("a. Koperasi jasa    ","b. Koperasi produksi","c. Koperasi simpan pinjam   ","d. Koperasi Konsumsi  "),
            listOf("a. Sisa hasil usaha  ","b. Saham  ","c. Deviden  ","d. Laba"),
            listOf("a. Siswa berlatih bertanggung jawab","b. Siswa belajar bekerja sama ","c. Siswa dibiasakan berhutang","d. Siswa belajar bermusyawarah")
        ),
        listOf(
            listOf("a. Mesin   ","b. Diesel  ","c. Traktor  ","d. Lesung"),
            listOf("a. Konsumsi  ","b. Distribusi  ","c. Produksi  ","d. Trasnportasi"),
            listOf("a. Tidak menimbulkan pencemaran suara","b. Tidak tergantung pada peralatan","c. Menimbukan polusi udara","d. Biaya yang diperlukan lebih sedikit")
        ),
        listOf(
            listOf("a. Kentongan  ","b. Handphone  ","c. Telepon  ","d. Internet"),
            listOf("a. Televisi, radio dan koran  ","b. Koran, majalah dan surat ","c. Internet, radio dan televisi ","d. Handphone, telepon dan majalah"),
            listOf("a. Mudah didapatkan   ","b. Mudah digunakan   ","c. Mempersulit pekerjaan","d. Sulit diperbaiki")
        ),
        listOf(
            listOf("a. Kejahatan ","b. Kecelakaaan  ","c. Masalah sosial  ","d. Masalah keluarga"),
            listOf("a. Tidak mau bekerja    ","b. Buang sampah sembarangan  ","c. Berdagang di trotoar jalan","d. Ugal-ugalan di jalan raya"),
            listOf("a. Bangunan mewah  ","b. Kesehatan  ","c. Kerapian  ","d. Kemacetan")
        ),
        listOf(
            listOf("a. Putus sekolah","b. Nilai buruk","c. Terlambat masuk ","d. Buku hilang"),
            listOf("a. Balapan liar  ","b. Lomba olahraga  ","c. Sepakbola  ","d. Belajar kelompok"),
            listOf("a. Membatasi pekerja di perusahaan","b. Membuka lapangan kerja baru","c. Memahalkan biaya pendidikan","d. Membuat taman kota")
        )

    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,2,1),
        listOf(2,0,1),
        listOf(2,2,3),
        listOf(2,0,1),
        listOf(3,3,1),
        listOf(2,2,1),
        listOf(1,3,1),
        listOf(0,2,0),
        listOf(2,3,2),
        listOf(1,0,0),
        listOf(1,3,1),
        listOf(3,3,2),
        listOf(0,2,2),
        listOf(3,0,2),
        listOf(3,2,2),
        listOf(0,2,3),
        listOf(2,1,3),
        listOf(0,0,1)




    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas4, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIps.scoreIpsKelas4 < 1) 0 else scoreManagerIps.scoreIpsKelas4 / 5
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
            val getData = soalIpssd4[jawabanBenar6][i]
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

                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas4
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpssd4.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas4 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas4 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd4[jawabanBenar6][i]
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