package com.example.pai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

import com.example.alat.ScoreManagerPai
import com.example.myapplication.R


class SoalPaiKelas4 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalPaisd4: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Bunyi Q.S al-Fil sebelum ayat ke 3 adalah ...                         """, R.mipmap.pai_kelas4_soal1),
            Pair("""2. Bunyi Q.S al-Fil setelah ayat ke 2 adalah ... """, R.mipmap.pai_kelas4_soal2),
            Pair("""3. Percaya dengan seopenuh hati diucapkan dengan lisan dan diamalkan dalam kehidupan sehari-hari merupakan pengertian dari …
""", 0)),

        listOf(Pair("""4. Malaikat di ciptakan oleh allah dari …
""", 0),
            Pair("""5. Bagaimana sikapmu terhadap pengemis yang berdiri meminta-minta di depan  rumahmu?""", 0),
            Pair("""6. Salah satu manfaat  memiliki sikap rendah hati adalah …
""", 0)),

        listOf(Pair("""7. Hemat artinya menggunakan ... Tidak berlebihan dan tidak pelit.
""", 0),
            Pair("""8. Salah satu tujuan gemar membaca adalah …
""", 0),
            Pair("""9. Bukti sikap pantang menyerah  antara lain …
""", 0)),

        listOf(Pair("""10. Salah satu contoh manfaat pantang menyerah adalah …
