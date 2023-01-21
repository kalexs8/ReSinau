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

class SoalPaiKelas8 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalPaisd8: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Allah Swt, menurunkan kitab kitab-kitab kepada para rasul-Nya untuk disampaikan kepada umat manusia tujuan ...""", 0),
            Pair("""2. Semua kitab Allah SWT, berisi ajaran yang sama, yaitu ajaran tentang ...""", 0),
            Pair("""3. Perhatikan pernyataan berikut ini
1) Membaca merupakan ibadah
2) menyempurnakan kitab
3) berlaku hanya untuk umat tertentu
4) bahasanya tidak semua orang bisa mengerti
5) dijamin keasliannya sampai hari
6) isinya mencakup semua aspek kehidupan
Yang termasuk keistimewaan al Quran dibandingkan dengan kitab-kitab yang lain adalah ......
""", 0)),

        listOf(Pair("""4. Beriman kepada kitab-kitab Allah Swt, akan mendorong manusia berfikir dan berbuat positif artinya?""", 0),
            Pair("""5. Perhatikan pernyataan berikut ini
1) hati menjadi tentram
2) dapat membedakan mana yang baik dan mana yang buruk
3) hati merasa tentram
4) memiliki sikap toleransi yang tinggi
5) dijadikan pedoman dalam menentukan kebenaran
Uraian di atas merupakan ...
""", 0),
            Pair("""6. Perhatikan hadits beriku ini
وَالَّذِيْنَ يُؤْمِنُوْنَ بِمَآ اُنْزِلَ اِلَيْكَ وَمَآ اُنْزِلَ مِنْ قَبْلِكَ ۚ وَبِالْاٰخِرَةِ هُمْ يُوْقِنُوْنَ ۗ ﴿البقرة : ۴﴾
""", 0)),

        listOf(Pair("""7. Perhatikan pernyataan berikut ini
1) Mengonsumsi minuman keras
2) Berjudi
3) Mengundi nasib menggunakan panah
4) Bermain kartu
5) Berkurban untuk berhala
Beberapa perbuatan yang dilarang berdasarkan Q.S. al-Maidah/5: 90
""", 0),
            Pair("""8. Q.S. al-Maidah/5:91 menjelaskan bahwa Syetan membujuk manusia agar mengkonsumsi minuman keras dan berjudi dengan tujuan ...""", 0),
            Pair("""9. Cara menghindarkan diri dari mengonsumsi minuman keras, adalah dengan ...""", 0)),

        listOf(Pair("""10. Perhatikan pernyataan berikut ini
1) Merugikan diri sendiri dan orang lain
2) Menyebabkan lalai dalam melaksanakan kewajiban
3) Meningkatkankan perekonomian keluarga
4) Menimbulkan kesedihan dan penyesalan di kemudian hari
5) Mengakibatkan malas bekerja
Dari uraian di atas, ada beberapa dampak negatif dari perjudian di antaranya adalah ...
""", 0),
            Pair("""11. Dampak negatif bagi fisik akibat mengkonsumsi minuman beralkohol adalah ...""", 0),
            Pair("""12. Perhatikan ayat berikut ini
Potongan ayat di atas, berisi penjelasan tentang perintah berperilaku adil, karena ...
""", 0)),

        listOf(Pair("""13. Perhatikan kalimat berikut ini
PENGUMUMAN 
----------------
TELAH DITEMUKAN
SEBUAH
JAM TANGAN
DI PERPUSTAKAAN
PADA WAKTU
JAM ISTIRAHAT
APABILA ADA YANG KEHILANGAN
HARAP MENGAMBIL
KE RUANG GURU
SETELAH
JAM ISTIRAHAT
Seorang siswa memasang papan pengumuman kehilangan jam tangan di depan ruang OSIS. Tindakan siswa tersebut mencerminkan perilaku ...
""", 0),
            Pair("""14. Allah Swt menegaskan bahwa kebencian terhadap suatu golongan atau individu, 
janganlah menjadi pendorong untuk bertindak tidak adil. Hal ini menjadi bukti bahwa Islam ...
""", 0),
            Pair("""15. Kejujuran peserta didik pada saat mengerjakan ulangan akan sangat membantu bapak atau ibu guru, karena ...""", 0)),

        listOf(Pair("""16. Di bawah ini merupakan salah satu cara menerapkan perilaku jujur ketika di sekolah, kecuali ….
""", 0),
            Pair("""17. Perhatikan pernyataan berikut ini
1) Bertutur kata yang sopan dengan tetangga
2) Menjaga nama baik orang lain
3) Memberikan hak kepada tetangga
4) Menengok teman yang sakit
5) Membiarkan tetangga yang mengalami kesulitan
Yang tergolong perilaku jujur diantaranya adalah ...
""", 0),
            Pair("""18. Shalat sunah yang dikerjakan secara bersama - sama, yang di pimpin oleh seorang imam dan yang lainnya sebagai makmum, adalah pengertian dari shalat ...""", 0)),

        listOf(Pair("""19. Dikerjakan di malam hari khususnya di sepertiga akhir malam dan dikerjakan setelah tidur, merupakan waktu yang utama untuk melakukan shalat sunah?""", 0),
            Pair("""20. Perhatikan pernyataan berikut ini
1) shalat sunah tarawih
2) shalat sunah istisqa
3) shalat sunah kusuf 
4) shalat sunah khusuf 
5) Shalat sunah
6) Shalat sunah
Shalat sunah yang hanya bisa dilakukan secara berjamaah saja di antaranya ...
""", 0),
            Pair("""21. Perhatikan pernyataan berikut ini
1) 2 rakaat sebelum dan sesudah shalat dhuhur
2) 2 rakaat sesudah shalat maghrib
3) 4 rakaat sebelum shalat ashar
4) 2 rakaat sesudah shalat isya
5) 2 rakaat sebelum shalat subuh
Yang tergolong shalat sunah rawatib muakkad (shalat sunah yang dikuatkan), di antaranya ...
""", 0)),

        listOf(Pair("""22. Beberapa hikmah yang bisa diperoleh jika kita membiasakan diri mengerjakan shalat-shalat sunah, di antaranya sebagai berikut, kecuali ...""", 0),
            Pair("""23. Tata cara melakukan shalat sunah gerhana, adalah ...""", 0),
            Pair("""24. Perhatikan pernyataan berikut ini
1) shalat Idain
2) shalat Tarawih
3) shalat Witir
4) shalat tasbih
5) shalat Tahiyatul masjid
Shalat-shalat sunah di atas, yang bisa dilakukan secara munfarid dan berjamaah ....
""", 0)),

        listOf(Pair("""25. Salah satu sebab disunahkannya melakukan sujud syukur, adalah ...""", 0),
            Pair("""26. Ahmad sedang mengerjakan shalat, tiba-tiba teringat bahwa dia tidak membaca tasyahud awal, kemudian dia melakukan sujud sahwi ...""", 0),
            Pair("""27. Perhatikan ayat berikut ini
سَجَدَ وَجْهِيَ لِلَّذِي خَلَقَهُ وَصَوَّرَهُ وَشَقَّ سَمْعَهُ وَبَصَرَهُ بِحَوْلِهِ وَقُوَّتِهِ
Bacaan di atas adalah bacaan ketika melakukan sujud ...
""", 0)),

        listOf(Pair("""28. Perhatikan ayat berikut ini
