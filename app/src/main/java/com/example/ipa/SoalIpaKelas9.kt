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


class SoalIpaKelas9 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalIpasd9: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Proses pembelahan mitosis terjadi pada ... .  
""", 0),
            Pair("""2. Urutan spermatogenesis yang benar adalah ... .
""", 0),
            Pair("""3. Urutan saluran reproduksi pada wanita adalah ... .
""", 0)),

        listOf(Pair("""4. Saluran reproduksi internal pada laki-laki yang berfungsi untuk pematangan sperma adalah ... .
""", 0),
            Pair("""5. Peristiwa pelepasan ovum dari ovarium disebut ... .
""", 0),
            Pair("""6. Pada organ reproduksi wanita, bagian yang berfungsi sebagai tempat fertilisasi adalah ... .
""", 0)),

        listOf(Pair("""7. Urutan fase pembelahan zygot dibawah ini yang benar adalah ... .
""", 0),
            Pair("""8. Hormon yang tidak berperan dalam proses kehamilan adalah ... .
""", 0),
            Pair("""9. Penyakit pada sistem reproduksi yang disebabkan oleh virus adalah ... .
""", 0)),

        listOf(Pair("""10. Untuk menghindari penularan virus covid-19 salah satu caranya dengan meningkatkan imun tubuh manusia. 
Pada sistem reproduksi manusia penyakit yang dapat mengakibatkan menurunnya sistemimun/kekebalan adalah ... .
""", 0),
            Pair("""11. Pernyataan berikut adalah bukan usaha untuk mencegah penularan penyakit AIDS, yaitu ... .
""", 0),
            Pair("""12. Sebuah sel telur dapat membelah menjadi dua sesaat setelah dibuahi (Zygot). Selanjutnya masing-masing zygot tumbuh membentuk embrio, karena bayi yang dilahirkan berasal dari satu sel telur dan satu sperma, maka disebut ... .
""", 0)),

        listOf(Pair("""13. Masa pubertas ditandai dengan dihasilkan/ dikeluarkannya ... .
""", 0),
            Pair("""14. Perkembangbiakan tanpa melalui proses perkawinan pada tumbuhan yang tidak melibatkan campur tangan manusia disebut perkembangbiakan … .
""", 0),
            Pair("""15. Perhatikan gambar berikut
Gambar tersebut merupakan contoh perkembangbiakan vegetatif buatan dengan cara … .
""", 0)),

        listOf(Pair("""16. Salah satu pernyataan berikut yang termasuk perkembangbiakan vegetatif alami adalah … .
""", 0),
            Pair("""17. Perhatikan gambar berikut
Alat kelamin jantan pada bunga di tunjukkan pada huruf … .
""", R.mipmap.ipa_kelas9_soal17),
            Pair("""18. Perhatikan gambar macam-macam penyerbukan berikut
Penyerbukan secara hibridogami, autogami, allogami, dan geitogami secara berurutan ditunjukkan oleh gambar nomer ….
""", R.mipmap.ipa_kelas9_soal18)),

        listOf(Pair("""19. Perhatikan gambar di bawah ini
Hewan tersebut melakukan perkembangbiakan aseksual dengan cara … .
""", R.mipmap.ipa_kelas9_soal19),
            Pair("""20. Urutan yang benar dalam tahapan metamorfosis sempurna adalah … .
""", 0),
            Pair("""21. Perhatikan hewan-hewan berikut
Hewan yang bereproduksi secara ovivar ditunjukkan oleh nomor ... .
""", R.mipmap.ipa_kelas9_soal21)),

        listOf(Pair("""22. Teknik penanaman tumbuhan dengan menggunakan media selain tanah dan dapat dilakukan dalam lahan yang sempit adalah teknik ….
""", 0),
            Pair("""23. Penyebaran tanaman dengan bantuan kelelawar disebut … .
""", 0),
            Pair("""24. Pada tumbuhan paku, spora akan berkembang membentuk … .
""", 0)),

        listOf(Pair("""25. Untuk mendapatkan keturunan sapi yang unggul, seorang dokter hewan memasukkan spermatozoid sapi unggul ke dalam rahim sapi betina. Proses yang dilakukan oleh dokter tersebut disebut ... .
""", 0),
            Pair("""26. Perhatikan gambar di bawah ini
Hasil pengukuran 3 buah batu secara berturut – turut dari volume batu terkecil hingga terbesar adalah ... .
""", R.mipmap.ipa_kelas9_soal26),
            Pair("""27. Perhatikan ciri-ciri zat di bawah ini
1) Ikatan antar partikel sangat kuat 
2) Gerak partikel sangat terbatas
3) Susunan partikel teratur
4) Bentuk benda tetap
5) Volume tetap
Berdasarkan pernyataan dibawah, benda yang dimaksud adalah ... .
""", R.mipmap.ipa_kelas9_soal27)),

        listOf(Pair("""28. Perhatikan pernyataan berikut
1) Kue agar – agar di masukkan dalam cetakan hingga memadat
2) Air sirup disimpan dalam kulkas hingga menjadi es lilin
3) Fasya memanaskan timah hingga mencair untuk menyolder
4) Andin menjemur pakaian di bawah terik matahari
Pernyataan perubahan wujud zat yang memerlukan kalor terdapat pada nomor ... .
""", 0),
            Pair("""29. Rama dan Harun melakukan pengukuran suhu air. Hasil yang diperoleh suhu air sebesar 50 oC. Besar suhu air bila diukur menggunakan skala Fahrenheit adalah ... .
""", 0),
            Pair("""30. Perhatikan gambar dibawah ini
Mobil A bergerak dengan kecepatan 20 m/s dan berada 200 m dibelakang Mobil B. Mobil B bergerak searah dengan mobil A dan memiliki kecepatan 10 m/s. Mobil A akan mendahului mobil B pada detik ke ... .
""", R.mipmap.ipa_kelas9_soal30)),

        listOf(Pair("""31. Mazaya memiliki 5 kotak yang memiliki massa yang berbeda, yang akan dipindahkan ke luar rumah. 
Kotak 1  = 40 kg
Kotak 2  = 25 kg
Kotak 3  = 75 kg
Kotak 4  = 20 kg 
Kotak 5  = 50 kg
Jika gaya yang dimiliki Mazaya 300 N dan percepatan yang diinginkan adalah 2 m/s2, maka kotak yang harus dipilih Mazaya adalah ... .
""", 0),
            Pair("""32. Pak Mustofa memindahkan almari baju dengan gaya 300 N. Gaya gesek yang dimiliki benda sebesar 270 N. Untuk memindahkan almari sejauh 5 meter diperlukan usaha sebesar 1200 Joule. Beliau meminta pertolongan kepada Udin, Raju, Desta, dan Roy yang masing – masing memiliki gaya seperti pada tabel berikut.
Berdasarkan tabel dibawah, maka yang dapat membantu Pak Mustofa adalah ... .
""", R.mipmap.ipa_kelas9_soal32),
            Pair("""33. Perhatikan gambar di bawah ini   
Simpulan yang dapa diperoleh dari gambar adalah ... .
""", R.mipmap.ipa_kelas9_soal33)),

        listOf(Pair("""34. Perhatikan gambar berikut 
Pak Azril mengangkat kotak yang beratnya 720 N dengan menggunakan katrol seperti pada gambar. Gaya kuasa yang diberikan pak Asril untuk mengangkat kotak adalah ... .
""", R.mipmap.ipa_kelas9_soal34),
            Pair("""35. Seorang anak melempar sebuah batu ke atas. Pada saat batu bergerak ke atas, pernyataan yang benar dari peristiwa tersebut adalah ….
""", 0),
            Pair("""36. Seseorang memiliki cacat mata hipermetropi mempunyai titik dekat 75 cm, ingin membaca pada jarak baca normal (25 cm). Kacamata yang harus digunakan berkekuatan lensa ... .
