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


class SoalIpsKelas9 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpssd9: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Berikut adalah letak geologis Indonesia, kecuali .....""", 0),
            Pair("""2. Perhatikan gambar sebaran potensi ikan di Indonesia berikut
Potensi ikan cakalang paling banyak dapat ditemukan di .....
""", R.mipmap.ips_kelas9_soal2),
            Pair("""3. Mengetahui perbandingan penduduk di suatu desa yang didominasi kaum perempuan, pemerintah menggulirkan Program Usaha Peningkatan Pendapatan Keluarga Sejahtera (UPPKS) guna meningkatkan produktivitas ekonomi perempuan.
Keputusan pengguliran program pemerintah tersebut didasarkan pada .....
""", 0)),

        listOf(Pair("""4. Di dalam upaya pemberdayaan dan pengembangan kemampuan masyarakat di perbatasan, pemerintah meluncurkan program penyediaan layanan dan fasilitas televisi berlangganan. Pernyataan di bawah merupakan contoh perubahan akibat interaksi antarruang dalam bentuk .....""", 0),
            Pair("""5. Suatu hari Dino melihat kedua temannya Riski dan Ahyar sedang berkelahi. Di antara keduanya terjadi konflik atau pertentangan. Dino berusaha menengahi namun tidak berhasil dan meminta bantuan guru BP.
Tindakan Dino meminta bantuan gurunya merupakan bentuk interaksi sosial yang disebut .....
""", 0),
            Pair("""6. Konflik antara perusahaan dan karyawan yang menuntut kenaikan upah mengalami jalan buntu sehingga harus diselesaikan melalui pengadilan industri. Pengadilan industri merupakan lembaga sosial yang terbentuk karena pengaruh interaksi sosial yang dikategorikan sebagai lembaga .....""", 0)),

        listOf(Pair("""7. Sumber daya alam tanah di perkotaan tersedia terbatas sementara kebutuhan manusia akan tanah terus bertambah. Hal ini menyebabkan terjadi kelangkaan tanah, sehingga harganya semakin mahal.
Upaya yang dapat dilakukan untuk mengatasi kelangkaan tanah tersebut adalah dengan .....
""", 0),
            Pair("""8. Berikut pernyataan yang benar terkait permintaan, penawaran, pasar, dan harga adalah .....""", 0),
            Pair("""9. Perkembangan Iptek yang semakin canggih membuat aktivitas manusia kian dimudahkan, contohnya online shopping. Yang termasuk peran online shoppingterhadap kegiatan distribusi adalah .....""", 0)),

        listOf(Pair("""10. Perbedaan potensi sumber daya yang dimiliki antara wilayah perkotaan dan pedesaan menimbulkan permintaan dan penawaran.
Pernyataan yang tepat berdasarkan kondisi di bawah adalah .....
""", 0),
            Pair("""11. Kehidupan manusia yang ditandai dengan adanya perkampungan-perkampungan terdiri atas tempat tinggal sederhana didiami oleh beberapa keluarga dan dipimpin oleh kepala kampung kemudian dalam hal usaha mencukupi kebutuhan bersama diatur pembagian kerja antara laki-laki dan perempuan merupakan pola kehidupan masyarakat praaksara pada masa .....""", 0),
            Pair("""12. Teori yang menyatakan proses masuknya kebudayaan Hindu-Buddha di Indonesia sebagai hasil peran aktif orang-orang Indonesia sendiri setelah belajar agama di India adalah .....""", 0)),

        listOf(Pair("""13. Proses masuknya Islam di Indonesia menurut pendapat Mouquette, menyatakan bahwa .....""", 0),
            Pair("""14. Perhatikan gambar sebagian peta negara-negara ASEAN berikut
Sesuai gambar di bawah, negara yang terletak di sebelah barat negara Laos dan Kamboja adalah .....
""", R.mipmap.ips_kelas9_soal14),
            Pair("""15. Salah satu bentuk kerjasama negara-negara ASEAN untuk menghadapi pasar tunggal ASEAN atau Masyarakat Ekonomi ASEAN adalah kerjasama dalam pengembangan Usaha Mikro Kecil dan Menengah (UMKM). Hal ini membuat tiap-tiap negara anggota mengambil berbagai langkah strategis guna mendorong geliat usaha-usaha kecil dan menengah di dalam negeri.
Dampak positif kerjasama tersebut bagi pengusaha kecil dan menengah di Indonesia adalah .....
""", 0)),

        listOf(Pair("""16. Menyikapi sengketa wilayah Natuna antara Indonesia – Tiongkok, ASEAN telah mengambil langkah-langkah dalam upaya penyelesaian konflik tersebut diantaranya adalah memaksimalkan fungsi mekanisme kerja lembaga internal ASEAN yang telah disepakati khususnya di bidang maritim serta mengimplementasikannya di lapangan.
Ilustrasi di bawah merupakan salah satu pilar kerjasama ASEAN yaitu dalam bidang .....
""", 0),
            Pair("""17. Perkembangan teknologi komunikasi berpengaruh terhadap perubahan ruang dan berbagai aspek kehidupan manusia.
Pernyataan berikut yang tidak menunjukkan pengaruh perkembangan teknologi komunikasi terhadap perubahan ruang adalah .....
""", 0),
            Pair("""18. Berikut adalah faktor-faktor pendorong terjadinya mobilitas sosial, kecuali .....""", 0)),

        listOf(Pair("""19. Berikut ini yang menunjukkan dampak mobilitas sosial bagi percepatan perubahan sosial dalam masyarakat adalah .....""", 0),
            Pair("""20. Perhatikan tabel berikut
Indikator yang menunjukkan peran dan fungsi keragaman kebudayaan bagi pembangunan nasional ditunjukkan oleh angka .....
""", R.mipmap.ips_kelas9_soal20),
            Pair("""21. Pada saat tertentu konflik antarpihak dapat menimbulkan integrasi sosial dalam kehidupan masyarakat.
Alasan berikut yang mendukung pernyataan tersebut adalah .....
""", 0)),

        listOf(Pair("""22. Peran pelaku ekonomi RT Keluarga dalam meningkatkan produk nasional adalah .....""", 0),
            Pair("""23. Ketua Umum Kamar Dagang dan Industri (KADIN) Jawa Timur sangat mendukung penuh perdagangan antar pulau yang gencar dilakukan pemprov. Sekarang Kadin akan fokus dan memastikan barang-barang yang ada di pusat-pusat perbelanjaan harus diisi dengan produk dalam negeri asal berbagai pulau khususnya hasil produk dari usaha mikro kecil menengah (UMKM).
Berdasarkan ilustrasi di bawah, fokus perhatian KADIN terhadap perdagangan antar pulau adalah pada manfaat .....
""", 0),
            Pair("""24. Ketua Umum Himpunan Kerukunan Tani Indonesia (HKTI) menilai setidaknya ada lima persoalan petani dan pertanian di Indonesia. Di antaranya persoalan tanah, modal, teknologi, manajerial, dan pascapanen. Pada persoalan tanah, luas tanah petani kita rata-rata hanya punya tanah 0,2 hektare (ha). Sudah begitu, kondisi tanahnya rusak karena penggunaan pestisida dan pupuk unorganik yang berlebihan.
Jika diminta memberikan solusi, yang harus dilakukan terkait persoalan tanah tersebut adalah .....
""", 0)),

        listOf(Pair("""25. Pemberian dana pensiun kepada pekerja yang telah melampaui batas usia kerja di sebuah perusahaan merupakan bentuk .....""", 0),
            Pair("""26. Di bawah ini yang melatarbelakangi kedatangan bangsa barat di Indonesia adalah .....""", 0),
            Pair("""27. Dampak monopoli perdagangan yang dilakukan oleh VOC terhadap kehidupan masyarakat Indonesia adalah .....""", 0)),

        listOf(Pair("""28. Kebijakan sistem tanam paksa membuat angka kematian rakyat Indonesia sangat tinggi contohnya di Grobogan Jawa Tengah, 9/10 penduduknya meninggal.
Tingginya angka kematian di Grobogan lebih besar disebabkan oleh faktor .....
""", 0),
            Pair("""29. Perhatikan pernyataan-pernyataan berikut
(1) Pendidikan hanya dapat diakses oleh golongan bangsawan
(2) Pendidikan bisa diakses oleh semua kalangan
(3) Adanya sistem tanam paksa (cultuur Stelsel)
(4) Adanya Romusha
(5) Adanya kerja Rodi
Pernyataan yang merupakan perbedaan kehidupan pada masa kolonial barat dan penjajahan Jepang ditunjukkan pada nomor .....
""", 0),
            Pair("""30. Perhatikan peta kawasan negara-negara ASEAN di bawah ini
Letak geografis negara-negara Asia Tenggara berada di daerah tiga perairan, yaitu Samudera Hindia dan Teluk Benggala di bagian barat, Samudera Pasifik di bagian timur, dan .....
""", R.mipmap.ips_kelas9_soal30)),

        listOf(Pair("""31. Argentina, Brazil, Colombia, Venezuela adalah beberapa negara di Benua Amerika yang masuk dalam kawasan .....""", 0),
            Pair("""32. Memahami bentang alam Negara Jepang yang sebagian besar atau 70 – 80 persen terdiri atas pegunungan dan sekitar 30% adalah dataran di sepanjang pantai, maka aktivitas penduduknya lebih banyak berpusat di .....""", 0),
            Pair("""33. Perhatikan peta kepadatan penduduk Australia berikut
