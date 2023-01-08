package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManager
import com.example.myapplication.R


class SoalMatKelas9 : Fragment() {

    private var jawabanBenar9 = 0
    private val soalMatsd9: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("""1. Sebuah tiang tingginya 1,5 meter memiliki bayangan 225 cm. Pada saat yang sama bayangan sebuah gedung 36 meter. 
Tinggi gedung tersebut adalah…
""", 0),
            Pair("""2. Pada gambar di samping ditunjukkan ∆ ABD kongruen dengan ∆ACD. Syarat konggruen yang sesuai adalah:
1 sudut – sudut – sudut
2 sudut – sudut – sisi
3 sisi – sudut – sisi
4 sisi – sisi – sudut
Jawaban yang benar adalah…
""", 0),
            Pair("""3. Perhatikan gambar berikut.   
Nilai x sama dengan .... 
""", 0)),

        listOf(Pair("""4. Seorang pemuda menghitung lebar sungai dengan menancapkan tongkat di Q, R, S, dan T ( seperti gambar) 
sehingga S, R, P segaris ( P = benda di seberang sungai). Lebar sungai (PQ) adalah . . .   
""", 0),
            Pair("""5. Perhatikan gambar di bawah ini 
Jika ∆ ABC dan ∆ PQR kongruen, maka pasangan sisi yang sama panjang adalah…
""", 0),
            Pair("""6. Pernyataan berikut yang tidak benar adalah…
""", 0)),

        listOf(Pair("""7. Sebuah tabung memiliki jari-jari 10,5 cm dan tinggi 8 cm. Jika  , maka Luas selimut tabung adalah…
""", 0),
            Pair("""8. Perhatikan gambar di bawah ini. Jika segiempat ABCD sebangun dengan segiempat DEFG, maka panjang BC adalah ....""", 0),
            Pair("""9. Sebuah tempat air berbentuk tabung dengan panjang jari-jari alas 140 cm dan tinggi 1 meter. Jika ditentukan , maka volume tempat air itu adalah…
""", 0)),

        listOf(Pair("""10. Selembar seng akan dibuat tabung tanpa tutup. Jika volume yang diharapkan sebesar 2.310 cm3 dengan jari-jari 7 cm (), 
maka luas seng yang diperlukan adalah …
""", 0),
            Pair("""11. Perhatikan gambar di atas. Jika panjang BC = CD = 8 cm dan DE = 9 cm, maka panjang AD adalah..
""", 0),
            Pair("""12.  Luas permukaan sebuah kerucut diketahui 200 cm2. Jika panjang jari-jari alasnya 8 cm, maka volume kerucut tersebut adalah…
""", 0)),

        listOf(Pair("""13. Suatu kerucut dibentuk dengan jari-jari 8 cm, tinggi 15 cm, dan  = 3,14. Luas seluruh permukaan kerucut tersebut adalah…
""", 0),
            Pair("""14. Jika a =14 cm dan b = 12 cm, maka volume bangun tersebut adalah…  
""", 0),
            Pair("""15. Sebuah drum berbentuk tabung dengan panjang diameter 140 cm dan tingginya 60 cm berisi penuh dengan minyak tanah, maka volume drum adalah…liter
""", 0)),

        listOf(Pair("""16. Bola yang memiliki luas permukaan 2.464 cm2 memiliki jari-jari sepanjang… ( )
""", 0),
            Pair("""17. Sebuah pabrik akan memproduksi 250 buah bola pingpong. Bola pingpong tersebut berdiameter 4 cm (π = 3,14) 
dan memerlukan biaya produksi sebesar Rp18.840.000,00, harga bahan bola pingpong tersebut per cm2-nya adalah .... 
""", 0),
            Pair("""18. Diketahui bangun setengah bola padat memiliki jari-jari 10 cm. Luas permukaan bangun tersebut adalah...""", 0)),

        listOf(Pair("""19. Tinggi tabung yang berjari-jari 14 cm dan memiliki luas selimut 1.056 cm2 adalah…
""", 0),
            Pair("""20. Sebuah tempat es krim yang berbentuk kerucut memiliki diameter 5 cm dan tinggi 12 cm. 
Banyak es krim yang diperlukan untuk mengisi tempat tersebut sampai penuh adalah .... 
""", 0),
            Pair("""21. Nilai rata-rata tes matematika 15 siswa adalah 6,6. Bila nilai Dinda disertakan, maka nilai rata-rata menjadi 6,7. 
Nilai Dinda dalam tes matematika tersebut adalah...
""", 0)),

        listOf(Pair("""22. Tabel berikut adalah data hasil ulangan matematika siswa kelas 9B MTsN Lawang
Banyak siswa yang memperoleh nilai lebih dari rata-rata adalah…
""", 0),
            Pair("""23. Modus nilai ulangan matematika siswa kelas 9B pada tabel di atas adalah…
""", 0),
            Pair("""24. Perhatikan tabel di bawah ini:
Jika nilai rata-rata ulangan Matematika dari data di atas adalah 60,5 maka nilai p adalah …
""", 0)),

        listOf(Pair("""25. Median dari 7, 5, 8, 6, 6, 8, 5, 9, 8, 10, 9, 7 adalah…
""", 0),
            Pair("""26. Diagram brkt menggambarkan tentang 4 pelajaran UN yang disukai sekelompok siswa. 
Perbandingan jumlah siswa yang menyukai matematika dan IPA 3 : 2. Jika banyak siswa dalam kelompok tersebut 420 siswa, 
maka banyak siswa yang menyukai pelajaran IPA…
""", 0),
            Pair("""27. Perhatikan tabel distribusi frekuensi berikut
Median dari data tersebut adalah ....
""", 0)),

        listOf(Pair("""28. Dari suatu catatan penjual toko keramik pada suatu tahun, setiap bulannya berturut-turut terjual sebanyak 1.750 buah, 
 2.250 buah, 2.500 buah, 2.200 buah, 2.000 buah, 2.000 buah, dan 2.750 buah. Modus data itu adalah ...
""", 0),
            Pair("""29. Diagram batang berikut menunjukan nilai ulangan matematika beberapa siswa Kelas IX. 
Dari data tersebut,modusnya adalah...
""", 0),
            Pair("""30. Dalam sebuah kelas, diketahui nilai rata-rata kelompok putri adalah 7,5 sedangkan kelompok putra adalah 6,7. 
Jika nilai rata-rata kelas 6,9 maka perbandingan banyak siswa putra dan putri dalam kelas itu adalah…
""", 0)),

        listOf(Pair("""31. Nilai dari 5/2⁰ adalah ...""", 0),
            Pair("""32. Bentuk sederhana dari (q³)³ x (q⁴)⁵ adalah ...""", 0),
            Pair("""33. Hasil dari (1/3)⁻³ x (1/3)⁵ adalah ...""", 0)),

        listOf(Pair("""34. NIlai dari ⁴√25 adalah ...""", 0),
            Pair("""35. Nilai dari √75 - √12 + √48 adalah ...""", 0),
            Pair("""36. Hasil 2√6 x ⁴√36 adalah ...""", 0)),

        listOf(Pair("""37. Bentuk baku dari (2,7 x 10⁷)/(3 x 10³) adalah ...""", 0),
            Pair("""38. Hasil (2√3 + √5)² adalah ...""", 0),
            Pair("""39. Bentuk rasional 2/(3 - √7) adalah ...""", 0)),

        listOf(Pair("""40. Jika 2⁵ⁿ⁻¹³ = 1/8, nilai n yang memenuhi adalah ...""", 0),
            Pair("""41. Bentuk baku dari 0,00001956 adalah ...""", 0),
            Pair("""42. Sebuah bintang berjarak tiga tahun cahaya dari bumi. JIka satu tahun cahaya = 9,46 x 10¹² km,jarak antara bumi dan bintang tersebut adalah ...""", 0)),

        listOf(Pair("""43. Nilai dari √15(√6 + √24) adalah ...""", 0),
            Pair("""44. Bentuk sederhana dari (4a²b³/6ab⁵)⁻¹ adalah ...""", 0),
            Pair("""45. Sebuah persegi panjang mempunyai ukuran panjang 15√7/√3 cm dan lebar 36/√21 cm. Luas persegi panjang tersebut adalah ...""", 0)),

        listOf(Pair("""46. Hasil pemfaktoran dari persamaan kuadrat x² + 17x – 38 = 0 adalah ...""", 0),
            Pair("""47. Himpunan penyelesaian 3x² + 4x – 7 = 0, x merupakan bilangan real (R) adalah ...""", 0),
            Pair("""48. Akar-akar dari persamaan kuadrat (x + 2)² = 9 adalah ...""", 0)),

        listOf(Pair("""49. Persamaan kuadrat yang akar-akarnya 2 dan -1 adalah
""", 0),
            Pair("""50. Jika x = -7 adalah akar persamaan kuadrat x² + 8x + b = 0 maka nilai b adalah ...""", 0),
            Pair("""51. Nilai deskriminan persamaan kuadrat x² - 3x - 5 = 0 adalah ...""", 0)),

        listOf(Pair("""52. Sifat dari persamaan kuadrat x² + 6x + 9 = 0 adalah ...""", 0),
            Pair("""53. Jika nilai deskriminan persamaan kuadrat ax² - 4x + 1 = 0 adalah 8, maka nilai a adalah ...""", 0),
            Pair("""54. Salah satu akar persamaan kuadrat 3x² + px – 4 = 0 adalah -4/3 Maka akar yang lain adalah ...""", 0)),

        listOf(Pair("""55. Bila x₁ dan x₂ akar-akar persamaan -2x² + 3x - 1 = 0 maka x₁² + x₂² adalah ...""", 0),
            Pair("""56. Diketahui dua bilangan, yaitu a dan b. Jika jumlah kedua bilangan tersebut dibagi oleh selisihnya, hasilnya adalah 3 dengan sisa 2. Jika hasil kali kedua bilangan tersebut adalah 45, kedua bilangan yang dimaksud adalah ...""", 0),
            Pair("""57. Persamaan kuadrat x² - 8x + p = 0 mempunyai satu akar real. Nilai p yang memenuhi adalah ...""", 0)),

        listOf(Pair("""58. Diketahui persamaan kuadrat x² - x - 110 = 0 dengan akar-akar p dan q. Jika p > 0, nilai 2p - q = ...""", 0),
            Pair("""59. Diketahui p dan q adalah akar-akar persamaan kuadrat 2x² - 3x + 5 = 0. Persamaan kuadrat yang akar-akarnya -1/p dan -1/q adalah ...""", 0),
            Pair("""60. Hasil kali berat Adi dan Beni adalah 1400 kg. Berat Beni 5 kg lebihnya dari berat badan Adi. Jumlah berat badan mereka adalah ...""", 0)),

        listOf(Pair("""61. Hasil dari –25 x (8 + (–9)) : (2 – 7) adalah ...""", 0),
            Pair("""62. Hasil dari adalah ...""", 0),
            Pair("""63. Suhu didalam kulkas sebelum dihidupkan 250C. Setelah dihidupkan selama 4 jam suhunya menjadi –90C. 
perbedaan suhu kulkas sebelum dan setelah dihidupkan adalah ....
""", 0)),

        listOf(Pair("""64. Panitia kegiatan sosial menerima sumbangan gula pasir beratnya 21 kg dan 23 kg untukd ibagikan kepada sekelompok warga. 
setiap warga menerima 2 kg. Berapa banyak warga yangmenerima gula pasir tersebut ?
""", 0),
            Pair("""65. Hasil dari adalah ...""", 0),
            Pair("""66.Bentuk sederhana adalah...""", 0)),

        listOf(Pair("""67. Tiga suku berikutnya dari 1, 5, 11, 19,.... adalah?""", 0),
            Pair("""68. Perhatikan gambar berpola berikut :
jika pola diatas dilanjutkan, banyak bulatan pada pola ke-61 adalah ......
""", 0),
            Pair("""69. Jumlah semua bilangan kelipatan 3 dan 4 antara 200 dan 450 adalah ...""", 0)),

        listOf(Pair("""70 . Toko elektronik “CINTA PRODUK INDONESIA” menjual televisi dan memperoleh keuntungan 25%.
jika harga beli televisi tersebut Rp 3.600.000,00 maka harga jualnya adalah:
""", 0),
            Pair("""71 . Diana menabung uang di bank sebesar Rp 8.000.000,00.setelah 8 bulan uangnya diambil seluruhnya berjumlah Rp 8.800.000,00.
berapakah persentase suku bunga tabungan yang diberikan bank tersebut?
""", 0),
            Pair("""72 . Tina memiliki pita sepanjang 1,5 meter dan Neni memiliki pita 4.500 cm.perbandingan pita Tina dan Neni adalah ...
""", 0)),

        listOf(Pair("""73 . Perbandingan uang Verrel, Salfa dan Mahesa 4:3:2. Jika jumlah uang Verrel dan uang Salfa Rp 42.000,00, maka jumlah uang mereka bertiga adalah ...
""", 0),
            Pair("""74 . Sebuah peta mempunyai skala 1 : 2.500.000. Pada peta tersebut jarak :
kota A ke kota P = 3 cm
kota P ke kota B = 6 cm
kota A ke kota Q = 3 cm
kota Q ke kota B = 4 cm
adi berkendara dari kota A ke kota B melalui kota P dan Ali berkendara dari kota A ke kota B melalui kota Q
Berapakah selisih jarak tempuh yang dilalui Ali dan Adi ?
""", 0),
            Pair("""75 . Bentuk sederhana dari 5ab + 4 bc – 3ac – 2ac – 8bc –ab adalah ...
""", 0)),

        listOf(Pair("""76 . Jika k merupakan penyelesaian 2(3x – 5) +3 = 3(4x + 2 ) – 1, maka nilai 3k+5 adalah ...
""", 0),
            Pair("""77 . Taman bunga berbentuk persegi panjang dengan ukuran panjang (8x +2) meter dan ukuran lebarnya (6x – 16) meter. 
Jika keliling taman tidak kurang dari 140 meter, maka panjang taman tersebut (P) adalah ...
""", 0),
            Pair("""78 . Diketahui himpunan K = {1 < x ≤ 11, x ∈ bilangan ganjil}.banyaknya himpunan bagian dari K yang memiliki 3 anggota adalah ...
""", 0)),

        listOf(Pair("""79 . Diketahui himpunan :
semesta S adalah himpunan bilangan cacah kurangdari 20.
a adalah himpunan bilangan prima antara 3 dan 20.
b adalah himpunan bilangan asli antara 2 dan 15.
komplemen dari A ∩ B adalah ...
""", 0),
            Pair("""80 . Wawancara dari 40 orang pembaca majalah diketahui 5 orang suka membaca tentang politik dan olahraga, 
9 orang yang tidak menyukai keduanya. Banyak pembaca yang menyukai majalah olahraga sama dengan dua kali banyak pembaca yang menyukai majalah politik. 
Banyak pembaca yang menyukai majalah politik adalah ...
""", 0),
            Pair("""81 . Perhatikan diagram panah !
rumus fungsi dari P ke Q adalah ...
""", 0)),

        listOf(Pair("""82 . Diketahui rumus fungsi f(x)= 2x - 3, Jika f(m) = 5 dan f(–2)= n, nilai dari m + n adalah ...
""", 0),
            Pair("""83 . Gradien garis yang tegak lurus terhadap garis a adalah ...
""", 0),
            Pair("""84 . Perhatikan garis g pada koordinat Cartesius.
garis k tegak lurus dengan garis g dan saling berpotongan di titik (0,–20). Koordinat titik potong garis k pada sumbu x adalah...
""", 0)),

        listOf(Pair("""85 . Keliling lapangan berbentuk persegipanjang 58 meter. Jika selisih antara panjang dan lebarlapangan 9 meter. 
Luas lapangan tersebut adalah ...
""", 0),
            Pair("""86 . Perhatikan gambar berikut :
pasangan sudut luar sepihak adalah ...
""", 0),
            Pair("""87 . Perhatikan gambar !
luas karton yang digunakan untuk membuat bangun huruf E
adalah ...
""", 0)),

        listOf(Pair("""88 . Perhatikan gambar bangun yang terdiri dari jajargenjang dan segitiga siku siku !
keliling bangun tersebut adalah ...
""", 0),
            Pair("""89 . Seorang pengamat berada di atas sebuah mercusuar yang memiliki ketinggian 12 meter.
ia melihat kapal A dan kapal B yang berlayar dilaut.
jarak pengamat ke kapal A dan ke kapal B berturut turut 20 meter dan 13 meter.
posisi kapal A, kapal B dan kaki mercusuar terletak segaris.
jarak antara kapal A dan kapal B adalah ...
""", 0),
            Pair("""90 . Perhatikan gambar !
titik O adalah titik pusat lingkaran. Garis AC adalah diameter.
besar sudut ADB adalah ...
""", 0)),

        listOf(Pair("""91 . Sebuah prisma mempunyai 36 rusuk dan 14 sisi. Bentuk alas prisma tersebut ...
""", 0),
            Pair("""92 . Pak Budi memiliki kawat panjangnya 10 meter yang akan digunakan sebagai empat kerangka bangun ruang seperti dibawah ini:
sisa kawat yang dimiliki Pak Budi adalah ...
""", 0),
            Pair("""93 . Dua segitiga dibawah ini adalah kongruen !
pasangan sisi yang sama panjang adalah ...
""", 0)),

        listOf(Pair("""94 . Perhatikan gambar !
diketahui AB = BC = CD = 18 cm.
panjang BF adalah ...
""", 0),
            Pair("""95 . Sebuah tabung berdiameter 14 cm dengan tinggi 34 cm.
luas seluruh permukaan tabung adalah ...
""", 0),
            Pair("""96 . Perhatikan data berat badan dalam kg dari 16 siswa berikut :
63, 58, 46, 57, 64, 52, 60, 46, 54, 55, 58, 65, 46, 46, 62, 56....
median dari data tersebut adalah ...
""", 0)),

        listOf(Pair("""97 . Rata rata tinggi badan 32 siswa 170,5. Jika satu siswa yang memiliki tinggi badan 154 disertakan,
rata rata tinggi badan seluruhnya adalah ...
""", 0),
            Pair("""98 . Diagram berikut menyatakan kegemaran siswa “SMP RARUNA”.
jika banyak siswa yang gemar voli 54 orang, banyak siswa yang gemar futsal adalah ...
""", 0),
            Pair("""99 . Buku Matematika SMP/MTs Kelas IX Semester 1 terdiri dari 6 Bab yang semuanya berjumlah 170 halaman dengan rincian :
judul dan Katalog = 2 halaman, Penjelasan Buku = 1 halaman, KataSambutan = 1 halaman, Kata Pengantar = 1 halaman,
daftar isi = 1 halaman, Kunci Jawaban = 1 halaman,Daftar Simbol = 1 halaman, Glosarium = 1 halaman,
indeks = 2 halaman, Daftar Pustaka = 1 halaman, Tes Kemampuan = 4 halaman, yang masing masing Bab, jumlah halamanya disajikan dalam diagram disamping
Banyak halaman pada bab IV adalah ...
""", 0)),

        listOf(Pair("""100. Dalam kantong terdapat tiga bola berwarna merah diberi nomor 1 sampai 3, lima bola berwarna kuning diberi nomor 4 sampai 8,
dan empat bola berwarna hijau diberi nomor 9 sampai 12.Tiga bola diambil satu persatu secara acak dari dalam kantong.
pengambilan pertama muncul bola merah bernomor genap dan tidak dikembalikan.
pengambilan kedua muncul bola hijau bernomor prima dan tidak dikembalikan.
peluang terambil bernomor ganjil pada pengambilan ketiga adalah ...
""", 0),
            Pair("""101. Hasil dari 64⅔ adalah….
""", 0),
            Pair("""102. Hasil dari 10−³ adalah ….
""", 0)),

        listOf(Pair("""103. Hasil  dari (2³)⁵ : (2⁴)⁴  adalah ….
""", 0),
            Pair("""104. Hasil  dari 3-² + 3-¹ adalah...""", 0),
            Pair("""105. Hasil dari 2√18-√50+√72 adalah...  """, 0)),

        listOf(Pair("""106. Hasil dari √12 x √6 adalah...""", 0),
            Pair("""107. Hasil dari  adalah … .
""", 0),
            Pair("""108. Jika salah satu akar dari persamaan kuadrat x²-4x + c =0 adalah 2,maka nilai c yang memenuhi persamaan itu adalah...""", 0)),

        listOf(Pair("""109. jika akar-akar persamaan kuadrat x² -3x -10 = 0 adalah X1 dan X2, maka hasil dari X1 + X2 sama dengan....""", 0),
            Pair("""110. Selisih tiga kali kuadrat suatu bilangan dengan tiga belas kali bilangan itu sama dengan negatif 4. Maka bilangan tersebut adalah ….
""", 0),
            Pair("""111.  Bentuk kuadrat sempurna dari x² - 6x - 7 = 0 adalah....""", 0)),

        listOf(Pair("""112. Jenis akar akar dari persamaan x²-4x+4=0 adalah ...""", 0),
            Pair("""113. Kuadrat suatu bilangan dikurangi empat kali bilangan itu sama dengan –3. Tentukan bilangan adalah….
""", 0),
            Pair("""114. Persamaan kuadrat yang akar-akarnya –2 dan 3 adalah ….
""", 0)),

        listOf(Pair("""115.  y = -8x² -16x-1, sumbu simetri fungsi tersebut adalah …
""", 0),
            Pair("""116. y = -6x² + 24 x - 19, nilai optimum fungsi tersebut adalah …
""", 0),
            Pair("""117. Fungsi y = 2x² + 6x – c mempunyai nilai minimum 3, maka nilai c adalah 
""", 0)),

        listOf(Pair("""118. Fungsi kuadrat yang grafiknya memotong sumbu-X pada koordinat (–2, 0) dan memiliki titik puncak pada koordinat (2, –16) adalah ….
""", 0),
            Pair("""119. Fungsi kuadrat yang grafiknya memotong sumbu-Y pada koordinat (0, 4), melalui titik koordinat (–1, –1) dan memiliki sumbu simetri x = 2 adalah …
""", 0),
            Pair("""120. Jumlah  dua  bilangan  adalah  30.  Jika  hasil  kali  kedua  bilangan  menghasilkan  nilai  yang maksimum, 
misalkan dua bilangan tersebut adalah a, b maka kedua bilangan tersebut adalah ….
""", 0)),

        listOf(Pair("""	
121. Selisih dua bilangan adalah 10. Jika hasil kali kedua bilangan menghasilkan nilai yang minimum, 
misalkan dua bilangan tersebut adalah x, y dengan x > y maka kedua bilangan tersebut adalah …..
""", 0),
            Pair("""122. ΔPQR yang berkoordinat di P (2, –3),Q (4, 5), dan R (–4, 6) direfleksikan terhadap sumbu-y. Koordinat bayangan ΔPQR adalah ....""", 0),
            Pair("""123. Segiempat ABCD dengan A (–1, –2), B (2, –3), C (6, 3), dan D (–4, 2) direfleksikan terhadap garis y = x. Koordinat bayangan segiempat ABCD adalah ....""", 0)),

        listOf(Pair("""124. Diketahui titik sudut sebuah segitiga yaitu S (–2, –1), T (–1, –4), dan U (–4, –1)
Bayangan hasil translasi Segitiga STU dengan translasi (x – 2, y + 5) adalah ….
""", 0),
            Pair("""125. Diketahui segiempat KLMN dengan koordinat titik sudut di K (2, 5), L (–3, 4), M (4, 3) dan N (4,–2)
Bayangan hasil ditranslasi 3 satuan ke kanan dan 5 satuan ke bawah adalah….
""", 0),
            Pair("""126. Diketahui garis AB berkoordinat di A (2, 5) dan B (–3, –1)
bayangan garis AB setelah dilakukan rotasi 1800 berlawanan arah jarum jam dan berpusat di titik asal adalah ….
""", 0)),

        listOf(Pair("""127. Diketahui titik sudut dari bangun datar P (3, –2), Q (–4, –5), R (–4, 3) dan S (3, 4)
dirotasikan 900 searah jarum jam dan berpusat di titik asal. Koordinat bayangan bangun datar adalah …. 
""", 0),
            Pair("""128. ΔXYZ yang berkoordinat di X (2, –2), Y (–2, 5), dan Z (4, 2)
koordinat bayangan hasil dilatasi dengan faktor skala k = 3 (pusat dilatasi titik asal) adalah ….
""", 0),
            Pair("""129. Perhatikan gambar 
panjang SQ adalah ....
""", 0)),

        listOf(Pair("""130. Perhatikan gambar 
jika segitiga ABC dan DEF kongruen, sisi yang sama panjang adalah .... 
""", 0),
            Pair("""131. Perhatikan gambar 
Panjang PQ adalah ....
""", 0),
            Pair("""132. Perhatikan gambar 
segitiga ABC kongruen dengan segitiga BDE karena memenuhi syarat adalah ….
""", 0)),

        listOf(Pair("""133. Perhatikan gambar 
kedua persegipanjang ABCD dan persegipanjang PQRS tersebut adalah sebangun. Panjang PQ adalah ….
""", 0),
            Pair("""134. Perhatikan gambar 
nilai x + y = ....
""", 0),
            Pair("""135. Perhatikan gambar
panjang DE adalah ….
""", 0)),

        listOf(Pair("""136. Perhatikan pecahan berikut:
⅔, ³∕₇, ⁵∕₆, ¹¹∕₁₃  urutan pecahan dari yang terkecil ke yang terbesar adalah
""", 0),
            Pair("""137. Hasil dari 47 – 12 : (- 6) x (-2) + (-20) adalah...""", 0),
            Pair("""138. Ibu membeli kain 3,75m² . ²∕₅ dibuat baju dan ⅔ dari sisanya dibuat rok. Kain ibu yg tersisa.... M² ?""", 0)),

        listOf(Pair("""139. Bentuk Sederhana dari 6/4 - 3√2 adalah...""", 0),
            Pair("""140. Hasil dari gambar di bawah adalah...""", 0),
            Pair("""141. Sebuah asrama memiliki penghuni sebanyak 30 orang. persediaan makanan yang ada di perkirakan akan habis selama 8 hari. 
karena ada tambahan 10 orang penghuni, berapa hari persediaan makanan akan habis?
""", 0)),

        listOf(Pair("""142. Fahri dan Andi akan mengecat tembok rumah. Fahri dapat mengecat tembok tersebut selama 20 hari, sementara Andi dalam waktu 30 hari. 
seandainya Fahri dan Andi bekerjasama, pekerjaan tersebut akan selesai dalam waktu ....
""", 0),
            Pair("""143. Seutas tali dipotong menjadi 5 bagian dan masing-masing-masing potongan membentuk deret geometri. 
jika panjang tali yang pendek 4 cm dan yang terpanjang 324 cm, panjang tali mula-mula?
""", 0),
            Pair("""144. Diketahui himpunan Q = {bilangan prima kurang dari 15}. Banyak himpunan dari Q yang memiliki 2 anggota adalah ....""", 0)),

        listOf(Pair("""145. seorang pengusaha membeli sebidang tanah, sebuah rumah dan sebuah ruko dengan harga total 500 juta 
1 tahun kemydian pemilik tersebut menjual tanahnya seharga 200 juta dan ruko seharga 300 juta 
jika pengusaha itu untung 20% berapa rupiah rumah itu terjual..
""", 0),
            Pair("""146. Sebuah kelas yang terdiri dari 40 siswa, diperoleh data 30 siswa pernah berkunjung ke Ancol dan 25 siswa pernah berkunjung ke Taman Mini. 
jika 10 siswa tidak pernah berkunjung ke Ancol maupun ke Taman Mini, banyaknya anak yang berkunjung ke kedua tempat tersebut adalah ....
""", 0),
            Pair("""147. Hasil dari 2(4x − 5) − 5x + 7 adalah ….
""", 0)),

        listOf(Pair("""148. Suatu persegi panjang mempunyai panjang (2x + 5) cm dan lebar 20 cm. Jika keliling dari persegi panjang tersebut 110 cm, maka nilai x adalah .... cm?""", 0),
            Pair("""149. Ali berusia 3 tahun lebih tua dari Budi, jumlah usia mereka kurang dari 15 tahun. Usia Budi sekarang adalah ....""", 0),
            Pair("""150. Suatu fungsi f dirumuskan sebagai f(x) = 3x – 2 dengan daerah asal adalah A = {-2, -1, 0, 1, 2} maka daerah hasil dari fungsi tersebut adalah ....""", 0))

    )
    private  val pilihanGanda9: List<List<List<String>>> = listOf(
        listOf(
            listOf("a. 12 m            ","b. 16 m        ","c. 24 m        ","d. 54 m  "),
            listOf("a. 1 dan 3    ","b. 2 dan 3          ","c. 3 dan 4        ","d. 2 dan 4"),
            listOf("a. 6,7 cm ","b. 5,0 cm ","c. 4,1 cm ","d. 3,8 cm ")
        ),
        listOf(
            listOf("a. 17 m","b. 19 m","c. 26 m","d. 34 m"),
            listOf("a. AB dan PR                ","b. AC dan PQ      ","c. BC dan PR","d. BC dan PQ"),
            listOf("a. dua segitiga sama dan sebangun jika ketiga sisinya sama","b. dua segitiga sama dan sebangun jika dua buah sisinya sama dan sudut apit sisi itu sama","c. dua segitiga sama dan sebangun jika satu sisinya sama, sudut pada sisi itu dan sudut dihadapan sisi itu sama","d. dua segitiga sama dan sebangun jika satu sisinya dan salah satu sudutnya boleh tidak sama")
        ),
        listOf(
            listOf("a. 285 cm2                      ","b. 528 cm2              ","c. 582 cm2    ","d. 825 cm2"),
            listOf("a. 8 cm                ","b. 9 cm            ","c. 10 cm      ","d. 12 cm"),
            listOf("a. 61.600 liter              ","b. 6.160 liter  ","c. 616 liter  ","d. 61,6 liter")
        ),
        listOf(
            listOf("a.  484 cm2               ","b.  660 cm2             ","c.  814 cm2","d.  964 cm2  "),
            listOf("a.  10 cm                     ","b.  12 cm             ","c.  15 cm","d.  17 cm"),
            listOf("a.  200cm3                ","b.  320 cm3   ","c.  640  cm3","d.  960  ")
        ),
        listOf(
            listOf("a.  285 cm2               ","b.  582 cm2               ","c.  628 cm2","d.  826 cm2"),
            listOf("a.  168cm3","b.  240  cm3","c.  278cm3    ","d.  360 cm3"),
            listOf("a. 924 liter              ","b. 9240 liter  ","c. 92400 liter","d. 924000 liter")
        ),
        listOf(
            listOf("a. 10 cm           ","b. 14 cm       ","c. 21 cm        ","d. 28 cm"),
            listOf("a. Rp1.000,00                         ","b. Rp1.500,00","c. Rp 2.000,00 ","d. Rp 2.500,00 "),
            listOf("a. 942 cm2                        ","b. 853 cm2 ","c. 628 cm2 ","d. 314 cm2 ")
        ),
        listOf(
            listOf("a. 36 cm           ","b. 24 cm         ","c. 12 cm         ","d. 10 cm "),
            listOf("a. 60 cm3                              ","b. 314 cm3    ","c. 471 cm3 ","d. 942 cm3 "),
            listOf("a. 7,6         ","b. 7,8                ","c. 8,2               ","d. 8,4")
        ),
        listOf(
            listOf("a. 8 orang                       ","b. 12 orang ","c. 15 orang","d. 22 orang"),
            listOf("a. 10           ","b. 9                  ","c. 8                ","d. 6  "),
            listOf("a. 5          ","b. 6               ","c. 7              ","d. 8      ")
        ),
        listOf(
            listOf("a. 6         ","b. 6,5                ","c. 7                ","d. 7,5"),
            listOf("a. 70 orang                        ","b. 105 orang                ","c. 140 orang","d. 210 orang"),
            listOf("a. 5                 ","b. 6                ","c. 7               ","d. 8")
        ),
        listOf(
            listOf("a. 1.750              ","b. 2.500              ","c. 2.250      ","d. 2.000"),
            listOf("a. 4        ","b. 6              ","c. 8,5                ","d. 18,2"),
            listOf("a. 1 : 3          ","b. 2 : 3       ","c. 3 : 2               ","d. 3 : 1")
        ),
        listOf(
            listOf("a. 0","b. 1","c. 0,5","d. 5"),
            listOf("a. q²⁷","b. q²⁸","c. q²⁹","d. q³⁰"),
            listOf("a. -1/3","b. 1/9","c. 1/3","d. 1")
        ),
        listOf(
            listOf("a. √5","b. √15","c. 25","d. 125"),
            listOf("a. 7√3","b. -7√3","c. √15","d. √39"),
            listOf("a. 2","b. 6","c. 12","d. 16")
        ),
        listOf(
            listOf("a. 9 x 10²","b. 9 x 10³","c. 0,9 x 10²","d. 0,9 x 10³"),
            listOf("a. 11 + 2√15","b. 11 + 4√15","c. 17 + 2√15","d. 17 + 4√15"),
            listOf("a. 3 - √7","b. 2(3 - √7)","c. 3 + √7","d. 2(3 + √7)")
        ),
        listOf(
            listOf("a. 7","b. 2","c. -2","d. -7"),
            listOf("a. 1,956 x 10⁻²","b. 1,956 x 10⁻³","c. 1,956 x 10⁻⁴","d. 1,956 x 10⁻⁵"),
            listOf("a. 2,838 x 10¹³ km","b. 2,838 x 10¹³ km","c. 2,838 x 10²⁴ km","d. 2,838 x 10³⁶ km")
        ),
        listOf(
            listOf("a. 12√10","b. 9√10","c. 8√6","d. 4√6"),
            listOf("a. 2ab²/3","b. 3b²/2a","c. 2a/3b²","d. 2b²/3a"),
            listOf("a. 180 cm²","b. 210 cm²","c. 180 √3 cm²","d. 180 √7 cm²")
        ),
        listOf(
            listOf("a. (x – 2) (x + 19) = 0","b. (x + 2) (x + 19) = 0","c. (x – 3) (x – 35) = 0","d. (x – 3) (x + 35) = 0"),
            listOf("a. {1, 7/3}","b. {-7/3, 1}","c. {-1, 7/3}","d. {-7/3, -1}"),
            listOf("a. x = 1 atau x = 5","b. x = -1 atau x = 5","c. x = 1 atau x = - 5","d. x = -1 atau x = -5.")
        ),
        listOf(
            listOf("a. x² + x + 2 = 0","b. x² + x - 2 = 0","c. x² - x + 2 = 0","d. x² - x - 2 = 0"),
            listOf("a. 6","b. 7","c. 8","d. 9"),
            listOf("a. 29","b. 11","c. - 11","d. - 29")
        ),
        listOf(
            listOf("a. Akar-akarnya sama","b. Akar-akarnya imajiner","c. Akar-akarnya bilangan bulat dan berbeda","d. Akar-akarnya berlawanan"),
            listOf("a. - 2","b. - 1","c. 1","d. 2"),
            listOf("a. 7","b. 1","c. -1","d. -7")
        ),
        listOf(
            listOf("a. 1/4","b. 1/5","c. 4/5","d. 5/4"),
            listOf("a. 3 dan 15","b. –3 dan –15","c. 5 dan 9","d. –5 dan –9"),
            listOf("a. -16","b. -2","c. 2","d. 16")
        ),
        listOf(
            listOf("a. 12","b. 21","c. 32","d. 44"),
            listOf("a. 5x² + 3x + 2 = 0","b. 5x² - 3x + 2 = 0","c. 5x² + 3x - 2 = 0","d. 5x² - 3x - 2 = 0"),
            listOf("a. 160 kg","b. 125 kg","c. 90 kg","d. 75 kg")
        ),
        listOf(
            listOf("a. -5","b. – 3","c. 2","d. 5"),
            listOf("a. ","b. ","c. ","d. "),
            listOf("a. – 340C","b. – 160C","c. 160C","d. 340C")
        ),
        listOf(
            listOf("a. 21 orang","b. 20 orang","c. 18 orang","d. 15 orang"),
            listOf("a. ","b.","c.","d."),
            listOf("a. 2√12","b. 5√4","c. 6√10","d. 2√3")
        ),
        listOf(
            listOf("a. 29, 42, 56","b. 29, 41, 55","c. 29, 40, 52","d. 29, 39, 49"),
            listOf("a. 249","b. 241","c. 66","d. 64"),
            listOf("a. 8.700","b. 6.804","c. 6.360","d. 6.300")
        ),
        listOf(
            listOf("a. Rp 3.800.000,00","b. Rp 4.000.000,00","c. Rp 4.250.000,00","d. Rp 4.500.000,00"),
            listOf("a. 10%","b. 12%","c. 15%","d. 18%"),
            listOf("a. 1 : 45","b. 1 : 30","c. 1 : 3","d. 1 : 2")
        ),
        listOf(
            listOf("a. Rp 54.000,00","b. Rp 58.000,00","c. Rp 60.000,00","d. Rp 62.000,00"),
            listOf("a. 75 km","b. 50 km","c. 25 km","d. 5 km"),
            listOf("a. 4ab – 4bc – 5ac","b. 4ab + 2bc – 11ac","c. 6ab + 2bc – 5ac","d. 6ab – 4bc + ac")
        ),
        listOf(
            listOf("a. 2","b. 1","c. -1","d. – 2"),
            listOf("a. P > 50","b. P ≥ 50","c. P > 90","d. P ≥ 90"),
            listOf("a. 4","b. 10","c. 20","d. 35")
        ),
        listOf(
            listOf("a. { 0, 1, 2, 5, 7, 11, 13, 15, 16, 18 }","b. { 3, 4, 6, 8, 9, 10, 12, 14, 17, 19 }","c. { 3, 4, 6, 8, 9, 10, 12, 14, 15, 17, 19 }","d. { 0, 1, 2, 3, 4, 6, 8, 9, 10, 12, 14, 15, 16, 17, 18, 19 }"),
            listOf("a. 8 orang","b. 10 orang","c. 12 orang","d. 14 orang"),
            listOf("a. f(x) = 4(2x + 5)","b. f(x) = 3(2x + 9)","c. f(x) = 3(2x + 3)","d. f(x) =(6x +18)")
        ),
        listOf(
            listOf("a. 5","b. 2","c. -3","d. – 6"),
            listOf("a. - 3/2","b. – 2/3","c. 2/3","d. 3/2"),
            listOf("a. (8,0)","b. (12,0)","c. (16,0)","d. (20,0)")
        ),
        listOf(
            listOf("a. 95 m2","b. 190 m2","c. 261 m2","d. 522 m2"),
            listOf("a. ∠ 2 dan ∠ 5","b. ∠ 4 dan ∠ 8","c. ∠ 2 dan ∠ 7","d. ∠ 4 dan ∠ 5"),
            listOf("a. 1.448 cm2","b. 1.356 cm2","c. 1.224 cm2","d. 924 cm2")
        ),
        listOf(
            listOf("a. 0,7 meter","b. 1,1 meter","c. 1,2 meter","d. 1,5 meter"),
            listOf("a. 7 meter","b. 11 meter","c. 12 meter","d. 15 meter"),
            listOf("a. 370","b. 530","c. 740","d. 1060")
        ),
        listOf(
            listOf("a. Segi delapanbelas","b. Segi tigabelas","c. Segi duabelas","d. Segi delapan"),
            listOf("a. 5 cm","b. 10 cm","c. 15 cm","d. 20 cm"),
            listOf("a. AB dan EC","b. AD dan BE","c. AC dan CD","d. BC dan CD")
        ),
        listOf(
            listOf("a. 17 cm","b. 16 cm","c. 15 cm","d. 14 cm"),
            listOf("a. 4.224 cm2","b. 2.112 cm2","c. 1.804 cm2","d. 902 cm2"),
            listOf("a. 46,0","b. 50,0","c. 55,5","d. 56,5")
        ),
        listOf(
            listOf("a. 160 cm","b. 165 cm","c. 170 cm","d. 175 cm"),
            listOf("a. 86 orang","b. 84 orang","c. 83 orang","d. 81 orang"),
            listOf("a. 20","b. 22","c. 28","d. 32")
        ),
        listOf(
            listOf("a. 30%","b. 40%","c. 50%","d. 60%"),
            listOf("a. 8        ","b. 16  ","c. 32","d. 256"),
            listOf("a. −1.000                                     ","b. −30             ","c. 0,3","d. 0, 001")
        ),
        listOf(
            listOf("a. − 2                                               ","b. - ½","c.   ½","d.   2"),
            listOf("a. 1⁄27                        ","b. 1⁄3","c. 4/9","d. 5/9"),
            listOf("a. 7√2","b. 7√3","c. 12√2","d. 12√3")
        ),
        listOf(
            listOf("a. 6√3","b. 2√6","c. 4√3","d. 6√2 "),
            listOf("a. 3√2                                       ","b. 3√3                                ","c. 3√5","d. 3√6  "),
            listOf("a. c = 4      ","b. c = 2  ","c. c = –4    ","d. c = –6")
        ),
        listOf(
            listOf("a. x1 + x2 = 7                              ","b. x1 + x2 = 5   ","c. x1 + x2 = 3          ","d. x1 + x2 = - 2"),
            listOf("a. x = 1/3 atau x = 4                                ","b. x = 1/3 atau x = –4          ","c. x = 3 atau x = 9","d. x = –3 atau x = 9"),
            listOf("a. (x + 3)2 = 16                                        ","b. (x – 3)2 = 16","c. (x + 5)2 = 25","d. (x – 5)2 = 25")
        ),
        listOf(
            listOf("a. Real kembar                                       ","b. Real berbeda   ","c. Imaginer","d. Real berlawanan tanda"),
            listOf("a. x = 3 atau x = 1                                        ","b. x = –3 atau x = –1                            ","c. x = 4 atau x = 2","d. x = –4 atau x = –2"),
            listOf("a. x² − 2x − 6 = 0                                ","b. x²− x + 6 = 0                        ","c. x² − x − 6 = 0","d. x² + x − 6 = 0")
        ),
        listOf(
            listOf("a. –1                                                      ","b. –8                                  ","c. –16","d. 2"),
            listOf("a. –6                                               ","b. –19           ","c. 5","d. 24"),
            listOf("a.  − 6⁄4        ","b.  2⁄3","c.  2","d.  9⁄2")
        ),
        listOf(
            listOf("a. y = x² – 4x – 12       ","b. y = x² – 2x – 12   ","c. y = x² – 3x – 12","d. y = x² – 4x − 4"),
            listOf("a. f(x) = -x² + x + 4                 ","b. f(x) = -x² + 5x + 4          ","c. f(x) = -x² + x + 4","d. f(x) = -x² + 4x + 4"),
            listOf("a. b = 15, a = 15                                              ","b. b = 12, a = 18   ","c. b = 10, a = 20","d. b = 8, a = 22")
        ),
        listOf(
            listOf("a. y = –4, x = 6                                                 ","b. y = 4, x = 14                             ","c. y = –5, x = 5","d. y = 5, x = 15"),
            listOf("a. P' (–2, 3), Q' (–4, 5), dan R'(4, –6)               ","b. P' (–2, –3), Q' (-4, 5), dan R'(4, 6)         ","c. P' (–3, 2), Q' (5, 4), dan R'(6, –4)","d. P' (3, –2), Q' (–5, –4), dan R'(–6, 4)"),
            listOf("a. A' (–2, –1), B' (–3, 2), C' (3, 6), D' (2,–4)        ","b. A' (2, 1), B' (3, –2), C' (–3, –6), D' (–2,4)        ","c. A' (1, 2), B' (–2, 3), C' (–6, –3), D' (4, –2)","d. A' (–1, 2), B' (2, 3), C' (6, –3), D' (–4, –2)")
        ),
        listOf(
            listOf("a. S' (2, 1), T' (1, 4), dan U' (4, 1)                ","b. S' (–2, 1), T' (–1, 4), dan U' (–4, 1)  ","c. S' (4, –4), T' (3, –1), dan U' (6, –4) ","d. S' (–4, 4), T' (–3, 1), dan U' (–6, 4)"),
            listOf("a. K' (–2, –5), L' (3, –4), M' (–4, –3), N' (–4, 2) ","b. K' (–2, 5), L' (–3, 4), M' (–4, 3), N' (–4, –2)  ","c. K' (5, 0), L' (0, –1), M' (7, –2) dan N' (7, –7)","d. K' (–5, 0), L' (0, 1), M' (–7, 2) dan N' (–7, 7)"),
            listOf("a. A' (–2, –5) dan B' (3, 1)                       ","b. A' (–2, 5) dan B' (–3, 1)                 ","c. A' (–5, –2) dan B' (1, 3) ","d. A' (5, 2) dan B' (–1, –3)")
        ),
        listOf(
            listOf("a. P' (–2, 3), Q' (–5, –4), R' (3, –4), S' (4, 3) ","b. P' (–2, –3), Q' (–5, 4), R' (3, 4), S' (4, –3)     ","c. P' (–3, 2), Q' (4, 5), R' (4, –3), S' (–3, –4)","d. P' (–3, –2), Q' (–4, 5), R' (4, 3), S' (3, –4)"),
            listOf("a. X' (6, –2), Y' (–6, –5), dan Z' (12, 2)                   ","b. X' (2, – 6), Y' (–2, 15), dan Z' (4, 6)              ","c. X' (–6, 6), Y' (6, –15), dan Z' (–12, –6)","d. X' (6, –6), Y' (–6, 15), dan Z' (12, 6)"),
            listOf("a. 1 cm                                ","b. 2 cm ","c. 3 cm","d. 4 cm")
        ),
        listOf(
            listOf("a. AC=EF                              ","b. AB=DE  ","c. BC=EF","d. BC=DE"),
            listOf("a. 4 cm                            ","b. 6 cm   ","c. 8 cm","d. 10 cm  "),
            listOf("a. Sisi, sisi, sisi                        ","b. Sisi, sudut, sisi ","c. Sudut, sisi, sudut","d. Sudut, sudut, sudut")
        ),
        listOf(
            listOf("a. 18 cm","b. 20 cm","c. 22 cm       ","d. 24 cm"),
            listOf("a. 260°                               ","b. 180°   ","c. 130° ","d. 100°"),
            listOf("a. 9 cm                                ","b. 10 cm                  ","c. 12 cm","d. 14 cm")
        ),
        listOf(
            listOf("a. ¹¹∕₁₃, ⁵∕₆, ³∕₇, ⅔","b. ³∕₇, ⁵∕₆, ¹¹∕₁₃, ⅔","c. ⅔, ³∕₇, ¹¹∕₁₃, ⁵∕₆","d. ³∕₇, ⅔ ,⁵∕₆ , ¹¹∕₁₃"),
            listOf("a. 23","b. 26","c. 28","d. 31"),
            listOf("a. 0,70 m²","b. 0,80 m²","c. 0,75 m²","d. 0,85 m²")
        ),
        listOf(
            listOf("a. -12 - 9√2","b. -12 - 6√2","c. – 9 - 12√2","d. 12 - 9√2"),
            listOf("a. ⁴∕₂₅","b. ¹⁶∕₂₅","c. ²∕₅","d. ⁴∕₅"),
            listOf("a. 4","b. 6","c. 8","d. 10")
        ),
        listOf(
            listOf("a. 24 hari","b. 12 hari","c. 10 hari","d. 5 hari"),
            listOf("a. 160","b. 328","c. 484","d. 486"),
            listOf("a. 15","b. 12","c. 10","d. 5 ")
        ),
        listOf(
            listOf("a. 120.000.000,00","b. 140.000.000,00","c. 160.000.000,00","d. 100.000.000,00 "),
            listOf("a. 15","b. 20","c. 25","d. 30 "),
            listOf("a. 3x - 17","b. 3x + 17","c. 3x + 3","d. 3x - 3 ")
        ),
        listOf(
            listOf("a. 10","b. 15 ","c. 25","d. 35 "),
            listOf("a. kurang dari  6 th","b. sama dengan 6 tahun","c. lebih dari 6 tahun","d. sama dengan 9 tahun "),
            listOf("a. { 5, 3, 2, 0, -2, -3}","b. { 8, 5, 2, 1, -4 }","c. { -8, -5, -2, 1, 4 }","d. { -8, -5, -2, -1, -4} ")
        )
    )


    private val kunciJawaban9: List<List<Int>> = listOf(
        listOf(2,3,1),
        listOf(2,2,3),
        listOf(1,0,1),
        listOf(2,2,1),
        listOf(2,1,0),
        listOf(1,1,0),
        listOf(2,1,2),
        listOf(2,3,1),
        listOf(3,0,2),
        listOf(3,1,3),
        listOf(3,2,1),
        listOf(0,0,2),
        listOf(1,3,2),
        listOf(1,3,1),
        listOf(1,1,0),
        listOf(0,1,2),
        listOf(3,1,0),
        listOf(0,3,1),
        listOf(3,2,3),
        listOf(2,0,3),
        listOf(0,2,3),
        listOf(2,0,3),
        listOf(1,1,1),
        listOf(3,2,1),
        listOf(0,1,0),
        listOf(2,1,1),
        listOf(3,2,2),
        listOf(2,3,2),
        listOf(1,2,2),
        listOf(2,1,1),
        listOf(2,0,2),
        listOf(2,2,3),
        listOf(2,3,1),
        listOf(2,1,3),
        listOf(2,2,0),
        listOf(3,1,0),
        listOf(2,0,1),
        listOf(0,0,2),
        listOf(0,2,3),
        listOf(0,3,0),
        listOf(2,1,0),
        listOf(3,2,0),
        listOf(1,3,1),
        listOf(3,1,2),
        listOf(3,0,2),
        listOf(3,0,2),
        listOf(0,1,1),
        listOf(1,2,0),
        listOf(3,2,3),
        listOf(1,0,2)







    )
    private lateinit var scoreManager9: ScoreManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas9, container, false)
        scoreManager9 = ScoreManager(requireActivity().applicationContext)
        jawabanBenar9 = if(scoreManager9.scoreMatKelas9 < 1) 0 else scoreManager9.scoreMatKelas9 / 5

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
            val getData = soalMatsd9[jawabanBenar9][i]
            (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
            val getImg = listRadiogrup[i].getChildAt(1) as ImageView
            if (getData.second != 0){
                getImg.setImageResource(getData.second)
                getImg.visibility = View.VISIBLE
            }
            for(j in 2 until (listRadiogrup[i].childCount)){
                (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda9[jawabanBenar9][i][j-2]
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
                    val ch1 = pilihanGanda9[jawabanBenar9][0][kunciJawaban9[jawabanBenar9][0]]
                    val ch2 = pilihanGanda9[jawabanBenar9][1][kunciJawaban9[jawabanBenar9][1]]
                    val ch3 = pilihanGanda9[jawabanBenar9][2][kunciJawaban9[jawabanBenar9][2]]

                    var scoreMatSd = scoreManager9.scoreMatKelas9
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar9++

                        if(jawabanBenar9 == soalMatsd9.size){
                            scoreMatSd +=5
                            scoreManager9.scoreMatKelas9 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManager9.scoreMatKelas9 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd9[jawabanBenar9][i]
                                (listRadiogrup[i].getChildAt(0) as TextView).text = getData.first
                                val getImg = listRadiogrup[i].getChildAt(1) as ImageView
                                if (getData.second != 0){
                                    getImg.setImageResource(getData.second)
                                    getImg.visibility = View.VISIBLE
                                }else{
                                    getImg.visibility = View.GONE
                                }
                                for(j in 2 until (listRadiogrup[i].childCount)){
                                    (listRadiogrup[i].getChildAt(j) as RadioButton).text = pilihanGanda9[jawabanBenar9][i][j-2]
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