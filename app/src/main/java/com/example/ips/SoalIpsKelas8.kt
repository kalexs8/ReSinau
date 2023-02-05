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


class SoalIpsKelas8 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpssd8: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Berikut yang bukan merupakan pelaku ekonomi adalah.......""", 0),
            Pair("""2. Kelompok masyarakat yang melakukan kegiatan konsumsi terhadap barang dan jasa untuk memenuhi kebutuhan hidup diri sendiri ataupun keluarga dinamakan.......""", 0),
            Pair("""3. Pihak yang melakukan kegiatan produksi yaitu kegiatan untuk menghasilkan barang dan jasa guna memenuhi kepentingan orang lain dinamakan.......""", 0)),

        listOf(Pair("""4. pihak yang bertugas untuk mengatur, mengendalikan, serta mengadakan kontrol terhadap jalannya roda .......perekonomian dinamakan
""", 0),
            Pair("""5. Arus barang dan jasa yang masuk dari luar negeri ke dalam negeri disebut.......""", 0),
            Pair("""6. Berikut yang bukan merupakan komponen dari pendapatan rumah tangga.......""", 0)),

        listOf(Pair("""7. Suatu kemampuan mengatur, mengorganisasikan, serta mengambil risiko dalam menjalankan suatu usaha disebut dengan.......""", 0),
            Pair("""8. Yang bukan merupakan rumah tangga produsen di Indonesia adalah.......""", 0),
            Pair("""9. Peran rumah tangga perusahaan salah satunya adalah menggunakan factor produksi yang disediakan oleh.......""", 0)),

        listOf(Pair("""10. Berikut yang bukan merupakan peran rumah tangga pemerintah.......""", 0),
            Pair("""11. Pemberian subsidi oleh pemerintah, penetapan harga bahan bakar, penentuan tarif impor adalah contoh peran rumah tangga pemerintah sebagai.......""", 0),
            Pair("""12. Ketika pemerintah akan membeli pesawat tempur untuk kepentingan pertahanan Negara, maka pemerintah membelinya dari luar negeri. Hal tersebut merupakan contoh peran rumah tangga pemerintah sebagai.......""", 0)),

        listOf(Pair("""13. Pemerintah juga menyediakan berbagai kebutuhan penting bagi masyarakat, seperti listrik, jasa angkut kereta api, dan penyediaan bahan bakar melalui berbagai badan usaha milik negara. Dalam hal ini, peran pemerintah adalah sebagai.......""", 0),
            Pair("""14. Keunggulan daerah disebabkan oleh.......""", 0),
            Pair("""15. Di bawah ini yang merupakan faktor pendorong perdagangan antardaerah atau antarpulau adalah.......""", 0)),

        listOf(Pair("""16. Di bawah ini yang bukan merupakan manfaat dari perdagangan antardaerah atau antarpulau adalah.......""", 0),
            Pair("""17. Berikut ini yang bukan merupakan pihak yang terlibat dalam perdagangan internasional.......""", 0),
            Pair("""18. Berikut ini adalah pengertian devisa negara.......""", 0)),

        listOf(Pair("""19. Jika nilai impor lebih tinggi daripada nilai ekspor, maka hal itu dianggap ….. bagi Negara
""", 0),
            Pair("""20. Jika barang yang diproduksi dalam negeri dengan menggunakan komponen produksi local yang bukan merupakan bahan impor, maka dengan melemahnya nilai tukar dalam negeri, hal tersebut dianggap bagi eksportir.......""", 0),
            Pair("""21. Berikut ini yang bukan merupakan faktor pendorong ekspor.......""", 0)),

        listOf(Pair("""22. Indonesia merupakan negara dengan kekayaan laut yang begitu besar. Pemaksimalan potensi laut dapat dilakukan dengan . . . .
""", 0),
            Pair("""23. Berikut yang bukan upaya meningkatkan ekonomi maritim di Indonesia adalah ....""", 0),
            Pair("""24. Redistribusi pendapatan dilakukan sebagai salah satu bentuk berupa.......""", 0)),

        listOf(Pair("""25. Berikut ini yang bukan tujuan pembangunan kelautan adalah.......""", 0),
            Pair("""26. Pernyataan yang paling tepat yang mengakibatkan  munculnya aktivitas perdagangan   adalah...""", 0),
            Pair("""27. Berikut ini merupakan peran pelaku ekonomi dalam perekonomian :
(1) Sebagai konsumen                      (3) Sebagai penyedia faktor produksi
(2) Pengguna faktor produksi              (4) Pelaku perdagangan internasional
Peran rumah tangga konsumen (RTK) ditunjukkan pada ….
""", 0)),

        listOf(Pair("""28. Pendapatan rumah tangga keluarga/rumah tangga konsumen (RTK)  berupa balas jasa yang diterima karena telah meminjamkan sejumlah dana untuk  modal usaha perusahaan dalam kegiatan produksi  adalah....""", 0),
            Pair("""29. Perhatikan bagan hubungan pelaku ekonomi dua sektor berikut 
Berdasarkan bagan di bawah yang termasuk arus sumber pendapatan rumah tangga produsen  adalah …. Image result for gambar pelaku kegiatan ekonomi 
""", R.mipmap.ips_kelas8_soal29),
            Pair("""30. Perhatikan gambar berikut 
Kegiatan yang dilakukan Rumah Tangga Pemerintah Melalui Badan Usaha Milik Negara (BUMN) Pertamina, dalam hal ini peran pemerintah sebagai …. Image result for gambar pelaku kegiatan ekonomi pemerintah 
""", R.mipmap.ips_kelas8_soal30)),

        listOf(Pair("""31. Perdagangan antardaerah akan terjadi jika ada produk yang diperdagangkan. Hal yang
menjadi tujuan perdagangan antardaerah adalah ….
""", 0),
            Pair("""32. Berikut ini merupakan kebijakan pemerintah untuk mendorong ekspor dan faktor pendorong ekspor :
(1) Memberikan kemudahan kepada produsen barang ekspor
(2) Keadaan pasar luar negeri
(3) Menjaga kestabilan nilai tukar rupiah
(4) keuletan eksportir untuk menangkap peluang pasar
(5) Membuat perjanjian dagang internasional
(6) Kondisi sosial, ekonomi, politik suatu Negara
Kebijakan pemerintah  untuk mendorong ekspor adalah ….
""", 0),
            Pair("""33. Perbedaan perdagangan antarpulau dengan perdagangan antar negara terletak pada ketat atau tidaknya regulasi. Hal yang terjadi pada perdagangan antar negara adalah ....""", 0)),

        listOf(Pair("""34. Perhatikan konsep Ekonomi kelautan (marine economy) dan Ekonomi maritim (maritime economy) pada kegiatan ekonomi berikut 
(1) Kegiatan di pesisir, lautan serta darat yang menggunakan sumber daya alam
(2) Jasa-jasa lingkungan kelautan untuk menghasilkan barang dan jasa
(3) Transportasi laut, Industri galangan kapal dan perawatannya
(4) Pembangunan dan pengoperasian  pelabuhan beserta industri dan jasa terkait
Kegiatan yang termasuk Ekonomi maritim (maritime economy) ditunjukan pada ….
""", 0),
            Pair("""35. Strategi yang dilakukan pemerintah  dalam upaya mengembangkan agrikultur di Indonesia  dengan cara meningkatkan sistem budi daya di sektor pertanian yang ramah dan terintegrasi dengan kearifan lokal di setiap daerah adalah …. 
