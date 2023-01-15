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


class SoalPaiKelas6 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalPaisd6: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Surat Al-Kafirun mengandung pesan toleransi beragama yaitu…
""", 0),
            Pair("""2. Ayat terakhir Surat Al-Kafirun mengandung makna tentang…
""", 0),
            Pair("""3. Perilaku menghormati dan tetap berbudi pekerti yang baik kepada orang yang berbeda agama disebut….
""", 0)),

        listOf(Pair("""4. عَابِدٞ مَّا  Cara membaca kalimat di samping yang benar adalah…
""", 0),
            Pair("""5. Cara membaca kata atau kalimat yang mengandung tasyid adalah….
""", 0),
            Pair("""6. Dalam Surat Al-Kafirun ada ayat yang diulang dua kali, ayat tersebut adalah…
""", 0)),

        listOf(Pair("""7 . Meninggalnya seseorang merupakan contoh tanda kiamat…
""", 0),
            Pair("""8 . Setelah meninggal, seseorang akan ditempatkan di alam kubur yang disebut juga dengan…
""", 0),
            Pair("""9 . Dengan percaya kepada Hari Kiamat, sikap kita yang benar dalam kehidupan sehari-hari yaitu…
""", 0)),

        listOf(Pair("""10. Ngerinya keadaan di Padang Mashyar menyadarkan kepada kita bahwa setiap perbuatan akan dimintai pertanggungjawabannya. 
Oleh karena itu, hal yang perlu kita renungkan adalah…
""", 0),
            Pair("""11. Dalam Surah Al-Qoriah, seseorang yang timbangan amal kebaikannya lebih sedikit daripada amal keburukannya akan ditempatkan di…
""", 0),
            Pair("""12. Ditiupnya sangkakala oleh malaikat merupakan akhir dari pertanda…
""", 0)),

        listOf(Pair("""13. Allah akan selalu menerima tobat seorang hamba kecuali atas dua keadaan. Yang pertama adalah ajal, dan yang kedua adalah…
""", 0),
            Pair("""14. Seorang manusia hidupnya selalu membutuhkan bantuan orang lain, sedangkan Allah tidak sekali pun membutuhkan bantuan makhluk karena Allah bersifat…
""", 0),
            Pair("""15. Selama ini kita masih saja bingung bila ditanyakan mana yang lebih dahulu lahir apakah telur ayam atau induk ayam. Walau begitu, kita mengetahui bahwa tidak ada satupun yang lebih dahulu daripada Allah karena Allah Maha Mendahulukan, atau yang disebut dengan…
""", 0)),

        listOf(Pair("""16. Allah Maha Berkuasa atas segala sesuatu, sedangkan kita tidak pernah mengetahui hasil apa yang kita dapatkan dari sebuah rencana. 
Walau begitu, sikap kita yang benar adalah…
""", 0),
            Pair("""17. Dalam menjalani hidup, kita sebaiknya berperilaku fastabiqul khoirot yang artinya…
""", 0),
            Pair("""18. Zakat yang baru akan diwajibkan setelah sampai nisabnya disebut…
""", 0)),

        listOf(Pair("""19.Untuk menghitung berapa zakat yang wajib dikeluarkan oleh pekerja seperti YouTuber, Blogger, Akuntan, hingga Presiden, maka bisa kita gunakan….
""", 0),
            Pair("""20. Pak Alan memiliki seorang istri dan empat orang anak. Jika tiap-tiap orang memiliki kewajiban zakat fitrah senilai 3,5 liter beras, berapakah total wajib zakat yang harus dibayar oleh keluarga Pak Alan?""", 0),
            Pair("""21. Berikut ini adalah orang yang tidak berhak menerima zakat adalah…
""", 0)),

        listOf(Pair("""22. Selain mengajak kita untuk peduli kepada sesama manusia, zakat sebenarnya adalah sarana untuk membersihkan…
