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


class SoalPaiKelas7 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalPaisd7: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Pada kata: قَا لُوﭐ  mengandung bacaan mad, penyebab dibaca mad adalah...""", 0),
            Pair("""2. Kalimat وَﷲبِمَا نَهْمَلُوْ نَ خَبِيْرٌ memiliki arti...""", 0),
            Pair("""3. Surah ar-Rahman ayat 55:33 menjelaskan tentang...""", 0)),

        listOf(Pair("""4. Kalimat طَلَبُ اْ اءِلْمِ فَرِ يْفَةٌ dibaca
""", 0),
            Pair("""5. Berikut ini adalah hikmah orang yang berilmu, kecuali...""", 0),
            Pair("""6. Surah al-Mujadalah/58:11menjelaskan tentang...""", 0)),

        listOf(Pair("""7. Fatimah disuruh membeli minyak goreng di sebuah warung. Ketika menerima uang kembalian, ia tahu
bahwa jumlahnya lebih dari seharusnya, lalu ia mengembalikannya. Ia sadar bahwa Allah SWT selalu
mengawasi perbuatannya, karena Allah SWT bersifat...
""", 0),
            Pair("""8. Subhanallah, indahnya alam semesta dengan segala isinya. Semuanya tercipta dengan teratur dan
seimbang. Fenomena alam tersebut adalah merupakan bukti Allah Maha...
""", 0),
            Pair("""9. Diantara bentuk pengamalan dari keyakinan terhadap al-‘Alim adalah....""", 0)),

        listOf(Pair("""10. Arti dari al-Asma’u al-Husna adalah...""", 0),
            Pair("""11. Allah swt. Maha Melihat segala sesuatu walaupun lembut dan kecil. Allah swt pun melihat apa yang ada
di bumi dan di langit. Allah Maha Melihat merupakan makna...
""", 0),
            Pair("""12. Meyakini dalam hati, mengucapkan dengan lisan, dan mengamalkan dalam kehidupan sehari-hari adalah arti dari...""", 0)),

        listOf(Pair("""13. Dibawah ini perilaku yang mencerminkan sifat amanah adalah...""", 0),
            Pair("""14. Sebagai ketua osis Raihan ingin tetap menjaga kepercayaan yang dititipkan kepadanya. Sikap Raihan tersebut sama dengan...""", 0),
            Pair("""15. Perhatikan pernyataan berikut ini.
1) akan dipercaya orang lain
2) mendapatkan banyak teman
3) mendapatkan banyak harta
4) akan selalu bersama Allah swt.
Yang termasuk hikmah perilaku jujur adalah...
""", 0)),

        listOf(Pair("""16. Rosyid disuruh ayahnya pergi kewarung untuk membeli beras dan minyak goreng. Rosyid diberi uang
sebesar Rp50,000,- dan masih ada kembalian Rp5.000,-. Uang kembaliannya itu dikembalikannya lagi
kepada ayahnya. Perilaku yang ditunjukkan oleh Rosyid merupakan contoh...
""", 0),
            Pair("""17. Orang yang memiliki sikap istiqomah akan melakukan perilaku
""", 0),
            Pair("""18. Menjaga tubuh agar selalu sehat dan terus bersyukur kepada Allah swt adalah jenis amanah kepada
""", 0)),

        listOf(Pair("""19. Berikut ini yang tidak termasuk perilaku istiqomah adalah...""", 0),
            Pair("""20. Taharah mengajarkan kepada kita agar selalu hidup
""", 0),
            Pair("""21. Tujuan tayamum adalah untuk menghilangkan...""", 0)),

        listOf(Pair("""22. Penyebab seseorang melakukan mandi besar adalah...""", 0),
            Pair("""23. Berikut ini hal-hal yang dibolehkan bagi perempuan yang sedang haid, kecuali...""", 0),
            Pair("""24. Dibawah ini adalah salah satu contoh najis mutawassitoh, kecuali...""", 0)),

        listOf(Pair("""25. Perhatikan hal-hal berikut ini
