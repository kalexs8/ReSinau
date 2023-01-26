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


class SoalIpaKelas8 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd8: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Urutan perkembangan hewan pada masa embrionik adalah....""", 0),
            Pair("""2. Sklereid berasal dari jaringan....""", 0),
            Pair("""3. Katak mengalami peristiwa perkembangan yang disebut....""", 0)),

        listOf(Pair("""4. Jaringan spons pada daun mempunyai fungsi....""", 0),
            Pair("""5. Berikut ini organisme yang mengalami metagenesis,kecuali....""", 0),
            Pair("""6. Berikut ini yang tidak termasuk jaringan dewasa adalah....""", 0)),

        listOf(Pair("""7. Salah satu ciri masa pubertas adalah....""", 0),
            Pair("""8. Kloropas berfungsi untuk....""", 0),
            Pair("""9. Siklus menstruasi pertama normal pada wanita dialami pada usia....""", 0)),

        listOf(Pair("""10. Menutupnya daun putri malu akibat sentuhan disebut gerak....""", 0),
            Pair("""11. Ciri-ciri perkembangan pada remaja laki-laki antara-lain....""", 0),
            Pair("""12. Gelombang cahaya tampak yang paling optimal untuk prosesfotosintesis adalah dalam kisaran....""", 0)),

        listOf(Pair("""13. Dibawah ini yang tidak termasuk kelompok tulang pada tungkai adalah....""", 0),
            Pair("""14. Enzim yang mengubah lemak menjadi gliserol adalah....""", 0),
            Pair("""15. Jaringan yang berfungsi sebagai penyokong atau penguat pada organ tubuh tumbuhan muda adalah....""", 0)),

        listOf(Pair("""16. Yang terjadi apabila tumbuhan diletakkan ditempat yang sama sekali tidak pernah terkena cahaya adalah....""", 0),
            Pair("""17. Urutan saluran pencernaan manusia yang benar adalah....""", 0),
            Pair("""18. Pernyataan-pernyataan dibawah ini yang tidak benar adalah....""", 0)),

        listOf(Pair("""19. O2 diangkut keseluruh sel tubuh untuk proses oksidasi oleh....""", 0),
            Pair("""20. Saat paling baik untuk melakukan olah napas dibawah pohon adalah....""", 0),
            Pair("""21. Golongan darah AB pada proses transfusi darah dapat....""", 0)),

        listOf(Pair("""22. Gerak higrokopis dapat dipengaruhi oleh rangsang berupa....""", 0),
            Pair("""23. Bagian otot jantung yang paling tebal adalah....""", 0),
            Pair("""24. Gerak taksis berbeda dengan gerak lainnya....""", 0)),

        listOf(Pair("""25. Penyakit karena darah sukar membeku adalah....""", 0),
            Pair("""26. Pada peradang usus buntu,operasi yang dilakukan adalah memotong....""", 0),
            Pair("""27. Pernafasan diafragma terjadi saat....""", 0)),

        listOf(Pair("""28. Tumbuhan yang diletakkan didalam rumah batangnya membengkok kearah datangnya sinar matahari disebut....""", 0),
            Pair("""29. Enzimtrombokinase dihasilkan oleh....""", 0),
            Pair("""30. Sulur pada tanaman semangka dapat membelit.Gerak yang terjadi termasuk gerak....""", 0)),

        listOf(Pair("""31. Keadaan dimana sel darah putih jumlahnya kurang dari normal disebut....""", 0),
            Pair("""32. Wereng merupakan salah satu jenis....""", 0),
            Pair("""33. Tempat melekatnya serbuksari saat penyerbukan adalah....""", 0)),

        listOf(Pair("""34. Berikut ini yang tidak termasuk kelompok hama adalah....""", 0),
            Pair("""35. Lembaran penyusun putik disebut....""", 0),
            Pair("""36. Fungsi tulang yang menyusun rangka tubuh kita antara lain ....""", 0)),

        listOf(Pair("""37. Perhatikan pernyataan berikut
1) Bersifat lentur
2) Bersifat keras
3) Banyak mengandung zat kapur
4) Banyak mengandung zat perekat
Ciri-ciri tulang keras ditunjukkan oleh nomor .... 
""", 0),
            Pair("""38. Tulang yang memiliki zat perekat lebih banyak dari pada zat kapur terdapat pada ....""", 0),
            Pair("""39. Perhatikan ciri-ciri otot di bawah ini
1) Sel-sel berbentuk silinder bercabang dan panjang
2) Memiliki banyak inti dalam satu sel
3) Memiliki bagian gelap dan terang
Otot yang memiliki ciri-ciri dibawah terdapat pada....
""", 0)),

        listOf(Pair("""40. Gerak yang melibatkan otot yang bekerja di luar kesadaran adalah ....""", 0),
            Pair("""41. Orang yang terserang penyakit polio dapat mengalami kelumpuhan. Penyebab penyakit polio adalah ....""", 0),
            Pair("""42. Aktivitas manusia berinteraksi dengan manusia lain dapat memungkinkan terjadinya penyebaran Covid-19, terutama aktivitas yang melibatkan kerumunan banyak orang. Aktivitas gerak manusia termasuk ....""", 0)),

        listOf(Pair("""43. Setiap hari hewan melakukan gerakan misalnya ber j al an,  berl ari ,  t er bang,  ber enang  dan sebagainya. Hewan melakukan gerakan tersebut memiliki berbagai tujuan, antara lain untuk ....""", 0),
            Pair("""44. Burung dapat melayang di udara disebabkan oleh hal-hal berikut, kecuali ....""", 0),
            Pair("""45. Jika di dekat tanaman kacang panjang diletakkan kayu maka beberapa hari kemudian yang terjadi pada tanaman tersebut adalah sulur batang akan membelit pada kayu. Hal tersebut merupakan contoh gerak ....""", 0)),

        listOf(Pair("""46. Gerak higroskopis yang dipengaruhi  oleh perubahan kadar air dapat dijum pai pada peristiwa ....""", 0),
            Pair("""47. Cermati gerakan pada tumbuhan berikut