Wilayah dengan penduduk terpadat terdapat di .....
""", R.mipmap.ips_kelas9_soal33)),

        listOf(Pair("""34. Pertumbuhan penduduk Benua Eropa menurun dari tahun ke tahun. Faktor yang mempengaruhi kondisi tersebut, yaitu .....""", 0),
            Pair("""35. Pertumbuhan penduduk di Benua Afrika cukup tinggi. Di kawasan sub-Sahara wilayah Afrika Utara rata-rata perempuan mempunyai 5 anak. Secara geo politik, kawasan ini kurang stabil. Kondisi tersebut berimbas terhadap ketersediaan pangan dan air.
Permasalahan yang muncul berdasarkan fenomena tersebut adalah .....
""", 0),
            Pair("""36. Perhatikan pernyataan berikut
(1) Terjadi demoralisasi di kalangan remaja
(2) Perbedaan kesejahteraan antar penduduk suatu negara terlihat jelas
(3) Memiliki banyak alternatif pemilihan pemenuhan kebutuhan masyarakat dunia
(4) Arus masuk wisatawan asing meningkat tajam
(5) Memberikan bantuan bea siswa bagi penduduk negara berkembang oleh beberapa universitas di dunia
Sesuai pernyataan di bawah, yang merupakan pengaruh interaksi ruang antar negara terhadap kehidupan sosial adalah .....
""", 0)),

        listOf(Pair("""37. Perhatikan bentuk perubahan sosial budaya berikut
(1) Penggunaan alat-alat kehidupan secara turun-temurun
(2) Perkembangan teknologi internet yang menghubungkan antar komputer secara global
(3) Penggunaan mesin-mesin dalam proses kegiatan produksi
(4) Launching produk baru Honda Motor
(5) Penggunaan sistem pemerintahan presidensil oleh suatu negara
Bentuk perubahan sosial cepat atau revolusi terdapat pada nomor .....
""", 0),
            Pair("""38. Kehilangan nasionalisme dengan meniru aktivitas kebarat-baratan atau yang disebut westernisasi merupakan salah satu dampak globalisasi.
Sikap masyarakat terhadap perilaku westernisasi sebaiknya .....
""", 0),
            Pair("""39. Globalisasi di bidang transportasi terlihat pada semakin berkembangnya alat transportasi modern dan cepat. Dengan pertimbangan kelangsungan alat transportasi lokal dan efisiensi bahan bakar, upaya yang dapat dilakukan dalam menghadapi globalisasi di bidang transportasi adalah .....""", 0)),

        listOf(Pair("""40. Perhatikan pernyataan berikut
1) Harga barang ekspor lebih rendah daripada negara lain yang mengekspor barang yang sama
2) Pemberlakuan perdagangan bebas antar negara-negara dalam kawasan tertentu
3) Kebijakan harga barang ekspor suatu negara ke luar negeri lebih rendah daripada di dalam negerinya
4) Kondisi politik suatu negara yang tidak stabil
5) Pembatasan jumlah ekspor dan impor barang dari suatu negara
Faktor yang menghambat perdagangan internasional ditunjukkan oleh nomor .....
""", 0),
            Pair("""41. Berikut merupakan manfaat perdagangan antardaerah dan internasional.
(1) Persahabatan antarnegara semakin erat
(2) Memperoleh keuntungan
(3) Memperoleh barang yang tidak dapat diproduksi melalui impor
(4) Menyediakan alternatif alat pemuas kebutuhan bagi daerah
Manfaat perdagangan internasional yang paling tepat adalah .....
""", 0),
            Pair("""42. Perhatikan pernyataan berikut
(1) Menyiapkan insentif untuk memacu pertumbuhan industri kreatif berbasis budaya
(2) Membuat Road Map Industry
(3) Memberikan perlindungan hukum dan insentif bagi karyawan kreatif
(4) Membentuk Indonesia Creative Council
Salah satu satu upaya meningkatkan ekonomi kreatif oleh pemerintah dengan melakukan identifikasi kompetensi inti industri dan identifikasi fasilitas lainnya merupakan penjelasan dari poin .....
""", 0)),

        listOf(Pair("""43  Salah satu upaya pemanfaatan persaingan yang diperlukan untuk mengembangkan keunggulan ekonomi suatu bangsa adalah dengan .....
""", 0),
            Pair("""   
44  Dengan adanya pusat-pusat keunggulan ekonomi berpengaruh besar terhadap berbagai bidang kehidupan masyarakat.
Berikut yang tidak termasuk pengaruh pusat keunggulan ekonomi terhadap kehidupan masyarakat setempat adalah .....
""", 0),
            Pair("""45. MEA merupakan pasar bebas di kawasan Asia Tenggara. Pemberlakuan MEA bertujuan .....""", 0)),

        listOf(Pair("""46. Berikut ini yang bukan merupakan bentuk globalisasi dalam bidang budaya berikut ini adalah .....""", 0),
            Pair("""47. Ciri kehidupan masyarakat Indonesia pada masa Demokrasi Parlementer yang tepat berikut ini adalah .....""", 0),
            Pair("""48. Pada masa demokrasi terpimpin pemerintah menurunkan nilai mata uang Rupiah atau devaluasi yakni dari Rp1.000,00 dan Rp500,00 menjadi Rp100,00 dan Rp50,00.
Kebijakan devaluasi bertujuan untuk .....
""", 0)),

        listOf(Pair("""49. Berikut yang tidak menunjukkan perkembangan politik Indonesia pada masa Orde Baru adalah .....""", 0),
            Pair("""50. Perhatikan gambar berikut
Tujuan aksi di bawah adalah .....
""", R.mipmap.ips_kelas9_soal50),
            Pair("""51.  Mata uang asing yang dipergunakan sebagai alat pembayaran perdagangan antar negara disebut.....""", 0)),

        listOf(Pair("""52.  Menghilangkan hambatan-hambatan dalam perdagangan internasional adalah konsep kebijakan .....""", 0),
            Pair("""53.  Perdagangan Internasional kecuali berdampak positip juga bisa berdampak negatip apabila tidak dipersiapkan dengan baik oleh negara tersebut. Berikut ini yang merupakan dampak negatip dari adanya perdagangan internasional adalah .....""", 0),
            Pair("""54.  Politik ekonomi dimana menjual barang di luar negeri lebih murah dibandingkan di dalam negeri, setelah bias menguasai pasar di luar negeri maka secara perlahan- lahan harga di luar negeri dinaikan disebut politik .....""", 0)),

        listOf(Pair("""55.  Apabila dalam suatu perdagangan internasional terjadi kondisi nilai Ekspor < Import, ini berarti neraca perdagangannya mengalami .....""", 0),
            Pair("""56.  Perbandingan nilai tukar mata uang suatu negara dengan negara lain disebut ...""", 0),
            Pair("""57.  Ekonomi kreatif adalah sebuah industri yang didasarkan pada ….
""", 0)),

        listOf(Pair("""58. Industri Kreatif yang terkenal di dunia yang berasal dari Jawa Tengah yaitu ….
""", 0),
            Pair("""59.  Perhatikan gambar berikut
Gambar di bawah hasil ekonomi kreatif yang bahan dasarnya adalah ….
""", R.mipmap.ips_kelas9_soal59),
            Pair("""60. Berikut ini yang bukan merupakan karakterisitik ekonomi kreatif,adalah….
""", 0)),

        listOf(Pair("""61. Sebuah lembaga yang dibentuk presiden RI pada tanggal 20 Januari 2015 untuk mendukung pertumbuhan Industri kreatif yaitu .....""", 0),
            Pair("""62. Perhatikan gambar berikut ini 
Gambar di bawah adalah sebuah hasil kerja Industri Kreatif di bidang .....
""", R.mipmap.ips_kelas9_soal62),
            Pair("""63.  Kemunculan istilah ekonomi kreatif disebabkan Oleh.....""", 0)),

        listOf(Pair("""64.  Film animasi karya AMIKOM Yogyakarta yang sukses di pasar perfilman Indonesia adalah berjudul …
""", 0),
            Pair("""65.  Pada triwulan I 2015, jumlah kunjungan wisatawan mancanegara ke pulau Bali mencapai sekitar 946 ribu atau meningkat dibandingkan periode sama tahun sebelumnya yang mencapai sekitar 831 ribu wisatawan.
Alasan wisatawan asing suka berwisata di pulau Bali adalah….
""", 0),
            Pair("""66.  Perhatikan berbagai kebijakan pemerintah berikut ini
1) Subsidi
2) Dumping
3) Larangan import
4) Kuota
5) Diskriminasi harga
6) Bea masuk import
Dari data di bawah,yang merupakan kebijakan di bidang import ,yaitu .....
""", 0)),

        listOf(Pair("""67.  Manakah pernyataan yang benar berikut ini? """, 0),
            Pair("""68. Perhatikan tabel berikut ini
Berdasarkan tabel di bawah kontribusi tanaman bahan makanan pada tahun 2013 adalah......
""", R.mipmap.ips_kelas9_soal68),
            Pair("""69. Perhatikan tabel berikut ini
Berdasarkan tabel di bawah pertumbuhan jumlah kunjungan wisatawan asing ke Indonesia terbanyak terjadi pada tahun......
""", R.mipmap.ips_kelas9_soal69)),

        listOf(Pair("""70. Dengan kemajuan teknologi informasi dapat memperpendek jarak dan mempercepat waktu, sebagai contoh dalam hal jual beli, saat ini kegiatan jual beli dapat di lakukan dengan media internet yang di sebut dengan istilah...""", 0),
            Pair("""71. Perhatikan pernyataan pada table berikut ini