سُبْحَانَ مَنْ لاَيَنَامُ وَلاَ يَسْهُوْ
Bacaan di atas adalah bacaan ketika kita melakukan sujud ...
""", 0),
            Pair("""29. Perhatikan pernyataan berikut ini
1) terhindar dari sifat sombong dan angkuh
2) memperoleh kepuasan batin
3) dosa-dosanya diampuni oleh Allah
4) merasa dekat dengan Allah
5) nikmatnya ditambah oleh Allah Swt.
Hikmah yang kita peroleh dari perilaku membiasakan diri melakukan sujud syukur, adalah ...
""", 0),
            Pair("""30. Perhatikan pernyataan berikut ini
1) Lupa kelebihan rakaat shalat 
2) Diberi kesehatan 
3) Mendengar ayat-ayat sajdah 
4) lupa membaca takhiyat awal
5) terhindar dari musibah
6) ragu-ragu jumlah rakaat
Pernyataan di atas yang termasuk sebab-sebab disunahkannya melakukan sujud sahwi, adalah …
""", 0)),

        listOf(Pair("""31. Sujud sahwi dilakukan setelah membaca takhiyat akhir sebanyak ... sujud?""", 0),
            Pair("""32. Ketika berdiri dalam shalat dan membaca ayat-ayat sajdah, kemudian kita sujud 1x dengan membaca bacaannya, setelah itu...""", 0),
            Pair("""33. Bani Umayyah mengalami kemajuan dalam berbagai bidang, ditandai dengan adanya beberapa peninggalan berikut, kecuali ....""", 0)),

        listOf(Pair("""34. Pemerintahan Daulah Umayyah berpusat di kota ...""", 0),
            Pair("""35. Perhatikan pernyataan di bawah ini
1) kehidupan yang serba mewah bagi keluarga istana
2) munculnya kekuatan baru yang dipelopori oleh keturunan al Abbas ibn Abd al Muthalib
3) pertentangan etnis antara suku Arabia Utara dan Arabia Selatan yang sudah ada sejak jaman sebelum Islam
4) semangat yang tinggi dalam persatuan dan kesatuan dalam membela negara
5) banyak memberikan bantuan kepada fakir miskin
Dari beberapa pernyataan di atas, yang merupakan penyebab runtuhnya Bani Umayyah adalah ...
""", 0),
            Pair("""36. Daulah Umayyah didirikan oleh ...""", 0)),

        listOf(Pair("""37. Yang tidak termasuk hikmah mempelajari sejarah pertumbuhan ilmu pengetahuan masa Umayyah ...""", 0),
            Pair("""38. Perhatikan ayat berikut ini
Potongan Q.S. al Furqan di atas, berisi tentang perintah bersikap?
""", 0),
            Pair("""39. Perhatikan pernyataan di bawah ini
1) Tidak suka meniru-niru gaya orang lain
2) Ingin tampil sesuai jati diri, menjadi dirinya sendiri sesuai ajaran islam
3) Mudah meminta maaf kepada orang lain jika merasa bersalah
4) Mudah memaafkan kesalahan orang lain, karena ia menyadari bahwa setiap manusia pasti pernah bersalah
Perilaku-perilaku di atas, ditunjukkan oleh orang yang memiliki sikap....
""", 0)),

        listOf(Pair("""40. Manfaat yang dapat kita peroleh dari perilaku hidup hemat dan sederhana adalah ...""", 0),
            Pair("""41. فَكُلُوا۟ مِمَّا ........ٱللَّهُ حَلَٰلًا طَيِّبًا
Lengkapilah penggalan ayat dalam QS. An Nahl/16:114 tersebut...
""", R.mipmap.pai_kelas8_soal41),
            Pair("""42. Perhatikan  penggalan ayat berikut
وَاشْكُرُوا نِعْمَتَ اللَّهِ إِنْ كُنْتُمْ إِيَّاهُ تَعْبُدُونَ
Isi kandungan dari penggalan ayat tersebut adalah ...
""", 0)),

        listOf(Pair("""43. Lam jalalah pada lafaz   الله yang dibaca tarqiq adalah .....  """, R.mipmap.pai_kelas8_soal43),
            Pair("""44. Contoh hukum bacaan” Ra” yang dibaca tafkhim adalah ....  """, R.mipmap.pai_kelas8_soal44),
            Pair("""45. أَنَّ لَهُمْ جَنَّٰتٍ تَجْرِى مِن تَحْتِهَا ٱلْأَنْهَٰرُ ۖ كُلَّمَا رُزِقُوا۟ مِنْهَا مِن ثَمَرَةٍ رِّزْقًا ۙ قَالُوا۟ هَٰذَا ٱلَّذِى رُزِقْنَا مِن قَبْلُ ۖ وَأُتُوا۟ بِهِۦ مُتَشَٰبِهًا ۖ وَلَهُمْ فِيهَآ أَزْوَٰجٌ مُّطَهَّرَةٌ
Dari potongan ayat tersebut, yang termasuk bacaan  Ra Tarqiq ditunjukan pada nomor ......
""", R.mipmap.pai_kelas8_soal45)),

        listOf(Pair("""46. Lam jalalah dibaca tafkhim apabila ….                  
""", 0),
            Pair("""47. Ra dibaca tarqiq apabila ....""", 0),
            Pair("""48. Ahmad memberi nasihat terhadap temanya  agar menyakini dengan sepenuh hati bahwa Allah Swt
mengutus Rasul-Nya untuk menyampaikan wahyu dan petunjuk bagi umat manusia ke jalan yang lurus
sehingga dapat mencapai kebahagiaan di dunia dan akhirat nasihat Ahmad tersebut termasuk pengertian dari ......
""", 0)),

        listOf(Pair("""49. Potongan ayat dibawah ini yang menjelaskan tentang iman kepada rasul adalah ....""", R.mipmap.pai_kelas8_soal49),
            Pair("""50. Perhatikan pernyataan dibawah ini
1) Sebagai pemberi peringatan                
2) Sebagai Pemberi hadiah    
3) Sebagai Pembawa kabar gembira
4) Sebagai pembawa kabar hoak
Tugas para rasul ditunjukan pada nomor ...
""", 0),
            Pair("""51. ‘Aradul Basyariyah merupakan sifat jaiz bagi rasul,maksudnya yaitu ...""", 0)),

        listOf(Pair("""52. Dibawah ini yang termasuk sifat wajib dan mustahil bagi Rasul adalah
""", 0),
            Pair("""53. Rasul yang memiliki keteguhan hati dalam menghadapi cobaan dari Allah SWT., disebut ....""", 0),
            Pair("""54. Allah Swt. memberikan mu’jizat terhadap rasulnya diantaranya yaitu Dapat melunakkan besi 
dan gunung gunung bertasbih kepadanya. Mu’jizat tersebut diberikan terhadap Nabi ...
""", 0)),

        listOf(Pair("""55. Hikmah beriman kepada Rasul  Allah adalah ....""", 0),
            Pair("""56. Ketika orang tua meminta tolong kepada anaknya untuk membelikan beras di warung, 
