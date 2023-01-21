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

class SoalPaiKelas9 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalPaisd9: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Meyakini dengan sepenuh hati bahwa dunia yang kita tempati beserta isinya ini akan hancur dan berganti
dengan kehidupan yang kekal abadi sebagai tempat pembalasan atas semua amal perbuatan di dunia, adalah pengertian dari iman kepada ….
""", 0),
            Pair("""2. Hancurnya alam semesta ketika ditiupkan Sasangkala yang pertama kali oleh malaikat Isrofil sehingga alam dunia musnah 
dan berganti dengan alam baru disebut ....
""", 0),
            Pair("""3. Peristiwa manusia setelah kematiannya berada di Alam kubur sampai datang Kiamat dan kemudian dibangkitkannya dari kuburnya tersebut
kemudian mereka akan dihalau disebuah padang yang luas berkumpul seluruh manusia sejak nabi Adam sampai manusia terakhir, yaitu padang ....
""", 0)),

        listOf(Pair("""4. Firman Allah Ta’ala yang menjelaskan tentang ditunjukkannya amaliyah di dunia walau seberat “zarrah” adalah ....  """, R.mipmap.pai_kelas9_soal4),
            Pair("""5. Peristiwa dibangkitkannya manusia dari alam kubur setelah malaikat Israfil meniupkan sangkakala yang kedua kalinya dinamakan ….
""", 0),
            Pair("""6. Pada hari akhir nanti ummat manusia akan ditimbang segala amal perbuatannya pada waktu hidup di dunia, yang berat timbangan
kebaikannya akan mendapat penghidupan yang menyenangkan dan yang ringan timbangan kebaikannya akan dimasukkan ke dalam neraka Hawiah
Peristiwa tersebut dinamakan ....
""", 0)),

        listOf(Pair("""7. Perhatikan pernyataan-pernyataan berikut :
1) kematian atau wafatnya seseorang
2) hancurnnya seluruh alam semesta
3) bencana Tsunami dan tanah longsor 
4) dibangkitkannya manusia dari alam kubur
Dari pernyataan-pernyataantersebut di atas, yang menunjukan kiamat kecil (sughra) adalah nomer….
""", 0),
            Pair("""8. Ahmad adalah siswa yang selalu berkata apa adanya dan sesuai kenyataan, sifat Ahmad ini menunjukan pengertian dari sifat ....""", 0),
            Pair("""9. Perhatikan pernyataan- pernyataan berikut :
1) Ahmad berperilaku seperti apa dia ucapkan.
2) Iwan senantiasa membantu pekerjaan ibunya tiap pagi.
3) Mahmud selalu berpandangan positif untuk kehidupannya
4) Utsman selalu datang ke kelas tepat waktu sesuai perjanjian awal masuk sekolah 
Sikap menepati janji ditunjukkan oleh nomor..dalam pernyataan tersebut di atas?
""", 0)),

        listOf(Pair("""10. Perhatikan firman Allah Ta’ala berikut ini
Menurut QS. al-Ahzab/33:70 di atas Allah Ta’ala. memerintahkan orang-orang beriman untuk ....
""", R.mipmap.pai_kelas9_soal10),
            Pair("""11. Perhatikan pernyataan- pernyataan berikut ini
1) Arman selalu mengatakan apa adanya kalau ditanya temannya 
2) Fatimah selalu berpandangan positif dalam menatap masa depan
3) Ahmad selalu semangat dalam menuntut ilmu-ilmu Umum dan agama.
4) Iwan rajin mengerjakan tugas-tugas dari ibu atau bapak gurunya di sekolah.
Sikap jujur ditujukkan oleh pernyataan nomor .... 
""", 0),
            Pair("""12. Perhatikan pernyataan pernyataan berikut ini
1) hidupnya tenang
2) hatinya gelisah
3) diremehkan orang lain
4) mudah diperalat orang lain
Yang merupakan salah satu manfaat jujur dan menepati janji ditunjukan pernyataan nomor .…
""", 0)),

        listOf(Pair("""13. Perhatikan firman Allah Ta’ala dalam QS. Al-Israa/17:23 berikut ini
Firman Allah Ta’ala tersebut menunjukan kewajiban ....
""", R.mipmap.pai_kelas9_soal13),
            Pair("""14. Kewajiban seorang anak berbakti kepada kedua orang tua adalah perintah Allah Ta’ala yang harus ditunaikan oleh seorang anak
Berbakti kepada orang tua tersebut dikenal dengan istilah .... 
""", 0),
            Pair("""15. Ahmad telah ditinggal wafat oleh orang tuanya, ia ingin selalu berbakti kepada orang tuanya tersebut
Kewajiban Ahmad ketika orang tuanya telah meninggal adalah ....
""", 0)),

        listOf(Pair("""16. Perhatikan pernyataan-pernyataan berikut ini
1) membiarkan sampai sembuh dengan sendirinya.
2) merawatnya dengan penuh kasih sayang.
3) dititipkan di panti sosial kerena sibuk.
4) menasihatinya agar tidak sakit.
Sikap yang tepat ketika orang tua sedang sakit ditunjukkan oleh nomer ….
""", 0),
            Pair("""17. Seorang siswa yang baik selalu memulyakan guru-gurunya.
Berikut yang merupakan sikap memulyakan guru adalah .... 
""", 0),
            Pair("""18. Perhatikan pernyataan-pernyataan berikut ini
1) keberkahan Ilmu
2) hadiah dari guru
3) kemanfaatan ilmu
4) piagam penghargaan
Siswa yang menghormati dan menaati guru akan memperoleh ....
""", 0)),

        listOf(Pair("""19. Maling Kundang adalah anak yang durhaka terhadap orang tuanya
Balasan yanga akan diberikan Allah Ta’ala kepada anak yang durhaka di akhirat kelak adalah .....
""", 0),
            Pair("""20. Zakat merupakan rukun Islam yang berkaitan dengan harta
Arti zakat menurut bahasa adalah ....
""", 0),
            Pair("""21. Perhatikan pernyataan-pernyataan berikut
1) biji-bijian
2) emas dan perak
3) unggas
4) kendraan bermotor
5) Kambing
Pernyataan yang termasuk harta yang wajib dizakatkan ditunjukan oleh nomer ....
""", 0)),

        listOf(Pair("""22. Pa Ahmad seorang peternak yang sukses, beliau mempunyai kambing yang banyak. Di akhir tahun beliau berkewajiban
