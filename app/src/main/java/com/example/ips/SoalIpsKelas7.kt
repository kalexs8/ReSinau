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


class SoalIpsKelas7 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpssd7: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Kelangkaan merupakan inti masalah ekonomi yang salah satunya memaksa manusia untuk melakukan pilihan dalam hidupnya baik secara individual maupun kolektif yang disebabkan oleh….
""", 0),
            Pair("""2. Indonesia adalah sebuah negara yang kaya akan sumber daya alam, bahkan pada tahun 90-an Indonesia sempat mendapatkan penghargaan swasembada pangan. Swasembada pangan merupakan kondisi dimana Indonesia mampu memenuhi kebutuhan seluruh masyarakatnya tanpa harus melakukan impor. Namun saat ini, Indonesia harus melakukan impor untuk memenuhi kebutuhan seluruh masyarakatnya yang semakin banyak. 
Dari ilustrasi di bawah, maka terjadinya kelangkaan disebabkan oleh faktor….
""", 0),
            Pair("""3. Berikut ini adalah faktor-faktor yang mempengaruhi permintaan dan penawaran:
1) harga barang itu sendiri
2) teknologi
3) gaji pegawai
4) pendapatan
5) tradisi/budaya
Faktor yang mempengaruhi penawaran adalah….        
""", 0)),

        listOf(Pair("""4. Terbatasnya jumlah bawang putih dan cabe akhir – akhir ini  yang ada membuat harga ke dua barang tersebut  menjadi tinggi. Tingginya harga bawang putih dan cabe  sangat berdampak besar dalam kehidupan masyarakat salah satu akibatnya adalah membuat semua produk yang berkaitan dengan bawang dan cabe  menjadi ikut melambung. 
Cara mengatasi permasalahan tersebut adalah….
""", 0),
            Pair("""5. Bapak Rudi berniat memiliki usaha tenun batik, batiknya telah banyak terkenal di masyarakat namunmasih belum mampu mencapai daerah yang terlalu jauh sebab sulitnya transportasi dari daerahnya untuk mencapai daerah-daerah lain.
Pokok permasalahan ekonomi klasik yang dialami oleh bapak Rudi adalah….
""", 0),
            Pair("""6. Berikut ini yang bukan Kebutuhan menurut tingkat kegunaannya adalah … .
""", 0)),

        listOf(Pair("""7. Kebutuhan minimal sehari – hari yang harus dipenuhi apabila diabaikan menyebabkan terganggunya kelangsungan hidup  ... .
""", 0),
            Pair("""8. Prinsip ekonomi dapat diterapkan pelajar dalam kehidupan sehari – hari seperti ... .
""", 0),
            Pair("""9. Dalam membuat satu Lemari seharusnya Budi membutuhkan modal Rp. 1.000.000,-. Tetapi dia mempu menghemat modal sehingga hanya menghabiskan modal Rp. 800.000,- . Jadi Budi menghemat modal Rp. 200.000,- untuk setiap produksi satu lemari. 
Hal yang dilakukan Budi adalah kegiatan ekonomi yang ...
""", 0)),

        listOf(Pair("""10. Makelar merupakan Pedagang perantara yang bekerja atas nama...""", 0),
            Pair("""11. Sejumlah barang yang dibeli atau diminta pada suatu harga dan kurun waktu tertentu adalah makna dari ….
""", 0),
            Pair("""12. Rina adalah seorang karyawan suatu perusahaan swasta. Pada suatu hari, lingkungan di sekitar tempat tinggalnya mengalami bencana banjir. Oleh karena itu, Rina menyisihkan sebagian gajinya untuk disumbangkan kepada para korban bencana.
Tindakan yang dilakukan Rina ini termasuk motif ...
""", 0)),

        listOf(Pair("""13. Harga sering digunakansebagai indikator kelangkaan antara lain dapat dilihat dari … .
""", 0),
            Pair("""14. Pernyataan yang tepat terkait dengan kebutuhan ... .
""", 0),
            Pair("""15. Agar kelangkaan suatu barang tidak terjadi maka cara yang efektif untuk dilakukan terhadap sumber daya alam yang belum termanfaatkan adalah ... .
""", 0)),

        listOf(Pair("""16. Perhatikan pernyataan brerikut ini
1)  Agama
2)  pendidikan dan kesenian
3)  kasih sayang dan pujian
4).Belanja di pasar
Kebutuhan rokhani atau kebutuhan immaterial adalah kebutuhan yang pemenuhannya bertujuan untuk memberikan kepuasan pada  jiwa,hati sanubari  ditunjukkan pada nomer
""", 0),
            Pair("""17. Pasar merupakan sarana paling tepat untuk ajang promosi. Pelaksanaan promosi dapat dilakukan dengan cara …
""", 0),
            Pair("""18. Ilmu dipandang sebagai produk, proses dan paradiga Ilmu dipandang sebagai proses karena … .
""", 0)),

        listOf(Pair("""19.Perkembangan ilmu pengetahuan dan teknologi yang demikian pesat telah membawa manfaat luar besar bagi  kemajuan peradaban umat manusia misalnya … .
""", 0),
            Pair("""20.Sekarang ini jumlah pengguna Internet di Indonesia menurut data menkoinfo adalah 160 juta orang. Ini berarti … .
""", 0),
            Pair("""21.Dampak negative perkembangan ilmu pengetahuan dan teknologi bagi manusia adalah … .
""", 0)),

        listOf(Pair("""22.Akibat dari kemajuan ilmu pengetahuan dan teknologi . Kualifikasi tenaga kerja dan jumlah tenaga kerja yang dibutuhkan akan mengalami perubahan yang cepat. Dan akibatnya, adalah … .
""", 0),
            Pair("""23.Sikap seorangkreatif yang benar dari pernyataan berikut ini adalah … .
""", 0),
            Pair("""24.Jas hujan akan berguna pada waktu musim hujan. Contoh tersebut sesuai dengan kegunaan.....""", 0)),

        listOf(Pair("""25. Kemakmuran adalah … .