""", 0),
            Pair("""36. Perhatikan gambar berikut 
Pada 26 Desember 2004, bencana tsunami menerjang Aceh, Bocah bernama Martunis yang saat itu masih berusia 7 tahun terombang-ambing di bawah air selama 21 hari.  Image result for anak angkat cristiano ronaldo asal aceh 
Ia mengenakan jersey tim nasional Portugal saat pertama kali ditemukan. Ronaldo pun menyempatkan datang menemuinya di Aceh dan memberi beasiswa untuk sekolah, Martunis pun menjadi anak angkat pesepakbola ternama itu.
Kesimpulan yang didapat antara Ronaldo dan Martunis telah terjadi ….
""", R.mipmap.ips_kelas8_soal36)),

        listOf(Pair("""37. Strategi pemenuhan kebutuhan dasar rakyat yang dilakukan pemerintah diantaranya Program Keluarga Harapan (PKH), Program Indonesia Pintar (PIP) dan Bantuan Tunai Bersyarat (BTB), merupakan aplikasi dari ….
""", 0),
            Pair("""38. Pemerintah sebagai pembuat kebijakan telah mengusahakan beberapa hal terkait dengan alternatif pendistribusian pendapatan. Alat utama pemerintah dalam redistribusi pendapatan adalah ……
""", 0),
            Pair("""39. Perhatikan gambar berikut  
Nama rempah yang menjadi daya tarik bangsa Eropa datang ke Nusantara ini adalah …. Image result for daya tarik indonesia bagi bangsa barat 
""", R.mipmap.ips_kelas8_soal39)),

        listOf(Pair("""40. Semangat untuk membangun kembali kejayaan bangsa Eropa dengan menaklukan bangsa-bangsa lain merupakan pendorong kedatangan bangsa Eropa  dari faktor ….
""", 0),
            Pair("""41. Perhatikan tabel berikut  
Pelaut Protugis yang pada tahun 1512 telah berhasil sampai di Maluku adalah ….
""", R.mipmap.ips_kelas8_soal41),
            Pair("""42.  Perhatikan peta berikut 
Image result for peta pelayaran cornelis de houtman 
Tanda titik-titik merupakan jalur armada Cornelis de Houtman mengarungi ujung selatan Afrika, selanjutnya terus menuju kearah timur melewati Samudra Hindia. Pada tahun 1596, armada Cornelis de Houtman  melalui Selat Sunda tiba di ....
""", R.mipmap.ips_kelas8_soal42)),

        listOf(Pair("""43.  Pieter Both mendirikan pusat perdagangan VOC di Ambon, Maluku. Namun kemudian, pusat dagang dipindahkan ke Jayakarta (Jakarta). Hal yang menjadi alasan utama pemindahan tersebut adalah ….
""", 0),
            Pair("""44. Perhatikan fakta sejarah berikut ini 
(1) Mencetak uang dan Mengedarkan uang sendiri
(2) Kerja paksa
(3) Memonopoli perdagangan rempah-rempah
(4) Sistem sewa tanah ( landrent-system)
Manakah fakta-fakta sejarah berikut ini yang merupakan  Hak Oktroi VOC ?
""", 0),
            Pair("""45. Pada tahun 1830, Johannes van den Bosch menerapkan sistem tanam paksa (cultuur  stelsel). Kebijakan ini diberlakukan karena Belanda menghadapi kesulitan keuangan akibat ?""", 0)),

        listOf(Pair("""46. Pada tahun 1870 keluar Undang-Undang Agraria (Agrarische Wet) yang mengatur tentang prinsip-prinsip politik tanah di negeri jajahan yang menegaskan bahwa pihak swasta dapat menyewa tanah, baik tanah pemerintah maupun tanah penduduk. Pada tahun yang sama juga (1870) keluar Undang-undang Gula (Suiker Wet) yang berisi ….
""", 0),
            Pair("""47. Perhatikan tabel berikut 
Pasangan yang tepat antara tokoh perlawanan dan asal daerah adalah ….
""", R.mipmap.ips_kelas8_soal47),
            Pair("""48. Perhatikan foto pahlawan Berikut 
Ia lahir pada tanggal 11 November 1785 di Yogyakarta dengan nama Mustahar dari seorang selir bernama R.A. Mangkarawati. Semasa kecilnya bernama Bendara Raden Mas Antawirya. Pahlawan nasional tersebut lebih dikenal dengan nama …. Image result for foto pahlawan pangeran diponegoro 
""", R.mipmap.ips_kelas8_soal48)),

        listOf(Pair("""49. Snouck Hurgronje memberikan saran-saran kepada Belanda mengenai cara mengalahkan orang Aceh. Menurut Hurgronje, Aceh tidak mungkin dilawan dengan kekerasan, sebab karakter orang Aceh tidak akan pernah menyerah, Karena jiwa jihad orang Aceh sangat tinggi. Menurut Snouck Hurgronje taktik yang paling tepat adalah dengan mengadu domba antara golongan ….
""", 0),
            Pair("""50.  Perhatikan konsep-konsep  di bawah ini        
(1) Hak tawan karang        (5) Kerajaan Gowa
(2) Sultan Hasanudin        (6) Puputan Jagaraga
(3) Perjanjian Bongaya      (7) Patih I Gusti Ketut Jelantik.
(4) Kerajaan Buleleng       (8) Aru Palaka
Ciri-ciri perang Jagaraga di Bali ditunjukkan pada ….
""", 0),
            Pair("""51. Perhatikan pernyataan di bawah ini
1) Perluasan Pendidikan
2) Kemenangan Jepang atas Rusia
3) Timbulnya gerakan nasional di berbagai negara
4) Kegagalan perjuangan di berbagai daerah
5) Rasa senasib sepenanggungan
Dari pernyataan di bawah yang merupakan faktor pendorong pergerakan nasional yang berasal dari dalam ditunjukan  pada nomor ....
""", 0)),

        listOf(Pair("""52. Pemerintah Hindia Belanda menerapkan kebijakan Politik Etis pada tahun 1901, Tiga kebijakan tersebut sebenarnya bertujuan memperbaiki kondisi masyarakat yang semakin terpuruk. 
Isi kebijakan Politik Etis tersebut adalah ….
""", 0),
            Pair("""53. Kemenangan Jepang atas Rusia memberikan pengaruh positif bagi pergerakan nasional Indonesia sebab....""", 0),
            Pair("""54. Sejak tahun 1930 organisasi-organisasi pergerakan Indonesia mengubah taktik perjuangannya, mereka menggunakan taktik kooperatif atau bersedia bekerja sama dengan pemerintah Hindia Belanda, sehingga masa tersebut dikenal dengan ....""", 0)),

        listOf(Pair("""55. Tujuan utama berdirinya Budi Utomo adalah ….
""", 0),
            Pair("""56. Sarekat Dagang Islam diganti menjadi Sarekat Islam pada tanggal 10 September 1912 dengan maksud….
""", 0),
            Pair("""57. Douwes Dekker adalah seorang keturunan Belanda, tetapi dalam perjuangannya ternyata menjadi pelopor pendirian partai politik pada tahun 1912. Partai yang didirikan bersama Cipto Mangunkusumo dan Suwardi Suryaningrat adalah ….
""", 0)),

        listOf(Pair("""58. Di negeri Belanda didirikan organisasi perjuangan oleh para pelajar Indonesia. Organisasi tersebut adalah ....""", 0),
            Pair("""59. Adanya penangkapan terhadap para pemimpin PNI memberi dampak pada ....""", 0),
            Pair("""60.  Setelah PNI dibubarkan tahun 1930, Hatta dan Syahrir  mendirikan  partai politik yang