""", 0)),

        listOf(Pair("""37. Perhatikan pernyataan berikut
1) Dalam tata surya letaknya paling dekat dengan bumi
2) Memiliki ekor yang selalu menjauhi matahari
3) Memiliki ekor yang selalu mendekati matahari
4) Orbitnya mengelilingi matahari
5) Lintasan orbitnya sangat lonjong
6) Memancarkan cahayanya sendiri
Pernyataan yang merupakan ciri komet adalah … .
""", 0),
            Pair("""38. Perhatikan gambar
Fase bulan baru dan bulan purnama  adalah fase saat bulan pada posisi … .
""", R.mipmap.ipa_kelas9_soal38),
            Pair("""39.  Perhatikan gambar di bawah ini
Ayunan yang memiliki  perioda terbesar dan terkecil  berturut-turut ditunjukkan oleh gambar  nomor ... .
""", R.mipmap.ipa_kelas9_soal39)),

        listOf(Pair("""40.  Perhatikan gambar di bawah ini
Diperoleh  perbesaran  bayangan  ½ kali  benda.  Sifat  bayangan  benda  tersebut  jika  benda digeser 3 cm mendekati cermin adalah ... .
""", R.mipmap.ipa_kelas9_soal40),
            Pair("""41. Dua benda bermuatan listrik tarik-menarik dengan gaya 2 N. Jika muatan kedua benda masing-masing diperbesar menjadi 2 kali semula dan jarak kedua benda saling didekatkan menjadi 1/2 kali jarak semula, maka gaya tarik-menarik kedua benda menjadi ... .
""", 0),
            Pair("""42. Perhatikan gambar 
Besar kuat arus pada titik cabang I adalah ... .
""", R.mipmap.ipa_kelas9_soal42)),

        listOf(Pair("""43. Dalam sebuah rumah terdapat 4 buah lampu 5 W, 3 buah lampu 10 W, 2 buah lampu 20 W, dan sebuah seterika 300 W yang setiap hari digunakan rata-rata selama 5 jam. Jika tarif listrik Rp. 450;/kWh, biaya yang harus dibayar untuk pemakaian 1 bulan (30 hari) adalah ... .
""", 0),
            Pair("""44. Perhatikan gambar pembuatan magnet dari batang besi berikut
Interaksi yang terjadi antara kompas dengan magnet adalah ....
""", R.mipmap.ipa_kelas9_soal44),
            Pair("""45. Perhatikan data transformator pada tabel berikut
Dari data tersebut jenis trafo dan alasan yang benar adalah … .
""", R.mipmap.ipa_kelas9_soal45)),

        listOf(Pair("""46. Berikut adalah perubahan warna lakmus dalam 5 larutan.
Berdasarkan tabel dibawah, larutan yang bersifat basa adalah ... .
""", R.mipmap.ipa_kelas9_soal46),
            Pair("""47. Perhatikan pernyataan berikut 
1) Merupakan zat tunggal
2) Terdiri atas satu atom
3) Terdiri atas dua atau lebih atom
4) Dapat  terurai menjadi zat lain yang lebih sederhana
5) Tidak dapat terurai menjadi zat lain yang lebih sederhana
Yang merupakan ciri senyawa adalah … .
""", 0),
            Pair("""48. Pada bahan makanan terdapat bahan kimia:
Bahan kimia buatan (sintesis) diperlihatkan pasangan nomor ... .
""", R.mipmap.ipa_kelas9_soal48)),

        listOf(Pair("""49. Rasya melakukan pengamatan sel tumbuhan Rhoe discolour dengan menggunakan mikroskop. Dia berhasil menemukan obyek amatan namun bayangan benda belum terlihat jelas. Yang harus dilakukan Rasya adalah ... .
""", 0),
            Pair("""50. Perhatikan gambar sel berikut C:\Users\user\Pictures\sel hewan.jpg 
Organel sel yang berfungsi untuk tempat pembentukan energi dan penghasil enzim hidrolitik untuk pencernaan intraseluler ditunjukkan oleh nomor ... .
""", R.mipmap.ipa_kelas9_soal50),
            Pair("""51. Perhatikan gambar di bawah ini
Ciri hidup yang ditunjukkan gambar secara berturut – turut adalah ... .
""", R.mipmap.ipa_kelas9_soal51)),

        listOf(Pair("""52. Iza mendapat tugas mengidentifikasi tanaman yang ada di lingkungan tempat tinggalnya. Ia melakukan identifikasi terhadap dua macam tanaman seperti tampak pada gambar berikut.
Berdasarkan persamaan dan perbedaan ciri yang dimiliki, Iza mengelompokan tumbuhan A dan B  ke dalam kelas yang berbeda. Perbedaan tumbuhan A dan B adalah ….
""", R.mipmap.ipa_kelas9_soal52),
            Pair("""53. Penggunaan pupuk buatan yang mengandung fosfat di lahan pertanian jika dilakukan secara berlebihan dapat meningkatkan kandungan unsur hara diperairan. Akibatnya tanaman air seperti ganggang atau enceng gondok tumbuh dengan subur dan menghambat masuknya cahaya matahari ke air. Akibat lain pada lingkungan perairan adalah … .
""", 0),
            Pair("""54. Perhatikan gambar jaring-jaring makanan berikut
jaring2 
Organisme yang menduduki tingkat trofik ke II adalah … .
""", R.mipmap.ipa_kelas9_soal54)),

        listOf(Pair("""55. Perhatikan gambar berikut ini
Cara kerja otot dan jenis gerak yang sesuai untuk gambar dibawah adalah ... .
""", R.mipmap.ipa_kelas9_soal55),
            Pair("""56. Perhatikan tabel berikut
Pasangan yang tepat antara organ penghasil, nama enzim, dan fungsinya adalah … .
""", R.mipmap.ipa_kelas9_soal56),
            Pair("""57. Tangan Rahma terkena pisau pada saat membantu ibunya memasak di dapur. Setelah lukanya dibersihkan dan diobati,  beberapa saat kemudian darah dari lukanya berhenti. Bagian darah yang berperan pada penutupan luka tersebut adalah … .
""", 0)),

        listOf(Pair("""58. Beberapa jenis gangguan pada sistem pernapasan sebagai berikut.
1) Kontraksi yang kaku dari bronkus
2) Infeksi oleh virus atau bakteri patogen pada alveolus
3) Peradangan pada selaput pembungkus paru-paru
4) Kerusakan dinding alveolus akibat kebiasaan merokok
5) Terganggunya pengangkutan oksigen ke sel-sel/jaringan tubuh 
Gangguan yang menyebabkan terjadinya enfisema dan asfiksi berturut- turut adalah … .
""", 0),
            Pair("""59. Perhatikan gambar di bawah ini
Pasangan antara nama bagian yang ditunjuk, proses yang terjadi, dan hasil yang terbentuk adalah … .
""", R.mipmap.ipa_kelas9_soal59),
            Pair("""60. Seorang pasien menderita suatu penyakit dengan gejala-gejala seperti berikut.
1) Timbul luka pada alat kelamin, rektum, lidah, atau bibir tetapi tidak terasa sakit.
2) Terjadi pembengkakan kelenjar getah bening di seluruh tubuh.
3) Timbul bercak kemerahan terutama di telapak tangan dan kaki. 
Berdasarkan gejalanya, pasien tersebut didiagnosis menderita penyakit reproduksi yang disebabkan oleh bakteri. Pasangan yang tepat antara jenis bakteri yang dimaksud dengan nama penyakitnya adalah … .
""", R.mipmap.ipa_kelas9_soal60)),

        listOf(Pair("""61. Perhatikan gambar berikut