""", 0),
            Pair("""26. Banyak kata atau istilah yang diambil dari bahasa asing termasuk dalam mata pelajaran IPS (Ilmu Pengetahuan Sosial), salah satunya adalah kata Ekonomi yang diambil dari Bahasa Yunani yakni Oikonomia. Kata Oikonomia artinya adalah ....""", 0),
            Pair("""27. Masalah ekonomi muncul karena adanya kebutuhan manusia yang terbatas, sedangkan  alat  pemuas  kebutuhan  yang  berupa  barang  dan  jasa  terbatas adanya. Ketidakseimbangan antara  kebutuhan dan ketersediaan alat pemuas kebutuhan itu disebut .…
""", 0)),

        listOf(Pair("""28. Kebutuhan yang harus dipenuhi karena bila tidak dipenuhi akan mempengaruhi kelangsungan hidup disebut kebutuhan ….
""", 0),
            Pair("""29. Orang sakit meminum obat, agar sakitnya cepat sembuh. Hal ini menunjukkan salah satu kebutuhan manusia menurut …. 
""", 0),
            Pair("""30. Setiap orang memiliki perbedaan, salah satunya dalam hal konsumsi makanan. Ervina lebih suka rumbah dibandingkan dengan Fanesya yang lebih menyukai seblak.  Hal ini menunjukkan perbedaan....                                                                                                """, 0)),

        listOf(Pair("""31. Pakaian nelayan di Karangsong lebih tipis dibandingkan dengan pakaian orang yang tinggal di pegunungan. Perbedaan jenis pakaian ini menunjukkan bahwa kebutuhan manusia berbeda karena adanya perbedaan faktor ....""", 0),
            Pair("""32. Untuk mendapatkan air mineral dibutuhkan pengorbanan yang tidak sedikit, seperti membangun pabrik di daerah yang dekat dengan sumber mata air, distribusi dari pabrik yang berada di pegunungan ke konsumen dan lain-lain. Air mineral merupakan salah satu contoh dari barang ….
""", 0),
            Pair("""33. Perhatikan macam-macam barang berikut ini
1) Tas
2) Air Mineral 
3) Sinar Matahari
4) Pakaian 
5) Udara   
Barang bebas ditunjukkan dengan nomor ....
""", 0)),

        listOf(Pair("""34. Jika di rumah seorang ibu tidak masak nasi lalu diganti dengan menyediakan singkong goreng, maka hal tersebut merupakan salah satu contoh dari barang .…
""", 0),
            Pair("""35. Biasanya saat menggunakan sepatu maka harus menggunakan kaos kaki untuk menghindari kaki lecet dan bau. Dalam hal ini kaos kaki merupakan salah satu contoh dari barang ....""", 0),
            Pair("""36. Tingkat  konsumsi   seseorang  dapat   dipengaruhi oleh harga barang yang dikonsumsi. Jika harga barang-barang yang dikonsumsi naik, maka seseorang akan …. 
""", 0)),

        listOf(Pair("""37. Seorang pengusaha dodol mangga memanfaatkan mangga yang tidak tahan lama untuk diolah kembali menjadi barang yang memiliki harga jual lebih tinggi. Hal tersebut merupakan salah satu kegiatan menghasilkan barang/jasa atau kegiatan menambah nilai guna barang/jasa yang disebut dengan….
""", 0),
            Pair("""38. Pengusaha kerupuk memanfaatkan hasil laut agar memiliki nilai guna dan nilai jual yang lebih tinggi. Salah satu tujuan produsen membuat barang tersebut adalah untuk ....""", 0),
            Pair("""39. Kegiatan ekonomi meliputi tiga hal yakni konsumsi, produksi dan distribusi. Salah satu contoh kegiatan produksi adalah....""", 0)),

        listOf(Pair("""40. Perhatikan daftar berikut ini
1) Menjual barang dengan harga murah
2) Hasil produksi lebih berguna bagiasyarakat                                                                                        
3) Membantu diskontinuitas kegiatan produsen 
4) Menyalurkan barang dari produsen ke konsumen
Manakah yang termasuk tujuan kegiatan distribusi ….
""", 0),
            Pair("""41. Batu yang ada di pegunungan akan bertambah nilai gunanya kalau dibawa ke toko bangunan dan digunakan oleh konsumen, hal tersebut dinamakan nilai guna….
""", 0),
            Pair("""42. Banyak barang yang memiliki nilai jual lebih tinggi setelah diolah terlebih dahulu, salah satunya adalah kacang kedelai akan lebih bernilai jika diolah menjadi susu kedelai. Hal ini merupakan salah satu contoh dari nilai guna ....""", 0)),

        listOf(Pair("""43. Seorang ibu memilih pakaian dengan harga yang lebih murah di Pasar Tegal Gubug dibandingkan membeli pakaian di pasar yang ada di sekitar rumahnya. Hal ini menunjukkan ....""", 0),
            Pair("""44. Perhatikan daftar berikut ini
1) Menggunakan bahan mentah atau baku dengan mutu yang baik
2) Mendirikan tempat usaha yang dekat dengan bahan mentah/bahan baku
3) Menggunakan tenaga kerja dengan upah yang tinggi.
4) Menyalurkan barang dengan prinsip tepat sasaran dan tepat waktu.
Manakah yang termasuk penerapan prinsip ekonomi dalam kegiatan produksi ….
""", 0),
            Pair("""45. Siswa mengumpulkan sumbangan untuk dikirimkan kepada saudaranya yang sedang mengalami musibah tsunami di Banten. Tindakan ini merupakan salah satu motif ekonomi yakni ....""", 0)),

        listOf(Pair("""46. Perhatikan kegiatan manusia dalam memenuhi kebutuhan di bawah ini  