sementara anaknya sedang sibuk belajar. Sikap yang tepat sebagai seorang anak untuk berbuat baik terhadap orang tuanya adalah ....
""", 0),
            Pair("""57.  وَٱعْبُدُوا۟ ٱللَّهَ وَلَا تُشْرِكُوا۟ بِهِۦ شَيْـًٔا ۖ وَبِٱلْوَٰلِدَيْنِ إِحْسَٰنًا
Ayat diatas menunjukan dalil tentang .... 
""", R.mipmap.pai_kelas8_soal57)),

        listOf(Pair("""58. رِضَا اللَّهِ فِي رِضَا الْوَالِدَيْنِ , وَسُخْطُ اللهِ فِى سُخْطِ الِدَيْنِ                                                           
maksud hadist tersebut adalah ....
""", R.mipmap.pai_kelas8_soal58),
            Pair("""59. Perilaku durhaka kepada orang tua merupakan penyakit hati dan termasuk dosa besar
Seorang anak yang durhaka kepada orang tuanya akan sengsara hidupnya, baik di dunia 
maupun di akhirat kelak. Dalam bahasa agama durhaka kepada orang tua dinamakan ….
""", 0),
            Pair("""60. Yang termasuk cara berbakti kepada kedua orang tua dan guru adalah .....""", 0)),

        listOf(Pair("""61. Sering seorang siswa membeda bedakan fungsi antara orang tua dan guru, 
padahal fungsi keduanya hampir sama. Dibawah ini yang bukan termasuk kesamaan fungsi orang tua dan guru adalah ...
""", 0),
            Pair("""62. Amin adalah anak yang baik dan pintar ia seorang siswa kelas delapan di SMPN Dunia Akhirat, 
ketika pelajaran Pendidikan Agama Islam  ia sering melamun, kelihatan banyak permasalahan 
yang ia hadapi, akhirnya gurunya pun menegurnya dan bertanya tentang apa yang ia hadapi, 
Amin pun menjawab Ibu dan Bapak ku sudah dua bulan pindah Agama. Bagaimana sikap saya  
terhadap orang tuaku yang sdh beda agama ? Gurunya pun memberi nasihat, sikap kamu adalah ......
""", 0),
            Pair("""63. Amad selalu patuh terhadap orang tuanya, apa yang disuruh oleh orang tuanya ia selalu kerjakan. 
Setelah orang tuanya meninggal ia bingung bagaimana cara menghormati orang tua yang sudah meninggal dunia
Sikap yang tepat adalah ......
""", 0)),

        listOf(Pair("""64. اِنَّ الْاِنْسَانَ لَفِيْ خُسْرٍۙ اِلَّا الَّذِيْنَ اٰمَنُوْا وَعَمِلُوا الصّٰلِحٰتِ وَتَوَاصَوْا بِالْحَقِّ ەۙ وَتَوَاصَوْا بِالصَّبْرِ
Ayat diatas menjelaskan tentang ...... 
""", R.mipmap.pai_kelas8_soal64),
            Pair("""65. Perhatikan hal-hal sebagai berikut:
1) Mengetahui ilmunya
2) Niat ikhlas karena Allah SWT.
3) Dapat pujian
4) Membantu tetangga
5) Sesuai dengan petunjuk Al’quran dan Hadits
Yang termasuk amal sholikh yang sah dapat ditunjukkan dengar nomor....
""", 0),
            Pair("""66. Allah SWT menyuruh kita untuk selalu beramal sholeh atau istilahnya berbuat baik terhadap semua makhluk Allah SWT
dimana amal kebaikan itu akan dicatat sebagai ibadah. Hal ini termasuk jenis amal sholeh terhadap ...
""", 0)),

        listOf(Pair("""67. Pada saat menjelang pemilihan ketua osis, setiap calon mengkampanyekan gagasan atau ide masing –masing,
tapi sebagian siswa ada  yang menanggapinya dengan sinis dan tidak percaya, akhirnya timbullah buruk sangka,
dan mencari kesalahan kesalahan calon lain. Dalam ajaran islam sifat itu disebut suudhan yang harus 
kita jauhi. Lawan kata dari sifat suudhan adalah ...
""", 0),
            Pair("""68. Puasa wajib yang dimaksudkan dalam QS. Al Baqarah/2:183 adalah puasa yang… .
""", 0),
            Pair("""69. Pada bulan Desember tahun 2018 yang lalu telah terjadi tsunami di provinsi Banten, 
banyak orang tua yang kehilangan anggota keluarganya. Ahmad adalah salah satu orang tua 
yang kehilangan anak semata wayangnya yang masih berumur 12 tahun, sudah berhari hari ia mencarinya 
tapi tidak menemukanya, karena terlalu sayang kepada anaknya akhirnya Ahmad berjanji apabila anak saya
ditemukan saya akan berpuasa selama sebulan penuh, Akhirnya anak Ahmad ditemukan oleh tetanganya
dalam keadaan masih hidup. Puasa yang dijanjikan Ahmad Termasuk puasa ......
""", 0)),

        listOf(Pair("""70. Perhatikan pernyataan dibawah ini
1) Puasa Ramadhan
2) Puasa Syawal
3) Puasa Nazar
4) Puasa Dawud
5) Puasa Qada
6) Puasa Kifarat
Yang termasuk macam-macam  puasa wajib adalah .....
""", 0),
            Pair("""71. مَنْ صَامَ رَمَضَانَ ثُمَّ أَتْبَعَهُ سِتَّا مِنْ شَوَّالٍ كَانَ كَصِيَامِ الدَّهْر
Hadist tersebut menerangkan tentang puasa sunnah yaitu puasa ....
""", R.mipmap.pai_kelas8_soal71),
            Pair("""72. Daftar makanan dan minuman yang ada di Warung pak Bejo
1) Opor ayam                    6)  Es jeruk
2) Tempe                        7)  Es Tuak
3) Marus                        8)  Air Mineral
4) Jengkol                      9)  Rajungan
5) Sate biawak                  10)  Kopi dicampur darah ular
Yang termasuk makanan dan minuman yang halal ditunjukan pada nomor .....
""", 0)),

        listOf(Pair("""73.     حُرِّمَتْ عَلَيْكُمُ ٱلْمَيْتَةُ وَٱلدَّمُ وَلَحْمُ ٱلْخِنزِيرِ وَمَآ أُهِلَّ لِغَيْرِ ٱللَّهِ بِهِ
Makanan yang dinyatakan haram pada potongan ayat tersebut adalah ...
""", 0),
            Pair("""74. كُلُّ مُسْكِرٍ خَمْرٌ وَكُلُّ خَمْرٍ حَرَام
Penggalan hadist tersebut menerangkan tentang ....
""", R.mipmap.pai_kelas8_soal74),
            Pair("""75. Hukum islam menegaskan bahwa mengkonsumsi Khamar, baik sedikit ataupun banyak hukumnya haram dan termasuk dosa besar, 
adapun dampak buruk meminum khamr adalah .... 
""", 0)),

        listOf(Pair("""76. Abdullah selalu mengkonsumsi makanan dan minuman yang halal, ia ga pernah meminum dan memakan yang haram 
sehingga manfaatnya terasa sekali bagi diri Abdullah, adapun manfaat yang didapat Abdullah yaitu ......
""", 0),
            Pair("""77. Pemerintahan daulah Abbasiyah merupakan kelanjutan dari pemerintahan bani umayyah, kekuasaanya berlangsung cukup lama 