""", 0),
            Pair("""23. Berikut adalah salah satu contoh sikap meneladan perilaku Rasulullah SAW yaitu…
""", 0),
            Pair("""24. Kodifikasi Al-Quran dilakukan pada masa khalifah…
""", 0)),

        listOf(Pair("""25. Khalifah Umar bin Khattab walaupun tegas dan pemberani beliau tetap mau mendengar pendapat sahabat lain dalam berdiskusi. Teladan yang bisa kita petik dari beliau yaitu…
""", 0),
            Pair("""26. Di dalam Q.S Al Maidah ayat 2 Allah SWT berfirman yang artinya : 
“Dan tolong menolonglah kamu dalam mengerjakan ... dan jangan tolong menolong dalam berbuat dosa dan pelanggaran”.                                                       
""", 0),
            Pair("""27. Seruan agar saling mengenal menurut surah Al- hujarat  ayat 13  ditujukan kepada ...""", 0)),

        listOf(Pair("""28. Surah Al- Kafirun merupakan surah yang memerintahkan umat muslim untuk senantiasa menjaga ....""", 0),
            Pair("""29. Sikap berusaha disertai dengan doa dan berserah diri kepada Allah akan usaha yang dilakukan disebut ....""", 0),
            Pair("""30. Qada yaitu ketentuan-ketentuan Allah yang ...""", 0)),

        listOf(Pair("""31. Contoh perilaku hormat dan patuh kepada guru dapat diwujudkan dengan berbuat baik kepada guru, antara lain ...""", 0),
            Pair("""32. Memberi salam, minta izin dan mencium tangan ketika akan berangkat ke sekolah adalah salah satu contoh hormat dan patuh kepada  ...""", 0),
            Pair("""33. Jika bertemu dengan saudara yang lebih tua, hendaknya memberi salam dan mencium tangannya adalah salah satu sikap hormat dan patuh kepada ...""", 0)),

        listOf(Pair("""34. Salah satu hikmah berinfak dan bersedekah adalah ...""", 0),
            Pair("""35. Pemberian barang atau jasa, yang bersifat materi dan nonmateri adalah pengetian dari ...""", 0),
            Pair("""36. Kesalahan nabi Yunus sehingga terpilih dalam undian untuk terjun ke laut karena …
""", 0)),

        listOf(Pair("""37. ... yang taat beribadah terus berdoa tidak putus-putusnya kepada allah swt, hingga allah mengabulkan doanya, sehingga ia memperoleh anak walaupun usianya telah tua. Anaknya itu diberi nama Yahya
""", 0),
            Pair("""38. ... tetap menyampaikan larangan Allah Swt. kepada Raja Hirodus yang ingin menikahi anak tirinya, Herodia
""", 0),
            Pair("""39. Nabi yang  diberi mukjizat oleh Allah dapat berbicara dengan manusia ketika masih bayi atau masih dalam buaian adalah ...""", 0)),

        listOf(Pair("""40. Salah satu contoh sifat Ashabul Kahfi yang berusaha untuk menyelamatkan akidahnya (keimanannya) kepada Allah Swt adalah ...""", 0),
            Pair("""41. Allah Swt. menciptakan manusia terdiri dari laki-laki dan perempuan, Manusia itu suka berkumpul dan berkelompok sehingga mereka membentuk suatu suku atau bangsa adalah kandungan dari ...""", 0),
            Pair("""42. Berhati-hati jika berada di tempat keramaian atau di jalan raya yang padat kendaraan adalah salah satu hikmah beriman kepada ...""", 0)),

        listOf(Pair("""43. Saat belajar, tidak banyak bercanda di dalam kelas. adalah salah satu sikap hormat dan patuh kepada ...""", 0),
            Pair("""44. Menghormati pendapat teman yang berbeda dengan pendapat kita adalah salah satu sikap ...""", 0),
            Pair("""45. Mendengarkan curahan hati teman hingga selesai. adalah salah satu sikap ...""", 0)),

        listOf(Pair("""46. Siapa Khulafaurrasyidin terakhir?""", 0),
            Pair("""47. Apakah perbedaan qoda dan qodar?""", 0),
            Pair("""48. Hadis dibawah ini menganjurkan umat manusia untuk berbuat baik kepada …