(1) Mengikuti pemilihan kepala desa.
(2) Menanam padi di sawah pada musim hujan.
(3) Menyisihkan uang untuk membantu sesama.                                                                                    
(4) Berjualan makanan ringan di pasar tradional 
(5) Membantu orang lain yang mengalami kesulitan.                                                                     
Berdasarkan pernyataan di bawah yang merupakan kegiatan manusia yang didorong oleh motif memenuhi kebutuhan ditunjukkan oleh nomor ....
""", 0),
            Pair("""47. Bagi pengusaha ada banyak hal yang harus diperhatikan agar perusahaannya tetap berjalan dengan lancar. Berikut yang termasuk dalam motif ekonomi bagi pengusaha ialah....""", 0),
            Pair("""48. Jumlah barang dan jasa yang akan dibeli pada berbagai tingkat harga tertentu dan waktu tertentu disebut.... """, 0)),

        listOf(Pair("""49. Berikut ini adalah pernyataan yang menunjukan kurva penawaran yang benar adalah ….                                                              
""", 0),
            Pair("""50. Pasar yang memperjualbelikan barang-barang keperluan seperti ikan, sayuran, dan buah-buahan disebut dengan pasar ....""", 0),
            Pair("""51. Pasar yang unsur-unsur pasarnya seperti penjual, pembeli dan barang yang diperjualbelikan ada di satu tempat disebut dengan pasar ….
""", 0)),

        listOf(Pair("""52. Ada dampak positif dan negatif dengan adanya IPTEK atau Ilmu Pengetahuan dan Teknologi. Berikut ini yang merupakan dampak negatif  dari perkembangan IPTEK adalah ….
""", 0),
            Pair("""53. Pada masa pra aksara ada banyak peralatan yang sudah digunakan oleh manusia pada saat itu, seperti kapak persegi, gerabah,  dan kapak lonjong. Alat-alat tersebut digunakan pada masa ….
""", 0),
            Pair("""54. Perhatikan gambar di bawah ini
Gambar tersebut merupakan benda peninggalan kehidupan pada zaman...
""", R.mipmap.ips_kelas7_soal54dan84)),

        listOf(Pair("""55. Bangunan berupa batu tegak atau tugu yang berfungsi sebagai tempat pemujaan roh nenek moyang yang telah meninggal disebut …. 
""", 0),
            Pair("""56. Banyak kata atau istilah yang diambil dari bahasa asing termasuk dalam mata pelajaran IPS (Ilmu Pengetahuan Sosial), salah satunya adalah kata Ekonomi yang diambil dari Bahasa Yunani yakni Oikonomia. Kata Oikonomia artinya adalah ....""", 0),
            Pair("""57. Masalah ekonomi muncul karena adanya kebutuhan manusia yang terbatas, sedangkan  alat  pemuas  kebutuhan  yang  berupa  barang  dan  jasa  terbatas adanya. Ketidakseimbangan antara  kebutuhan dan ketersediaan alat pemuas kebutuhan itu disebut .…
""", 0)),

        listOf(Pair("""58. Kebutuhan yang harus dipenuhi karena bila tidak dipenuhi akan mempengaruhi kelangsungan hidup disebut kebutuhan ….
""", 0),
            Pair("""59. Perhatikan gambar berikut
Gambar di bawah ini menunjukkan salah satu kebutuhan manusia menurut ….  Pantai Tirtamaya 
""", R.mipmap.ips_kelas7_soal59),
            Pair("""60. Setiap orang memiliki perbedaan, salah satunya dalam hal konsumsi makanan. Ervina lebih suka rumbah dibandingkan dengan Fanesya yang lebih menyukai seblak.  Hal ini menunjukkan perbedaan....                                                                                                """, 0)),

        listOf(Pair("""61. Pakaian nelayan di Karangsong lebih tipis dibandingkan dengan pakaian orang yang tinggal di pegunungan. Perbedaan jenis pakaian ini menunjukkan bahwa kebutuhan manusia berbeda karena adanya perbedaan faktor ....""", 0),
            Pair("""62. Untuk mendapatkan air mineral dibutuhkan pengorbanan yang tidak sedikit, seperti membangun pabrik di daerah yang dekat dengan sumber mata air, distribusi dari pabrik yang berada di pegunungan ke konsumen dan lain-lain. Air mineral merupakan salah satu contoh dari barang ….
""", 0),
            Pair("""63. Perhatikan macam-macam barang berikut ini
1) Tas        			4) Air Mineral        
2) Sinar Matahari       5) Pakaian        
3) Udara                        
Barang bebas ditunjukkan dengan nomor ....
""", 0)),

        listOf(Pair("""64. Jika di rumah seorang ibu tidak masak nasi lalu diganti dengan menyediakan singkong goreng, maka hal tersebut merupakan salah satu contoh dari barang .…
""", 0),
            Pair("""65. Biasanya saat menggunakan sepatu maka harus menggunakan kaos kaki untuk menghindari kaki lecet dan bau. Dalam hal ini kaos kaki merupakan salah satu contoh dari barang ....""", 0),
            Pair("""66. Tingkat  konsumsi   seseorang  dapat   dipengaruhi oleh harga barang yang dikonsumsi. Jika harga barang-barang yang dikonsumsi naik, maka seseorang akan ….                                                                                            
""", 0)),

        listOf(Pair("""67. Seorang pengusaha dodol mangga memanfaatkan mangga yang tidak tahan lama untuk diolah kembali menjadi barang yang memiliki harga jual lebih tinggi. Hal tersebut merupakan salah satu kegiatan menghasilkan barang/jasa atau kegiatan menambah nilai guna barang/jasa yang disebut dengan….
""", 0),
            Pair("""68. Pengusaha kerupuk memanfaatkan hasil laut agar memiliki nilai guna dan nilai jual yang lebih tinggi. Salah satu tujuan produsen membuat barang tersebut adalah untuk ....""", 0),
            Pair("""69. Kegiatan ekonomi meliputi tiga hal yakni konsumsi, produksi dan distribusi. Salah satu contoh kegiatan produksi adalah....""", 0)),

        listOf(Pair("""70. Perhatikan daftar berikut ini
1) Menjual barang dengan harga murah
2) Hasil produksi lebih berguna bagi masyarakat                                                                                                
3) Membantu diskontinuitas kegiatan produsen        
4) Menyalurkan barang dari produsen ke konsumen
Manakah yang termasuk tujuan kegiatan distribusi ….
""", 0),
            Pair("""71. Batu yang ada di pegunungan akan bertambah nilai gunanya kalau dibawa ke toko bangunan dan digunakan oleh konsumen, hal tersebut dinamakan nilai guna….