dianggap penjelmaan dari PNI. Partai yang dimaksud bernama ..
""", 0)),

        listOf(Pair("""61. Salah satu alasan dibentuknya Gapi adalah kegagalan petisi Sutarjo yang berisi tentang ....""", 0),
            Pair("""62. Partai-partai yang menggunakan taktik kooperatif dan partai-partai yang menggunakan  
taktik non kooperatif  mempunyai persamaan dalam hal ....
""", 0),
            Pair("""63. Perhatikan tabel organisasi bentukan Jepang berikut  
Berdasarkan tabel di bawah, yang termasuk organisasi semi militer bentukan Jepang adalah ….
""", R.mipmap.ips_kelas8_soal63)),

        listOf(Pair("""64. Perhatikan peta berikut 
Pantai Eretan tempat Jepang mendarat ditunjukkan pada nomor …..  
""", R.mipmap.ips_kelas8_soal64),
            Pair("""65. Perhatikan fakta sejarah Perubahan pada Masa Kolonial Barat dan Perubahan Masyarakat pada Masa Penjajahan Jepang berikut ini :
(1) Perubahan dalam Aspek Geografi               (3) Perluasan Penggunaan Lahan
(2) Perubahan dalam Aspek Ekonomi                (4) Persebaran Penduduk dan Urbanisasi
Manakah fakta-fakta sejarah berikut ini yang termasuk Perubahan pada Masa Kolonial Barat ?
""", 0),
            Pair("""66. Satu-satunya negara di Asia Tenggara yang tidak memiliki hasil tambang adalah...""", 0)),

        listOf(Pair("""67. Setiap pagi Ayu berangkat dari rumahnya di desa menuju kampusnya di kota. Sore hari ia pulang kerumahnya. Aktivitas Ayu menunjukkan jenis mobilitas...""", 0),
            Pair("""68. Contoh konflik horizontal ditunjukkan oleh pernyataan...""", 0),
            Pair("""69. Tono dan Adi merupakan teman satu sekolah sejak SD hingga SMP. Pada suatu ketika mereka terlibat konflik sehingga hubungan pertemanan keduanya menjadi renggang. Dampak negarif konflik tersebut adalah...""", 0)),

        listOf(Pair("""70. Integrasi sosial dalam masyarakat ditunjukkan oleh...""", 0),
            Pair("""71. Batas wilayah Asia Tenggara yang benar adalah...""", 0),
            Pair("""72. Faktor iklim memengaruhi perubahan dan interaksi antar ruang negara-negara ASEAN karena...""", 0)),

        listOf(Pair("""73. Saat ini banyak generasi muda cenderung berkiblat pada budaya luar negeri. Dampak negatif fenomena tersebut adalah...""", 0),
            Pair("""74. Perbedaan visi dan misi antarcalon kepala daerah dapat menyebabkan konflik antar pendukung calon kepala daerah. Konflik tersebut bisa jadi menimbulkan kerusuhan. Faktor penyebab terjadinya kerusuhan tersebut adalah...""", 0),
            Pair("""75. Contoh mobilitas horizontal ditunjukkan oleh pernyataan...""", 0)),

        listOf(Pair("""76. Perhatikan ilustrasi berikut Setelah lulus dari SMK jurusan pertanian, Tono bekerja di perusahaan kelapa sawit. Upah yang diterimanya dari bekerja dapat mengubah kehidupan keluarganya. Setelah Tono bekerja di perusahaan kelapa sawit, kebutuhan hidup keluarga tercukupi. Berdasarkan ilustrasi tersebut dampak positif mobilitas sosial adalah...""", 0),
            Pair("""77. Akibat tidak terpilih menjadi kepala desa, Pak Pono mengalami depresi. Konsekuensi mobilitas sosial yang dialami Pak Pono adalah...""", 0),
            Pair("""78. Tono bercita-cita menjadi pengusaha sukses di bidang percetakan. Berdasarkan pernyataan tersebut saluran mobilitas yang dapat dimanfaatkan oleh Tono adalah...""", 0)),

        listOf(Pair("""79. Perhatikan ilustrasi berikut Ridwan seorang staf karyawan di sebuah perusahaan otomotif. Oleh karena kerja keras dan keuletannya, Ridwan naik jabatan menjadi supervisor. Jenis mobilitas sosial yang dialami Ridwan pada ilustrasi tersebut adalah mobilitas....""", 0),
            Pair("""80. Kondisi keruangan Negara Laos berupa daratan. Seluruh wilayahnya berada di daratan Benua Asia. Dengan demikian Laos tidak memiliki kenampakan alam berupa...""", 0),
            Pair("""81. Dilihat dari posisi geografisnya, Indonesia memiliki keunggulan yaitu...""", 0)),

        listOf(Pair("""82. Negara-negara di Asia Tenggara beberapa kali terlibat ketegangan, salah satunya konflik antara Kamboja dan Thailand. Sebagai negara anggota ASEAN, Indonesia turut andil dalam upaya menyelesaikan masalah tersebut dengan cara...""", 0),
            Pair("""83. Utusan dari negara Thailand yang menandatangani deklarasi pendirian ASEAN adalah...""", 0),
            Pair("""84. Negara Indonesia, Filipina berdasarkan bentuk secara geografis memiliki ciri berbentuk kepulauan yang terpisah yang disebut/ digolongkan berciri...""", 0)),

        listOf(Pair("""85. Negara yang terletak paling utara di ASEAN yaitu....""", 0),
            Pair("""86. Perhatikan barang-barang berikut 1) Kendaraan bermotor 2) Mesin Industri 3) Bahan Kimia 4) Beras 5) Kayu hutan 6) Ikan. Sebagian besar negara di Asia Tenggara masih mengimpor barang-barang seperti yang ditunjuukan pada angka...""", 0),
            Pair("""87. Delta sungai Irawadi dan Sungai Salween memiliki tanah subur. Kondisi tersebut menyebabkan sebagian besar penduduk Myanmar melakukan kegiatan ekonomi di sektor...""", 0)),

        listOf(Pair("""88. Teknologi kereta listrik jarak dekat (komuter) sudah diterapkan di kota Jakarta, yang bertujuan untuk...""", 0),
            Pair("""89. Salah satu kerja sama antarnegara ASEAN di bidang industri adalah...""", 0),
            Pair("""90. Kerja sama ASEAN pusat penelitian dan latihan ilmu pertanian (SEARCA) didirikan di negara...""", 0)),

        listOf(Pair("""91. Perubahan sebagian atau seluruh fungsi lahan dari fungsi semula menjadi fungsi yang lain dan memengaruhi lingkungan dan potensi lahan itu sendiri disebut...""", 0),
            Pair("""92. Alih fungsi lahan pertanian menjadi permukiman mempertimbangkan beberapa faktor salah satunya adalah...""", 0),
            Pair("""93. Keberagaman suku bangsa dan budaya di Indonesia memiliki dampak positif, kecuali...""", 0)),

        listOf(Pair("""94. Peranan bahasa nasional dalam pergaulan antarsuku bangsa seperti pernyataan di bawah ini, kecuali...""", 0),
            Pair("""95. Pengaruh kemajemukan masyarakat Indonesia terhadap kehidupan sosial adalah terjadinya dua proses yaitu...""", 0),
            Pair("""96. Menurut Koetjaraningrat ada berapakah unsur kebudayaan....""", 0)),

        listOf(Pair("""97 . Barang produksi dan barang konsumsi merupakan alat pemuas kebutuhan yang dikelompokkan menurut…