""", 0)),

        listOf(Pair("""49. Sebutkan 3 contoh perilaku toleran?""", 0),
            Pair("""50. Sebutkan  hikmah berinfak dan bersedekah?""", 0),
            Pair("""51. Nabi Yunus bin Matta diutus oleh Allah Swt. untuk berdakwah kepada penduduk ...""", 0)),

        listOf(Pair("""52. Sebutkan hikmah dan suri  teladan kisah Nabi Zakariya a.s?""", 0),
            Pair("""53. Sebutkan hikmah dan suri  teladan kisah Nabi Yahya a.s?""", 0),
            Pair("""54. Sebutkan  hikmah dan suri  teladan kisah Nabi Isa a.s?""", 0)),

        listOf(Pair("""55. Ashabul Kahfi menceritakan tujuh orang pemuda dan seekor anjing yang ditidurkan oleh Allah Swt. 
Kisah Ashabul Kahfi dapat kita temui dalam alquran Surat ... ayat ...
""", 0),
            Pair("""56. Tuliskan bacaan Surah Al-Kafirun ayat 2!""", 0),
            Pair("""57. Sebutkan nama-nama sahabat Rasulullah yang tergolong Khulafaurrasyidin...""", 0)),

        listOf(Pair("""58. Alan adalah seorang muslim, sedangkan temannya yang bernama Tono beragama Kristen. Suatu hari, 
Tono mengajak Alan yang beragama muslim untuk beribadah ke gereja. Sikap Alan yang benar adalah…
""", 0),
            Pair("""59. Apa saja dampak yang akan kita rasakan bila enggan menjaga lingkungan?""", 0),
            Pair("""60. Salah satu cara kita beriman kepada Hari Akhir ialah…