""", 0),
            Pair("""72. Banyak barang yang memiliki nilai jual lebih tinggi setelah diolah terlebih dahulu, salah satunya adalah kacang kedelai akan lebih bernilai jika diolah menjadi susu kedelai. Hal ini merupakan salah satu contoh dari nilai guna ....""", 0)),

        listOf(Pair("""73. Seorang ibu memilih pakaian dengan harga yang lebih murah di Pasar Tegal Gubug dibandingkan membeli pakaian di pasar yang ada di sekitar rumahnya. Hal ini menunjukkan ....""", 0),
            Pair("""74. Perhatikan daftar berikut ini
1) Menggunakan bahan mentah atau baku dengan mutu yang baik
2) Mendirikan tempat usaha yang dekat dengan bahan mentah/bahan baku
3) Menggunakan tenaga kerja dengan upah yang tinggi.
4) Menyalurkan barang dengan prinsip tepat sasaran dan tepat waktu.
Manakah yang termasuk penerapan prinsip ekonomi dalam kegiatan produksi ….
""", 0),
            Pair("""75. Siswa mengumpulkan sumbangan untuk dikirimkan kepada saudaranya yang sedang mengalami musibah tsunami di Banten. Tindakan ini merupakan salah satu motif ekonomi yakni ....""", 0)),

        listOf(Pair("""76. Perhatikan kegiatan manusia dalam memenuhi kebutuhan di bawah ini                                           
(1) Mengikuti pemilihan kepala desa.
(2) Menanam padi di sawah pada musim hujan.
(3) Menyisihkan uang untuk membantu sesama.                                                                                         
(4) Berjualan makanan ringan di pasar tradisional.                                                                                                                        
(5) Membantu orang lain yang mengalami kesulitan.                                                                     
Berdasarkan pernyataan di bawah yang merupakan kegiatan manusia yang didorong oleh motif memenuhi kebutuhan ditunjukkan oleh nomor ....
""", 0),
            Pair("""77. Bagi pengusaha ada banyak hal yang harus diperhatikan agar perusahaannya tetap berjalan dengan lancar. Berikut yang termasuk dalam motif ekonomi bagi pengusaha ialah....""", 0),
            Pair("""78. Jumlah barang dan jasa yang akan dibeli pada berbagai tingkat harga tertentu dan waktu tertentu disebut.... """, 0)),

        listOf(Pair("""79. Perhatikan gambar kurva di bawah, dari gambar tersebut dapat disimpulkan bahwa ….                                                                  
""", R.mipmap.ips_kelas7_soal79),
            Pair("""80. Pasar yang memperjualbelikan barang-barang keperluan seperti ikan, sayuran, dan buah-buahan disebut dengan pasar ....""", 0),
            Pair("""81. Pasar yang unsur-unsur pasarnya seperti penjual, pembeli dan barang yang diperjualbelikan ada di satu tempat disebut dengan pasar ….
""", 0)),

        listOf(Pair("""82. Ada dampak positif dan negatif dengan adanya IPTEK atau Ilmu Pengetahuan dan Teknologi. Berikut ini yang merupakan dampak negatif  dari perkembangan IPTEK adalah ….
""", 0),
            Pair("""83. Pada masa pra aksara ada banyak peralatan yang sudah digunakan oleh manusia pada saat itu, seperti kapak persegi, gerabah,  dan kapak lonjong. Alat-alat tersebut digunakan pada masa ….
""", 0),
            Pair("""84. Perhatikan gambar di bawah ini  
Gambar tersebut merupakan benda peninggalan kehidupan pada zaman...
""", R.mipmap.ips_kelas7_soal54dan84)),

        listOf(Pair("""85. Bangunan berupa batu tegak atau tugu yang berfungsi sebagai tempat pemujaan roh nenek moyang yang telah meninggal disebut ….   
""", 0),
            Pair("""86. Peradaban manusia telah mengalami beberapa masa, di antaranya ada masa prasejarah dan sejarah. Ciri dari zaman sejarah yaitu ....""", 0),
            Pair("""87. Pada abad ke-5 masyarakat Indonesia sudah mendapat pengaruh Agama Hindu. Ini dibuktikan dengan adanya …. 
""", 0)),

        listOf(Pair("""88. Teori yang menyebutkan orang Indonesia berperan aktif dalam penyebaran agama dan kebudayaan Hindu-Budha di Indonesia adalah teori ....                                                                                                """, 0),
            Pair("""89. Pengaruh kebudayaan Hindu-Buddha dalam bidang pemerintahan adalah ....                                        """, 0),
            Pair("""90. Perpaduan antara kebudayaan Hindu-Buddha dan kepercayaan asli Indonesia terlihat pada ....      """, 0)),

        listOf(Pair("""91. Ada beberapa kerajaan Hindu di Indonesia, kerajaan Hindu pertama di Pulau Jawa yakni ....""", 0),
            Pair("""92. Pengaruh Islam di Indonesia sudah ada sejak abad ke ....""", 0),
            Pair("""93. Agama Islam mudah diterima oleh rakyat Indonesia, ini dikarenakan ....                                                                        """, 0)),

        listOf(Pair("""94. Perhatikan nama-nama kerajaan Islam di Indonesia
1) Banjar        4) Banten 
2) Demak         5) Makasar
3) Ternate                 
Kerajaan Islam di Pulau Jawa ditunjukkan dengan nomor ....
""", 0),
            Pair("""95. Karya sastra bercorak peninggalan masa dari kesultanan Islam di Indonesia berupa kitab-kitab yang berisi masalah gaib, ramalan tentang hari baik atau buruk, dan makna atau simbol tertentu yang dihadapi manusia adalah....                       """, 0),
            Pair("""96 . Menurut konsep geografis, pengertian ruang adalah……..
""", 0)),

        listOf(Pair("""97 . Seorang Ibu biasanya pergi belanja ke pasar A, kemudian ada pembangunan pasar B yang jaraknya  lebih dekat, sehingga si ibu tadi beralih ke pasar B. Contoh kasus tersebut dikenal sebagai...