1) Gerak mengalirnya sitoplasma dalam sel
2) Gerak rotasi sitoplasma pada sel daun Hydrilla verticillata
3) Tumbuhan sirih membelit batang tanaman inang
4) Daun putri malu mengatup ketika disentuh
Yang merupakan contoh gerak endonom adalah....
""", 0),
            Pair("""48. Benda dikatakan bergerak apabila ....""", 0)),

        listOf(Pair("""49. Sebuah mobil ambulan yang membawa pasien terkonfirmasi COVID-19 menuju rumah sakit dengan kecepatan 72 km/jam. Kecepatan mobil ambulan tersebut jika dinyatakan dalam SI adalah....""", 0),
            Pair("""50. Grafik yang menunjukkan hubungan antara kecepatan terhadap waktu pada gerak lurus beraturan adalah ....""", R.mipmap.ipa_kelas8_soal50),
            Pair("""51. Jarak dari kota A ke kota B adalah 115 km. Pak Budi berangkat dari kota A pukul 09.00 menuju kota B m enggunakan kendaraan am bulan membawa pasien COVID-19 dengan kecepatan
50 km/jam. Pak Budi akan sampai ke kota B pada pukul .... 
""", 0)),

        listOf(Pair("""52. Perhatikan pola ticker timer pada gambar. Jenis gerak yang dialami benda adalah .... """, R.mipmap.ipa_kelas8_soal52),
            Pair("""53.  Anita sedang mengendarai mobil ambulan yang membawa pasien COVID-19 dengan kecepatan 30 m/s. Pada kecepatan ini, 
Anita menginjak rem hingga berhenti pada 5 sekon kemudian. Nilai perlambatan mobil adalah ....
""", 0),
            Pair("""54. Perhatikan gambar berikut
Simpulan yang tepat berdasarkan gambar dibawah adalah ....
""", R.mipmap.ipa_kelas8_soal54)),

        listOf(Pair("""55. Perhatikan gambar di bawah ini
Pada saat terbang di udara, gerakan burung dapat dijelaskan dengan hukum ketiga Newton, yaitu dengan cara memanfaatkan sifat aliran udara. Perbandingan besarnya gaya aksi dan reaksi antara burung dengan udara yang benar adalah....
""", R.mipmap.ipa_kelas8_soal55),
            Pair("""56. Peristiwa yang berhubungan dengan Hukum I Newton berikut adalah ....""", 0),
            Pair("""57. Ketika sebuah benda diberi gaya, maka benda tersebut akan mengalami hal berikut ini
1) massa benda berubah
2) bentuk dan ukuran benda berubah
3) berat benda berubah
4) arah gerak benda berubah
5) benda yang awalnya diam menjadi bergerak
Pernyataan yang benar sesuai dengan nomor .... 
""", 0)),

        listOf(Pair("""58.  Empat buah benda yang bermassa dan berbahan dasar yang sama, terletak pada garis lintang, seperti pada gambar berikut
Benda manakah yang paling berat? 
""", R.mipmap.ipa_kelas8_soal58),
            Pair("""59. Pada saat menendang tembok dengan sepatu, maka kaki kita terasa sakit. Hal ini menunjukkan bahwa ....""", 0),
            Pair("""60. Gaya sebesar 5 N bekerja pada benda bermassa 2  kg.Benda tersebut akan memperoleh percepatan sebesar ....""", 0)),

        listOf(Pair("""61. Sebuah drum besi dapat mengapung di dalam air disebabkan oleh ….
""", 0),
            Pair("""62. Empat ekor ikan berada di dalam kolam air seperti gambar berikut 
Urutan besar tekanan yang dialami keempat ikan dari tekanan besar ke tekanan kecil adalah ….
""", R.mipmap.ipa_kelas8_soal62),
            Pair("""63. Perhatikan gambar berikut.
Gaya apung yang di alami benda sebesar ….  
""", R.mipmap.ipa_kelas8_soal63)),

        listOf(Pair("""64. Pasangan alat dan prinsip kerjanya yang sesuai adalah ….
""", R.mipmap.ipa_kelas8_soal64),
            Pair("""65. Berapakah tekanan hidrostatis yang diterima benda yang berada di dalam air sedalam 350 cm jika  massa jenis air 1 kg/m3 dan besar gravitasi 10 N/kg?""", 0),
            Pair("""66. Perhatikan gambar percobaan berikut ini . 
Pernyataan yang  sesuai dengan gambar tersebut adalah ….
""", R.mipmap.ipa_kelas8_soal66)),

        listOf(Pair("""67. Pada tumbuhan, air dari akar dapat naik sampai ke daun disebabkan oleh daya kapilaritas batang. Pernyataan yang benar terkait peristiwa tersebut adalah ….
""", 0),
            Pair("""68. Perhatikan gambar organ-organ pernapasan berikut ini.
Organ-organ pernapasan yang ditunjuk  pada gambar dibawah adalah….
""", R.mipmap.ipa_kelas8_soal68),
            Pair("""69. Perhatikan pernyataan-pernyataan berikut.
1) Mengatur suhu udara yang masuk ke dalam paru-paru
2) Sebagai tempat pertukaran gas oksigen dan gas karbondioksida
3) Mengatur kelembaban udara yang masuk ke dalam paru-paru
4) Menyaring partikel debu atau kotoran yang masuk bersama udara
Fungsi hidung dalam proses pernapasan terdapat pada pernyataan nomor ….
""", 0)),

        listOf(Pair("""70. Berikut ini merupakan aktivitas yang menyebabkan terjadinya inspirasi adalah ….
""", 0),
            Pair("""71. Berikut ini faktor-faktor yang mempengaruhi frekuensi pernapasan adalah ….
""", 0),
            Pair("""72. Oksigen yang dihisap pada saat bernapas dan masuk ke dalam tubuh akan digunakan untuk proses ….