mengeluarkan zakat 1 ekor kambing jika Nishab (ukuran harta yang wajib dizakati) untuk hewan ternak kambing tersebut berjumlah ….
""", 0),
            Pair("""23. Diantara golongan yang berhak menerima zakat adalah orang yang hatinya masih lembut seperti baru masuk Islam, golongan atau asnaf ini disebut ....""", 0),
            Pair("""24. perhatikan pernyataan-pernyataan berikut ini
1) Menjadi disegani di masyarakat
2) Meningkatkan kekayaan 
3) Membersihkan harta
4) Menghilangkan kemiskinan
Diantara fungsi dan manfaat zakat maal ditunjukkan oleh nomer ....
""", 0)),

        listOf(Pair("""25. Haji adalah berangkat ke tempat suci yaitu ... di Mekkah untuk melakukan rukun thawaf, sa’i dalam amalan ibadah haji untuk mendapat ridla Allah Ta’ala
Kata yang tepat untuk mengisi tititk-titik diatas adalah ....
""", 0),
            Pair("""26. Perhatikan potongan Qs. Ali Imran/3:97 berikut ini
Potongan ayat tersebut menjelaskan tentang perintah melaksanakan ....
""", R.mipmap.pai_kelas9_soal26),
            Pair("""27. Serangkaian kegiatan yang harus dilaksanakan oleh para jamaah haji dan jika tidak dilaksanakan menyebabkan hajinya tidak sah
walaupun sudah membayar denda atau dam adalah .....
""", 0)),

        listOf(Pair("""28. Perhatikan pernyataan-pernyataan berikut ini
1) Mengelilingi ka’bah sebanyak tujuh kali.
2) Lari- lari kecil diantara bukit Shofa dan Marwah 
3) Berdiam diri di padang Arafah pada tanggal 9 Dzulhijjah
4) mencukur Rambut tanda penghalalan hal-hal yang dilarang waktu haji
Dari pernyataan tersebut yang merupakan pengertian thawaf ditunjukan oleh nomer ....
""", 0),
            Pair("""29. Urutan yang benar dalam menunaikan rukun umrah adalah ....""", 0),
            Pair("""30. Dalam melaksanakan Ibadah haji, termasuk dalam melakukan wukuf di padang Arafah pakaian yang dipakai bagi laki-laki 
adalah tidak berjahit yang disebaut pakaian . . . .
""", 0)),

        listOf(Pair("""31. Perhatikan pernyataan-pernyataan berikut ini
1) Budha
2) Hindu
3) Katolik
4) Kristen
5) Kong Hu Cu
Sebelum Islam datang, Nusantara berada dalam pengaruh agama ....
""", 0),
            Pair("""32. Agama Islam berkembang di Indonesia disebarkan oleh berbagai golongan, yakni para pedagang, mubaligh dan para wali
Wali Songo yang berjumlah sembilan adalah para ulama yang menyebarkan ajaran Islam di pulau ….
""", 0),
            Pair("""33. Proses masuknya Islam di Indonesia berjalan secara bertahap dan melalui banyak cara
Berikut ini yang termasuk teori masuknya Islam ke Indonesia adalah .......
""", 0)),

        listOf(Pair("""34. Kerajaan Demak terletak di kabupaten Demak, Jawa Tengah, kerajaan ini adalah kerajaan Islam pertama dan terbesar di pesisir utara Jawa
didirikn pada tahun 1478 M oleh Sultan Demak yang pertama yaitu ....
""", 0),
            Pair("""35. Kerajaan Makasar adalah kerajaan Islam yang terletak di Sulawesi Selatan dengan raja terkenalnya adalah  Sultan Hasanudin
Kerajaan Makasar ini. merupakan gabungan dari dua kerajaan, yaitu .... 
""", 0),
            Pair("""36. Perhatikan firman Allah Ta’ala berikut ini
Hukum tajwid “Qalqalah” ditunjukan oleh nomor .... 
""", R.mipmap.pai_kelas9_soal36)),

        listOf(Pair("""37. Dalam QS. An-Najm/53:39 terdapat lafadz   
Arti lafadz yang tersebut dalam ayat di atas adalah ....
""", 0),
            Pair("""38. Perhatikan firman Allah Ta’ala berikut ini
Terjemahan yang benar dari penggalan ayat QS. Ali mran/3:159 tersebut adalah .....
""", R.mipmap.pai_kelas9_soal38),
            Pair("""39.  Perhatikan firman Allah Ta’ala berikut ini
Ayat QS. Az-Zumar/39:53 tersebut di atas berisi tentang ........
""", R.mipmap.pai_kelas9_soal39)),

        listOf(Pair("""40. Perhatikan firman Allah Ta’ala berikut ini
Ayat-ayat dalam Q.S an-Najm/53:39-42 tersebut di atas berisi tentang ....
""", R.mipmap.pai_kelas9_soal40),
            Pair("""41. Tursina Hill adalah tempat Nabi Musa AS menerima kitab ALLAH SWT untuk orang-orang:
""", 0),
            Pair("""42. Sebuah ayat atau frasa yang berarti “kita buat” adalah …
""", 0)),

        listOf(Pair("""43. Perintah yang terkandung dalam QS Al Insyirah ayat 7 (tujuh) berarti kita harus bersikap ….
""", 0),
            Pair("""44. Surat at tin merupakan surat ….
""", 0),
            Pair("""45. Batas antara alam dunia dan alam akhirat disebut?""", 0)),

        listOf(Pair("""46. Apa arti kata tollabu dalam hadist tentang ilmu?""", 0),
            Pair("""47. Perhitungan perbuatan baik dan buruk juga berarti:
""", 0),
            Pair("""48. Kiamat kecil dikenal dengan istilah …
""", 0)),

        listOf(Pair("""49. Karakter Kiamat kubro meliputi:
""", 0),
            Pair("""50. Menuntut ilmu pengetahuan bagi Muslim tentang hukum:
""", 0),
            Pair("""51. Penyembelihan ternak pada hari ke 11, 12 dan 13 Dhul Hijjah dengan tujuan untuk lebih dekat dengan ALLAH disebut ..
""", 0)),

        listOf(Pair("""52. Iman di Hari Pengadilan adalah rukun iman ke…
""", 0),
            Pair("""53. Kondisi hewan yang digunakan untuk hewan Aqiqah dan Qurban adalah …
""", 0),
            Pair("""54. Sebelum tinggal di Padang Arafat adalah …
""", 0)),

        listOf(Pair("""55. Hukum pelaksanaan Aqiqah adalah:
""", 0),
            Pair("""56. Rukun Haji ada …
""", 0),
            Pair("""57. Sikap siap untuk menerima hasil yang diinginkan dan merasakannya serta memisahkan diri dari ketidakpuasan disebut sikap …