mulai dari tahun 750 M sampai dengan tahun 1258 M. Adapun pendiri daulah abbasiyah ini adalah ....
""", 0),
            Pair("""78. Puncak kejayaan pemerintahan Daulah Abbasiyah terjadi pada masa pemerintahan Harun Al-Rasyid yaitu pada tahun ....""", 0)),

        listOf(Pair("""79. Pada masa kekhalifaan Bani Abbas, didirikan pusat ilmu pengetahuan yang dikenal dengan nama ... """, 0),
            Pair("""80. Pada masa Daulah Abbasiyyah merupakan masa keemasan bagi umat islam, Ilmu pengetahuan berkembang dengan pesat, 
sehingga muncullah tokoh tokoh cendekiawan islam di berbagai bidang ilmu pengetahuan. Tokoh cendikiawan islam dibidang kedokteran adalah adalah …. 
""", 0),
            Pair("""81. Salah satu rukun iman adalah iman kepada kitab Allah, makna dari iman kepada kitab Allah adalah...""", 0)),

        listOf(Pair("""82. Sebagai bentuk kasih sayang Allah kepada manusia adalah diberikannya kitab dan shuhuf kepada rasul, 
yang tidak termasuk kitab yang wajib diimani dalam hal ini adalah ....
""", 0),
            Pair("""83. Setiap umat manusia ada masa diutusnya rasul beserta dengan kitab yang dibawanya. Setelah seorang rasul wafat, 
perkembangan zamannya sudah berbeda sehingga Allah mengutus rasul dan memberikan kitab lagi. Berikut ini masa diturunkannya kitab Taurat adalah ....
""", 0),
            Pair("""84.     نوﺪﺘﳞ ﻢﻬﻠﻌﻟ بﺎﺘﻜﻟا ﻰﺳﻮﻣ ﺎﻨﻴﺗآ ﺪﻘﻟو
Arti dari QS. Al Mukminun ayat 49 di atas adalah....
""", 0)),

        listOf(Pair("""85.     ضرﻷاو تاوﲈﺴﻟا ﰲ ﻦﻤﺑ ﻢﻠﻋأ ﻚﺑرو ﺾﻌﺑ ﲆﻋ ﲔﻴﺒﻨﻟا ﺾﻌﺑ ﺎﻨﻠﻀﻓ ﺪﻘﻟو ارﻮﺑز دواد ﺎﻨﻴﺗآو
Isi kandungan QS. Al Isra ayat 55 adalah ....
""", 0),
            Pair("""86. Selain kitab, Allah SWT juga memberikan shuhuf kepada beberapa nabi. Pernyataan tentang shuhuf yang benar adalah ....""", 0),
            Pair("""87. Setiap kitab memiliki ajaran pokok termasuk Kitab Injil. Secara garis besar Kitab Injil memuat beberapa ajaran pokok sebagai berikut, kecuali....""", 0)),

        listOf(Pair("""88. Untuk mempermudah dalam mempelajarinya, Al Qur'an dibagi dalam juz dan surat. Pernyataan yang benar dari pembagian Al Qur'an adalah .... """, 0),
            Pair("""89. Dengan mempelajari Al Qur'an maka akan dapat mengetahui isi pokoknya.Perhatikanlah pernyataan di bawah ini
1)  Tauhid dan akidah Islam
2)  Ibadah dan cara mengabdi kepada Allah SWT
3)  Janji dan ancaman
4)  Mensucikan hari Sabtu
Ditunjukkan nomor berapakah yang bukan termasuk isi pokok Al Qur'an? 
""", 0),
            Pair("""90 . Kitab Al Qur'an (turun abad ke-7 M) adalah kitab suci um at Islam , diturunkan kepada Nabi Muhammad SAW untuk dijadikan petunjuk dan pedoman bagi seluruh umat manusia. Bahasa yang digunakan dalam Al Qur'an adalah ....
""", 0)),

        listOf(Pair("""91 . Al Qur'an dapat dibaca dan dihafal dari segala kalangan. Dari dulu sampai sekarang Al Qur'an tidak berubah. Hal ini menunjukkan ....
""", 0),
            Pair("""92 . Beriman kepada kitab-kitab Allah membawa pengaruh positif dalam kehidupan manusia. Adapun fungsinya adalah sebagai berikut, kecuali....
""", 0),
            Pair("""93 . Perhatikan pernyataan berikut!
1)  Toleran dan menghargai pemeluk agama selain Islam
2)  Mencintai Al Qur'an
3)  Rajin beribadah
4)  Rajin beramal shaleh
5)  Menjauhi maksiat
Pernyataan yang benar tentang sikap mulia orang yang iman kepada kitab Allah adalah ....
""", 0)),

        listOf(Pair("""94 . Dalam membaca Al Qur'an harus menguasai tajwid atau cara membaca yang benar. Bacaan lafaz dalam Al Qur'an yang memantul disebut .... 
""", 0),
            Pair("""95 .   ﺎﺤﺒﺿ تﺎﻳدﺎﻌﻟاو  pada QS.Al Adiyat ayat 1 terdapat bacaan qalqalah ....
""", 0),
            Pair("""96 . Suatu lafaz digolongkan qalqalah kubra apabila....
""", 0)),

        listOf(Pair("""97 . Pada ayat di bawah ini yang terdapat qalqalah kubra adalah ....
""", 0),
            Pair("""98 . Arti dari ﺮﻤﳋا adalah ....
""", 0),
            Pair("""99 . Berikut ini adalah potongan ayat yang artinya permusuhan adalah ....
""", 0)),

        listOf(Pair("""100. Isi kandungan QS. Al Maidah ayat 90 - 91 adalah larangan ....""", 0),
            Pair("""101. Sering kali kita mendengar istilah khamr. Yang dimaksud dengan khamr adalah ....""", 0),
            Pair("""102. Berjudi itu dilarang karena memang merugikan.Akibat buruk dari judi adalah ....""", 0)),

        listOf(Pair("""103. Di kampung sering dijumpai permainan yang dikategorikan berjudi, yaitu ....""", 0),
            Pair("""104. Meminum khamr adalah haram dan termasuk perbuatan keji. Sikap yang termasuk usaha untuk menghindari minuman keras adalah ....""", 0),
            Pair("""105. Hubungan manusia sering terjadi perselisihan yang memuncak pada pertengkaran. Cara menghindari pertengkaran adalah ....""", 0)),

        listOf(Pair("""106. Minuman keras akan membawa dampak negatif bagi yang meminumnya dan masyarakat sekitar, kecuali ....""", 0),
            Pair("""107. Sebagai muslim yang baik, selain melakukan shalat wajib Soni juga melaksanakan shalat tambahan untuk menutupi kekurangan shalat wajibnya.
Shalat tambahan ini disebut juga dengan istilah ....
""", 0),
            Pair("""108.    ﺲﻠﳚ ﻼﻓ ، ﺪﺠﺴﳌا ﻢﻛﺪﺣأ ﻞﺧد اذإ ﲔﺘﻌﻛر ﲇﺼﻳ ﻰﺘﺣ
