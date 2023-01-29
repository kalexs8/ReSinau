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


class SoalIpaKelas7 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd7: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. ⦁	Perhatikan langkah-langkah metode ilmiah berikut
1) Melakukan pengamatan
2) Melakukan eksperimen
3) Merumuskan hipotesis
4) Menarik kesimpulan
5) Merumuskan masalah
Urutan langkah-langkah metode ilmiah yang benar adalah ....""", 0),
            Pair("""2. Berikut ini yang bukan manfaat mempelajari IPA adalah mampu ....""", 0),
            Pair("""3. Perhatikan pernyataan di bawah ini
1) Bunga mawar berwarna merah.
2) Daun putri malu mengatupkan daun- nya ketika disentuh.
3) Daun mangga berbentuk menyirip.
4) Bunga matahari bergerak mengikuti cahaya.
Gejala alam kejadian pada objek biotik ditunjukkan nomor ....
""", 0)),

        listOf(Pair("""4. Perhatikan gambar kegiatan yang dilakukan makhluk hidup berikut ini
Ciri makhluk hidup memerlukan makanan dan berkembang biak secara berurutan ditunjukkan oleh nomor ....
""", R.mipmap.ipa_kelas7_soal4),
            Pair("""5. Aktivitas makhluk hidup yang menunjukkan ciri peka terhadap rangsang adalah ....""", 0),
            Pair("""6. Tujuan dari klasifikasi makhluk hidup adalah ....""", 0)),

        listOf(Pair("""7. Urutan tingkat takson dari yang tertinggi sampai terendah adalah ....""", 0),
            Pair("""8. Tanaman Padi mempunyai nama latin Oryza sativa.
Kata “Oryza” menunjukkan petunjuk ....
""", 0),
            Pair("""9. Perhatikan kunci determinasi berikut
Kunci determinasi untuk serangga adalah ....
""", R.mipmap.ipa_kelas7_soal9)),

        listOf(Pair("""10. Perhatikan gambar mikroskop berikut
Bagian mikroskop yang berfungsi untuk mengarahkan cahaya pada objek ditunjukkan oleh nomor ....
""", R.mipmap.ipa_kelas7_soal10),
            Pair("""11. Dalam suatu pengamatan ditemukan organisme dengan ciri-ciri sebagai berikut
1) Multiseluler
2) Tidak dapat berfotosintesis
3) Memperoleh makanan dengan menyerapnya dari lingkungan
4) Terdiri dari sel eukariotik dan memiliki dinding sel
Berdasarkan ciri tersebut, maka organisme tersebut termasuk kingdom ....
""", 0),
            Pair("""12. Perhatikan gambar berikut
Kelompok hewan yang termasuk avertebrata adalah ....
""", R.mipmap.ipa_kelas7_soal12)),

        listOf(Pair("""13. Berikut ini yang termasuk dalam kelompok tumbuhan berbiji terbuka adalah ....""", 0),
            Pair("""14. Dahulu orang sering menggunakan anggota tubuh sebagai satuan peng- ukuran seperti di bawah ini, kecuali ....""", 0),
            Pair("""15. Besaran yang dapat diukur dan memiliki satuan dinamakan besaran ....""", 0)),

        listOf(Pair("""16. Sebuah motor melaju dengan kecepatan 36 km/jam. Kecepatan tersebut sama dengan ....""", 0),
            Pair("""17. Satuan jengkal merupakan satuan yang tidak baku jika dipakai di berbagai negera. Hal ini bisa terjadi permasalahan misalnya ukuran jengkal orang Indonesia dengan orang Amerika ....""", 0),
            Pair("""18. Dalam Sistem Internasional (SI) terdapat 7 besaran pokok yaitu ....""", 0)),

        listOf(Pair("""19. Satuan yang baik apabila digunakan oleh siapapun akan menghasilkan data dalam pengukuran yang sama. Sehingga dinamakan satuan ....""", 0),
            Pair("""20. Pengukuran volume benda-benda yang bentuknya tidak teratur dapat dilakukan dengan menggunakan alat ukur ....""", 0),
            Pair("""21. Di antara syarat sebuah satuan bisa menjadi Satuan Internasional adalah ....""", 0)),

        listOf(Pair("""22. Perhatikan gambar
Massa benda tampak pada gambar sesuai dengan pengukuran tersebut adalah ....
""", R.mipmap.ipa_kelas7_soal22),
            Pair("""23. Susanti disuruh ibunya membeli gula sebanyak 2 kg di warung tetangga yang terletak di seberang jalan. Dia berangkat dengan berjalan kaki dari jam 15.30 sampai di warung jam 15.35 . Dia menghitung langkah kakinya sebanyak 250 langkah.
Dari pernyataan tersebut, maka yang dapat dikatagorikan sebagai besaran pokok dengan Satuan Internasional adalah ....
""", 0),
            Pair("""24. Perhatikan gambar berikut
Jika benda dimasukkan dalam gelas pancuran dan air yang tumpah di- tampung pada gelas kecil. Maka hasil tumpahan dari gelas berpancuran tersebut sama dengan ....
""", R.mipmap.ipa_kelas7_soal24)),

        listOf(Pair("""25. Perhatikan dari pengukuran pada jangka sorong yang tampak pada skala berikut