1) darah
2) kotoran hewan
3) air liur anjing
4) jilatan babi
Yang merupakan najis mugholadoh adalah...
""", 0),
            Pair("""26. Apabila terkena najis mugholadoh cara untuk mensucikannya adalah...""", 0),
            Pair("""27. Dalam sholat berjamaah paling sedikit jumlah jamaahnya adalah...""", 0)),

        listOf(Pair("""28. Pahala sholat berjamaah lebih banyak disbanding sholat sendirian, yaitu...""", 0),
            Pair("""29. Di bawah ini yang bukan syarat-syarat menjadi makmum adalah...""", 0),
            Pair("""30. Makmum masbuq adalah makmum yang...""", 0)),

        listOf(Pair("""31. Perhatikan hal-hal berikut ini:
1) hujan lebat
2) sakit
3) tertinggal satu rakaat
4) tidak mendapat saf depan
Hal-hal yang menjadi alasan diperbolehkan seorang muslim melakukan sholat secara munfarid adalah
""", 0),
            Pair("""32. Fasih membaca Al-Qur’an, berakal sehat, balig, seorang laki-laki, berdiri paling depan. Hal ini
Merupakan syarat-syarat menjadi...
""", 0),
            Pair("""33. Apabila makmum terdiri atas laki-laki, perempuan, anak laki-laki, dan anak perempuan, maka posisi saf
untuk anak-anak perempuan adalah...
""", 0)),

        listOf(Pair("""34. Nabi Muhammad SAW lahir pada...""", 0),
            Pair("""35. Nabi Muhammad pernah mulai berdagang sendiri ke negeri Syam ketika berusia.....""", 0),
            Pair("""36. Nabi Muhammad saw diangkat menjadi rasul pada usia.....""", 0)),

        listOf(Pair("""37. Nabi Muhammad saw diangkat menjadi rasul ditandai dengan menerima wahyu.....""", 0),
            Pair("""38. Setelah Nabi Muhammad saw berdakwah kepada kaum kafir Quraisy, sikap mereka.....""", 0),
            Pair("""39. Saat bayi, nabi Muhammad SAW diasuh oleh seorang perempuan dari kampung pedalaman.....""", 0)),

        listOf(Pair("""40. Setelah ibunya wafat, Nabi Muhammad SAW diasuh oleh.....""", 0),
            Pair("""41. Hukum bacaan Al dibagi menjadi dua yaitu ...""", 0),
            Pair("""42. Hukum bacaan Al Qomariyah jika terdapat tanda-tanda seperti berikut ini, kecuali ....""", 0)),

        listOf(Pair("""43. Huruf Qomariyah berjumlah .... """, 0),
            Pair("""44. Huruf Syamsiyah berjumlah ....""", 0),
            Pair("""45. Huruf-huruf berikut merupakan huruf – huruf
أبجحخعغفقكموهي.....
""", 0)),

        listOf(Pair("""46. Huruf-huruf berikut merupakan huruf – huruf
تثدذرزسشصضطظلن....
""", 0),
            Pair("""47. Berikut yang semuanya merupakan huruf huruf Syamsiyah adalah .... """, 0),
            Pair("""48. Berikut yang semuanya merupakan huruf huruf Qomariyah adalah .... """, 0)),

        listOf(Pair("""49. Contoh bacaan Al Qamariyah adalah ....""", 0),
            Pair("""50. Lafalبِرَبِّالنَّاسِ merupakan contoh bacaan …. 
""", 0),
            Pair("""51. إِهْدِناَالصِّرَاطَالْمُسْتَقِيْمَ
Bacaan Al Qamariyah pada ayat di atas adalah .... 
""", 0)),

        listOf(Pair("""52. Iman menurut bahasa artinya adalah .... """, 0),
            Pair("""53. Allah maha pencipta seluruh alam semesta ini, sehingga Allah disebut ...""", 0),
            Pair("""54. Allah Maha Pemberi dan pemberiannya selalu berlangsung terus menerus serta berkesinambungan, sehingga Allah disebut .... """, 0)),

        listOf(Pair("""55. إِنَّاللهَتَوَّابٌرَّحِيْمٌ. Ayat tersebut menunjukkan bahwa Allah memiliki Asmaul Husna ...""", 0),
            Pair("""56. Manusia suka memberikan segala yang bermanfaat bagi orang lain, ini menunjukkan pengamalan Asmaul Husna ….
""", 0),
            Pair("""57. Berikut merupakan contoh pengamalan Asmaul Husna Al-Hadi adalah ….
