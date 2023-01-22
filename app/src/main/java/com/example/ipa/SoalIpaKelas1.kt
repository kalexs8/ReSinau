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


class SoalIpaKelas1 : Fragment() {

    private var jawabanBenar = 0
    private val soalIpasd1: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Tidak menggosok gigi menyebabkan gigi ....""", 0),
            Pair("""2. Agar tubuh kita sehat, kita perlu makanan yang ....""", 0),
            Pair("""3. Ikan, telur, tahu, dan tempe termasuk jenis makanan yang mengandung ....""", 0)),

        listOf(Pair("""4. Rumah tidak sehat adalah rumah yang tidak memiliki ....""", 0),
            Pair("""5. Lubang untuk keluar masuknya udara disebut ....""", 0),
            Pair("""6. Lingkungan yang bersih adalah lingkungan yang ....""", 0)),

        listOf(Pair("""7. Budi membersihkan meja menggunakan ....""", 0),
            Pair("""8. Air untuk minum harus ....""", 0),
            Pair("""9. Udara yang bersih diperoleh di daerah ....""", 0)),

        listOf(Pair("""10. Kuku dirawat dengan cara ....""", 0),
            Pair("""11. Bagian tubuh yang digunakan untuk mendengar adalah ....""", 0),
            Pair("""12. Menggosok gigi sebaiknya setelah makan dan sebelum ....""", 0)),

        listOf(Pair("""13. Berikut ini kegunaan kulit adalah ....""", 0),
            Pair("""14. Anggota gerak manusia ada dua yaitu anggota gerak atas dan anggota gerak bawah. Anggota gerak atas adalah ....""", 0),
            Pair("""15. Ilustrasi gambar gigi sehat
Bagian tubuh seperti pada gambar berfungsi untuk ....
""", R.mipmap.soal_pas_kelas1_ipa_15)),

        listOf(Pair("""16. Membuang sampah yang benar adalah di ....""", 0),
            Pair("""17. Batang kayu
Benda seperti pada gambar dapat diubah bentuknya menjadi ....
""", R.mipmap.soal_pas_kelas1_ipa_17),
            Pair("""18. Jeruk memiliki bentuk seperti ....""", 0)),

        listOf(Pair("""19. Membuat mainan dari plastisin dengan cara ....""", 0),
            Pair("""20. Ciri-ciri lingkungan sehat dalam masyarakat
Gambar di bawah menunjukkan lingkungan ....
""", R.mipmap.soal_pas_kelas1_ipa_20),
            Pair("""21. buah jeruk
Buah seperti pada gambar banyak mengandung vitamin ....
""", R.mipmap.soal_pas_kelas1_ipa_21)),

        listOf(Pair("""22. Udara yang kotor dapat mengganggu ....""", 0),
            Pair("""23. Hewan yang suka hinggap di tempat kotor adalah ....""", 0),
            Pair("""24. Nasi adalah makanan yang mengandung karbohidrat yang dibutuhkan tubuh sebagai ....""", 0)),

        listOf(Pair("""25. Nasi, lauk pauk, sayur, buah, dan susu disebut makanan ....""", 0),
            Pair("""26. Buah jeruk banyak mengandung vitamin ....""", 0),
            Pair("""27. Udara yang kotor dapat mengganggu ....""", 0)),

        listOf(Pair("""28. Di bawah ini yang merupakan ciri-ciri makhluk hidup adalah….
""", 0),
            Pair("""29. Menanam pohon di depan rumah membuat udara terasa ...""", 0),
            Pair("""30. Agar rumah menjadi sehat, harus selalu ...""", 0)
        )
    )

    private  val pilihanGanda: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. berwarna putih","b. tumbuh sehat","c. berlubang"),
            listOf("a. banyak","b. enak","c. bergizi"),
            listOf("a. karbohidrat","b. protein","c. vitamin")
        ),
        listOf(
            listOf("a. tempat sampah","b. mobil","c. meja dan kursi"),
            listOf("a. pintu","b. jendela","c. ventilasi"),
            listOf("a. tidak ada ventilasi","b. tidak ada sampah berserakan","c. tidak ada sinar matahari")
        ),
        listOf(
            listOf("a. sapu","b. kemoceng","c. kain pel"),
            listOf("a. direbus","b. dijemur","c. dipanaskan"),
            listOf("a. perkotaan","b. perumahan","c. pegunungan")
        ),
        listOf(
            listOf("a. dicat","b. diwarnai","c. dipotong"),
            listOf("a. hidung","b. telinga","c. mulut"),
            listOf("a. minum","b. belajar","c. tidur")
        ),
        listOf(
            listOf("a. alat pembau","b. alat peraba","c. alat pernapasan"),
            listOf("a. kepala","b. tangan","c. kaki"),
            listOf("a. mencium bau","b. mengecap rasa","c. mengunyah makanan")
        ),
        listOf(
            listOf("a. selokan","b. sungai","c. tong sampah"),
            listOf("a. genting","b. lemari","c. baju"),
            listOf("a. telur ayam","b. dadu","c. bola kasti")
        ),
        listOf(
            listOf("a. digunting","b. dipotong-potong","c. ditekan-tekan"),
            listOf("a. kotor","b. sehat","c. Kumuh"),
            listOf("a. A","b. B","c. C")
        ),
        listOf(
            listOf("a. pernapasan","b. pencernaan","c. penglihatan"),
            listOf("a. lebah","b. burung","c. lalat"),
            listOf("a. sumber tenaga","b. zat pembangun","c. zat pengatur")
        ),
        listOf(
            listOf("a. empat sehat","b. lima sempurna","c. empat sehat lima sempurna"),
            listOf("a. A","b. B","c. C"),
            listOf("a. pernapasan","b. pencernaan","c. penglihatan")
        ),
        listOf(
            listOf("a. berkembang biak","b. mati","c. tidak berkembang"),
            listOf("a. sejuk","b. dingin","c. panas"),
            listOf("a. disirami","b. dicat","c. dibersihkan")
        )
    )

    private val kunciJawaban: List<List<Int>> = listOf(
        listOf(2,2,1),
        listOf(0,2,1),
        listOf(1,0,2),
        listOf(2,1,2),
        listOf(1,1,2),
        listOf(2,1,2),
        listOf(2,1,2),
        listOf(0,2,0),
        listOf(2,2,0),
        listOf(0,0,2)


    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas1, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar = if(scoreManagerIpa.scoreIpaKelas1 < 1) 0 else scoreManagerIpa.scoreIpaKelas1 / 5
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
            val getData = soalIpasd1[jawabanBenar][i]
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
                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas1
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar++

                            if (jawabanBenar == soalIpasd1.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas1 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas1 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd1[jawabanBenar][i]
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