""", 0),
            Pair("""11. Shalat menurut bahasa adalah ...""", 0),
            Pair("""12. Rukun pertama yang dikerjakan ketika salat adalah ...""", 0)),

        listOf(Pair("""13. arti kalimat dari                  adalah ...""", R.mipmap.pai_kelas4_soal13),
            Pair("""14. Lafal doa pada ruku' adalah ... """, R.mipmap.pai_kelas4_soal14),
            Pair("""15. Lafal doa pada sujud adalah ... """, R.mipmap.pai_kelas4_soal15)),

        listOf(Pair("""16. Al-Qur’an menjelaskan bahwa wali Allah adalah ...""",0),
            Pair("""17. Ingatlah wali-wali Allah itu, tidak ada rasa takut pada mereka dan mereka tidak ...""", 0),
            Pair("""18. Arti dari taqwa adalah …
""", 0)),

        listOf(Pair("""19. Mengakui kekuatan selain allah adalah salah satu perbuatan ...""", 0),
            Pair("""20. Salah satu contoh perbuatan maksiat disekolah adalah …
""", 0),
            Pair("""21. Terdiri atas 5 ayat dan memiliki arti “Waktu Subuh” dimiliki oleh Surat…
""", 0)),

        listOf(Pair("""22. Min’syarrimaakholaq adalah bacaan Surat Al-Falaq ayat…
""", 0),
            Pair("""23. Pesan dari Surat Al-Falaq yaitu kita diperintahkan berlindung kepada Allah dari…
""", 0),
            Pair("""24. Allah itu tidak tampak. Cara kita mengenal Allah salah satunya adalah dari…
""", 0)),

        listOf(Pair("""25. Allah Maha Melihat, baik sesuatu yang tampak maupun sesuatu yang disembunyikan oleh makhluk-Nya. Hal ini termasuk kepada asmaul husna…
""", 0),
            Pair("""26. Semua manusia itu sama di hadapan Allah walaupun berbeda keturunan, suku, ras, hingga bahasa. Karena yang berbeda di mata Allah adalah…
""", 0),
            Pair("""27. Allah menciptakan manusia bersuku-suku dan berbangsa-bangsa tiada lain ialah agar kita mau...""", 0)),

        listOf(Pair("""28. Manusia sangat membutuhkan bantuan Allah, sedangkan Allah sedikit pun tidak memerlukan pertolongan makhluk-Nya karena Allah bersifat…
""", 0),
            Pair("""29. اِنَّ اَكْرَمَكُمْ        Bacaan dari kalimat di samping yang benar adalah…
""", 0),
            Pair("""30.           تَنْزِلَ        Huruf ن  pada kalimat di samping berharakat…
""", 0)),

        listOf(Pair("""31. Rasul yang dijuluki “Akhirul Anbiya” adalah…
""", 0),
            Pair("""32. Berikut ini yang bukan merupakan manfaat perilaku jujur yaitu…
""", 0),
            Pair("""33. Mengemban amanah itu berat, maka jangan sekali-kali menyanggupi amanah bila kita…
""", 0)),

        listOf(Pair("""34. Hormat dan patuh kepada guru di sekolah adalah jalan agar…
""", 0),
            Pair("""35. Denis mau berteman dengan siapa saja dan tak mau pilih kasih biarpun temannya kaya, miskin, hingga cacat. Sikap Denis mencerminkan perilaku…
""", 0),
            Pair("""36. Kita menghilangkan hadas kecil dengan cara…
""", 0)),

        listOf(Pair("""37. Sebelum melaksanakan ibadah, tempat sholat kita juga harus dibersihkan dari…
""", 0),
            Pair("""38. Dua anggota badan yang menjadi rukun tayamum adalah…
""", 0),
            Pair("""39. Nabi Ayyub AS tetap rajin memberi walaupun beliau seorang yang kaya raya. Dari Nabi Ayyub AS kita bisa meneladani perilaku…
""", 0)),

        listOf(Pair("""40. Berikut yang merupakan mukjizat yang Allah berikan kepada Nabi Musa AS adalah…
""", 0),
            Pair("""41. Allah sengaja membiarkan jasad Raja Fir’aun hingga hari agar…
""", 0),
            Pair("""42. Nama asli Nabi Zulkifli AS adalah…
""", 0)),

        listOf(Pair("""43. Cara Allah mengetahui orang-orang yang beriman yaitu dengan…
""", 0),
            Pair("""44. “Faja’alahum ka’asfim ma’kuul” adalah bacaan Al-Quran Surah Al-Fiil ayat…
""", 0),
            Pair("""45. Dari kisah pasukan Gajah yang tertuang dalam Surah Al-Fiil, kita bisa memetik pelajaran bahwa…
""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. ","b. ","c. ","d. "),
            listOf("a. ","b. ","c. ","d. "),
            listOf("a. Ihksan ","b. Ilham ","c. Iman","d. Islam ")
        ),
        listOf(
            listOf("a. Api ","b. Cahaya ","c. Tanah ","d. Air "),
            listOf("a. Tanggung jawab","b. Jujur","c. Rendah hati","d. Berani"),
            listOf("a. Dihargai orang","b. Dihormati Orang","c. Dicurigai orang","d. Dipuji orang")
        ),
        listOf(
            listOf("a. Sesuatu sesuai kebutuhan","b. Sesuai keinginan","c. Sesuai kegunaan","d. Sesuai dengan anggaran"),
            listOf("a. Menjadikan kita pintar","b. Memperoleh keinginan","c. Memperoleh kesanangan","d. Memperoleh sikap rendah hati"),
            listOf("a. Memperoleh kesenangan","b. Mendapatkan informasi","c. menambah pengetahuan dan informasi","d. Suka bekerja, tidak boleh berdiam diri")
        ),
        listOf(
            listOf("a. Menjadi berpengalaman","b. Menambah pengetahuan dan informasi","c. Menjadikan  kita pintar","d. Semangat dalam mengerjakan sesuatu"),
            listOf("a. Doa untuk kebaikan","b. Mengingat Allah Swt","c. Ibadah dan bentuk ketaatan kepada  Bersyukur kepada Allah Swt","d. Ibadah yang diawali dengan takbiratul ihram dan diakhiri dengan salam"),
            listOf("a. Takbir","b. Sujud","c. Niat  ","d. Rukuk")
        ),
        listOf(
            listOf("a. Allah maha Penyayang","b. Allah maha besar","c. Allah maha adil","d. Allah maha agung"),
            listOf("a. ","b. ","c. ","d. "),
            listOf("a. ","b. ","c. ","d. ")
        ),
        listOf(
            listOf("a. Orang yang jujurdan adil","b. Orang yang beriman dan bertakwa","c. Orang yang jujur","d. Orang yang jujur dan beriman"),
            listOf("a. Sakit hati","b. Rendah hati","c. Ragu","d. Bersedih hati"),
            listOf("a. Menjauhi segala larangan-Nya dan maksiat-Nya","b. Menjalankan perbuatan baik dan menjauhi maksiat","c. Menjalankan segala perintah-Nya dan jujur","d. Menjalankan segala perintah-Nya dan menjauhi segala larangan-Nya")
        ),
        listOf(
            listOf("a. Syirik ","b. Kikir ","c. Kufur ","d. Munafik "),
            listOf("a. Membohongi orang tua","b. Mengadudomba teman","c. Berbicara kasar kepada guru","d. Mengejek teman"),
            listOf("a. Al-Ikhlas","b. An-Naas","c. Al-Falaq","d. AS-Subh")
        ),
        listOf(
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. Kebaikan makhluk-Nya","b. Kemalasan","c. Kesombongan","d. Kejahatan makhluk-Nya"),
            listOf("a. Alam semesta ciptaan Allah","b. Buku","c. Perkataan guru","d. Cerita")
        ),
        listOf(
            listOf("a. As-Sami’","b. Al-Basir","c. Ar-Rahman","d. Al-Jamal"),
            listOf("a. Kekayaan","b. Warna kulit","c. Taqwa","d. Jabatan"),
            listOf("a. Saling mengejek","b. Saling melihat","c. Saling menyindir","d. Saling mengenal")
        ),
        listOf(
            listOf("a. Ar-Rahman","b. Al-Malik","c. Al-‘Azim","d. Al-Falaq"),
            listOf("a. Inna-akara-makum","b. Inna-akra-makum","c. Inna-kara-makum","d. Inna-kara-maklum"),
            listOf("a. Sukun","b. Dommah","c. Fathah","d. Kasroh")
        ),
        listOf(
            listOf("a. Nabi Adam AS","b. Nabi Ibrahim AS","c. Nabi Muhammad SAW","d. Nabi Musa"),
            listOf("a. Mendapat banyak uang","b. Mendapat dukungan","c. Mendapat banyak teman","d. Mendapat kepercayaan"),
            listOf("a. Mampu melakukannya","b. Tidak mampu melakukannya","c. Tidak peduli terhadapnya","d. Tidak mau melihat")
        ),
        listOf(
            listOf("a. Ilmu yang dipelajari mendapat berkah","b. Tidak diberi banyak PR","c. Bisa bersekolah dengan santai","d. Bisa bebas ijin"),
            listOf("a. Jujur","b. Cerdas","c. Amanah","d. Santun"),
            listOf("a. Mandi","b. Berwudhu","c. Dibiarkan saja","d. Berjemur")
        ),
        listOf(
            listOf("a. Makanan","b. Hadas","c. Kuman","d. Najis"),
            listOf("a. Muka dan kaki","b. Muka dan kedua tangan","c. Muka dan mulut","d. Kaki dan kedua tangan"),
            listOf("a. Kedermawanan","b. Rendah hati","c. Adil","d. Jujur")
        ),
        listOf(
            listOf("a. Mampu membuat baju besi","b. Tongkatnya mampu membelah lautan","c. Mampu berbicara dengan hewan dan jin","d. Mampu hidup meskipun dibakar"),
            listOf("a. Di museum kan","b. Membuat orang ketakutan","c. Bisa dilihat banyak orang","d. Menjadi bukti bahwa kisah Nabi itu benar"),
            listOf("a. Basyar","b. Harun","c. Abu Bakar","d. Ahmad")
        ),
        listOf(
            listOf("a. Melihat pakaian manusia","b. Menguji manusia","c. Melihat tingkah laku manusia","d. Menjadi bukti bahwa kisah Nabi itu benar"),
            listOf("a. 3","b. 4","c. 5","d. 7"),
            listOf("a. Beriman kepada Allah itu wajib","b. Tidak boleh sombong hidup di bumi ciptaan Allah","c. Selalu melaksanakan ibadah sholat","d. Jujur dalam perilaku dan ucapan")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,0,2),
        listOf(1,2,1),
        listOf(0,0,3),
        listOf(3,0,2),
        listOf(1,3,2),
        listOf(1,3,3),
        listOf(0,2,2),
        listOf(1,3,0),
        listOf(1,2,3),
        listOf(2,1,0),
        listOf(2,1,1),
        listOf(0,3,1),
        listOf(3,1,0),
        listOf(1,3,0),
        listOf(1,2,1)




    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas4, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerPai.scorePaiKelas4 < 1) 0 else scoreManagerPai.scorePaiKelas4 / 5

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
            val getData = soalPaisd4[jawabanBenar6][i]
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

            if(grup1.checkedRadioButtonId != -1 && grup2.checkedRadioButtonId != -1 && grup3.checkedRadioButtonId != -1){
                if(done){
                    Toast.makeText(requireActivity().applicationContext, "Anda telah mengerjakan ini", Toast.LENGTH_SHORT).show()
                }else{
                    val pilihGrup1 = view.findViewById<RadioButton>(grup1.checkedRadioButtonId).text.toString()
                    val pilihGrup2 = view.findViewById<RadioButton>(grup2.checkedRadioButtonId).text.toString()
                    val pilihGrup3 = view.findViewById<RadioButton>(grup3.checkedRadioButtonId).text.toString()
                    val ch1 = pilihanGanda6[jawabanBenar6][0][kunciJawaban6[jawabanBenar6][0]]
                    val ch2 = pilihanGanda6[jawabanBenar6][1][kunciJawaban6[jawabanBenar6][1]]
                    val ch3 = pilihanGanda6[jawabanBenar6][2][kunciJawaban6[jawabanBenar6][2]]

                    var scoreMatSd = scoreManagerPai.scorePaiKelas4
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar6++

                        if(jawabanBenar6 == soalPaisd4.size){
                            scoreMatSd +=5
                            scoreManagerPai.scorePaiKelas4 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManagerPai.scorePaiKelas4 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalPaisd4[jawabanBenar6][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda6[jawabanBenar6][i][j-2]
                                    listRadiogrup[i].clearCheck()
                                }
                            }
                        }

                    }else{
                        // kalau jawaban salah
                        Toast.makeText(activity,getString(R.string.toast_salah), Toast.LENGTH_SHORT).show()
                        for(i in listRadiogrup){
                            i.clearCheck()
                        }
                    }
                } // end cek jawab
            }else {
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT).show()
            } // end cek semua jawaban telah di centang
        }
        return view
    }
}