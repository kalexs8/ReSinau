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


class SoalIpaKelas3 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd3: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Berikut ini adalah hewan yang termasuk golongan omnivora, kecuali ...""", 0),
            Pair("""2. Kekurangan vitamin C dapat menyebabkan penyakit ...""", 0),
            Pair("""3. Berikut adalah ciri-ciri lingkungan yang sehat adalah, kecuali ...""", 0)),

        listOf(Pair("""4. Lingkungan sehat ditandai dengan kondisi udaranya yang ...""", 0),
            Pair("""5. Kegiatan yang dapat mencemari lingkungan adalah ...""", 0),
            Pair("""6. Manusia bernafas menghirup ...""", 0)),

        listOf(Pair("""7. Berikut ini adalah salah satu ciri-ciri makhluk hidup adalah ...""", 0),
            Pair("""8. Pohon-pohon yang berkembang biak dengan tunas adalah ...""", 0),
            Pair("""9. Protein yang bersumber dari tumbuhan dinamakan protein ...""", 0)),

        listOf(Pair("""10. Berikut ini adalah hal-hal yang dibutuhkan hewan, kecuali ...""", 0),
            Pair("""11. Plastik jika dibakar akan ...""", 0),
            Pair("""12. Berikut ini yang bukan merupakan perubahan benda yaitu ...""", 0)),

        listOf(Pair("""13. Berikut ini merupakan sifat benda padat jika dipindah-pindah, kecuali ...""", 0),
            Pair("""14. Buah yang busuk bisa dilihat dari ...""", 0),
            Pair("""15. Kayu jika terkena air secara terus-menerus akan ...""", 0)),

        listOf(Pair("""16. Keramik dan kaca adalah benda yang permukaannya ...""", 0),
            Pair("""17. Benda padat jika dipindahkan amak mempunyai bentuk yang ...""", 0),
            Pair("""18. Berikut ini yang termasuk benda cair adalah ...""", 0)),

        listOf(Pair("""19. Benda berikut yang mudah mengalir adalah ...""", 0),
            Pair("""20. Alat-alat untuk memasak biasanya terbuat dari benda ...""", 0),
            Pair("""21. Kaca banyak digunakan untuk membuat gerabah karena bentuknya yang ...""", 0)),

        listOf(Pair("""22. Besi banyak dimanfaatkan sebagai bahan pembuat alat pemotong karena sifatnya yang ...""", 0),
            Pair("""23. Kayu yang banyak digunakan untuk membuat meja dan lemari adalah kayu ...""", 0),
            Pair("""24. Berikut benda yang tidak terbuat dari plastik adalah ...""", 0)),

        listOf(
            Pair("""25. Air digunakan manusia untuk
""", 0),
            Pair("""26. Gerak karena gaya gravitasi bumi disebut gerak .…
""", 0),
            Pair("""27. Perahu layar bergerak dengan memanfaatkan gerak ….
""", 0)),

        listOf(Pair("""28. Benda lebih mudah bergerak pada lintasan yang .…