""", 0)),

        listOf(Pair("""58. Tawaf yang dibuat saat meninggalkan kota Mekah disebut Tawaf …
""", 0),
            Pair("""59. Rukun Umrah ada berapa jenis…
""", 0),
            Pair("""60. Perbedaan antara haji dan umrah terletak pada harmoni, yaitu …
""", 0)),

        listOf(Pair("""61. Kunjungi Baitullah (Ka’bah) untuk melakukan layanan. Ketentuan tertentu dan waktu tanpa batas diumumkan...""", 0),
            Pair("""62. Jalankan umrah terlebih dahulu, maka haji disebut haji …
""", 0),
            Pair("""63. Jumlah ayat dalam surat At Tin adalah …
""", 0)),

        listOf(Pair("""64. Surat At Tin milik kelompok surat makkiyah karena keturunannya ke Mekah, yaitu:
""", 0),
            Pair("""65. Dari sudut pandang dari najis yang dibagi menjadi..jenis?""", 0),
            Pair("""66. Dalam kehidupan sehari-hari, Rasulullah SAW memberi contoh kepada umatnya …
""", 0)),

        listOf(Pair("""67. Dari sudut pandang ALLAH SWT, tingkat tinggi dan rendah manusia ditentukan.
""", 0),
            Pair("""68. Ilmu Tajwid adalah pengetahuan yang membahas …
""", 0),
            Pair("""69. Ajaran Islam yang berhubungan dengan proses mensucikan diri adalah
""", 0)),

        listOf(Pair("""70. Menurut Sunnah Nabi Muhammad SAW, ketentuan Doa Jama’at untuk …
""", 0),
            Pair("""71. Menurut aturan pembacaan pembacaan Hukum Orang Mati, ada ………….
""", 0),
            Pair("""72. Hukum sholat Jum’at adalah fardu ‘ain untuk setiap pria Muslim yang memenuhi persyaratannya, yang harus dipahami adalah..
""", 0)),

        listOf(Pair("""73. ALLAH SWT Yang Mahakuasa dalam mendistribusikan kekayaan untuk hambanya, ia dipercayakan kepada salah satu malaikatnya, malaikat..
""", 0),
            Pair("""74. Islam memberi kelegaan kepada umatnya dalam pelaksanaan sholat, misalnya melalui Jamas dan Qashars. Bantuan ini disebut:
""", 0),
            Pair("""75. Ada beberapa macam hal halal yang tercela dalam Islam, misalnya …
""", 0)),

        listOf(Pair("""76. Semua yang mengalami kematian Sakhratul bertemu malaikat …
""", 0),
            Pair("""77. Shalat Rawatib Sunnah disebut Rawatib Bahdiyah karena dilakukan:
""", 0),
            Pair("""78. Bernyanyi dibaca oleh Qolqolah berarti membaca dengan:
""", 0)),

        listOf(Pair("""79. Dalam hubungan sehari-hari, seseorang dianggap egois ketika:
""", 0),
            Pair("""80. Seseorang selamat dari serangan binatang yang menakutkan. Menurut Sunah Rasulullah SAW, sujud orang ini adalah:
""", 0),
            Pair("""81. Orang yang sering membaca Al Quran, hatinya menjadi ...""", 0)),

        listOf(Pair("""82. Terhadap pengemis kita dilarang ...""", 0),
            Pair("""83. Surat Ad Duha termasuk surat makiyah, maksudnya Al Quran ...""", 0),
            Pair("""84. Membaca Al Quran dengan fasih dan tartil akan mendapat...""", 0)),

        listOf(Pair("""85. Orang yang membaca Al Quran dengan menggunakan tajwid hukumnya ...""", 0),
            Pair("""86. Alif lam bertemu dengan huruf Ba’ ( ) hukum bacaannya ...""", 0),
            Pair("""87. Suara ( lam mati / Alif lam ) dibaca jelas termasuk ketentuan bacaan ...""", 0)),

        listOf(Pair("""88. Alif lam bertemu dengan Tha’ ( ) disebut Alif lam ( ) ...""", 0),
            Pair("""89 Ilmu yang mempelajari tentang cara membaca Al Quran adalah...
""", 0),
            Pair("""90 . Meyakini adanya Allah sebagai Maqha Pencipta, karena ada alam jagat raya. Hal ini merupakan dalil ...
""", 0)),

        listOf(Pair("""91 . Sifat-sifat yang tak mungkin bagi allah dan hanya mungkin bagi manusia di sebut ...
""", 0),
            Pair("""92 . Pada saatnya nanti, seluruh alam akan mengalami kehancuran, kecuali Allah swt, karena Allah memiliki sifat ...
""", 0),
            Pair("""93 . Allah mendengar bisikan hati seorang hambanya, menunjukkan Allah mempunyai sifat ...
""", 0)),

        listOf(Pair("""94 . Allah selalu mengawasi tindakan hambanya, karena Allah memiliki sifat ...
""", 0),
            Pair("""95 . Qudrot adalah sifat wajib bagi Allah, Qudrot artinya ...
""", 0),
            Pair("""96 . Allah bersifat Qiyamuhu Binafsihi artinya ...
""", 0)),

        listOf(Pair("""97 . Asmaulhusnah menurut artinya ...
""", 0),
            Pair("""98 . Asmaul husnah yang terdapat dalam hadis berjumlah ...
""", 0),
            Pair("""99 . Di antara Asmaulhusnah ialah Al Aziz artinya ...
""", 0)),

        listOf(Pair("""100. Asmaulhusnah merupakan ...""", 0),
            Pair("""101. Alwahab salah satu Asmaulhusnah yang artinya ...""", 0),
            Pair("""102. Sebutkan macam-macam takdir!""", 0)),

        listOf(Pair("""103. Kelak dikemudian hari Allah akan membuat keputusan secara adil sesuai dengan amal perbuatan, hal ini karena Allah memiliki sebutan ...""", 0),
            Pair("""104. Al Hadi artinya ....""", 0),
            Pair("""105. Di bawah ini nama-nama Allah yang baik, kecuali ..
""", 0)),

        listOf(Pair("""106. Zakat mal dibayarkan sehabis ...""", 0),
            Pair("""107. Keluarga Haji Sulaiman sebanyak 11 oraang,Zakat fitrah yang harus dikeluarkan sebanyak…
""", 0),
            Pair("""108. Waktu yang utama untuk mengeluarkan zakat Fitrah adalah…
""", 0)),

        listOf(Pair("""109.  Hal-hal diberikut ini termasuk syarat wajib zakat fitrah, kecuali…
