package com.example.pai

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.EnergyManager

import com.example.alat.ScoreManagerPai
import com.example.myapplication.R


class SoalPaiKelas5 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalPaisd5: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Pada ayat di bawah ini huruf yang berharakat tasydid ialah …
""", R.mipmap.pai_kelas5_soal1),
            Pair("""2. Salah satu makna kandungan surah Q.S. al-Ma'un adalah …
""", 0),
            Pair("""3. Seorang rasul harus pandai dan cerdas akalnya, memiliki kekuatan berpikir yang tinggi, dan memiliki hati yang bersih atau akal budi yang tinggi adalah pengertian dari sifat …
""", 0)),

        listOf(Pair("""4. Siti disuruh membelikan gula ke warung oleh ibunya, ternyata uangnya tersisa 2000, maka siti mengembalikan uang kepada ibunya, termasuk sifat apakah yang dilakukan siti ...""", 0),
            Pair("""5. Selama 950 tahun Nabi Nuh a.s. menyiarkan ajaran Allah Swt., tetapi umatnya tetap saja ingkar termasuk anaknya sendiri yang bernama ...""", 0),
            Pair("""6. Nabi  Ibrahim  a.s. hidup pada masa …
""", 0)),

        listOf(Pair("""7. Ibu dari Nabi  musa  a.s adalah ...""", 0),
            Pair("""8. Nabi Muhammad saw. mendapat julukan “al Amin” yang artinya ...""", 0),
            Pair("""9. Menurut  al-Qur’ān, hidup sederhana itu adalah di antara …
""", 0)),

        listOf(Pair("""10. Salah satu keuntungan hidup sederhana adalah …
""", 0),
            Pair("""11. Bahayanya, kalau sikap boros itu suatu ketika tidak dapat  terpenuhi, maka timbullah berbagai macam permasalahan seperti …
""", 0),
            Pair("""12. Pak Ahmad membantu dengan hati bersih tanpa mengharapkan sesuatu balasan atau imbalan, adalah salah satu sikap ...""", 0)),

        listOf(Pair("""13. Salat sunah malam yang dikerjakan pada malam hari di bulan Ramadhan adalah ...""", 0),
            Pair("""14. Bilangan rakaat sholat tarawih boleh ... rakaat atau ... rakaat.
""", 0),
            Pair("""15. Rasulullah saw. menganjurkan kepada kaum muslimin untuk menghidupkan malam-malam bulan Ramadhan dengan memperbanyak  Qiyamul-lail seperti salat sunah, membaca al-Qur’an dan berzikir. artinya dari  Qiyamul-lail adalah …
""", 0)),

        listOf(Pair("""16. Arti dari tadarus adalah …
""", 0),
            Pair("""17. Luqman mendapat gelar al-Hakim yang artinya ...""", 0),
            Pair("""18. Lengkapilah potongan ayat dibawah ini …
""", R.mipmap.pai_kelas5_soal18)),

        listOf(Pair("""19. Menjadikan kayu besar sebagai Tuhan lalu dipuja-puja dan disembah. Adalah salah satu contoh …
""", 0),
            Pair("""20. Berkata kasar dan kotor adalah termasuk perbuatan …
""", 0),
            Pair("""21. A’udzubillahiminassyaitonirrojim disebut bacaan…
""", 0)),

        listOf(Pair("""22.  وَالتِّيْنِ Huruf        ت pada kalimat di samping memiliki tanda kasrah dan…
""", 0),
            Pair("""23. Dalam Quran Surat At-Tin ayat 4 dijelaskan bahwa Allah telah menciptakan manusia dengan…
""", 0),
            Pair("""24. Dalam Quran Surat At-Tin ayat 5 ditegaskan bahwa Allah akan mengembalikan manusia ke tempat yang serendah-rendahnya. Maksud tempat tersebut adalah…
""", 0)),

        listOf(Pair("""25. Gunung Sinai dinamakan juga Jabal Musa karena menjadi tempat…
""", 0),
            Pair("""26. Kota Mekkah dalam Surat At-Tiin disebut dengan Ummul Qura’ yang artinya…
""", 0),
            Pair("""27. Allah memiliki nama al-Hayyu yaitu yang Maha Hidup, sedang semua makhluk-Nya pasti akan mengalami…
""", 0)),

        listOf(Pair("""28. Kematian itu tidak tahu kapan datangnya, maka sebaiknya kita berdoa agar hidup ini dipenuhi dengan…
""", 0),
            Pair("""29. Allah memiliki sifat al-Ahad yang berarti bahwa…
""", 0),
            Pair("""30. Dari nama baik Allah Al-Qayyum, teladan yang bisa kita terapkan dalam kehidupan sehari-hari adalah…
""", 0)),

        listOf(Pair("""31. Kitab taurat diwahyukan oleh Allah kepada…
""", 0),
            Pair("""32. Berdasarkan berbagai kitab yang Allah wahyukan kepada Rasul, pelajaran yang bisa kita petik adalah…
""", 0),
            Pair("""33. Beriman kepada kitab Al-Quran tidak cukup sekadar membacanya melainkan juga…