""", 0),
            Pair("""98 . Alasan yang mendorong manusia untuk melakukan sebuah tindakan ekonomi disebut…
""", 0),
            Pair("""99 . Negara anggota ASEAN berjumlah...
""", 0)),

        listOf(Pair("""100. Brunei darussalam terletak pada 4 0 LU - 6 0 LU dan 114 0 BT - 115 0 BT. Berdasarkan letak astronomis tersebut, maka brunei darussalama memiliki iklim....""", 0),
            Pair("""101. Perhatikan gambar berikut ini
Dari gambar di bawah, negara yang terletak di sebelah timur negara Laos dan Kamboja adalah....
""", R.mipmap.ips_kelas8_soal101),
            Pair("""102. Negara ASEAN yang berbentuk kepulauan adalah....""", 0)),

        listOf(Pair("""103. Perhatikan gambar berikut ini
Negara ASEAN yang ditandai dengan warna ORANGE pada peta tersebut adalah...
""", R.mipmap.ips_kelas8_soal103),
            Pair("""104. Myanmar terletak pada 11o LU – 28o LU dan 92o BT – 101o BT. Berdasarkan letak astronomis tersebut, maka Myanmar memiliki iklim…
""", 0),
            Pair("""105. Negara di asia tenggara yang di kenal dengan negara gajah putih adalah
""", 0)),

        listOf(Pair("""106. Berdasarkan letak astronomisnya, wilayah  Asia Tenggara terletak pada garis lintang ….
""", 0),
            Pair("""107. Kawasan Asia Tenggara merupakan pertemuan jalur pegunungan muda Sirkum Pasifik dan Sirkum Mediterania. Hal tersebut menyebabkan kawasan Asia Tenggara ….
""", 0),
            Pair("""108. Perhimpunan negara-negara di kawasan Asia Tenggara dibentuk berdasarkan ….
""", 0)),

        listOf(Pair("""109. Secara garis besar bentang alam terdiri dari bentang darat dan bentang perairan.Bentang darat yang berupa pulau atau serangkaian pulau, negara yang bukan merupakan bentang pulau atau serangkaian pulau adalah ….
""", 0),
            Pair("""110. Negara anggota ASEAN yang kegiatan perekonomiannya tidak didukung oleh pertanian yaitu . . . .
""", 0),
            Pair("""111. Manakah dari negara-negara ASEAN berikut yang memiliki iklim subtropis?""", 0)),

        listOf(Pair("""112. Negara yang berbentuk geografis protruded dan penduduknya mayoritasras mongol yaitu. . . .
""", 0),
            Pair("""113. Salah satu kerja sama antarnegara ASEAN di bidang industri berikut ini adalah . . . .
""", 0),
            Pair("""114. Salah satu bentuk kerja sama di bidang politik antarnegara-negara ASEANadalah . . . .
""", 0)),

        listOf(Pair("""115. Faktor pendorong kerja sama antarnegara ASEAN yaitu . . . .
""", 0),
            Pair("""116. Kerja sama yang diadakan para menteri pada pertemuan Defence Ministers Meeting (ADMM) membahas bidang. . . . .
""", 0),
            Pair("""117. Bentuk karakteristik budaya yang diakibatkan perbedaan iklim kawasan negara-negara ASEAN yaitu…
""", 0)),

        listOf(Pair("""118. Perhatikan negara-negara anggota ASEAN berikut
Negara ASEAN yang termasuk dalam subwilayah benua adalah pada kolom . . . .
""", 0),
            Pair("""119. Berdasarkan keputusan Mahkamah Internasional, Pulau Ligitan dan Sipadan diberikan kepada negara…
""", 0),
            Pair("""120. Nilai positif dari kasus pengungsi manusia perahu dari Myanmar yangmenimbulkan interaksi antarnegara ASEAN antara lain . . . .
""", 0)),

        listOf(Pair("""121. Berikut ini yang bukan termasuk faktor pendorong bagi perkembangan negara Singapura menjadi negara paling maju dan paling modern di Asia Tenggara adalah ….
""", 0),
            Pair("""122. Perhatikan contoh di bawah ini.
1) Penggunaan monorel kereta jurusan Bandung-Jakarta.
2) Kemacetan yang panjang di Johor, Malaysia.
3) Penggunaan hutan sebagai jalur Jalan Lintas Selatan (JJLS) di Jawa.
4) Pembangunan transportasi bawah tanah di Thailand.
5) Alih fungsi lahan dari pemukiman menjadi kawasan bandar udara.
Manakah pernyataan yang menunjukkan dampak negatif dari interaksi antarnegara-negara ASEAN yang menimbulkan perubahan di bidang transportasi?
""", 0),
            Pair("""123. Nelayan ikan dengan skala besar yang beroperasi di kawasan Asia Tenggara memanfaatkan data cuaca, suhu, arah angin untuk mencari ikan di lautan. Fenomena ini berkaitan dengan faktor yang mempengaruhi interaksi antarruang, yaitu . . . .
""", 0)),

        listOf(Pair("""124. Perubahan sebagian atau seluruh fungsi lahan dari fungsi semula menjadi fungsi yang lain dan memengaruhi lingkungan dan potensi lahan itu sendiri disebut . . . .
""", 0),
            Pair("""125. Dampak alih fungsi lahan pertanian menjadi pemukiman, yaitu produktivitas pangan akan menjadi….
""", 0),
            Pair("""126. Mobilitas sosial vertikal adalah ….
""", 0)),

        listOf(Pair("""127. Ahmad bekerja sebagai kepala bagian di perusahaan A. Kemudian ia dipindahkan ke perusahaan B dengan jabatan tetap sebagai kepala bagian. Kasus Ahmad merupakan mobilitas ….
""", 0),
            Pair("""128. Di bawah ini adalah saluran-saluran mobilitas vertikal naik dalam masyarakat, kecuali ….
""", 0),
            Pair("""129. Mobilitas sosial adalah perpindahan posisi dari lapisan yang satu ke lapisan yang lain atau dari dimensi ke dimensi yang lainnya, merupakan pengertian mobilitas sosial menurut…
""", 0)),

        listOf(Pair("""130. Yang bukan termasuk bentuk-bentuk mobilitas sosial di bawah ini adalah…
""", 0),
            Pair("""131. Faktor pendorong terjadinya mobilitas sosial antara lain adalah ….
""", 0),
            Pair("""132. Di bawah ini yang merupakan faktor penghambat mobilitas sosial, kecuali…
""", 0)),

        listOf(Pair("""133. Faktor pendorong bagi kelompok masyarakat tidak mampu untuk melakukanmobilitas sosial adalah….
""", 0),
            Pair("""134. Perhatikan beberapa contoh saluran mobilitas sosial di bawah ini:
1) PGRI      3) IDI  5) IMI
2) APKOM DIY 4) PBB
Yang termasuk contoh saluran mobilitas sosial pada bidang organisasi profesiadalah ….
""", 0),
            Pair("""135. Di bawah ini contoh faktor pendorong mobilitas sosial pada penyebab struktural adalah….
""", 0)),

        listOf(Pair("""136.   Adanya perbedaan ras yang pernah terjadi di AfrikaSelatan merupakan contoh dari faktor penghambat sosial dalam…
""", 0),
            Pair("""137. Keberagaman suku bangsa dan budaya di Indonesia memiliki dampak positif, kecuali . . . .