""", 0)),

        listOf(Pair("""58. وَتَمَّتْكَلِمَتُرَبِّكَصِدْقًاوَعَدْلاً. Ayat tersebut menunjukkan bahwa Allah memiliki Asmaul Husna ...""", 0),
            Pair("""59. Pengertian iman menurut istilah adalah ... """, 0),
            Pair("""60. Pengertian syahadat terbagi menjadi dua macam yaitu ....""", 0)),

        listOf(Pair("""61. Mempercayai dan meyakini bahwa Allah Swt menciptakan malaikat dari cahaya (nur) dan memiliki sifat senantiasa taat dan patuh 
terhadap perintah Allah Swt serta tidak pernah bermaksiat kepada-Nya
Pernyataan di atas yang merupakan  pengertian dari rukun iman yang ke ….
""", 0),
            Pair("""62. Arman selalu mengerjakan amal kebaikan dan menjauhi keburukan walaupun ia sendirian dan tidak ada orang yang melihatnya. 
Sikap tersebut menunjukkan bahwa ia beriman kepada malaikat….
""", 0),
            Pair("""63. Perhatikan tabel berikut :
Pernyataan yang benar terkait dengan makhluk ciptaan Allah Swt. dan sifatnya adalah ….
""", R.mipmap.pai_kelas7_soal63)),

        listOf(Pair("""64. Rasul adalah manusia pilihan Allah Swt. yang diturunkan wahyu dan syariat kepadanya dan diperintahkan untuk menyampaikan kepada umatnya
Malaikat yang bertugas menyampaikan wahyu kepada para rasul adalah ….
""", 0),
            Pair("""65. Perhatikan pernyataan-pernyataan berikut :
1)  Senantiasa bertasbih kepada Allah Swt 
2)  memiliki jenis kelamin pria dan wanita
3)  Senantiasa beribadah kepada Allah Swt
4)  makan dan minum serta mempunyai nafsu
Dari pernyataan-pernyataan tersebut yang termasuk sifat-sifat malaikat  adalah ….
""", 0),
            Pair("""66. Fenomena hancurnya alam semesta merupakan gambaran terjadinya hari kiamat. Allah Swt. menugasi malaikat 
meniup sangsakala pada tiupan pertama hancur alam semesta. Malaikat tersebut adalah ….
""", 0)),

        listOf(Pair("""67. Perhatikan firman Allah Swt. QS. Al Anbiya/22:19 berikut
Sifat-sifat malaikat yang tercermin pada ayat di atas adalah…..
""",  R.mipmap.pai_kelas7_soal67),
            Pair("""68. Mahmud selalu menyadari perasaan orang lain , berbahagia dengan kebahagiaan orang lain dan bersedih dengan
kesedihan orang lain serta selalu bertindak membantu orang yang membutuhkan, yang dilakukan Mahmud adalah sikap ….
""", 0),
            Pair("""69. Manusia adalah makhluk sosial, ia tidak bisa hidup tanpa bantuan orang lain, sesuai pernyataan tersebut perilaku kita sebaiknya adalah….
""", 0)),

        listOf(Pair("""70. Perhatikan penggalan ayat QS. Al Baqarah/2:83 berikut:
dari ayat tersebut menegaskan bahwa kita harus….  
""", 0),
            Pair("""71. Perhatikan pernyataan-pernyataan berikut :
1) Membantu Pekerjaan orang tua di rumah
2) Tidak mengikuti nasihat-nasihat orang tua 
3) Memperlakukan orang tua dengan sopan dan hormat 
4) Membantu kehidupan ekonomi orang tua saat dibutuhkan 
Yang termasuk perilaku berbuat baik kepada kedua orang tua adalah ……
""", 0),
            Pair("""72. Sebagai seorang pelajar kita harus menghormati dan menghargai guru yang telah mendidik kita, berikut ini 
contoh perilaku menghormati dan menghargai guru, yaitu …..
""", 0)),

        listOf(Pair("""73. Dalil yang menunjukkan bahwa salat Jum’ah itu wajib adalah….
""",  R.mipmap.pai_kelas7_soal73),
            Pair("""74. Perhatikan hal-hal berikut :
1) Islam        
2) Laki-laki
3) Baligh           
4) Khutbah
Syarat wajib untuk melaksanakan shalat Jumat adalah ….
""", 0),
            Pair("""75. Seorang muslim sedang melakukan perjalanan jauh. Ia diberi keringanan untuk tidak shalat Jumat tetapi ia wajib melaksanakan ….
""", 0)),

        listOf(Pair("""76. Perhatikan hal-hal berikut :
