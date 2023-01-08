package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManager
import com.example.myapplication.R


class SoalMatKelas7 : Fragment() {

    private var jawabanBenar7 = 0
    private val soalMatsd7: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Himpunan bilangan bulat antara -4 dan 3 adalah ....""", 0),
            Pair("""2. Perhatikan pernyataan berikut
(1) -25 > -23
(2) -8 > -11
(3) -10 < -19
(4) 0 > -20
Pernyataan di atas yang benar adalah ....
""", 0),
            Pair("""3. Diberikan:
1	-5 + 4 = 9 - 10
2	-30 - (-8) = -22
3	 20 - 18 > -2 + 20
4	 4 - 3 + 7 > -9 - 10
Pernyataan-pernyataan yang benar adalah ....
""", 0)),

        listOf(Pair("""4. Perhatikan garis bilangan berikut :
Hasil akhir yang sesuai dengan garis bilangan di atas adalah ....
""", 0),
            Pair("""5. Diberikan a = -2, b = - 3, maka nilai 2a - b adalah ....""", 0),
            Pair("""6. Saya adalah suatu bilangan bila saya dikalikan 13 kemudian ditambah 21 hasilnya tidak kurang dari 99 maka saya yang paling kecil adalah...""", 0)),

        listOf(Pair("""7. Nilai n yang memenuhi kalimat 2ⁿ = 4³ adalah...""", 0),
            Pair("""8. √190,4 = 13,8 dan √19,04 = 4,36
maka √190.400 = ....
""", 0),
            Pair("""9. Di komplek perumahan dilakukan ronda oleh tiga penjaga keamanan,si A ronda tiap 2 hari sekali, 
Si B ronda setiap 3 hari sekali dan Si C ronda setiap 4 hari sekali,
pada hari Senin mereka melaksanakan ronda bersama sama,
pada hari berikut- nya mereka harusnya dapat melaksana- kan ronda bersama-sama tapi si C sakit,
pada hari apa mereka melaksanakan ronda bersama-sama lagi?
""", 0)),

        listOf(Pair("""10. Umur Andi 3 tahun lebih muda dari umur Budi. Jika umur Budi 15 tahun. Maka perbandingan umur Andi dan Budi adalah.....""", 0),
            Pair("""11. Dari pecahan berikut :
(i)   ⁴∕₆
(ii)  1 ½
(iii) ⁵∕₇
(iv)  0,5
Pecahan yang merupakan pecahan murni adalah ....
""", 0),
            Pair("""12. Bentuk persen dari 0,0825 adalah ....""", 0)),

        listOf(Pair("""13. Dari 40 orang siswa kelas VII A , 10 % nya mengikuti remidial ulangan. Banyak siswa yang mengikuti remidial adalah ....""", 0),
            Pair("""14. Kumpulan berikut yang bukan merupakan himpunan adalah ....""", 0),
            Pair("""15.	K = {Bilangan prima antara 20 dan 40} 
L = {Faktor dari 50}
M = {Faktor persekutuan dari 32 dan 40}
Himpunan di atas yang mempunyai 4 anggota adalah...
""", 0)),

        listOf(Pair("""16. { y | 3 ≤ 2y + 1 ≤ 15, y ∈ himpunan bilangan ganjil } jika dinyatakan dengan mendaftar anggotanya adalah ...""", 0),
            Pair("""17. Diketahui bahwa nilai dari S = 50, A = (15 - x), serta B = (27 + x),
maka jumlah dari irisan A dan B dari gambar yang ada di bawah ini yaitu ...
""", 0),
            Pair("""18. Diketahui P = {bilangan prima kurang dari 10}. Banyak himpunan bagian dari P adalah ....""", 0)),

        listOf(Pair("""19. S = { bilangan asli } dan B = { x | x ≤ 10, x bilangan asli } Komplemen dari B adalah...""", 0),
            Pair("""20. Dalam rangka memperingati HUT RI ke- 75 di masa pandemik new normal SMP Merdeka diadakan dua jenis lomba virtual,
yaitu lomba baca puisi dengan tema perjuangan dan reportase kegiatan di lingkungan rumah masing-masing,
jumlah peserta lomba seluruhnya ada75 orang,
lomba baca puisi diikuti 48 orang dan peserta yang mengikuti kedua lomba ada 13 orang,
Banyak peserta yang ikut lomba baca puisi saja adalah ... orang?
""", 0),
            Pair("""21. Jika nilai P = 100, Q = 120 serta nilai dari (P ∩ Q) = 80, maka nilai untuk (P ∪ Q) adalah...""", 0)),

        listOf(Pair("""22. Rusdi membeli 2 lusin buku dengan harga Rp76.800,00. Buku tersebut dijual dengan harga Rp4.000,00 tiap buah. Persentase yang dialami Rusdi adalah ....""", 0),
            Pair("""23. Rosa membeli sebuah roti dengan harga Rp5.000,00. Selanjutnya roti tersebut dijual dengan laba sebesar 15%
jika penjualan mencapai 100 buah roti,maka harga penjualannya adalah ….
""", 0),
            Pair("""24. Basti membeli 50 kg mangga dengan harga Rp15.000,00 per kg. Kemudian, ia menjual 40 kg mangga tersebut dengan harga Rp18.000,00 
dan sisanya dengan harga Rp10.000,00. Untung yang diperoleh Basti adalah ....
""", 0)),

        listOf(Pair("""25. Sebuah yayasan pendidikan membeli buku pelajaran sebanyak 120 buah dengan harga Rp42.500,00 per buah dan rabat sebesar 20%
Banyaknya uang yang harus dibayar sekolah tersebut adalah ....
""", 0),
            Pair("""26. Pak Ahmad memiliki 10 karung terigu dengan bruto 600 kg. Jika tara tiap karungnya 2%, maka neto satu karung terigu adalah...kg?""", 0),
            Pair("""27. Pak Robet meminjam uang di bank sebesar Rp6.000.000,00 dan diangsur selama 10 bulan dengan bunga 2,5% tiap bulan. Besar angsuran tiap bulan adalah ….
""", 0)),

        listOf(Pair("""28. Adik memiliki uang di bank sebesar Rp5.000.000,00 dengan suku bunga 12% setahun dengan bunga tunggal
Besarnya tabungan adik pada akhir bulan kelima adalah ....
""", 0),
            Pair("""29. Priskilla memiliki modal Rp150.000,00 untuk membeli 30 kg beras,selanjutnya beras tersebut dijual Rp4.500,00 tiap kg
Persentase untung atau ruginya adalah ....
""", 0),
            Pair("""30. Toko Buku mempunyai 20 lusin buku Rp760.800,00. Kemudian buku dijual dengan harga Rp40.000,00 tiap buah. Persentase rugi (R) atau untung (U) adalah ….
""", 0)),

        listOf(Pair("""31. Elvin memiliki uang sebesar Rp8.000.000,00 di bank dengan bunga 6% per tahun. Setelah 9 bulan, jumlah uang Elvin adalah ….
""", 0),
            Pair("""32. Koperasi A mempunyai bunga tunggal sebesar 15% dalam 1 tahun. Rizki menabung di koperasi A sebesar Rp4.800.000,00. Jumlah uang Rizki setelah 8 bulan adalah ....""", 0),
            Pair("""33. Bruto dari 7 karung semen adalah 350 kg dan memiliki tara sebesar 1,5%. Berat neto dari masing-masing karung adalah ....""", 0)),

        listOf(Pair("""34. Pedagang di pasar A menjual barangnya seharga x rupiah. Penjualan yang ia lakukan mengalami keuntungan sebesar Rp15.000,00 atau 20% dari modalnya
Nilai x adalah ….
""", 0),
            Pair("""35. Mickha mempunyai uang di bank sebesar Rp2.000.000,00 dengan bunga 8% setiap tahun. Uang tabungan Mickha setelah 9 bulan adalah.…
""", 0),
            Pair("""36. Rion mempunyai satu karung beras dengan berat 100 kg dengan tara 2,5%. Setiap karung beras dijual sebesar Rp200.000,00
Kemudian sisa beras tersebut dijual sebesar Rp2.400,00 per kg, maka besar keuntungan adalah .…
""", 0)),

        listOf(Pair("""37. Faiz mempunyai 100 kg karung gula pasir yang masing-masing karung terdapat keterangan bertuliskan bruto 115 kg dan tara 2 kg. Neto gula pasir adalah ….
""", 0),
            Pair("""38. Yermia memiliki 1 kuintal beras dengan harga Rp. 850.000,00. Jika ia ingin mendapatkan untung Rp. 1000,00 per kg, maka harga jualnya adalah ….
""", 0),
            Pair("""39. Pedagang di pasar B mempunyai stok 50 kg gula seharga Rp350.000,00. Ia ingin menjual gula tersebut dengan keuntungan 15%
Harga penjualan setiap kilogram gula adalah ….
""", 0)),

        listOf(Pair("""40. Shawn memiliki uang sebesar Rp2.000.000,00 di bank dengan bunga 15% per tahun. Besar uang Shawn setelah 8 bulan adalah ....""", 0),
            Pair("""41. Total harga pembelian 1,5 lusin buku sebesar Rp72.000,00. kemudian buku tersebut dijual dengan harga Rp5.000,00 tiap buah 
Persentase untung atau ruginya adalah ....
""", 0),
            Pair("""42. Besar sudut terkecil yang dibentuk oleh jarum jam pada pukul 15.00 sama dengan ....""", 0)),

        listOf(Pair("""43. ²∕₃ sudut putaran penuh termasuk jenis sudut ....""", 0),
            Pair("""44. Terdapat kelompok sudut sebagai berikut
(i) 45°, 65°, 95°
(ii) 92°, 105°, 125°
(iii) 193°, 220°, 270°
(iv) 300°, 330°, 355°
yang merupakan jenis sudut tumpul adalah ….
""", 0),
            Pair("""45. Perhatikan gambar berikut
sudut-sudut tersebut memiliki AC sebagai salah satu kaki sudutnya, kecuali ….
""", 0)),

        listOf(Pair("""46. Penyiku sudut 35° adalah ....""", 0),
            Pair("""47. Perhatikan gambar berikut.
jika besar x = 125°, maka besar y adalah ….
""", 0),
            Pair("""48. Perhatikan gambar berikut.
nilai x pada gambar tersebut adalah ….
""", 0)),

        listOf(Pair("""49. Perhatikan gambar berikut.
besar RQS adalah ….
""", 0),
            Pair("""50. Perhatikan gambar berikut.
jika ∠AOD + ∠BOC =110°, maka besar ∠DOC = …
""", 0),
            Pair("""51. Perhatikan gambar berikut.
berdasarkan gambar tersebut, nilai x + y adalah ….
""", 0)),

        listOf(Pair("""52. Rasio waktu yang diluangkan Karina untuk mengerjakan tugas Matematika terhadap tugas IPA adalah 5 banding 4. Jika dia meluangkan 40 menit untuk menyelesaikan tugas Matematika, maka waktu yang dia luangkan untuk menyelesaikan tugas IPA adalah ...""", 0),
            Pair("""53. Pada  peta  dengan  skala  1   :  450,  sebuah  lapangan  berbentuk  persegipanjang tergambar dalam ukuran 8 cm x 6 cm
luas lapangan tersebut sebenarnya adalah …
""", 0),
            Pair("""54. Sebuah mesin di suatu pabrik minuman mampu memasang tutup botol untuk 14 botol dalam waktu 84 detik
banyak botol yang dapat ditutup oleh mesin dalam waktu 2 menit adalah ...
""", 0)),

        listOf(Pair("""55. Di antara perbandingan di bawah ini yang senilai dengan 3 : 8 adalah ....""", 0),
            Pair("""56. Diketahui 6 : ( a + 2 ) = 9 : ( 2a – 1 ), nilai a adalah…
""", 0),
            Pair("""57. Tabel disamping menunjukkan waktu yang dibutuhkan seorang perajin untuk membuat sepatu. Berapa hari yang dibutuhkan untuk membuat 75 pasang sepatu?""", 0)),

        listOf(Pair("""58. Jarak  antara  dua  kota  pada  peta  adalah  2  cm.  Jarak  sebenarnya  kedua  kota sebenarnya adalah 80 km. Skala yang digunakan peta tersebut adalah ...""", 0),
            Pair("""59.  Seorang penjual mie ayam mengeluarkan modal sebesar  Rp 1.000.000,00 untuk menjalankan  usahanya
dia mematok harga mie ayam  adalah Rp 10.000,00 per porsi. Jika pada hari itu ia menanggung kerugian sebesar 5%, maka berapa porsi yang terjual pada hari itu.?
""", 0),
            Pair("""60. Perhatikan tabel disamping menunjukkan pasangan nilai x dan y yang membentuk perbandingan berbalik nilai. Tentukan nilai m ……
""", 0)),

        listOf(Pair("""61. Siswa kelas VII sebuah SMP diminta gurunya untuk menggali informasi dari internet atau perpustakaan
dari 64 siswa, 48 siswa memilih menggali informasi melalui internet dan 16 siswa memilih mencari di perpustakaan
pernyataan berikut benar untuk masalah di atas, kecuali ….
""", 0),
            Pair("""62. Dalam perdagangan pernyataan-pernyataan berikut benar, kecuali . . .
""", 0),
            Pair("""63. Toko busana “Rapih“ menjual sebuah baju dengan harga Rp. 75.000,00 dari penjualan itu ternyata memperoleh keuntungan 25%
harga pembelian baju tersebut adalah . . .
""", 0)),

        listOf(Pair("""64. Seorang pedagang mengeluarkan Rp2.500.000,00 untuk menjalankan usahanya
jika pada hari itu dia mendapat keuntungan sebesar 10%, maka besarnya pendapatan yang didapatkan pada hari itu adalah ....
""", 0),
            Pair("""65. Seorang pedagang kelinci memperoleh hasil penjualan Rp. 432.000,00. dari penjualan itu ia rugi 10%. Besar modal pedagang kelinci adalah . . .
""", 0),
            Pair("""66. Seorang pedagang kaos membeli 80 kaos dari grosir dengan harga Rp 60.000,00 per buah.Jika ia berhasil menjual semuanya dengan keuntungan sebesar 20%, 
maka harga jual masing-masing kaos adalah …
""", 0)),

        listOf(Pair("""67. Seorang karyawan memperoleh gaji sebulan sebesar Rp. 1.450.000,00 dengan penghasilan tidak kena pajak Rp. 360.000,00 
jika besar pajak penghasilan ( PPh ) adalah 10%, berapakah gaji yang diterima karyawan tersebut dalam satu bulan ?
""", 0),
            Pair("""68. Pernyataan di bawah ini benar, kecuali . . .
""", 0),
            Pair("""69. Seorang pedagang membeli 5 karung beras dengan berat kotor masing-masing 50 kg dan tara 1%
berapa rupiah pedagang itu harus  membayar jika harga setiap kg beras tersebut Rp. 6.000,00 ?        
""", 0)),

        listOf(Pair("""70. Bu Riska memiliki uang sebanyak Rp. 1.400.000,00 dan ditabung di Bank A dengan bunga 11% per tahun,
setelah 3 bulan uang diambil seluruhnya untuk memperbaiki rumah. Berapa uang yang dimiliki Bu Riska setelah disimpan di Bank selama 3 bulan?
""", 0),
            Pair("""71. Perhatikan gambar berikut
garis yang sejajar dengan AB adalah...
""", 0),
            Pair("""72. Perhatikan gambar di samping, yang merupakan sudut lancip adalah . . .
""", 0)),

        listOf(Pair("""73. Tentukan besar sudut terkecil yang dibentuk oleh kedua jarum jam pada pukul 02.40 !""", 0),
            Pair("""74. Pada gambar di atas, terdapat pasangan sudut berikut :  
i ∠A2 sehadap dengan   ∠B2
ii ∠A3 dalam berseberangan dengan   ∠B1
iii ∠A1 luar sepihak dengan   ∠B3
dari pernyataan di atas yang benar adalah . . .
""", 0),
            Pair("""75. Perhatikan pernyataan di bawah ini 
i Segitiga lancip adalah segitiga yang ketiga sudutnya merupakan lancip
ii Segitiga tumpul adalah segitiga yang kedua sudutnya merupakan sudut tumpul
iii Segitiga siku-siku adalah segitiga yang salah satu sudutnya merupakan sudut siku-siku
dari ketiga pernyataan di atas, yang benar adalah …
""", 0)),

        listOf(Pair("""76. Perhatikan gambar berikut
keliling persegi panjang EFGH sama dengan dua kali keliling persegi ABCD. Panjang sisi persegi adalah ….  
""", 0),
            Pair("""77. Suatu persegi panjang mempunyai luas 84 cm2,  jika salah satu sisinya 7 cm. Berapakah keliling persegi panjang tersebut?""", 0),
            Pair("""78. Luas sebuah layang-layang 104 cm2. Jika panjang salah satu diagonalnya 16 cm,  hitunglah panjang diagonal yang lain!""", 0)),

        listOf(Pair("""79. Perhatikan pernyataan di bawah ini 
i.  Banyak guru yang mengajar di SMP A        iii. Tingkat kepuasan konsumen
ii.  Tinggi badan siswa                        iv.  Cara siswa berangkat sekolah
dari pernyataan di atas yang merupakan data numerik adalah . . .
""", 0),
            Pair("""80. Gambar di samping menunjukkan sumber air minum yang dikonsumsi oleh penduduk provinsi Jawa Timur pada tahun 2010 
dengan populasi jumlah penduduk 34 juta jiwa, berapa banyak penduduk yang mengkonsumsi air sumur ?   
""", 0),
            Pair("""81. Diagram di samping menunjukkan volume ekspor kopi Indonesia ke Inggris tahun 2009 – 2014. Jumlah volume ekspor kopi sebelum tahun 2012 adalah …  
""", 0)),

        listOf(Pair("""82.  Hasil dari (-12):3+8x(-5) adalah..
""", 0),
            Pair("""83.  Bilangan  pecahan yang nilainya terkecil adalah...""", 0),
            Pair("""84.  Hasil dari 2³ x 2² =....""", 0)),

        listOf(Pair("""85.  Nilai dari 4,23 – 2,138 = ...""", 0),
            Pair("""86.  Pak Hadi mempunyai cat sebanyak 4 kg.Sebanyak 1,.2 kg digunakan untuk mengecat  lemari,0,8 kg untuk mengecat meja sisanya untuk mengecat kursi
Maka banyak cat yang digunakan untuk mengecat kursi adalah...
""", 0),
            Pair("""87.  Suhu kota A 10°C . Suhu kota B 20°C lebih dingin dari suhu kota A. Jika suhu kota C paling rendah serta suhu kota B dan C berselisih 5°C , 
maka suhu kota C adalah...
""", 0)),

        listOf(Pair("""88.  Diketahui C ={ elang,harimau,singa}.Himpunana semesta berikut yang mungkin untuk himpuann C adalah :...""", 0),
            Pair("""89.  Dari 28 siswa yng mengikuti kegiatan ekstra kurikuler di sekolah,15 siswa mengikutipramuka, 12 siswa mengikuti futsal dan 7 siswa mengikuti keduanya,
maka siswa yang tidak  menyukai keduanya adalah...
""", 0),
            Pair("""90.  Koefisien p pada bentuk aljabar 3p2+2pq – q + 5p adalah...""", 0))

    )

    private  val pilihanGanda7: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. { -4, -3, -2,-1, 0, 1, 2, 3 }  ","b. { -3, -2, -1, 0, 1, 2, 3 }","c. { -3, -2, -1, 0, 1, 2 }","d. { -2, -1, 0, 1, 2, 3 }"),
            listOf("a. 1, 2 dan 3","b. 1 dan 3","c. 2 dan 4","d. Semua benar"),
            listOf("a. 1, 2 dan 3","b. 1 dan 3","c. 2 dan 4","d. semua benar")
        ),
        listOf(
            listOf("a. 3 + (-4)","b. (-1) + 4","c. (-1) + 3","d. 4 + (-3)"),
            listOf("a. -7","b. -1","c. 1","d. 7"),
            listOf("a. 5","b. 6","c. 7","d. 8")
        ),
        listOf(
            listOf("a. 2","b. 3","c. 5","d. 6"),
            listOf("a. 1.380","b. 436","c. 138","d. 43,6"),
            listOf("a. Senin","b. Selasa","c. Rabu ","d. Kamis")
        ),
        listOf(
            listOf("a. 2 : 3","b. 3 : 5","c. 4 : 5","d. 5 : 7"),
            listOf("a. (i), (ii) dan (iii)","b. (i), (ii) dan (iv)","c. (i), (iii) dan (iv)","d. (iii) dan (iv)"),
            listOf("a. 0,0825 %","b. 0,825 %","c. 8,25 %","d. 82,5 %")
        ),
        listOf(
            listOf("a. 4 orang","b. 5 orang","c. 8 orang","d. 10 orang"),
            listOf("a. Kumpulan kendaraan roda dua","b. Kumpulan stasiun tv swasta indonesia","c. Kumpulan hewan herbivora","d. Kumpulan hewan langka"),
            listOf("a. Hanya K dan L","b. Hanya L dan M","c. Hanya L dan M","d. Hanya M")
        ),
        listOf(
            listOf("a. { 1, 2, 3, 4, 5, 6, 7 }","b. { 1, 3, 5, 6, 7, 9 }","c. { 1, 3, 5, 7 }","d. { 3, 5, 7 }"),
            listOf("a. 5","b. 6","c. 7","d. 8"),
            listOf("a. 8","b. 10","c. 16","d. 32")
        ),
        listOf(
            listOf("a. { 10, 11, 12, 13, ... }","b. { 11, 12, 13, 14, ... }","c. { 10, 11, 12, 13, ... , 20 }","d. { 11, 12, 13, 14, ... , 20 }"),
            listOf("a. 40        ","b. 32","c. 27     ","d. 24"),
            listOf("a. 80","b. 100","c. 120","d. 140")
        ),
        listOf(
            listOf("a. untung 25%","b. untung 20%","c. rugi 25%","d. rugi 20%"),
            listOf("a. Rp625.000,00","b. Rp575.000,00","c. Rp500.000,00","d. Rp425.000,00"),
            listOf("a. Rp70.000,00","b. Rp75.000,00","c. Rp80.000,00","d. Rp85.000,00")
        ),
        listOf(
            listOf("a. Rp6.210.000,00","b. Rp3.120.000,00","c. Rp4.800.000,00","d. Rp4.080.000,"),
            listOf("a. 60","b. 58,8","c. 48,2","d. 46,8"),
            listOf("a. Rp600.000,00","b. Rp750.000,00","c. Rp800.000,00","d. Rp850.000,00")
        ),
        listOf(
            listOf("a. Rp5.300.000,00","b. Rp5.200.000,00","c. Rp5.250.000,00","d. Rp5.270.000,00"),
            listOf("a. rugi 10%","b. rugi 15%","c. untung 10%","d. untung 15%"),
            listOf("a. U = 25%","b. R = 25%","c. U = 20%","d. R = 20%")
        ),
        listOf(
            listOf("a. Rp8.360.000,00","b. Rp8.400.000,00","c. Rp8.480.000,00","d. Rp8.540.000,00"),
            listOf("a. Rp5.520.000,00","b. Rp5.280.000,00","c. Rp720.000,00","d. Rp480.000,00"),
            listOf("a. 49,85 kg","b. 49,75 kg","c. 49,25 kg","d. 49,15 kg")
        ),
        listOf(
            listOf("a. Rp75.000,00","b. Rp80.000,00","c. Rp85.000,00","d. Rp90.000,00"),
            listOf("a. Rp2.720.000,00","b. Rp2.160.000,00","c. Rp2.170.000,00","d. Rp2.120.000,00"),
            listOf("a. Rp34.000,00","b. Rp56.000,00","c. Rp68.000,00","d. Rp80.000,00")
        ),
        listOf(
            listOf("a. 113 kuintal","b. 115 kuintal","c. 117 kuintal","d. 201 kuintal"),
            listOf("a. Rp 6.500,00","b. Rp 7.500,00","c. Rp 8.500,00","d. Rp 9.500,00"),
            listOf("a. Rp8.470,00","b. Rp8.270,00","c. Rp8.050,00","d. Rp7.700,00")
        ),
        listOf(
            listOf("a. Rp240.000,00","b. Rp360.000,00","c. Rp2.200.000,00","d. Rp2.360.000,00"),
            listOf("a. untung 25%","b. untung 20%","c. rugi 20%","d. rugi 25%"),
            listOf("a. ¹∕₈ sudut satu putaran penuh","b. ¹∕₄ sudut satu putaran penuh","c. ¹∕₃ sudut satu putaran penuh","d. ¹∕₂ sudut satu putaran penuh")
        ),
        listOf(
            listOf("a. Lancip","b. Tumpul","c. Lurus","d. Refleks"),
            listOf("a. (i) dan (ii)","b. (ii) dan (iii)","c. hanya (ii)","d. hanya (iv)"),
            listOf("a. BAD","b. ABC","c. CAD","d. ADC")
        ),
        listOf(
            listOf("a. 155°","b. 145°","c. 65°","d. 55°"),
            listOf("a. 35°","b. 45°","c. 55°","d. 65°"),
            listOf("a. 59°","b. 69°","c. 118°","d. 123°")
        ),
        listOf(
            listOf("a. 20°","b. 30°","c. 35°","d. 55°"),
            listOf("a. 70°","b. 110°","c. 125°","d. 140°"),
            listOf("a. 90°","b. 82°","c. 49°","d. 45°")
        ),
        listOf(
            listOf("a. 20 menit","b. 32 menit","d. 90 menit ","c. 60 menit"),
            listOf("a. 216 m²                                                ","b. 432 m²","c. 768 m²","d. 972 m²"),
            listOf("a. 16 botol                ","b. 20 botol","c. 28 cm","d. 35 cm")
        ),
        listOf(
            listOf("a. 18 cm : 4,5 dm                                ","b. ¼ jam = 2/3 jam        ","c. 3 minggu : 49 hari","d. 750 gram : 200 ons"),
            listOf("a. -4                         ","b. -8                         ","c. 9                        ","d. 21"),
            listOf("a. 40 hari                        ","b. 39 hari                 ","c. 36 hari                ","d. 30 hari")
        ),
        listOf(
            listOf("a. 1 : 400.000                ","b. 1 : 800.000                ","c. 1 : 4.000.000        ","d. 1 : 8.000.000"),
            listOf("a. 90                        ","b. 93                        ","d. 95                        ","c. 96"),
            listOf("a.15                ","b. 16                        ","c. 17                        ","d. 16        ")
        ),
        listOf(
            listOf("a. Seperempat dari siswa membaca di perpustakaan","b. Perbandingan banyak siswa yang menggunakan internet dengan yang ke perpustakaan adalah 4 : 1","c. Siswa yang menggunakan internet 32 lebih banyak daripada yang ke perpustakaan","d. Banyak siswa yang menggunakan internet 3 kali lipat dari yang ke perpustakaan"),
            listOf("a. Untung = harga penjualan – harga pembelian","b. Harga pembelian = harga penjualan + rug","c. Modal = harga penjualan – untung","d. Harga penjualan = harga pembelian + untung"),
            listOf("a. Rp. 95.000,00                                        ","b. Rp. 93.750,00   ","c. Rp. 60.000,00                                    ","d. Rp. 56.250,00")
        ),
        listOf(
            listOf("a. Rp 2.600.000,00                                      ","b. Rp 2.650.000,00   ","c. Rp. 2.700.000,00 ","d. Rp. 2.750.000,00"),
            listOf("a. Rp. 388.800,00                               ","b. Rp. 442.000,00     ","c. Rp. 475.200,00","d. Rp. 480.000,00"),
            listOf("a. Rp 72.000,00                                ","b. Rp 70.000,00       ","c. Rp. 68.000,00","d. Rp. 65.000,00")
        ),
        listOf(
            listOf("a. Rp 1.341.000,00                                ","b. Rp 1.345.000,00       ","d. Rp. 1.350.000,00        ","c. Rp. 1.355.000,00"),
            listOf("a. Tara adalah berat kemasan","b. Netto adalah berat kotor dikurangi berat kemasan","d. Bruto adalah berat bersih atau kemasan beserta isinya","c. Rabat adalah potongan harga"),
            listOf("a. Rp. 1.500.000,00                               ","b. Rp. 1.485.000,00                        ","d. Rp. 1.845.000,00","c. Rp. 1.840.000,00")
        ),
        listOf(
            listOf("a. Rp. 1.500.000,00                              ","b. Rp. 1.440.000,00                              ","d. Rp. 1.438.500,00","c. Rp. 1.540.000,00"),
            listOf("a. Garis BC                        ","b. Garis AD                        ","d. Garis EF ","c. Garis EA"),
            listOf("a. i dan ii                                ","b. ii dan iv                           ","d. i dan iii","c. i dan iv")
        ),
        listOf(
            listOf("a. 1600                        ","b. 1700                ","c. 1550              ","d. 1800"),
            listOf("a. i dan  ii                ","b. i dan iii                ","c. ii dan iii                ","d. i, ii dan iii"),
            listOf("a. i dan  ii                ","b. i dan iii                ","c. ii dan iii                 ","d. i, ii dan iii")
        ),
        listOf(
            listOf("a. 16 cm                                        ","b. 15 cm ","c. 14 cm","d. 12 cm"),
            listOf("a. 36 cm","b. 83 cm                ","c. 40 cm                ","d. 38 cm"),
            listOf("a. 15 cm                       ","b. 14 cm                ","c. 13 cm                ","d. 12 cm")
        ),
        listOf(
            listOf("a. i dan iii                ","b. i dan ii               ","c. ii dan iv                ","d. i, ii dan iii"),
            listOf("a. 12.242.000 jiwa                                ","b. 12.420.000 jiwa                                ","c. 12.240.000 jiwa ","d. 1.240.000 jiwa"),
            listOf("a. 16.000 ton                        ","b. 35.000 ton","c. 53.000 ton","d. 69.000 ton")
        ),
        listOf(
            listOf("a.  -44                ","b.  -36              ","c.  28              ","d.  48          "),
            listOf("a.  5/12      ","b.  4/9","c.  3/8","d.  3/7"),
            listOf("a.  32","b.  16","c.  64","d.  24")
        ),
        listOf(
            listOf("a.  2,102 ","b.  2,092 ","c.  2,062 ","d.  2,032"),
            listOf("a.  2,01 kg  ","b.  2,18 kg ","c.  2,3 0kg","d.  3,2 kg"),
            listOf("a.   -5°C ","b.  -10°C","c.  -12°C","d.  -15°C")
        ),
        listOf(
            listOf("a.  S= {Binatang ternak}    ","b.  S={   Binatang berkaki dua }","c.  S={  Binatang berkaki enam } ","d.  S={ Binantang pemakan daging }"),
            listOf("a.  8 ","b.  7   ","c.  6 ","d.  5"),
            listOf("a.  5 ","b.  3","c.  2","d. -1")
        )
    )


    private val kunciJawaban7: List<List<Int>> = listOf(
        listOf(2,2,2),
        listOf(1,1,1),
        listOf(3,1,3),
        listOf(0,2,2),
        listOf(0,3,3),
        listOf(3,3,2),
        listOf(1,2,3),
        listOf(0,1,0),
        listOf(3,1,1),
        listOf(2,0,0),
        listOf(0,1,2),
        listOf(3,3,0),
        listOf(0,0,3),
        listOf(2,0,1),
        listOf(3,2,0),
        listOf(3,2,0),
        listOf(2,2,1),
        listOf(1,3,1),
        listOf(1,1,3),
        listOf(2,2,1),
        listOf(1,1,2),
        listOf(3,2,0),
        listOf(1,2,1),
        listOf(2,2,3),
        listOf(0,0,1),
        listOf(1,3,2),
        listOf(1,2,2),
        listOf(0,2,0),
        listOf(1,1,3),
        listOf(3,2,0)






    )
    private lateinit var scoreManager7: ScoreManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas7, container, false)
        scoreManager7 = ScoreManager(requireActivity().applicationContext)
        jawabanBenar7 = if(scoreManager7.scoreMatKelas7 < 1) 0 else scoreManager7.scoreMatKelas7 / 5

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
            val getData = soalMatsd7[jawabanBenar7][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda7[jawabanBenar7][i][j-2]
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
                    val ch1 = pilihanGanda7[jawabanBenar7][0][kunciJawaban7[jawabanBenar7][0]]
                    val ch2 = pilihanGanda7[jawabanBenar7][1][kunciJawaban7[jawabanBenar7][1]]
                    val ch3 = pilihanGanda7[jawabanBenar7][2][kunciJawaban7[jawabanBenar7][2]]

                    var scoreMatSd = scoreManager7.scoreMatKelas7
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar7++

                        if(jawabanBenar7 == soalMatsd7.size){
                            scoreMatSd +=5
                            scoreManager7.scoreMatKelas7 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManager7.scoreMatKelas7 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd7[jawabanBenar7][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda7[jawabanBenar7][i][j-2]
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