""", 0),
            Pair("""138. Perhatikan nama suku bangsa Indonesia
1) Minangkabau  3) Osing
2) Gayo         4) Aneuk Jamee
Yang termasuk suku bangsa Indonesia berasal dari provinsi NAD adalah . . . .
""", 0)),

        listOf(Pair("""139. Yang bukan termasuk cara melestarikan budaya daerah sekitar adalah . . . .
""", 0),
            Pair("""140. Pluraritas budaya bangsa sebaiknya disikapi dengan . . . .
""", 0),
            Pair("""141. Konflik antara buruh dan pengusaha kerap sekali naik ke pengadilan. Pemberianupah yang tidak sesuai menjadi salah satu alasan.Kasus di bawah menggambarkan konflik terjadi karena faktor …..
""", 0)),

        listOf(Pair("""142. Individu atau kelompok merasa tidak ada manfaatnya melanjutkan konflik dengan orang atau kelompok lainkarena berkeyakinan bahwa dia tidak akan menang menghadapi konflik dan dia mengorbankan tujuan pribadi ataupun hubungannya dengan orang lain. Hal ini merupakan contoh cara menangani konflik,yaitu . . 
""", 0),
            Pair("""143. Berikut ini adalah faktor yang memengaruhi cepat lambatnya proses integrasi,kecuali….
""", 0),
            Pair("""144. Berikut ini yang termasuk faktor penghambat integrasi sosial adalah . . . .
""", 0)),

        listOf(Pair("""145. Di bawah ini contoh dari Konflik antar kelompok sosial