1) pakaian putih                 
2) memotong kuku         
3) Baligh dan berakal 
4) memakai wangi-wangian 
Yang merupakan Sunnah shalat Jumat adalah ….
""", 0),
            Pair("""77. Seorang muslim wajib melaksanakan shalat Jumat ketika memenuhi syarat-syaratnya, tapi karena halangan tertentu
ia boleh meninggalkan shalat Jumat. Halangan yang membolehkan bagi seorang muslim tidak melaksanakan shalat Jumat tersebut adalah ….
""", 0),
            Pair("""78. Perhatikan Ilustrasi berikut:
Yasir adalah peserta didik yang selalu melaksanakan shalat Jum’at dengan khusyu’. Dia selalu datang tepat waktu dan mengikuti 
ibadah shalat Jum’at dengan baik. Di sekolahnya Yasir juga termasuk peserta didik yang taat dan tidak pernah melanggar tata tertib sekolah. 
Hikmah yang terkandung dalam pelaksanaan shalat Jumat sesuai dengan ilustrasi tersebut adalah …. 
""", 0)),

        listOf(Pair("""79. Shalat fardlu lima waktu wajib dilaksanakan tepat pada waktunya dengan sebab-sebab tertentu
bisa dilaksankan dengan dijamak, tetapi tidak semua shalat bisa dijamak. Shalat lima waktu yang boleh di jamak adalah ….
""", 0),
            Pair("""80. Shalat fardlu lima waktu yang empat rakaat dengan sebab-tertentu boleh dilakukan dengan dua rakaat 
yang disebut shalat qashar. Seseorang diizinkan melakukan mengqashar shalat apabila ….
""", 0),
            Pair("""81. Yusuf bersama teman-temannya pergi study tour ke Yogyakarta. Mereka berangkat dari Indramayu pukul 11.00 pagi. 
Setelah melakukan perjalanan dua jam mereka berhenti di masjid untuk istirahat dan melakukan shalat. 
Yusuf dan teman-temannya melakukan shalat dzuhur 2 raka’at dan shalat Asar 2 raka’at dilakukan pada waktu Dhuhur. 
Shalat Asar yang dilakukan oleh Yusuf dan temen-temannya adalah shalat….
""", 0)),

        listOf(Pair("""82. Perhatikan pernyataan-pernyataan berikut:
1) salat dzuhur dikerjakan pada waktu Asar.
2) shalat Asar dikerjakan pada waktu dhuhur.
3) salat maghrib dikerjakan pada waktu isya
4) shala isya dikerjakan pada waktu maghrib
Pernyataan yang menunjukkan contoh shalat jamak taqdim  adalah ….
""", 0),
            Pair("""83. Perhatikan shalat lima waktu berikut ini :
1) Shubuh        
2) Dhuhur        
3) Asar
4) Mahgrib
5) Isya
Shalat Wajib yang bisa diqashar adalah ….
""", 0),
            Pair("""84.  Perhatikan pernyataan-pernyataan berikut:
1) niat jamak qashar saat takbiratul ikram.
2) bepergian jauh minimal 80,64 km.
3) niat jamak  setelah do’a iftitah.
4) Sakit atau dalam kesulitan 
Yang termasuk syarat pelaksanaan shalat jamak adalah ….
""", 0)),

        listOf(Pair("""85. Nabi Muhammad Saw. diperintah oleh Allah Swt. untuk berhijrah dari Makkah ke Madinah. 
Yang menyebabkan Nabi Muhammad Saw. dan para sahabatnya hijrah adalah….
""", 0),
            Pair("""86. Perhatikan pernyataan-pernyataan berikut
1) membangun masjid Nabawi
2) mempersaudarakan anshar dan muhajirin
3) membangun rumah-rumah untuk tempat tinggal
4) membuat perjanjian dengan penduduk Madinah
Yang menunjukkan apa yang dilakukan Nabi Muhammad Saw. di Madinah adalah …
""", 0),
            Pair("""87. Setelah nabi Muhammad Saw. hijarah dan beliau menjadi pemimpin, Madinah menjadi maju baik peradaban maupun
kebudayaannya sehingga terkenal dengan sebutan Al Madinah al Munawarah yang artinya ….
""", 0)),

        listOf(Pair("""88. Setelah nabi Muhammad Saw. wafat kepemimpinan kaum muslimin digantikan oleh Al-Khulafau ar-Rasyidin, mereka