Bagian yang berperan untuk pertumbuhan memanjang batang adalah … .
""", R.mipmap.ipa_kelas9_soal61),
            Pair("""62. Pada musim kemarau lapangan di sekolah Kamila tampak menguning, karena rerumputan mengeringkan atau mematikan daunnya. Namun ketika musim hujan tiba, lapangan tersebut berubah menjadi hijau kembali karena rerumputan mulai bersemi. Tumbuhan melakukan perilaku demikian tujuannya adalah … .
""", 0),
            Pair("""63. Seorang pemulia tanaman menyilangkan tanaman terung ungu bulat dengan ungu lonjong. Sifat bulat dominan terhadap lonjong dan sifat ungu dominan terhadap hijau. Dari persilangan tersebut dihasilkan keturunan sebanyak 1.300 tanaman dengan perbandingan variasi keturunan ungu bulat : ungu lonjong : hijau bulat : hijau lonjong = 3:3:1:1. Genotip kedua induk tanaman tersebut adalah … .
""", 0)),

        listOf(Pair("""64. Perhatikan rangkaian dan data hasil percobaan fotosintesis berikut
Tabel data hasil percobaan fotosintesis
Berdasarkan hasil percobaan dibawah, kesimpulan yang tepat adalah … .
""", R.mipmap.ipa_kelas9_soal64),
            Pair("""65. Azizah pergi ke pasar membeli beberapa produk hasil fermentasi. Dia ingin mengetahui bahan asal dan mikroorganisme yang berperan dalam proses fermentasi tersebut. Berikut daftar belanja Azizah:
""", R.mipmap.ipa_kelas9_soal65),
            Pair("""66. Pembelahan sel pada makhluk hidup ada 2 jenis, yaitu pembelahan sel secara mitosis dan meiosis. 
Pernyataan di bawah ini yang menunjukkan ciri dari pembelahan meiosis adalah…
""", 0)),

        listOf(Pair("""67. Perhatikan pernyataan berikut
1) Kromosom mengganda kemudian memadat
2) Kromosom berjajar pada bidang equator
3) Terbentuk 2 sel anakan yang bersifat diploid
4) Kromosom bergerak menuju kutub yang berlawanan
Ciri tahap anafase pada pembelahan mitosis ditunjukkan oleh nomor…
""", 0),
            Pair("""68. Perhatikan pernyataan berikut 
1)  Berjumlah sepasang
2)  Menghasilkan cairan kental berwarna kuning yang melindungi sperma
3)  Memanfaatkan gula fruktosa sebagai sumber energi bagi sperma
Organ reproduksi pada laki-laki yang memiliki ciri-ciri berdasarkan pernyataan tersebut adalah
""", 0),
            Pair("""69. Berikut ini saluran reproduksi pada pria secara urut adalah ….
""", 0)),

        listOf(Pair("""70. Perhatikan gambar berikut 
Fungsi dari organ yang ditunjuk oleh no (1) dan (4) secara berurutan adalah…
""", R.mipmap.ipa_kelas9_soal70),
            Pair("""71. Pernyataan berikut ini yang benar adalah ….
""", 0),
            Pair("""72. Pernyataan yang tidak benar mengenai oogenesis adalah ….
""", 0)),

        listOf(Pair("""73. Suatu penyakit memiliki ciri-ciri berikut: Terdapat bekas luka/borok sebagai tempat masuk bakteri, menyerang daerah kelamin, dan disebabkan oleh Treponema pallidum.
Ciri-ciri penyakit dibawah dimiliki oleh orang yang menderita penyakit…..
""", 0),
            Pair("""74. Berdasarkan caranya proses penyerbukan pada tanaman jagung dan padi adalah…
""", 0),
            Pair("""75 . Seseorang memotong bagian batang dari 2 jenis tumbuhan yang berbeda varietas, lalu menyambungkan batang tumbuhan pertama pada batang tumbuhan kedua dengan cara mengikatnya dengan tali.
Teknologi reproduksi pada tumbuhan yang dilakukan oleh orang tersebut adalah…
""", 0)),

        listOf(Pair("""76 . Perhatikan gambar berikut 
Bagian dari organ bunga pada tumbuhan berbiji yang berfungsi sebagai perhiasan bunga ditunjukan oleh nomor ....
""", R.mipmap.ipa_kelas9_soal76),
            Pair("""77 . Berikut yang termasuk contoh tumbuhan yang melakukan reproduksi dengan menghasilkan tunas yang keluar dari lapisan umbi adalah…
""", 0),
            Pair("""78 . Hewan-hewan berikut yang mengalami metamorphosis sempurna dalam daur hidupnya adalah…
""", 0)),

        listOf(Pair("""79 . Perhatikan pernyataan berikut 
1)  Mengambil sel telur hewan betina dari ovarium
2)  Pembuahan oleh sel sperma di luar tubuh
3)  Transplantasi embrio ke dalam rahim induknya/induk pengganti.
Jenis teknologi yang memiliki ciri-ciri berdasarkan pernyataan tersebut adalah…
""", 0),
            Pair("""80 . Untuk mencari tahu apakah biji tumbuh lebih baik di tempat terang, kita dapat melakukan kegiatan…
""", 0),
            Pair("""81 . Perhatikan karakteristik perkembangbiakan berikut 
1) Memerlukan dua induk
2) Tidak diawali dengan fertilisasi
3) Sifat anak yang dihasilkan bervariasi
4) Anakan berasal dari tubuh induknya
Ciri perkembangbiakan secara seksual (generatif) ditunjukkan oleh nomor…
""", 0)),

        listOf(Pair("""82 . Perhatikan beberapa macam genotip berikut
1) AaBb        4) CcDD
2) aaDD        5) CcDd
3) Aabb
Genotip heterozigot sempurna ditunjukkan oleh nomor…        
""", 0),
            Pair("""83 . Jika tanaman mawar berbunga merah disilangkan dengan mawar berbunga putih. Dihasilkan F1 seluruhnya berwarna merah. Hal ini menunjukkan bahwa…
""", 0),
            Pair("""84 . Tanaman bergenotip Hh intermediet mempunyai fenotip abu-abu. Jika disilangkan antar sesamanya, maka perbandingan fenotip hasil keturunannya adalah….
""", 0)),

        listOf(Pair("""85 . Persilangan antara sesama F1 menghasilkan F2 dengan perbandingan HH : Hh : hh = 1 : 2 : 1. Jika pada F2 dihasilkan 68 tanaman, maka jumlah tanaman yang bergenotip homozigot dominan adalah…
""", 0),
            Pair("""86 . Kambing berambut hitam dan tipis lebih disukai daripada kambing berambut putih dan tebal. Pada kambing, sifat rambut hitam (H) dominan terhadap rambut putih (h) dan sifat rambut tebal (T) dominan terhadap rambut tipis (t). Untuk mendapatkan keturunan yang semuanya berambut hitam dan tipis, genotipe induk kambing yang harus dikawinkan adalah…
""", 0),
            Pair("""87 . Alasan Mendel menggunakan kacang ercis dalam percobaannya adalah…
""", 0)),

        listOf(Pair("""88 . Pernyataan berikut yang bukan tujuan dari persilangan adalah…
""", 0),
            Pair("""89 . Kelainan yang dialami manusia berikut, yang bersifat menurun melalui gen adalah…
""", 0),
            Pair("""90 . Perhatikan gambar berikut 
Gambar yang menunjukan aliran elektron adalah …
""", R.mipmap.ipa_kelas9_soal90)),

        listOf(Pair("""91 . Perhatikan gambar atom berikut 
Model atom tersebut terdiri atas …
""", R.mipmap.ipa_kelas9_soal91),
            Pair("""92 . Bila penggaris plastik digosokkan dengan rambut yang bermuatan listrik, maka hal yang terjadi pada plastik dan rambut adalah …