""", 0),
            Pair("""146. Berikut ini salah satu contoh bentuk kerja sama yang didorong karena adanya persamaan sumber daya alam, yaitu....""", 0),
            Pair("""147. Southeast Asian Games (SEA Games) adalah ajang perlombaan ASEAN di bidang....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Rumah tangga konsumen","b. Rumah tanggga perusahaan","c. Rumah tangga luar negeri","d. Rumah tangga lingkungan"),
            listOf("a. Rumah tangga konsumen","b. Rumah tanggga perusahaan","c. Rumah tangga luar negeri","d. Rumah tangga pemerintah"),
            listOf("a. Rumah tangga konsumen","b. Rumah tanggga perusahaan","c. Rumah tangga luar negeri","d. Rumah tangga pemerintah")
        ),
        listOf(
            listOf("a. Rumah tangga konsumen","b. Rumah tanggga perusahaan","c. Rumah tangga luar negeri","d. Rumah tangga pemerintah"),
            listOf("a. Impor        ","b. Ekspor        ","c. Imigrasi","d. Emigrasi"),
            listOf("a. Sewa        ","b. Upah        ","c. Tarif","d. Bunga")
        ),
        listOf(
            listOf("a. Kepahlawanan        ","b. Kewirausahaan        ","c. Jiwa bisnis","d. Keberuntungan"),
            listOf("a. BUMN","b. Perusahaan Dagang        ","c. BUMS","d. Koperasi"),
            listOf("a. Pemerintah","b. Rumah tangga konsumen","c. Rumah tangga luar negeri","d. Rumah tangga swasta")
        ),
        listOf(
            listOf("a. Regulator        ","b. Konsumen        ","c. Produsen","d. Penarik pajak"),
            listOf("a. Regulator        ","b. Konsumen        ","c. Produsen","d. Penarik pajak"),
            listOf("a. Regulator        ","b. Konsumen        ","c. Produsen","d. Penarik pajak")
        ),
        listOf(
            listOf("a. Regulator        ","b. Konsumen        ","c. Produsen","d. Penarik pajak"),
            listOf("a. Perbedaan potensi antardaerah","b. Perbedaan iklim antardaerah","c. Perbedaan cuaca antardaerah","d. Perbedaan budaya antardaerah"),
            listOf("a. Perbedaan budaya","b. Perbedaan faktor produksi","c. Perbedaan jumlah penduduk","d. Perbedaan tingkat pendidikan")
        ),
        listOf(
            listOf("a. Menyediakan alternative alat pemuas kebutuhan bagi konsumen","b. Meningkatkan produktivitas","c. Memperluas kesempatan kerja bagi masyarakat","d. Meningkatkan pemerataan jumlah penduduk"),
            listOf("a. Individu        ","b. Kelompok        ","c. Pemerintah","d. Partai politik"),
            listOf("a. Mata uang asing yang dikumpulkan oleh pemerintah","b. Mata uang asing yang beredar di pasar internasional","c. Mata uang dalam negeri yang beredar di luar negeri","d. Mata uang dalam negeri yang ditukarkan dengan mata uang luar negeri")
        ),
        listOf(
            listOf("a. Merugikan        ","b. Menguntungkan        ","c. Surplus","d. Bangkrut"),
            listOf("a. Merugikan        ","b. Menguntungkan        ","c. Defisit","d. Bangkrut"),
            listOf("a. Keadaan pasar dalam negeri","b. Keadaan pasar luar negeri","c. Keuletan eksportir dalam menangkap peluang usaha","d. Kondisi social, politik, dan ekonomi suatu negara")
        ),
        listOf(
            listOf("a. memanfaatkan sumber daya laut secara massal dengan berbagai cara","b. memberikan pelatihan kepada masyarakat tentang cara-cara memanfaatkan sumber daya laut dengan cara yang bijaksana","c. menjual sumber daya laut pada pihak asing karena mereka memiliki alat yang lebih canggih","d. membiarkan saja supaya sumber daya tersebut dapat berkembang dan terus berkembang"),
            listOf("a. mengenalkan batas-batas laut Indonesia kepada nelayan","b. meningkatkan kualitas SDM oleh pemerintah","c. memberikan kebebasan kepada kapal asing","d. memberi bantuan untuk nelayan miskin"),
            listOf("a. jaminan sosial yang dilakukan negara kepada masyarakat","b. pembagian pendapatan nasional","c. pengalokasian pajak kepada penduduk miskin","d. pemberian subsidi kepada seluruh masyarakat")
        ),
        listOf(
            listOf("a. pertumbuhan ekonomi tinggi secara berkelanjutan","b. menjadikan laut satu-satunya sumber pendapatan nasional","c. terpeliharanya kelestarian lingkungan dan sumber daya kelautan","d. menjadikan laut sebagai pemersatu dan tegaknya kedaulatan bangsa"),
            listOf("a. Adanya kelebihan devisa Negara ","b. Adanya permintaan dan penawaran akan produk tertentu","c. Adanya masyarakat yang terkena penyakit busung lapar","d. Adanya kelebihan produksi barang dan jasa"),
            listOf("a. (1) dan (2)                 ","b. (1) dan (3)                ","c. (2) dan (3)                .","d. (3) dan (4)")
        ),
        listOf(
            listOf("a. Sewa (rent)                ","b. Upah (wage)        ","c. Bunga (interst)        ","d. Lada/keuntungan (profit)"),
            listOf("a. 1","b. 2","c. 3","d. 4"),
            listOf("a. Regulator","b. Produsen","c. Konsumen","d. Distribusi")
        ),
        listOf(
            listOf("a. Meningkatkan produktivitas","b. Memperluas kesempatan kerja bagi masyarakat","c. Menyediakan alternatif alat pemuas kebutuhan","d. Memperoleh keuntungan dan memperluas jangkauan pasar"),
            listOf("a. (1), (2) dan (3)                ","b. (1), (3), dan (5)        ","c. (2), (3), dan (4)        .","d. (4), (5), dan (5)"),
            listOf("a. Regulasi ketat karena menyangkut kedaulatan bangsa","b. Regulasi longgar karena lebih mengutamakan keuntungan","c. Regulasi ketat sebagai upaya menekan impor","d. Regulasi longgar sebagai upaya meningkatkan ekspor")
        ),
        listOf(
            listOf("a. (1) dan (2)                ","b. (1) dan (3)                ","c. (2) dan (3)                ","d. (3) dan (4)"),
            listOf("a. Subsidi pupuk bagi petani                         ","b. Ekofarming                                        ","c. Distribusi pupuk secara merata","d. Perbaikan irigasi"),
            listOf("a. Redistribusi vertikal                                ","b. Redistribusi horizontal                        ","c. Redistribusi jaminan akses","d. Redistribusi kredit lunak")
        ),
        listOf(
            listOf("a. Program pemberian jaminan akses kebutuhan dasar bagi rakyat bawah","b. Program kredit lunak dan penjaminan kredit berbasis kemitraan","c. Pengembangan usaha atau industri kecil","d. Program Corporate Social Responsibility (CSR)"),
            listOf("a.  Subsidi  dan produksi                         ","b. Pengenaan pajak dan konsumsi                ","c. Subsidi dan pengenaan pajak","d. Produksi dan konsumsi"),
            listOf("a. Pala","b. Lada","c. Kemiri","d. Cengkeh")
        ),
        listOf(
            listOf("a. Good                        ","b. Gold                ","c. Gosfel                ","d. Glory"),
            listOf("a. Vasco da Gama                                 ","b. Bartolomeus Diaz                                ","c. Alfonso d’Albuque rque","d. Antonio de Abreu"),
            listOf("a. Maluku                 ","b. Malaka                ","c. Banten","d. Gowa")
        ),
        listOf(
            listOf("a. Jawa lebih strategis sebagai lalu-lintas perdagangan","b. Jawa penduduknya lebih banyak","c. Jawa tanahnya lebih subur","d. Jawa penghasil rempah-rempah yang banyak dicari bangsa Eropa"),
            listOf("a. (1) dan (2)                ","b. (1) dan (3)                ","c. (2) dan (3)                 ","d. (3) dan (4)"),
            listOf("a. Perang Diponegoro                                 ","b. Perang Paderi                                        ","c. Perang Aceh","d. Perang Banjar")
        ),
        listOf(
            listOf("a. Larangan mempekerjakan tenaga pribumi","b. Larangan mengangkut tebu keluar dari Indonesia.","c. prinsip-prinsip politik tanah di negeri jajahan","d. Larangan mempekerjakan tenaga asing"),
            listOf("a. 1 dan B                           ","b. 2 dan D                        ","c. 3 dan A     ","d. 4 dan C"),
            listOf("a. Sultan Hasanudin                         ","b. Pangeran Diponegoro                        ","c. Tuanku Imam Bonjol","d. Sultan Baabullah")
        ),
        listOf(
            listOf("a. Uleebalang (bangsawan) dan kaum ulama","b. Kaum Padri dan kaum adat","c. Kaum bangsawan dan rakyat jelata","d. Kaum bangsawan dan putra mahkota"),
            listOf("a. (1), (4), (5) dan (7)                                ","b. (1), (4), (6) dan (8)                                ","c. (2), (3), (6) dan (8)","d. (1), (4), (6) dan (7)"),
            listOf("a. 1, 2, dan 3                ","b. 1, 3, dan 5                ","c. 1, 4, dan 5                ","d. 2, 3, dan 4")
        ),
        listOf(
            listOf("a. Migrasi, Irigasi, Edukasi                         ","b. Irigasi, Transmigrasi,  Edukasi                ","c. Migrasi, Transportasi, Edukasi","d. Migrasi, Irigasi, Transmigrasi"),
            listOf("a. Jepang sebagai bangsa Asia mampu mengalahkan Rusia sehingga membangkitkan kepercayaan bangsa Indonesia akan kekuatan sendiri","b. Jepang membantu perjuangan bangsa Indonesia berupa persenjataan","c. Indonesia dapat meminta bantuan Jepang untuk mendesak Belanda","d. Kekalahan Rusia menandai kekalahan bangsa Eropa seluruhnya"),
            listOf("a. Masa radikal                 ","b. Jaman konsultasi                ","c. Masa moderat        ","d. Jaman penegas")
        ),
        listOf(
            listOf("a. Mendirikan sekolah pribumi","b. Meningkatkan derajat bangsa melalui pendidikan dan kebudayaan","c. Mempersatukan para tokoh perjuangan bangsa dalam melawan penjajah","d. Melakukan perundingan dengan pihak penjajah"),
            listOf("a. Agar kegiatan organisasi lebih terbuka ke bidang-bidang lain, tidak hanya perdagangan","b. Ada penyegaran di bawah pimpinan H.O.S Cokroaminoto        ","c. Menghindari perpecahan di tubuh SDI","d. Agar segera mendapatkan status berbadan hukum"),
            listOf("a. Indische Vereniging                                 ","b. Indische Partij                                        ","c. Europische Verbond","d. Inlander")
        ),
        listOf(
            listOf("a. Perhimpunan Bumi Putra                         ","b. Perhimpunan Indonesia                        ","c. Perhimpunan Pemuda Indonesia","d. Perhimpunan pelajar Indonesia"),
            listOf("a. Bubar (pecahnya) PNI menjadi Partindo dan PNI Baru","b. Pemerintah kolonial melonggarkan pengawasan","c. Semakin kuatnya tuntutan untuk merdeka","d. Munculnya Gapi yang menginginkan Indonesia Berparlemen"),
            listOf("a. Parindra                                        ","b. Gapi                                                ","c. PNI Pendidikan","d. Gerindo")
        ),
        listOf(
            listOf("a. Penghapusan dan penggantian istilah Inlander menjadi Indonesisch","b. Penggunaan bahasa Indonesia dalam volksraad","c. Keinginan membentuk pemerintahan sendiri","d. Tuntutan untuk menjadi persemakmuran Belanda"),
            listOf("a. Struktur organisasinya                              ","b. Modal perjuangannya                        ","c. Sikap perjuangannya","d. Tujuan perjuangannya"),
            listOf("a. A1, B2, A2 dan B2                                 ","b. A1, B2, A3 dan B3                                ","c. A2, B1. A2 dan B2","d. A2, B2, A3 dan B3")
        ),
        listOf(
            listOf("a. 1                                                                                    ","b. 2                                ","c. 3    ","d. 4"),
            listOf("a. (1) dan (2)                ","b. (1) dan (3)                ","c. (2) dan (3)                ","d. (3) dan (4)"),
            listOf("a. Singapura        ","b. Kamboja        ","c. Vietnam","d. Thailand")
        ),
        listOf(
            listOf("a. vertikal        ","b. horizontal        ","c. antargenerasi","d. lateral"),
            listOf("a. Kepala desa berdebat dengan ketua RT mengenai warga yang memperoleh jaminan sosial","b. Buruh melakukan unjuk rasa menuntut kenaikan gaji","c. Feni dan Siska bertengkar memperebutkan boneka barbie milik Siska","d. Pak Rosman memberi sanksi kepada murid-muridnya karena tidak mengerjakan PR"),
            listOf("a. menyebabkan ketentraman hidup","b. menimbulkan luka fisik dan korban jiwa","c. menyebabkan disitegrasi antarindividu","d. munculnya dominasi pemenang")
        ),
        listOf(
            listOf("a. rendahnya rasa saling memiliki budaya","b. kehidupan bersama yang saling menghargai perbedaan","c. perbedaan budaya antarkelompok","d. kesenjangan sosial, ekonomi, dan budaya"),
            listOf("a. Sebelah utara: Tiongkok","b. Sebelah timur: Timur Leste, Benua Australia, dan Samudra Hindia","c. Sebelah barat: Papua Nugini, dan Samudra Pasifik","d. Sebelah selatan: India dan Bangladesh"),
            listOf("a. iklim dapat berubah sewaktu-waktu","b. setiap negara memiliki iklim yang berbeda","c. penduduk tidak dapat mengubah iklim","d. perubahan iklim menyebabkan bencana")
        ),
        listOf(
            listOf("a. terjadi akulturasi budaya","b. terjadi asimilasi budaya","c. budaya asing memudar","d. kebudayaan lokal memudar"),
            listOf("a. perbedaan kepentingan        ","b. perbedaan status sosial        ","c. kesenjangan sosial","d. perubahan sosial"),
            listOf("a. Bu Ayu naik jabatan dari guru biasa menjadi kepala sekolah","b. setelah tidak menjabat sebagai anggota dewan, Pak Budi menjadi ketua RW","c. Pak Kasnama dipindahtugaskan dari guru SMA menjadi guru SMK","d. Dewa dimutasi dari supervisor menjadi staf karyawan biasa")
        ),
        listOf(
            listOf("a. mendorong perubahan sosial","b. meningkatkan integrasi sosial","c. meningkatkan kesejahteraan hidup","d. mempercepat perubahan lebih baik"),
            listOf("a. mendorong seseorang untuk menjadi","b. muncul gangguan psikologis","c. terjadi penurunan gaya hiudp","d. terjadi pergeseran nilai dan norma"),
            listOf("a. lembaga ekonomi        ","b. lembaga pendidikan        ","c. lembaga agama","d. lembaga keluarga")
        ),
        listOf(
            listOf("a. horizontal        ","b. vertikal        ","c. lateral","d. antargenerasi"),
            listOf("a. sungai        ","b. pantai        ","c. perbukitan","d. pegunungan"),
            listOf("a. beriklim tropis","b. keragaman hayati melimpah","c. terbagi dua zona waktu","d. dilalui jalur lalu lintas dunia")
        ),
        listOf(
            listOf("a. mengirim pasukan Garuda","b. memasok senjata kepada Kamboja","c. memprakarsai penyelenggaraan Jakarta Informal Meeting","d. mendukung Thailand dalam perundingan"),
            listOf("a. Thanat Khoman        ","b. Tun Abdul Razak        ","c. Narsisco Ramos","d. Mahatir Muhammad"),
            listOf("a. Compact        ","b. protruded        ","c. fragmented","d. elongated")
        ),
        listOf(
            listOf("a. Myanmar        ","b. Thailand        ","c. Filipina","d. Kamboja"),
            listOf("a. 2), 4), dan 5)        ","b. 4), 5), dan 6)        ","c. 1), 3), dan 5)","d. 1), 2), dan 3)"),
            listOf("a. industri        ","b. pertanian        ","c. pertambangan","d. perkebunan")
        ),
        listOf(
            listOf("a. memfasilitasi wisatawan luar negeri","b. mendapat gelar kota kelas internasional","c. mempercepat mobilitas penduduk","d. meningkatkan pendapatan penduduk"),
            listOf("a. proyek pupuk ASEAN Aceh Fertilizer Project di Inodnesia dan Malaysia","b. proyek industri tambang ASEAN Copper Fabrication Project di Filipina dan Singapura","c. proyek vaksin ASEAN Vaccin Project di Singapura dan Kamboja","d. proyek soda api Rock Salt Soda Ash Project di Thailand dan Indonesia"),
            listOf("a. Indonesia        ","b. Malaysia        ","c. Thailand","d. Filipina")
        ),
        listOf(
            listOf("a. konversi tanah        ","b. konversi lahan        ","c. pergantian tanah","d. pergantian lahan"),
            listOf("a. lokasi terjangkau dari kota","b. dekat dengan pegunungan","c. komoditas utamanya padi","d. kesuburan tanah masih tinggi"),
            listOf("a. objek kajian budaya internasional","b. bangsa menjadi lebih luwes","c. potensi dalam bidang pariwisata","d. kegagalan komunikasi budaya")
        ),
        listOf(
            listOf("a. alat untuk mengembangkan kesenian","b. mempersatukan pendapat","c. merupakan sarana pergaulan","d. mempererat tali persaudaraan"),
            listOf("a. solidaritas dan integrasi","b. persatuan dan kesatuan","c. konflik dan integrasi","d. solidaritas dan toleransi"),
            listOf("a. 6                        ","b. 7                        ","c. 8","d. 9")
        ),
        listOf(
            listOf("a. Hubungannya dengan barang lain","b. Tujuan Penggunaan","c. Kelangkaan atau cara memperolehnya","d. Proses pembuatannya"),
            listOf("a. Kegiatan Ekonomi        ","b. Prinsip Ekonomi        ","c. Motif Ekonomi","d. Hukum Ekonomi"),
            listOf("a. 5                        ","b. 7                        ","c. 8","d. 10")
        ),
        listOf(
            listOf("a. kutub        ","b. subtropis        ","c. tropis","d. sedang"),
            listOf("a. Thailand","b. Vietnam","c. Myanmar","d. Filippina"),
            listOf("a. Myanmar        ","b. Laos        ","c. Thailand","d. Filipina")
        ),
        listOf(
            listOf("a. Vietnam        ","b. Singapura        ","c. Malaysia","d. Myanmar"),
            listOf("a. Tropis        ","b. Tropis & Subtropis        ","c. Tropis & Sedang","d. Tropis Khatulistiwa"),
            listOf("a. thailand        ","b. myanmar        ","c. vietnam","d. singapura")
        ),
        listOf(
            listOf("a. 11˚ LU – 28˚ LU ","b. 11˚ LU – 28˚ LS ","c. 11˚ LS – 28˚ LU ","d. 11˚ LS – 28˚ LS"),
            listOf("a. sering dilanda badai tropis","b. merupakan kawasan paling stabil","c. sering dilanda bencana banjir","d. sering terjadi bencana alam tektonisme dan vulkanisme"),
            listOf("a. Deklarasi Kuala Lumpur","b. Deklarasi Bangkok ","c. Deklarasi Yangon ","d. Jakarta Charter")
        ),
        listOf(
            listOf("a. Singapura ","b. Brunei ","c. Thailand ","d. Indonesia"),
            listOf("a. Indonesia ","b. Malaysia ","c. Singapura ","d. Laos"),
            listOf("a. Myanmar ","b. Laos ","c. Filipina ","d. Vietnam")
        ),
        listOf(
            listOf("a. Vietnam ","b. Thailand ","c. Myanmar","d. Laos"),
            listOf("a. proyek soda api Rock Salt Soda Ash Project di Thailand dengan Indonesia","b. proyek vaksin ASEAN Vaccine Project di Singapura dengan Kamboja","c. proyek tambang ASEAN Copper Fabrication Project di Filipina dengan Singapura","d. proyek pupuk ASEAN Aceh Fertilizer Project di Indonesia dengan Malaysia "),
            listOf("a. membangun pupuk urea di Malaysia","b. menanggulangi penyalahgunaan narkotika","c. melaksanakan festival seni ASEAN","d. membentuk Pusat Informasi Pariwisata")
        ),
        listOf(
            listOf("a. kesamaan dan perbedaan ideologi","b. kesamaan dan perbedaan kepentingan tiap-tiap negara","c. kesamaan dan perbedaan kondisi geografis","d. jawaban A, B, dan C benar"),
            listOf("a. sosial","b. pendidikan","c. politik","d. budaya"),
            listOf("a. cara berpakaian ","b. cara berbicara ","c. upacara perkawinan","d. pola makan")
        ),
        listOf(
            listOf("a. I ","b. II ","c. III ","d. IV"),
            listOf("a. Indonesia ","b. Singapura ","c. Filipina ","d. Malaysia"),
            listOf("a. bertambahnya warga asing ","b. memupuk rasa kemanusiaan ","c. meningkatkan persaingan kerja","d. diskriminasi sosial pengungsi")
        ),
        listOf(
            listOf("a. Singapura memiliki letak yang strategis","b. Singapura memiliki sarana dan prasarana penerbangan dan pelabuhan bertaraf internasional","c. Singapura memiliki sumber daya alam yang melimpah","d. kondisi politik dan keamanan negara Singapura relatif stabil"),
            listOf("a. 1, 2, dan 4. ","b. 1, 3, dan 5. ","c. 2, 3, dan 5. ","d. 3, 4, dan 5."),
            listOf("a. faktor geologi ","b. faktor ketersediaan sumber daya ","c. faktor iklim","d. faktor teknologi")
        ),
        listOf(
            listOf("a. konversi lahan ","b. penggunaan tanah ","c. pergantian lahan","d. konversi tanah"),
            listOf("a. naik ","b. turun ","c. signifikan ","d. menguntungkan"),
            listOf("a. perpindahan status sosial dalam satu generasi","b. perpindahan status sosial yang tidak sederajat","c. perpindahan status sosial yang sederajat","d. perpindahan status sosial pada dua generasi")
        ),
        listOf(
            listOf("a. horizontal ","b. vertikal naik ","c. intragenerasi vertikal naik","d. intragenerasi vertikal turun"),
            listOf("a. angkatan bersenjata ","b. lembaga keagamaan ","c. lembaga pendidikan","d. paguyuban mahasiswa"),
            listOf("a. Horton dan Hunt ","b. Robert M.Z Lawang ","c. Ransford","d. Kimball Young")
        ),
        listOf(
            listOf("a. Mobilitas horizontal ","b. Mobilitas vertikal ","c. Mobilitas intragenerasi","d. Mobilitas tidak terarah"),
            listOf("a. Perbedaan ras ","b. Perbedaan jenis kelamin ","c. Komunikasi yang bebas","d. Urbanisasi"),
            listOf("a. Pembagian kerja ","b. Urbanisasi ","c. Perbedaan ras","d. Perbedaan jenis kelamin")
        ),
        listOf(
            listOf("a. penyebab struktural ","b. keadaan ekonomi ","c. pendidikan rendah","d. situasi politik"),
            listOf("a. 1 dan 2 ","b. 1 dan 3 ","c. 2 dan 4 ","d. 2 dan 5"),
            listOf("a. seorang anak yang memiliki sikap ulet dan tekun","b. seorang anak yang melanjutkan pendidikan ke jenjang perguruan tinggi","c. seorang anak yang migrasi ke daerah lain karena ada konflik","d. seorang anak desa yang mencari pekerjaan di kota")
        ),
        listOf(
            listOf("a. Perbedaan rasial dan agama ","b. Kelas-kelas sosial ","c. Kemiskinan","d. Perbedaan jenis kelamin"),
            listOf("a. kegagalan komunikasi bahasa ","b. potensi dalam bidang pariwisata ","c. objek kajian budaya internasional","d. adanya warisan kearifan lokal yang kaya"),
            listOf("a. 1 dan 2  ","b. 1 dan 3 ","c. 2 dan 3 ","d. 2 dan 4")
        ),
        listOf(
            listOf("a. mendokumentasikan pagelaran budaya daerah","b. mempelajari seni bela diri karate ","c. mempelajari tarian adat daerah","d. mempelajari lagu daerah "),
            listOf("a. keseragaman agar tercapai kedamaian ","b. mempelajari tarian adat daerah ","c. mempelajari lagu daerah","d. mengarang lagu bahasa daerah"),
            listOf("a. perbedaan budaya ","b. perbedaan kepribadian ","c. perbedaan keluarga","d. perbedaan kepentingan")
        ),
        listOf(
            listOf("a. menghindar ","b. menyesuaikan keinginan orang lain ","c. Memaksakan kehendak","d. kolaborasi"),
            listOf("a. homogenitas kelompok ","b. heterogenitas kelompok ","c. mobilitas geografis","d. efektivitas komunikasi"),
            listOf("a. adanya sikap yang terbuka dengan golongan yang berkuasa","b. kesempatan yang seimbang dalam bidang ekonomi","c. adanya perkawinan campur","d. adanya intoleransi terhadap kebudayaan yang berbeda ")
        ),
        listOf(
            listOf("a. Musyawarah ","b. Tawuran antar warga ","c. Gotongroyong","d. Saling berbagi"),
            listOf("a. NATO","b. IBRD","c. OPEC","d. MEE"),
            listOf("a. Kedirgantaraan","b. Seni budaya","c. Sains","d. Olahraga")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(3,0,1),
        listOf(3,0,2),
        listOf(1,1,1),
        listOf(3,0,1),
        listOf(2,0,1),
        listOf(3,3,0),
        listOf(0,1,0),
        listOf(1,2,0),
        listOf(1,1,1),
        listOf(2,3,1),
        listOf(3,1,0),
        listOf(3,1,1),
        listOf(0,2,3),
        listOf(3,3,2),
        listOf(0,1,0),
        listOf(1,3,1),
        listOf(0,3,2),
        listOf(1,0,2),
        listOf(1,0,1),
        listOf(1,0,2),
        listOf(2,3,1),
        listOf(3,3,0),
        listOf(3,2,2),
        listOf(1,0,1),
        listOf(3,0,2),
        listOf(2,1,0),
        listOf(1,1,3),
        listOf(2,0,2),
        listOf(0,3,1),
        listOf(2,0,3),
        listOf(1,0,3),
        listOf(1,2,1),
        listOf(1,2,3),
        listOf(2,1,3),
        listOf(3,1,0),
        listOf(2,3,1),
        listOf(2,2,0),
        listOf(2,2,1),
        listOf(3,2,0),
        listOf(2,3,1),
        listOf(2,2,3),
        listOf(0,1,1),
        listOf(0,3,1),
        listOf(3,2,0),
        listOf(1,1,3),
        listOf(0,0,3),
        listOf(0,0,3),
        listOf(0,1,3),
        listOf(1,2,3)







    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas8, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIps.scoreIpsKelas8 < 1) 0 else scoreManagerIps.scoreIpsKelas8 / 5
        val energy = EnergyManager(requireContext())

        val grupRadio1 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSmp3a)
        val grupRadio2 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSmp3b)
        val grupRadio3 = view.findViewById<RadioGroup>(R.id.radioGrupIpsSmp3c)



        val listRadiogrup: List<RadioGroup> = listOf(
            grupRadio1,
            grupRadio2,
            grupRadio3,


            )

        // load ui ketika user masuk
        for(i in 0 until (listRadiogrup.size)){
            val getData = soalIpssd8[jawabanBenar6][i]
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

                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas8
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpssd8.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas8 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas8 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd8[jawabanBenar6][i]
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