Hasil dari pengukuran panjang di atas adalah ....
""", R.mipmap.ipa_kelas7_soal25),
            Pair("""26. Perhatikan skema di bawah ini 
Menurut hierarki biologi,  nomor 1, 2, dan 3 secara berurutan masing-masing adalah ....
""", R.mipmap.ipa_kelas7_soal26),
            Pair("""27. Makhluk hidup yang tersusun atas sel prokariotik adalah ....""", 0)),

        listOf(Pair("""28. Perhatikan tabel  berikut ini
Perbedaan antara sel tumbuhan dengan sel hewan sesuai tabel nomor ....
""", R.mipmap.ipa_kelas7_soal28),
            Pair("""29. Perhatikan gambar dibawah  
Organ yang berfungsi sebagai alat pernapasan  pada tumbuhan ditunjukkan nomor ....
""", R.mipmap.ipa_kelas7_soal29),
            Pair("""30. Perhatikan tabel di bawah ini
Klasifikasi  bagian tubuh organisme menurut  organisasi yang benar sesuai tabel nomor ....
""", R.mipmap.ipa_kelas7_soal30)),

        listOf(Pair("""31. Perhatikan gambar sistem organ pada manusia  di bawah ini
Gambar dibawah menunjukkan sistem ....  
""", R.mipmap.ipa_kelas7_soal31),
            Pair("""32. Perhatikan gambar dibawah  
Komponen abiotik pada ekosistem akuarium adalah ....
""", R.mipmap.ipa_kelas7_soal32),
            Pair("""33. Perhatikan gambar di bawah ini
Gambar dibawah menunjukkan interaksi antara  makhluk hidup dalam  suatu ...  
""", R.mipmap.ipa_kelas7_soal33)),

        listOf(Pair("""34. Perhatikan gambar di bawah ini
Gambar dibawah menunjukkan saling ketergantungan antar organisme perairan dalam memanfaatkan oksigen dan karbon dioksida. Pernyataan yang benar adalah ....  
""", R.mipmap.ipa_kelas7_soal34),
            Pair("""35. Perhatikan bentuk hidup bersama antara individu di bawah ini :
1) ikan badut dengan anemon laut
2) kupu-kupu dengan  bunga
3) kerbau dengan burung  jalak
4) benalu dengan tanaman inangnya
Yang merupakan contoh simbiosis mutualisme adalah ....
""", 0),
            Pair("""36. Perhatikan tabel di bawah ini
Ciri-ciri organisme autotrof sesuai dengan tabel nomor ....
""", R.mipmap.ipa_kelas7_soal36)),

        listOf(Pair("""37. Perhatikan gambar jaring-jaring makanan di bawah ini
Jika akibat penggunaan insektisida yang berlebih oleh petani belalang menjadi punah, organisme yang tidak terpengaruh adalah ....  Image result for gambar jaring jaring makanan di sawah dan penjelasannya 
""", R.mipmap.ipa_kelas7_soal37),
            Pair("""38. Perhatikan skema pemekatan hayati pada sungai tercemar di bawah ini
Racun yang berasal dari sungai tercemar mengendap paling banyak pada ....
""", R.mipmap.ipa_kelas7_soal38),
            Pair("""39. Perhatikan grafik di bawah ini 
Grafik dibawah menggambarkan pengaruh penurunan konsentrasi oksigen terlarut terhadap perkembangan jumlah ikan dan bakteri pada perairan sungai yang tercemar.
Pernyataan yang benar mengenai grafik dibawah adalah ....
""", R.mipmap.ipa_kelas7_soal39)),

        listOf(Pair("""40. Program “Citarum Harum” yang sedang digalakan pemerintah merupakan salah satu usaha dalam mengatasi pencemaran ....""", 0),
            Pair("""41. Perhatikan polutan udara di bawah ini:
1) abu vulkanik gunung api                         
2) senyawa metana dari kotoran hewan
3) asap kendaraan bermotor
4) asap industri
Polutan udara yang berasal dari aktivitas manusia sesuai nomor ....
""", 0),
            Pair("""42. Penyakit yang sering diderita manusia akibat pencemaran udara adalah ....""", 0)),

        listOf(Pair("""43. Pembuangan limbah lindustri yang lansung dibuang ke tanah secara tidak memenuhi syarat disebut....""", 0),
            Pair("""44. Suatu gambaran tentang peningkatan suhu rata-rata atmosfer bumi dan lautan secara bertahap, serta sebuah perubahan yang diyakini secara permanen mengubah iklim bumi,  dikenal dengan istilah ....""", 0),
            Pair("""45. Perhatikan gambar ilustrasi penyebab terjadinya pemanasan global di bawah ini:
Pernyataan  yang benar tentang pemanasan global adalah ....
""", R.mipmap.ipa_kelas7_soal45)),

        listOf(Pair("""46. Perhatikan gambar percobaan pengaruh tanaman terhadap suhu bumi di bawah ini