""", 0),
            Pair("""93 . Perhatikan gambar berikut 
Alat tersebut di gunakan untuk …
""", R.mipmap.ipa_kelas9_soal93)),

        listOf(Pair("""94 . Suatu benda bermuatan positif jika benda itu…
""", 0),
            Pair("""95 . Dua benda masing-masing bermuatan -4 × 10-8 C dan +2 × 10-8 C terpisah pada jarak 2 cm. Gaya coloumb yang terjadi pada dua muatan tersebut adalah … (Besarnya konstanta (k) = 9×109 Nm2/C2)
""", 0),
            Pair("""96 . Perhatikan gambar sel saraf berikuk 
Bagian yang berfungsi untuk menerima rangsangan dari luar sel dan mengirimnya ke badan sel adalah bagian nomer …
""", R.mipmap.ipa_kelas9_soal96)),

        listOf(Pair("""97 . Jalan rangsangan saraf hingga memberikan respon adalah …
""", 0),
            Pair("""98 . Perubahan energi yang terjadi pada baterai yang menyalakan senter adalah …
""", 0),
            Pair("""99 . Perhatikan ciri-ciri penyusun elemen berikut
1) Timbal oksida sebagai kutub positif
2) Timbal murni (Pb) sebagai kutub negatif
3) Asam sulfat sebagai larutan elektrolit
Zat tersebut merupakan penyusun dari salah satu jenis elemen sekunder, yaitu…
""", 0)),

        listOf(Pair("""100. Perhatikan gambar tersebut dengan seksama.
Jika di ketahui I1=12A, I2=5A dan I3=8A, maka besar I4adalah….
""", 0),
            Pair("""101. Perhatikan gambar tersebut
Besarnya hambatan pengganti dari gambar berikut adalah…
""", R.mipmap.ipa_kelas9_soal101),
            Pair("""102. Perhatikan ciri suatu rangkaian listrik berikut
1)  Kuat arus terbagi menjadi beberapa cabang
2)  Terdapat satu lintasan arus listrik
3)  Hambatan disusun berdampingan
4)  Beda potensial di setiap ujung hambatan sama besar
Yang merupakan ciri dari rangkaian paralel adalah...
""", 0)),

        listOf(Pair("""103. Pada sebuah rumah terdapat 6 lampu masing-masing 10 Watt yang menyala selama 5 jam sehari, dan TV 50 Watt yang menyala 4 jam sehari. Harga tiap kWh adalah Rp 100. Biaya yang harus dibayarkan selama 1 bulan (30 hari) adalah...""", 0),
            Pair("""104. Perhatikan rangkaian lampu berikut
Apabila saklar 1 ditutup, maka yang terjadi adalah…
""", R.mipmap.ipa_kelas9_soal104),
            Pair("""105. Sumber energi listrik alternatif, bila terjadi kebocoran maka akan menimbulkan radioaktif yang dapat membunuh jutaan manusia. Kelemahan tersebut merupakan akibat dari penggunaan energi listrik dengan menggunakan….
""", 0)),

        listOf(
            Pair("""106. Perubahan energi yang terjadi pada baterai yang menyalakan senter adalah ….
""", 0),
            Pair("""107. Pemuliaan tanaman dapat dilakukan dengan cara ....""", 0),
            Pair("""108. Urutan saluran reproduksi pria, pertama adalah : testis, kemudian …,…. Uretra, dan ….
""", 0)),

        listOf(Pair("""109. Sebuah penggaris plastik yang digosokkan pada kain wol akan bermuatan … karena ….
""", 0),
            Pair("""110. Berikut yang bukan alat reproduksi laki laki adalah...""", 0),
            Pair("""111. Bakal biji tumbuhan ini berada dalam buah/ovarium, jenis tumbuhan ini dikenal dengan …
""", 0)),

        listOf(Pair("""112. Gaya Coulomb yang dialami oleh muatan A dan B adalah 7 × 10–4 N. Jika besar muatan B adalah 2 × 10–6 C, maka besar kuat medan
listrik yang dirasakan oleh muatan B adalah ….
""", 0),
            Pair("""113. Pernyataan yang benar terkait dengan jumlah kromosom spermatogonium dan spermatozoa adalah ....""", 0),
            Pair("""114. Salah satu keuntungan energi matahari adalah ….
""", 0)),

        listOf(Pair("""115. Ruang di sekitar suatu muatan listrik yang jika muatan listrik lain diletakkan dalam ruang ini akan mengalami gaya listrik disebut...""", 0),
            Pair("""116. Berapa jumlah kromosom yang dimiliki suatu individu (manusia) …
""", 0),
            Pair("""117. Dalam atom, terdapat berbagai penyusun. Salah satunya adalah proton yang memiliki muatan …
""", 0)),

        listOf(Pair("""118. Sebuah sekering dipasang pada tegangan 250 V, menyebabkan arus mengalir 2 A. Besarnya daya sekering tersebut adalah...""", 0),
            Pair("""119. Berbagai hewan yang memiliki kemampuan menghasilkan muatan listrik umumnya memiliki sistem khusus pada tubuhnya yang disebut sebagai...""", 0),
            Pair("""120. Atom bermuatan positif memiliki...""", 0)),

        listOf(Pair("""121. Jaringan permanen yang masih mampu melakukan pembelahan adalah jaringan...""", 0),
            Pair("""122. Hormon yang memicu berkembangnya folikel dan penebalan dinding rahim secara berturut-turut adalah ....""", 0),
            Pair("""123. Bagian testis yang berperan dalam produksi sperma dan hormon testosteron disebut ....""", 0)),

        listOf(Pair("""124. Dalam suatu benda di kehidupan sehari-hari, terdapat ‘kumpulan listrik’ yang dikenal dengan istilah …
""", 0),
            Pair("""125. Dua anak kembar berjenis kelamin laki-laki dan perempuan. Pernyataan berikut yang benar mengenai penyusunan genetik mereka adalah...""", 0),
            Pair("""126. Siapakah orang yang pertama kali menyebutkan bahwa bumi adalah sebuah magnet?""", 0)),

        listOf(Pair("""127. Apa yang dimanfaatkan oleh burung dengan menggunakan partikel magnetik pada tubuhnya supaya tercipta peta navigasi?""", 0),
            Pair("""128. Berikut pemanfaatan magnet pada migrasi hewan, kecuali …
""", 0),
            Pair("""129. Magnet pada bakteri digunakan untuk melakukan navigasi dan bermigrasi. Dan beberapa bakteri memiliki flagella yaitu …
""", 0)),

        listOf(Pair("""130. Siapakah yang meneliti kemampuan lobster duri dalam mendeteksi medan magnet untuk bermigrasi?""", 0),
            Pair("""131. Perhatikan gambar berikut
Berdasarkan gambar tersebut, di dalam tubuh bakteri magnetotatic bacteria (MTB) terdapat organel yang berfungsi sebagai alat navigasi untuk memanfaatkan medan magnet, yaitu …
""", 0),
            Pair("""132. Benda yang memiliki kemampuan dapat menarik benda lain disebut …
""", 0)),

        listOf(Pair("""133. Magnet memiliki 2 kutub yaitu kutub utara dan selatan. Jika kutub-kutub yang senama didekatkan maka akan …
""", 0),
            Pair("""134. Berdasarkan sifat interaksi bahan terhadap magnet, terdapat 3 jenis sifat benda yaitu, kecuali …
""", 0),
            Pair("""135. Benda yang dapat ditarik kuat oleh magnet seperti, besi baja, kobalt, dan nikel, disebut …
""", 0)),

        listOf(Pair("""136. Benda yang dapat ditarik lemah oleh magnet, seperti magnesium, lithium, dan molybdenum, disebut …