Hadis tersebut adalah dalil naqli tentang shalat sunah ....
""", 0)),

        listOf(Pair("""109.   ﻰﺴﻋ ﻚﻟ ﺔﻠﻓﺎﻧ ﻪﺑ ﺪﺠﻬﺘﻓ ﻞﻴﻠﻟا ﻦﻣو ادﻮﻤﳏ ﺎﻣﺎﻘﻣ ﻚﺑر ﻚﺜﻌﺒﻳ ن
Dari ayat tersebut dapat diketahui hikmah melaksanakan shalat tahajud adalah .... 
""", 0),
            Pair("""110. Berikut ini adalah kelom pok shalat sunah berjamaah yang benar, yaitu ....""", 0),
            Pair("""111. Dilaksanakan berjamaah, takbir tujuh kali pada rakaat pertama dan lima kali 
pada rakaat kedua adalah cara melaksanakan shalat .... 
""", 0)),

        listOf(Pair("""112. Perhatikan pasangan berikut
1) Tahajud sepertiga malam terakhir
2) Dhuha pagi
3) Idul Adha jam satu siang
4) Tahiyatul  m asji d keti ka m asuk m asjid sebelum duduk
Pasangan yang tepat untuk pernyataan di atas adalah...
""", 0),
            Pair("""113. Doa yang dibaca setelah shalat istikharah adalah....""", 0),
            Pair("""114. سوﺪﻘﻟا ﻚﻠﻤـﻟا نﺎﺤﺒﺳ adalah doa yang dibaca setelah melaksanakan shalat ....""", 0)),

        listOf(Pair("""115. Di akhir shalat yang dikerjakan Azis berjumlah tiga rakaat. Shalat sunah yang dikerjakan Azis adalah ....""", 0),
            Pair("""116. Diantara persamaan shalat Id dan shalat Jumat adalah sebagai berikut, kecuali ...""", 0),
            Pair("""117. Perbedaan shalat Idul Fitri dengan Idul Adha adalah ....""", 0)),

        listOf(Pair("""118. Berikut ini yang bukan shalat sunah disertai khutbah adalah ....""", 0),
            Pair("""119. Muzamil istirahat tiap selesai mengerjakan shalat sunah  em pat  r akaat .  S hal at  sunah y ang dikerjakan Muzamil adalah ....""", 0),
            Pair("""120. Berikut ini adalah shalat sunah yang dikerjakan berkaitan dengan alam, kecuali ....""", 0))
    )

    private  val pilihanGanda6: List<List<List<String>>> = listOf(
            listOf(
                listOf("a. dijadikan petunjuk hidup manusia","b. dibaca oleh ummat manusia","c. dimiliki oleh ummat manusia","d. diambil sebagian sebagai contoh"),
                listOf("a. perintah meng-Esa-kan","b. melaksanakan shalat lima waktu","c. melaksanakan ibadah haji","d. perintah bersatuan"),
                listOf("a. 1, 2, 3, dan 4","b. 2, 3, 4, dan 5","c. 1, 2, 5, dan 6","d. 1, 2, 4, dan 6")
            ),
            listOf(
                listOf("a. Seneng membaca kitab","b. Mendorong ke arah kebaikan","c. Cenderung kepada kebahagiaan","d. Rajin belajar"),
                listOf("a. fungsi shalat lima waktu","b. fungsi beriman kepada kitab","c. hikmah melakukan puasa ramadlan","d. hikmah beriman kepada hari akhir"),
                listOf("a. beriman kepada para rasul","b. beriman kepada hari akhir","c. beriman kitab","d. beriman kepada para malaikat")
            ),
            listOf(
                listOf("a. 1, 2, 3, dan 4","b. 1, 2, 4, dan 5","c. 2, 3, 4, dan 5","d. 1, 2, 3, dan 5"),
                listOf("a. mengembangkan harta yang dimilikinya ","b. mengendalikan manusia berbuat jahat ","c. membuat manusia lupa untuk mengingat Allah","d. menjadikan manusia lupa makan dan tidur"),
                listOf("a. mendekatkan diri kepada Allah, Swt.","b. membatasi diri dalam bermasyarakat","c. menghindari pergaulan ","d. memperluas pergaulan")
            ),
            listOf(
                listOf("a. 1, 2, 3 dan 4 ","b. 1, 2, 4 dan 5 ","c. 2, 3, 4 dan 5","d. 1, 3, 4 dan 5"),
                listOf("a. berat badan menurun ","b. tidak mudah terjangkit penyakit ","c. daya berfikir menurun","d. tekanan darah normal"),
                listOf("a. menghindari kekacauan ","b. lebih dekat kepada rakyat ","c. Allah Swt senang kepada keadilan","d. lebih dekat kepada taqwa")
            ),
            listOf(
                listOf("a. ria ","b. adil ","c. pamer ","d. jujur"),
                listOf("a. menjunjung tinggi keadilan ","b. keras dalam segala hal ","c. memihak kepada kaum minoritas","d. membela kebenaran"),
                listOf("a. guru membutuhkan analisis hasil pembelajaran yang valid dan obyektif","b. nilai ulangan harian peserta didik akan dilaporkan kepada kepala sekolah","c. guru tidak suka kepada siswa yang berlaku curang","d. nilai ulangan siswa dijadikan acuan bagi kebijakan pemerintah")
            ),
            listOf(
                listOf("a. bertutur kata yang benar kepada bapak ibu guru","b. melaksanakan piket kelas sesuai jadwal","c. disiplin dalam mentaati tata tertib sekolah","d. mengembalikan barang milik teman karena akan diberi imbalan"),
                listOf("a. 1, 2, 3, dan 4 ","b. 1, 2, 3, dan 5 ","c. 1, 3, 4, dan 5","d. 1, 2, 4, dan 5"),
                listOf("a. sunah berjamaah","b. munfarid","c. berkelompok","d. sunah bersama")
            ),
            listOf(
                listOf("a. Istikharah","b. Hajat ","c. Tahajud","d. Tasbih"),
                listOf("a. 1, 2, 3, dan 4","b. 2, 3, 4, dan 5 ","c. 1, 3, 4, dan 5","d. 2, 3, 4, dan 6"),
                listOf("a. 1, 2, 3, dan 4","b. 1, 2, 4, dan 5 ","c. 2, 3, 4, dan 5","d. 1, 3, 4, dan 5")
            ),
            listOf(
                listOf("a. menambah kesempurnaan shalat fardlu","b. dijamin masuk syurga","c. meningkatkan derajat keridlaan Allah","d. mendatangkan keberkahan dari Allah"),
                listOf("a. berdiri menghadap kiblat, niat, takbiratul ihram, membaca fatihah-rukuk, i’tidal, sujud dua kali, berdiri lagi untuk rakaat ke dua sampai selesai, duduk takhiyat akhir, salam. khutbah","b. berdiri menghadap kiblat, takbiratul ihram, niat, membaca fatihah, rukuk, i’tidal, sujud dua kali, berdiri lagi untuk rakaat ke dua sampai selesai, duduk takhiyat akhir, salam. khutbah","c. niat, membaca fatihah, rukuk, i’tidal, sujud dua kali, berdiri lagi untuk rakaat ke dua sampai selesai, duduk tahiyat akhir, salam","d. berdiri menghadap kiblat, niat, takbiratul ihram, membaca fatihah, rukuk, i’tidal, membaca fatikhah rukuk, i’tidal, sujud dua kali, berdiri lagi untuk rakaat ke dua sampai selesai, duduk membaca takhiyat akhir, salam.Khutbah"),
                listOf("a. 2, 3, dan 4","b. 3, 4, dan 5 ","c. 1, 2, dan 3","d. 1, 3, dan 4")
            ),
            listOf(
                listOf("a. membaca ayat-ayat sajdah","b. lupa jumlah rakaat ketika shalat","c. lupa membaca tahiyat awal","d. terhindar dari musibah"),
                listOf("a. sesudah membaca takhiyat akhir dan","b. sesudah membaca takhiyat akhir","c. sesudah membaca takhiyat akhir dan sebelum salam","d. sebelum membaca tahiyat akhir dan sebelum salam"),
                listOf("a. syukur","b. tilawah ","c. sahwi","d. Sujud Shalat")
            ),
            listOf(
                listOf("a. sahwi","b. tilawah ","c. sujud dalam shalat","d. sujud rukun"),
                listOf("a. 1, 2, 3, dan 4","b. 1, 3, 4, dan 5 ","c. 2, 3, 4, dan 5","d. 1, 2, 4 dan 5"),
                listOf("a. 1, 2, dan 6 ","b. 1, 2, dan 3 ","c. 2, 3, dan 4 ","d. 1, 4, dan 6")
            ),
            listOf(
                listOf("a. 1 kali ","b. 2 kali ","c. 3 kali ","d. 4 kali"),
                listOf("a. duduk di antara dua sujud ","b. duduk takhiyat akhir ","c. duduk sebentar kemudian salam","d. berdiri kembali untuk melanjutkan shalat"),
                listOf("a. adanya perebutan kekuasaan ","b. berdirinya masjid-masjid yang megah ","c. perpustakaan dengan koleksi 400.000 judul buku","d. adanya universitas Cordova")
            ),
            listOf(
                listOf("a. Mekkah ","b. Demaskus","c. Baghdad ","d. Yunani"),
                listOf("a. 1, 2, dan 3 ","b. 1, 2, dan 4 ","c. 2, 3, dan 4 ","d. 3, 4, dan 5"),
                listOf("a. Yazid bin Muawiyah ","b. Umar bin Abdul Aziz ","c. Abdul Malik bin Marwan","d. Muawiyah bin Abu Sufyan")
            ),
            listOf(
                listOf("a. menumbuhkan semangat menuntut ilmu","b. mengembangkan nilai-nilai kebudayaan Islam","c. mengembangkan budaya-budaya barat","d. membina rasa persatuan dan kesatuan umat Islam"),
                listOf("a. Jujur ","b. Hemat ","c. Rendah hati ","d. Hidup sederhana"),
                listOf("a. Jujur ","b. Hemat ","c. Rendah hati ","d. Hidup Sederhana")
            ),
            listOf(
                listOf("a. semua keinginan dapat terpenuhi","b. dapat menabung untuk kebutuhan yang akan datang","c. menjadi salah satu cara agar cepat kaya","d. bisa peduli pada sesama di sekitar kita"),
                listOf("a. رَزَقَكُمُ","b. نِعْمَتَ    ","c. حَرَّمَ","d.  مَعَ"),
                listOf("a. Manusia harus selalu beribadah kepada Allah jika ingin kaya","b. Berserah diri kepada Allah setelah berusaha dan berdo’a","c. Mensyukuri nikmat Allah yang telah diberikan kepada kita","d. Memakan makanan yang halal dan baik supaya sehat")
            ),
            listOf(
                listOf("a.  انَّ اللهَ   ","b.  بِاَيَتِ اللهِ ","c.  جَعَلْتُمُ اللهَ","d.  طَبَعَ اللهُ"),
                listOf("a. اَشْرَ كُوْا ","b. قَدِيْرٌ    ","c. يَعْرِفُوْنَ","d. وَاَثْعَارِهَآ    "),
                listOf("a. 1, 5","b. 2, 4 ","c. 3, 6","d. 1, 4")
            ),
            listOf(
                listOf("a. Lafad Allah didahului harakat dhamma                         ","b. Lafad Allah didahului harakat Dhammatain                 ","c. Lafad Allah didahului harakat fathah ","d. Lafad Allah didahului harakat Fathatain"),
                listOf("a. Ra berharokat dhommah                                ","b. Ra sukun didahului huruf berharakat fathah        ","c. Ra sukun didahului huruf berharokat dhomma ","d. Ra berharokat yang didahului oleh ya sukun"),
                listOf("a. Iman Kepada Allah                                ","b. Iman kepada Malikat","c. Iman kepada kitab","d. Iman kepada rasul ")
            ),
            listOf(
                listOf("a.","b.","c.","d."),
                listOf("a. 1 dan 2                                              ","b. 1 dan 3","c. 2 dan 3 ","d. 2 dan 4"),
                listOf("a. Sifat yang harus ada pada para nabi dan rasul","b. Sifat yang harus diketahui oleh para nabi dan rasul","c. Sifat dan perilaku sebagaimana kebiasaan manusia","d. Sifat dan adat istiadat manusia sesuai dengan tabiatnya")
            ),
            listOf(
                listOf("a. Sidik dan Amanah                                ","b. Amanah dan  Tabligh","c. Fatonah dan Sidik","d. Tablig dan Kitman"),
                listOf("a. Karomah                                            ","b. Ma’unah ","c. Ulul Albab   ","d. Ulul Azmi"),
                listOf("a. Yusuf a.s                                            ","b. Syu’aeb a.s  ","c. Dawud a.s   ","d. Sulaiman a.s")
            ),
            listOf(
                listOf("a. Meningkatkan keimanan kepada para sahabat","b. Meneladani sifat para Nabi seperti,  Jujur dan Adil","c. Meningkatkan taraf kehidupan yang bermartabat","d. Meneladani sifat mustahil bagi rasul"),
                listOf("a. Siap berangkat untuk membeli beras dengan syarat harus dapat upah","b. Menjawab dengan jawaban “nanti beli berasnya setelah selesai belajar”","c. Menolak secara halus karena sedang fokus belajar untuk persiapan PAT","d. Berhenti belajar sebentar untuk membantu orang tuanya  membeli beras  "),
                listOf("a. Berbuat baik terhadap Orang Tua                ","b. Berbuat baik terhadap Guru                ","c. Berbuat baik terhadap tetangga ","d. Berbuat baik terhadap Teman")
            ),
            listOf(
                listOf("a. Kalau ingin mendapatkan rido orang tua, harus taat kepada Allah","b. Kalau ingin mendapat murka Allah, sayangi orang tua","c. Kalau ingin mendapat ridha Allah, hormati orang tua","d. Kalau ingin masuk surga, ciumlah kaki ibu"),
                listOf("a. Birrul walidaini                              ","b. Uququl walidaini                 ","c. Suul walidaini","d. Husnul walidaini"),
                listOf("a. Meminta agar keduanya memberi hadiah","b. Selalu meminta pendapatnya","c. Menceritakan keburukanya","d. Mendengarkan nasehatnya")
            ),
            listOf(
                listOf("a. Mendidik dan mengajari                        ","b. Membina dan merawat                        ","c. Merawat sehingga mandiri ","d. Memberi makan untuk pertumbuhan"),
                listOf("a. Tidak perlu menghormatinya                        ","b. Memutuskan hubungan kekeluargaan        ","c. Tetap berbuat baik kepadanya        ","d. Tidak perlu mengikuti nasihat apapun darinya"),
                listOf("a. Selalu mendoakan orang tua agar terhindar dari siksa api neraka","b. Tabur bunga dimakamnya setiap hari","c. Membangunkan makam yang bagus untuknya","d. Mengirim makanan kesukaan orang tua ke makamnya")
            ),
            listOf(
                listOf("a. Beriman kepada Allah Swt. di kala susah        ","b. Saling menasihati untuk keadilan                ","c. Saling menasihati dalam kegigihan ","d. Beramal sholeh atau amal kebajikan"),
                listOf("a. 1, 2, 3                                       ","b. 2, 3, 4                                        ","c. 1, 2, 5","d. 3, 4, 5 "),
                listOf("a. Allah SWT.                                        ","b. Manusia","c. Lingkungan                                 ","d. Tempat tinggal")
            ),
            listOf(
                listOf("a. Dhanusuu’                                       ","b. Husnudhan      ","c. Ghalabatu Dhan","d. Ba’du dhan "),
                listOf("a. Diwajibkan Allah untuk setiap manusia                ","b. Wajib dikerjakan oleh setiap mukalaf                 ","c. Diwajibkan kepada orang yang dewasa ","d. Diwajibkan bagi setiap orang yang beriman"),
                listOf("a. Nazar                                               ","b. Kifarat       ","c. Syawal ","d. Arafah")
            ),
            listOf(
                listOf("a. 1, 2 dan 3                                          ","b. 2, 4 dan 6            ","c. 1, 3 dan 5    ","d. 2, 4 dan 5"),
                listOf("a. Arafah                                        ","b. Syawal          ","c. Senin Kamis","d. Ayyamul Bidh"),
                listOf("a. 1, 3, 6, 8                                    ","b. 2, 3, 5, 9       ","c. 3, 5, 7, 10","d. 1, 4, 8, 9,")
            ),
            listOf(
                listOf("a. Bangkai, Darah, Kuda, Binatang darat","b. Binatang yang tercekik, Binatang yang hidup di dua alam","c. Bangkai, Darah, Daging Babi, Binatang yang disembelih tidak menyebut nama Allah","d. Bangkai, Binatang yang tercekik, yang terjatuh, Darah"),
                listOf("a. Haramnya makanan                       ","b. Haramnya minuman ","c. Haramnya mabuk","d. Haramnya Mencuri"),
                listOf("a. Tubuh semakin kuat                                  ","b. Daya ingat terganggu   ","c. Menghangatkan tubuh      ","d. Emosi menjadi stabil")
            ),
            listOf(
                listOf("a. Perut menjadi lebih kenyang                ","b. Tubuh menjadi lemah                        ","c. Terjaga kesehatan jasmani dan rohani ","d. Doanya tidak di kabulkan Allah SWT."),
                listOf("a. Harun Ar-Rasyid                               ","b. Al Ma’mun   ","c. Abdullah Al-Saffah","d. Al-Mansyur"),
                listOf("a. 750 M  -  754 M                                        ","b. 754 M  -  775 M    ","c. 775 M  -  785 M","d. 786 M  -  809 M")
            ),
            listOf(
                listOf("a. Baitul Hikmah                                        ","b. Kuttab                    ","c. Halaqah","d. Damaskus"),
                listOf("a. Al Farabi                                                ","b. Jabir bin Hayyan                   ","c. Al Khawarizmi","d. Ibnu Jarirat Abary"),
                listOf("a. Meyakini dengan sepenuh hati bahwa Allah telah m engutus para r asul- Ny a unt uk menyampaikan wahyu kepada umat-Nya.","b. Meyakini dengan sepenuh hati bahwa Allah telah menciptakan malaikat dengan semua tugas-tugasnya.","c. Meyakini dengan sepenuh hati bahwa kitab- kitab Allah adalah benar-benar wahyu yang diturunkanNya kepada rasul, tidak diragukan isinya sebagai pedoman hidup bagi umat manusia agar selamat dunia sampai akhirat","d. Meyakini dengan sepenuh hati bahwa hari akhir pasti terjadi.")
            ),
            listOf(
                listOf("a. Taurat","b. Zabur","c. Al Qur'an","d. Arjunawiwaha"),
                listOf("a. Abad ke-12 SM ","b. Abad ke-10 SM ","c. Abad ke-1 M","d. Abad ke-7 M"),
                listOf("a. Dan sesungguhnya telah Kami berikan Al Kitab (Taurat) kepada Musa agar mereka (Bani Israil) mendapat petunjuk","b. Dan sesungguhnya telah Kami berikan Zabur kepada Musa agar mereka (Bani Israil) mendapat petunjuk","c. Dan sesungguhnya telah Kami berikan Al Kitab (Injil) kepada Musa agar mereka (Bani Israil) mendapat petunjuk","d. Dan sesungguhnya telah Kami berikan Al Kitab (Al Qur'an) kepada Musa agar mereka (Bani Israil) mendapat petunjuk")
            ),
            listOf(
                listOf("a. Allah SWT memberi kitab Taurat kepada Nabi Musa","b. Allah SWT memberi kitab Zabur kepada Nabi Daud","c. Allah SWT memberi kitab Injil kepada Nabi Isa","d. Allah SWT memberi kitab Al Qur'an kepada Nabi Muhammad"),
                listOf("a. Nabi Idris As menerima 10 shuhuf","b. Nabi Syits As menerima 10 shuhuf","c. Nabi Ibrahim As menerima 10 shuhuf","d. Nabi Musa As menerima 30 shuhuf"),
                listOf("a. Perintah agar kembali kepada ajaran tauhid yang murni","b. Ajaran yang menyempurnakan kitab Taurat","c. Perintah mensucikan hari Sabtu","d. Ajaran agar hidup sederhana dan menjauhi sifat tamak")
            ),
            listOf(
                listOf("a. 30 juz dan 141 surat","b. 30 juz dan 114 surat","c. 141 juz dan 30 surat","d. 114 juz dan 30 surat"),
                listOf("a. 4","b. 3","c. 2","d. 1"),
                listOf("a. Ibrani ","b. Arab ","c. Qibti","d. Suryani")
            ),
            listOf(
                listOf("a. Al Qur'an adalah kitab hafalan","b. Al Qur'an tidak mengikuti perkembangan zaman","c. Al Qur'an hanya untuk orang Arab saja","d. Al Qur'an dijaga kemurniannya olehAllah SWT"),
                listOf("a. Manusia semakin terbebani hidupnya","b. Manusia  bisa  menghadapi  berbagai persoalan yang dihadapinya","c. Manusia mendapat penjelasan tentang janji dan ancaman Allah","d. Manusia semakin meyakini kerasulan utusan Allah"),
                listOf("a. 1","b. 2","c. 3","d. 1, 2, 3, 4, 5")
            ),
            listOf(
                listOf("a. Idghom bighunnah","b. Ikhfa","c. Iqlab","d. Qalqalah                                "),
                listOf("a. Qalqalah kubra ","b. Qalqalah sugra ","c. Ikhfa","d. Izhar"),
                listOf("a. Bertemu nun sukun atau mati","b. Bertemu huruf ba","c. Huruf qalqalah berharakat hidup tetapi diwaqafkan(berhenti)","d. Diikuti hamzah atau alif")
            ),
            listOf(
                listOf("a.  ﺎﺤﺒﺿ تﺎﻳدﺎﻌﻟاو","b.  ﺎﺣﺪﻗ تﺎﻳرﻮﻤـﻟﺎﻓ","c.  ﺎﺤﺒﺻ تاﲑﻐﻤـﻟﺎﻓ","d.   دﻮﻨﻜﻟ ﻪﺑﺮﻟ نﺎﺴﻧﻹا نإ"),
                listOf("a. Judi","b. Khamr","c. Berkorban untuk berhala","d. Mengundi nasib"),
                listOf("a.  ﺮﻤﳋا","b. ﴪﻴﻤـﻟا","c.   ةواﺪﻌﻟا","d.  ﻢـﻟزﻷا")
            ),
            listOf(
                listOf("a. Minum khamr","b. Berjudi","c. Mengundi nasib","d. Semua benar"),
                listOf("a. Es batu","b. Segala bentuk minuman yang memabukkan","c. Jus dan salat buah","d. Yoghurt"),
                listOf("a. Merusak keuangan sehingga kebutuhan keluarga tidak tercukupi","b. Merusak kesehatan","c. Merugikan orang","d. Merupakan tingkah laku hewan")
            ),
            listOf(
                listOf("a. Layang-layang","b. Gobak sodor","c. Balapan motor liar","d. Egrang"),
                listOf("a. Mencicipi sedikit karena segan kepada teman","b. Minum yang banyak biar disebut gagah","c. Menjaga jarak pertemanan dengan peminum minuman keras agar tidak dibujuk untuk minum","d. Mau minum karena dibujuk teman"),
                listOf("a. Membela teman yang berselisih karena solidaritas","b. Melaporkan teman yang memulai perselisihan","c. Membumbui teman yang berselisih","d. Mengutamakan  bermusyawarah dan meredakan emosi")
            ),
            listOf(
                listOf("a. Haram hukumnya","b. Menjauhkan dari mengingat Allah","c. Menghancurkan m asa depan generasi mendatang","d. Akan disebut sebagai orang yang gagah"),
                listOf("a. Shalat wajib plus","b. Shalat extra","c. Shalat tatawu'/nawafil","d. Shalat riya"),
                listOf("a. Tahiyatul Masjid","b. Tarawih","c. Witir","d. Istisqa")
            ),
            listOf(
                listOf("a. Ditunjukkan pilihan yang tepat","b. Diberi rizki yang banyak","c. Diberi hujan deras","d. Diberi kedudukan dan tempat terpuji"),
                listOf("a. Idul Fitri, Tarawih, Dhuha","b. Idul Adha, Tahajud,Tarawih","c. Idul Fitri, Idul Adha, Kusuf/Gerhana Matahari","d. Idul Fitri, Idul Adha, Shalat Jum'at"),
                listOf("a. Idul Fitri/Idul Adha","b. Istisqa ","c. Khusuf ","d. Kusuf")
            ),
            listOf(
                listOf("a. 1 - 2 - 3","b. 1 - 3 - 4","c. 1 - 2 - 4","d. 2 - 3 - 4"),
                listOf("a.  ﻚﻤﻠﻌﺑ كﺮﺧﺄﺘﺳا ﲏا ﻢﻬﻠﻟا","b.  سوﺪﻘﻟا ﻚﻠﻤـﻟا نﺎﺤﺒﺳ ","c.  كءﺎﺤﺿ ءﺎﺤﺿ نا ﻢﻬﻠﻟا","d.  قﺪﺻ ﻞﺧﺪﻣ ﻲﻨﻠﺧدأ بر"),
                listOf("a. tarawih","b. witir","c. istikharah","d. dhuha")
            ),
            listOf(
                listOf("a. Maghrib","b. Witir","c. Tarawih","d. Tahiatul Masjid"),
                listOf("a. Ada khutbahnya","b. Dilaksanakan secara berjamaah","c. khutbahnya ada dua","d. Dilaksanakan setelah matahari tergelincir"),
                listOf("a. Waktunya pagi hari","b. Tempatnya di lapangan","c. Diikuti dua khutbah","d. Dilaksanakan tanggal 10 Dzulhijjah")
            ),
            listOf(
                listOf("a. Shalat Jumat","b. Shalat Id","c. Shalat Istisqa","d. Shalat Kusuf"),
                listOf("a. Isya","b. Dzuhur ","c. Tarawih ","d. Asar"),
                listOf("a. Istisqa ","b. Kusuf ","c. Khusuf","d. Istikharah")
            )
        )



    private val kunciJawaban6: List<List<Int>> = listOf(
            listOf(0,0,2),
            listOf(1,1,2),
            listOf(3,2,0),
            listOf(1,2,3),
            listOf(3,0,0),
            listOf(3,0,0),
            listOf(2,1,1),
            listOf(1,3,0),
            listOf(3,2,2),
            listOf(1,3,3),
            listOf(1,3,0),
            listOf(1,0,3),
            listOf(2,2,2),
            listOf(1,0,2),
            listOf(1,0,0),
            listOf(2,3,3),
            listOf(0,1,0),
            listOf(3,3,2),
            listOf(1,3,0),
            listOf(2,1,3),
            listOf(3,2,0),
            listOf(3,2,2),
            listOf(1,3,0),
            listOf(2,1,3),
            listOf(2,1,1),
            listOf(2,2,3),
            listOf(0,1,2),
            listOf(3,0,0),
            listOf(1,2,2),
            listOf(1,0,1),
            listOf(3,0,3),
            listOf(3,1,2),
            listOf(3,1,2),
            listOf(3,1,0),
            listOf(2,2,3),
            listOf(3,2,0),
            listOf(3,2,0),
            listOf(2,0,1),
            listOf(1,3,3),
            listOf(0,2,3)






        )
    private lateinit var scoreManagerPai: ScoreManagerPai


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_pai_kelas8, container, false)
        scoreManagerPai = ScoreManagerPai(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerPai.scorePaiKelas8 < 1) 0 else scoreManagerPai.scorePaiKelas8 / 5
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
            val getData = soalPaisd8[jawabanBenar6][i]
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

                        var scoreMatSd = scoreManagerPai.scorePaiKelas8
                        if (pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3) {
                            jawabanBenar6++

                            if (jawabanBenar6 == soalPaisd8.size) {
                                scoreMatSd += 5
                                scoreManagerPai.scorePaiKelas8 = scoreMatSd
                                Toast.makeText(
                                    activity,
                                    "Selamat anda telah menyelesaikan misi",
                                    Toast.LENGTH_SHORT
                                ).show()
                                done = true
                            } else {
                                scoreMatSd += 5
                                scoreManagerPai.scorePaiKelas8 = scoreMatSd
                                Toast.makeText(
                                    activity,
                                    R.string.segments_sukses,
                                    Toast.LENGTH_SHORT
                                ).show()
                                // refresh ui
                                for (i in 0 until (listRadiogrup.size)) {
                                    val getData = soalPaisd8[jawabanBenar6][i]
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