""", 0),
            Pair("""110. Seorang muslim memiliki tabungan sebesar 20 juta rupiah dan sudah dimilikinya selama setahun
Jika harta emas pergram Rp. 150.000,- maka orang tersebut wajib mengeluarkan zakatnya sebesar…
""", 0),
            Pair("""111. Zakat fitrah dikeluarkan oleh setiap jiwa sebesar ….
""", 0)),

        listOf(Pair("""112. Zakat yang bertujuan untuk membersihkan harta adalah ….
""", 0),
            Pair("""113. Orang yang bertanggung jawab untuk membayar zakat fitrah dalam satu keluarga ….
""", 0),
            Pair("""114. Nisab untuk zakat harta yang berupa emas adalah...gram?""", 0)),

        listOf(Pair("""115. Orang yang memiliki hak untuk menerima zakat disebut ….
""", 0),
            Pair("""116. Pak Ahmad memiliki sebuah peternakan kambing yang berjumlah 100 ekor, maka Pak Ahmad wajib mengeluarkan zakat sebesar ….
""", 0),
            Pair("""117. Zakat  fitrah  termasuk  ibadah  yang hukumnya…
""", 0)),

        listOf(Pair("""118. Salah satu pengertian zakat menurut bahasa adalah ...""", 0),
            Pair("""119. Orang yang harus mengeluarkan zakat dalam istilah syara’ adalah ...""", 0),
            Pair("""120. Hukum mengeluarkan zakat mal adalah bagi yang sudah memenuhi syarat wajib adalah ...""", 0)),

        listOf(Pair("""121. Pengertian mustahik zakat adalah ....""", 0),
            Pair("""122. Seseorang baru saja memeluk agama islam. Orang tersebut disebut dengan …. 
""", 0),
            Pair("""123. Berikut ini merupakan orang-orang yang berhak menerima zakat, kecuali ….
""", 0)),

        listOf(Pair("""124. Berikut ini balasan bagi orang yang ringan timbangan amal kebaikannya...""", 0),
            Pair("""125. Pada hari kiamat kubra terjadi kehancuran alam semesta. Semua yang ada mengalami kehancuran kecuali ….
""", 0),
            Pair("""126. Hari dibangkitkannya manusia kembali disebut ….
""", 0)),

        listOf(Pair("""127. Q. S. Az-Zalzalah: 6, menjelaskan bahwa ….
""", R.mipmap.pai_kelas9_soal127),
            Pair("""128. Peristiwa selurah umat manusia dikumpulkan di tempat yang sangat luas, guna menghadapi pengadilan dari Allah, terjadi pada waktu….
""", 0),
            Pair("""129. Bagaimanakah keadaan manusia jika timbangan amal buruknya lebih berat?""", 0)),

        listOf(Pair("""130. Untuk apa kita ziarah kubur ?""", 0),
            Pair("""131. Pernyataan berikut ini betul...""", 0),
            Pair("""132. Apabila sangkakala ditiup untuk yang pertama kalinya maka ….
""", 0)),

        listOf(Pair("""133. Orang yang timbangan amal baiknya lebih berat, maka dia berada dalam kehidupan yang memuaskan.Hal ini telah dijelaskan dalam ayat berikut ini...""", R.mipmap.pai_kelas9_soal133),
            Pair("""134. Pernyataan berikut ini menunjukan peristiwa pada waktu Yaumul Hisab...""", 0),
            Pair("""135. Perhatikan tabel berikut:  
""", R.mipmap.pai_kelas9_soal135)),

        listOf(Pair("""136. Malaikat Isrofil meniup sangkakala yang kedua kalinya sebagai tanda …
""", 0),
            Pair("""137. Berdasarkan Q. S. Az-Zalzalah: 6, dapat dijelaskan bahwa …
""", 0),
            Pair("""138. Sesuai dengan ayat tersebut, maka dapat dipahami keadaan manusia, yaitu… .
""", R.mipmap.pai_kelas9_soal138)),

        listOf(Pair("""139. Niat memulai ibadah haji dalam pelaksanaanya dilakukan dengan memakai pakaian ihram dan membaca kalimat:.... """, 0),
            Pair("""140. Perbuatan-perbuatan yang harus dilakukan sewaktu menunaikan ibadah haji, jika ditinggalkan maka hajinya tidak sah. Ketentuan ini disebut….
""", 0),
            Pair("""141. Pada tanggal 9 Dzulhijah para jamaah haji melaksanakan...di padang Arafah?""", 0)),

        listOf(Pair("""142. QS. Ali Imram: 97:
Sesuai dengan ayat tersebut, … .
""", R.mipmap.pai_kelas9_soal142),
            Pair("""143. Thawaf dilakukan dengan cara....""", 0),
            Pair("""144. Pakaian ihram bagi laki-laki berupa … 
""", 0)),

        listOf(Pair("""145. Perhatikan daftar dibawah ini
1) istitha'ah
2) memiliki kekayaan
3) beragama islam
4) laki-laki
5) balig/dewasa
6) berkuasa
Dalam daftar tersebut yang termasuk syarat wajib haji tercantum pada nomor...
""", 0),
            Pair("""146. Nama-nama bulan dalam kalender islam yang digunakan dalam kalender jawa adalah....""", 0),
            Pair("""147. Para ulama menggunakan seni gamelan pada pertunjukan wayang. Fungsi pertunjukan tersebut sebagai….
""", 0)),

        listOf(Pair("""148. Cemati tabel berikut
Pasangan yang benar antara contoh akulturasi dan bidang pada tabel di atas ditunjukkan oleh angka...
""", R.mipmap.pai_kelas9_soal148),
            Pair("""149. Perhatikan tabel berikut
Pasangan yang tepat antara lafal (X) dan hokum bacaan (Y) yaitu. . ..
""", R.mipmap.pai_kelas9_soal149),
            Pair("""150. Perhatikan hadis berikut