""", 0),
            Pair("""98 . Di wilayah pantai sebagian besar penduduknya bermata pencaharian sebagai…. 
""", 0),
            Pair("""99 . Contoh berikut merupakan bentuk dari interaksi keruangan, yaitu... 
""", 0)),

        listOf(Pair("""100. Ada beberapa kondisi saling bergantung yang diperlukan untuk terjadinya interaksi keruangan yaitu… 
""", 0),
            Pair("""101. Di bawah ini yang merupakan komponen penyusun peta, kecuali…  
""", 0),
            Pair("""102. Jika suatu wilayah A merupakan penghasil sayuran, sedangkan wilayah B penghasil ikan. Wilayah A membutuhkan ikan sedangkan wilayah B membutuhakan sayuran.  Hal tersebut menunjukkan interaksi keruangan :
""", 0)),

        listOf(Pair("""103. Letak astronomis Indonesia adalah…. 
""", 0),
            Pair("""104. Hutan hujan tropis terluas di Indonesia adalah…. 
""", 0),
            Pair("""105. Dilihat dari jenisnya, terumbu karang Indonesia merupakan salah satu yang yang terkaya di dunia. Secara ekonomis terumbu karang bermanfaat sebagai ...""", 0)),

        listOf(Pair("""106. Berdasarkan data kependudukan dunia tahun 2015 jumlah penduduk Indonesia menempati urutan ke……
""", 0),
            Pair("""107. Salah satu faktor yang menyebabkan Pulau Jawa lebih padat dibanding pulau lainnya adalah...""", 0),
            Pair("""108.  Dilihat dari komposisi penduduk berdasarkan usia, usia produktif mulai dari umur…..
""", 0)),

        listOf(Pair("""109. Rumah adat di Papua dikenal dengan nama... """, 0),
            Pair("""110. Berdasarkan letak geologis, wilayah Indonesia dilalui oleh 2 sirkum yaitu….
""", 0),
            Pair("""111. Wilayah Indonesia berada di tiga pertemuan lempeng litosfer, bagian timur menunjukkan  lempeng….
