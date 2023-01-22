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


class SoalIpaKelas2 : Fragment() {

    private var jawabanBenar = 0
    private val soalIpasd2: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Hewan yang mengalami pertumbuhan akan semakin …
""", 0),
            Pair("""2. Seekor burung yang sudah beranjak dewasa maka dapat …
""", 0),
            Pair("""3. Seekor Burung yang baru dilahirkan tidak memiliki …
""", 0)),

        listOf(Pair("""4. Kambing yang sudah dewasa maka pada bagian kepala akan tumbuh …
""", 0),
            Pair("""5. Tumbuhan yang diikat pada batang dari tumbuhan yang lain disebut ….
""", 0),
            Pair("""6. Bagian tubuh dari sebuah tumbuhan yang ada di dalam tanah disebut …
""", 0)),

        listOf(Pair("""7. Tanaman padi tumbuh melalui …
""", 0),
            Pair("""8. Tumbuhan rotan umumnya banyak tumbuh di …
""", 0),
            Pair("""9. Katak saat kecil berbentuk …
""", 0)),

        listOf(Pair("""10. Burung merpati saat sudah tumbuh besar maka bisa …
""", 0),
            Pair("""11. Kepompong akan berubah menjadi …
""", 0),
            Pair("""12. Hewan yang hidup di darat seperti …
""", 0)),

        listOf(Pair("""13. Hewan yang hidup di atas tanah seperti ….
""", 0),
            Pair("""14. Hewan yang hidup di air biasanya bisa ….
""", 0),
            Pair("""15. Hiu, paus dan lumba-lumba adalah hewan yang hidupnya di …
""", 0)),

        listOf(Pair("""16. Tumbuhan jagung dan kedelai bisa ditanam menggunakan …
""", 0),
            Pair("""17. Gigi hewan digunakan untuk …
""", 0),
            Pair("""18. Sayap digunakan oleh burung untuk …
""", 0)),

        listOf(Pair("""19. Elang mempunyai …. untuk mencengkeram tikus.
""", 0),
            Pair("""20. Kelinci awalnya bertubuh kecil lalu menjadi besar. Kelinci tersebut mengalami …
""", 0),
            Pair("""21. Energi listrik harus digunakan secara …
""", 0)),

        listOf(Pair("""22. Lampu merupakan benda yang umumnya digunakan untuk …
""", 0),
            Pair("""23. Perabotan rumah tangga yang menghasilkan energi gerak yaitu …
""", 0),
            Pair("""24. Bagian bumi yang disinari dengan matahari menandakan bahwa tempat tersebut sedang mengalami waktu …
""", 0)),

        listOf(Pair("""25. Manfaat dari cahaya matahari yaitu …
""", 0),
            Pair("""26. Benda berikut ini yang paling sulit dipegang adalah …
""", 0),
            Pair("""27. Udara yang kita hirup termasuk benda …
""", 0)),

        listOf(Pair("""28. Benda yang mudah berubah jika dipindahkan adalah benda …
""", 0),
            Pair("""29. Benda gas yang kita hirup untuk bernafas adalah …
""", 0),
            Pair("""30. Air bisa berguna untuk ….
""", 0)
        )
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. besar","b. kecil","c. jenaka"),
            listOf("a. berenang","b. terbang","c. berlari"),
            listOf("a. bulu","b. kaki","c. mata")
        ),
        listOf(
            listOf("a. sayap","b. ekor","c. Tanduk"),
            listOf("a. stek","b. parasit","c. cangkok"),
            listOf("a. akar","b. daun","c. bunga")
        ),
        listOf(
            listOf("a. batang","b. benih","c. daun"),
            listOf("a. Sawah","b. Pegunungan","c. Hutan"),
            listOf("a. Ikan    ","b. Ulat   ","c. Berudu")
        ),
        listOf(
            listOf("a. Berenang   ","b. Terbang   ","c. Menari"),
            listOf("a. Kupu-kupu   ","b. Burung   ","c. Kerang"),
            listOf("a. Kerang   ","b. Paus   ","c. Marmut")
        ),
        listOf(
            listOf("a. Singa    ","b. Cacing   ","c. Hiu"),
            listOf("a. Terbang   ","b. Berenang   ","c. Berlari"),
            listOf("a. Kolam renang  ","b. Laut   ","c. Sungai")
        ),
        listOf(
            listOf("a. Bijinya    ","b. Daunnya   ","c. Bunganya"),
            listOf("a. Menelan makanan  ","b. Mengunyah makanan ","c. Mencium makanan"),
            listOf("a. Berenang   ","b. Melompat   ","c. Terbang")
        ),
        listOf(
            listOf("a. Sayap    ","b. Cakar  ","c. Mata"),
            listOf("a. Pertumbuhan   ","b. Berkembangbiak  ","c. Kelahiran"),
            listOf("a. Cepat","b. Terus menerus","c. Hemat")
        ),
        listOf(
            listOf("a. Penerangan","b. Pendingin","c. Pemanas"),
            listOf("a. Lampu","b. Kipas angin","c. Kompor"),
            listOf("a. Siang hari","b. Pagi hari","c. Sore hari")
        ),
        listOf(
            listOf("a. Untuk menyiram tumbuhan","b. Untuk menjemur ikan","c. Untuk memasak telur"),
            listOf("a. Pensil    ","b. Air    ","c. Penghapus"),
            listOf("a. Gas    ","b. Cair   ","c. Bening")
        ),
        listOf(
            listOf("a. Cair    ","b. Mahal   ","c. Keras"),
            listOf("a. Oksigen   ","b. Asap   ","c. Debu"),
            listOf("a. Menyirami tanaman ","b. Membunuh tanaman ","c. Memotong tanaman")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(0,1,0),
        listOf(2,0,0),
        listOf(1,0,2),
        listOf(1,0,2),
        listOf(0,1,1),
        listOf(0,1,2),
        listOf(1,0,2),
        listOf(0,1,0),
        listOf(1,1,0),
        listOf(0,0,0)



    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas2, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerIpa.scoreIpaKelas2 < 1) 0 else scoreManagerIpa.scoreIpaKelas2 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupIpaSD3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupIpasSD3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupIpasSD3c)

        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3

        )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalIpasd2[jawabanBenar][i]
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
                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas2
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar++

                            if (jawabanBenar == soalIpasd2.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas2 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas2 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd2[jawabanBenar][i]
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