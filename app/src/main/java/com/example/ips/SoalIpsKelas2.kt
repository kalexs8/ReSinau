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


class SoalIpsKelas2 : Fragment() {

    private var jawabanBenar = 0
    private val soalIpssd2: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. KTP dan KK adalah dokumen resmi yang dibuat oleh ….
""", 0),
            Pair("""2. SIM adalah singkatan dari ….
""", 0),
            Pair("""3. Contoh hewan yang dapat memakan dokumen kita menjadi rusak adalah ….
""", 0)),

        listOf(Pair("""4. Koleksi barang berharga dapat tetap awet dan tahan lama jika selalu ….
""", 0),
            Pair("""5. Orang yang mengoleksi benda berharga dinamakan ….
""", 0),
            Pair("""6. Yang termasuk koleksi barang berharga adalah
""", 0)),

        listOf(Pair("""7. Tempat untuk menyimpan foto keluarga adalah
""", 0),
            Pair("""8. Dokumen yang diperoleh setelah lulus sekolah adalah
""", 0),
            Pair("""9. Kita bisa mengingat masa kecil dengan melihat....""", 0)),

        listOf(Pair("""10. Para penduduk  bergotong royong membangun ....""", 0),
            Pair("""11. KTP dibuat untuk anggota keluarga yang berusia  …
""", 0),
            Pair("""12. Dokumen diatur rapi agar  .............................  mencarinya.
""", 0)),

        listOf(Pair("""13. Kelengkapan dokumen bagi pengendara kendaraan bermotor adalah ….
""", 0),
            Pair("""14. Pengalaman yang kita lalui ada yang menyenangkan dan juga ada yang …
""", 0),
            Pair("""15. Saat orang bersedih biasanya ia akan …
""", 0)),

        listOf(Pair("""16. Hari ini Bu Rika melahirkan anak pertama
Maka suami Bu Rika merasa …
""", 0),
            Pair("""17. Saat adik sedang sakit maka ayah dan ibu terlihat merasa sangat …
""", 0),
            Pair("""18.  Peristiwa penting dalam keluarga contohnya …
""", 0)),

        listOf(Pair("""19. Pengalaman yang menyenangkan contohnya adalah …
""", 0),
            Pair("""20.  Diberi hadiah oleh ayah dan ibu saat ulang tahun termasuk peristiwa yang …
""", 0),
            Pair("""21. Foto dapat menjadi benda berharga karena bisa untuk ….
""", 0)),

        listOf(Pair("""22. Peristiwa yang penting mudah sekali untuk ….
""", 0),
            Pair("""23. Kewajiban sebagai seorang siswa adalah  ...""", 0),
            Pair("""24. Perbuatan yang buruk sebaiknya kita …
""", 0)),

        listOf(Pair("""25. Hari ini harus lebih baik dari hari …
""", 0),
            Pair("""26. Keluarga inti tediri atas ...""", 0),
            Pair("""27. Kepala keluarga adalah ...""", 0)),

        listOf(Pair("""28. Ibu adalah ... ayah.
""", 0),
            Pair("""29. Anggota keluarga yang bertugas mencari nafkah untuk menghidupi anak dan istrinya adalah ...""", 0),
            Pair("""30. Tugas seorang ibu adalah ....""", 0)
        )
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Orang tua kita  ","b. Pemerintah  ","c. Kepala sekolah"),
            listOf("a. Surat Izin Mengemudi","b. Surat Izin Mengendarai","c. Surat Izin Membaca"),
            listOf("a. Rayap dan tikus  ","b. Kelinci dan kambing ","c. Tikus dan ayam")
        ),
        listOf(
            listOf("a. Dirawat   ","b. Dibungkus  ","c. Difigura"),
            listOf("a. Distributor   ","b. Kolektor   ","c. Narator"),
            listOf("a. surat kelahiran                                           ","b. kartu keluarga                                      ","c. Piala")
        ),
        listOf(
            listOf("a. album                                                             ","b. buku       ","c. map"),
            listOf("a. koran                                                                     ","b. Ijazah       ","c. kartu keluarga                                                                         "),
            listOf("a. koran                                                           ","b. majalah                                       ","c. Foto")
        ),
        listOf(
            listOf("a. jembatan                                                       ","b. kandang sapi             ","c. rumah"),
            listOf("a. 10 tahun                                                       ","b. 15 tahun                 ","c. 17 tahun"),
            listOf("a. sulit                                                               ","b. lambat       ","c. Mudah")
        ),
        listOf(
            listOf("a. helm                                                             ","b. KTP           ","c. SIM"),
            listOf("a. Menyedihkan   ","b. Menggembirakan ","c. Lucu"),
            listOf("a. Tertawa    ","b. Menangis   ","c. Tersenyum")
        ),
        listOf(
            listOf("a. sedih    ","b. kesal   ","c. bahagia"),
            listOf("a. Khawatir   ","b. Senang   ","c. Bahagia"),
            listOf("a. Sarapan pagi   ","b. Kelahiran adik  ","c. Menyiram tanaman")
        ),
        listOf(
            listOf("a. Menjadi juara kelas  ","b. Jatuh terpeleset  ","c. Jatuh dari sepeda"),
            listOf("a. Menyenangkan  ","b. Menyedihkan  ","c. Menyeramkan"),
            listOf("a. Menceritakan kenangan masa lalu","b. Menceritakan cerita masa depan","c. Harganya sangat mahal")
        ),
        listOf(
            listOf("a. Diingat    ","b. Ditertawakan  ","c. Dilupakan"),
            listOf("a.  belajar                                                         ","b.  nonton TV         ","c.   bermain                                         "),
            listOf("a. Pertahankan    ","b. Banggakan   ","c. Tinggalkan")
        ),
        listOf(
            listOf("a. Besok     ","b. Kemarin    ","c. Minggu"),
            listOf("a. Ayah, ibu dan tetangga","b. Tetangga, kakek dan adik","c. Ayah, ibu dan anak"),
            listOf("a. Ayah    ","b. Ibu    ","c. Kakek")
        ),
        listOf(
            listOf("a. Kakak   ","b. Istri    ","c. Suami"),
            listOf("a. Kakek   ","b. Kakak    ","c. Ayah"),
            listOf("a. Memarahi anak  ","b. Mendidik anak   ","c. Memukul anak")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(1,0,0),
        listOf(0,1,2),
        listOf(0,1,2),
        listOf(2,2,2),
        listOf(2,0,1),
        listOf(2,0,1),
        listOf(0,0,0),
        listOf(0,0,2),
        listOf(1,2,0),
        listOf(1,2,1)



    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas2, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerIps.scoreIpsKelas2 < 1) 0 else scoreManagerIps.scoreIpsKelas2 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSD3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSD3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSD3c)

        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3

        )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalIpssd2[jawabanBenar][i]
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
                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas2
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar++

                            if (jawabanBenar == soalIpssd2.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas2 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas2 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd2[jawabanBenar][i]
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