""", 0)),

        listOf(Pair("""34. Melaksanakan sholat fardu sesuai waktu yang ditentukan adalah wujud dari perilaku jujur kepada…
""", 0),
            Pair("""35. Alan selalu berkata jujur, namun ketika diminta pertanggungjawaban dia malah pura-pura tidak tahu. Sifat Alan tidak mencerminkan sikap jujur dalam…
""", 0),
            Pair("""36. Bila guru di sekolah mengumumkan akan melaksanakan gotong-royong esok hari, yang Anda lakukan adalah…
""", 0)),

        listOf(Pair("""37. Sebelum meminta untuk dihargai dalam diskusi, sebaiknya kita terlebih dahulu…
""", 0),
            Pair("""38. Cara agar kita bisa melakukan sikap terpuji dalam kehidupan sehari-hari salah satunya adalah…
""", 0),
            Pair("""39. Nabi yang Allah karuniakan mukjizat dapat melunakkan besi seperti lilin adalah…
""", 0)),

        listOf(Pair("""40. Wahyu pertama Nabi Muhammad SAW yaitu…
""", 0),
            Pair("""41. Rasul yang mendapatkan julukan Khatamul Anbiya adalah…
""", 0),
            Pair("""42. Faris selalu berusaha menyampaikan barang atau titipan kepada orang yang berhak. Faris juga berusaha menyampaikan pesan yang dititipkan oleh Pak Guru. Sikap Faris mencerminkan teladan sifat Nabi yaitu…
""", 0)),

        listOf(Pair("""43. Tugas para Rasul diutus Allah ke muka bumi ialah untuk menyampaikan peringatan dan….
""", 0),
            Pair("""44. “Barang-barang yang berguna” adalah arti dari Surat…
""", 0),
            Pair("""45. Dalam Surah Al-Maun Allah menerangkan ciri-ciri pendusta agama. Yang dimaksud pendusta adalah…