Data hasil percobaan menunjukkan  rata-rata suhu pada toples Q lebih rendah dari suhu toples P.
Jika toples dinalogikan sebagai bumi, maka dapat disimpulkan bahwa salah satu usaha yang dapat dilakukan untuk menanggulangi pemanasan global adalah ....
""", 0),
            Pair("""47. Perhatikan pernyataan di bawa ini
1) meningkatnya suhu bumi yang menyebabkan penguapan  dan curah hujan meningkat
2) turunnya permukaan air laut karena pembekuan kutub bumi yang meluas
3) mencairnya gletser yang menyebabkan kadar air laut meningkat
4) penebalan lapisan ozon pada atmosfer bumi
Dampak pemanasan global sesuai pernyataan nomor ....
""", 0),
            Pair("""48. Lapisan atmosfer secara berurutan dari yang terendah hingga yang tertinggi adalah ....""", 0)),

        listOf(Pair("""49. Perhatikan gambar lapisan atmosfer bumi di bawah ini
Seandainya kamu seorang  pilot, agar pesawat terhindar dari  peristiwa cuaca yang buruk, maka harus menerbangkannya pada daerah nomor ....
""", R.mipmap.ipa_kelas7_soal49),
            Pair("""50. Berikut ini yang merupakan fungsi lapisan Ozon  di atmosfer adalah ....""", 0),
            Pair("""51. Penyebab terjadinya gempa bumi tektonik adalah ....""", 0)),

        listOf(Pair("""52. Perhatikan gambar di bawah ini
Hiposentrum gempa ditunjukkan gambar nomor ....  
""", R.mipmap.ipa_kelas7_soal52),
            Pair("""53. Perhatikan tabel spesifikasi gempa di bawah ini
Menurut Badan Meteorologi, Klimatologi, dan Geofisika  (BMKG) , spesifikasi gempa bumi yang berpotensi menimbulkan tsunami sesuai tabel nomor ....
""", R.mipmap.ipa_kelas7_soal53),
            Pair("""54. Peristiwa keluarnya magma dan material lainnya dari dalam bumi oleh letusan gunung berapi disebut....""", 0)),

        listOf(Pair("""55. Perhatikan  tabel tindakan yang harus dilakukan ketika terjadi gempa di bawah ini
Tindakan yang benar untuk menyalamatkan diri  ketika terjadi gempa sesuai tabel nomor ....
""", R.mipmap.ipa_kelas7_soal55),
            Pair("""56. Perhatikan gambar gerhana matahari total di bawah ini:
Mahkota putih yang mengelilingi bulan pada gambar dibawah merupakan penampakan lapisan matahari yang disebut .... Penampakan Indahnya Korona Matahari di Belitung 
""", R.mipmap.ipa_kelas7_soal56),
            Pair("""57. Antara planet dalam  dan planet luar dipisahkan oleh benda langit ....""", 0)),

        listOf(Pair("""58. Perhatikan ciri-ciri benda langit di bawah ini
1) Berputar mengelilingi matahari
2) Orbitnya berbentuk lonjong
3) Terbentuk atas debu, partikel es, dan gas
Benda langit yang memiliki ciri-ciri dibawah adalah ....
""", 0),
            Pair("""59. Waktu yang diperlukan bumi untuk melakukan sekali rotasi  adalah ....""", 0),
            Pair("""60. Perhatikan gambar gerhana di bawah ini
Posisi matahari, bumi, dan bulan yang benar  ketika terjadi gerhana matahari total  adalah ....  
""", R.mipmap.ipa_kelas7_soal60)),

        listOf(Pair("""61. Rifqi menghitung jumlah kaki semut dengan menggunakan kaca pembesar. Keterampilan proses yang dilakukan Rifqi adalah ….
""", 0),
            Pair("""62. Siswa MTs “Hebat Bermartabat” mengadakan praktikum untuk mengamati besaran pokok panjang. Alat ukur yang benar menggunakan ....""", R.mipmap.ipa_kelas7_soal62),
            Pair("""63. Rafi membeli sebuah pensil dan sebuah buku. Selanjutnya Rafi mengukur dan mencatat data-data dari pensil dan buku yang dibelinya. Data yang didapatkan adalah sebagai berikut:
(1)  Diameter penampang pensil 0,7 cm
(2)  Panjang pensil 17 cm
(3)  Luas permukaan buku 300 cm2  
(4)  Massa total buku dan pensil  120 gram
(5)  Jumlah halaman buku 80 halaman
(6)  Tebal buku 6 mm
Dari data tersebut yang termasuk besaran pokok adalah ....
""", 0)),

        listOf(Pair("""64. Perhatikan gambar berikut
Agar setimbang maka beban P harus ditambah ....
""", R.mipmap.ipa_kelas7_soal64),
            Pair("""65. Perhatikan gambar berikut
Lebar kertas pada pengukuran tersebut adalah ….
""", R.mipmap.ipa_kelas7_soal65),
            Pair("""66. Perhatikan tabel berikut
""", R.mipmap.ipa_kelas7_soal66)),

        listOf(Pair("""67. Berikut ini yang merupakan ciri-ciri yang dimiliki oleh semua makhluk hidup adalah ....""", 0),
            Pair("""68. Perhatikan gambar berikut
