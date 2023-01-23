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


class SoalIpaKelas6 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd6: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Perhatikan gambar berikut 
Dalam rantai makanan dibawah peran musang dan elang adalah ....
""", R.mipmap.soal_pas_kelas6_ipa_1),
            Pair("""2. Perhatikan gambar berikut
hewan seperti gambar beradaptasi dengan cara memiliki ….
""", R.mipmap.soal_pas_kelas6_ipa_2),
            Pair("""3. Perhatikan gambar berikut
untuk melestarikan tumbuhan seperti pada gambar, dapat dillakukan dengan cara ....
""", R.mipmap.soal_pas_kelas6_ipa_3)),

        listOf(Pair("""4. Perhatikan gambar berikut Image result for gambar sistem organ pernafasan manusia 
bagian organ pernafasan yang ditunjukan oleh nomor 4 seperti pada gambar adalah ….
""", 0),
            Pair("""5. Perhatikan gambar
proses pencernaan makanan pada organ yang ditunjuk tanda panah seperti pada gambar terjadi secara ….
""", R.mipmap.soal_pas_kelas6_ipa_5),
            Pair("""6. Para petani yang memiliki sawah di daerah aliran sungai seringkali melakukan pemupukan tanaman padi
di sawahnya secara berlebihan, dengan harapan hasil panennya akan bertambah banyak. Padahal tanpa disadari kegiatan tersebut akan mengakibatkan ….
""", 0)),

        listOf(Pair("""7.Perhatikan pernyataan
1)  Kerbau dan kutu rambut
2)  Lebah dan bunga matahari
3)  Ikan hiu dan ikan remora
4)  Rumput dan kerbau
5)  Salur pare dan batang cabai
bentuk simbiosis yang terjadi pada nomor  2 dan 5 secara berurutan adalah ….
""", 0),
            Pair("""8. Dewasa ini sering terjadi adanya tanaman padi yang terserang hama ulat bulu. Akibatnya tanaman padi tumbuh tidak baik. Untuk mengatasi permasalahan tersebut salah satunya dapat dilakukan dengan cara ….
""", 0),
            Pair("""9. Perhatikan tabel
pasangan bagian tubuh hewan dan fungsinya yang tepat pada tabel ditunjukkan oleh nomor ....
""", R.mipmap.soal_pas_kelas6_ipa_9)),

        listOf(Pair("""10. Perhatikan gambar
gambar tersebut termasuk sendi ….
""", R.mipmap.soal_pas_kelas6_ipa_10),
            Pair("""11. Perhatikan tabel dibawah ini 
pasangan tumbuhan dan cara perkembangbiakan yang tepat ditunjukkan oleh nomor ….
""", R.mipmap.soal_pas_kelas6_ipa_11),
            Pair("""12.Perhatikan gambar berikut 
pemanfaatan energi alternatif dalam kehidupan sehari-hari ditunjukkan oleh alat seperti pada gambar nomor ….
""", R.mipmap.soal_pas_kelas6_ipa_12)),

        listOf(Pair("""13. Perhatikan gambar
metamorfosis yang dialami hewan seperti pada gambar yang benar adalah ….
""", R.mipmap.soal_pas_kelas6_ipa_13),
            Pair("""14.Perhatikan pernyataan berikut 
(1) dapat menarik semua benda
(2) memiliki medan magnet
(3) dapat menembus benda bening
(4) memiliki banyak kutub
sifat magnet yang benar ditunjukkan oleh nomor ....
""", 0),
            Pair("""15. Urutan peredaran darah kecil yang benar adalah ....  """, R.mipmap.soal_pas_kelas6_ipa_15)),

        listOf(Pair("""16. Benda-benda dibawah ini yang termasuk konduktor panas adalah ….
""", 0),
            Pair("""17. Gigi berfungsi untuk mencerna makanan secara mekanis di mulut. dari fungsi tersebut, gigi mudah terkena karies gigi yang disebabkan oleh infeksi bakteri. Salah satu cara yang dapat dilakukan untuk mencegah terjadinya karies gigi adalah....""", 0),
            Pair("""18. Perhatikan gambar
gambar tersebut adalah bentuk model tiruan organ ….
""", R.mipmap.soal_pas_kelas6_ipa_18)),

        listOf(Pair("""19. Perhatikan gambar berikut Hasil gambar untuk wujud benda padat 
sifat benda seperti gambar dibawah adalah...
""", R.mipmap.soal_pas_kelas6_ipa_19),
            Pair("""20.Perhatikan tabel di bawah ini