1. Difusi                        
""", 0)),

        listOf(Pair("""73. Organ pernapasan yang strukturnya tersusun dari cincin-cincin tulang rawan dan selaput lendir yang terdiri atas jaringan epithelium bersilia adalah ….
""", 0),
            Pair("""74. Paru-paru seorang pasien setelah dianalisis ternyata ditemukan bakteri Mycobacterium tuberculosis. Pasien tersebut terserang penyakit….
""", 0),
            Pair("""75. Cairan empedu yang dibuat di hati merupakan …
""", 0)),

        listOf(Pair("""76. Perhatikan gambar di bawah ini
Tempat untuk menampung urine sebelum dikeluarkan dari tubuh ditunjukkan oleh nomor …. Hasil gambar untuk sistem ekskresi 
""", R.mipmap.ipa_kelas8_soal76),
            Pair("""77.  Zat sisa  metabolisme yang dikeluarkan melalui paru-paru adalah….
""", 0),
            Pair("""78. Perhatikan gambar struktur kulit berikut  
Bagian yang berfungsi membuat dan mengeluarkan keringat ditunjukan oleh nomor….
""", 0)),

        listOf(Pair("""79. Perhatikan gambar struktur ginjal berikut ini
Bagian yang ditunjuk oleh nomor  5 adalah…
""", R.mipmap.ipa_kelas8_soal79),
            Pair("""80. Perhatikan gambar nefron berikut ini.  
""", R.mipmap.ipa_kelas8_soal80),
            Pair("""81. Salah satu tanda bahwa seseorang menderita diabetes mellitus adalah bila didalam urinnya mengandung...""", 0)),

        listOf(Pair("""82. Perhatikan gambar berikut  
Bagian telinga yang berfungsi untuk menangkap gelombang suara dan mengubahnya menjadi getaran ditunjukkan oleh nomor...
""", R.mipmap.ipa_kelas8_soal82),
            Pair("""83. Perbedaan yang mendasar antara gelombang transversal dan gelombang longitudinal adalah ....""", 0),
            Pair("""84. Sebuah penggaris plastik digetarkan dibawah sebuah meja seperti gambar berikut
Jumlah getaran yang terjadi selama penggaris plastik bergerak dari C→B→A→B→C→B  adalah.... Hasil gambar untuk getaran pada penggaris 
""", R.mipmap.ipa_kelas8_soal84)),

        listOf(Pair("""85. Sebuah gelombang merambat dengan kecepatan 340 m/s. Jika frekuensi gelombang adalah 40 Hz, panjang gelombang dari gelombang tersebut adalah ....""", 0),
            Pair("""86. Perhatikan gambar  
Dua bandul yang dapat mengalami resonansi adalah .... 
""", R.mipmap.ipa_kelas8_soal86),
            Pair("""87. Efek pantulan bunyi yang dapat menyebabkan bunyi asli terganggu disebut ….
""", 0)),

        listOf(Pair("""88. Sebuah kapal sedang mengukur kedalaman laut dengan menggunakan oscillator. Sebuah bunyi  dengan frekuensi tertentu dipancarkan melalui air laut dan pantulannya diterima kapal setelah 3 detik, jika cepat rambat bunyi di air laut 1750 m/s,maka dalamnya laut adalah…
""", 0),
            Pair("""89. Bagian mata yang mengatur jumlah cahaya yang masuk ke dalam mata adalah ....""", 0),
            Pair("""90. Perhatikan gambar berikut ini.
Kelainan yang diderita oleh mata pada gambar dibawah adalah …. Gambar terkait 
""", R.mipmap.ipa_kelas8_soal90)),

        listOf(Pair("""91. Perhatikan gambar berikut ini.
Fenomena pada gambar dibawah terjadi karena …. Gambar terkait 
""", R.mipmap.ipa_kelas8_soal91),
            Pair("""92. Berikut ini yang bukan sinar-sinar istimewa pada cermin cekung adalah ....  """, R.mipmap.ipa_kelas8_soal92),
            Pair("""93. Sebuah benda yang tingginya 12 cm diletakkan 10 cm di depan cermin cembung yang jari-jari kelengkungannya 30 cm. Sifat-sifat bayangan yang dibentuk oleh cermin tersebut adalah ….
""", 0)),

        listOf(Pair("""94. Sebuah mikroskop sedang digunakan oleh siswa, jika siswa tersebut mengamati objek dengan lensa obyektif yang pembesarannya 40 x sedangkan pembesaran lensa okulernya 10 x, maka pembesaran bayangan obyek yang dilihat adalah…
""", 0),
            Pair("""95. Berikut ini proses perjalanan cahaya pada mata hingga terbentuk bayangan benda adalah ….
""", 0),
            Pair("""96 . Berikut ini merupakan fungsi dari sistem rangka, kecuali ....
""", 0)),

        listOf(Pair("""97 . Manakah diantara kelompok tulang di bawah ini yang kesemuanya tergolong tulang pipa?
""", 0),
            Pair("""98 . Persendian yang terjadi antara tulang lengan atas dan bahu disebut sendi .....
""", 0),
            Pair("""99 . Berikut ini merupakan contoh otot yang bekerja secara sadar dan tidak sadar yang disebutkan secara berturut-turut adalah ......
""", 0)),

        listOf(Pair("""100. Kelainan tulang belakang yang membengkok ke kanan atau kekiri disebut ....""", 0),
            Pair("""101. Zat yang terkandung dalam matriks sehingga tulang menjadi keras adalah ...""", 0),
            Pair("""102. Gerak suatu benda selalu bersifat relatif. Hal ini berarti bahwa bergerak atau tidaknya suatu benda ditentukan oleh.....""", 0)),

        listOf(Pair("""103. Gerak batu yang dilemparkan vertikal ke atas dan akhirnya jatuh ke tanah kembali adalah ...""", 0),
            Pair("""104. Sebuah mobil bergerak dengan kelajuan 36 km/jam. Kelajauan mobil tersebut dalam SI sama dengan......""", 0),
            Pair("""105. Kecepatan sebuah mobil berubah dari 10 m/s menjadi 30 m/s dalam selang waktu 20 sekon. Percepatan mobil tesebut adalah ...............""", 0)),

        listOf(Pair("""106. Gaya sebesar 150 N mampu membuat sebuah benda yang tadinya diam bergerak dengan percepatan 10 m/s. Berapakah massa benda itu ....""", 0),
            Pair("""107. Jika sebuah bus direm secara mendadak, penumpang yang duduk di dalamnya akan terhempas ke depan. Peristiwa ini adalah contoh .....""", 0),
            Pair("""108. Perhatikan pernyataan berikut ini 