Apabila disentuh, hewan tersebut akan menggulung tubuhnya. Hal itu menunjukkan bahwa hewan tersebut memiliki ciri makhluk hidup ….
""", R.mipmap.ipa_kelas7_soal68),
            Pair("""69. Perhatikan gambar berikut 
Hewan pada gambar dibasmi dengan berbagai cara. Namun, sampai sekarang kalian masih dapat melihat keberadaan hewan tersebut. Hal ini dikarenakan hewan tersebut memiliki kemampuan ....
""", R.mipmap.ipa_kelas7_soal69)),

        listOf(Pair("""70. Perhatikan kunci determinasi berikut
Kegiatan identifikasi suatu hewan menggunakan kunci determinasi tersebut. Jika urutan kunci determinasi yang diperoleh 1b-3a, kemungkinan hewan yang diidentifikasi adalah .…
""", R.mipmap.ipa_kelas7_soal70),
            Pair("""71. Perhatikan kunci determinasi berikut
Urutan kunci determinasi tumbuhan seperti dibawah adalah .…  
""", R.mipmap.ipa_kelas7_soal71),
            Pair("""72. Seorang siswa mengamati struktur jaringan tumbuhan dengan mikroskop di laboratorium IPA, namun sinar yang masuk sedikit sehingga belum dapat melakukan pengamatan. Upaya untuk mendapatkan cahaya yang cukup supaya dapat melakukan pengamatan adalah ….
""", 0)),

        listOf(Pair("""73. Perhatikan infografis dibawah ini
Berdasarkan sistem 5 kingdom makhluk hidup apa yang tidak ada di pulau tersebut ....
""", R.mipmap.ipa_kelas7_soal73),
            Pair("""74. Perhatikan gambar beberapa jenis hewan yang berasal dari satu kelompok berikut
Persamaan ciri dan nama kelompok yang benar adalah .…
""", R.mipmap.ipa_kelas7_soal74),
            Pair("""75. Nia mengambil es batu di dalam kulkas, kemudian diletakkan di dalam gelas selama 30 menit. Partikel benda di dalam gelas tersebut setelah 30 menit jika digambarkan akan menjadi ….
""", R.mipmap.ipa_kelas7_soal75)),

        listOf(Pair("""76. Perhatikan beberapa partikel berikut ini
""", R.mipmap.ipa_kelas7_soal76),
            Pair("""77. Diketahui terdapat zat kimia dengan susunan unsur Oksigen (O) berindeks 2, unsur Carbon (C) berindeks 2, dan unsur Hidrogen (H) berindeks 4. Penulisan zat tersebut yang benar adalah ….
""", 0),
            Pair("""78. Perhatikan tabel berikut ini
Pasangan antara asam kuat dan basa lemah ditunjukkan pada ….
""", R.mipmap.ipa_kelas7_soal78)),

        listOf(Pair("""79. Anggi sedang mencoba membuat indikator asam basa dari beberapa tanaman yang ada kebun belakang rumahnya. Didapatkan hasil seperti pada tabel berikut ini.
Dari hasil percobaan Anggi tersebut, yang tidak sesuai adalah ….
""", R.mipmap.ipa_kelas7_soal79),
            Pair("""80. Perhatikan perlakuan berikut ini
1) Kertas yang dibakar hingga menjadi abu
2) Nasi yang dibiarkan hingga basi
3) Air laut menjadi garam
4) Kayu yang diukir menjadi hiasan
Dari perlakuan tersebut, yang termasuk pada perubahan kimia adalah ….
""", 0),
            Pair("""81. Pada proses pemisahan minyak bumi (mentah) menjadi bensin, salah satu teknik pemisahan kimia yang digunakan adalah .…
""", 0)),

        listOf(Pair("""82. Sifat-sifat fisika pada suatu zat dapat diamati dari karakter berikut, kecuali .…
""", 0),
            Pair("""83. Perhatikan pernyataan berikut ini
1) Tidak membasahi dinding
2) Mudah dilihat
3) Titik bekunya rendah
4) Pemuaiannya tidak teratur
Dari pernyataan tersebut, faktor yang menjadikan kelebihan penggunaan raksa sebagai pengisi indikator pada termometer adalah …
""", 0),
            Pair("""84. Suatu termometer menunjukkan suhu 45°C, berapa derajat jika dinyatakan pada suhu Fahrenheit?""", 0)),

        listOf(Pair("""85. Perhatikan kalimat berikut 
1) Membuat celah pada sambungan rel kereta api
2) Membuat keping bimetal pada sakelar otomatif
3) Membuat celah pada sambungan jembatan
4) Membuat ukuran bingkai jendela lebih besar daripada ukuran kacanya
Langkah-langkah untuk mengatasi pemuaian, ditunjukkan oleh nomor ….
""", 0),
            Pair("""86. Penataan rel kereta dibuat renggang antar setiap potongan. Hal ini dikarenakan ....""", 0),
            Pair("""87. Panjang sebuah logam tembaga pada suhu 30°C adalah 5 m. Jika koefisien muai panjang tembaga adalah 0,000017/°C, maka pertambahan panjang tembaga tersebut jika dipanaskan hingga 80°C adalah ….