""", 0),
            Pair("""29. Gerak benda yang menggelinding juga mengalami gerak ....""", 0),
            Pair("""30. Energi matahari yang dimanfaakan manusia untuk menjemur padia adalah energi ...""", 0)),

        listOf(Pair("""31. Kincir angin berputar dengan memanfaat energi ....""", 0),
            Pair("""32. Energi listrik diubah menjadi gerak terjadi pada ....""", 0),
            Pair("""33. Bunyi berasal dari benda yang ....""", 0)),

        listOf(Pair("""34. Sumber energi panas terbesar bagi bumi adalah ....""", 0),
            Pair("""35. Bagian daratan yang menjorok ke laut dinamakan ....""", 0),
            Pair("""36. Kegiatan yang sangat bagus dilakukan saat musim hujan, kecuali ....""", 0)),

        listOf(Pair("""37. Sebagian besar pekerjaan penduduk di daerah pegunungan adalah sebagai ....""", 0),
            Pair("""38. Berikut yang bukan kegiatan perikanan di darat adalah memelihara ikan di....""", 0),
            Pair("""39. Keadaan udara pada suatu tempat tertentu dalam waktu tertentu disebut ....""", 0)),

        listOf(Pair("""40. Tanda-tanda akan hujan antara lain ....""", 0),
            Pair("""41. Tanaman yang cocok ditanam di sawah saat kemarau adalah ....""", 0),
            Pair("""42. Orang memelihara ayam untuk memperoleh ....""", 0)),

        listOf(Pair("""43. Usaha pelestarian hewan dapat dilakukan dengan cara ...""", 0),
            Pair("""44. Berikut ini merupakan ciri benda gas, kecuali ....""", 0),
            Pair("""45. Jurang di tengah laut dinamakan ....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Tikus","b. Merpati","c. Ayam","d. Bebek"),
            listOf("a. Sariawan","b. Rakitis","c. Rabun ayam","d. Beri-beri"),
            listOf("a. Udaranya bersih","b. Banyak hewan liar","c. Tanahnya tidak tercemar","d. Airnya jernih")
        ),
        listOf(
            listOf("a. Dingin","b. Panas","c. Polusi","d. Bersih"),
            listOf("a. Menangkap ikan dengan racun","b. Membakar sampah yang menumpuk","c. Menanam pohon","d. Memancing di sungai"),
            listOf("a. Nitrogen","b. Karbondioksida","c. Oksigen","d. Hidrogen")
        ),
        listOf(
            listOf("a. Menghadap ke atas","b. Berwarna kuning","c. Diam di tempat","d. Membutuhkan makanan"),
            listOf("a. Bambu, tebu, pisang","b. Jati, jambu, bambu","c. Mangga, bambu, pisang","d. Tebu, nangka, mahoni"),
            listOf("a. Bunga","b. Fotosintesis","c. Hewani","d. Nabati")
        ),
        listOf(
            listOf("a. Makanan","b. Udara","c. Tempat hidup","d. Pakaian"),
            listOf("a. Mengeras","b. Melapuk","c. Membeku","d. Meleleh"),
            listOf("a. Buah membusuk","b. Kayu dibakar","c. Es mencair","d. Ban dipompa")
        ),
        listOf(
            listOf("a. Warnanya tetap","b. Mudah dipegang","c. Bentuknya tetap","d. Ukurannya berubah"),
            listOf("a. Batangnya","b. Bunganya","c. Baunya","d. Daunnya"),
            listOf("a. Tahan lama","b. Mudah terbakar","c. Menjadi kuat","d. Menajdi lapuk")
        ),
        listOf(
            listOf("a. Bergerigi","b. Bergelombang","c. Kasar","d. Halus"),
            listOf("a. Membesar","b. Tetap","c. Berubah-ubah","d. Mengecil"),
            listOf("a. Minyak","b. Daun","c. Asap","d. Batu")
        ),
        listOf(
            listOf("a. Kayu","b. Kerikil","c. Pasir","d. Air"),
            listOf("a. Padat","b. Karet","c. Cair","d. Gas"),
            listOf("a. Mudah dibersihkan dan bening","b. Tidak mudah pecah dan jernih","c. Keras dan kuat","d. Bening dan menyerap air")
        ),
        listOf(
            listOf("a. Lunak dan elastis","b. Warna-warna dan kuat","c. Keras dan kuat","d. Keras dan mahal"),
            listOf("a. Kelapa","b. Sawit","c. Randu","d. Jati"),
            listOf("a. Wajan","b. Botol","c. Gayung","d. Wadah makanan")
        ),
        listOf(
            listOf("a. Perhiasan","b. Racun","c. Membuat minyak","d. Mencuci"),
            listOf("a. menggelinding  ","b. Berputar   ","c. Jatuh  ","d. mengalir"),
            listOf("a. jatuh    ","b. Mengalir   ","c. Tenggelam ","d. putar")
        ),
        listOf(
            listOf("a. kasar    ","b. Berpasir   ","c. Bergelombang  ","d. rata"),
            listOf("a. Memutar   ","b. Mengalir   ","c. Jatuh  ","d. Terbang"),
            listOf("a. Cahaya   ","b. Panas   ","c. Listrik  ","d. Gerak")
        ),
        listOf(
            listOf("a. Panas    ","b. Gerak   ","c. Cahaya  ","d. Bunyi"),
            listOf("a. Senter    ","b. Setrika listrik  ","b. Mesin cuci  ","d. Televisi"),
            listOf("a. Bergoyang   ","b. Bercahaya  ","c. Bergetar  ","d. Berkilau")
        ),
        listOf(
            listOf("a. Batu bara   ","b. Api    ","c. Listrik  ","d. Matahari"),
            listOf("a. Teluk    ","b. Bukit   ","c. Selat  ","d. Tanjung"),
            listOf("a. menanam palawija    ","b. Membuat garam   ","c. Membajak sawah","d. Menanam padi")
        ),
        listOf(
            listOf("a. Berdagang","b. Berkebun    ","c. Pegawai   ","d. Nelayan"),
            listOf("a. Danau ","b. Laut","c. Empang","d. Kolam"),
            listOf("a. Musim   ","b. Salju  ","c. Awan  ","d. Cuaca")
        ),
        listOf(
            listOf("a. Cuaca panas   ","b. Cuaca cerah   ","c. Cuaca berangin","d. Cuaca mendung"),
            listOf("a. Padi   ","b. Jagung   ","c. Kangkung  ","d. Genjer"),
            listOf("a. Susu dan daging   ","b. Daging dan telur  ","c. Kulit dan tenaga","d. Telur dan susu")
        ),
        listOf(
            listOf("a. Mengadakan lomba berburu","b. Membasmi hewan yang buas","c. Mendirikan kebun binatang","d. Mendirikan tempat adu hewan"),
            listOf("a. Dapat berubah bentuk   ","b. Dapat berubah ukuran","c. Berbentuk padat ","d. Volume berubah-ubah"),
            listOf("a. Palung    ","b. Pantai   ","c. Tanjung  ","d. Semenanjung")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(1,0,1),
        listOf(3,0,2),
        listOf(3,0,3),
        listOf(3,3,3),
        listOf(3,2,3),
        listOf(3,1,0),
        listOf(3,0,0),
        listOf(2,3,0),
        listOf(3,2,1),
        listOf(3,0,1),
        listOf(1,2,2),
        listOf(3,3,1),
        listOf(1,1,3),
        listOf(3,1,3),
        listOf(2,2,0)






    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas3, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIpa.scoreIpaKelas3 < 1) 0 else scoreManagerIpa.scoreIpaKelas3 / 5
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
            val getData = soalIpasd3[jawabanBenar6][i]
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

                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas3
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpasd3.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas3 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas3 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd3[jawabanBenar6][i]
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