pasangan bahan penyusun benda dan sifatnya yang benar ditunjukkan oleh nomor ….
""", R.mipmap.soal_pas_kelas6_ipa_20),
            Pair("""21. Perhatikan pernyataan
1) menjemur baju basah
2) membuat agar-agar
3) meneteskan ujung lilin yang menyala
perubahan wujud benda yang terjadi pada kegiatan tersebut secara berurutan adalah . . . .
""", 0)),

        listOf(Pair("""22.Perhatikan pernyataan 
1) terjadinya kabut
2) pengaspalan jalan
3) pengisian gas LPG
4) pembuatan es krim
5) pembuatan garam
kegiatan yang mengalami perubahan wujud benda yang sama ditunjukkan oleh pernyataan nomor ….
""", 0),
            Pair("""23. Kabel listrik merupakan bagian penting dalam rangkaian listrik. Untuk itu bahan yang digunakan untuk membuatnya harus mempunyai sifat-sifat tertentu, antara lain ….
""", 0),
            Pair("""24. Perhatikan gambar berikut  Hasil gambar untuk parasut terjun payung 
gaya yang digunakan pada kegiatan seperti gambar dibawah adalah ….      
""", 0)),

        listOf(Pair("""25. Perhatikan tabel berikut
1) angin
4) matahari
2) batu bara
5) LPG
3) minyak bumi
6) bioetanol
sumber energi alternatif yang digunakan dalam kehidupan sehari-hari ditunjukkan oleh nomor ....
""", R.mipmap.soal_pas_kelas6_ipa_25),
            Pair("""26. Karena curah hujan yang sangat tinggi saat ini, gelombang air laut bertambah besar. Akibatnya dibeberapa daerah pantai terjadi abrasi. Upaya yang dapat dilakukan untuk mencegah terjadinya abrasi di daerah pantai antara lain dengan cara ....""", 0),
            Pair("""27. Gelembung-gelembung balon air mainan jika terkena sinar matahari akan terlihat berwarna-warni. Peristiwa tersebut menunjukkan salah satu sifat cahaya yaitu dapat ….
""", 0)),

        listOf(Pair("""28. Bunyi yang frekwensinya kurang dari 20 Hz disebut bunyi ....""", 0),
            Pair("""29. Pohon damar merupakan salah satu tumbuhan langka di Indonesia. Pohon damar banyak dimanfaatkan oleh manusia sebagai bahan campuran minyak wangi, bahan lem, atau bahan bangunan. Jika hal tersebut dibiarkan maka yang terjadi adalah .....""", 0),
            Pair("""30. Karena minimnya pengetahuan para petani tentang pengelolaan lahan pertanian, maka akhir-akhir ini lahan pertanian tingkat kesuburannya semakin berkurang. Untuk mengembalikan kondisi lahan pertanian agar kembali subur maka sebaiknya dilakukan upaya-upaya antara lain ….
""", 0)),

        listOf(Pair("""31. Jenis penyakit yang disebabkan karena adanya gangguan pada tulang belakang yang terlalu  membengkok ke belakang adalah ….
""", 0),
            Pair("""32. Perhatikan daftar 
1) nikel
2) biosolar
3) gas alam
4) angin
5) bioetanol
kelompok sumber daya alam yang dapat diperbarui ditunjukkan oleh nomor ….
""", 0),
            Pair("""33. Perhatikan gambar gerhana di bawah ini  
bila bulan berada dalam bayangan umbra 
seperti pada gambar, maka yang terjadi adalah … 
""", R.mipmap.soal_pas_kelas6_ipa_33)),

        listOf(Pair("""34. Perhatikan pernyataan  
1) Pergantian siang dan malam 
2) Gerak semu tahunan matahari 
3) Perbedaan waktu di berbagai tempat di dunia 
4) Pergantian musim 
yang menujukkan akibat rotasi bumi ditunjukkan oleh pernyataan nomor … 
""", 0),
            Pair("""35. Saat musim hujan tiba, beberapa daerah di Puncak Bogor sering dilanda bencana tanah longsor. Hal ini disebabkan masih banyaknya lahan miring yang curam dan terjal. Salah satu upaya yang dapat dilakukan untuk mencegah terjadinya bencana tersebut antara lain ....""", 0),
            Pair("""36. Sinar matahari sampai ke bumi merupakan perpindahan panas secara?""", 0)),

        listOf(
            Pair("""37. Baterai adalah sumber listrik yang praktis. Hal itu disebabkan karena baterai?""", 0),
            Pair("""38. Bola yang di tendang ke permukaan tanah, maka suatu saat bola akan berhenti. Hal itu disebabkan oleh?""", 0),
            Pair("""39. Perpindahan panas yang diikuti dengan aliran zatnya dinamakan?""", 0)),

        listOf(Pair("""40. Karet dimanfaatkan dalam pembuatan ketapel, karena karet bersifat?""", 0),
            Pair("""41. Berikut ini ialah contoh-contoh perpindahan panas secara radiasi, kecuali?""", 0),
            Pair("""42. Kayu, kertas dan kain ialah contoh dari benda-benda?""", 0)),

        listOf(Pair("""43. Cangkir yang diisi dengan air panas maka gagangnya ikut terasa panas juga. Hal ini menujukkan bahwa adanya perpindahan panas secara?""", 0),
            Pair("""44. Taman Nasional yang memiliki keindahan pemandangan bawah lautnya ialah?""", 0),
            Pair("""45. Egi dan teman-teman bermain permainan bola kasti. disaat itu Egi siap untuk memukul bola. 