""", 0)),

        listOf(Pair("""88. Tujuan dinding kaca bagian dalam tabung termos air panas dibuat mengkilap adalah ....""", 0),
            Pair("""89. Perhatikan grafik berikut ini
Berdasarkan grafik tersebut besar kalor yang diperlukan untuk mengubah 200 gram es dalam proses dari A-C adalah .… (kalor jenis es = 2.100 J/kgoC, kalor lebur es = 336.000 J/kg).
""", R.mipmap.ipa_kelas7_soal89),
            Pair("""90. Kalor jenis larutan A adalah 0,5 sedangkan kalor jenis larutan B adalah 0,3. Keduanya dipanaskan pada kondisi yang sama selama selang waktu yang sama. Larutan yang menunjukkan suhu yang lebih rendah adalah ….
""", 0)),

        listOf(Pair("""91. Untuk menaikkan suhu air laut 1oC diperlukan kalor 3900 J. Jika kalor jenis air laut 3,9 x 103 J/kg oC, masa air laut adalah ….
""", 0),
            Pair("""92. Perhatikaan gambar berikut ini
Sebatang besi dipanaskan salah satu ujungnya, maka ujung yang lain ikut  menjadi panas, dan
kalor berpindah ....
""", R.mipmap.ipa_kelas7_soal92),
            Pair("""93. Suatu larutan bersuhu 80 oC melepaskan kalor sebanyak 45 kJ. Kalor jenis larutan 4.000 J/kgoC. Jika massa larutan 500 gram, maka suhu larutan menjadi .…
""", 0)),

        listOf(Pair("""94. Ayah hendak membuat secangkir kopi. Untuk itu ayah memanaskan air sebanyak 250 gram yang bersuhu 20oC hingga mendidih.  Jika kalor jenis air adalah 4200 J/kgoC, maka banyak kalor yang diperlukan untuk mendidihkan air adalah ....""", 0),
            Pair("""95. Perhatikan pernyataan berikut
1) Energi cahaya
2) Energi angin
3) Energi nuklir
4) Energi air 
5) Energi batubara
Sumber energi yang dapat diperbarui ditunjukkan oleh nomor …. 
""", 0),
            Pair("""96. Perhatikan gambar percobaan fotosintesis berikut
Tujuan percobaan fotosintesis tersebut adalah untuk membuktikan bahwa ….
""", R.mipmap.ipa_kelas7_soal96)),

        listOf(Pair("""97. Perhatikan pernyataan berikut ini
1) Setiap 1 gram karbohidrat menghasilkan energi sebesar 4 kilo kalori.
2) Karbohidrat berfungsi untuk menjaga keseimbangan asam basa.
3) Protein nabati merupakan protein sempurna karena kandungan asam aminonya lengkap.
4) Lemak merupakan senyawa kimia yang mengandung unsur C, H, dan O.
5) Sumber utama karbohidrat adalah kacang-kacangan.
Pernyataan yang benar ditunjukkan oleh nomor .…
""", 0),
            Pair("""98. Energi yang tersimpan pada gambar berikut adalah ....""", 0),
            Pair("""99. Perhatikan gambar di bawah ini