""", 0),
            Pair("""137. Pengertian dari diamagnetik adalah …
""", 0),
            Pair("""138. Berikut beberapa alat yang dipakai dalam kehidupan sehari-hari yang merupakan penerapan teori elektromagnet, kecuali …
""", 0)),

        listOf(Pair("""139. Kawat yang memiliki arus dalam medan magnet akan mengalami Gaya Lorentz, yang artinya …
""", 0),
            Pair("""140. Cara menghilangkan kemagnetan dapat dihilangkan dengan cara mengacak medan magnet seperti berikut ini, kecuali …
""", 0),
            Pair("""141. Pemanfaatan makhluk hidup untuk menghasilkan produk yang bermanfaat bagi manusia, disebut dengan …
""", 0)),

        listOf(Pair("""142. Makhluk hidup yang berukuran sangat kecil dan harus menggunakan mikroskop untuk melihatnya, disebut …
""", 0),
            Pair("""143. Bioteknologi yang menggunakan mikroorganisme sebagai alat untuk menghasilkan produk dan jasa, disebut …
""", 0),
            Pair("""144. Terdapat 3 jenis mikroorganisme pada ragi tape seperti berikut ini, kecuali …
""", 0)),

        listOf(Pair("""145. Makanan yang dihasilkan dari fermentasi dengan menumbuhkan jamur Rhizopus oryzae dan Rhizopus oligosporus adalah …
""", 0),
            Pair("""146. Pada pembuatan roti, fermentasi dibantu oleh yeast (khamir) yang merupakan jamur yang dicampurkan pada adonan tepung dan dapat menghasilkan …
""", 0),
            Pair("""147. Kegiatan manipulasi gen untuk mendapatkan produk baru dengan cara membuat DNA baru yaitu dengan cara menghilangkan atau menambah gen tertentu disebut …
""", 0)),

        listOf(Pair("""148. Klorofil merupakan senyawa yang tersusun dari beberapa atom seperti berikut ini, kecuali …
""", 0),
            Pair("""149. Berikut merupakan beberapa contoh proses kimia yang terjadi di alam dan dapat menjaga keseimbangan alam, kecuali …
""", 0),
            Pair("""150. Unit terkecil dari suatu materi disebut …
""", 0)),

        listOf(Pair("""151. Perhatikan gambar berikut ini
Jika pada sebuah benda mempunyai berat sebesar 50 N, namun pada saat di dalam air beratnya berubah menjadi 45 N. Maka gaya keatas yang memberikan tekanan pada benda yaitu sebesar…
""", 0),
            Pair("""152. Jika pada sebuah benda mempunyai berat sebesar 50 N, namun pada saat di dalam air beratnya berubah menjadi 45 N. Maka gaya keatas yang memberikan tekanan pada benda yaitu sebesar…. N
""", 0),
            Pair("""153. Hukum yang berlaku pada proses pengukuran tekanan darah dengan menggunakan bantuan alat tensiometer yaitu….
""", 0)),

        listOf(Pair("""154. Salah satu struktur yang ada pada laring dengan fungsinya untuk mencegah adanya barang asing yang masuk ke dalam laring dan trakea adalah…
""", 0),
            Pair("""155. Di dalam jaringan paru-paru yang mempunyai fungsi untuk tempat pertukaran oksigen dan karbon dioksida yaitu…
