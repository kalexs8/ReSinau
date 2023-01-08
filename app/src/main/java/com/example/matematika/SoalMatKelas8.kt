package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManager
import com.example.myapplication.R


class SoalMatKelas8 : Fragment() {

    private var jawabanBenar8 = 0
    private val soalMatsd8: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Bentuk sederhana dari 2(4x – 2y) – 5(2x + y) adalah...""", 0),
            Pair("""2. Bila bentuk -3x+5 dikurangkan dari 3(2x-1) maka hasilnya...""", 0),
            Pair("""3. Hasil dari 3 + 2 2 − 5 adalah ... .
""", 0)),

        listOf(Pair("""4. Sebuah persegi dengan panjang sisi 15 cm diperbesar sehingga panjang sisi bertambah a cm.
pertambahan luas persegi tersebut adalah ... .
""", 0),
            Pair("""5. 4x² + 9x-9 adalah...""", 0),
            Pair("""6. Jika diketahui A= 1/2x²-2y² , x + 2y = 16 dan x - 2y = 8 maka nilai a adalah ....""", 0)),

        listOf(Pair("""7. Bentuk sederhana dari 2x²+x-6/4x²-9 adalah .. .
""", 0),
            Pair("""8. Perhatikan diagram panah berikut
 relasi dari A ke B adalah ... .
""", 0),
            Pair("""9. Diketahui P = {1, 2, 3} dan Q = {a, b} suatu relasi dari P ke Q menyatakan setiap anggota P berpasangan dengan anggota Q
 Himpunan pasangan berurutanyang menyatakan hal tersebut adalah ... .
""", 0)),

        listOf(Pair("""10. P={1,2,3,4,5,6} dan n elemen p.suatu pemetaan f dari p ke p ditentukan dengan aturan n→1,jika n bilangan ganjil dan n→1/2 n,n bilangan genap
 Nyatakan pemetaan f sebagai pasangan berurutan!
""", 0),
            Pair("""11. Bayangan dari -3 oleh fungsi f(x) = -7x + 7 adalah ... .
""", 0),
            Pair("""12. Diketahui Fungsi h(x) = 5x = 5x-4 Bayangan x = p oleh fungsi tersebut adalah -7,nilai p adalah...""", 0)),

        listOf(Pair("""13. Disajikan data fungsi sebagai berikut
rumus dari fungsi tersebut adalah ... .
""", 0),
            Pair("""14. Persamaan yang ekuivalen dengan persamaan 2x + 3y -6 = 0 adalah....""", 0),
            Pair("""15. Gradien garis yang melalui titik A(-2, -1) dan B(1,3) adalah ... .
""", 0)),

        listOf(Pair("""16. Grafik garis dengan persamaan 4   − 6   = 12 adalah ... .
""", 0),
            Pair("""17. Persamaan garis yang melalui titik A(4, -1) dan bergradien ½ adalah ... .
""", 0),
            Pair("""18. Diantara garis berikut sejajar dengan garis dengan persamaan 6x – 12y + 13 = 0, kecuali ... .
""", 0)),

        listOf(Pair("""19. Persamaan garis yang melalui titik P(4, -5) dan Q(2, 1) adalah ... .
""", 0),
            Pair("""20. Garis k melalui titik (-3, 1) dan tegak lurus pada garis x – 2y + 1 = 0. Persamaan garis k adalah ... .
""", 0),
            Pair("""21. Denis bersepeda dari rumahnya ke rumah Ali. Jalan yang biasa ia tempuh ditutup karena ada hajatan. Denis melintasi jalan lain. Dari rumahnya, 
Denis mengambil lintasan ke arah utara sejauh 100 meter, lalu kearah barat sejauh 120 meter , selanjutnya ke arah selatan sejauh 260 meter
Jarak antara rumah Denis dan Ali adalah ….
""", 0)),

        listOf(Pair("""22. Jarum panjang sebuah jam dinding bergerak dari pukul 10.20 sampai pukul 10.45. Lintasan ujung jarum panjang berbentuk ….
""", 0),
            Pair("""23. Diketahui panjang jari-jari lingkaran yang berpusat di O = 21 cm dan besar sudut pusat POQ = 60o. Luas juring POQ adalah ….
""", 0),
            Pair("""24. Perhatikan gambar berikut:
Jika pada gambar di bawah panjang busur PQ =34 cm dan ∠POQ = 60o. Maka keliling lingkarannya adalah ….
""", 0)),

        listOf(Pair("""25. Keliling lingkaran yang berjari-jari 35 cm adalah ….
""", 0),
            Pair("""26. Luas sebuah lingkaran 616 cm². Keliling lingkaran tersebut adalah ….
""", 0),
            Pair("""27. Sebuah roda berputar sebanyak 2.000 kali dan dapat menempuh jarak 5.024 m. luas penampang roda tersebut dengan        π = 3,14 adalah ….
""", 0)),

        listOf(Pair("""28. Dua buah lingkaran masing-masing berjari-jari 5 cm dan 3 cm. Jarak kedua pusatnya 10 cm
panjang garis singgung persekutuan dalam kedua lingkaran tersebut adalah ….
""", 0),
            Pair("""29. Jarak pusat dua buah lingkaran adalah 13 cm. Panjang salah satu jari-jarinya adalah 2 cm, dan panjang garis singgung persekutuan luarnya 12 cm. Panjang jari-jari lingkaran lainnya adalah ….
""", 0),
            Pair("""30. Gambar di bawah ini merupakan jaring-jaring
""", 0)),

        listOf(Pair("""31. Perhatikan gambar berikut.Volume prisma segita tersebut adalah ...""", 0),
            Pair("""32. Banyak diagonal ruang pada kubus adalah ….
""", 0),
            Pair("""33. Luas permukaan kubus 486 cm2. Volume kubus tersebut adalah …. 
""", 0)),

        listOf(Pair("""34. Dengan menggunakan kawat yang panjangnya 1,75 meter, akan dibuat sebuah kerangka balok yang berukuran 20 cm × 8 cm ×        6 cm. Sisa kawat yang tidak terpakai adalah ….
""", 0),
            Pair("""35. Sebuah balok mempunyai ukuran panjang 26 cm, lebar 24 cm, dan tinggi 15 cm. luas permukaan balok tersebut adalah ….
""", 0),
            Pair("""36. Perhatikan gambar berikut.Volume prisma segitiga tersebut adalah ….
""", 0)),

        listOf(Pair("""37. Sebuah bangun ruang memiliki ciri-ciri sebagai berikut:
(i)  mempunyai 6 sisi
(ii)  mempunyai 10 rusuk
(iii) mempunyai 6 titik sudut
(iv)  mempunyai 5 diagonal bidang Bangun ruang yang dimaksud adalah ….
""", 0),
            Pair("""38. Volume kubus yang mempunyai luas permukaan 1.944 cm2 adalah …
""", 0),
            Pair("""39. Mean (rata-rata hitung) dari data 7, 8, 6, 9, 7, 6, 9, 7, 7, 4, dan 6 adalah …. 
""", 0)),

        listOf(Pair("""40. Penjualan beras (dalam kuintal) di toko sembako Amanah selama lima hari sebagai berikut:
Jika penjualan beras selama lima hari sebanyak 230 kuintal, penjualan beras pada hari Rabu adalah ….
""", 0),
            Pair("""41. Diagram berikut merupakan data biaya kesehatan dan belanja makanan pokok masyarakat Indonesia.
biaya kesehatan masyarakat Indonesia pada tahun 2013 adalah ….
""", 0),
            Pair("""42. Nilai jangkauan kasus sembuh bulan Oktober sekitar ….
""", 0)),

        listOf(Pair("""43. Modus kasus sembuh harian bulan Oktober sekitar ….
""", 0),
            Pair("""44. Rata-rata persentase tingkat pengangguran terbuka berjenis kelamin laki-laki dari Agustus 2015 sampai Agustus 2019 adalah ….
""", 0),
            Pair("""45. Berikut adalah gambar beberapa benda model prisma dan limas yang diletakkan dengan susunan posisi tertentu
Jika dilihat dari atas maka susunan posisi benda yang benar adalah ...
""", 0)),

        listOf(Pair("""46. Perhatikan gambar di bawah.Jika panjang a = 18, dan panjang b = 30,  maka panjang c adalah ….
""", 0),
            Pair("""47. Diketahui kelompok tiga bilangan berikut.
(i) 3, 4, 5                    (iii) 7, 24, 25
(ii) 5, 13, 14                 (iv) 20, 21, 29
kelompok bilangan di atas yang merupakan tripel Pythagoras adalah ....
""", 0),
            Pair("""48. Jika segitiga siku-siku PQR dengan panjang sisi siku-sikunya 4 dm dan 6 dm, maka panjang hipotenusa dari ΔPQR adalah ....""", 0)),

        listOf(Pair("""49. Sebuah tangga yang panjangnya 10 m bersandar pada tembok sebuah rumah. Jika jarak ujung bawah tangga ke tembok 6 m, 
jarak ujung atas tangga dan permukaan tanah adalah ...
""", 0),
            Pair("""50. Perhatikan jaring-jaring kubus di bawah ini.Pasangan tutup dan alas kubus adalah ….
""", 0),
            Pair("""51. Luas permukaan balok yang panjang alasnya 20 cm, lebarnya 10 cm, dan tingginya 25 cm adalah ….
""", 0)),

        listOf(Pair("""52. Budi membuat kerangka prisma segitiga terbuat dari kawat sebanyak mungkin dengan ukuran alas 25 cm, 20 cm, dan 10 cm. Jika tinggi prisma 15 cm. panjang kawat yang diperlukan adalah ….
""", 0),
            Pair("""53. Sebuah limas alasnya berbentuk persegi dengan panjang sisi alas 12 cm dan tinggi limas 8 cm. Luas permukaan Limas adalah .... cm2
""", 0),
            Pair("""54. Volum kubus  343 cm3. Luas seluruh bidang sisi kubus tersebut adalah ….
""", 0)),

        listOf(Pair("""55. Daerah yang dibatasi oleh dua jari-jari dan satu busur lingkaran adalah…
""", 0),
            Pair("""56. Perhatikan gambar Lingkaran dibawah ini Diketahui <POQ 1300 , maka <PRQ adalah…
""", 0),
            Pair("""57. Dua buah lingkaran yang berpusat dititik P dan Q, jari-jari lingkaran P adalah 7 cm dan jari-jari lingkaran Q adalah 5 cm. Jarak kedua pusat lingkaran tersebut adalah 15 cm. Sehingga panjang garis singgung persekutuan dalam kedua lingkaran tersebut adalah… cm
""", 0)),

        listOf(Pair("""58. Titik yang terletak tepat di tengah lingkaran disebut ⋯
""", 0),
            Pair("""59. Diagram batang di atas menggambarkan data transportasi siswa kelas IX berangkat sekolah, transportasi yang paling banyak digunakan adalah ....""", 0),
            Pair("""60.Nilai rata-rata ulangan fisika dari suatu kelas adalah 6,8. Jika dua siswa yang nilainya 4 dan 6 diabaikan, maka nilai rata-rata kelas tersebut berubah menjadi 6,9. Banyaknya siswa mula-mula adalah ….
""", 0)),

        listOf(Pair("""61. Dari data : 7, 9, 3, 6, 6, 8, 4, 5, 8, 7, 4, 5, 6,9, 3 Median data tersebut adalah …
""", 0),
            Pair("""62. Sepuluh wanita mempunyai rata-rata tinggi badan 155 cm . Jika tiga orang wanita dikeluarkan dari kelompok tersebut, 
rata-rata tinggi badannya menjadi 156,5. Rata-rata tinggi badan ketiga wanita tersebut adalah...
""", 0),
            Pair("""63. Perhatikan tabel dibawah  Modus dari data adalah …. 
""", 0)),

        listOf(Pair("""64. Pada pelemparan dua buah dadu, kejadian muka dadu berjumlah 5 adalah ....""", 0),
            Pair("""65. Dua dadu dilambungkan bersama-sama. Peluang muncul mata dadu pertama 3 dan mata dadu kedua lima adalah…
""", 0),
            Pair("""66. Perhatikanlah gambar berikut :  
dalam teorema Pythagoras berlaku hubungan.....
""", 0)),

        listOf(Pair("""67. Diketahui kelompok tiga bilangan berikut :
(i)  5, 12, 13                 (iii)  8, 15, 17
(ii) 7, 23, 24                 (iv) 12, 35, 37
kelompok bilangan di atas yang merupakan tripel Pythagoras adalah ....
""", 0),
            Pair("""68. Jika segitiga siku-siku PQR dengan panjang sisi siku-sikunya 4 dm dan 6 dm, maka panjang hipotenusa dari ΔPQR adalah ....""", 0),
            Pair("""69. Perhatikan gambar segitiga berikut : 
nilai x adalah… .   
""", 0)),

        listOf(Pair("""70. Bidang datar pada lingkaran yang dibatasi oleh satu tali busur dan busur disebut…         
""", 0),
            Pair("""71. Perhatikan gambar berikut!Besar ∠CBD pada gambar di atas adalah ....    """, 0),
            Pair("""72. Panjang busur lingkaran dengan jari-jari 21 cm dan sudut pusat 60° adalah .... (π = )
""", 0)),

        listOf(Pair("""73.  Diketahui lingkaran pada gambar disamping dengan jari-jari 7 cm. Panjang busur AB adalah ….
""", 0),
            Pair("""74. Luas juring dengan sudut pusat 45o dan panjang jari-jari 14 cm adalah…(π=)
""", 0),
            Pair("""75. Diketahui panjang busur suatu lingkaran adalah 22 cm. Jika sudut pusat yang menghadap busur tersebut berukuran 120°, maka panjang jari-jari juring lingkaran tersebut adalah ... cm. (π=)
""", 0)),

        listOf(Pair("""76. Diketahui 2  buah lingkaran yang pusatnya P dan Q, dengan jarak PQ = 26 cm. Panjang jari-jari lingkaran berturut-turut dengan pusat  P = 8 cm dan pusat Q = 18 cm. Panjang garis singgung persekutuan luarnya adalah....""", 0),
            Pair("""77. Perhatikan gambar di bawah panjang AB adalah ….
""", 0),
            Pair("""78. Panjang garis singgung persekutuan dalam dua lingkaran adalah 15 cm dan kedua titik pusatnya terpisah sejauh 17 cm. Jika panjang jari-jari salah satu lingkaran adalah 3 cm, maka panjang jari-jari lainnya adalah...""", 0)),

        listOf(Pair("""79. Gambar disamping adalah jaring-jaring …..  
""", 0),
            Pair("""80. Banyak  bidang diagonal pada kubus/balok  adalah ….
""", 0),
            Pair("""81. Volum kubus  343 cm3. Luas seluruh bidang sisi kubus tersebut adalah ….
""", 0)),

        listOf(Pair("""82. Perhatikan gambar di samping Banyak diagonal ruang pada balok PQRS.TUVW adalah ….
""", 0),
            Pair("""83. Luas permukaan balok yang panjang alasnya 15 cm, lebarnya 10 cm, dan tingginya 20 cm adalah ….
""", 0),
            Pair("""84. Budi membuat kerangka prisma segitiga terbuat dari kawat dengan ukuran alas 25 cm, 20 cm, dan 10 cm. Jika tinggi prisma 15 cm. Maka panjang kawat yang diperlukan adalah…
""", 0)),

        listOf(Pair("""85. Gambar di samping merupakan sebuah kayu penahan roda mobil.  Luas permukaan kayu tersebut adalah  ....  """, 0),
            Pair("""86 . Diketahui pola bilangan 17, 14, 11, 8,… . Suku ke-7 dari pola bilangan tersebut adalah….
""", 0),
            Pair("""87 . Tiga suku berikutnya dari pola  2, 3, 5, 8, ...  adalah ….
""", 0)),

        listOf(Pair("""88 . Perhatikan barisan bilangan berikut
(i) 1, 2, 3, 5, 8, 13,       
(ii) 1, 3, 6, 10, 15,
(iii) 1, 6, 15, 20, 15, 6,
(iv) 2, 3, 5, 7, 11,
barisan bilangan yang merupakan barisan Fibonanci adalah …
""", 0),
            Pair("""89 . Huruf yang hilang dari pola berikut : A, K, C, ..., E, O, G adalah ….
""", 0),
            Pair("""90 . Perhatikan pola bilangan berikut:
(2, 6) , (3, 10) , (5, 18) 
pernyataan yang tepat untuk mendapatkan bilangan kedua dari bilangan pertama pada pola tersebut  
adalah….
""", 0)),

        listOf(Pair("""91 .Perhatikan gambar pola berrikut Banyaknya lingkaran pada pola ke - 6 adalah....
""", 0),
            Pair("""92 . Seutas tali dipotong menjadi lima bagian sehingga panjang masing-masing bagian membentuk pola barisan bilangan. Jika panjang tali terpendek 10 cm, tali yang di tengah 20 cm dan tali terpanjang 30 cm, maka panjang mula-mula adalah ....
""", 0),
            Pair("""93 . Berdasarkan gambar diatas, jarak titik (2, 5) terhadap sumbu-X adalah….
""", 0)),

        listOf(Pair("""94 . Diketahui titik P(-5, 8), titik P berada pada kuadran ....
""", 0),
            Pair("""95 . Diketahui titik K(7, a) dan titik K berjarak 7 satuan dari sumbu-Y dan berjarak 6 satuan dari sumbu-X serta berada di bawah sumbu-X, maka nilai a adalah….
""", 0),
            Pair("""96 . Diketahui titik A(4,2), B(4, 7), dan C(-1,7). Jika ketiga titik dihubungkan akan membentuk .... 
""", 0)),

        listOf(Pair("""97 . Diketahuititik P(3, 1), Q(3,7), R(9,7), dan titik S. Jika keempat titik tersebut dihubungkan akan membentuk persegi, maka koordinat titik S adalah….
""", 0),
            Pair("""98 . Diketahui garis ltegak lurus terhadap sumbu-X dan berjarak 2 satuan dari sumbu-Y, titik A berjarak 6 satuan dari garisldan berjarak 4 satuan dari sumbu-X  serta berada di kuadran III, maka koordinat titik A  adalah….
""", 0),
            Pair("""99 . Diketahui himpunan G = {1, 2, 3, 5} dan H = {2, 3, 4, 6, 8, 10} jika ditentukan himpunan pasangan berurutan  {(1, 2), (2, 4), (3, 6), (4, 8), (5, 10)}, maka relasi dari himpunan G ke himpunan H adalah ....
""", 0)),

        listOf(Pair("""100. Diketahui himpunan pasangan berurutan sebagai berikut:
(i) {(7, m), (8, m), (9, m), (10, m)}                        (iii) {(1, x), (2, x), (3, x), (4, x)}
(ii) {(1, p), (2, q), (1, r), (2, s)}                       (iv) {(1, t), (2, u), (1, v), (2, w)}
himpunan pasangan berurutan yang merupakan pemetaan(fungsi) adalah ....
""", 0),
            Pair("""101. Diketahui fungsi f(x) = 2 – 3x, jika x = {-2, -1, 0, 1, 2}. Maka daerah hasilnya adalah….
""", 0),
            Pair("""102. Diketahui fungsi f(x) = – 1 – x.  Nilai  f(–2) adalah ....""", 0)),

        listOf(Pair("""103. Diketahui fungsi f(x) = 6x – 7.  Jika f(k) = 23, maka nilai k adalah ....""", 0),
            Pair("""104. Diketahui rumus fungsi f(x) = 5x + 3. Jikaf(p) = -7 dan f(3) = q, maka nilai p + q adalah….
""", 0),
            Pair("""105. Fungsi f ditentukan olehf(x) = ax + b. Jikaf(-3) = -15  dan f(3) = 9, maka nilai f(-2)+ f(2) adalah….
""", 0)),

        listOf(Pair("""106. Diketahui himpunan P = {a, b, c, d, e} dan Q = {1, 2, 3, 4, 5}. Banyak korespondensi satu-satu yang mungkin dari P ke Q adalah….
""", 0),
            Pair("""107. Grafik persamaan garis dari 3x + 2y = 12 adalah ….  
""", 0),
            Pair("""108. Gradien dari persamaan garis 4x + y – 12 = 0 adalah….
""", 0)),

        listOf(Pair("""109. Gradien garis yang melalui titik-titik A (3, 5) dan B (6, 14) adalah ....""", 0),
            Pair("""110. Gradien garis yang tegak lurus dengan garis h : 3x – 6y  – 18 = 0 adalah….
""", 0),
            Pair("""111. Persamaan garis yang melalui titik   (-2, 1) dan  (3, 5) adalah ....""", 0)),

        listOf(Pair("""112. Persamaan garis yang melalui titik  (2, 5) dan bergradien 3 adalah ....""", 0),
            Pair("""113. Persamaan garis yang melalui titik  (5,– 6) dan tegak lurus dengan garis  3y – x + 12 = 0 adalah ....""", 0),
            Pair("""114. Jika p dan q merupakan anggota bilangan Cacah, maka himpunan penyelesaian dari p + 2q = 6 adalah .... """, 0)),

        listOf(Pair("""115. Jika a dan b merupakan penyelesaian dari persamaan  -3x + 2y = 8 dan  2x – y  = - 10, maka nilai  a – 2b adalah ....""", 0),
            Pair("""116. Diketahui sistem persamaan linear 3x + 4y = 17  dan  4x – 2y = 8.   Nilai dari 2x + 3y adalah ....""", 0),
            Pair("""117. Selesaian dari sistem persamaan   x – 3y = 5 dan 3x + 2y = 4  adalah ....""", 0)),

        listOf(Pair("""118. Keliling kebun berbentuk persegipanjang adalah 72 m. Jika selisih panjang dan lebar 4 m, maka luas kebun tersebut adalah.... """, 0),
            Pair("""119. Lenita membeli 1 kg daging sapi dan 2 kg ayam potong dengan harga Rp 164.000,00.  Pipit membeli 3 kg ayan potong dan 2 kg daging sapi dengan harga Rp 296.000,00. Jika harga 1 kg daging sapi dinyatakan dengan x dan harga 1 kg ayam potong dinyatakan dengan y, sistem persamaan linear dua variabel yang berkaitan dengan pernyataan di atas adalah ....""", 0),
            Pair("""120. Naya dan Era membeli sabun A dan sabun B di toko yang sama. Naya membeli 4  sabun  Adan 2 sabun B harus membayar Rp 34.000,00. Sedangkan Era membeli 3 sabun A dan 1 sabun B seharga Rp 23.000,00. Apabila Dewi membeli 5 sabun A dan 3 sabun B, ia harus membayar sebesar .... """, 0))
    )

    private  val pilihanGanda8: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. –2x – 9y","b. –2x – y","c. 2x + 9y","d. 2x + y"),
            listOf("a.  9x − 8","b. −9x - 8","c. -9x + 8","d.  9x + 8"),
            listOf("a.  6	+ 19	− 10","b.  6	− 19	− 10","c.  6	− 11	− 10","d.  6	− 11	+ 10")
        ),
        listOf(
            listOf("a.  15a + 15","b.  30a + 225","c.  a + 30a","d.  a + 10a"),
            listOf("a. (3x - 3)(x + 3)","b. (4x - 3)(x + 3)","c. (3x - 4)(x + 3)","d. (4x - 4)(x + 3)"),
            listOf("a.   64","b.   66","c.   62","d.   68")
        ),
        listOf(
            listOf("a. (X + 2) / (2x + 3)","b. (X - 2) / (2x - 3)","c. (X + 2) / (2x + 3)","d. (X - 2) / (2x - 3)"),
            listOf("a. Satu kurangnya dari","b. Satu lebihnya dari","c. Kurang dari","d. Lebih dari"),
            listOf("a. {(1, a), (2, a), (3, a), (1, b), (2, b), (3, b)} ","b. {(1, a), (1, b), (1, c), (2, a), (2, b)}","c. {(a, 1), (a, 2), (a, 3), (b, 1), (b, 2), (b, 3)}","d. {(a, 1), (a, 2), (b, 1), (b, 2), (b, 3), (c, 1), (c, 2)}")
        ),
        listOf(
            listOf("a. {(1, 1), (2, 1), (3, 1), (4, 1), (5, 1), (6, 3)} ","b. {(1, 1), (2, 1), (3, 1), (4, 2), (5, 1), (6, 3)}","c. {(1, 1), (2, 1), (3, 1), (4, 2), (5, 2), (6, 3)}","d. {(1, 1), (2, 2), (3, 1), (4, 2), (5, 1), (6, 3)}"),
            listOf("a. -28","b. -14","c.  12","d.  14"),
            listOf("a.   ³∕⁵","b. - ³∕⁵","c. - ⁵∕₃","d.   ⁵∕₃")
        ),
        listOf(
            listOf("a. f (x)  = 2x + 1","b. f (x)  = x  + 3","c. f (x)  = 2x  + 3","d. f (x)  = 3x  + 3"),
            listOf("a. 3y = 2x + 6","b. 2x + 3y = -6","c. y = -2x + 6","d. y = -2x/3 + 2"),
            listOf("a.  ⁴∕⁵","b.  ⁵∕₄","c.  ³∕₄","d.  ⁴∕₃")
        ),
        listOf(
            listOf("a.","b.","c.","d."),
            listOf("a. y = (1/2)x + 3","b. x = (1/2)y - 3","c. y = (1/2)x - 3","d. x = (1/2)y + 3"),
            listOf("a. 2x – 4y – 1 = 0","b. 3x – 4y – 5 = 0","c. 4x + 8y – 3 = 0","d. x – 2y + 6 = 0")
        ),
        listOf(
            listOf("a. x – 3y + 11 = 0","b. x – 3y – 11 = 0","c. 3x + y + 7 = 0","d. 3x + y – 7 = 0"),
            listOf("a.  2x + y + 5 = 0","b.  2x + y – 5 = 0","c.  x – 2y + 5 = 0","d.  x – 2y + 5 = 0"),
            listOf("a. 120 meter        ","b. 160 meter","c. 200 meter        ","d. 240 meter")
        ),
        listOf(
            listOf("a. Busur lingkaran        ","b. Juring lingkaran        ","c. jari-jari lingkaran","d. tali busur lingkaran"),
            listOf("a. 231 cm2        ","b. 462 cm2        ","c. 693 cm2","d. 1386 cm2"),
            listOf("a. 170 cm        ","b. 192 cm","c. 204 cm        ","d. 224 cm")
        ),
        listOf(
            listOf("a. 110 cm        ","b. 140 cm","c. 195 cm        ","d. 220 cm"),
            listOf("a. 44 cm        ","b. 88 cm","c. 154 cm        ","d. 308 cm"),
            listOf("a. 314 cm2        ","b. 1.256 cm2        ","c. 5.024 cm2","d. 20.096 cm2")
        ),
        listOf(
            listOf("a. 6 cm        ","b. 8 cm        ","c. 15 cm","d. 18 cm"),
            listOf("a. 3 cm        ","b. 4 cm        ","c. 5 cm","d. 7 cm"),
            listOf("a. Prisma segi enam beraturan        ","b. Prisma segi lima beraturan        ","c. limas segi enam beraturan","d. limas segi lima beraturan")
        ),
        listOf(
            listOf("a. 1, 4, dan 9","b. 1, 6, dan 9","c. 4, 5, dan 6","d. 6, 8, dan 9"),
            listOf("a. 4        ","b. 6        ","c. 8","d. 10"),
            listOf("a. 972 cm3        ","b. 729 cm3        ","c. 324 cm3","d. 81 cm3")
        ),
        listOf(
            listOf("a. 34 cm        ","b. 35 cm","c. 36 cm        ","d. 39 cm"),
            listOf("a. 9.360 cm2        ","b. 2.812 cm2        ","c. 2.748 cm2","d. 1.374 cm2"),
            listOf("a. 972 cm3","b. 756 cm3","c. 648 cm3        ","d. 324 cm3 ")
        ),
        listOf(
            listOf("a. Balok        ","b. Limas segi lima        ","c. limas segi enam","d. prisma segi lima"),
            listOf("a. 3.888 cm3        ","b. 4.096 cm3","c. 5.832 cm3        ","d. 6.382 cm3"),
            listOf("a. 6,8        ","b. 6,83        ","c. 6,9","d. 6,91")
        ),
        listOf(
            listOf("a. 50 kuintal","b. 55 kuintal","c. 60 kuintal","d. 65 kuintal"),
            listOf("a. Rp 25.744,00","b. Rp 35.393,00","c. Rp 61.137,00","d. Rp 86.881,00"),
            listOf("a. 2.500 kasus","b. 3.000 kasus","c. 5.000 kasus","d. 6.000 kasus")
        ),
        listOf(
            listOf("a. 2.500 kasus","b. 3.000 kasus","c. 5.000 kasus","d. 6.000 kasus"),
            listOf("a. 5,06","b. 5,5","c. 5,55","d. 5,60"),
            listOf("a.","b.","c.","d.")
        ),
        listOf(
            listOf("a. 16                        ","b. 24    ","c. 26              ","d. 28"),
            listOf("a. (i), (ii), dan (iii)              ","b. (i)(iii), dan (iv)   ","c. (ii) dan (iv)","d. (i), (ii), (iii), dan (iv)"),
            listOf("a. 52 dm               ","b. 10 dm   ","c. 2√13 dm    ","d. 26 dm")
        ),
        listOf(
            listOf("a. 16 m                ","b. 14 m     ","c. 12 m","d. 8 m"),
            listOf("a. sisi A dan D               ","b. sisi B dan F          ","c. sisi C dan A","d. sisi D dan B"),
            listOf("a. 950 cm2               ","b. 1.300 cm2    ","c. 1.900 cm2   ","d. 5.000 cm2")
        ),
        listOf(
            listOf("a. 140 cm                       ","b. 155 cm     ","c. 210 cm              ","d. 280 cm        "),
            listOf("a. 96                        ","b. 384        ","c. 480","d. 1.152"),
            listOf("a. 343 cm2               ","b. 294 cm2           ","c. 168 cm2","d. 49 cm2")
        ),
        listOf(
            listOf("a. Tembereng               ","b. Juring    ","c. Apotema","d. Diameter"),
            listOf("a. 500 ","b. 650","c. 700","d. 750"),
            listOf("a. 12                               ","b. 11                             ","c. 10","d. 9")
        ),
        listOf(
            listOf("a. titik pusat                         ","b. titik sumbu ","c. titik potong","d. titik diameter"),
            listOf("a. mobil                       ","b. taksi                   ","c. bus","d. sepeda"),
            listOf("a. 34                                   ","b. 35            ","c. 37               ","d. 38")
        ),
        listOf(
            listOf("a. 5                             ","b. 6                       ","c. 7 ","d. 8"),
            listOf("a. 151,0                              ","b. 151,5              ","c. 153,5","d. 154,5"),
            listOf("a. 0                              ","b. 1                             ","c. 2 ","d. 3")
        ),
        listOf(
            listOf("a.{(1,4), (2,3), (3,2), (4,1)}","b.{(0,5), (1,4), (3,2)}","c.{(1,1), (1,2), (1,3), (1,4), (1,5)}","d.{(1,1), (1,2), (1,3), (1,4), (1,5)}"),
            listOf("a. 5/36                       ","b. 4/36                    ","c. 3/36","d. 1/36"),
            listOf("a. q2 = p2 + r2                               ","b. r2 = p2 – q2   ","c. r2 = q2 – p2","d. q2 = r2 – p2")
        ),
        listOf(
            listOf("a. (i), (ii), dan (iii)                                ","b. (i) (iii), dan (iv)                                ","c. (ii) dan (iv)","d. (i), (ii), (iii), dan (iv)"),
            listOf("a. 2√13 dm                 ","b. 10 dm                ","c. 26 dm                ","d. 52 dm"),
            listOf("a. 4 m                                                                 ","b. 5 m ","c. 7 m ","d. 8 m")
        ),
        listOf(
            listOf("a. keliling lingkaran                            ","b. luas lingkaran        ","c. juring                                ","d. temberang"),
            listOf("a. 350                        ","b. 400                        ","c. 450","d. 500"),
            listOf("a. 11 cm               ","b. 12 cm  ","c. 21 cm     ","d. 22 cm           ")
        ),
        listOf(
            listOf("a. 49,5 cm","b. 44 cm","c. 16,5 cm","d. 14 cm"),
            listOf("a. 77 cm2                        ","b. 93 cm2                ","c. 154 cm2                ","d. 308 cm2"),
            listOf("a. 7                        ","b. 10,5                       ","c. 21                       ","d. 28")
        ),
        listOf(
            listOf("a. 24 cm      ","b. 20 cm          ","c. 15 cm               ","d. 12 cm"),
            listOf("a. 25 cm","b. 20 cm","c. 16 cm","d. 15 cm"),
            listOf("a. 10 cm     ","b. 12 cm   ","c. 5 cm              ","d. 4 cm    ")
        ),
        listOf(
            listOf("a. Prisma segi enam beraturan","b. Prisma segi lima beraturan","c. Limas segi enam beraturan","d. Limas segi lima beraturan"),
            listOf("a. 4                        ","b. 6                       ","c. 8                       ","d. 12"),
            listOf("a. 49 cm2        ","b. 168 cm2           .","c. 294 cm2             ","d. 343 cm2")
        ),
        listOf(
            listOf("a. 4 buah","b. 6 buah","c. 8 buah","d. 12 buah"),
            listOf("a. 900 cm2      ","b. 950 cm2             ","c. 1.300 cm2        ","d. 1.900 cm2"),
            listOf("a. 140 cm       ","b. 155 cm      ","c. 210 cm       ","d. 280 cm        ")
        ),
        listOf(
            listOf("a. 2.856 cm2","b. 2.268 cm2","c. 2.974 cm2","d. 2.848 cm2"),
            listOf("a. 2       ","b. 1        ","c. -1        ","d. -2"),
            listOf("a. 13, 20, 34        ","b. 12, 17,  23        ","c. 11, 14, 17         ","d. 9, 11, 15")
        ),
        listOf(
            listOf("a. (i)                ","b. (ii)        ","c. (iii)        ","d. (iv)"),
            listOf("a. D        ","b. L        ","c. M               ","d. N"),
            listOf("a. ditambah 4                          ","b. Dikalikan 3  ","c. dikalikan 2 kemudian ditambah 3        ","d. dikalikan 4 kemudian dikurangi 2")
        ),
        listOf(
            listOf("a. 48        ","b. 42        ","c. 40        ","d. 36"),
            listOf("a. 70 cm        ","b. 80 cm        ","c. 90 cm       ","d. 100 cm"),
            listOf("a. 2 satuan        ","b. 3 satuan        ","c. 5 satuan        ","d. 7 satuan")
        ),
        listOf(
            listOf("a. I        ","b. II        ","c. III        ","d. IV"),
            listOf("a. – 7          ","b. – 6         ","c. 6               ","d. 7"),
            listOf("a. Segitiga  sama sisi                         ","b. Segitiga siku-siku                                 ","c. Segitiga sama kaki                          ","d. Segitiga siku-siku sama kaki")
        ),
        listOf(
            listOf("a. (9, 1)        ","b. (7, 1)        ","c. (1, 9)       ","d. (1, 7)"),
            listOf("a. (- 8, - 4)","b. (- 6, - 4)        ","c. (- 2, - 4)       ","d. (- 4, - 2)"),
            listOf("a. kuadrat dari ","b. dua kali dari  ","c. setengah dari     ","d. kurang dari")
        ),
        listOf(
            listOf("a. (i) dan (ii)        ","b. (i) dan (iii)        ","c. (ii) dan (iii)        ","d. (iii) dan (iv)"),
            listOf("a. {8, 5, 2, -1, -4}                             ","b. {-4, 1, 2, 5, 6}              ","c. {8, 5, 2, 1,  -4}  ","d. {-4, -1, 2, 5, 6}"),
            listOf("a. - 3        ","b. - 1        ","c. 1       ","d. 3")
        ),
        listOf(
            listOf("a. 2       ","b. 3        ","c. 4       ","d. 5"),
            listOf("a. - 32        ","b. - 14       ","c. 11      ","d. 16"),
            listOf("a. – 6        ","b. – 4        ","c. 4       ","d. 6")
        ),
        listOf(
            listOf("a. 25       ","b. 32       ","c. 120       ","d. 3125"),
            listOf("a.","b.","c.","d."),
            listOf("a. 4        ","b. – ¼       ","c. – 3       ","d. -4")
        ),
        listOf(
            listOf("a. 4        ","b. 3        ","c. – 3       ","d. – 4 "),
            listOf("a. 2        ","b. 1        ","c. -½        ","d. – 2"),
            listOf("a.   4x – 5y  + 13 = 0                ","b. – 4x – 5y – 13 = 0     ","c.   4x – 5y – 13 = 0","d.   4x + 5y – 13 = 0")
        ),
        listOf(
            listOf("a. y = 3x – 11               ","b. y = 3x + 1              ","c. y = 3x – 1                ","d. y = 3x + 11"),
            listOf("a. y +3x = 9               ","b. y +3x = – 9           ","c. y – 3x = 9            ","b. y – 3x = –9"),
            listOf("a. {(0, 6), (1, 5), (2, 4), (3, 3)}          ","c. {(6, 0), (5, 1), (4, 2), (3, 3)}","b. {(0, 3), (1, 4), (2, 2), (6, 0)}  ","d. {(0, 3), (2, 2), (4, 1), (6, 0)} ")
        ),
        listOf(
            listOf("a. 16        ","b. 32        ","c. 40      ","d. 48"),
            listOf("a. 8       ","b. 10        ","c. 12       ","d. 13"),
            listOf("a. (2, -1)       ","b. (-2, 1)       ","c. (-2, -1)       ","d. (2, 1)")
        ),
        listOf(
            listOf("a. 144 m2      ","b. 160 m2      ","c. 288 m2       ","d. 320 m2"),
            listOf("a. x + 2y = 164.000 dan 3x + 2y = 296.000        ","b. x + 2y = 164.000 dan 2x + 3y = 296.000 ","c. 2x – y = 164.000 dan 3x – 2y = 296.000","d.  2x – y = 164.000 dan 2x – 3y = 296.000"),
            listOf("a. Rp 11.000,00                ","b. Rp 43.000,00       ","c. Rp 45.000,00          ","d. Rp 57.000,00")
        )
    )


    private val kunciJawaban8: List<List<Int>> = listOf(
        listOf(0,2,2),
        listOf(2,1,1),
        listOf(0,2,0),
        listOf(1,3,1),
        listOf(2,3,3),
        listOf(2,2,2),
        listOf(3,0,2),
        listOf(0,0,2),
        listOf(3,1,2),
        listOf(0,3,3),
        listOf(1,0,1),
        listOf(3,2,0),
        listOf(1,2,3),
        listOf(2,0,1),
        listOf(3,3,2),
        listOf(3,2,0),
        listOf(3,2,1),
        listOf(1,1,0),
        listOf(1,1,3),
        listOf(0,0,3),
        listOf(1,1,2),
        listOf(0,3,1),
        listOf(1,0,3),
        listOf(3,1,3),
        listOf(3,0,2),
        listOf(0,0,2),
        listOf(3,1,2),
        listOf(0,2,1),
        listOf(1,2,1),
        listOf(0,2,3),
        listOf(1,3,2),
        listOf(1,1,3),
        listOf(0,0,2),
        listOf(1,0,2),
        listOf(3,3,0),
        listOf(2,1,3),
        listOf(1,3,0),
        listOf(2,0,3),
        listOf(0,2,0),
        listOf(3,1,2)







    )
    private lateinit var scoreManager8: ScoreManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas8, container, false)
        scoreManager8 = ScoreManager(requireActivity().applicationContext)
        jawabanBenar8 = if(scoreManager8.scoreMatKelas8 < 1) 0 else scoreManager8.scoreMatKelas8 / 5

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
            val getData = soalMatsd8[jawabanBenar8][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda8[jawabanBenar8][i][j-2]
            }
        }

        val button = view.findViewById<Button>(R.id.buttonNextSoal2)
        var done = false

        button.setOnClickListener {
            val grup1 = listRadiogrup[0]
            val grup2 = listRadiogrup[1]
            val grup3 = listRadiogrup[2]

            if(grup1.checkedRadioButtonId != -1 && grup2.checkedRadioButtonId != -1 && grup3.checkedRadioButtonId != -1){
                if(done){
                    Toast.makeText(requireActivity().applicationContext, "Anda telah mengerjakan ini", Toast.LENGTH_SHORT).show()
                }else{
                    val pilihGrup1 = view.findViewById<RadioButton>(grup1.checkedRadioButtonId).text.toString()
                    val pilihGrup2 = view.findViewById<RadioButton>(grup2.checkedRadioButtonId).text.toString()
                    val pilihGrup3 = view.findViewById<RadioButton>(grup3.checkedRadioButtonId).text.toString()
                    val ch1 = pilihanGanda8[jawabanBenar8][0][kunciJawaban8[jawabanBenar8][0]]
                    val ch2 = pilihanGanda8[jawabanBenar8][1][kunciJawaban8[jawabanBenar8][1]]
                    val ch3 = pilihanGanda8[jawabanBenar8][2][kunciJawaban8[jawabanBenar8][2]]

                    var scoreMatSd = scoreManager8.scoreMatKelas8
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar8++

                        if(jawabanBenar8 == soalMatsd8.size){
                            scoreMatSd +=5
                            scoreManager8.scoreMatKelas8 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManager8.scoreMatKelas8 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd8[jawabanBenar8][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda8[jawabanBenar8][i][j-2]
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
                    }
                } // end cek jawab
            }else {
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT).show()
            } // end cek semua jawaban telah di centang
        }
        return view
    }
}