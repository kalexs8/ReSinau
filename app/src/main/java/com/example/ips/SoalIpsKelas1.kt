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


class SoalIpsKelas1 : Fragment() {

    private var jawabanBenar = 0
    private val soalIpssd1: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Jika kita bersalah kepada siapapun, maka kita harus...""", 0),
            Pair("""2. Jika dalam keluarga tidak rukun akibatnya adalah...""", 0),
            Pair("""3. Tidak memusuhi orang lain menjadikan hidup...""", 0)),

        listOf(Pair("""4. Sikap yang tidak boleh dicontoh adalah...""", 0),
            Pair("""5. Pemaaf merupakan contoh perbuatan...""", 0),
            Pair("""6. Kepada kedua orang tua kita harus...""", 0)),

        listOf(Pair("""7. ayah, ibu, adik dan kakak adalah bagian dari …
""", 0),
            Pair("""8. ibu dari ayah adalah …
""", 0),
            Pair("""9. ibu adalah …. dari ayah.
""", 0)),

        listOf(Pair("""10. setiap orang punya nama lengkap dan nama …
""", 0),
            Pair("""11. adik dan kakak harus selalu kita …
""", 0),
            Pair("""12. merayakan ulang tahun adalah pengalaman yang …
""", 0)),

        listOf(Pair("""13. jatuh dari sepeda adalah pengalaman yang …
""", 0),
            Pair("""14. andi merasa senang maka ia pun …
""", 0),
            Pair("""15. Di dalam keluarga kita harus menjaga …
""", 0)),

        listOf(Pair("""16. kita tidak boleh … dengan teman.
""", 0),
            Pair("""17. rudi suka main bola dan dani suka berenenang
mereka punya hobi yang …
""", 0),
            Pair("""18. saat bermain bola dengan teman kita tidak boleh …
""", 0)),

        listOf(Pair("""19. teman yang bertengkar harus …
""", 0),
            Pair("""20. manfaat rukun adalah bisa hidup dengan …
""", 0),
            Pair("""21. contoh hidup rukun adalah … dengan teman.
""", 0)),

        listOf(Pair("""22. ayah adalah orang yang mencari …. untuk keluarga.
""", 0),
            Pair("""23. adik akan ulang tahun
ibu memberikan adik …
""", 0),
            Pair("""24. rani belum bisa membaca
kakak rani lalu …
""", 0)),

        listOf(Pair("""25. ibu selalu menyayangi kita sejak …
""", 0),
            Pair("""26. saat akan berangkat sekolah kita harus …
""", 0),
            Pair("""27. jika kakak sedang belajar sebaiknya kita …
""", 0)),

        listOf(Pair("""28. kasih sayang orang tua kepada anaknya …
""", 0),
            Pair("""29. Kakak dari ibu kita panggil...""", 0),
            Pair("""30. Yang merupakan kepala keluarga adalah...""", 0)
        )
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Diam","b. Meminta maaf","c. Acuh saja"),
            listOf("a. Suasana keluarga harmonis","b. Suasana keluarga tertib","c. Suasana keluarga jadi tidak harmonis dan tidak tertib"),
            listOf("a. Kacau","b. Berantakan","c. Damai")
        ),
        listOf(
            listOf("a. Pemaaf","b. Penyabar","c. Pemarah"),
            listOf("a. Tercela","b. Terhina","c. Terpuji"),
            listOf("a. Menyayangi","b. Mencela","c. Membenci")
        ),
        listOf(
            listOf("a. teman    ","b. keluarga   ","c. kerabat"),
            listOf("a. nenek","b. kakak   ","c. kakek"),
            listOf("a. istri   ","b. suami   ","c. paman")
        ),
        listOf(
            listOf("a. palsu","b. lucu   ","c. panggilan"),
            listOf("a. sayangi   ","b. benci   ","c. lupakan"),
            listOf("a. menyedihkan  ","b. sedih   ","c. menyenangkan")
        ),
        listOf(
            listOf("a. bahagia   ","b. senang","c. menyedihkan"),
            listOf("a. menangis   ","b. tersenyum  ","c. sedih"),
            listOf("a. kerukunan   ","b. keinginan   ","c. kemauan")
        ),
        listOf(
            listOf("a. bertengkar   ","b. bersahabat  ","c. bertanya"),
            listOf("a. sama    ","b. mirip   ","c. berbeda"),
            listOf("a. menang   ","b. curang   ","c. kalah")
        ),
        listOf(
            listOf("a. dibantu   ","b. disemangati  ","c. dipisah"),
            listOf("a. gelisah   ","b. susah   ","c. damai"),
            listOf("a. belajar    ","b. berkelahi   ","c. bermusuhan dengan")
        ),
        listOf(
            listOf("a. nafkah   ","b. anak   ","c. nasi"),
            listOf("a. hukuman   ","b. hadiah   ","c. teguran"),
            listOf("a. memarahinya  ","b. mengajarinya  ","c. menghinanya")
        ),
        listOf(
            listOf("a. usia 5 tahun   ","b. sekolah  ","c. lahir"),
            listOf("a. minta uang   ","b. berpamitan  ","c. menangis dahulu"),
            listOf("a. tidak mengganggunya ","b. berteriak-teriak  ","c. mengajak bermain")
        ),
        listOf(
            listOf("a. tidak terbatas  ","b. tidak ada   ","c. biasa saja"),
            listOf("A. Kakek","B. Tante","C. Paman"),
            listOf("a. Ayah","b. Ibu","c. Anak")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(1,2,2),
        listOf(2,2,0),
        listOf(1,0,0),
        listOf(2,0,2),
        listOf(2,1,0),
        listOf(0,2,1),
        listOf(2,2,0),
        listOf(0,1,1),
        listOf(2,1,0),
        listOf(0,2,0)


    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas1, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerIps.scoreIpsKelas1 < 1) 0 else scoreManagerIps.scoreIpsKelas1 / 5
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
            val getData = soalIpssd1[jawabanBenar][i]
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
                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas1
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar++

                            if (jawabanBenar == soalIpssd1.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas1 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas1 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd1[jawabanBenar][i]
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