عَنِ ابْنِ عَبَّاسٍ قَالَ قِيلَ لِرَسُولِ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ أَيُّ الْأَدْيَانِ أَحَبُّ إِلَى اللَّهِ قَالَ الْحَنِيفِيَّةُ السَّمْحَةُ
Makna hadis tersebut dapat diamalkan dengan cara …
""", 0))
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Malaikat          ","b. Kitab-kitab ","c. para Rasul ","d. hari akhir "),
            listOf("a. Musibah  ","b. bencana alam","c. kiamat Sughra","d. kiamat Kubra "),
            listOf("a. barzakh","b. mahsyar","c. surga","d. neraka")
        ),
        listOf(
            listOf("a. ","b. ","c. ","d. "),
            listOf("a. yaumul barzakh ","b. yaumul ba’ats        ","c. yaumal hisab","d. yumul mizan"),
            listOf("a. yumul ba’ats ","b. yaumul mahsyar  ","c. yaumul mizan","d. yaumul hisab")
        ),
        listOf(
            listOf("a. 1, 2          ","b. 1, 3 ","c. 2, 3","d. 2, 4"),
            listOf("a. santun      ","b. tepat janji","c. optimis","d. jujur"),
            listOf("a. 1                  ","b. 2","c. 3","d. 4")
        ),
        listOf(
            listOf("a. bertaqwa dan berikhtiar","b. jujur dan menepati janji ","c. bertaqwa dan berkata benar  ","d. santun dan malu"),
            listOf("a. 1                  ","b. 2","c. 3","d. 4"),
            listOf("a. 1                  ","b. 2 ","c. 3 ","d. 4")
        ),
        listOf(
            listOf("a. jujur dan tepat janji  ","b. berbakti kepada kedua orang tua ","c. infak, sodaqah dan zakat ","d. ibadah haji dan Umrah"),
            listOf("a. uququl walidain          ","b. hubbul walidain          ","c. birrul walidain","d. syarrul Walidain"),
            listOf("a. memberikan makanan  ","b. mencukupi kebutuhannya  ","c. mendoakannya ","d. menggunakan harta warisannya")
        ),
        listOf(
            listOf("a. 1                  ","b. 2 ","c. 3 ","d. 4 "),
            listOf("a. memetuhi nasihat-nasihatnya","b. memberikan bingkisan yang menarik ","c. sering meneleponnya ","d. Mengetes kepinterannya"),
            listOf("a. 1 dan 3          ","b. 1 dan 4","c. 2 dan 3","d. 2 dan 4")
        ),
        listOf(
            listOf("a. dikutuk menjadi batu  ","b. mendapat teguran  ","c. dimasukkan ke neraka ","d. Sulit mendapatkan pekerjaan"),
            listOf("a. berkunjung              ","b. menahan   ","c. mensucikan","d. berdoa "),
            listOf("a. 1, 2 dan 4          ","b. 1, 2 dan 5 ","c. 2, 3 dan 4 ","d. 2, 4 dan 5")
        ),
        listOf(
            listOf("a. 25 ekor          ","b. 30 ekor","c. 35 ekor","d. 40 ekor"),
            listOf("a. fakir           ","b. miskin","c. amil  ","d. muallaf"),
            listOf("a. 1                  ","b. 2 ","c. 3 ","d. 4")
        ),
        listOf(
            listOf("a. masjid Aqso             ","b. masjid Quba    ","c. masjidil Haram ","d. masjid Nabawi "),
            listOf("a. Shalat                  ","b.  Zakat","c. Haji","d. Puasa "),
            listOf("a. rukun haji         ","b. syarat haji","c. wajib haji","d. sunnah haji ")
        ),
        listOf(
            listOf("a. 1                  ","b. 2","c. 3","d. 4"),
            listOf("a. Ihram – thawaf – tahalul – sa’i  ","b. Ihram – thawaf – sa’i – tahalul  ","c. thawaf, ihram, sa’i - tahalul","d. Thawaf – ihram – tahalul – sa’i"),
            listOf("a. Surban          ","b. Ihram","c. Jubah","d. Koko")
        ),
        listOf(
            listOf("a. 1 dan 2         ","b. 2 dan 3 ","c. 3 dan 4","d. 4 dan 5"),
            listOf("a. Jawa          ","b. Sumatra     ","c. Kalimantan  ","d. Sulawesi"),
            listOf("a. Teori Melayu          ","b. Teori Indonesia","c. Teori Madinah ","d. Teori Gujarat ")
        ),
        listOf(
            listOf("a. Sunan Prawoto         ","b. Adipati Unus     ","c. Sultan Trenggono","d. Raden Patah "),
            listOf("a. Gowa - Ternate          ","b. Ternate –Tidore          ","c. Bone –Wajo                ","d. Gowa–Tallo "),
            listOf("a. 1                  ","b. 2","c. 3","d. 4 ")
        ),
        listOf(
            listOf("a. bagi manusia          ","b. golongan manusia","c. kepada malaikat","d. Bagi malaikat"),
            listOf("a. Sesungguhnya Allah Ta’ala mencintai orang-orang yang bertaqwa ","b. Sesungguhnya Allah Ta’ala mencintai orang-orang yang bertawakal","c. Sesungguhnya Allah Ta’ala meridloi orang-orang yang bertaqwa","d. Sesungguhnya Allah Ta’ala meridloi orang-orang yang bertawakal"),
            listOf("a. larangan belaku sombong","b. larangan berputus asa  ","c. larangan Malas beramal","d. larangan bersikap riya")
        ),
        listOf(
            listOf("A. Perintah Allah Ta’ala agar bermusyawarah ","B. larangan berputus asadari rahmat Allah Ta’ala ","C. perintah Allah Ta’ala untuk berikhtiar dan bekerja keras ","D. Allah Ta’ala akan memberikan pahala bagi orang yang bertawakal"),
            listOf("a. Kristen","b. Mayusi","c. Yahudi","d. Quraysh"),
            listOf("a. Al Amin","b. Kholakna","c. Laqod","d. Al Insyana")
        ),
        listOf(
            listOf("a. Tegas dan berani","b. Keyakinan","c. Disiplin","d. Optimis"),
            listOf("a. Madaniyah","b. Makkiyah","c. Suroh terakhir","d. Hasanah"),
            listOf("a. alam barzah","b. alam gaib","c. alam maghdyar","d. alam ba’as")
        ),
        listOf(
            listOf("a. Tugas","b. Menuntut","c. Semua orang","d. Kembalilah"),
            listOf("a. Yumul","b. Yaumul Mizan","c. Yaumul ba’as","d. Kiamat Yaumul"),
            listOf("a. Kiamat sugro","b. Kiamat Kubro","c. Hari Kiamat Zalzalah","d. Akhir hari")
        ),
        listOf(
            listOf("a. gempa bumi","b. Gelombang tsunami","c. Gunung pecah","d. Akhir dari semua kehidupan di dunia"),
            listOf("a. Sunnah","b. Mubah","c. Makruh","d. wajib"),
            listOf("a. Aqiqah","b. Kifarat","c. Korban","d. Ukiyah")
        ),
        listOf(
            listOf("a. 5 (lima)","b. 4 (empat)","c. 3 (tiga)","d. 2 (dua)"),
            listOf("a. Cukup tua","b. Tidak buta di mata","c. Dia tidak pincang dengan kakinya","d. A, B, C Benar"),
            listOf("a. Persyaratan wajib untuk haji","b. Haji Sunnah","c. spesies haji","d. Rukun Haji")
        ),
        listOf(
            listOf("a. Wajib","b. Mubah","c. Makruh","d. Sunnah Muakad"),
            listOf("a. 6 spesies","b. 5 jenis","c. 4 jenis","d. 3 jenis"),
            listOf("a. Tawakal","b. Tasamuh","c. Tawaduk","d. Qanaah")
        ),
        listOf(
            listOf("a. Tawaf Ifadah","b. Tawaf Qudum","c. Tawaf Wada","d. Tawaf Sunnah"),
            listOf("a. 6 spesies","b. 5 jenis","c. 4 jenis","d. 3 jenis"),
            listOf("a. Sebelum menginap","b. Tawaf","c. Sa’i","d. Ihrom")
        ),
        listOf(
            listOf("a. Haji","b. Ziarah","c. Umrah","d. Sebelumnya"),
            listOf("a. Haji Ifrad","b. Tamattu Haji","c. Haji Qiran","d. Haji Mabrur"),
            listOf("a. 10 ayat","b. 9 ayat","c. 8 ayat","d. 7 paragraf")
        ),
        listOf(
            listOf("a. Menurut Nabi Muhammad SAW Hijrah","b. Sebelum Nabi Muhammad SAW Hijrah","c. Ketika Nabi Muhammad SAW berada dalam suasana perang yang buruk","d. Pada malam Laylat al-Qadr"),
            listOf("a. 2 (dua)","b. 3 (tiga)","c. 4 (empat)","d. 5 (lima)"),
            listOf("a. Hal-hal penting","b. Ibadah dan Aqida","c. Beberapa bidang kehidupan manusia","d. Semua aspek kehidupan manusia")
        ),
        listOf(
            listOf("a. Sedikit atau banyak amal","b. Berarti atau tidak","c. Tingkat kesalehan terhadap ALLAH SWT","d. Status sosial selama hidup di dunia"),
            listOf("a. Seni dan etika membaca Alquran dengan ritme dan etika yang baik","b. Beberapa fitur membaca Alquran","c. Metode membaca Alquran dengan bacaan yang benar dan lancar","d. Ritme dan teknik membaca Alquran"),
            listOf("a. Hadast dan tidak murni","b. Hadast besar dan kecil","c. Thaharah","d. Kotor dan tidak murni")
        ),
        listOf(
            listOf("a. Beberapa Doa Fard hanya di siang hari","b. Misalnya doa Zuhr, Ashar, Maghrib, dan Isya","c. Jenis doa tertentu","d. Semua Doa Fardu"),
            listOf("a. Satu jenis","b. Dua jenis","c. Tiga tipe","d. Empat jenis"),
            listOf("a. Kewajiban yang harus dilakukan karena sudah di depan mata","b. Tugas sekelompok Muslim yang tahu Jumat","c. Tugas individu yang harus dipenuhi setiap orang","d. Kewajiban yang tidak dapat diabaikan dengan alasan apa pun")
        ),
        listOf(
            listOf("a. Mikail","b. Munkar dan Nakir","c. Zabaniyah","d. Malik"),
            listOf("a. Kesempurnaan","b. Kekhususan","c. Rukhsah","d. kesederhanaan"),
            listOf("a. Mengemis untuk orang lain","b. Penerimaan berulang bantuan dari pihak lain","c. Penipuan orang-orang yang tidak percaya karena suatu hal yang penting","d. Anggota membantu orang yang mampu, bahkan jika mereka tidak diminta")
        ),
        listOf(
            listOf("a. Mikail","b. Jibril","c. Izrail","d. Malik"),
            listOf("a. Tepat sebelum akhir ibadah","b. Saat menutup shalat Fardhu","c. Setelah doa Fardhu","d. Doa Fardhu dimulai"),
            listOf("a. Suara memantul","b. guncangan bibir","c. Refleksi suara","d. Kocok Suara")
        ),
        listOf(
            listOf("a. Terlalu banyak mendapat perhatian dari pihak lain","b. Kurang memperhatikan diri sendiri dan orang lain","c. Upaya untuk mendapatkan apresiasi yang wajar dari pihak lain","d. Kurang memperhatikan kepentingan orang lain"),
            listOf("a. Pelafalan sujud","b. Mengucapkan rasa syukur","c. sujud khusyuk","d. Sujud sahwi"),
            listOf("a. Tidak tenang             ","b. Kusut             ","c. Jernih dan tenang","d. Emosional")
        ),
        listOf(
            listOf("a. Menyantuni  ","c. Menghardik","b. Menyebut-nyebut","d. Memperhatikannya"),
            listOf("a. Sebagai pedoman orang Mekah","b. Yang diturunkan di Mekah","c. Sebagai ancaman bagi orang-orang Mekah","d. Sebagai petunjuk bagi orang-orang Mekah"),
            listOf("a. Syafaat dari Al Quran","b. Sanjungan dari orang lain","c. Kutukan dari orang yang tidak senang","d. Segala usahanya akan terlambat")
        ),
        listOf(
            listOf("a. Fardhu ain    ","b. Fardhu khifayah         ","c. Makruh","d. Sunah"),
            listOf("a. Ikhfa’ syafawi         ","b. Izhaar halqi   ","c. Izhar qamariyah","d. Idgam syamsiyah"),
            listOf("a. Idgam syamsiyah ","b. Izhar halqi ","c. Izhar qomariyah","d. Idgam bigunah")
        ),
        listOf(
            listOf("a. Syifa’iyah         ","b. Qamariyah","c. Gamamiyah","d. Syamsiyah"),
            listOf("a. Tafsir         ","b. Fiqih         ","c. Hadis","d. Tajwid"),
            listOf("a. Qauli         ","b. Aqli ","c. Fi’li","d. Naqli")
        ),
        listOf(
            listOf("a. Jaiz bagi Allah ","b. Mustahil bagi Allah         ","c. Wajib bagi Allah","d. Mubah bagi Allah"),
            listOf("a. Qidam         ","b. Qudrat","c. Wujud ","d. Baqa’"),
            listOf("a. Sama’         ","b. Kalam  ","c. Bashor ","d. Irodah")
        ),
        listOf(
            listOf("a. Bashor         ","b. Ilmu ","c. Sama’ ","d. Wahdaniyah"),
            listOf("a. Berkehendak         ","b. Berkuasa ","c. Berfirman","d. Mendengar"),
            listOf("a. Mengetahui ","b. Berbeda dengan mahluk ","c. Berdiri sendiri","d. Berkehendak")
        ),
        listOf(
            listOf("a. Nama-nama yang diabadikan","b. Nama-nama yang dilestarikan","c. Nama-nama yang baik","d. Nama-nama yang layak"),
            listOf("a. 89 nama      ","b. 99 nama      ","c. 100 nama ","d. 102 nama"),
            listOf("a. Maha Perkasa        ","b. Maha Bijaksana","c. Maha Pemberi","d. Maha Pengampun")
        ),
        listOf(
            listOf("a. Sebutan lain dari sifat- sifat Allah SWT","b. Sebutan nain dari nama-nama Allah SWT","c. Merupakan sifat-sifat Allah yang baik","d. Tugas-tugas Allah sesuai dengan namanya"),
            listOf("a. Maha Adil         ","b. Maha Perkasa  ","c. Maha Bijaksana","d. Maha Pemberi"),
            listOf("a. Takdir Mubram, Takdir Muallaf","b. Takdir Mubah, Takdir Muallaq","c. Takdir Mubram, Takdir Muallaq","d. Takdir Mubah, Takdir Muallaf")
        ),
        listOf(
            listOf("a. Alqoyum         ","b. Al Aziz ","c. Al Wahab","d. Al 'adl"),
            listOf("a. Maha Perkasa ","b. Maha Pemberi ","c. Maha Pemberi Petunjuk","d. Maha Berdiri Sendiri"),
            listOf("a. Al Aziz         ","b. Al Qoyum","c. Al Hadi","d. Al Qosim")
        ),
        listOf(
            listOf("a. Seseorang   merasa   siap   untuk membayar zakat","b. Sesudah menunaikan ibadah puasa Ramadhan","c. Sesudah memenuhi nisab dan haulnya","d. Sesudah urusan dunianya terpenuhi"),
            listOf("a. 11 kg beras ","b. 33 liter beras ","c. 27,5 liter beras ","d. 37,5 kg beras"),
            listOf("a. Pada pertama Ramadhan ","b. Pada simpulan Ramadha ","c. Sesudah shalat ‘Idul Fitri","d. Sesudah salat subuh hingga menjelang berdirinya salah ‘Idul Fitri")
        ),
        listOf(
            listOf("a. Islam","b. Orang tersebut ada pada waktu terbenam matahari pada malam ‘Idul Fitri","c. Baligh","d. Orang tersebut memiliki kelebihan makanan"),
            listOf("a. Rp. 234,000","b. Rp. 250,000 ","c. Rp. 500,000","d. Rp. 1,000,000"),
            listOf("a. 2,5 kg","b. 2,5 liter","c. 2,5 persen","d. 2,5 ons")
        ),
        listOf(
            listOf("a. Zakat mal ","b. Zakat fitrah ","c. Zakat profesi ","d. Zakat rikaz"),
            listOf("a. Kakek","b. Kepala keluarga","c. Orang dewasa ","d. Nenek"),
            listOf("a. 100,9 gram","b. 96 gram","c. 91,2 gram ","d. 91,1 gram")
        ),
        listOf(
            listOf("a. Musadiq zakat","b. Mustahik zakat ","c. Muzakki","d. Amil zakat"),
            listOf("a. 1 ekor kambing betina umur 2 tahun ","b. 1 ekor domba betina umur 2 tahun ","c. 2 ekor kambing betina umur 2 tahun ","d. 2 ekor domba betina umur 2 tahun"),
            listOf("a. Wajib ain","b. Wajib kifayah","c. Sunnah","d. Sunnah muakad")
        ),
        listOf(
            listOf("a. Menukarkan","b. Menambah","c. Menyisihkan harta","d. Mensucikan"),
            listOf("a. Muzaki","b. Mustahik ","c. Nishab ","d. Haul"),
            listOf("a. Fardu ‘ain","b. Mubah ","c. Sunnah ","d. Makruh")
        ),
        listOf(
            listOf("a. Orang-orang  yang  mampu  untuk mengeluarkan","b. Orang  yang  berkewajiban  untuk melaksanakan zakat","c. Orang yang berhak untuk menerima zakat","d. Zakat yang harus dibayarkan kepada yang berhak menerimanya"),
            listOf("a. Kafir","b. Muzakki ","c. Muallaf ","d. Anshar"),
            listOf("a. Muzakki ","b. Miskin ","c. Amil","d. Gharim")
        ),
        listOf(
            listOf("a. alam barzah","b. dunia yang fana","c. neraka Jahannam","d. neraka Hawiyah"),
            listOf("a. Allah swt., langit dan bumi","b. Allah swt.   dan para malaikat dan mahluk gaib lainnya","c. Allah swt.","d. Allah swt dan beberapa malaikat tertentu yang dipilihnya"),
            listOf("a. Reinkarnasi","b. Yaumul Mizan ","c. Yaumul Ba’ast ","d. Yaumul Hisab")
        ),
        listOf(
            listOf("a. semua manusia harus mempertanggung jawabkan semua amalnya","b. keadaan manusia pada waktu Yaumul Ba’ats  sesuai amlanya pada waktu di dunia","c. bagi orang yang timbangan amal kebaikannya lebih berat akan masuk surga","d. bagi orang yang timbangan amal buruknya lebih berat akan masuk neraka"),
            listOf("a. Yaumul Mahsyar","b. Yaumul Mizan ","c. Yaumul Hisab ","d. Yaumul Ba’as"),
            listOf("a. Tempat kembalinya neraka hawiyah","b. Bersama seluruh keluarganaya dalam kehidupan yang susah","c. Tidak akan mendapatkan pertolongan","d. Sengsara hidupnya di dunia dan akhirat")
        ),
        listOf(
            listOf("a. Minta doa restu pada leluhur yang sudah mati","b. Menghilangkan ketakutan terhadap or- ang mati","c. Agar ingat bahwa kita juga akan mati","d. Supaya berani mati walupun masih muda"),
            listOf("a. Orang-orang yang berat timbangan (kebaikan) nya, maka maka tempat kembalinya adalah Hawiyah","b. Adapun orang-orang yang ringan timbangan (kebaikan)nya, maka tempat kembalinya adalah Hawiyah","c. Hawiyah adalah surga yang paling utama","d. Pada hari Kiamat keadaan manusia seperti bulu yang dihambur- hamburkan"),
            listOf("a. manusia berkumpul di padang Mahsyar","b. manusia menuju ke tempat penimbangan amal","c. semua manusia keluar dengan segera dari kuburnya","d. hancurlah seluruh alam semesta.")
        ),
        listOf(
            listOf("a.","b.","c.","d."),
            listOf("a. dibalas semua amalnya, baik atau buruk.","b. dihitung semua amalnya","c. dibangkitkan dari alam kuburnya meskipun sudah meninggal bertahun- tahun.","d. ditunjukkan semua kebaikan dan keburukannya selama di dunia."),
            listOf("a. 1-d, 2-b, 3-d, 4-e dan 5-b ","b. 1-c, 2-e, 3-d, 4-a dan 5-b ","c. 1-a, 2-b, 3-c, 4-d, dan 5-e ","d. 1-d, 2-a, 3-c, 4-e dan 5-b")
        ),
        listOf(
            listOf("a. Kebangkitan manusia dari kubur","b. Hari kiamat telah dimulai","c. Berakhirnya hari kiamat","d. Kehancuran alam semesta"),
            listOf("a. bagi orang yang timbangan amal buruknya lebih berat akan masuk neraka.","b. keadaan manusia pada waktu Yaumul Ba’ats sesuai amlanya pada waktu di dunia.","c. semua manusia harus mempertanggung jawabkan semua amalnya.","d. bagi orang yang timbangan amal kebaikannya lebih berat akan masuk surga."),
            listOf("a. manusia akan mendapatkan kehidupan yang memuaskan, jika timbangan amal baiknya lebih berat.","b. bersama seluruh keluarganaya dalam surga yang abadi.","c. bagi orang yang timbangan amal buruknya lebih berat maka akan masuk neraka yang sangat mengerikan.","d. Mendapatkan penghargaan yang setinggi-tingginya, yaitu surge Firdaus.")
        ),
        listOf(
            listOf("a. Kalimat Hamdalah","b. Kalimat Syahadat","c. Kalimat Toyibah","d. Kalimat Tasbih"),
            listOf("a. rukun haji ","b. syarat haji ","c. wajib haji","d. hikmah haji"),
            listOf("a. melontar jumrah ","b. ibadah bermalam ","c. wukuf","d. rukun haji")
        ),
        listOf(
            listOf("a. seluruh umat Islam yang telah baligh di wajibkan beribadah haji","b. haji diperintahkan seumur hidup satu kali.","c. bagi  orang  hajinya  mabrur  akan mendapatkan pahala surga","d. haji diperintahkan bagi orang Islam yang memiliki kemampuan."),
            listOf("a. Berlari-lari kecil mengelilingi bukit Shafa sampai Marwa","b. Mengelilingi Ka’bah 5 kali dengan lari- lari kecil 3 kali putaran","c. Mengelilingi Ka’bah 7 kali dimulai dari Hajar Aswad","d. Berdiam diri di padang Arafah"),
            listOf("a. kain putih berjahit","b. dua helai kain putih tidak berjahit","c. dua helai kain putih","d. tiga helai kain putih tidak berjahit")
        ),
        listOf(
            listOf("a. 4), 5), 6)","b. 2), 3), 4)","c. 2), 4), 5)","d. 1), 3), 5)​"),
            listOf("a. safar, Rabi'ul awal, dan Jumadilakir","b. Rabi'ul akhir, Bakda Mulud, dan Safar","c. Rajab,besar,dan Jumadi'l Awal","d. Safar,Rajab,dan Syawal"),
            listOf("a. Pengiring lantunan syair Islam","b. Alat pemanggil warga sekitar","c. Hiasan yang memperindah panggung","d. Penanda dimulai dan di akhirinya pertunjukan​")
        ),
        listOf(
            listOf("a. 1) dan 2)","b. 1) dan 4)","c. 2) dan 3)","d. 3) dan 4)"),
            listOf("a. X1-Y1, X2-Y2, dan X3-Y3","b. X1-Y1, X2-Y3, dan X3-Y2","c. X1-Y2, X2-Y1, dan X3-Y3","d. X1-Y2, X2-Y3, dan X3-Y1"),
            listOf("a. mengajak teman yang beda kepercayaan untuk memeluk Islam","b. menghargai kepercayaan yang dimiliki oleh orang lain ","c. meyakini bahwa Allah Swt. merupakan pencipta semua makhluk","d. mempelajari ajaran agama lain yang bernilai positif")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(3,3,1),
        listOf(3,1,2),
        listOf(1,3,3),
        listOf(2,0,0),
        listOf(1,2,2),
        listOf(1,0,0),
        listOf(2,2,1),
        listOf(3,3,2),
        listOf(2,2,0),
        listOf(0,1,1),
        listOf(0,0,3),
        listOf(3,3,2),
        listOf(0,1,1),
        listOf(2,2,1),
        listOf(2,1,0),
        listOf(1,1,0),
        listOf(3,3,2),
        listOf(0,3,3),
        listOf(3,0,3),
        listOf(2,1,0),
        listOf(2,1,2),
        listOf(1,1,3),
        listOf(2,2,2),
        listOf(1,2,2),
        listOf(0,2,0),
        listOf(2,2,3),
        listOf(3,1,2),
        listOf(1,1,0),
        listOf(0,2,2),
        listOf(3,3,3),
        listOf(1,3,0),
        listOf(0,1,2),
        listOf(2,1,0),
        listOf(1,3,2),
        listOf(3,2,3),
        listOf(2,2,3),
        listOf(3,2,0),
        listOf(0,1,2),
        listOf(1,0,0),
        listOf(3,1,0),
        listOf(2,2,0),
        listOf(3,2,2),
        listOf(0,0,0),
        listOf(2,0,3),
        listOf(2,1,3),
        listOf(0,2,0),
        listOf(1,0,2),
        listOf(3,2,0),
        listOf(3,2,0),
        listOf(2,3,1)





    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas9, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerPai.scorePaiKelas9 < 1) 0 else scoreManagerPai.scorePaiKelas9 / 5
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
            val getData = soalPaisd9[jawabanBenar6][i]
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

                    var scoreMatSd = scoreManagerPai.scorePaiKelas9
                    if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                        jawabanBenar6++

                        if (jawabanBenar6 == soalPaisd9.size) {
                            scoreMatSd += 5
                            scoreManagerPai.scorePaiKelas9 = scoreMatSd
                            Toast.makeText(
                                activity,
                                "Selamat anda telah menyelesaikan misi",
                                Toast.LENGTH_SHORT
                            ).show()
                            done = true
                        } else {
                            scoreMatSd += 5
                            scoreManagerPai.scorePaiKelas9 = scoreMatSd
                            Toast.makeText(activity, R.string.segments_sukses, Toast.LENGTH_SHORT)
                                .show()
                            // refresh ui
                            for (i in 0 until (listRadiogrup.size)) {
                                val getData = soalPaisd9[jawabanBenar6][i]
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