""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Lam – Dzal – Dal","b. Kaf – Lam – Lam","c. Ba’ – Dal – Ta’","d. Dzal – dal – Ya’"),
            listOf("a. Orang beriman  dan melaksanakan amal salih","b. Pembalasan terhadap perbuatan manusia yang baik dan buruk","c. Melarang menghardik anak yatim","d. Menjadikan manusia dalam sebaik-baik bentuk"),
            listOf("a. Siddiq","b. Tablig","c. Amanah ","d. Fatanah ")
        ),
        listOf(
            listOf("a. Amanah ","b. Fatanah ","c. Baligh","d. Tablig "),
            listOf("a. Sam ","b. Kan’an","c. Ham ","d. Yafits"),
            listOf("a. Raja namrud","b. Firaun","c. Raja abraha","d. Raja thalut")
        ),
        listOf(
            listOf("a. Siti sarah","b. Siti aminah","c. Siti  hajar","d. Siti maryam"),
            listOf("a. Cerdas ","b. Bijaksana ","c. Terpercaya ","d. Berbakti kepada orang tua"),
            listOf("a. Berlebihan dan sederhana","b. Berlebihan dan kikir","c. Kikir dan sedang","d. Kikir dan sederhana")
        ),
        listOf(
            listOf("a. Terhindar dari segala penyakit","b. Menghindari hidup boros","c. Membuat orang lain nyaman","d. Menghindari Perselisihan"),
            listOf("a. Bahagia ","b. Senang ","c. Menghalalkan segala cara","d. memberikan barang kepada orang lain"),
            listOf("a. Jujur ","b. Berani ","c. Ikhlas ","d. Tanggung jawab")
        ),
        listOf(
            listOf("a. Salat terawih","b. Salat jenazah","c. Salah subuh","d. Salat isya’"),
            listOf("a. Delapan dan tujuh","b. Dua puluh dan empat","c. Dua puluh dan sepuluh","d. Delapan atau dua puluh"),
            listOf("a. Mempelajari al-Qur’ān","b. Bangun di malam hari melakukan ibadah","c. Tadarus Al-Qur'an","d. Berdiam diri di dalam masjid")
        ),
        listOf(
            listOf("a. Menelaah Al-Qur'an","b. Berdiam diri di dalam masjid","c. Membaca buku","d. Bangun di malam hari melakukan ibadah"),
            listOf("a. Orang yang bijaksana","b. Orang yang cerdas","c. Orang yang penyayang","d. Orang yang dihormati"),
            listOf("a.","b.","c.","d.")
        ),
        listOf(
            listOf("a. Bukti sukur","b. Angkuh dan Sombong","c. Mempersekutukan Allah Swt","d. Ibadah "),
            listOf("a. Baik ","b. Mungkar ","c. Berani ","d. Jujur "),
            listOf("a. Basmalah","b. Istiadzah","c. Hamdalah","d. Tasbih")
        ),
        listOf(
            listOf("a. Fathah","b. Sukun","c. Tasyid","d. Dhommah"),
            listOf("a. Bentuk yang sempurna","b. Semaunya","c. Seadanya","d.  Seperlunya"),
            listOf("a. Neraka","b. Surga","c. Padang Mahsyar","d.  Alam kubur")
        ),
        listOf(
            listOf("a. Nabi Musa lahir","b. Nabi Musa menerima wahyu pertama","c. Nabi Musa wafat","d. Nabi Musa diangkat jadi Nabi"),
            listOf("a. Tanah yang tandus","b. Tanah lapang","c. Gurun pasir","d. Tanah yang aman"),
            listOf("a. Mati","b. Kebaikan","c. Sakit","d. Hidup")
        ),
        listOf(
            listOf("a. Kemalasan","b. Santai-santai saja","c. Keselamatan dan kebermanfaatan","d. Kebersamaan"),
            listOf("a. Allah Maha Merajai","b. Tiada Tuhan Selain Allah","c. Allah Maha Pengasih lagi Maha Penyayang","d.  Allah Maha Penyayang"),
            listOf("a. Merapikan tempat tidur sendiri","b. Selalu bergantung dengan orang lain","c. Sholat lima waktu","d. Puasa senin-kamis")
        ),
        listOf(
            listOf("a. Nabi Muhammad SAW","b. Nabi Isa AS","c. Nabi Musa AS","d. Nabi Nuh"),
            listOf("a. Kitab Al-Quran adalah yang terbaik","b. Kitab Al-Quran adalah penyempurna dari kitab-kitab sebelumnya","c. Hanya kitab terakhir yang perlu kita percayai","d. Kitab Al-Quran adalah yang terakhir"),
            listOf("a. Mempelajari dan mengamalkannya","b. Cukup menghapal ayat pendeknya saja","c. Cukup mendengarkan orang membaca Al-Quran","d. Cukup menghapal ayat panjangnya saja")
        ),
        listOf(
            listOf("a. Diri sendiri","b. Sesama manusia","c. Allah","d. Sesama Mahluk hidup"),
            listOf("a. Perbuatan","b. Perkataan","c. Bersikap","d. Ucapan"),
            listOf("a. Izin tidak sekolah dengan pura-pura sakit","b. Bersemangat datang sekolah sembari membawa alat kebersihan","c. Datang sekolah seperti biasanya tapi tidak perlu membawa alat kebersihan","d. Datanng agak terlambat setelah gotong royong selesai")
        ),
        listOf(
            listOf("a. Mengaku diri paling hebat","b. Bersikap masa bodoh","c. Menghargai pendapat orang lain","d. Tidur samapai makanan keluar baru bangun"),
            listOf("a. Berteman dengan orang-orang sholeh","b. Hidup sesukanya","c. Cukup berbuat baik kepada keluarga saja.","d.  Mentraktir teman satu kelas"),
            listOf("a. Nabi Musa AS","b. Nabi Muhammad SAW","c. Nabi Daud AS","d.  Nabi Sulaiman")
        ),
        listOf(
            listOf("a. Surah Al-Fatihah","b. Surah Al-Alaq ayat 1-5","c. Surah Al-Ikhlas","d. Surah Al-Falaq"),
            listOf("a. Nabi Ibrahim AS","b. Nabi Musa","c. Nabi Sulaiman AS","d. Nabi Muhammad SAW"),
            listOf("a. Shiddiq","b. Tabligh","c. Fathanah","d. Amanah")
        ),
        listOf(
            listOf("a. Kabar gembira","b. Kabar duka","c. Kabar mengerikan","d. Kabar Burung"),
            listOf("a. Al-Falaq","b. Al-Alaq","c. Al-Maun","d. Al-Manfaat"),
            listOf("a. Penipu atau pembohong","b. Anak yang saleh","c. Orang yang rajin","d. Anak berbakti")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(0,2,3),
        listOf(0,1,0),
        listOf(3,2,1),
        listOf(1,2,2),
        listOf(0,3,1),
        listOf(0,0,3),
        listOf(2,1,1),
        listOf(2,0,3),
        listOf(1,3,0),
        listOf(2,1,0),
        listOf(2,1,0),
        listOf(2,0,1),
        listOf(2,0,2),
        listOf(1,3,3),
        listOf(0,2,0)





    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas5, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerPai.scorePaiKelas5 < 1) 0 else scoreManagerPai.scorePaiKelas5 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupmatSD3c)



        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3,


            )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalPaisd5[jawabanBenar6][i]
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

                    var scoreMatSd = scoreManagerPai.scorePaiKelas5
                    if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                        jawabanBenar6++

                        if (jawabanBenar6 == soalPaisd5.size) {
                            scoreMatSd += 5
                            scoreManagerPai.scorePaiKelas5 = scoreMatSd
                            Toast.makeText(
                                activity,
                                "Selamat anda telah menyelesaikan misi",
                                Toast.LENGTH_SHORT
                            ).show()
                            done = true
                        } else {
                            scoreMatSd += 5
                            scoreManagerPai.scorePaiKelas5 = scoreMatSd
                            Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                .show()
                            // refresh ui
                            for (i in 0 until (listRadiogrup.size)) {
                                val getData = soalPaisd5[jawabanBenar6][i]
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