1) energi bunyi
2) energi cahaya
3) energi kalor
4) energi kimia
5) energi listrik
6) energi surya
Isian nomor energi pada lingkaran yang terdapat pada gambar dibawah yang benar adalah ….
""", R.mipmap.ipa_kelas7_soal99)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. 1, 2, 4, 3, 5","b. 1, 4, 2, 3, 5","c. 2, 1, 3, 4, 5","d. 2, 1, 4, 3, 5"),
            listOf("a. memahami berbagai hal di sekitar kita","b. berfikir logis dan sistematis","c. mengeksplorasi kekayaan alam","d. meningkatkan kualitas hidup"),
            listOf("a. 1 dan 2        ","b. 1 dan 3        ","c. 2 dan 3","d. 2 dan 4")
        ),
        listOf(
            listOf("a. 1 dan 2        ","b. 1 dan 3        ","c. 2 dan 4","d. 3 dan 4"),
            listOf("a. tanaman pisang menghasilkan tunas","b. daun putri malu menguncup bila disentuh","c. tanaman yang diberi pupuk akan tumbuh subur","d. ujung akar tanaman akan membelok mencari air"),
            listOf("a. mempermudah pengenalan makhluk hidup","b. menentukan asal-usul makhluk hidup","c. memberikan nama pada setiap makhluk hidup","d. mengelompokkan makhluk hidup")
        ),
        listOf(
            listOf("a. kingdom-filum/divisi-kelas-ordo- famili-genus-spesies","b. kingdom-filum/divisi-kelas-genus- famili-ordo-spesies","c. kingdom-filum/divisi-kelas-famili- ordo-genus-spesies","d. kingdom-filum/divisi-kelas-ordo- genus-famili-spesies"),
            listOf("a. spesies","b. genus","c. ordo","d. nama penemu"),
            listOf("a. 1a, 2b, 4b dan 5a       ","b. 1b, 2b dan 4b        ","c. 1b, 4b dan 5a","d. 1b, 2b, 4a dan 5a")
        ),
        listOf(
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. monera","b. protista","c. fungi","d. plantae"),
            listOf("a. 1 dan 2        ","b. 1 dan 4        ","c. 2 dan 3","d. 2 dan 4")
        ),
        listOf(
            listOf("a. kacang hijau, jagung, jambu mete","b. pakis haji, melinjo, pinus","c. kacang tanah, melinjo, pinus","d. pakis haji, jambu mete, jagung"),
            listOf("a. jari, hasta, kaki","b. jengkal, depa, langkah","c. meter, kilogram, liter","d. depa, hasta dan kaki"),
            listOf("a. Biologi        ","b. Fisika        ","c. Kimia","d. Matematika")
        ),
        listOf(
            listOf("a. 72 m/s        ","b. 12 m/s        ","c. 60 m/s","d. 10 m/s"),
            listOf("a. panjangnya sama","b. lebarnya sama","c. panjangnya berbeda","d. warnanya berbeda"),
            listOf("a. panjang, massa, waktu, kuat arus listrik, suhu, jumlah zat dan intensitas cahaya","b. panjang, massa, waktu, volume, suhu, jumlah zat dan intensitas cahaya","c. panjang, massa, waktu, kuat arus listrik, suhu, luas dan intensitas cahaya","d. panjang, massa, waktu, kuat arus listrik, suhu, kecepatan dan intensitas cahaya")
        ),
        listOf(
            listOf("a. resmi        ","b. fisika        ","c. baku","d. panjang"),
            listOf("a. mistar","b. jangka sorong","c. gelas ukur","d. micrometer"),
            listOf("a. bersifat tetap dan berlaku dimana saja","b. bersifat tetap dan berlaku di negara tertentu","c. berubah-ubah sifatnya dan mudah diingat","d. berlaku dimana saja dan bersifat mudah diubah-ubah nilainya")
        ),
        listOf(
            listOf("a. 75 gram       ","b. 80 gram        ","c. 100 gram","d. 125 gram"),
            listOf("a. waktunya 5 menit","b. beratnya 2 kg","c. jaraknya 250 langkah","d. masanya 2 kg"),
            listOf("a. volume benda","b. massa benda","c. berat benda","d. massa jenis benda")
        ),
        listOf(
            listOf("a. 5,4 cm","b. 5,1 cm","c. 4,35 cm","d. 4,33 cm"),
            listOf("a. sel, organisme, organ                                   ","b. sel, organ, organisme                         ","c. organ, sel, organisme    ","d. organisme, organ, sel"),
            listOf("a. bakteri                ","b. jamur                ","c. tumbuhan                 ","d. hewan")
        ),
        listOf(
            listOf("a. 1 dan  3                ","b. 1 dan  4                ","c. 2 dan 3                ","d. 2 dan 4"),
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. 1 dan 2                                               ","b. 2 dan 3                                                ","c. 1 dan 4","d. 3 dan 4")
        ),
        listOf(
            listOf("a. pernapasan","b. pencernaan","c. ekskresi","d. reproduksi"),
            listOf("a. ikan, tumbuhan , plankton","b. air, batu, pasir","c. Ikan, air, pasir","d. Ikan, air, tumbuhan "),
            listOf("a. rantai makanan","b. jaring-jaring makanan","c. piramida makanan","d. simbiois")
        ),
        listOf(
            listOf("a. (a) = oksigen  ; (b) = karbon dioksida","b. (a) = karbon diosida ; (b) = oksigen","c. (a) = (b) = oksigen","d. (a) = (b) = karbon dioksida"),
            listOf("a. 1 dan 2                                            ","b. 2 dan 3                                        ","c. 3 dan 4    ","d. 1 dan 4"),
            listOf("a. 1                        ","b. 2                        ","c. 3                                ","d. 4")
        ),
        listOf(
            listOf("a.  laba-laba","b.  katak","c.  elang","d.  tikus"),
            listOf("a. plankton                ","b. ikan kecil                ","c. ikan besar                ","d. manusia"),
            listOf("a. sungai mengalami pencemaran pada jarak 20 km dari titik P","b. penurunan konsentrasi oksigen terlarut menyebabkan jumlah ikan meningkat","c. penurunan konsentrasi oksigen terlarut menyebabkan jumlah bakteri menurun","d. konsentrasi oksigen terlarut tidak mempengaruhi jumlah  ikan dan bakteri")
        ),
        listOf(
            listOf("a. air                         ","b. udara                ","c. tanah                ","d. bunyi"),
            listOf("a. 1 dan 2                ","b. 1 dan 3                ","c. 2 dan 3                ","d. 3 dan 4"),
            listOf("a. diare                ","b. hepatitis B                ","c. ISPA                ","d. tifus")
        ),
        listOf(
            listOf("a. illegal loging        ","b. illegal dumping        ","c. illegal fishing        ","d. illegal trading"),
            listOf("a. pemanasan global                               ","b. aklimatisasi","c. deforestation","d. efek rumah kaca"),
            listOf("a. seluruh radiasi matahari diserap oleh atmosfer dan bumi","b. gas rumah kaca dapat menyerap radiasi matahari","c. hutan gundul tidak berpengaruh  terhadap peningkatan konsentrasi gas rumah kaca di atmosfer  ","d. mengganti penggunaan BBM dengan batubara dapat mengatasi pemanasan global")
        ),
        listOf(
            listOf("a. melakukan penghijauan ","b. mengurangi penggunaan gas CFC dalam alat pendingin","c. menggunakan energi terbarukan","d. meningkatkan efisiensi bahan bakar kendaraan bermotor"),
            listOf("a. 1 dan 2                ","b. 1 dan 3                ","c. 2 dan 3                ","d. 3 dan 4"),
            listOf("a. troposfer > stratosfer > mesosfer > termosfer > eksosfer","b. termosfer> troposfer >  mesosfer > stratosfer> eksosfer","c. eksosfer > troposfer > termosfer > mesosfer > stratosfer ","d. mesosfer> termosfer >troposfer > eksosfer > stratosfer   ")
        ),
        listOf(
            listOf("a. 1                         ","b. 2                        ","c. 3                        ","d. 4"),
            listOf("a. melindungi bumi dari cahaya matahari         ","b. melindungi bumi dari sinar ultraviolet","c. mengatur suhu bumi","d. memantulkan gelombang elektromagnet"),
            listOf("a. erupsi  gunung api                                 ","b. tanah longsor","c. pergeseran lempeng bumi","d. meteor jatuh")
        ),
        listOf(
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. 1                        ","b. 2                        ","c. 3                         ","d. 4"),
            listOf("a. Vulkanik                ","b. Seismik                ","c. Abrasi                 ","d. Erupsi")
        ),
        listOf(
            listOf("a. 1 dan 2                ","b. 1 dan 3                ","c. 1 dan 4                ","d. 2 dan 3"),
            listOf("a. inti matahari                                 ","b. fotosfer","c. kromosfer","d. korona"),
            listOf("a. asteroid                ","b. meteorid                ","c. komet                 ","d. bulan")
        ),
        listOf(
            listOf("a. planet                ","b. asteroid                 ","c. meteorid                ","d. komet"),
            listOf("a. 1 hari                ","b. 1 minggu                ","c. 1 bulan                ","d. 1 tahun"),
            listOf("a. P = 1, Q = 2, R = 3                         ","b. P = 1, Q = 3, R = 2","c. P = 2, Q = 1, R = 3 ","d. P = 2, Q = 3, R = 1")
        ),
        listOf(
            listOf("a. membuat interpretasi","b. menyelidik","c. mengamati","d. mengomunikasikan"),
            listOf("a.","b.","c.","d."),
            listOf("a. (1), (2), (4), dan (5)                       ","b. (1), (3), (5), dan (6)   ","c. (1), (2), (4), dan (6)                     ","d. (2), (3), (4), dan (5)")
        ),
        listOf(
            listOf("a. 1 kg","b. 250 g                ","c. 100 g","d. 1250 g"),
            listOf("a. 5,5 cm ","b. 5,6 cm","c. 7,5 cm","d. 7,6 cm"),
            listOf("a. 1 dan 3                ","b. 3 dan 4","c. 2 dan 4         ","d. 2 dan 5")
        ),
        listOf(
            listOf("a. peka terhadap rangsang, melakukan fotosintesis dan memerlukan makanan","b. tumbuh, berkembang biak, dan mengeluarkan zat sisa","c. dapat melihat, memerlukan makanan, dan tumbuh","d. bernapas, bergerak, dan melakukan fotosintesis"),
            listOf("a. tumbuh","b. bergerak","c. berkembang biak","d. peka terhadap rangsang"),
            listOf("a. bereproduksi","b. iritabilitas","c. tumbuh","d. membuat makanan sendiri")
        ),
        listOf(
            listOf("a. hewan kelompok Mamalia darat yaitu kucing","b. hewan kelompok Pisces yaitu ikan lele","c. hewan kelompok Pisces yaitu ikan pari","d. hewan kelompok Mamalia air yaitu lumba-lumba"),
            listOf("a. 1b – 3a   ","b. 1b – 3b","c. 1a – 2b – 4a – 5a","d. 1a – 2b – 4b – 5b"),
            listOf("a. mengatur makrometer supaya mendapatkan cahaya yang cukup","b. mengatur mikrometer supaya gambar fokus dan jelas","c. mengatur diafragma supaya mendapatkan cahaya yang cukup","d. mengatur cermin supaya cahaya masuk")
        ),
        listOf(
            listOf("a. reptil dan porifera","b. mamalia dan arthropoda","c. pisces dan mamalia","d. reptil dan plantae"),
            listOf("a.","b.","c.","d."),
            listOf("a.   ","b.   ","c.   ","d.   ")
        ),
        listOf(
            listOf("a. 3 – 4 – 6","b. 5 – 1 – 6","c. 3 – 2 – 4","d. 3 – 1 – 6"),
            listOf("a. CH3COOH","b. C2O2H3","c. COCH4O","d. CH3O2"),
            listOf("a. A ; B dan 3","b. B ; D dan 4","c. A ; C dan 2","d. C ; D dan 1")
        ),
        listOf(
            listOf("a. bunga pacar air","b. kubis ungu","c. kunyit","d. bunga sepatu"),
            listOf("a. 1, 2, 3, dan 4","b. 1 dan 2","c. 2, 3, dan 4","d. 3 saja"),
            listOf("a. destilasi","b. kromatografi","c. kristalisasi","d. sublimasi")
        ),
        listOf(
            listOf("a. warna","b. wujud","c. volume","d. massa jenis"),
            listOf("a. 1, 2, dan 3","b. 1 dan 3","c. 2 dan 3","d. 1, 2, 3, dan 4"),
            listOf("a. 84° F","b. 94° F","c. 100° F","d. 113° F")
        ),
        listOf(
            listOf("a. 1) dan 2)","b. 1), 2), 3)","c. 1) dan 3)","d. 1), 2), 3), dan 4)"),
            listOf("a. pada malam hari rel tidak terputus","b. kereta dapat melaju lebih cepat","c. pada malam hari rel tidak berubah panjangnya","d. pada siang hari rel tidak keluar jalur akibat pemuaian"),
            listOf("a. 14,4 mm","b. 140 mm","c. 1,7 mm","d. 4,25 mm")
        ),
        listOf(
            listOf("a. kalor dari air panas dipantulkan kembali sehingga air tetap panas","b. lapisan mengkilap memberikan kalor kepada air sehingga tetap panas","c. tabung kaca menyerap kalor air panas dan menyimpannya","d. air tetap bersih"),
            listOf("a. 4.200 joule","b. 67.200 joule","c. 71.400 joule","d. 75.600 joule"),
            listOf("a. larutan A","b. larutan B","c. keduanya akan menunjukkan suhu yang sama","d. tidak dapat ditentukan")
        ),
        listOf(
            listOf("a. 100 kg","b. 10 kg","c. 1 kg","d. 0,1 kg"),
            listOf("a. tanpa melalui zat perantara","b. tidak melalui bagian-bagian zat.","c. diikuti bagian-bagian zat yang dilaluinya","d. tidak diikuti bagian-bagian zat yang dilaluinya"),
            listOf("a. 22,5 oC","b. 57.5 oC","c. 65 oC","d. 102,5 oC")
        ),
        listOf(
            listOf("a. 20.000 J","b. 84.000 J","c. 200.000 J","d. 840.000 J"),
            listOf("a. 1, 2, dan 3                          ","b. 1, 2, dan 4                         ","c. 2, 3, dan 4","d. 2, 3, dan 5"),
            listOf("a. fotosintesis menghasilkan gas oksigen","b. fotosintesis memerlukan air","c. fotosintesis dapat berlangsung hanya dengan bantuan cahaya matahari","d. fotosintesis menghasilkan glukosa")
        ),
        listOf(
            listOf("a. 1, 2, 3","b. 1, 3, 4","c. 2, 3, 4","d. 2, 3, 5"),
            listOf("a. energi kinetik – energi potensial","b. energi potensial – energi kinetik","c. energi potensial – energi kimia","d. energi kinetik – energi kimia  "),
            listOf("a. 3, 2, 4, 4, 5, 1, 3","b. 6, 2, 4, 4,1, 2, 3","c. 2, 3, 5, 6, 5, 2, 3","d. 6, 4, 4, 5, 2, 2, 3")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(3,2,3),
        listOf(1,1,0),
        listOf(0,1,2),
        listOf(3,2,1),
        listOf(1,2,1),
        listOf(3,2,0),
        listOf(2,2,0),
        listOf(3,3,0),
        listOf(2,1,0),
        listOf(1,1,2),
        listOf(2,1,1),
        listOf(0,1,1),
        listOf(3,3,0),
        listOf(0,3,2),
        listOf(1,0,0),
        listOf(0,2,1),
        listOf(1,1,2),
        listOf(0,1,3),
        listOf(3,3,0),
        listOf(0,0,1),
        listOf(2,2,2),
        listOf(2,1,1),
        listOf(1,3,0),
        listOf(0,3,2),
        listOf(1,0,1),
        listOf(3,0,2),
        listOf(1,1,0),
        listOf(2,1,3),
        listOf(3,3,3),
        listOf(0,2,0),
        listOf(2,3,1),
        listOf(1,1,0),
        listOf(1,1,3)



    )
    private lateinit var scoreManagerIpa: ScoreManagerIpa


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ipa_kelas7, container, false)
        scoreManagerIpa = ScoreManagerIpa(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIpa.scoreIpaKelas7 < 1) 0 else scoreManagerIpa.scoreIpaKelas7 / 5
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
            val getData = soalIpasd7[jawabanBenar6][i]
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

                        var scoreIpaSd = scoreManagerIpa.scoreIpaKelas7
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpasd7.size) {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas7 = scoreIpaSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpaSd += 5
                                scoreManagerIpa.scoreIpaKelas7 = scoreIpaSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpasd7[jawabanBenar6][i]
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