""", 0),
            Pair("""156. Hormon yang memicu berkembangnya folikel dan penebalan dinding rahim secara berturut-turut adalah ....""", 0))
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. sel kelamin","b. sel tubuh","c. sel induk","d. sel anak"),
            listOf("a. spermatogonium – spermatosit primer - spermatosit sekunder – spermatid – spermatozoa","b. spermatogonium – spermatosit primer - spermatosit sekunder – spermatosit tersier - spermatid","c. spermatogonium – spermatosit primer - spermatid – spermatozoa– spermatosit sekunder","d. spermatosit primer – spermatosit sekunder – spermatosit tersier – spermatid"),
            listOf("a. ovarium – fimbriae – oviduk – servik – vagina - uterus","b. ovarium – fimbriae - servik – vagina – uterus - oviduk","c. oviduk – servik – vagina – uterus - ovarium – fimbriae","d. ovarium – fimbriae - oviduk - uterus – servik – vagina")
        ),
        listOf(
            listOf("a. testis","b. tubulus seminiferus","c. epididimis","d. kelenjar prostat"),
            listOf("a. ovulasi","b. ovipar","c. menstruasi","d. fertilisasi"),
            listOf("a. ovarium","b. ovum","c. oviduk","d. uterus")
        ),
        listOf(
            listOf("a. zygot, morula, gastrula, blastula","b. zygot, morula, blastula, gastrula","c. zygot, blastula, morula, gastrula","d. morula, zygot, blastula, gastrula"),
            listOf("a. estrogen","b. progesteron","c. prolaktin","d. testosteron"),
            listOf("a. sifilis","b. kanker ovarium","c. gonorhoe","d. herpes genetalis")
        ),
        listOf(
            listOf("a. AIDS tubuh seseorang","b. herpes","c. gonorhoe","d. sifilis"),
            listOf("a. peralatan operasi harus steril","b. menggunakan jarum suntik yang steril dan sekali pakai","c. tidak perlu melakukan donor darah","d. memeriksa darah sebelum melakukan transfusi darah"),
            listOf("a. kembar identik","b. kembar normal","c. kembar fraternal","d. kembar siam")
        ),
        listOf(
            listOf("a. FSH dan LH","b. testosteron dan FSH","c. testosteron oleh testis dan estrogen oleh ovarium","d. sperma oleh pria atau ovum oleh wanita"),
            listOf("a. generatif","b. vegetatif alami","c. seksual","d. vegetatif buatan"),
            listOf("a. mencangkok","b. mengenten","c. okulasi","d. setek")
        ),
        listOf(
            listOf("a. biji mangga tumbuh menjadi pohon","b. biji kedelai tumbuh menjadi kecambah","c. Nur menanam tunas bunga mawar","d. Rudi menanam kunir dengan membenamkan rhizomanya"),
            listOf("a. P","b. Q","c. R","d. S"),
            listOf("a. 1, 2, 4, 3","b. 1, 3, 2, 4","c. 2. 3, 4. 1","d. 3, 4. 1, 2")
        ),
        listOf(
            listOf("a. membelah diri","b. tunas","c. fragmentasi","d. parthenogenesis"),
            listOf("a. telur – nimfa – dewasa","b. telur – pupa – larva – dewasa","c. telur - larva - pupa – dewasa","d. telur - nimfa - pupa – dewasa"),
            listOf("a. 1) dan 2)","b. 1) dan 3)","c. 2) dan 3)","d. 2 dan 4)")
        ),
        listOf(
            listOf("a. hidroponik","b. kultur jaringan","c. rumah kaca","d. rekayasa genetika"),
            listOf("a. entomokori","b. mamokori","c. kiroptokori","d. ornitokori"),
            listOf("a. protonema","b. protalium","c. tumbuhan paku muda","d. sporogonium")
        ),
        listOf(
            listOf("a. kloning","b. bayi tabung","c. inseminasi buatan","d. transplantasi inti"),
            listOf("a.  I –  II – III ","b.  I – III – II","c.  III – I – II","d.  III – II  – I"),
            listOf("a.   ","b.      ","c.      ","d.   ")
        ),
        listOf(
            listOf("a. 1 dan 2","b. 1 dan 3","c. 2 dan 4","d. 3 dan 4"),
            listOf("a. 122oF","b. 102oF","c. 90oF","d. 58oF "),
            listOf("a. 20 detik","b. 30 detik","c. 40 detik","d. 50 detik")
        ),
        listOf(
            listOf("a. Kotak 1, 2, dan 3","b. Kotak 1, 4, dan 5","c. Kotak 2, 3, dan 5","d. Kotak 3, 4, dan 5"),
            listOf("a. Udin dan Raju","b. Raju dan Desta","c. Desta dan Roy","d. Udin dan Roy"),
            listOf("a. tekanan terbesar terjadi pada penyelam  P3","b. P1 memiliki tekanan hidrostatis paling besar di bandingkan P2","c. tekanan hidrostatis yang terjadi pada  penyelam P2 lebih besar dari P3","d. tekanan yang terjadi pada penyelam P3 sama dengan tekanan pada penyelam P2 ditambah P1")
        ),
        listOf(
            listOf("a. 720 N","b. 360 N","c. 240 N","d. 180 N"),
            listOf("a. energi kinetik semakin besar, energi mekanik semakin kecil, dan energi potensial semakin kecil","b. energi kinetik semakin kecil, energi mekanik semakin besar, dan energi potensial semakin besar","c. energi kinetik semakin besar, energi mekanik tetap, dan energi potensial semakin kecil","d. energi kinetik semakin kecil, energi mekanik tetap, dan energi potensial semakin besar"),
            listOf("a. 3 dioptri         ","b. 2⅔  dioptri          ","c. 2 dioptri        ","d. ⅓ dioptri")
        ),
        listOf(
            listOf("a. (1), (3), dan (5)","b. (1), (4), dan (6)","c. (2), (4), dan (5)","d. (3), (4), dan (6)"),
            listOf("a. 1 dan 5","b. 5 dan 1","c. 3 dan 7","d. 7 dan 3"),
            listOf("a. (1) dan  (4)       ","b. (2) dan  (3)          ","c. (3) dan  (2)          ","d. (4) dan  (1)")
        ),
        listOf(
            listOf("a. maya, tegak, diperbesar","b. maya, terbalik, diperkecil","c. nyata, tegak, diperbesar","d. nyata, terbalik, diperkecil"),
            listOf("a. 2 N","b. 8 N","c. 16 N","d. 32N"),
            listOf("a. 6,0 A","b. 4,0 A","c. 2,4 A","d. 2,0 A")
        ),
        listOf(
            listOf("a. Rp. 22.525       ","b. Rp. 23.255      ","c. Rp. 25. 235       ","d. Rp. 26.325;"),
            listOf("a. kutub U kompas tarik-menarik dengan L tetapi tolak-menolak dengan M","b. kutub U kompas tarik-menarik dengan K tetapi tolak-menolak dengan M","c. kutub S kompas tarik-menarik dengan L tetapi tolak- menolak dengan M","d. kutub S kompas tarik-menarik dengan M tetapi tolak-menolak dengan L"),
            listOf("a.","b.","c.","d.")
        ),
        listOf(
            listOf("a. P dan Q           ","b. P dan T         ","c. Q dan R       ","d. Q dan S"),
            listOf("a. 1, 2, dan 5","b. 1, 3, dan 4","c. 2, 4, dan 5","d. 3, 4, dan 5"),
            listOf("a. 1 dan 2","b. 1 dan 3","c. 2 dan 4","d. 3 dan 4")
        ),
        listOf(
            listOf("a. memutar mikrometer ","b. memutar diafragma mikroskop","c. mengganti perbesaran lensa obyektif","d. menggeser posisi preparat hingga posisi tepat di bawah lensa"),
            listOf("a. 1 dan 8","b. 2 dan 7","c. 3 dan 6","d. 4 dan 5"),
            listOf("a. tumbuh dan berkembang, adaptasi, peka terhadap rangsang ","b. berkembang biak, bergerak, peka terhadap rangsang","c. membutuhkan nutrisi, adaptasi, bergerak ","d. tumbuh, bergerak, adaptasi")
        ),
        listOf(
            listOf("a.","b.","c.","d."),
            listOf("a. menurunnya kandungan CO2 terlarut","b. menurunnya kandungan O2 terlarut","c. meningkatnya nilai pH di perairan","d. meningkatnya populasi ikan  "),
            listOf("a. pohon, rumput, dan tikus","b. katak, elang, dan tikus","c. ulat, belalang, dan tikus","d. ayam, katak, dan ular")
        ),
        listOf(
            listOf("a. bisep berkontraksi, trisep relaksasi, gerak fleksi","b. bisep berkontraksi, trisep relaksasi, gerak ekstensi","c. bisep relaksasi, trisep berkontraksi, gerak fleksi","d. bisep relaksasi, trisep berkontraksi, gerak ekstensi"),
            listOf("a. 1 – W – I ","b. 2 – Y – IV","c. 3 – X – II ","d. 4 – Z – III"),
            listOf("a. protrombin, fibrinogen, dan trombosit","b. keping darah, fibrinogen, dan antibodi","c. plasma darah, keping darah, dan serum","d. sel darah merah, fibrinogen, dan keping darah")
        ),
        listOf(
            listOf("a. 1) dan 2)","b. 2) dan 3)","c. 3) dan 4)","d. 4) dan 5)"),
            listOf("a.","b.","c.","d."),
            listOf("a.","b.","c.","d.")
        ),
        listOf(
            listOf("a. W, karena terdapat meristem primer ","b. X, karena terdapat meristem apikal","c. Y, karena terdapat primordia daun","d. Z, karena terdapat meristem aksilar"),
            listOf("a. mengurangi proses penguapan ","b. mengganti dengan daun yang baru","c. memperlambat proses fotosintesis","d. mempertahankan diri dari hewan pemangsa  "),
            listOf("a. UUBB dan UUbb","b. UuBB dan Uubb","c. UuBb dan UUbb","d. UuBu dan Uubb")
        ),
        listOf(
            listOf("a. penambahan NaHCO3 meningkatkan laju fotosintesis karena menurunkan kadar CO2 terlarut ","b. penambahan NaHCO3 meningkatkan laju fotosintesis karena meningkatkan kadar CO2 terlarut","c. penambahan NaHCO3 meningkatkan laju fotosintesis karena meningkatkan kadar O2 terlarut","d. penambahan NaHCO3 meningkatkan laju fotosintesis karena meningkatkan suhu di dalam air"),
            listOf("a. 1 dan 2","b. 1 dan 3","c. 2 dan 3","d. 2 dan 4"),
            listOf("a. Terjadi pada sel tubuh makhluk hidup","b. Menghasilkan 4 sel anakan yang bersifat haploid","c. Jumlah dan sifat kromosom identik sama dengan induknya","d. Menghasilkan 2 sel anakan yang bersifat diploid")
        ),
        listOf(
            listOf("a. -1                ","b. -2","c. -3","d. -4"),
            listOf("a. Uretra       ","b. Skrotum","c. Vas deferens","d. Vesikula seminalis"),
            listOf("a. testis, vas deferens, epididimis, uretra, dan penis","b. testis, epididimis, vas deferens, uretra, dan penis","c. testis, uretra, vas deferens, epididimis, dan penis","d. testis, epididimis, uretra, vas deferens, dan penis")
        ),
        listOf(
            listOf("a. Tempat menghasilkan sel telur dan tempat perkembangan embrio","b. Tempat terjadinya fertilisasi dan tempat menghasilkan sel telur","c. Tempat perkembangan embrio dan tempat terjadinya fertilisasi","d. Tempat menghasilkan sel telur dan saluran penghubung antara rahim dan vagina"),
            listOf("a.  Jika ovum masak, maka dinding rahim menipis","b.  Jika terjadi menstruasi, maka dinding rahim menebal","c.  Jika dinding rahim menipis, maka terjadi ovulasi","d.  Jika ovum masak, maka dinding rahim menebal"),
            listOf("a.  Oogenesis dimulai sejak bayi dilahirkan","b.  Ketika bayi perempuan lahir proses pembentukan sel telur sampai pada fase pembentukan oosit primer","c.  Badan polar merupakan hasil pembelahan oosit sekunder secara meiosis","d.  Hasil akhir oogenesis adalah satu ovum dan tiga badan polar")
        ),
        listOf(
            listOf("a. Sifilis        ","b. Herpes genitalis","c. Kandidiasis","d. Klamidiasis"),
            listOf("a. Hidrogami        ","b. Kiropterogami","c. Anemogami","d. Ornitogami"),
            listOf("a. Mencangkok        ","b. Menyambung ","c. Menempel","d. Merunduk")
        ),
        listOf(
            listOf("a. a dan b        ","b. b dan c","c. c dan d","d. d dan e"),
            listOf("a. Jahe dan kentang","b. Tebu dan jagung","c. Lengkuas dan singkong","d. Bawang merah dan bawang Bombay"),
            listOf("a. Kupu-kupu, lalat, nyamuk","b. Katak, lebah madu, belalang","c. Kecoa, kupu-kupu, belalang","d. Jangkrik, katak, capung")
        ),
        listOf(
            listOf("a. Kloning","b. Inseminasi buatan","c. In vitro fertilization (bayi tabung)","d. Kehamilan"),
            listOf("a.  Meletakkan biji di tempat gelap dan hangat","b.  Meletakkan biji di tempat terang dan hangat","c.  Meletakkan biji, satu wadah di tempat gelap dingin dan wadah lainnya di tempat terang dingin","d.  Meletakkan biji, satu wadah di tempat terang dan wadah lainnya di tempat gelap"),
            listOf("a. (1) dan (2)       ","b. (2) dan (3)","c. (1) dan (3)","d. (2) dan (4)")
        ),
        listOf(
            listOf("a. (1) dan (4)        ","b. (1) dan (5)","c. (2) dan (3)","d. (3) dan (5)"),
            listOf("a. Sifat putih dominan terhadap merah","b. Sifat putih resesif terhadap merah","c. Sifat merah resesif terhadap putih","d. Sifat putih intermediat terhadap merah"),
            listOf("a. 1 putih : 3 hitam","b. 2 hitam : 2 putih","c. 1 hitam : 2 abu-abu : 1 putih","d. 2 hitam : 1 abu-abu : 1 putih")
        ),
        listOf(
            listOf("a. 17 tanaman       ","b. 34 tanaman","c. 51 tanaman","d. 68 tanaman"),
            listOf("a. HHTT >< hhtt       ","b. HhTt >< HhTt","c. hhTt >< hhTt","d. HHtt >< hhtt"),
            listOf("a. Tahan lama        ","b. Cepat berbuah","c. Tanaman menahun","d. Bunga berwarna putih")
        ),
        listOf(
            listOf("a.  Menghasilkan bibit unggul","b.  Tahan terhadap hama penyakit","c.  Menghasilkan sifat-sifat yang kurang baik","d.  Mampu bertahan pada saat terjadi perubahan iklim"),
            listOf("a. Buta warna dan tipes","b. Hemophilia dan Albino","c. Albino dan hipertensi","d. Demam berdarah dan buta warna"),
            listOf("a. A                ","b. B","c. C","d. D")
        ),
        listOf(
            listOf("a. 2 elektron, 2 proton, dan 2 neutron","b. 2 elektron, 2 proton, dan 1 neutron","c. 2 elektron, 1 proton, dan 2 neutron","d. 4 elektron, 2 proton, dan 1 neutron"),
            listOf("a.  Plastik bermuatan negatif, rambut bermuatan positif","b.  Plastik bermuatan positif, rambut bermuatan negatif","c.  Plastik bermuatan negatif, rambut bermuatan negatif","d.  Plastik bermuatan positif, rambut bermuatan positif"),
            listOf("a.  Memutus gaya listrik statis","b.  Mengukur beda potensial","c.  Mendeteksi adanya muatan listrik pada suatu benda","d.  Memindahkan muatan listrik dari suatu benda ke benda lain")
        ),
        listOf(
            listOf("a. Mendapatkan electron","b. Mendapatkan proton","c. Kehilangan neutron","d. Kehilangan electron"),
            listOf("a. Tarik-menarik 18×10-3 N","b. Tolak-menolak 18×10-3 N","c. Tarik-menarik 36×10-3 N","d. Tolak-menolak 36×10-3 N"),
            listOf("a. 1                        ","b. 2","c. 3","d. 4")
        ),
        listOf(
            listOf("a.  Rangsangan → reseptor→ saraf motor→ otak→ saraf sensorik→ efektor→ respon","b.  Rangsangan → reseptor→ saraf motor→ otak→ saraf sensorik→ efektor→ respon","c.  Rangsangan → reseptor→ saraf motor→ otak→ saraf sensorik→ sumsum tulang belakang→ respon","d.  Rangsangan → reseptor→ saraf penghubung → sumsum tulang belakang→ saraf motor→ efektor→ respon"),
            listOf("a. Kimia-listrik-cahaya","b. Listrik-mekanik-cahaya","c. Kimia-mekanik-cahaya","d. Mekanik-listrik-cahaya"),
            listOf("a. Baterai       ","b. Volta","c. Akumulator","d. Generator")
        ),
        listOf(
            listOf("a. 3A                ","b. 5A","c. 7A","d. 9A"),
            listOf("a. 25 Ohm       ","b. 40 Ohm","c. 65 Ohm","d. 100 Ohm"),
            listOf("a. (1) dan (2)        ","b. (2) dan (4)","c. (1) dan (4)","d. (2) dan (3)")
        ),
        listOf(
            listOf("a. Rp 1000       ","b. Rp 1500","c. Rp 2000","d. Rp 3000"),
            listOf("a. Semua lampu mati","b. Lampu 2 dan 3 menyala","c. Semua lampu menyala","d. Lampu 1 dan 3 mati"),
            listOf("a. Turbin        ","b. Nuklir.","c. Panel surya","d. Batubara ")
        ),
        listOf(
            listOf("a. kimia-listrik-cahaya","b. listrik-mekanik-cahaya","c. kimia-mekanik-cahaya","d. mekanik-listrik-cahaya"),
            listOf("a. perkawinan silang","b. penanganan hama","c. melakukan pergiliran tanam","d. manipulasi lingkungan hidup"),
            listOf("a. vas deferens, penis, epididimis","b. epididimis, vas deferens, dan penis","c. uretra, epididimis, dan penis","d. epididimis, dan penis")
        ),
        listOf(
            listOf("a. negatif, muatan negatif dari kain wol berpindah ke plastik","b. positif, muatan positif dari kain wol berpindah ke penggaris plastik","c. positif, muatan negatif dari penggaris plastik berpindah ke kain wol","d. negatif, muatan positif dari penggaris plastik berpindah ke kain wol"),
            listOf("a. epididimis","b. vulva","c. uretra","d. testis"),
            listOf("a. lumut","b. tumbuhan paku","c. tumbuhan berbiji tertutup","d. tumbuhan berbiji ganda")
        ),
        listOf(
            listOf("a. 0,35 N/C","b. 3,5 N/C","c. 35 N/C","d. 350 N/C"),
            listOf("a. spermatogonium bersifat diploid, spermatozoa bersifat haploid","b. spermatogonium bersifat haploid, spermatozoa bersifat diploid","c. spermatogonium bersifat diploid, spermatozoa bersifat diploid","d. spermatogonium bersifat haploid, spermatozoa bersifat haploid"),
            listOf("a. tidak menghasilkan polusi","b. tidak dapat diperbaharui","c. efisien di beberapa iklim","d.tersedia sepanjang waktu")
        ),
        listOf(
            listOf("a. gaya listrik","b. induksi listrik","c. medan listrik","d. potensial listrik"),
            listOf("a. 37","b. 65","c. 11","d. 46"),
            listOf("a. positif","b. negatif","c. netral","d. tidak bermuatan")
        ),
        listOf(
            listOf("a. 2 W","b. 125 W","c. 220 W","d. 500 W"),
            listOf("a. elektrisitas","b. elektroda","c. elektroreseptor","d. neurotransmitter"),
            listOf("a. jumlah proton lebih dari jumlah elektron","b. jumlah proton kurang dari jumlah elektron","c. jumlah proton seimbang dengan jumlah elektron","d. semua jawaban salah")
        ),
        listOf(
            listOf("a. pengangkut","b. epidermis","c. parenkim","d. kolenkim"),
            listOf("a. LH dan FSH","b. LH dan estrogen","c. FSH dan progesteron","d. estrogen dan progesteron"),
            listOf("a. epididimis","b. vas deferens","c. vesikula seminalis","d. tubulus seminiferus")
        ),
        listOf(
            listOf("a. listrik statis","b. listrik dinamis","c. arus listrik","d. energy listrik"),
            listOf("a. Bayi laki-laki dan perempuan tersebut mewarisi sifat hanya dari sang ayah","b. Bayi laki-laki dan perempuan tersebut mewarisi sifat hanya dari sang ibu","c. Bayi laki-laki dan perempuan tersebut mewarisi sifat dari sang ayah dan ibu","d. Bayi laki-laki mewarisi sifat dari ayah dan bayi perempuan mewarisi sifat dari ibu"),
            listOf("a. Blaise Pascal","b. William Gilbert","c. Michael Faraday","d. Yohannes Keppler")
        ),
        listOf(
            listOf("a. Medan magnet bumi","b. Arah mata angin","c. Musim atau cuaca","d. Pergerakan sinar matahari"),
            listOf("a. Migrasi burung","b. Migrasi salmon","c. Migrasi penyu","d. Migrasi kera"),
            listOf("a. Berfungsi sebagai penarik","b. Berfungsi sebagai pengikat","c. Berfungsi sebagai pendorong","d. Berfungsi sebagai penyimpan")
        ),
        listOf(
            listOf("a. Comel","b. Kenneth Lohmann","c. Yohannes Keppler","d. Michael Faraday"),
            listOf("a. Flagella","b. Sel bakteri","c. Magnetosome","d. Seluruh organel"),
            listOf("a. Magnet","b. Besi","c. Baja","d. Alumunium")
        ),
        listOf(
            listOf("a. Tarik menarik","b. Tolak menolak","c. Dorong mendorong","d. Berdekatan"),
            listOf("a. Feromagnetik","b. Diamagnetik","c. Paramagnetic","d. Nanomagnetik"),
            listOf("a. Feromagnetik","b. Diamagnetik","c. Paramagnetic","d. Nanomagnetik")
        ),
        listOf(
            listOf("a. Feromagnetik","b. Diamagnetik","c. Paramagnetic","d. Nanomagnetik"),
            listOf("a. Benda yang tidak dapat ditarik oleh magnet","b. Benda yang dapat ditarik lemah oleh magnet","c. Benda yang dapat ditarik kuat oleh magnet","d. Benda yang kadang-kadang dapat ditarik oleh magnet"),
            listOf("a. Bel listrik","b. Saklar","c. Telepon kabel","d. Kompor")
        ),
        listOf(
            listOf("a. Arus listrik sebanding dengan gaya yang ditimbulkan","b. Arus listrik berbanding terbalik dengan gaya yang ditimbulkan","c. Arus listrik tidak sebanding dengan gaya yang ditimbulkan","d. Arus listrik tidak mengalami perubahan terhadap gaya yang ditimbulkan"),
            listOf("a. dipukul","b. dipanaskan","c. dililit magnet dengan arus bolak-balik (AC)","d. dililit magnet dengan arus searah (DC)"),
            listOf("a. Bioteknologi","b. Biologi","c. Biomolekuler","d. Bioplacenton")
        ),
        listOf(
            listOf("a. Mikroorganisme","b. Organisme","c. Mikrobiologi","d. Biologi"),
            listOf("a. Bioteknologi pangan tradisional","b. Bioteknologi pangan konvensional","c. Bioteknologi pangan modern","d. Bioteknologi pangan canggih"),
            listOf("a. Aspergillus sp","b. Saccharomyces cerevisiae","c. Acetobacter aceti","d. Lactobacillus bulgaricus")
        ),
        listOf(
            listOf("a. Kecap","b. Keju","c. Tempe","d. Yoghurt"),
            listOf("a. Gas O2 dan alkohol","b. Gas CO2 dan alkohol","c. Gas O2 dan air","d. Gas CO2 dan air"),
            listOf("a. Rekayasa organisme","b. Rekayasa biologi","c. Rekayasa mikroorganisme","d. Rekayasa genetik")
        ),
        listOf(
            listOf("a. Karbon (C) dan Oksigen (O)","b. Hidrogen (H) dan Nitrogen (N)","c. Oksigen (O) dan Magnesium (Mg)","d. Karbondioksida (CO2) dan Air (H2O)"),
            listOf("a. Pembentukan glukosa pada fotosintesis","b. Penguraian sampah","c. Siklus gas karbondioksida dan siklus nitrogen","d. Siklus makanan berantai"),
            listOf("a. Atom","b. Elektron","c. Neutron","d. Proton")
        ),
        listOf(
            listOf("a. 45","b. 50","c. 25","d. 5"),
            listOf("a. 45","b. 50","c. 25","d. 5"),
            listOf("a. Newton","b. Archimedes","c. Pascal","d. Boyle")
        ),
        listOf(
            listOf("a. Pita suara","b. Epiglotis","c. Silia","d. Tonsil"),
            listOf("a. Laring","b. Bronkus","c. Bronkiolus","d. Alveolus"),
            listOf("a. LH dan FSH","b. LH dan estrogen","c. FSH dan progesteron","d. estrogen dan progesteron")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(1,0,3),
        listOf(2,0,2),
        listOf(1,3,3),
        listOf(0,2,0),
        listOf(3,1,3),
        listOf(3,2,0),
        listOf(1,2,1),
        listOf(0,2,1),
        listOf(2,2,2),
        listOf(3,0,0),
        listOf(2,1,0),
        listOf(1,3,1),
        listOf(2,0,0),
        listOf(3,3,2),
        listOf(3,2,3),
        listOf(3,1,2),
        listOf(0,0,0),
        listOf(3,1,2),
        listOf(0,2,0),
        listOf(3,1,3),
        listOf(1,0,3),
        listOf(1,2,1),
        listOf(3,3,1),
        listOf(0,3,0),
        listOf(0,2,1),
        listOf(2,3,0),
        listOf(2,3,2),
        listOf(1,1,2),
        listOf(0,3,1),
        listOf(2,1,0),
        listOf(0,0,2),
        listOf(3,0,0),
        listOf(3,0,2),
        listOf(3,2,2),
        listOf(1,1,1),
        listOf(0,0,1),
        listOf(0,1,2),
        listOf(3,0,0),
        listOf(2,3,0),
        listOf(3,2,0),
        listOf(2,2,3),
        listOf(0,2,1),
        listOf(0,3,2),
        listOf(1,2,0),
        listOf(1,3,0),
        listOf(2,0,3),
        listOf(0,3,0),
        listOf(0,1,3),
        listOf(2,1,3),
        listOf(3,3,0),
        listOf(3,3,2),
        listOf(1,3,2)




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
            val getData = soalIpasd9[jawabanBenar6][i]
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

                            if (jawabanBenar6 == soalIpasd9.size) {
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
                                    val getData = soalIpasd9[jawabanBenar6][i]
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