a) Eko mendorong meja dengan gaya sebesar 30 N sehingga meja berpindah sejauh 3 meter.
b) Seekor kuda menarik delman dengan gaya sebesar 4.000 N sehingga delman berpindah sejauh 20 meter.
c) Sebuah mobil menghantam sebuah pohon dengan gaya 2.000 N sehingga pohon tumbang ditempat.
Pernyataan dibawah yangmerupakan contoh suatu usaha adalah .....
""", 0)),

        listOf(Pair("""109. Jika suatu gaya 50 N bekerja pada sebuah benda, sehingga benda berpindah 5 meter. Berapakah usaha yang dilakukan pada benda tersebut .....""", 0),
            Pair("""110. Perhatikan gambar
Dari keempat pesawat sederhana dibawah yang menggunakan prinsip bidang miring adalah ...
""", R.mipmap.ipa_kelas8_soal110),
            Pair("""111. Perhatikan gambar di bawah ini
Prinsip kerja tangan anak pada gambar koper tersebut sama dengan prinsip kerja pengungkit jenis ....
""", R.mipmap.ipa_kelas8_soal111)),

        listOf(Pair("""112. Perhatikan gambar berikut ini
Keuntungan mekanik yang diperoleh dari katrol di bawah ini adalah .....
""", R.mipmap.ipa_kelas8_soal112),
            Pair("""113. Prinsip kerja pesawat sederhana pada saat otot betis pemain bulu tangkis mengangkat beban tubuhnya dengan bertumpu pada jari kakinya adalah .....""", 0),
            Pair("""114. Selain sebagai tempat fotosintesis, daun juga berfungsi sebagai alat pernafasan karena pada daun terdapat .....""", 0)),

        listOf(Pair("""115. Bagian bunga yang berfungsi sebagai alat kelamin jantan adalah .....""", 0),
            Pair("""116. Perhatikan gambar penampang melintang batang dikotil berikut 
Jaringan yang berfungsi sebagai pengangkut hasil fotosintesis dari daun ke seluruh bagian tubuh tumbuhan, ditunjukkan oleh nomor ....
""", R.mipmap.ipa_kelas8_soal116),
            Pair("""117. Perhatikan Gambar berikut.
Jaringan yang ditunjukkan oleh huruf X merupakan salah satu jaringan penyusun daun, jaringan X disebut Jaringan... dan berfungsi untuk....
""", R.mipmap.ipa_kelas8_soal117)),

        listOf(Pair("""118. Berikut ini merupakan teknologi yang terinspirasi dari proses fotosintesis yang terjadi dalam daun adalah ......""", 0),
            Pair("""119. Lapisan pelindung pada daun tumbuhan yang menginspirasi pembuatan lapisan pengilap cat mobil adalah .....""", 0),
            Pair("""120. Kelompok makanan berikut yang merupakan sumber karbohidrat, adalah....""", 0)),

        listOf(Pair("""121. Ketika Nani membeli makanan di warung, penjualnya membungkus dengan menggunakan kertas, ternyata pada kertas tampak noda yang membuat kertas jadi terlihat transparan. Hal ini terjadi karena .....""", 0),
            Pair("""122. Perhatikan gambar
Bagian dari sistem pencernaan yang ditunjuk oleh tanda panah adalah ....
""", R.mipmap.ipa_kelas8_soal122),
            Pair("""123. Berikut ini yang merupakan fungsi enzim tripsin adalah…
""", 0)),

        listOf(Pair("""124. Penyakit pada sistem pencernaan yang disebabkan oleh penyerapan air yang berlebihan oleh usus penyerapan (ileum) menyebabkan air pada usus besar sedikit sehingga susah buang air besar disebut....""", 0),
            Pair("""125. Berikut ini merupakan upaya untuk menjaga kesehatan sistem pencernaan, kecuali ....""", 0),
            Pair("""126. Bahan-bahan di bawah ini adalah bahan pemanis buatan/ kimia sintetik, kecuali....""", 0)),

        listOf(Pair("""127. Bahan pewarna yang disarankan untuk dipakai dalam produk makanan dan minuman adalah ....""", 0),
            Pair("""128. Zat psiko-aktif yang secara alamiterdapat dalam kopi adalah ......""", 0),
            Pair("""129. Diantara zat nikotin, alkohol, barbiturat, amfetamin, kokain, dan kafein yang tergolong depresan susunan saraf pusat adalah ...""", 0)),

        listOf(Pair("""130. Berikut beberapa akibat dari penggunaan psikotropika
1) Kenaikan atau penurunan tekanan darah
2) Penurunan berat badan
3) Halusinasi
4) Kecemasan
5) Berkeringat atau menggigil
Yang termasuk akibat penggunaan amfetamin adalah nomor ...
""", 0),
            Pair("""131. Seorang anak sedang mengungkit sebuah batu.  Besar gaya yang diperlukan anak adalah.... """, R.mipmap.ipa_kelas8_soal131),
            Pair("""132. Seorang pegawai ingin memindahkan kotak yang beratnya 500 N ke atas truk dengan menggunakan bidang miring seperti gambar di bawah.