Pernyataan yang benar dari keungguan ke dua Negara itu adalah .....
""", R.mipmap.ips_kelas9_soal71),
            Pair("""72.  Tantanganyang dihadapi dalam perdagangan internasional dalam era perdagangan bebas akan berdampak yang kurang menguntungkan, yaitu:
""", 0)),

        listOf(Pair("""73. Seorang ekonom yang mengemukakan Teori keunggulan komparatif,yaitu .....""", 0),
            Pair("""74. Cara yang dilakukan suatu negara untuk mendapatkan keunggulan dibidang ekonomi,adalah .....""", 0),
            Pair("""75. Perhatikan pernyataan berikutini
1) Melakukan analisis dampak lingkungan
2) penggunaan sumber daya alam yang ramah lingkungan
3) mempertahankan dan mengembangkan kebudayaan bangsa sendiri; 
4) adanya peningkatan kualitas sumber daya manusia
Berdasarkan pernyataan tersebut faktor yang diperlukan untuk mengembangkan keunggulan di bidang ekonomi, antara lain ditunjukkan pada angka .....
""", 0)),

        listOf(Pair("""76. Keunggulan mutlak yang dimiliki Indonesia adalah.....""", 0),
            Pair("""77.  Potensi unggulan Sumatera utara di bidang pariwisata adalah .....""", 0),
            Pair("""78.  Kawasan di wilayah Indonesia bagian barat yang menjadi lalulintas perdagangan tersibuk di dunia adalah .....""", 0)),

        listOf(Pair("""79. Perhatikan gambar berikut ini
Gambar di bawah merupakan keunggulan ekonomi di daerah .....
""", R.mipmap.ips_kelas9_soal79),
            Pair("""80.  Berdasarkan Regionalisasi pusat – pusat pertumbuhan Ekonomi,untuk pulau Jawa Kota utama yang ditunjuk adalah…
""", 0),
            Pair("""81.  Untuk pembangunan di wilayah Indonesia timur guna mewujudkan keunggulan ekonomi maka dibentuk KAPET,yang artinta .....""", 0)),

        listOf(Pair("""82.  Salah satu tujuan pembentukan kawasan ekonomi terpadu adalah …
""", 0),
            Pair("""83.  Perhatikan diagram batang berikut ini
Diagram batang di bawah adalah menggambarkan negara – negara pensuplai udang ke negara Amerika Serikat.Untuk negara Indonesia adalah peringkat ke ....
""", R.mipmap.ips_kelas9_soal83),
            Pair("""84.   Pasir Besi yang berada di daerah Yogyakarta memiliki kwalitas yang amat tinggi. Sehingga dapat dimanfaatkan untuk ...... """, 0)),

        listOf(Pair("""85.  Inti pelaksanaan pasar bebas adalah…..
""", 0),
            Pair("""86.  Indonesia mengeksport batik ke negara China . Sementara negara China mengeksport  barang elektronik.  Pernyataan tersebut merupakan contoh perdagangan internasional yang didorong oleh faktor ….
""", 0),
            Pair("""87. Kegiatan perdagangan internasional yang memberikan manfaat untuk meningkatkan pendapatan  perkapita penduduk adalah….
""", 0)),

        listOf(Pair("""88. Salah satu bentuk kebijakan ekonomi di Jepang adalah menjual motor di pasar Luar negeri lebih murah dari pada di pasar dalam negeri.  Kebijakan ekonomi yang sesuai dengan pernyataan tersebut adalah kebijakan ekonomi ….
""", 0),
            Pair("""89. Produk Import dengan harga yang lebih murah dapat menjadi pesaing berat di pasar dalam negeri dan mempersempit peluang produk lokal. Kebijakan yang dapat diberlakukan Pemerintah dalam mengatasi permasalahan tersebut adalah ….
""", 0),
            Pair("""90. Konsep ekonomi kreatif disambut hangat di Indonesia, terutama untuk mengembangkan….
""", 0)),

        listOf(Pair("""91. Berikut ini adalah beberapa alasan mengapa ekonomi kreatif  perlu dikembangkan, kecuali….
""", 0),
            Pair("""92. Perhatikan ilustrasi berikut ini
Saat ini pemerintah sedang menggalakkan kebijakan pembangunan baju batik. Melihat kondisi tersebut  bu Dora mencoba mendesain beberapa kain batik menjadi baju dengan desain modern. Desainnya tersebut ia pajang di ruko jahitan. Berkat usahanya tersebut banyak pelanggan yang memesan baju batik kepada bu Dora. Keuntungan yang diperoleh dapat digunakan Bu Dora untuk memajukan usaha jahitan.
Kemampuan wirausaha yang dimiliki bu Dora berdasarkan pada ilustrasi tersebut adalah ….
""", 0),
            Pair("""93. Daftar sektor usaha ekonomi
Dari daftar di bawah  yang termasuk dalam sektor ekonomi kreatif adalah….
""", R.mipmap.ips_kelas9_soal93)),

        listOf(Pair("""94. Perhatikan tabel keunggulan absolut di bawah ini
Dari tabel di bawah dapat diketahui bahwa….
""", R.mipmap.ips_kelas9_soal94),
            Pair("""95 . Iklim di Indonesia cocok untuk menghasilkan rempah-rempah yang tidak bisa dihasilkan negara-negara Eropa. Tindakan yang dapat dilakukan Indonesia untuk memperoleh keuntungan atas kondisi tersebut bagi Indonesia adalah….
""", 0),
            Pair("""96 . Keunggulan mutlak dan komparatif yang dimiliki Indonesia memberikan banyak manfaat. Salah satu manfaat  keunggulan mutlak dan komparatif yang dimiliki Indonesia adalah…
""", 0)),

        listOf(Pair("""97 . Tambang emas di Papua merupakan salah satu pusat keunggulan ekonomi di Indonesia. Dampak positif adanya pusat keunggulan ekonomi tersebut dibidang ketenagakerjaan adalah…
""", 0),
            Pair("""98 . Saat ini beberapa sarana transportasi di Indonesia mulai berkembang. Adanya perkembangan sarana transportasi memberikan keuntungan di beberapa bidang ekonomi. Salah satu keunggulan tersebut adalah…
""", 0),
            Pair("""99 . Wisata spiritual merupakan salah satu keberhasilan pengembangan ekonomi kreatif di wilayah….
""", 0)),

        listOf(Pair("""100. Kilang minyak Balongan merupakan salah satu kilang minyak yang dimiliki Pertamina. Kilang minyak ini memiliki nilai strategis bagi perekonomian Indonesia karena mampu ….
""", 0),
            Pair("""101. Produk yang diperdagangkan dalam perdagangan bebas kadang berkualitas rendah. Kondisi ini menyebabkan kerugian bagi konsumen. Upaya yang dapat dilakukan untuk menghindari permasalahan tersebut adalah…
""", 0),
            Pair("""102. Perhatikan keterangan berikut
1) MEA sebagai kawasan ekonomi dengan tingkat kompetisi yang tinggi
2) MEA  sebagai pasar tunggal dan berbasis produksi Internasional
3) MEA merupakan perdagangan dengan basis kontrol negara-negara Eropa
4) MEA  dijadikan kawasan untuk mengembangkan usaha kecil menengah
5) MEA merupakan persaingan negara-negara di ASEAN
         Tujuan organisasi MEA ditunjukkan oleh angka….
""", 0)),

        listOf(Pair("""103. Salah satu kegiatan dalam perdagangan bebas adalah masuknya investasi dari negara maju ke negara berkembang. Kondisi tersebut memberikan manfaat bagi bidang ketenagakerjaan di negara berkembang yaitu meningkatkan ….
""", 0),
            Pair("""104. Perhatikan pernyataan berikut 
1) Mempercepat proses proklamasi
2) Mencegah terpengaruhnya Soekarno Hatta terhadap pengaruh Jepang
3) Menghindari perselisihan waktu pelaksanaan proklamasi
4) Untuk mendesak kedua tokoh agar segera memproklamasikan kemerdekaan Indonesia terlepas dari segala ikatan Jepang
Yang termasuk tujuan dari pengasingan Ir.Soekarno – Hatta ke Rengasdengklok adalah pernyataan nomor  …
""", 0),
            Pair("""105. Perhatikan hasil sidang PPKI berikut 
1) Membentuk pemerintahan daerah yang terdiri 8 Propinsi
2) Membentuk Komite Nasional
3) Membentuk 12 kementeria dan 4 menteri negara
4) Membentuk Komite Nasional Indonesia Pusat
Hasil sidang PPKI pada tanggal 28 Agustus 1945 adalah nomor …
""", 0)),

        listOf(Pair("""106. Rapat Raksasa Lapangan Ikada terjadi pada 19 September 1945, saat Soekarno memberikan pidato singkat di hadapan ribuan rakyat di Lapangan Ikada dalam rangka memperingati 1 bulan proklamasi kemerdekaan
Yang bukan termasuk keuntungan rakyat Indonesia dengan diadakannya Rapat Raksasa di Lapangan Ikada adalah ....
""", 0),
            Pair("""107. Perhatikan nama tokoh proklamasi di bawah ini 
1) Ir.Soekarno
2) Drs. Moh Hatta
3) Sayuti Melik
4) Ahmad Subarjo
Yang bukan termasuk tim perumus naskah Proklamasi adalah  nomor …
""", 0),
            Pair("""108. Setela kemunculan gerakan DI/TII di Jawa Barat pada tanggal 7 Agustus 1949 berlanjut ke daerah-daerah lain di wilyah nusantara termasuk di di Sulawesi.