""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Hanya agama Islam saja yang diperbolehkan","b. Tidak perlu menghormati orang yang beragama lain","c. Setiap orang diperbolehkan untuk menganut agama dan kepercayaannya masing-masing","d. Semua Agama orang harus Islam"),
            listOf("a. Larangan menyembah selain Allah","b. Larangan mencampur-adukkan agama","c. Larangan memakan makanan haram","d. Larangan mengambil yang bukan Hak nya"),
            listOf("a. Toleransi beragama","b. Pilih-pilih agama","c. Murtad","d. Kafir")
        ),
        listOf(
            listOf("a. ‘Abidunn-ma","b. ‘Abadam-ma","c. ‘Abidum-ma","d. ‘Abudum-ma"),
            listOf("a. Dibaca dengung","b. Dibaca dobel (ganda)","c. Dibaca panjang","d. Dibaca pendek"),
            listOf("a. Ayat 3 dan 5","b. Ayat 2 dan 5","c. Ayat 1 dan 5","d. Ayat 1 dan 2")
        ),
        listOf(
            listOf("a. Kedua","b. Kubra","c. Bukan pertanda kiamat","d. Sugra"),
            listOf("a. Alam gaib","b. Alam barzah","c. Alam akhirat","d. Alam lain"),
            listOf("a. Hidup seperti biasanya","b. Bekerja keras untuk mencari banyak uang","c. Memperbanyak ibadah dan beramal saleh","d. Menunggu samapai datang")
        ),
        listOf(
            listOf("a. Orang lain bisa menolong kita di Hari Kiamat","b. Hanya amal kitalah yang bisa menjadi penolong di akhirat","c. Pada akhirnya setiap orang dijamin masuk surga","d. Nasib orang lain"),
            listOf("a. Neraka Jahannam","b. Neraka Jahim","c. Neraka Hawiyah","d. Neraka Well"),
            listOf("a. Kiamat Kubra","b. Kiamat Sugra","c. Hidup di dunia","d. Kiamat mulai")
        ),
        listOf(
            listOf("a. Sakit","b. Kiamat kecil","c. Matahari terbit dari barat","d. Lupa"),
            listOf("a. As-Somad","b. Al-Muqtadir","c. Al-Muqaddim","d. Al-Malik"),
            listOf("a. Al-Mulk","b. Al-Muqaddim","c. Al-Baqi","d. Al-Hakim")
        ),
        listOf(
            listOf("a. Tetap berusaha dan optimis","b. Bermalas-malasan berkerja karena rezeki sudah dijamin","c. Tidak perlu belajar karena hasilnya sudah jelas","d. Menunngu sampai datang pertolongan dari Allah"),
            listOf("a. Berlomba-lomba dalam berkeburukan","b. Berlomba-lomba dalam kebaikan","c. Rajin mengikuti lomba yang berhadiah","d. Rajin menjawabn kuis di tv"),
            listOf("a. Zakat fitrah","b. Zakat Niaga","c. Zakat profesi","d. Zakat mal")
        ),
        listOf(
            listOf("a. Hitungan zakat fitrah","b. Hitungan zakat mal","c. Hitungan zakat emas","d. Hitungan Zakat Niaga"),
            listOf("a. 19 liter beras","b. 20 liter beras","c. 18 liter beras","d. 21 liter beras"),
            listOf("a. Fakir","b. Miskin","c. Pengusaha","d. Pedagang")
        ),
        listOf(
            listOf("a. Harta dan jiwa","b. Harta dan rumah","c. Harta dan kekuasaan","d. Harta dan Jabatan"),
            listOf("a. Belajar saat ujian tiba","b. Sholat di rumah saja","c. Hemat dalam menggunakan air saat berwudhu","d. Menanyakan kunci jawaban kepada teman"),
            listOf("a. Umar bin Khattab","b. Usman bin Affan","c. Ali bin Abi Thalib","d. Abu Bakar ")
        ),
        listOf(
            listOf("a. Bermusyawarah","b. Gotong-royong","c. Berwibawa","d. Bersahaja"),
            listOf("a. Kebaikan dan keadilan","b. Keadilan dan kebijaksanaan","c. Kebajikan dan takwa","d. Bersyukur dan bertaqwa"),
            listOf("a. Orang kafir","b. Orang beriman","c. Seluruh manusia","d. Orang bertaqwa")
        ),
        listOf(
            listOf("a. Pandangannya","b. Kemurnian akidah","c. Harta mereka","d. Ketakwaannya"),
            listOf("a. Qadar","b. Qada","c. Tawakal","d. Sabar"),
            listOf("a. Tidak menjadi kenyataan","b. Tidak dapat berubah","c. Dapat dirubah","d. Diketahui oleh para rasul")
        ),
        listOf(
            listOf("a. Minta izin terlebih dulu jika ingin bermain ke rumah teman","b. Mematuhi setiap nasihat kebaikan dari orang yang lebih tua","c. Berpakaian seragam sesuai dengan aturan sekolah","d. Mendengarkan penjelasan guru di kelas"),
            listOf("a. Orang tua","b. Teman","c. Guru ","d. Sahabat"),
            listOf("a. Guru ","b. Teman ","c. Sesama keluarga","d. Sahabat")
        ),
        listOf(
            listOf("a. menjadi kaya raya","b. Harta semakin berkurang","c. Menjadikan orang semakin miskin","d. Dimudahkan Allah Swt dalam usahanya mencari rezeki"),
            listOf("a. Rezeki ","b. Infaq ","c. Zakat ","d. Sedekah"),
            listOf("a. Meninggalkan kaumnya karena berani","b. Meninggalkan kaumnya karena marah","c. Meninggalkan kaumnya karena tidak jujur","d. Meninggalkan kaumnya karena sedih")
        ),
        listOf(
            listOf("a. Nabi Zakaria a.s","b. Nabi Isa a.s.","c. Nabi Musa a.s.","d. Nabi Yunus a.s."),
            listOf("a. Nabi Yunus a.s.","b. Nabi Zakaria a.s","c. Nabi Yahya a.s.","d. Nabi Musa a.s."),
            listOf("a. Nabi Sulaiman a.s.","b. Nabi Zakaria a.s","c. Nabi Isa a.s.","d. Nabi Musa a.s.")
        ),
        listOf(
            listOf("a. Teguh pendirian","b. Mengikuti pemerintah","c. Mengikuti peraturan","d. Teguh dalam keinginan"),
            listOf("a. Q.S. al-hujurat/49:12","b. Q.S. al-hujurat/49:13","c. Q.S. al-Maidah/5: 2","d. Q.S. al-Maidah/5: 3"),
            listOf("a. Tawakal ","b. Qodar","c. Sabar ","d. Qada’")
        ),
        listOf(
            listOf("a. Guru","b. Sahabat ","c. Orang tua","d. Teman "),
            listOf("a. Hormat ","b. Simpatik","c. Patuh ","d. Toleran"),
            listOf("a. Menghormati ","b. Simpatik","c. Toleran","d. Patuh")
        ),
        listOf(
            listOf("a. Khalifah Ali bin Abi Thalib","b. Khalifah Abu Bakar Assidiq","c. Khalifah Utsman bin Affan","d. Khalifah Umar bin Khattab"),
            listOf("a. Perbedaannya adalah qodo kejadian yang dapat diubah dan qodar ketentuan allah swt dapat diubah dengan cara usaha manusia atau ikhtiar","b. Perbedaannya adalah qodo kejadian yang tidak dapat diubah dan qodar ketentuan allah swt tidak dapat diubah dengan cara usaha manusia atau ikhtiar","c. Perbedaannya adalah qodo kejadian yang tidak dapat diubah dan qodar ketentuan allah swt dapat diubah dengan cara usaha manusia atau ikhtiar","d. Perbedaannya adalah qodo kejadian yang dapat diubah dan qodar ketentuan allah swt tidak dapat diubah dengan cara usaha manusia atau ikhtiar"),
            listOf("a. Manusia","b. Orang tuanya","c. Allah","d. Mahluk Hidup")
        ),
        listOf(
            listOf("a. tidak menghormati pendapat teman yang berbeda, tidak membuat kegaduhan di masjid, tidak memasang petasan yang memekakkan telinga","b. menghormati pendapat teman yang berbeda, membuat kegaduhan di masjid, tidak memasang petasan yang memekakkan telinga","c. menghormati pendapat teman yang berbeda, tidak membuat kegaduhan di masjid, tidak memasang petasan yang memekakkan telinga","d. menghormati pendapat teman yang berbeda, tidak membuat kegaduhan di masjid, memasang petasan yang memekakkan telinga"),
            listOf("a. Malaikat akan mendoakan kebaikan kepada orang disedekahi ","b. menambah rezeki orang yang diberi infak dan sedekah","c. akan dihapus salah satu dari dosanya","d. dimudahkan Allah Swt. dalam usahanya mencari rezeki"),
            listOf("a. Niwana","b. Ninawa","c. Niawan","d. Niwawa")
        ),
        listOf(
            listOf("a. Kita tidak boleh putus asa atas setiap cobaan yang Allah Swt","b. Mendapat rejeki yang banyak","c. Sebagai orang yang santai","d. Untuk memperoleh keinginan, kita harus menunggu saja"),
            listOf("a. Acuh sama teman","b. Tidak ikut campur urusan orang","c. Sikap hormat kepada orang tua ","d. Tidak taat pada Allah"),
            listOf("a. Kita meyakini bahwa Nabi Isa diberi wahyu berupa Kitab Suci Taurat","b. Kita meyakini bahwa Nabi Isa diberi wahyu berupa Kitab Suci Zabur","c. Kita meyakini bahwa Nabi Isa diberi wahyu berupa Kitab Suci Al-Quran","d. Kita meyakini bahwa Nabi Isa diberi wahyu berupa Kitab Suci Injil")
        ),
        listOf(
            listOf("a. al-Kafirun ayat13","b. al-Maidah ayat13","c. al-Kahf ayat13","d. al-An-Kabut  ayat13"),
            listOf("a. Wala antum 'abidu nama 'abud","b. Laa'a budu maata' buduun","c. Lakum dii nikum waliyadin","d. Qul yaa ayuuhal kaafirun"),
            listOf("a. Khalifah Abu Bakar as-Shiddiq, Khalifah Uwais bin Khattab, Khalifah Usman bin Affan, dan Khalifah Ali bin Abi Thalib","b. Khalifah Abu Bakar as-Shiddiq, Khalifah Umar bin Khattab, Khalifah Uwais bin Affan, dan Khalifah Ali bin Abi Thalib","c. Khalifah Abu Bakar as-Shiddiq, Khalifah Umar bin Khattab, Khalifah Usman bin Affan, dan Khalifah Uwais bin Abi Thalib","d. Khalifah Abu Bakar as-Shiddiq, Khalifah Umar bin Khattab, Khalifah Usman bin Affan, dan Khalifah Ali bin Abi Thalib")
        ),
        listOf(
            listOf("a. Menolak dengan lemah lembut","b. Menolak dengan lemah keras","c. Menerima dengan lemah lembut","d. Menerima dengan lemah keras"),
            listOf("a. Terserang penyakit, hidup sehat, kekeringan, dan sebagainya.","b. Terserang penyakit, terkena bencana alam, kekeringan, dan sebagainya","c. Mendapat rizki melimpah, terkena bencana alam, kekeringan, dan sebagainya","d. Terserang penyakit, terkena bencana alam, kesuburan, dan sebagainya."),
            listOf("a. Percaya dengan adanya surga dan neraka.  .","b. Percaya bahwa ada kehidupan setelah kematian","c. Percaya bahwa setiap perbuatan akan dimintai pertanggungjawabannya nanti di akhirat","d. Percaya bahwa rejeki kita akan melimpah")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,1,0),
        listOf(2,1,0),
        listOf(3,1,2),
        listOf(1,2,0),
        listOf(2,0,1),
        listOf(0,1,3),
        listOf(2,3,3),
        listOf(0,2,1),
        listOf(0,2,3),
        listOf(1,0,1),
        listOf(3,0,2),
        listOf(3,3,1),
        listOf(0,2,2),
        listOf(0,1,3),
        listOf(0,3,1),
        listOf(0,2,1),
        listOf(2,3,1),
        listOf(0,2,3),
        listOf(2,1,3),
        listOf(0,1,3)






    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas6, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerPai.scorePaiKelas6 < 1) 0 else scoreManagerPai.scorePaiKelas6 / 5
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
            val getData = soalPaisd6[jawabanBenar6][i]
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
            }else {
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

                        var scoreMatSd = scoreManagerPai.scorePaiKelas6
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalPaisd6.size) {
                                scoreMatSd += 5
                                scoreManagerPai.scorePaiKelas6 = scoreMatSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreMatSd += 5
                                scoreManagerPai.scorePaiKelas6 = scoreMatSd
                                Toast.makeText(
                                    activity,
                                    R.string.segments_sukses,
                                    Toast.LENGTH_SHORT
                                ).show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalPaisd6[jawabanBenar6][i]
                                    (listRadiogrup[i].getChildAt(0) as TextView).text =
                                        getData.first
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
                    Toast.makeText(
                        activity,
                        "Anda belum memasukkan semua jawaban",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }// end cek semua jawaban telah di centang
        }
        return view
    }
}