""", 0)
        )
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. keterbatasan jumlah alat pemuas kebutuhan yang tersedia di alam","b. peningkatan investasi sebagai akibat dari modernisasi global","c. terjadinya bencana alam","d. perkembangan potensi sumber daya manusia"),
            listOf("a. Perbedaan letak geografis","b. Pertumbuhan penduduk","c. Kemampuan produksi","d. Sumber daya alam yang terbatas"),
            listOf("a. 1,2,3        ","b. 2,3,4","c. 3,4,5","d. 1,3,4")
        ),
        listOf(
            listOf("a. Melakukan stok bawang putih dan cabe  sebanyak mungkin sebelum harga lebih tinggi","b. jangan memasak atau berproduksi menggunakan bawang putih dan cabe","c. menambah jumlah pasokan bawang putih dan cabe  untuk menurunkan harga","d. menghimbau untuk meminimalisir pemakaian bawang putih dan cabe"),
            listOf("a. konsumsi        ","b. produksi","c. distribusi","d. imaginasi"),
            listOf("a. Primer        ","b. Sekunder","c. Tersier","d. Kwartier")
        ),
        listOf(
            listOf("a. Masa kini        ","b. Tersier","c. Sekunder","d. Primer"),
            listOf("a. membelanjakan seluruh uangnya untuk membeli alat tulis","b. mengunakan alat tulis sesuai keperluannya.","c. menuliskan pesan – pesan di seragam kelulusan","d. mempelajari materi yang diberikan oleh guru"),
            listOf("a. Efektif        ","b. Efisien","c. Komplit","d. Defisi")
        ),
        listOf(
            listOf("a. Orang lain        ","b. Diri sendiri","c. Kelompok","d. Badan Usaha"),
            listOf("a. Penawaran        ","b. Keseimbangan","c. Pengkondisian","d. Permintaan"),
            listOf("a. menolong sesama","b. mencari keuntungan","c. memperoleh penghargaan","d. memperoleh kepuasan")
        ),
        listOf(
            listOf("a. Perubahan kelangkaan yang terukur melalui harga merupakan konsep ekonomi bukan konsep fisik","b. Proses pemanfaatan sumber daya alam dan energi diukur kelangkaannya melalui gerakan harga","c. Indeks harga sebagai ukuran kelangkaan","d. Cadangan yang"),
            listOf("a. Keinginan manusia tidak terbatas","b. Keinginan manusia terbatas","c. Alat pemuas kebutuhan manusia terbatas","d. Kebutuhan manusia tidak bisa dihentikan"),
            listOf("a. Mengkombinasikan kegunaan gagasan","b. Mengkombinasikan kegunaan benda","c. Membiarkan barang yang sudah rusak","d. Mengubah bentuk benda untuk meningkatkan nilai hasil")
        ),
        listOf(
            listOf("a. 1,2, dan 3        ","b. 2,3 dan 4","c. 3,4 dan 1","d. 4,1 dan 2"),
            listOf("a. cara memasang spanduk","b. menjanjikan bonus","c. membagikan ide ","d. mengintimidasi."),
            listOf("a. ilmu merupakan hasil dari kegiatan sosial, yang berusaha memahami alam, manusia dan perilakuknya baik secara individu atau kelompok","b. ilmu bersifat statis","c. ilmu diperoleh dari hasil metode keilmuan","d. ilmu tidak  dapat diuji kebenarannya")
        ),
        listOf(
            listOf("a. Pekerjaan manusia tak tergantikan","b. Jenis-jenis pekerjaan yang sebelumnya menuntut kemampuan fisik cukup besar, kini relatif sudah bisa digantikan oleh perangkat mesin-mesin otomatis","c. Nilai – nilai social semakin memudar","d. Paham – paham baru tak bisa  berkembang"),
            listOf("a. Pemanfaatan teknologi internet di Indonesia masih tertinggal dengan Negara – Negara lain","b. Indonesia merupakan pasar potensial bagi layanan internet","c. Masih banyak orang Indonesia yang belum melek teknologi.","d. Indonesia belum potensial bagi tumbuh dan berkembangnya layanan internet."),
            listOf("a. nilai – nilai sosial dalam  masyarakat mulai luntur","b. semangat gotong royong masyarakat pedesaan tetap terjaga","c. angka kriminalitas meningkat","d. pengangguran berkurang")
        ),
        listOf(
            listOf("a. investasi berlangsung secara besar-besaran","b. pendidikan yang diperlukan adalah pendidikan yang menghasilkan tenaga kerja atau sumber daya yang mampu mentransformasikan pengetahuan dan skill sesuai dengan tuntutan tenaga kerja.","c. Pertumbuhan ekonomi terjaga","d. Kesehatan masyarakat semakin membaik."),
            listOf("a. Ali termasuk murid terpandai dikelasnya, tapi pemalas","b. Dona menerima hasil ulangan apa adanya","c. Rini selalu menyerahklan masalah pada takdir","d. Budi ingin memperbaiki hasil ulangan yang jelek dengan belajar lebih rajin"),
            listOf("a. Pelayanan        ","b. Waktu","c. Tempat","d. Bentuk")
        ),
        listOf(
            listOf("a. keadaan dimana tingkat kekayaan terpenuhi secara cukup melimpah","b. tingkat kepuasan yang diperoleh dalam bentuk materi yang cukup","c. tercapainya keseimbangan antara kebutuhan dan alat pemuas kebutuhan","d. tercapainya tingkat kebutuhan jasmani"),
            listOf("a. Aturan Negara                    ","b. Kegiatan Manusia  ","c. Aturan Rumah Tangga           ","d. Aturan Masyarakat"),
            listOf("a. Kelangkaan     ","b. Keinginan","c. Kebutuhan    ","d. Kemakmuran")
        ),
        listOf(
            listOf("a. Sekunder     ","b. Tersier","c. Primer            ","d. Kuarter"),
            listOf("a. Intensitasnya                            ","b. Sifatnya                  ","c. Waktunya ","d. Subjeknya"),
            listOf("a. pendapatan          ","b. harga","c. keinginan    ","d. selera")
        ),
        listOf(
            listOf("a. Selera atau kesukaan   ","b. Tingkat pendidikan  ","c. Lingkungan tempat tinggal   ","d. Kedudukan sosial"),
            listOf("a. Substitusi    ","b. Ekonomis ","c. Komplementer   ","d. Bebas"),
            listOf("a. 1 dan 2    ","b. 2 dan 4","c. 2 dan 3    ","d. 4 dan 5 ")
        ),
        listOf(
            listOf("a. Ekonomis    ","b. Substitusi","c. Bebas        ","d. Komplementer "),
            listOf("a. Ekonomis     ","b. Substitusi","c. Bebas        ","d. Komplementer"),
            listOf("a. Menambah jumlah barang yang dikonsumsi ","b. Menambah jumlah jasa yang dikonsumsi ","c. Mengurangi jumlah barang yang dikonsumsi","d. Mengurangi  jumlah jasa yang dikonsumsi")
        ),
        listOf(
            listOf("a. Produksi     ","b. Distribusi","c. Konsumsi   ","d. Transisi"),
            listOf("a. Memenuhi kebutuhan konsumen  ","b. Memperoleh penghargaan dari pemerintah ","c. Berbuat baik kepada sesama manusia","d. Menarik simpati dari masyarakat"),
            listOf("a. Tukang ojek online membeli makanan di pasar   ","b. Pengusaha tekstil menghasilkan pakai pramuka","c. Tukang sayur menjajakan sayuran ke rumah-rumah","d. Peserta didik memakai seragam pramuka")
        ),
        listOf(
            listOf("a. 1 dan 2      ","b. 2 dan 4","c. 2 dan 3     ","d. 1 dan 3 "),
            listOf("a. Tempat     ","b. Waktu","c. Kepemilikan        ","d. Bentuk "),
            listOf("a. Kepemilikan   ","b. Tempat","c. Waktu            ","d. Bentuk ")
        ),
        listOf(
            listOf("a. Motif Ekonomi    ","b. Tindakan Ekonomi   ","c. Prinsip Ekonomi   ","d. Kegiatan Ekonomi"),
            listOf("a. 1 dan 2     ","b. 2 dan 4","c. 2 dan 3    ","d. 1 dan 3 "),
            listOf("a. Memenuhi Kebutuhan  ","b. Mendapatkan Penghargaan","c. Berbuat Sosial    ","d. Memperoleh Kekuasaan ")
        ),
        listOf(
            listOf("a. 1 dan 3  ","b. 1 dan 4  ","c. 2 dan 4  ","d. 3 dan 5  "),
            listOf("a. mengeluarkan biaya produksi setinggi-tingginya                                                                                                              ","b. menerima pegawai sebanyak-banyaknya","c. mencari keuntungan sebanyak-banyaknya                                                                                            ","d. memproduksi barang dalam jumlah besar"),
            listOf("a. permintaan          ","b. hukum permintaan  ","c. penawaran            ","d. hukum penawaran ")
        ),
        listOf(
            listOf("a. jika harga naik, jumlah yang ditawarkan bertambah","b. bila harga turun, jumlah yang ditawarkan bertambah ","c. bila harga turun, jumlah yang ditawarkan sedang","d. jika harga naik, jumlah yang ditawarkan berkurang"),
            listOf("a. harian     ","b. bulanan   ","c. mingguan      ","d. tahunan"),
            listOf("a. bulanan     ","b. abstrak  ","c. konkret     ","d. tahunan  ")
        ),
        listOf(
            listOf("a. dapat terpenuhinya berbagai kebutuhan manusia.","b. dapat membuat kegiatan manusia  lebih cepat dan mudah.","c. membantu perluasan dan pengembangan wawasan pengetahuan.","d. dapat menyebabkan terjadinya  polusi udara, air, dan tanah."),
            listOf("a. bercocok tanam  ","b. perundagian ","c. modern    ","d. berburu dan mengumpulkan makanan"),
            listOf("a. berburu dan meramu            ","b. bercocok tanam                   ","c. berpindah-pindah tempat ","d. perundagian")
        ),
        listOf(
            listOf("a. sarkofagus ","b. menhir ","c. dolmen ","d. waruga"),
            listOf("a. aturan negara                                             ","b. aturan rumah tangga                                ","c. kegiatan manusia    ","d. aturan masyarakat"),
            listOf("a. kelangkaan                                         ","b. kebutuhan                                        ","c. keinginan","d. kemakmuran")
        ),
        listOf(
            listOf("a. sekunder                                        ","b. primer                                                ","c. tersier","d. kuarter"),
            listOf("a. intensitasnya                            ","b. sifatnya                                ","c. waktunya ","d. subjeknya"),
            listOf("a. pendapatan                                       ","b. keinginan                                        ","c. harga","d. selera")
        ),
        listOf(
            listOf("a. selera atau kesukaan                                              ","b. lingkungan tempat tinggal                        ","c. tingkat pendidikan ","d. kedudukan sosial"),
            listOf("a. substitusi                                           ","b. komplementer                                        ","c. ekonomis    ","d. bebas"),
            listOf("a. 1 dan 2                                                ","b. 2 dan 3                                        ","c. 2 dan 4","d. 4 dan 5 ")
        ),
        listOf(
            listOf("a. ekonomis                                         ","b. bebas                                            ","c. substitusi","d. komplementer "),
            listOf("a. ekonomis                                         ","b. bebas                                            ","c. substitusi","d. komplementer"),
            listOf("a. menambah jumlah barang yang dikonsumsi        ","b. menambah jumlah jasa yang dikonsumsi        ","c. mengurangi jumlah barang yang dikonsumsi","d. mengurangi  jumlah jasa yang dikonsumsi")
        ),
        listOf(
            listOf("a. produksi                                        ","b. konsumsi                                        ","c. distribusi","d. transisi"),
            listOf("a. memenuhi kebutuhan konsumen         ","b. memperoleh penghargaan dari pemerintah        ","c. berbuat baik kepada sesama manusia","d. menarik simpati dari masyarakat"),
            listOf("a. tukang ojek online membeli makanan di pasar          ","b. seorang montir sedang memperbaiki sepeda motor         ","c. tukang sayur menjajakan sayuran ke rumah-rumah","d. peserta didik memakai seragam pramuka")
        ),
        listOf(
            listOf("a. 1 dan 2                                         ","b. 2 dan 3                                                ","c. 2 dan 4","d. 1 dan 3 "),
            listOf("a. tempat                                                 ","b. kepemilikan                                         ","c. waktu","d. bentuk "),
            listOf("a. kepemilikan                                        ","b. waktu                                                ","c. tempat","d. bentuk ")
        ),
        listOf(
            listOf("a. motif ekonomi                                                              ","b. prinsip ekonomi                                ","c. tindakan ekonomi  ","d. kegiatan ekonomi"),
            listOf("a. 1 dan 2                                         ","b. 2 dan 3                                                ","c. 2 dan 4","d. 1 dan 3 "),
            listOf("a. memenuhi kebutuhan                        ","b. berbuat sosial                                ","c. mendapatkan penghargaan","d. memperoleh kekuasaan ")
        ),
        listOf(
            listOf("a. 1 dan 3                ","b. 1 dan 4                ","c. 2 dan 4                ","d. 3 dan 5  "),
            listOf("a. mengeluarkan biaya produksi setinggi-tingginya                                                                                                              ","b. menerima pegawai sebanyak-banyaknya","c. mencari keuntungan sebanyak-banyaknya                                                                                            ","d. memproduksi barang dalam jumlah besar"),
            listOf("a. permintaan                                                   ","b. penawaran                                          ","c. hukum permintaan    ","d. hukum penawaran ")
        ),
        listOf(
            listOf("a. jika harga naik, jumlah yang ditawarkan bertambah","b. bila harga turun, jumlah yang ditawarkan bertambah ","c. bila harga turun, jumlah yang ditawarkan sedang","d. jika harga naik, jumlah yang ditawarkan berkurang"),
            listOf("a. harian                                                               ","b. mingguan                                               ","c. bulanan  ","d. tahunan"),
            listOf("a. bulanan                                              ","b. konkret                                        ","c. abstrak   ","d. tahunan  ")
        ),
        listOf(
            listOf("a. dapat terpenuhinya berbagai kebutuhan manusia.","b. dapat membuat kegiatan manusia  lebih cepat dan mudah.","c. membantu perluasan dan pengembangan wawasan pengetahuan.","d. dapat menyebabkan terjadinya  polusi udara, air, dan tanah."),
            listOf("a. bercocok tanam                                       ","b. modern                                        ","c. perundagian ","d. berburu dan mengumpulkan makanan"),
            listOf("a. berburu dan meramu            ","b. bercocok tanam                     ","c. berpindah-pindah tempat     ","d. perundagian")
        ),
        listOf(
            listOf("a. sarkofagus        ","b. menhir        ","c. dolmen        ","d. waruga"),
            listOf("a. masyarakat sudah hidup secara menetap        ","b. masyarakat sudah mengenal tulisan        ","c. adanya pembagian pekerjaan secara baik","d. terbentuknya sistem pemerintahan kerajaan"),
            listOf("a. penggunaan bahasa Sanskerta dalam penulisan prasasti","b. makin lunturnya adat istiadat asli nenek moyang                                                                                  ","c. penggunaan bahasa Sanskerta dalam kehidupan sehari-hari                                                                    ","d. masyarakat tidak menggunakan bahasa Melayu")
        ),
        listOf(
            listOf("a. Brahmana                                             ","b. Waisya                                         ","c. Ksatria ","d. Arus Balik                                                                                                                                                       "),
            listOf("a. pemimpin masyarakat dipilih berdasarkan kastanya                                                                              ","b. pimpinan masyarakat yang dipilih adalah orang yang dianggap tua dan bijaksana                          ","c. pergantian pemimpin masyarakat berdasarkan atas keturunannya                                                     ","d. gelar yang dipakai pemimpin masyarakat adalah Datuk"),
            listOf("a. munculnya kerajaan bercorak Hindu-Buddha                                                                                     ","b. bentuk candi yang berundak-undak                                                                                                     ","c. pembuatan arca sebagai perwujudan dewa                                                                                              ","d. raja dianggap sebagai keturunan dewa ")
        ),
        listOf(
            listOf("a. Kerajaan Tarumanegara                                            ","b. Kerajaan Kutai                                ","c. Kerajaan Pajajaran    ","d. Kerajaan Majapahit"),
            listOf("a. 7 Masehi                                             ","b. 8 Masehi                                         ","c. 9 Masehi    ","d. 10 Masehi"),
            listOf("a. adanya peraturan zakat dapat memperingan beban ekonomi umat Islam               ","b. agama Islam disebarluaskan tidak dengan paksaan dan tanpa persyaratan                                       ","c. persyaratan untuk masuk agama Islam hanya membaca dua kalimat syahadat                                                                                                                                                                ","d. agama Islam berkembang dengan mempergunakan wayang dan gamelan")
        ),
        listOf(
            listOf("a. 1 dan 2                                                      ","b. 2 dan 3                                                ","c. 2 dan 4  ","d. 4 dan 5"),
            listOf("a. suluk                                                ","b. babad                                                ","c. hikayat","d. panji"),
            listOf("a. Tempat dipermukaan bumi baik secara keseluruhan maupun hanya sebagian yang digunakan oleh makhluk hidup untuk tinggal","b. Gambaran muka bumi baik sebagian atau keseluruhan yang dituangkan dalam bidang datar","c. Tempat dimana makhluk hidup yang tinggal di dalam permukaan air","d. Tempat makhluk hidup berkembang biak")
        ),
        listOf(
            listOf("a. Dapat dipindahkan (Transferiability)","b. Keterhubungan (Connectivity)","c. Kesempatan antara (Intervening Opportunity)","d. Saling melengkapi (Complementary)"),
            listOf("a. Nelayan                                        ","b. Buruh tani                                         ","c. Pedagang","d. Pegawai Sipil        "),
            listOf("a. Seseorang pergi berbelanja ke kota","b. Makanan khas Jepang banyak disukai di Indonesia","c. Rumah permanen dari beton banyak juga dibangun di pedesaan yang tadinya menggunakan bahan kayu dan bambu","d. Banyak lahan pertanian berubah menajadi permukiman")
        ),
        listOf(
            listOf("a. Kesempatan Antara                                ","b. Kemudahan transfer                                ","c. Transfer Dana ","d. Saling melengkapi        "),
            listOf("a. Judul peta                                        ","b. Skala peta                                        ","c. Legenda","d. Garis pinggir  "),
            listOf("a. Kesempatan Antara                                ","b. Kemudahan transfer                                ","c. Transfer Dana ","d. Saling melengkapi        ")
        ),
        listOf(
            listOf("a. 6°LU – 11°LU dan 95°BT - 141°BT                ","b. 6°LS – 11°LS dan 95°BB - 141°BB                ","c. 6°LU– 11°LS dan 95°BT - 141°BT","d. 6°LU – 11°LS dan 95°BB - 141°BT"),
            listOf("a. Jawa                                        ","b. Sulawesi                                        ","c. Sumatera","d. Kalimantan"),
            listOf("a. daerah tujuan wisata                        ","b. tempat ikan berlindung","c. tempat ikan mencari makan               ","d. tempat berkembangbiaknya ikan")
        ),
        listOf(
            listOf("a. Satu                                ","b. Dua                                 ","c. Tiga","d. Empat"),
            listOf("a. Pulau Jawa lebih banyak atau lebih padat penduduknya dibanding pulau lainnya","b. Pulau Jawa sangat subur","c. Sudah menjadi kebijakan pemerintah","d. Pulau Jawa lebih kaya akan sumberdaya alam dibanding pulau lainnya"),
            listOf("a. 0-14                                        ","b. 15-64                                  ","c. >64","d. <80")
        ),
        listOf(
            listOf("a.  Lamin                                ","b. Banjar                                 ","c.  Honai","d. Musalaki"),
            listOf("a. Pasifik dan Mediterania                ","b. Pasifik dan Asia                        ","c. Mediterania dan Australia","d. Asiatis dan Australis"),
            listOf("a. Lempeng Asia                        ","b. Lempeng Atlantik                         ","c. Lempeng Pasifik","d. Lempeng Hindia                                                                    ")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(0,1,0),
        listOf(2,2,3),
        listOf(3,1,1),
        listOf(0,3,0),
        listOf(2,0,1),
        listOf(0,0,0),
        listOf(1,1,0),
        listOf(1,3,1),
        listOf(2,2,0),
        listOf(2,2,3),
        listOf(2,1,2),
        listOf(1,3,2),
        listOf(0,0,1),
        listOf(1,0,3),
        listOf(2,0,2),
        listOf(2,2,0),
        listOf(0,0,2),
        listOf(3,3,0),
        listOf(1,1,0),
        listOf(1,1,3),
        listOf(1,2,1),
        listOf(2,3,2),
        listOf(0,0,1),
        listOf(2,0,3),
        listOf(1,0,1),
        listOf(2,2,0),
        listOf(0,0,1),
        listOf(3,0,3),
        listOf(1,1,0),
        listOf(3,2,3),
        listOf(0,0,1),
        listOf(2,0,0),
        listOf(0,0,2),
        listOf(3,3,3),
        listOf(2,3,0),
        listOf(1,3,1),
        listOf(2,0,2)






    )
    private lateinit var scoreManagerIps: ScoreManagerIps


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_ips_kelas7, container, false)
        scoreManagerIps = ScoreManagerIps(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerIps.scoreIpsKelas7 < 1) 0 else scoreManagerIps.scoreIpsKelas7 / 5
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
            val getData = soalIpssd7[jawabanBenar6][i]
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

                        var scoreIpsSd = scoreManagerIps.scoreIpsKelas7
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalIpssd7.size) {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas7 = scoreIpsSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreIpsSd += 5
                                scoreManagerIps.scoreIpsKelas7 = scoreIpsSd
                                Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                    .show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalIpssd7[jawabanBenar6][i]
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