Kemunculan gerakan DI/TII di Sulawesi dipimpin oleh …
""", 0)),

        listOf(Pair("""109. Perhatikan nama-nama pahlawan berikut 
1) Jenderal Ahmad Yani
2) Ir.Soekarno
3) Drs. Mohammad Hatta
4) Kapten Pierre Tendean
Nama pahlawan di bawah yang termasuk pahlawan revolusi adalah…
""", 0),
            Pair("""110. Pemilihan umum pertama di Indonesia dilaksanakan dalam dua tahap. Salah satunya dilaksanakan pada tanggal 29 September 1955 dengan tujuan untuk memilih …
""", 0),
            Pair("""111. Dekrit Presiden 5 Juli 1959 dilatarbelakangi oleh kegagalan Badan Konstituante untuk menetapkan UUD baru sebagai pengganti UUDS 1950.
Salah satu penyebab kegagalan Badan Konstituante adalah…
""", 0)),

        listOf(Pair("""112. Perhatikan pernyataan berikut 
1) Mengatur kembali batas perairan nasional Indonesia melalui Deklarasi Djuanda
2) terciptanya Kesatuan Wilayah Indonesia dimana lautan dan daratan merupakan satu kesatuan yang utuh dan bulat
3) melaksanakan pemilihan umum pertama
4) Terbentuknya Dewan Nasional 
Yang bukan termasuk keberhasilan kabinet Djuanda ditunjukkan pada nomor …
""", 0),
            Pair("""113.  Perhatikan pertanyaan berikut ini 
1) Pembubara badan konstituante
2) Pembubaran PKI dan ormas-ormasnya
3) Berlakunya kembali UUD 1945
4) Segera di bentuk MPRS dan DPRGR
Yang merupakan isi dari dekrit presiden tanggal 5 Juli 1959 ditunjukkan pada nomor …
""", 0),
            Pair("""114. Setelah mendapat kekuasaan sepenuhnya pemerintah Orde Baru sejak pengukuhan Letjen Soeharto sebagai presiden maka pemerintah Orde Baru melakukan langkah-langkah penataan stabilitas politik.
Salah satu langkah kebijakan politik yang diambil adalah …
""", 0)),

        listOf(Pair("""115. Pemulihan hubungan Indonesia dan Malaysia diawali dengan diadakannya perundingan di Bangkok pada tanggal 29 Mei 1966 yang selanjutnya diadakan persetujuan pemulihan hubungan pada tanggal 11 Agustus 1966.
Perwakilan dari Indonesia waktu itu adalah …
""", 0),
            Pair("""116.  Deklarasi ASEAN ditandatangani pada tanggal 8 Agustus 1967 di Bangkok yang dikenal dengan Deklarasi Bangkok. Salah satu peran penting Indonesia dalam pembentukan ASEAN adalah...""", 0),
            Pair("""117. Pada tanggal 12 Mei 1988 masyarakat bersama para mahasiswa menuntut pemerintahan untuk segera melakukan pembaharua namun dalam peristiwa itu membawa korban terbunuhnya 4 mahasiswa. 
Peristiwa terbunuhnya 4 mahasiswa dikenal dengan peristiwa…
""", 0)),

        listOf(Pair("""118. Pada saat terjadi krisis moneter 1988 pemerintah Orde Baru mulai goyah, rakyat menunjukkan sikap tidak percaya kepada pemerintah karena pemerintah banyak melakukan penyimpangan dan penyelewengan. 
Salah satu penyimpangan yang paling terbesar adalah …
""", 0),
            Pair("""119. 20 mahasiswa Universitas Indonesia mendatangi Gedung DPR/MPR pada tanggal 5 Maret 1998, mereka bertujuan untuk menyatakan penolakan terhadap pidato pertanggungjawaban presiden selaku pimpinan pemerintah Orde Baru sampai akhirnya pemerintah Orde Baru jatuh.
Salah satu penyebab jatuhnya pemerintahan Orde Baru adalah …
""", 0),
            Pair("""120. Masa Reformasi di Indonesia adalah masa setelah berakhirnya pemerintahan Orde Baru. 
Yang di maksud dengan Reformasi adalah …
""", 0)),

        listOf(Pair("""121. Selama era reformasi, Indonesia sudah mengalami pergantian presiden sebanyak 5 kali.
Urutan ke dua Presiden Republik Indonesia di era reformasi adalah …
""", 0),
            Pair("""122. Perhatikan pernyataan di bawah ini 
1) Presiden dan wakil presiden diangkat oleh MPR dalam masa jabatan 5 tahun
2) Presiden dan wakil presiden dipilih secara lansung oleh rakyat melalui PILPRES
3) Masa jabatan presiden selama 5 tahun dan bisa dipilih kembali tanpa ada batas
4) Masa jabatan presiden selama 5 tahun dan bisa dipilih kembali maksimal dua kali masa jabatan
Dari pernyataan di bawah yang merupakan pelaksanaan pemerintah era reformasi ditunjukkan pada nomor …
""", 0),
            Pair("""123. Sistem  pendidikan  di Indonesia sering mengalami perubahan seiring dengan perubahan dan kebutuhan masyarakat.
Kurikulum terakhir yang diterapkan oleh pemerintah adalah …
""", 0)),

        listOf(Pair("""124. Salah satu kebijakan pelaksanaan pemerintahan di Indonesia di era Reformasi adalah diterapkannya pemerintahan Otonomi Daerah.
Dasar Hukum Otonomi Daerah yang menjadi pedoman saat ini adalah
""", 0),
            Pair("""125. Ada beberapa Badan Hukum yang bertugas untuk menangani kasus pelanggaran terhadap peraturan dan perundang-undangan di Indonesia.
Badan hukum independen yang menangani khusus tindak korupsi di Indonesia adalah …
""", 0),
            Pair("""126. Globalisasi membawa pengaruh positif dan negatif dalam kehidupan masyarakat. Contoh pengaruh positif dalam kehidupan, yaitu...""", 0)),

        listOf(Pair("""127. Perhatikan pernyataan berikut