sahabat-sahabat beliau yang terdidik terbaik. Al-Khulafau ar-Rasyidin artinya …..
""", 0),
            Pair("""89. Al-Khulafau ar-Rasyidin yang telah membeli sumur yang jernih airnya dari seorang Yahudi seharga 200.000 dirham 
yang setara dengan dua setengah kilogram emas pada waktu itu. Sumur itu beliau wakafkan untuk kepentingan rakyat umum. Khalifah tersebut adalah ….
""", 0),
            Pair("""90. Umar bin Khattab  mendapatkan gelar dari Nabi dengan gelar “Umar Al Faruq” yang maknanya adalah orang yang ….
""", 0))
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. Fathah berhadapan dengan huruf yasukun","b. Kasroh berhadapan dengan huruf yasukun","c. Domah berhadapan dengan huruf wawsukun","d. Fathah berhadapan dengan huruf dal sukun"),
            listOf("a. Dan Allah yang Maha Melihat apa yang kamu kerjakan","b. Dan Allah yang Maha Teliti apa yang kamu kerjakan","c. Dan Allah yang Maha Mendengar apa yang kamu kerjakan","d. Dan Allah yang Maha Mengetahui apa yang kam kerjakan"),
            listOf("a. Kewajiban berbuat baik kepada orang tua","b. Kewajiban menuntut ilmu","c. Kewajiban menjauhi larangan-larangan Allah SWT","d. Kewajiban mengerjakan sholat")
        ),
        listOf(
            listOf("a. Sholabul ‘ilmi wardhatun ","b. Shalabul ‘ilmi faridlatun ","c. Thalabul ‘ilmi wardhatun","d. Thalabul ‘ilmi faridlatun"),
            listOf("a. Akan diangkat derajatnya","b. Mampu menyelesaikan masalah","c. Akan beriman dengan sempurna","d. Boleh melakukan apa saja"),
            listOf("a. Perintah berbuat baik kepada orang tua","b. Derajat orang yang beriman dan berilmu","c. Kewajiban mengerjakan sholat","d. Kewajiban menjauhi larangan-larangan Allah")
        ),
        listOf(
            listOf("a. Al-‘Alim ","b. As-Sami’ ","c. Al-Khabir","d. Al-Basir"),
            listOf("a. Mendengar ","b. Teliti","c. Melihat","d. Mengetahui"),
            listOf("a. Bersikap pemaaf kepada sesama ","b. Rajin dalam menimba ilmu","c. Bersikap dermawan kepada sesama","d. Berusaha menghindari kemungkaran")
        ),
        listOf(
            listOf("a. Nama-nama Allah swt. Yang baik ","b. Nama-nama Allah swt yang benar ","c. Sifat-sifat Allah swt.","d. Nama-nama Allah swt yang kuasa"),
            listOf("a. Al-Sami ","b. Al-Alim ","c. Al-Khabir","d. Al-Bashir"),
            listOf("a. Iman ","b. Ihsan ","c. Islam ","d. Taqwa")
        ),
        listOf(
            listOf("a. Berkata sejujurnya kepada orang tuanya","b. Meminjam barang, lalu ia mengembalikannya","c. Teman menitipkan air, ia meminumnya sedikit","d. Menghormati dan menaati orang tua dan guru"),
            listOf("a. Istiqomah ","b. Amanah ","c. Jujur ","d. Cerdas"),
            listOf("a. 1, 2 dan 3 ","b. 2, 3 dan 4 ","c. 1, 2 dan 4 ","d. 1, 3 dan 4")
        ),
        listOf(
            listOf("a. Jujur ","b. Boros ","c. Empati ","d. Istiqomah"),
            listOf("a. Sabar dan rendah hati","b. Tekun dan ulet","c. Selalu memaafkan","d. Tidaks ombong"),
            listOf("a. Allah swt ","b. Binatang ","c. Diri sendiri ","d. Manusia")
        ),
        listOf(
            listOf("a. Belajar dengan sungguh-sungguh","b. Selalu melaksanakan sholat tepat waktu","c. Selalu taat kepada Allah swt","d. Selalu menaati peraturan yang ada di sekolah"),
            listOf("a. Damai ","b. Sederhana ","c. Bersih ","d. Tenang"),
            listOf("a. Hadas besar ","b. Hadas kecil","c. Hadas kecil dan hadas besar","d. Najis")
        ),
        listOf(
            listOf("a. Buangair kecil ","b. Buang angin ","c. Tidur ","d. Haid atau nifas"),
            listOf("a. Berpuasa ","b. Mendengarkan ceramah ","c. Zikir dan beristighfar","d. Mendengar azan"),
            listOf("a. Darah ","b. Kotoran hewan ","c. Air kencing bayi laki-laki dibawah umur 2 tahun","d. Bangkai")
        ),
        listOf(
            listOf("a. 1 dan 3 ","b. 2 dan 3 ","c. 3 dan 4 ","d. 2 dan 4"),
            listOf("a. Memercikan/mengusapkan air yang suci pada permukaan yang terkena najis","b. Mengalirkan air pada benda yang terkena najis","c. Menghilangkan zat, rasa, warna dan baunya dengan menggunakan air suci","d. Membasuh sebanyak 7 x menggunakan air yang dicampur dengan tanah"),
            listOf("a. Satu orang ","b. Tiga orang ","c. Dua orang ","d. Empat orang")
        ),
        listOf(
            listOf("a. 17 derajat ","b. 37 derajat ","c. 27 derajat ","d. 47 derajat"),
            listOf("a. Makmum berniat mengikuti imam ","b. Mengetahui gerakan sholat imam ","c. Berada dalam satu tempat dengan imam","d. Berdiri pada posisi paling depan"),
            listOf("a. Ketinggalan sholatnya imam ","b. Memisahkan diri dengan imam","c. Menyesuaikan diri dengan imam","d. Tidak mengikuti sholatnya imam")
        ),
        listOf(
            listOf("a. 1 dan 2 ","b. 1 dan 4 ","c. 2 dan 4 ","d. 3 dan 4"),
            listOf("a. Imam ","b. Makmum ","c. Muslim ","d. Mukmin"),
            listOf("a. Paling belakang ","b. Di belakang imam","c. Di belakang makmum laki-laki dewasa","d. Di depan saf perempuan dewasa")
        ),
        listOf(
            listOf("a. Senin, 12 Rabiul Awwal ","b. Senin, 15 Rabiul Awwal ","c. Ahad, 12 Rabiul Awwal","d. Jum’at, 13 Rabiul Awwal"),
            listOf("a. 12 tahun ","b. 15 tahun ","c. 20 tahun ","d. 25 tahun"),
            listOf("a. 25 tahun ","b. 30 tahun ","c. 35 tahun ","d. 40 tahun")
        ),
        listOf(
            listOf("a. Surah al-Fatihah: 1-7 ","b. Surah al-Falaq:1-5","c. Surah al-Alaq: 1-5","d. Surah al-Baqarah: 1-5"),
            listOf("a. Biasa-biasa saja ","b. Ada yang menerima ada yang menolak","c. Menerima semua ajakan Nabi","d. Menolak semua ajakan Nabi"),
            listOf("a. Siti Huzaifah ","b. Halimatus Sa’diyah ","c. Ummi Kulsum","d. Ummi Maktum")
        ),
        listOf(
            listOf("a. Abu Thalib ","b. Abu Lahab ","c. Hamzah bin Abdul Muthalib","d. Abdul Muthalib"),
            listOf("a. Al Qamariyah dan Al Syamsiyah ","b. Al Hamdulilah dan Al Qamariyah","c. Al Syamsiyah dan Al Fatihah ","d. Al Fatihah dan Al Qamariyah "),
            listOf("a. Terdapat AL dan huruf Qomariyah ","b. Terdapat tasydid ","c. Terdapat Al yang bertanda sukun ","d. Terdapat huruf Al Qomariyah ")
        ),
        listOf(
            listOf("a. 12","b. 13","c. 14","d. 15"),
            listOf("a. 12","b. 13","c. 14","d. 15"),
            listOf("a. Al Qomariyah ","b. Al Syamsiyah","c. Al Fatihah","d. Al Kitab ")
        ),
        listOf(
            listOf("a. Al Qomariyah ","b. Al Syamsiyah","c. Al Fatihah","d. Al Kitab"),
            listOf("a. غفقك","b. حخسش","c. رزسش","d. صضقك"),
            listOf("a. غفقك","b. حخسش","c. رزسش","d. صضقك")
        ),
        listOf(
            listOf("a. اَلشَّمْسُ","b. وَالضُّحَى","c. وَالْفَجْرِ","d. وَالسَّمَاءِ"),
            listOf("a. Al Qamariyah","b. Al Syamsiyah ","c. Al Fatihah ","d. Al Baqarah "),
            listOf("a. إِهْدِناَ","b. الصِّرَاطَ","c. الْمُسْتَقِيْمَ","d. إِهْدِناَالصِّرَاطَ")
        ),
        listOf(
            listOf("a. Percaya","b. Takwa","c. Berserah diri ","d. Pasrah"),
            listOf("a. Al Ghafur","b. Al Khaliq","c. Al Khobir","d. At Tawwab"),
            listOf("a. Al Ghafur","b. Al Wahhab","c. Al Khobir","d. At Tawwab")
        ),
        listOf(
            listOf("a. Al Ghafur","b. Al Wahhab","c. Al Khobir","d. At Tawwab"),
            listOf("a. Al Ghafur","b. Al Wahhab","c. Al Khobir","d. At Tawwab"),
            listOf("a. Suka memberikan nasihat kepada orang lain ","b. Menyadari bahwa kekuatan itu hanya dari Allah swt. ","c. Menetapkan hukum dengan adil ","d. Membiasakan perbuatan baik dan terpuji ")
        ),
        listOf(
            listOf("a. Al Ghafur","b. Al Wahhab","c. Al Adl","d. At Tawwab"),
            listOf("a. Meyakini dalam hati, mengikrarkan dengan lisan dan mengamalkan dalam perbuatan ","b. Mengerjakan seluruh perintah Allah dan menjauhi semua larangannya","c. Meyakini bahwa Allah swt yang menciptakan manusia dan seluruh makhluk-Nya","d. Mempercayai bahwa Allah yang mengutus Nabi Muhammad dan menurunkan kitab-Nya."),
            listOf("a. Syahadat rasul dan syahadat Allah","b. Syahadat nabi dan syahadat rasul","c. Syahadat tauhid dan sahadat rasul ","d. Syahadat iman dan syahadat islam")
        ),
        listOf(
            listOf("a. 1                        ","b. 2                        ","c. 3                        ","d. 4"),
            listOf("a. Jibril                ","b. Mikail                ","c. Israfil                ","d. Raqib dan Atid "),
            listOf("A. 1-a, 2-b, 3-d                 ","B. 1-b, 2-c, 3-d                 ","C. 1-c, 2-d, 3-a        ","D. 1-d, 2-a, 3-b")
        ),
        listOf(
            listOf("a. Jibril        ","b. Israfil        ","c. Nakir        ","d. Atid "),
            listOf("a. 1, 3        ","b. 1, 4        ","c. 2, 3                    ","d. 3, 4"),
            listOf("a. Jibril                                ","b. Mikail                ","c. Raqib                ","d. Israfil ")
        ),
        listOf(
            listOf("a. selalu sujud dan patuh serta memuji Allah Swt ","b. senantiasa taat dan patuh beribadah  kepada Allah Swt","c. tidak merasa angkuh dan tidak merasa lelah dalam beribadah","d. tidak menyalahi dan bermaksiat terhadap perintah kepada Allah Swt"),
            listOf("a. amanah        ","b. jujur        ","c. empati        ","d. istiqamah"),
            listOf("a. Mendengarkan apa kata orang lain      ","b. Merendahkan diri kepada orang lain  ","c. Mengikuti apa yang dirasakan orang lain","d. Merasakan apa yang dirasakan orang lain")
        ),
        listOf(
            listOf("a. menghormati tetangga        ","b. menghormati saudara ","c. menyayangi adik","d. berbakti kepada orang tua "),
            listOf("a. 1, 2 dan 3                ","b. 1, 3 dan 4 ","c. 2, 3 dan 4","d. 1, 2 dan 4"),
            listOf("a. Mengucapkan salam bila bertemu","b. Selalu menceritakan kebaikan dan keburukanya","c. Masuk dan pulang sekolah senantiasa tepat waktu ","d. Berpakaian seragam sesuai dengan aturan sekolah ")
        ),
        listOf(
            listOf("a. ","b.        ","c.        ","d.        "),
            listOf("a. 1, 2 dan 3                      ","b. 1, 2 dan 4 ","c. 2, 3 dan 4","d. 1, 3 dan 4"),
            listOf("a. shalat Jamak                      ","b. shalat Dhuhur  ","c. meng-qada shalat","d. membayar fidyah")
        ),
        listOf(
            listOf("a. 1, 2 dan 3                        ","b. 1, 2 dan 4  ","c. 2, 3 dan 4","d. 1, 3 dan 4"),
            listOf("a. masjidnya cukup jauh.                       ","b. sibuk menerima tamu ","c. terlalu sibuk dengan pekerjaan  ","d. angin kencang, hujannya deras"),
            listOf("a. Handal        ","b. Disiplin        ","c. Jujur        ","d. Tanggung jawab")
        ),
        listOf(
            listOf("a. Salat subuh dengan zuhur.        ","b. Salat subuh dengan isya","c. Salat magrib dengan isya","d. Salat asar dengan maghrib"),
            listOf("a. Dalam keadaan perang.       ","b. Dalam keadaan lupa. ","c. Dalam perjalanan jauh.","d. Dalam keadaan sibuk."),
            listOf("a. jamak taqdim qashar               ","b. jamak takhir qashar ","c. Jamak qashar takhir","d. Qashar jamak takhir")
        ),
        listOf(
            listOf("a. 1, 2                       ","b. 2, 4","c. 3, 4","d. 1, 4"),
            listOf("a. 1,2 dan 4                       ","b. 1,3 dan 4   ","c. 2,3 dan 5","d. 2,3 dan 4"),
            listOf("a. 1 dan 2                       ","b. 2 dan 3   ","c. 2 dan 4","d. 3 dan 4")
        ),
        listOf(
            listOf("a. di Mekah tidak pernah hujan         ","b. tidak aman untuk berda’wah         ","c. di Mekah banyak kafir Quraisy ","d. di Mekah daerahnya terlalu panas"),
            listOf("a. 1, 2 dan 3        ","b. 1, 2 dan 4        ","c. 1, 3 dan 4        ","d. 2, 3 dan 4"),
            listOf("a. Kota yang bercahaya                          ","b. Kota yang aman","c. Kota yang indah    ","d. Kota yang tenteram")
        ),
        listOf(
            listOf("a. pemimpin yang mendapat hidayah, pengganti Rasulullah","b. pemimpin yang di kasihi, yang menggantikan  Rasulullah","c. pemimpin yang mendapatkan gelar, pengganti Rasulullah","d. pemimpin yang dihormati, yang menggantikan Rasulullah"),
            listOf("a. Umar bin Khatab                       ","b. Utsman bin Affan   ","c. Ali Bin Abi Thalib","d. Abu Bakar as-Siddiq"),
            listOf("a. cerdas, tegas, dan peduli dengan rakyatnya","b. memiliki kesabaran, pemaaf, dan penyayang","c. bisa memisahkan antara yang benar dan yang batil","d. bertanggung jawab, saleh, dermawan tegas, dan jujur")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,1,1),
        listOf(3,3,1),
        listOf(0,1,3),
        listOf(0,3,0),
        listOf(1,1,2),
        listOf(0,1,2),
        listOf(1,2,2),
        listOf(3,0,2),
        listOf(2,3,2),
        listOf(2,3,0),
        listOf(0,0,0),
        listOf(0,0,3),
        listOf(2,3,1),
        listOf(3,0,1),
        listOf(2,2,0),
        listOf(1,2,2),
        listOf(2,1,2),
        listOf(0,0,1),
        listOf(3,3,0),
        listOf(2,0,2),
        listOf(1,3,3),
        listOf(0,0,3),
        listOf(2,2,3),
        listOf(3,1,0),
        listOf(3,0,1),
        listOf(1,3,1),
        listOf(2,2,0),
        listOf(1,2,2),
        listOf(1,1,0),
        listOf(0,1,2)





    )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas7, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerPai.scorePaiKelas7 < 1) 0 else scoreManagerPai.scorePaiKelas7 / 5
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
            val getData = soalPaisd7[jawabanBenar6][i]
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

                    var scoreMatSd = scoreManagerPai.scorePaiKelas7
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar6++

                        if(jawabanBenar6 == soalPaisd7.size){
                            scoreMatSd +=5
                            scoreManagerPai.scorePaiKelas7 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManagerPai.scorePaiKelas7 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalPaisd7[jawabanBenar6][i]
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
                        energy.energy = energy.energy - 1
                        energy.saveComp()
                    }
                } // end cek jawab
            }else {
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT).show()
            }
        }
    }// end cek semua jawaban telah di centang

        return view
    }
}