Bola yang segera datang ke arahnya tepat dipukul kembali sehingga bola itu memantul kembali. Gaya yang dilakukan dari egi akan menyebabkan bola?
""", 0)),

        listOf(Pair("""46. Singkong pada umumnya dikembangbiakkan dengan cara?""", 0),
            Pair("""47. Bagian bunga apa yang berfungsi sebagai alat perkembangbiakan jantan ialah?""", 0),
            Pair("""48. Perubahan terhadap fisik di dalam tubuh anak cowok dan cewek pada masa-masa pubertas sangat berguna untuk?""", 0)),

        listOf(Pair("""49. Kaktus memiliki batang yang tebal bertujuan untuk?""", 0),
            Pair("""50. Tumbuhan yang memakan serangga untuk memenuhi zat nitrogen ialah?""", 0),
            Pair("""51. Hewan nokturnal ialah hewan yang tidur disiang hari dan aktif di malam hari. Di bawah ini yang termasuk hewan nokturnal ialah?""", 0)),

        listOf(Pair("""52. Tumbuhan yang berkembangbiak dengan menggunakan tunas adventif ialah?""", 0),
            Pair("""53. Untuk menangkap serangga tumbuhan venus memiliki?""", 0),
            Pair("""54. Berikut ini adalah tumbuhan yang memiliki batang berongga ialah?""", 0)),

        listOf(Pair("""55. Gelombang bunyi yang berfrekuensi tinggi dimana hal itu dipancarkan kelelawar dari mulutnya ialah?""", 0),
            Pair("""56. Untuk mengelabuhi musuhnya, cicak memutuskan ekornya secara tiba-tiba. Kemampuan yang dimiliki hewan cicak ini disebut?""", 0),
            Pair("""57. Hewan berikut yang berkembang biak secara ovovivipar ialah?""", 0)),

        listOf(Pair("""58. Tumbuhan berikut yang berkembangbiak dengan tunas ialah?""", 0),
            Pair("""59. Hewan yang perkembangbiakannya dengan cara membelah diri ialah?""", 0),
            Pair("""60. Pemakaian suatu bahan peledak pada saat menangkap ikan akan mengakibatkan?""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. konsumen III, konsumen IV        ","b. produsen, konsumen I","c. konsumen II, konsumen III","d. konsumen II, pengurai"),
            listOf("a. Beberapa pasang kaki yang kuat","b. Memiliki mulut yang kecil dan panjang","c. Sayap yang tebal dan kuat","d. Tubuh yang besar dan ringan"),
            listOf("a. membiarkan tumbuh dengan sendirinya","b. Memperjual belikan secara bebas","c. mengoleksi dengan jenis yang beragam","d. melakukan penangkaran ")
        ),
        listOf(
            listOf("a. bronkus ","b. bronkiolus","c. alveolus","d. trakea"),
            listOf("a. mekanik","b. kimiawi ","c. mekanik dan kimiawi","d. mekanik dan biologis"),
            listOf("a. unsur hara dalam air sungai berkurang sehingga gulma, eceng gondok dan makhluk hidup lain di dasar sungai pertumbuhannya terganggu  ","b. gulma dan eceng gondok tumbuh subur menutupi permukaan sungai sehingga makhluk hidup dalam sungai tidak mendapat sinar matahari","c. unsur hara dalam air sungai bertambah sehingga gulma, eceng gondok dan makhluk hidup lain di dasar sungai pertumbuhannya terganggu","d. gulma dan eceng gondok banyak yang mati dan menutupi permukaan sungai sehingga makhluk hidup dalam sungai tidak mendapat sinar matahari")
        ),
        listOf(
            listOf("a. Parasitisme dan komensalisme","b. Komensalisme dan parasitisme","c. Mutualisme dan komensalisme","d. Komensalisme dan mutualisme"),
            listOf("a. menanam bibit padi yang tahan terhadap hama","b. tidak menanam padi dalam waktu lama","c. menyemprot sesering mungkin tanaman dengan zat kimia","d. melepaskan predator di area persawahan "),
            listOf("a. (1 - c) dan (2 - b)","b. (2 - d) dan (3 - c)","c. (3 - b) dan (4 - a)","d. (4 - b) dan (1 - c)")
        ),
        listOf(
            listOf("a. Sendi putar","b. Sendi engsel ","c. Sendi peluru","d. Sendi pelana"),
            listOf("a. 1, 2 dan 4","b. 1, 2 dan 5","c. 2, 3 dan 4","d. 2, 4 dan 5"),
            listOf("a. 1 dan 2","b. 1 dan 3","c. 2 dan 3","d. 3 dan 4")
        ),
        listOf(
            listOf("a. telur → pupa → imago","b. telur → larva → imago","c. telur → pupa → larva → imago","d. telur → larva→ pupa → imago"),
            listOf("a. (1) dan (2)","b. (1) dan (3)","c. (2) dan (3)","d. (3) dan (4)"),
            listOf("a. 5-10-1-2-7","b. 4-9-5-10-1","c. 6-8-3-4-9","d. 2-7-6-8-3")
        ),
        listOf(
            listOf("a. besi, perunggu, tembaga","b. kain, aluminium, busa","c. plastik, emas, logam","d. besi, kayu, busa"),
            listOf("a. rutin menggosok gigi sebelum makan","b. mengurangi makanan dan minuman yang terlalu manis","c. mengurangi mengkonsumsi makanan yang terlalu keras","d. mengkonsumsi makanan yang halus sehingga meringankan gigi"),
            listOf("a. pemompa darah","b. peredaran darah","c. pencernaan","d. pernapasan")
        ),
        listOf(
            listOf("a. tahan gores dan kedap air","b. elastis  dan anti karat","c. mudah pecah dan tahan api","d. elastis dan tahan air"),
            listOf("a. 3 dan 5","b. 2 dan 5 ","c. 2 dan 4","d. 1 dan 3"),
            listOf("a. menguap, membeku, meleleh","b. mencair,  membeku, menguap","c. menguap, mencair, menyublim","d. menyublim, menguap ,mencair")
        ),
        listOf(
            listOf("a. 1 dan 4","b. 1 dan 5","c. 3 dan 4","d. 2 dan 5"),
            listOf("a. keras, kuat, tahan panas","b. lentur, kuat, tahan panas","c. elastis, kuat, tidak tahan panas ","d. keras, kuat, tidak tahan panas"),
            listOf("a. gaya otot dan gaya magnet","b. gaya gesek dan gaya pegas ","c. gaya otot dan gaya gravitasi","d. gaya gravitasi dan gaya potensial")
        ),
        listOf(
            listOf("a. (4), (5) dan (6)","b. (3), (4) dan (6)","c. (2), (3) dan (5)","d. (1), (4) dan (6)"),
            listOf("a. menanam pohon bakau disekitar pantai","b. membuat sengkedan dan reboisasi","c. membuat bendungan diarea pantai","d. menanam berbagai tanaman hias di pantai"),
            listOf("a. dipantulkan","b. dibiaskan","c. diuraikan","d. merambat lurus")
        ),
        listOf(
            listOf("a. Inftasonik","b. Ultrasonik","c. Audiosonik","d. gaung"),
            listOf("a. hutan tetap dapat mencegah terjadinya erosi ","b. hutan indonesia menjadi gundul","c. pohon damar diekspor untuk menambah pendapatan","d. pohon damar akan mengalami kepunahan"),
            listOf("a. pencangkulan, jenis tanaman selalu sama, intensifikasi dan ekstensifikasi","b. pembuatan sengkedan, sistem tanaman tumpang sari, pemupukan dan pengairan","c. pengolahan, pemupukan, pengairan dan sistem rotasi tanaman secara baik ","d. pembajakan, pengairan, penanaman tanpa berganti dan pemupukan")
        ),
        listOf(
            listOf("a. skoliosis","b. kifosis","c. lordosis","d. rakhitis"),
            listOf("a. (1), (2) dan (3)","b. (2), (3) dan (4)","c. (2), (4) dan (5)","d. (3), (4) dan (5)"),
            listOf("a. gerhana matahari total","b. gerhana bulan sebagian","c. gerhana matahari sebagian","d. gerhana bulan total ")
        ),
        listOf(
            listOf("a. (1) dan (2)","b. (1) dan (3)","c. (2) dan (3)","d. (2) dan (4)  "),
            listOf("a. Membuka lahan miring untuk lahan pertanian","b. Dibangun gedung-gedung yang kokoh di lahan tersebut","c. Menanami lahan miring dengan berbagai macam sayuran ","d. Melakukan reboisasi dan pembuatan sengkedan"),
            listOf("a. Evaporasi","b. Konveksi","c. Radiasi","d. Konduksi")
        ),
        listOf(
            listOf("a. Harganya mahal","b. Mudah dibawa kemana-mana","c. Susah dibawa kemana-mana","d. Terlalu besar"),
            listOf("a. Ringan","b. Keras","c. Kuat","d. Alastis"),
            listOf("a. Respirasi","b. Radiasi","c. Konduksi","d. konveksi")
        ),
        listOf(
            listOf("a. Ringan","b. Keras","c. Kuat","d. Elastis"),
            listOf("a. Orang-orang yang merasakan kehangatan di sekitar api unggun","b. Panasnya api lilin yang terasa di dekatnya","c. Air panas yang mendidih","d. Cahaya matahari sampai ke bumi"),
            listOf("a. Mudah memuai","b. Isolator panas","c. Konduktor panas","d. Mudah panas")
        ),
        listOf(
            listOf("a. Radiasi","b. Konveksi","c. Kondensasi","d. Konduksi"),
            listOf("a. Ujung kulon","b. Alas purwo","c. Gunung Merapi","d. Bunaken"),
            listOf("a. Bergerak menjadi diam","b. Berubah bentuk","c. Berubah arah","d. Bergerak")
        ),
        listOf(
            listOf("a. Setek","b. Umbi","c. Biji","d. Tunas"),
            listOf("a. Benang sari","b. Kelopak","c. Mahkota","d. Putik"),
            listOf("a. Persiapan menuju proses perkembangbiakan","b. Mengubah tinggi dan berat","c. Persiapan hidup mandiri","d. Menjaga kesehatan tubuh")
        ),
        listOf(
            listOf("a. Menguatkan apabila diterpa angin","b. Mencegah untuk bertahan hidup","c. Berfotosintesis","d. Menyimpan makanan"),
            listOf("a. Teratai","b. Venus flytrap","c. Kantung semar","d. Kaktus"),
            listOf("a. Kelelawar","b. Nyamuk","c. Anjing","d. Kucing")
        ),
        listOf(
            listOf("a. Cocor bebek","b. Singkong","c. Pisang","d. Strawberi"),
            listOf("a. Getah yang lengket","b. Kulit kasar","c. Bulu halus","d. Duri runcing"),
            listOf("a. Anggrek","b. Singkong","c. Alamanda","d. Teratai")
        ),
        listOf(
            listOf("a. Longitudinal","b. Ultrasonik","c. Infrasonik","d. Audiosonik"),
            listOf("a. Ekolokasi","b. Autotomi","c. Anatomi","d. Mimikri"),
            listOf("a. Katak dan ikan","b. Kadal dan hiu","c. Paus dan arwana","d. Ayam dan lele")
        ),
        listOf(
            listOf("a. Mangga dan pepaya","b. Bambu dan pisang","c. Ayam dan sapi","d. Padi dan jagung"),
            listOf("a. Hydra","b. Protozoa","c. Planaria","d. Cacing"),
            listOf("a. Banyak sekali tangkapan lain yang di dapat","b. Banyak ikan yang tertangkap","c. Ikan mudah berkembangbiak","d. Habitat ikan menjadi rusak")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,1,3),
        listOf(0,2,1),
        listOf(2,3,1),
        listOf(2,1,0),
        listOf(3,2,1),
        listOf(0,1,3),
        listOf(1,0,0),
        listOf(1,0,2),
        listOf(3,0,2),
        listOf(0,3,2),
        listOf(1,2,3),
        listOf(1,3,2),
        listOf(1,3,3),
        listOf(3,2,1),
        listOf(3,3,1),
        listOf(0,0,0),
        listOf(2,2,0),
        listOf(0,2,3),
        listOf(1,1,1),
        listOf(1,1,3)



    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas6, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIpa.scoreIpaKelas6 < 1) 0 else scoreManagerIpa.scoreIpaKelas6 / 5
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
            val getData = soalIpasd6[jawabanBenar6][i]
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

                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas6
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpasd6.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas6 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas6 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd6[jawabanBenar6][i]
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