1) perubahan politik dunia
2) terbatasnya media informasi
3) kemajuan dalam bidang teknologi
4) berkembangnya pasar tradisional.
Faktor pendorong globalisasi ditunjukkan oleh angka...
""", 0),
            Pair("""128. Munculnya globalisasi sebenarnya diawali dengan...""", 0),
            Pair("""129. Pergolakan daerah yang terjadi dalam masyarakat dapat memicu disintegrasi sosial, karena...""", 0)),

        listOf(Pair("""130. Setiap hari Sabtu seluruh warga sekolah di SMP Harapan Jaya wajib mengenakan batik. Kebijakan ini ditetapkan untuk mencegah dampak negatif perubahan sosial budaya berupa...""", 0),
            Pair("""131. Sikap meniru gaya hidup masyarakat Barat dapat menyebabkan pudarnya jati diri dan budaya bangsa. Upaya yang tepat untuk mengatasi kondisi tersebut adalah...""", 0),
            Pair("""132. Berikut yang termasuk hubungan antara perubaha sosial dengan perubahan kebudayaan adalah...""", 0)),

        listOf(Pair("""133. Masyarakat tradisional selalu berperilaku sesuai adat istiadat dari para leluhur mereka. Oleh karena itu, mereka menganggap unsur budaya baru dapat merusak budaya daerahnya. Pandangan terhadap budaya baru tersebut menyebabkan masyarakat sulit mengalami perubahan sosial budaya. Kondisi tersebut disebabkan oleh...""", 0),
            Pair("""134. Benua terluas di permukaan bumi adalah...""", 0),
            Pair("""135. Selat Dardanela merupakan salah satu batas pemisah antara...""", 0)),

        listOf(Pair("""136. Sebuah negara yang berada di belahan bumi selatan adalah....""", 0),
            Pair("""137. Cekungan Artesis besar terdapat di bagian tengah Australia. Wilayah tersebut dikenal memiliki...""", 0),
            Pair("""138. Perubahan sosial membawa pengaruh dalam kehidupan masyarakat. Pengaruh tersebut terdiri dari pengaruh besar dan pengaruh kecil. Berikan contoh bentuk perubahan sosial yang berpengaruh kecil terhadap masyarakat...""", 0)),

        listOf(Pair("""139. Perubahan sosial budaya yang diakibatkan oleh perubahan lingkungan di Indonesia banyak sekali. Sebagai negara yang berada di jalur gempa vulkanik dan gempa tektonik, Indonesia tidak luput dari bencana alam. Contoh bentuk perubahan sosial budaya yang diakibatkan oleh perubahan lingkungan alam antara lain adalah...""", 0),
            Pair("""140. Globalisasi membawa dampak perubahan dalam masyarakat, baik dampak positif maupun dampak negatif. Banyak cara untuk menyikapi hal tersebut. Sebagai pelajar, bagaimana cara menyikapi perubahan sosial dan globalisasi....""", 0),
            Pair("""141. Semua proses sosial yang di dalamnya terdapat kendala geografi terhadap pengaturan sosial dan budaya yang semakin surut dan manusia menjadi semakin sadar bahwa pengaturan tersebut menjadi semakin memudar adalah definisi dari...""", 0)),

        listOf(Pair("""142. Amerika memiliki 48 negara bagian yang terletak di daratan utama dan 2 negara bagian yang letaknya terpisah dari daratan utama. Negara bagian yang terpisah dari daratan utama AS dan berbatasan dengan wilayah Kanada, yaitu...""", 0),
            Pair("""143. Inggris memiliki curah hujan yang relatif merata sepanjang tahun. Namun demikian wilayah pantai barat memiliki curah hujan lebih tinggi dibandingkan dengan pantai timur. Curah hujan tertinggi berada di daerah pegunungan. Ada beberapa alasan yang menyebabkan wilayah pantai barat Inggris memiliki curah hujan yang lebih tinggi dibanding dengan wilayah lainnya, antara lain adalah...""", 0),
            Pair("""144. Terusan Suez merupakan sebuah kanal yang menghubungkan Laut Tengah dan Laut Merah. Terusan ini dibuat oleh Insinyur Perancis bernama Ferdinand de Lesseps yang kemudian di nasionalisasi oleh Presiden Mesir Gamal Abdul Naser. Di sebelah barat terusan berbatasan dengan wilayah Mesir, dan di sebelah timur terletak Semenanjung Sinai yang juga merupakan wilayah Mesir dan negera Israel. Terusan Suez memiliki panjang 192 km, dimiliki dan dikelola oleh Republik Arab Mesir. Maksud dari dibangunnya Terusan Suez adalah...""", 0)),

        listOf(Pair("""145. Interaksi keruangan antara negara dapat terjadi di berbagai bidang. Pertukaran pelajar dan mahasiswa antar negara merupakan contoh pengaruh perubahan dan interaksi ruang antar negara terhadap...""", 0),
            Pair("""146. Penduduk dunia terbagi dalam beberapa ras. Secara garis besar penduduk Benua Afrika digolongkan menjadi empat kelompok besar. Salah satunya adalah ras dari keturunan Eropa yang berkulit putih. Ras tersebut bernama...""", 0),
            Pair("""147. Perubahan sosial budaya yang terjadi di masyarakat mencakup beberapa aspek. Berikut ini merupakan ruang lingkup perubahan sosial budaya menurut Kingsley Davis, yaitu...""", 0)),

        listOf(Pair("""148. Salah satu benua yang jumlah penduduknya paling sedikit adalah benua....""", 0),
            Pair("""149. Benua merupakan massa daratan yang sangat luas dan memiliki ciri atau karakteristik tertentu. Ada lima benua yang tersebar diseluruh permukaan bumi, yaitu Benua Asia, Australia, Eropa, Afrika, dan Amerika. Pada masing-masing benua, ada beberapa istilah unik yang menggambarkan ciri benua secara spesifik, seperti memiliki warna identik yang mewakili benua tersebut. Afrika dikenal dengan sebutan "Benua Hitam", dan Asia dikenal dengan "Benua Kuning". Demikian halnya dengan Benua Amerika juga memiliki istilah dengan sebutan "Benua Merah". Alasan utama Benua Amerika disebut Benua Merah adalah....""", 0),
            Pair("""150. Perubahan sosial yang terjadi secara lambat disebut evolusi. Berikan satu contoh terjadinya evolusi....""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Indonesia terletak pada pertemuan tiga lempeng besar bumi yaitu lempeng Indo-Australia, Eurasia, dan lempeng Pasifik","b. Indonesia terletak pada posisi silang antara dua benua dan dua samudera","c. Indonesia dilalui oleh dua rangkaian pegunungan besar dunia yaitu sirkum pasifik dan sirkum mediterania","d. Indonesia terletak pada tiga daerah dangkalan yaitu dangkalan sunda, dangkalan sahul, dan daerah laut pertengahan Australia Asiatis"),
            listOf("a. tepi samudera Hindia sebelah barat Indonesia","b. tepi samudera Hindia sebelah Selatan Indonesia","c. tepi samudera Pasifik sebelah timur Indonesia","d. perairan Nusa Tenggara sebelah utara Indonesia"),
            listOf("a. ex ratio        ","b. life expectancy        ","c. dependency ratio","d. population density")
        ),
        listOf(
            listOf("a. pergerakan orang        ","b. pergerakan barang        ","c. pergerakan teknologi","d. pergerakan informasi"),
            listOf("a. Koersi        ","b. Mediasi        ","c. Toleransi","d. Ajudikasi"),
            listOf("a. ekonomi        ","b. politik        ","c. hukum","d. agama")
        ),
        listOf(
            listOf("a. membangun pondasi-pondasi rumah di pinggiran sungai","b. membangun perumahan sangat sederhana buat penduduk yang perpendapatan rendah","c. melakukan konversi lahan dari persawahan menjadi lokasi perumahan","d. membangun kompleks perumahan rakyat berbentuk rumah susun, apartemen, kondominium, atau pun flat"),
            listOf("a. pada umumnya harga ditentukan oleh kekuatan penawaran","b. permintaan adalah kesediaan penjual untuk menjual berbagai barang/jasa","c. biaya produksi merupakan salah satu faktor yang mempengaruhi penawaran","d. hubungan antara harga dengan permintaan berbanding lurus"),
            listOf("a. memperluas dan meningkatkan hasil produk","b. dapat menjadi sarana penyaluran produk yang efektif","c. memudahkan akses informasi tentang produk yang dibutuhkan","d. meningkatkan produktivitas mesin-mesin dan bahan baku")
        ),
        listOf(
            listOf("a. di perkotaan mengalami kelangkaan sumber daya manusia","b. di pedesaan terjadi permintaan bahan pangan","c. di perkotaan terjadi permintaan sumber daya manusia","d. di pedesaan terjadi penawaran bahan pangan"),
            listOf("a. berburu dan mengumpulkan makanan tingkat sederhana","b. berburu dan mengumpulkan makanan tingkat lanjut","c. bercocok tanam","d. perundagian"),
            listOf("a. Teori Waisya        ","b. Teori Ksatria        ","c. Teori Brahmana","d. Teori Arus Balik")
        ),
        listOf(
            listOf("a. Islam dibawa oleh orang Arab sendiri negara asal dimana Islam lahir dengan alasan mazhab yang dianut sama","b. Islam berkembang di Indonesia disebarkan oleh pedagang asal Persia dengan alasan kesamaan tradisi seperti perayaan hari Asyuro","c. Islam disebarkan oleh orang Arab dengan alasan terdapat permukiman pedagang Arab di Borus, Pantai Barat Sumatera","d. Islam disebarkan oleh pedagang asal Gujarat India dengan alasan ada kesamaan batu nisan Malik al-Saleh dengan batu nisan yang ada di Cambay, Gujarat"),
            listOf("a. Thailand        ","b. Vietnam        ","c. Filipina","d. Myanmar"),
            listOf("a. memperoleh pinjaman modal dengan persyaratan kredit yang lebih mudah dan bunga rendah","b. meningkatkan jumlah produksi barang dengan harga yang sangat tinggi","c. lebih mudah mengekspor barang ke negara tetangga walaupun kualitas barang rendah","d. tidak menghabiskan biaya sama sekali saat mendirikan usaha dan upah tenaga kerja lebih rendah")
        ),
        listOf(
            listOf("a. ekonomi        ","b. sosial        ","c. budaya","d. politik-keamanan"),
            listOf("a. semakin banyak obyek wisata baru yang dikembangkan","b. komunikasi dan kerjasama antar negara semakin mudah","c. pembangunan pusat-pusat perbelanjaan semakin menjamur","d. jarak tidak lagi menjadi penghalang manusia melakukan komunikasi"),
            listOf("a. keadaan ekonomi        ","b. status sosial        ","c. diskriminasi","d. kepribadian")
        ),
        listOf(
            listOf("a. Indonesia dipersatukan semboyan Bhineka Tunggal Ika","b. seseorang yang berpengaruh pada keberhasilan teman-teman lainnya","c. terjadi persaingan yang tidak sehat di dalam masyarakat","d. menimbulkan motivasi yang tinggi pada seseorang untuk maju"),
            listOf("A. 1 dan 2        ","B. 2 dan 3        ","C. 2 dan 4","D. 3 dan 4"),
            listOf("a. Salah satu pihak merupakan kelompok kecil didominasi kelompok besar sehingga gampang dipaksa","b. Kelompok besar yang mendominasi kelompok lainnya yang lebih kecil menyikapi segala perbedaan secara seimbang dan adil","c. Salah satu pihak mengajukan naik banding sebagai bentuk upaya menarik simpati bahwa ia adalah yang paling benar","d. Antar kedua belah pihak yang bersengketa tetap mempertahankan pendapat masing-masing dengan kukuhnya")
        ),
        listOf(
            listOf("a. menggunakan faktor-faktor produksi untuk memproduksi barang/jasa","b. membuka lapangan pekerjaan baru bagi masyarakat yang menganggur","c. menyerahkan faktor produksi seperti alam, tenaga kerja, modal, dan skils","d. menjual hasil produksi berupa barang/jasa kepada konsumen"),
            listOf("a. peningkatan penyediaan alternatif alat pemuas kebutuhan bagi konsumen","b. peningkatan produktivitas","c. perluasan kesempatan kerja bagi masyarakat","d. peningkatan pendapatan daerah"),
            listOf("a. tanah yang rusak dikonversi menjadi lahan pemukiman atau lahan industri","b. memberikan pendampingan, usaha manajemen dan teknologi sehingga petani bertani berteknologi","c. mengubah metode petanian, tanah yang rusak diabaikan kemudian membuka lahan baru","d. tanah yang rusak diperbaiki dengan pendekatan organik dan tanah sempit dibuatkan kluster-kluster")
        ),
        listOf(
            listOf("a. redistribusi vertikal        ","b. redistribusi lambat        ","c. redistribusi horizontal","d. redistribusi cepat"),
            listOf("a. menjalin mitra dagang untuk memperjualbelikan rempah-rempah","b. melaksanakan semboyan Kekayaan, Kejayaan, dan Penyebaran agama","c. menolong keterpurukan dan keterbelakangan bangsa timur termasuk Indonesia","d. mencari dukungan politik karena jatuhnya Konstantinopel atas Dinasti Utsmani Turki"),
            listOf("a. pendapatan rakyat meningkat disebabkan harga pembelian dari pedagang Belanda lebih tinggi","b. pedagang asal pribumi lebih leluasa menentukan harga penjualan rempah-rempah kepada VOC","c. rakyat menjadi menderita disebabkan kebebasan berdagangnya dikekang VOC","d. rakyat lebih sejahtera akibat perjanjian-perjanjian yang telah disepakati antara raja dan VOC")
        ),
        listOf(
            listOf("a. peperangan yang terjadi antara Belanda dan rakyat pribumi","b. kehilangan lahan pertanian untuk menanam tanaman pangan","c. pemerasan yang dilakukan oleh pegawai pemerintah kolonial","d. harga beras melambung serta mengalami gagal panen akibat serangan hama belalang"),
            listOf("a. (1) dan (2)        ","b. (1) dan (3)        ","c. (2) dan (4)","d. (3) dan (5)"),
            listOf("a. Laut Cina Selatan di sebelah Selatan","b. Samudera Atlantik di bagian Selatan","c. Laut Cina Selatan di sebelah Utara","d. Samudera Atlantik di bagian utara")
        ),
        listOf(
            listOf("a. Amerika Selatan        ","b. Amerika Utara        ","c. Amerika Tengah","d. Kepulauan Karibia"),
            listOf("a. pegunungan        ","b. dataran rendah        ","c. dataran tinggi","d. gunung"),
            listOf("a. dataran pantai sebelah barat Asutralia","b. dataran pantai sebelah timur Asutralia","c. dataran rendah tengah sebelah barat Asutralia","d. plato bagian timur Australia")
        ),
        listOf(
            listOf("a. pasokan pangan terbatas","b. tingkat pendidikan penduduk rendah","c. keinginan memiliki anak rendah","d. perkembangan teknologi sangat maju"),
            listOf("a. angka kematian anak menurun","b. munculnya budaya yang sangat tertutup","c. arus migrasi masuk ke Afrika tinggi","d. rawan bencana kelaparan dan wabah penyakit"),
            listOf("a. (1), (2), dan (3)        ","b. (1), (2), dan (4)        ","c. (2), (3), dan (5)","d. (3), (4), dan (5)")
        ),
        listOf(
            listOf("a. (1), (2), dan (3)        ","b. (1), (2), dan (4)        ","c. (2), (3), dan (5)","d. (3), (4), dan (5)"),
            listOf("a. menutup diri dari budaya barat","b. membiarkan masyarakat bergaya hidup kebarat-baratan","c. memupuk sikap nasionalisme serta meminimalisasi dampak negatif westernisasi","d. membuka ruang seluas-luasnya pada budaya-budaya barat untuk menjadi bagian dan modernisasi"),
            listOf("a. Menggunakan alat transportasi modern untuk meraih status sosial yang lebih tinggi","b. Memanfaatkan alat transportasi di setiap ada perjalanan atau sedang bepergian","c. Menggunakan alat transportasi lokal kemanapun akan bepergian agar tidak boros","d. Menggunakan alat transportasi lokal pada waktu tertentu supaya budaya lokal tetap lestari")
        ),
        listOf(
            listOf("a. 1), 2), dan 3)       ","b. 1), 2), dan 4)        ","c. 2), 3), dan 5)","d. 3), 4), dan 5)"),
            listOf("a. (1), (2), dan (3)        ","b. (1) dan (3)        ","c. (2) dan (4)","d. (4)"),
            listOf("a. (1)                ","b. (2)                ","c. (3)","d. (4)")
        ),
        listOf(
            listOf("a. memproduksi barang sebanyak-banyaknya","b. mengeksplorasi sumber daya alam untuk keunggulan ekonomi","c. mengimpr barang sebanyak-banyaknya","d. melakukan spesialisasi dan efisiensi dalam memproduksi barang"),
            listOf("a. terbuka lapangan pekerjaan baru dan pada jenis yang lebih beragam","b. peningkatan pembangunan sarana dan prasarana transportasi","c. perhatian orang tua terhadap pendidikan anak-anaknya semakin tinggi","d. terjadi peningkatan pendapatan dalam keluarga"),
            listOf("a. meningkatkan harga jual produk lokal di pasar Asia Tenggara","b. meminimalisasi hambatan dalam kerja sama ekonomi antarnegara ASEAN","c. mewujudkan perdamaian dan kestabilan politik di Asia Tenggara","d. mengatasi masalah sengketa perbatasan wilayah Asia Tenggara")
        ),
        listOf(
            listOf("a. pengunaan bahasa Inggris sebagai bahasa internasional","b. kesepakatan negara-negara di dunia menjalankan perdagangan bebas","c. penyelenggaraan kejuaraan olahraga dunia seperti Olimpiade","d. berkomunikasi menggunakan media sosial facebook dan instagram"),
            listOf("a. dalam dunia pendidikan pemerintah mulai membuka sekolah teknik untuk mengejar ketertinggalan","b. dalam bidang seni dan budaya terjadi upaya dominasi oleh PKI","c. dalam bidang kesenian banyak muncul lagu bertemakan nasionalisme","d. dalam bidang sosial sudah mampu memperbaiki kesejahteraan rakyat"),
            listOf("a. mendorong jumlah ekspor dan menekan jumlah impor","b. menurunkan daya beli masyarakat terhadap barang dalam negeri","c. mendorong konsumsi barang impor untuk kesejahteraan masyarakat","d. meningkatkan jumlah uang yang beredar di masyarakat")
        ),
        listOf(
            listOf("a. pemerintah melakukan penyederhanaan dan fusi partai-partai politik menjadi tiga partai saja","b. pemulihan hubungan dengan Malaysia melalui perundingan Bangkok pada tanggal 29 Mei – 1 Juni 1966","c. penghapusan Dwi Fungsi ABRI supaya berkonsentrasi hanya pada fungsi pertahanan dan keamanan saja","d. kembali menjadi anggota PBB setelah sempat keluar ketika terjadi konflik dengan Malaysia"),
            listOf("a. menuntut reformasi di Indonesia","b. menuntut agar Tritura di penuhi","c. menuntut pembubaran Negara Pasundan","d. menuntut RUU dan RKUHP yang bermasalah dicabut"),
            listOf("a. Devisa        ","b. Valas        ","c. Kurs","d. Ovener")
        ),
        listOf(
            listOf("a. Kuota Import","b. Perdagangan bebas","c. Proteksi","d. Politik dumping"),
            listOf("a. Adanya alih teknologi","b. Terpenuhinya kebutuhan dalam negeri","c. Perusahaan dalam negeri terancam bangkrut,sebab kalah bersaing","d. Meningkatkan hubungan antar Negara"),
            listOf("a. Politik pintu terbuka        ","b. Politik bebas aktif","c. Politik etis","d. Politik Dumping")
        ),
        listOf(
            listOf("a. Defisit       ","b. Berimbang ","c. Surplus        ","d. Rugi"),
            listOf("a. Valuta asing        ","b. Kurs        ","c. Devisa","d. Saham"),
            listOf("a. Pemanfaatan kreativitas dan ketrampilan","b. Emosi Individu","c. Kerja kelompok","d. Dukungan pemerintah.")
        ),
        listOf(
            listOf("a. Tari Piring       ","b. Rendang Padang        ","c. Rumah joglo","d. Ukir Jepara."),
            listOf("a. Besi Baja","b. Aluminium","c. Bambu,tanah liat dan kayu.","d. Batu – batuan."),
            listOf("a. Berbasis pada ide atau gagasan","b. Konsep yang dibangun bersifat kreatif","c. Pengembangan tidak terbatas dalam berbagai bidang usaha","d. Selalu mendapat kucuran dana dari Bank")
        ),
        listOf(
            listOf("a. Lembaga Industri kecil dan menengah","b. Dewan kerajinan Nasional","c. Asosiasi Industri Kreatif Indonesia","d. Badan Ekonomi Kreatif."),
            listOf("a. Software","b. Kartun Animasi","c. Riset dan pengembangan","d. Kerajinan"),
            listOf("a. Berkembangnya kreatifitas","b. Sumber Daya Manusia tidak berkembang","c. Perubahan pola pikir ekonomi era modern ini yang dulunya berbasis sumber daya alam beralih ke sumber daya manusia","d. Perkonomian global mengalami perubahan")
        ),
        listOf(
            listOf("a. Sangkuriang","b. Bandung bondowoso        ","c. Bettle of Surabaya","d. Upin – ipin."),
            listOf("a. Keindahan alamnya","b. Terdapat beraneka ragam budaya","c. Masyarakat Bali memadukan unsur keindahan alam dan budaya ","d. Di bali banyak terdapat hotel mewah."),
            listOf("a. 1, 2 dan 3        ","b. 2, 3 dan 4        ","c. 3, 4 dan 6","d. 4, 5 dan 6")
        ),
        listOf(
            listOf("a. Permasalahan sosial di daerah – daerah di Indonesia yang paling mengemuka adalah masalah tenaga kerja.","b. Pulau Bali adalah kekuatan ekonomi baru yang bersifat ekslusif dan banyak dilirik investor","c. Kerjasama yang erat diberbagai bidang antar wilayah yang erat diantara sesama pemimpin daerah dapat mengantarkan pertumbuhan ekonomi yang tinggi pula","d. Pluralitas tumbuh dan berkembang atas dasar ketidakadilan ekonomi dunia."),
            listOf("a. 48,556 %        ","b. 48,246 %        ","c. 48,155 %","d. 48, 098 %"),
            listOf("a. 2008 – 2009        ","b. 2009 – 2010        ","c. 2010 - 2011","d. 2011 – 2012")
        ),
        listOf(
            listOf("a. Chatting        ","b. Browshing        ","c. Online Shop","d. Buying"),
            listOf("a. Indonesia dan Thailand sama – sama memiliki keunggulan komparatif","b. Indonesia lebih deferiansial dalam hal keunggulan komparatif dengan Negara Thailand","c. Indonesia dan Thailand sama – sama penghasil beras yang unggul","d. Indonesia dan Thailand sama – sama seius mengolah sektor pertanian."),
            listOf("a. Eksploitasi ekonomi, pudarnya identitas kebudayaan dan ancaman fisik lingkungan.","b. Kejahatan lintas Negara semakin meningkat","c. Indonesia mendapatkan subsidi dari Negara – Negara asing untuk merawat sector kehutanan","d. Pemerintah menjadi sering mengeluarkan kebijakan terkait perdagangan bebas")
        ),
        listOf(
            listOf("a. Adam Smith","b. David Richardo","c. Karl Max","d. Drs Muhammad Hatta"),
            listOf("a. Memperbanyak faktor – faktor produksi dan menambah utang luar negeri","b. Melakukan spesialisasi dan efisiensi dalam memproduksi barang.","c. Meningkatkan eksploitasi sumber - sumber mineral yang telah ada","d. Mendatangkan investor asing sebanyak – bnyaknya."),
            listOf("a. 1), 2) dan 3)        ","b. 2), 3) dan 4)        ","c. 3), 4) dan 1)","d. 4), 1) dan 2)")
        ),
        listOf(
            listOf("a. Indonesia adalah pasar potensial atas produk – produk asing .","b. Kualitas barang dan harga barang yang murah","c. Sumber daya alam dan sumber daya manusia yang banyak","d. Keamanan dalam negeri yang kondusif"),
            listOf("a. Tari tor tor","b. Tari saman","c. Tari piring","d. Wisata alam danau toba"),
            listOf("a. Pelabuah aceh        ","b. Selat makasar        ","c. Selat malaka","d. Selat bali")
        ),
        listOf(
            listOf("a. Jawa        ","b. Nusa Tenggara        ","c. Kalimantan","d. Maluku"),
            listOf("a. Jakarta         ","b. Semarang        ","c. Bandung","d. Surabaya"),
            listOf("a. Kawasan pembangunan ekonomi terpusat","b. Kawasan pembangunan ekonomi terpadu","c. Kawasan otoritas","d. Kawasan sinergitas")
        ),
        listOf(
            listOf("a. Meningkatkan pendapatan asli daerah","b. Meratakan penduduk","c. Menseimbangkan antara pertumbuhan ekonomi dengan pertumbuhan penduduk","d. Mengurangi kriminalitas."),
            listOf("a. 1 ( satu )        ","b. 2 ( dua )        ","c. 3 ( tiga )","d. 4 ( empat"),
            listOf("a. Industri manufaktur","b. Industri logam dan semen","c. Industri konveksi","d. Industri pengolahan limbah")
        ),
        listOf(
            listOf("a.  pemerintah berkewajiban penuh mengatur sistem perdagangan","b.  bea Cukai tidak berfungsi lagi","c.  tidak ada regulasi / kebijakan bea keluar masuk suatu barang","d.  Bea Cukai tidak berfungsi lagi"),
            listOf("a. perbedaan  sumber daya alam","b. persamaan selera masyarakat","c. perbedaan IPTEK ","d. persamaan selera"),
            listOf("a. Mendapatkan tenaga ahli dari luar negeri","b. Mendapatkan pemasukan berupa devisa","c. Memperluas produk dalam negeri","d. Memperluas lapangan pekerjaan")
        ),
        listOf(
            listOf("a. Dumping","b. Subsidi","c. Proteksi","d. Quota"),
            listOf("a. Menurunkan bea Ekspor","b. Menaikkan bea Impor","c. Menurunkan bea Impor","d. Menaikkan bea Ekspor"),
            listOf("a. pengusaha minyak bumi","b. industri tekstil","c. pemilik SPBU","d. UMKM")
        ),
        listOf(
            listOf("a. Berbasis kepada sumber daya yang terbarukan","b. Menciptakan iklim usaha penuh persaingan","c. Membangun citra dan identitas bangsa","d. Memberikan dampak sosial yang positif"),
            listOf("a. Mampu mengumpulkan sumber daya","b. Mampu membuka lapangan kerja","c. Mampu membuat produk baru","d. Mampu menangkap peluang"),
            listOf("a. 1, 2, dan 3","b. 1, 2, dan 4","c. 2, 4, dan 5","d. 2, 5, dan 6")
        ),
        listOf(
            listOf("a. Jakarta memiliki keunggulan mutlak dalam hal produksi sandal dibandingkan Surabaya","b. Surabaya memiliki keunggulan mutlak dalam hal produksi sandal dibandingkan Jakarta","c. Pakaian di Jakarta lebih mahal daripada di Surabaya ","d. Pakaian di Surabaya lebih mahal daripada Jakarta"),
            listOf("a. Hanya menjual rempah-rempah di dalam negeri ","b. Mengimpor rempah-rempah dari negara lain","c. Mengekspor rempah-rempah ke  Eropa","d. Menjual rempah-rempah ke negara Asia  "),
            listOf("a. Mengurangi resiko perdagangan","b. Meningkatkan devisa negara","c. Menurunkan biaya produksi","d. Memperluas pasar ekspor")
        ),
        listOf(
            listOf("a. Jumlah wirausahawan daerah menurun","b. Jumlah angkatan kerja meningkat","c. Lapangan kerja daerah meningkat","d. Upah minimum provinsi menurun"),
            listOf("a. Sektor pertambangan di luar pulau Jawa berkembang pesat","b. Penerimaan pemerintah dari sektor  pajak bertambah","c. Waktu perindustrian barang lebih cepat dan efisien","d. Persebaran tenaga kerja merata di setiap daerah"),
            listOf("a. Sulawesi Selatan","b. Bali","c. Aceh","d. Papua ")
        ),
        listOf(
            listOf("a. menghasilkan solar industri berkualitas tinggi","b. memenuhi kebutuhan ekspor minyak dunia","c. menghasilkan aspal bagi pembangunan","d. menjaga pasokan BBM daerah industry"),
            listOf("a. Meningkatkan pajak masuk barang","b. Menurunkan bahan baku produksi","c. Menetapkan standar hasil produksi","d. Menentukan kuota impor barang"),
            listOf("a. 1), 2), dan 3)","b. 1), 2), dan 4)","c. 2), 3), dan 5)","d. 3), 4), dan 5)")
        ),
        listOf(
            listOf("a. daya saing tenaga kerja","b. jumlah angkatan kerja","c. jumlah tenaga kerja","d. upah tenaga kerja"),
            listOf("a. 1) dan 2)","b. 3) dan 4)","c. 1) dan 3)","d. 2) dan 4)"),
            listOf("a. 1)","b. 2)","c. 3)","d. 4)")
        ),
        listOf(
            listOf("a. Mempersiapkan pemerintahan Repulblik Indonesia","b. Mempersiapkan rakyat dalam melucuti tentara Jepang","c. Memperkuat pertahanan rakyat dengan senjata seadanya","d. Meyakinkan rakyat bahwa pemimpinnya masih berwibawa"),
            listOf("a. 1)","b. 2)","c. 3)","d. 4)"),
            listOf("a. Kahar Muzakar","b. Daud Beureueh","c. Sukirman Radjiman Kartosuwiryo","d. Ibnu Hajar")
        ),
        listOf(
            listOf("a. 1) dan 3)","b. 3) dan 4)","c. 1) dan 4)","d. 2) dan 4)"),
            listOf("a.  Presiden","b. anggota DPR","c. anggota Konstituante","d. anggota Kabinet"),
            listOf("a. Konstituante merupakan forum musyawarah yang demokratis","b. Anggota kontituante tidak memiliki ide atau gagasan tentang Undang-Undang Dasar yang baru","c. Karena badan konstituante bukan termasuk badan legislatif sehingga tidak mempunyai kewenangan membuat UUD ","d. Karena anggota badan konstituante tidak dipilih oleh rakyat secara langsung dalam pemilihan umum")
        ),
        listOf(
            listOf("a. 1)","b. 2)","c. 3)","d. 4)"),
            listOf("a. 1), 2) dan 3)","b. 2), 3) dan 4)","c. 1), 3) dan 4)","d. 1), 2) dan 4)"),
            listOf("a. Kembali kepada UUD 1945","b. Pemulihan politik luar negeri bebas aktif","c. Menjadi pelopor berdirinya ASEAN","d. Melaksanakan Pemilihan Umum")
        ),
        listOf(
            listOf("a. Ali sastro Amijoyo","b. Hamengkubuwono ke IX","c. Soedarmono","d. Adam Malik"),
            listOf("a. Sebagai anggota baru","b. Menjadi tuan rumah dalam setiap kegiatan ASEAN","c. Sebagai pelopor sekaligus penggagas berdirinya ASEAN","d. Mengikuti dalam setiap Konferensi Tingkat Tinggi (KTT) ASEAN"),
            listOf("a. Amanat Penderitaan Rakyat","b. Tragedi Tri Sakti","c. Reformasi","d. Revolusi ")
        ),
        listOf(
            listOf("a. Banyaknya oknum yang melakukan korupsi","b. Pelaksanaan pemilihan umum","c. Kekerasan militer terhadap rakyat sipil","d. Kebebasan pers tidak dilindungi"),
            listOf("a. Krisis moneter dunia","b. Banyak terjadi kasus KKN","c. Terbelenggunya Pers","d. Sudah terlalu lama memerintah"),
            listOf("a. Masa demonstrasi seluruh rakyat","b. Membersihkan penyimpangan terhadap pancasila dan UUD 1945","c. Pemerintahan baru yang berdasar pancasila dan UUD 1945","d. Kembali kepada tatanan yang sudah ada")
        ),
        listOf(
            listOf("a. BJ. Habibi","b. Susilo Bambang Yudoyono","c. KH. Abdurrahman Wakhid","d. Megawati Sukarno Putri"),
            listOf("a. 1) dan 2)","b. 3) dan 4)","c. 1) dan 3)","d. 2) dan 4)"),
            listOf("a. Kurikulum Berbasis Kompetensi (KBK) 2004","b. Kurikulum Tingkat Satuan Pendidikan (KTSP) ","c. Kurikulum Tingkat Satuan Pendidikan 2013 (K-13)","d. Kurikulum Tingkat Satuan Pendidikan 2017 (K-17)")
        ),
        listOf(
            listOf("a. UU No. 32 Tahun 2004 tentang Pemerintahan Daerah.","b. UU No. 32 Tahun 2014 tentang Pemerintahan Daerah.","c. UU No. 33 Tahun 2014 tentang Perimbangan Keuangan Antara Pemerintah Pusat dan Pemerintah Daerah.","d. UU No. 23 Tahun 2014 tentang Pemerintah Daerah"),
            listOf("a. Kejaksaan ","b. Pengadilan Negeri","c. Komisi Pemberantasan Korupsi (KPK)","d. Mahkamah Agung"),
            listOf("a. masyarakat cenderung mementingkan pekerjaan daripada mengikuti kegiatan sosial","b. masyarakat menyyukai makan di restoran cepat saji daripada masak sendiri","c. masyarakat berburu barang diskonan di mal pada akhir pekan","d. masyarakat membayar tagihan listrik, air dan pulsa dengan sistem daring")
        ),
        listOf(
            listOf("A. 1) dan 3)        ","B. 1) dan 2)        ","C. 2) dan 3)","D. 3) dan 4)"),
            listOf("a. penjajahan bangsa Eropa","b. lembaga dunia seperti IMF dan Bank Dunia","c. berkembangnya ilmu pengetahuan dan teknologi","d. perdagangan masyarakat Tiongkok dan India"),
            listOf("a. disintegrasi merupakan wujud dari perpecahan","b. pergolakan daerah terjadi dari rasa ketidakpuasan","c. disintegrasi dapat mendorong terjadinya pergolakan daerah","d. pergolakan daerah dapat memicu sentimen kedaerahan dan kekacauan")
        ),
        listOf(
            listOf("a. kesenjangan sosial","b. disintegrasi sosial","c. pergeseran nilai dan norma sosial","d. lunturnya budaya nasional"),
            listOf("a. memanfaatkan teknologi sesuai perkembangan zaman","b. mengenal berbagai kebudayaan dari negara lain","c. menerima kebudayaan Barat secara terbuka","d. memilih kebudayaan yang sesuai dengan kepribadian bangsa"),
            listOf("a. perubahan sosial diikuti oleh perubahan kebudayaan","b. perubahan kebudayaan diikuti oelh perubahan sosial","c. perubahan kebudayaan sama dengan perubahan sosial","d. perubahan sosial tidak selalu diikuti oleh perubahan kebudayaan")
        ),
        listOf(
            listOf("a. kebiasaan yang telah mengakar","b. sikap tradisional masyarakat","c. prasangka terhadap hal baru","d. adanya kepentingan yang tertanam kuat"),
            listOf("a. Asia        ","b. Afrika","c. Amerika","d. Eropa"),
            listOf("a. Afrika dan Eropa","b. Afrika dan Asia","c. Asia dan Eropa","d. Eropa Barat dan Eropa Utara")
        ),
        listOf(
            listOf("a. Australia        ","b. Afrika","c. Asia","d. Amerika"),
            listOf("a. padang pasir terluas di Australia","b. padang rumput kualitas terbaik","c. tambang emas terluas dibumi","d. batu kerikil terbesar di dunia"),
            listOf("a. perubahan sistem pendidikan","b. perubahan teknologi","c. perubahan gaya berpakaian","d. industrialisasi")
        ),
        listOf(
            listOf("a. runtuhnya terowongan di tambang batubara","b. gempa vulkanik dan gunung Merapi meletus di Yogyakarta","c. kebakaran hutan di Kalimantan dan Riau","d. bencana jatuhnya pesawat yang terjadi di Bali"),
            listOf("a. berpegang teguh pada nilai keimanan dan meningkatkan motif berprestasi","b. memanfaatkan semua alat komunikasi canggih yang diimport dari luar negeri","c. menerima dengan tangan terbuka semua infromasi dari luar negeri","d. meninggalkan alat transportasi lokal karena sudah ketinggalan zaman"),
            listOf("a. asimilasi        ","b. akulturasi        ","c. globalisasi","d. modernisasi")
        ),
        listOf(
            listOf("a. California        ","b. Alaska        ","c. Kansas","d. Oklahoma"),
            listOf("a. pantai barat banyak terdapat hutan bakau yang lebat yang memengaruhi curah hujan","b. pantai barat mendapat sinar matahari lebih banyak sehingga suhunya naik","c. posisi pantai barat Inggris yang menghadap samudera Atlantik","d. secara astronomis Inggris dilalui oleh garis bujur nol derajat sebagai titik utama pembagian garis bujur barat dan garis bujur timur"),
            listOf("a. memisahkan benua Asia dan benua Afrika","b. mempersingkat waktu tempuh antara laut antara laut tengah dengan samudera Hindia","c. mengembangkan pertumbuhan ekonomi di wilayah Eropa","d. mengembangkan pertumbuhan ekonomi mesir melalui pariwisata bahari")
        ),
        listOf(
            listOf("a. budaya        ","b. sosial        ","c. politik","d. pendidikan"),
            listOf("a. Kaukasoid        ","b. Negroid        ","c. Pygmy","d. Semit"),
            listOf("a. perubahan sosial budaya meliputi struktur dan fungsi masyarakat","b. perubahan sosial budaya meliputi unsur-unsur kebudayaan materiil dan immateriil","c. perubahan sosial merupakan bagian dari perubahan kebudayaan. Perubahan dalam kebudayaan mencakup hal-hal seperti kesenian, ilmu pengetahuan, dan teknologi, dan filsafat","d. perubahan sosial budaya mencakup semua aspek kehidupan masyarakat")
        ),
        listOf(
            listOf("a. Afrika        ","b. Amerika        ","c. Asia","d. Australia"),
            listOf("a. benua Amerika merupakan negara penghasil apel merah yaitu red Washington","b. penduduk Benua Amerika banyak yang mencat merah rambutnya","c. di Benua Amerika terdapat suku Indian yang selalu mencat merah kulitnya","d. benua Amerika memiliki tanah merah yang sangat luas"),
            listOf("a. dahulu peran tenaga kerja manusia sedikit demi sedikit mulai digantikan dengan teknologi mesin dan robot","b. dahulu komunikasi dengan memukul kentongan sekarang komunikasi tetap memakai kentongan karena unik","c. dahulu sudah ada akses internet tetapi tidak dipakai karena pemborosan, baru akhir-akhir orang menggunakan internet","d. dahulu orang-orang bepergian berjalan kaki atau bersepeda sekarang tetap berjalan kaki dan bersepeda dengan alasan olahraga")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(1,2,0),
        listOf(3,1,2),
        listOf(3,2,1),
        listOf(3,1,3),
        listOf(3,0,0),
        listOf(3,1,2),
        listOf(1,0,1),
        listOf(2,1,3),
        listOf(2,1,2),
        listOf(3,0,2),
        listOf(0,1,1),
        listOf(2,0,1),
        listOf(2,2,3),
        listOf(3,1,1),
        listOf(3,1,0),
        listOf(1,0,0),
        listOf(2,0,2),
        listOf(3,2,3),
        listOf(0,1,0),
        listOf(3,2,3),
        listOf(3,1,2),
        listOf(2,2,2),
        listOf(2,1,1),
        listOf(2,1,0),
        listOf(1,1,1),
        listOf(2,3,2),
        listOf(2,0,1),
        listOf(2,1,1),
        listOf(2,2,0),
        listOf(0,1,3),
        listOf(1,1,3),
        listOf(1,2,1),
        listOf(2,2,1),
        listOf(3,2,1),
        listOf(2,3,1),
        listOf(0,2,0),
        listOf(2,1,1),
        listOf(2,2,1),
        listOf(3,2,1),
        listOf(0,1,3),
        listOf(2,3,2),
        listOf(3,2,3),
        listOf(0,2,1),
        listOf(3,3,1),
        listOf(2,0,2),
        listOf(0,1,2),
        listOf(0,0,2),
        listOf(1,2,1),
        listOf(3,0,2),
        listOf(3,2,0)






    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas9, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIps.scoreIpsKelas9 < 1) 0 else scoreManagerIps.scoreIpsKelas9 / 5
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
            val getData = soalIpssd9[jawabanBenar6][i]
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

                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas9
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpssd9.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas9 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas9 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd9[jawabanBenar6][i]
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