Bila tinggi truk 1,5 m, maka besar gaya yang diperlukan untuk memindahkan kotak adalah....
""", R.mipmap.ipa_kelas8_soal132)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Zigot– morula–gastrula– blastula ","b. Zigot– blastula–morula–gastrula ","c. Zigot– morula– blastula–gastrula ","d. Zigot–blastula–gastrula–morula"),
            listOf("a. Epidermis ","b. Parenkim ","c. Kolenkim","d. Endodermis"),
            listOf("a. Metamorfosis ","b. Metagenesis ","c. Morfologi","d. Metafora")
        ),
        listOf(
            listOf("a. Menyerap cahaya matahari untuk fotosintesis","b. Menampung O2 untuk fotosintesis","c. Proses fotosintesis","d. Menampung CO2 untuk fotosintesis"),
            listOf("a. Lumut","b. Ubur-ubur","c. Paku","d. Serangga"),
            listOf("a. Parenkim ","b. Epidermis ","c. Meristem ","d. Kolenkim")
        ),
        listOf(
            listOf("a. Pertumbuhan sel otak","b. Penuaan","c. Menoposuse","d. Menstruasi"),
            listOf("a. Menyerap O2","b. Menyerap CO2","c. Menyerap cahaya matahari","d. Menyerap air"),
            listOf("a. 8 – 10 tahun ","b. 9 – 12 tahun ","c. 9 – 16 tahun ","d. 10–15 tahun")
        ),
        listOf(
            listOf("a. Tirgmotropisme","b. Termonasti ","c. Seismonasti ","d. fotonasti"),
            listOf("a. Perkembangan oragan tubuh mencapai puncaknya","b. Mulai dapat melihat mendengar dan merasa","c. Jakun mulai tampak","d. Reaksi tubuh lambat dan cepat letih"),
            listOf("a. 380–700nm","b. <100nm ","c. >800nm ","d. 0–200nm")
        ),
        listOf(
            listOf("a. Tempurung lutut","b. Tulang tapak kaki","c. Tulang rusuk","d. Tulang kering"),
            listOf("a. Pepsin","b. Renin","c. Amilasi","d. Lipase"),
            listOf("a. Meristem ","b. Parenkim ","c. Kolenkim","d. Sklerenkim")
        ),
        listOf(
            listOf("a. Tetap melakukan fotosintesis","b. Daun yang tumbuh lebat","c. Tidak menghasilkan makanan dengan baik","d. B dan c benar"),
            listOf("a. Mulut–kerongkongan–lambung– usushalus– ususbesar ","b. Mulut–kerongkongan–lambung– ususbesar– usushalus ","c. Mulut–kerongkongan–ususbesar– ususkecil–lambung ","d. Mulut–lambung–kerongkongan–usushalus–ususbesar"),
            listOf("a. Apabila kadar fotosintesis seperti kadar karbohidrat berkurang,maka laju fotosintesis akan meningkat","b. Apabila kadar fotosintat bertambah atau bahkan sampai jenuh maka laju fotosintesis akan berkurang","c. Laju fotosintesis akan jauh lebih tinggi pada tumbuhan yang sedang tumbuh atau berkecambah apabila dibandingkan dengan tumbuhan dewasa","d. Jika kadar air rendah maka fotosintesis akan optimal")
        ),
        listOf(
            listOf("a. Globulin(antibodi) ","b. Hemoglobin","c. Plasma darah","d. Fibrinogen"),
            listOf("a. Malam hari","b. Pagi menjelang siang","c. Saat matahari terbenam","d. Saat sebelum pagi matahari belum bersinar"),
            listOf("a. Mendonorkan darah kepada golongan darah A ","b. Mendonorkan darah kepada golongan darah B ","c. Mendonorkan darah kepada golongan darah AB ","d. Mendonorkan darah kepada golongan darah O")
        ),
        listOf(
            listOf("a. Besarnya tekanan udara","b. Perubahan kecepatan angin","c. Jumlah unsur hara tanah","d. Perubahan kadar air"),
            listOf("a. Otot serambi kanan","b. Bilik kanan","c. Otot serambi serambi kiri","d. Bilik kiri"),
            listOf("a. Arah geraknya tidak di pengaruhi rangsang","b. Pergerakan seluruh tubuh akibat adanya rangsangan","c. Arah gerakan menjauhi rangsang","d. Pergerakannya hanya bagian tubuh tertentu")
        ),
        listOf(
            listOf("a. Thalasemia","b. Varises","c. Anemia","d. Hemofilia"),
            listOf("a. Kolon","b. Rektum","c. Apendiks","d. Intestinum"),
            listOf("a. Rusuk bergerak keatas dan keluar diafragma bergerak keatas,rongga dada mengerut,udara masuk","b. Rusuk bergerak keatas dan keluar,diafragma bergerak kebawah,rongga mengerut, udara masuk","c. Rusuk bergerak kebawah dan keluar,diafragma bergerak keatas,rongga dada mengembang,udara masuk","d. Rusuk bergerak keatas dan keluar diafragma bergerak kebawah,rongga dada mengembang,udara masuk")
        ),
        listOf(
            listOf("a. Heliotropisme","b. Hidrotropisme ","c. Kemotropisme ","d. Geotropisme"),
            listOf("a. Keping darah ","b. Plasma darah ","c. Fibrinogen","d. Limfa"),
            listOf("a. Fototropisme","b. Nasti","c. Tigmotropisme","d. Taksis")
        ),
        listOf(
            listOf("a. Diaperdesis","b. Leukositas","c. Leukopenia","d. Fagositosis"),
            listOf("a. Hama","b. Gulma","c. Pestisida","d. Fungisida"),
            listOf("a. Calyx ","b. Sepal ","c. Stigma ","d. Karpel")
        ),
        listOf(
            listOf("a. Artona","b. Wereng","c. Kumbang","d. Encenggondok"),
            listOf("a. Calyx ","b. Sepal ","c. Stigma ","d. Karpel"),
            listOf("a. membentuk otot","b. tempat peredaran darah","c. tempat melekatnya otot","d. tempat melekatnya organ dalam")
        ),
        listOf(
            listOf("a. 1 dan 3","b. 2 dan 3","c. 1 dan 4","d. 2 dan 4"),
            listOf("a. tulang pengumpil","b. tulang tempurung lutut","c. daun telinga","d. mata kaki"),
            listOf("a. bisep","b. lambung","c. intestinum","d. jantung")
        ),
        listOf(
            listOf("a. mendaki gunung","b. mengayuh sepeda","c. berdetaknya jantung","d. mengangkat barbell"),
            listOf("a. virus corona","b. virus polio","c. bakteri polio","d. covid-19"),
            listOf("a. gerak bebas","b. gerak tidak bebas","c. gerak aktif","d. gerak pasif")
        ),
        listOf(
            listOf("a. melemaskan otot tubuhnya dan mencari makan","b. melemaskan otot tubuhnya dan melindungi diri","c. mempertahankan posisinya dan melindungi diri","d. melindungi diri dari predator dan mencari makan"),
            listOf("a. memiliki sayap yang pendek","b. memiliki sayap berbentuk airfoil","c. memiliki tubuh yang ringan dan kuat","d. adanya gaya dorong ke atas dan ke bawah yang membuatnya stabil di udara"),
            listOf("a. tigmonasti","b. tigmotropisme","c. tigmonasti","d. tigmotropisme")
        ),
        listOf(
            listOf("a. pecahnya kulit buah jarak yang sudah kering","b. menjalarnya akar tumbuhan ke tempat yang berair","c. gerak mengalirnya sitoplasma dalam sel","d. gerak mekarnya bunga pukul empat pada sore hari"),
            listOf("a. 1 dan 2","b. 1 dan 4","c. 2 dan 3","d. 2 dan 4"),
            listOf("a. mengalami perubahan kedudukan terhadap titik acuan","b. mengalami perubahan tempat","c. berada di suatu tempat","d. berpindah tempat")
        ),
        listOf(
            listOf("a. 1.800 m/s","b. 200 m/s ","c. 20 m/s ","d. 2 m/s"),
            listOf("a.","b.","c.","d."),
            listOf("a. 11.15","b. 11.18","c. 11.20","d. 11.30")
        ),
        listOf(
            listOf("a. GLB","b. GLBB dipercepat ","c. GLBB diperlambat ","d. GLB diperlambat"),
            listOf("a. 2 m/s2","b. 4 m/s2","c. 6 m/s2","d. 8 m/s2"),
            listOf("a. balok A akan bergerak dengan percepatan y ang  l ebi h besar,  k ar ena perc epatan berbanding terbalik dengan gaya yang bekerja pada benda.","b. balok B akan bergerak dengan percepatan y ang  l ebi h besar,  k ar ena perc epatan berbanding lurus dengan gaya yang bekerja pada benda.","c. balok A akan bergerak dengan percepatan y ang  l ebi h  k ec i l ,  k ar ena  per c epat an berbanding terbalik dengan gaya yang bekerja pada benda.","d. balok B akan bergerak dengan percepatan y ang  l ebi h  k ec i l ,  k ar ena  per c epat an berbanding lurus dengan gaya yang bekerja pada benda.")
        ),
        listOf(
            listOf("a. sama, sehingga burung dapat terbang dengan stabil di udara","b. berbeda, sehingga burung dapat melayang di udara","c. sama, karena gaya yang dimilikinya melebihi besar gaya gesekan udara maka burung dapat maju ke depan","d. berbeda, karena gaya yang dimilikinya lebih kecil dari gaya gesekan udara sehingga burung dapat maju ke depan"),
            listOf("a. penerjun payung bergerak ke bawah","b. mobil direm hingga menjadi berhenti","c. ketika mobil digas, badan terdorong ke belakang","d. berat astronot di bulan lebih kecil daripada beratnya di bumi"),
            listOf("a. 1, 2, 3","b. 2, 3, 4","c. 3, 4, 5","d. 2, 4, 5")
        ),
        listOf(
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. Gaya reaksi yang membuat kaki menjadi sakit","b. Tidak ada gaya reaksi pada kaki","c. Hukum III Newton tidak berlaku","d. Hanya ada gaya aksi berupa gaya otot yang membuat kaki mampu menendang"),
            listOf("a. 0,2 m/s2","b. 0,5  m/s2","c. 1,25 m/s2","d. 2,5 m/s2")
        ),
        listOf(
            listOf("a. Massa jenis seluruh drum lebih kecil daripada massa jenis air","b. Massa jenis seluruh drum lebih besar daripada massa jenis air","c. Massa jenis bahan pembuat drum lebih kecil daripada massa jenis air","d. Massa jenis bahan pembuat drum  lebih besar daripada massa jenis air"),
            listOf("a. Ikan 1 > ikan 2 > ikan 3  > ikan 4","b. Ikan 1 > ikan 3 > ikan 2  > ikan 4","c. ikan 4  > Ikan 2 > ikan 3 > ikan 1  ","d. ikan 4  > Ikan 3 > ikan 2 > ikan 1  "),
            listOf("a. 15 N","b. 25 N","c. 145 N","d. 5100 N")
        ),
        listOf(
            listOf("a.","b.","c.","d."),
            listOf("a. 3,5 N/ m2                ","b. 35 N/m2                ","c. 350 N/m2                 ","d. 3500 N/m2  "),
            listOf("a. Udara dalam botol A memuai sehingga tekanan udara dalam balon lebih besar daripada di luar botol","b. Udara dalam botol B memuai sehingga tekanan udara dalam balon menjadi lebih kecil daripada di luar balon","c. Udara dalam botol A menyusut sehingga tekan udara dalam balon lebih besar daripada di luar balon","d. Udara dalam botol B memuai sehingga tekanan udara dalam balon menjadi lebih besar daripada di luar balon.")
        ),
        listOf(
            listOf("a. Di dalam sel-sel akar terjadi peristiwa osmosis sehingga menyebabkan daya kapilaritas batang meningkat","b. Jaringan xylem memiliki diameter yang sangat kecil sehingga memiliki tekanan yang besar untuk menaikkan air ke daun","c. Jaringan floem memiliki diameter yang sangat kecil sehingga memiliki tekanan yang besar untuk menaikkan air ke daun","d. Air dari dalam tanah dapat naik karena daya isap daun yang rendah sehingga tekanan osmosis dalam sel meningkat"),
            listOf("a.","b.","c.","d."),
            listOf("a. 1, 2 dan 3                 ","b. 1, 3 dan 4                 ","c. 2, 3 dan 4                ","d. 1, 2 dan4")
        ),
        listOf(
            listOf("a. Relaksasinya otot-otot antartulang rusuk dan relaksasinya diafragma","b. Relaksasinya otot-otot antartulang rusuk dan berkontraksinya diafragma","c. Berkontraksinya otot-otot antartulang rusuk dan relaksasinya diafragma","d. Berkontraksinya otot-otot antartulang rusuk dan berkontraksinya diafragma"),
            listOf("a. Aktivitas tubuh, umur dan jenis kelamin","b. Suhu lingkungan, aktivitas tubuh dan jenis kelamin","c. Jenis kelamin, suhu lingkungan dan umur","d. Umur, aktivitas tubuh dan suhu lingkungan"),
            listOf("B. Osmosis                ","C. Ekskresi                ","D. Respirasi ","a. Hidung                 ")
        ),
        listOf(
            listOf("b. Trakea                ","c. Alveolusi                ","d. Paru-paru","a. TBC                         "),
            listOf("b. Kanker paru-paru        ","c. Peneumonia        ","d. Asma","a. hasil perombakan lekosit         "),
            listOf("b. hasil perombakan eritrosit         ","c. hasil perombakan trombosit","d. sisa penyaringan darah","a. 1")
        ),
        listOf(
            listOf("b. 2","c. 3","d. 4","a. oksigen dan karbon dioksida        "),
            listOf("b. uap air dan oksigen        ","c. uap air dan karbon dioksida","d. uap air dan karbon monoksida","a. 1"),
            listOf("b. 2","c. 3","d. 4","a. pelvis renalis         ")
        ),
        listOf(
            listOf("b. medulla        ","c. ureter  ","d. korteks ","a."),
            listOf("b.","c.","d.","a. glukosa                "),
            listOf("b. hemoglobin                ","c. urea                 ","d. amonia ","a. 1                ")
        ),
        listOf(
            listOf("b. 2                        ","c. 3","d. 4 ","a. frekuensi dan arah rambatnya        "),
            listOf("b. arah rambat dan arah getarnya","c. amplitudo dan arah getarnya","d. amplitudo dan frekuensinya","a. 3/4getaran                            "),
            listOf("b. 1 getaran                        ","c. 1 1/4 getaran    ","d. 2 getaran","a. 8,3 m                        ")
        ),
        listOf(
            listOf("b. 8,5 m                ","c. 8,7 m                ","d. 8,8 m","a. 1 dan 3 karena memiliki periode yang sama"),
            listOf("b. 2 dan 3 karena memiliki frekuensi yang sama        ","c. 2 dan 4 karena memiliki frekuensi yang sama","d. 3 dan 5 karena memiliki periode yang sama","a. interferensi                 "),
            listOf("b. gema                ","c. gaung                ","d. resonansi","a. 1167 m                        ")
        ),
        listOf(
            listOf("b. 2625 m                ","c. 3500 m                ","d. 5250 m","a. syaraf mata                "),
            listOf("b. kornea                 ","c. Pupil                ","d. iris ","a. Miopi sehingga harus dibantu dengan kacamata plus"),
            listOf("b. Hipermetropi sehingga harus dibantu dengan kacamata plus","c. Miopi sehingga harus dibantu dengan kacamata minus","d. Hipermetropi sehingga harus dibantu dengan kacamata plus","a. Cahaya merambat lurus")
        ),
        listOf(
            listOf("b. Cahaya dapat dipantulkan","c. Cahaya dapat dibiaskan","d. Cahaya merupakan gelombang elektromagnetik","a."),
            listOf("b.","c.","d.","a. Maya, tegak dan diperkecil                         "),
            listOf("b. Maya, tegak dan dperbesar","c. Nyata, terbalik dan diperkecil","d. Nyata, tegak, dan diperbesar","a. 300 x                                               ")
        ),
        listOf(
            listOf("b. 400 x                                                ","c. 500 x","d. 600 x        ","a. Pupil – kornea – lensa mata – bayangan ditangkap retina"),
            listOf("b. Pupil – iris – kornea – lensa mata – bayangan ditangkap retina","c. Kornea – pupil – iris – lensa mata – bayangan ditangkap retina","d. Kornea – pupil – lensa mata – bayangan ditangkap retina","a. Alat gerak aktif, sehingga tulang dapat bergerak"),
            listOf("b. Tempat utamamenyimpan kalsium dan fosfor","c. Memberikan bentuk pada tubuh dan mendukung tubuh","d. Melindungi organ internal",".")
        ),
        listOf(
            listOf("a. Tulang kering, tulang betis, dan tulang dada","b. Tulang paha, tulang belikat, dan tulang ubun-ubun","c. Tulang pengumpil, dan tulang hasta, dan tulang paha","d. Tulang pergelangan tangan, tulang jari, dan tulang lutut"),
            listOf("A. Engsel","B. Pelana ","C. Putar ","D. Peluru"),
            listOf("a. Otot lurik dan otot jantung ","b. Otot jantung dan otot polos ","c. Otot lurik dan otot rangka","d. Otot polos dan otot rangka")
        ),
        listOf(
            listOf("a. Lordosis ","b. Rakitis ","c. Skoliosis ","d. Kifosis"),
            listOf("a. Zat kapur dan kolagen","b. Zat besi dan kapur ","c. Zat kapur dan pospat","d. Zat kalsium dan fosfor"),
            listOf("a. Keadaan si pengamat terhadap ","b. Jarak si pengamat terhadap benda benda ","c. Titik acuan suatu benda","d. Perpindahan suatu benda")
        ),
        listOf(
            listOf("a. GLB","b. GLBB kemudian berubah menjadi tidak beraturan","c. GLBB diperlambat kemudian berubah menjadi GLBB dipercepat","d. GLB kemudian berubah menjadi GLBB"),
            listOf("a. 25 m/s ","b. 20 m/s ","c. 15 m/s ","d. 10 m/s"),
            listOf("a. 0,2 m/s ","b. 2 m/s ","c. 4 m/s ","d. 1 m/s")
        ),
        listOf(
            listOf("a. 5 N ","b. 10 N ","c. 15 N ","d. 20 N"),
            listOf("a. Hukum 1 Newton ","b. Hukum 2 Newton ","c. Hukum 3 Newton ","d. Hukum aksi-reaksi"),
            listOf("a. a dan b ","b. b dan c ","c. a dan c ","d. a, b dan c")
        ),
        listOf(
            listOf("a. 10 Joule ","b. 100 Joule ","c. 250 Joule","d. 500 Joule"),
            listOf("a. 1 dan 2","b. 1 dan 3","c. 2 dan 3","d. 3 dan 4"),
            listOf("a. Pertama ","b. Kedua ","c. Ketiga ","d. Keempat")
        ),
        listOf(
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. Bidang miring ","b. Pengungkit Jenis 2 ","c. Pengungkit jenis 1","d. Pengungkit jenis 3"),
            listOf("a. Epidermis ","b. Stomata ","c. Jaringan tiang","d. Jaringan spons")
        ),
        listOf(
            listOf("a. Kelopak bunga ","b. Benang sari ","c. Putik","d. Mahkota bunga"),
            listOf("a. 4","b. 3","c. 2","d. 1"),
            listOf("a. Palisade, berperan dalam pengangkutan air ","b. Palisade, berperan dalam fotosintesis ","c. Sponsa, berperan dalam pengangkutan air","d. Sponsa, berperan dalam fotosintesis")
        ),
        listOf(
            listOf("a. Panel surya ","b. Alat pemurnian air ","c. Light dependent resistor","d. Lapisan pengilat cat mobil"),
            listOf("a. Floem ","b. Kutikula ","c. Endodermis","d. Rambut akar"),
            listOf("a. Padi, jagung, kentang ","b. Tempe, tahu, kacang-kacangan ","c. Telur, margarine, lemak sapi","d. Ikan, gangdum, singkong")
        ),
        listOf(
            listOf("a. Karbohidrat darimakanan bereaksi dengan kertas","b. Lemak dalam makanan tersebut mengubah sifat kertas","c. Kertas tidak cocok untuk pembungkus makanan berprotein tinggi","d. Makanan tersebut sudah kadaluwarsa karena mengubah sifat kertas"),
            listOf("a. Lambung dan pankreas","b. Lambung dan usus besar","c. Pankreas dan usus kecil","d. Pankreas dan usus besar"),
            listOf("a. Mengubah zat tepung menjadi zat gula","b. Mengaktifkan pepsin dan membunuh kuman","c. Mengubah pepton menjadi asam amino","d. Mengubah protein menjadi asam amino")
        ),
        listOf(
            listOf("a. Diare ","b. Sembelit/konstipasi ","c. Tukak lambung","d. Kolik"),
            listOf("a. Membiasakan sarapan pagi","b. Mengkonsumsi serat yang cukup ","c. Banyak mengkonsumsi gula","d. Memperbanyak minum air putih"),
            listOf("a. Gula pasir ","b. Sakarin ","c. Siklamat","d. Aspartam")
        ),
        listOf(
            listOf("a. Pewarna buatan, karena pewarna buatan lebih mudah dibeli di toko","b. Pewarna alami, karena lebih mudah diperoleh dibandingkan pewarna buatan","c. Pewarna alami, karena tidak memiliki efek samping dalam penggunaan dengan skala besar","d. Pewarna buatan, karena tidak akan menimbulkan penyakit apapun meski dipakai dalam jumlah banyak"),
            listOf("a. Tar ","b. Kafein ","c. Nikotin","d. Kokain"),
            listOf("a. Nikotin dan alkohol ","b. Alkohol dan barbiturat ","c. Barbiturat dan amfetamin","d. Amfetamin dan kokain")
        ),
        listOf(
            listOf("a. 1, 2 dan 3 ","b. 1, 2 dan 4 ","c. 2, 3 dan 4","d. 1, 2 dan 5"),
            listOf("a. 50N","b. 40N","c. 80N","d. 60N"),
            listOf("a. 125N","b. 500N","c. 300N","d. 250N")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,1,0),
        listOf(2,3,2),
        listOf(3,2,3),
        listOf(2,2,0),
        listOf(2,3,2),
        listOf(2,1,3),
        listOf(1,1,2),
        listOf(3,3,1),
        listOf(3,2,3),
        listOf(0,0,2),
        listOf(2,0,2),
        listOf(3,3,2),
        listOf(1,2,3),
        listOf(2,1,2),
        listOf(3,0,1),
        listOf(0,0,0),
        listOf(2,1,1),
        listOf(0,2,1),
        listOf(2,2,3),
        listOf(2,0,3),
        listOf(0,3,1),
        listOf(3,1,1),
        listOf(1,3,1),
        listOf(3,1,3),
        listOf(1,0,1),
        listOf(3,2,1),
        listOf(0,3,0),
        listOf(2,2,1),
        listOf(1,2,1),
        listOf(1,3,2),
        listOf(2,2,0),
        listOf(1,3,0),
        listOf(2,3,0),
        listOf(2,2,2),
        listOf(2,3,3),
        listOf(2,0,0),
        listOf(2,0,0),
        listOf(1,1,1),
        listOf(1,2,1),
        listOf(0,1,0),
        listOf(1,1,3),
        listOf(1,2,0),
        listOf(2,1,1),
        listOf(3,1,3)



    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas8, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIpa.scoreIpaKelas8 < 1) 0 else scoreManagerIpa.scoreIpaKelas8 / 5
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
            val getData = soalIpasd8[jawabanBenar6][i]
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

                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas8
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpasd8.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas8 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas8 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd8[jawabanBenar6][i]
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