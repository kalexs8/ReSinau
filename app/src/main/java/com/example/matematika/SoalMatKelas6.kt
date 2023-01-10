package com.example.matematika

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.alat.ScoreManagerMatematika
import com.example.myapplication.R


class SoalMatKelas6 : Fragment() {

    private var jawabanBenar6 = 0
    private val soalMatsd6: List<List<Pair<String, Int>>> = listOf(
        listOf(
            Pair("1. -345 + 225 = ...", 0),
            Pair("2. -54 – 652 = ...", 0),
            Pair("3. -32 × 6 = ...", 0)),

        listOf(Pair("4. -64 : -4 = ...", 0),
            Pair("5. 27 : 9 – 6 = ...", 0),
            Pair("6. -12 × -8 – 4 = ...", 0)),

        listOf(Pair("7.  (-32 x 4) – (-12) = ...", 0),
            Pair("8. 2455 + 456 + 3345 = ...", 0),
            Pair("9. 7242 + 422 – 5884 = ...", 0)),

        listOf(Pair("10. Hasil dari 1736 : 28 – 14 adalah ...", 0),
            Pair("11. Bentuk sederhana dari bilangan pecahan 27/63 yang benar adalah ...", 0),
            Pair("12. Hasil dari 6/8 + 5/12 + 3/2 adalah ...", 0)),

        listOf(Pair("13. Hasil 5/6 x 156 = ...", 0),
            Pair("14. 25 : 3 3/4     = ...", 0),
            Pair("15. Perhatikan gambar di bawah ini !Yang ditandai dengan huruf  “r” disebut ...", R.mipmap.soal_mat_pat_kelas6_soal15)),

        listOf(Pair("16. Perhatikan gambar berikut !Garis manakah yang disebut tali busur?",  R.mipmap.soal_mat_pat_kelas6_soal16),
            Pair("17. Luas sebuah lingkaran 2464 cm². Berapa panjang jari jarinya?", 0),
            Pair("18. Jika diketahui luas lingkaran 314 cm². Berapa kelilingnya?", 0)),

        listOf(Pair("19. Luas lingkaran dengan diameter 20 cm adalah ... (π = 3.14)?", 0),
            Pair("20. Hitunglah luas daerah berikut...",  R.mipmap.soal_mat_pat_kelas6_soal20),
            Pair("21. Diketahui sebuah bak air berbentuk kubus dengan volume 216 liter. Berapa tinggi bak air tersebut?",  R.mipmap.soal_mat_pat_kelas6_soal21)),

        listOf(Pair("22. Nisa mempunyai 5 buah kotak musik berbentuk kubus dengan ukuran 10 cm. Kotak musik tersebut disusun berjajar kemudian nisa ingin membungkusnya dengan kertas kado. Luas kertas kado yang harus disediakan Nisa adalah...", 0),
            Pair("23. Sebuah kolam renang berukuran 10 × 20 m, jika kedalaman kolam tersebut 150 cm. Berapa volume air kolam renang tersebut?",  R.mipmap.soal_mat_pat_kelas6_soal23),
            Pair("24. Diketahui perbandingan panjang dan lebar sebuah balok 6 : 4, jika volume balok tersebut 5.760 cm³ dan tinggi nya 15 cm. Luas permukaan balok adalah...",  R.mipmap.soal_mat_pat_kelas6_soal24)),

        listOf(Pair("25. Sebuah penampung air alasnya berbentuk lingkaran dengan keliling 628 cm. Jika tinggi penampung air 2 meter. Berapa waktu yang harus dibutuhkan mengisi penuh penampung air dengan debit air 40 liter/menit?",  R.mipmap.soal_mat_pat_kelas6_soal25),
            Pair("26. Sebuah pipa paralon air berdiameter 14 cm dengan luas permukaan 5280 cm². Panjang pipa paralon air adalah .....", 0),
            Pair("27. Hitunglah volume bangun ruang disamping !",  R.mipmap.soal_mat_pat_kelas6_soal27)),

        listOf(Pair("28. Sebuah atap sebuah gudang akan dipasang asbes. Disamping adalah gambaran atap gudang tersebut. Volume atap tersebut 2.100 m³, Jika harga asbes Rp 20.000/meter². Biaya yang harus dikeluarkan untuk memasang asbes adalah .....",  R.mipmap.soal_mat_pat_kelas6_soal28),
            Pair("29. Rika mempunyai 2 buah limas persegi dengan ukuran 25 × 25 dan 50 × 50. Jika diketahui volume limas I adalah 2.500 cm³, perbandingan tinggi limas I dan II adalah 2 : 3. Selisih volume kedua limas Rika adalah .....", 0),
            Pair("30. Hitunglah luas permukaan limas persegi yang keliling alasnya 48 cm dan tinggi limas 8 cm!", 0)),

        listOf(Pair("31. Diketahui volume kerucut 5544 cm³ dan diameternya 28 cm. Tinggi kerucut adalah .....", 0),
            Pair("32. Sebuah terompet berbentuk kerucut. Berapa luas permukaan terompet jika diketahui diameter terompet 40 cm dan panjangnya 15 cm?", 0),
            Pair("33. Tentukan volume bola jika diketahui keliling bola 132 cm?", 0)),

        listOf(Pair("34. Luas permukaan sebuah bola 5544 cm². Diameter bola adalah .....", 0),
            Pair("35. Sebuah tempat air berbentuk tabung dengan diameter 1 m dan tingginya 40 cm yang telah terisi penuh air. Kemudian air tesebut diambil untuk menyirami tanaman sebanyak 100 liter air. Berapa sisa air dalam tempat air tersebut?", 0),
            Pair("36. Sebuah makanan akan dikemas ke dalam kardus berbentuk balok dengan ukuran 20×8×5. Jika disediakan kardus ukuran 60×60. Berapa makanan yang dapat dikemas dengan kardus?", 0)),

        listOf(Pair("37. Hitunglah luas permukaan bangun ruang disamping !",  R.mipmap.soal_mat_pat_kelas6_soal37),
            Pair("38. Ibu mempunyai botol minum berbentuk seperti gambar Tabung-tabung disamping. Berapa luas permukaan botol air Ibu?",  R.mipmap.soal_mat_pat_kelas6_soal38),
            Pair("39. Volume air kolam renang seperti gambar disamping adalah ..... Kolam prisma?",  R.mipmap.soal_mat_pat_kelas6_soal39)),

        listOf(Pair("40. Pak Doni mempunyai 20 liter susu segar. Kemudian dimasukan kedalam wadah seperti berikut.Balok11,Jika tiap wadah dijual dengan harga Rp 5.000, berapa hasil yang di dapatkan Pak Doni setelah menjual semua susu yang dimiliki?",  R.mipmap.soal_mat_pat_kelas6_soal40),
            Pair("41. Diketahui sebuah kubus dengan panjang sisi 40 cm. Berapa volume kubus tersebut?", 0),
            Pair("42. Dilla mempunyai sebuah kain dengan ukuran 2×1,8 meter.  Kain tersebut dilapiskan pada mainan berbentuk kubus dengan ukuran 20 cm. Banyaknya mainan yang dapat dibungkus dengan kain adalah ....", 0)),

        listOf(Pair("43. Kolam ikan Pak Bambang berukuran 8 × 10 m dan kedalaman kolam tersebut 150 cm. Berapa waktu yang dibutuhkan Pak Bambang untuk mengisi air dalam kolam ikan jika debit air 400 liter/menit?", 0),
            Pair("44. Sebuah potongan kayu berbentuk seperti berikut !Tabung3.Jika diketahui diameter 1,2 meter dan ketebalan 10 cm. Potongan kayu tersebut akan dicat. Berapa luas potongan kayu yang akan dicat?",  R.mipmap.soal_mat_pat_kelas6_soal44),
            Pair("45. Sebuah penampung air alasnya berbentuk lingkaran dengan keliling 628 cm. Jika tinggi penampung air 2 meter. Volume penampung air adalah .....", 0)),

        listOf(Pair("46. Hitunglah volume bangun ruang disamping !  ",  R.mipmap.soal_mat_pat_kelas6_soal46),
            Pair("47. Luas permukaan bangun ruang disamping adalah ....",  R.mipmap.soal_mat_pat_kelas6_soal47),
            Pair("48. Pak Eko ingin membuat topi ulang tahun dari kain wol yang berbentuk kerucut dengan diameter 14 cm dan tingginya 24 cm. Berapa luas kain yang dibutuhkan Pak Eko untuk mebuat topi tersebut?", 0)),

        listOf(Pair("49. Ibu mempunyai sebuah semangka dengan diameter 28 cm. Lalu ibu membelahnya menjadi dua bagian yang sama. Berapa luas permukaan bagian semangka Ibu?", 0),
            Pair("50. Luas permukaan bangun ruang disamping adalah ..... kerucutbola?",  R.mipmap.soal_mat_pat_kelas6_soal50),
            Pair("51. Hitunglah volume bangun ruang berikut...",  R.mipmap.soal_mat_pat_kelas6_soal51)),

        listOf(Pair("52. Berikut bentuk cara penyajian data kecuali .....", 0),
            Pair("53. Mean dari bilangan 7 dan 8 adalah....", 0),
            Pair("54. Diketahu nilai rata – rata ulangan Matematika dari 4 siswa yaitu 80. Jika nilai Abu 70 , nilai Dita 75 , nilai Dian 80. Berapa nilai yang diperoleh Bimo?", 0)),

        listOf(Pair("55. Dalam sebuah ulangan matematika, 8 anak memiliki rata-rata 78, jika ditambah nilai Damar maka rata – ratanya menjadi 80. Nilai Damar adalah .....", 0),
            Pair("56. Berikut data nilai ulangan matematika dari 20 anak.Modus dari data diatas adalah .....",  R.mipmap.soal_mat_pat_kelas6_soal56),
            Pair("57. Tentukan median dari data berikut...",  R.mipmap.soal_mat_pat_kelas6_soal57)),

        listOf(Pair("58. Perhatikan diagram berikut ini !diagram batang45 .Rata – rata ukuran sepatu siswa pada diagram diatas adalah .....",  R.mipmap.soal_mat_pat_kelas6_soal58),
            Pair("59. Perhatikan diagram berikut!lingkarandi .Jika diketahui siswa yang suka lari adalah 4 anak. Berapa jumlah siswa yang suka bola basket dan sepak bola?",  R.mipmap.soal_mat_pat_kelas6_soal59),
            Pair("60. Berikut adalah nilai hasil ulangan Matematika siswa kelas VI SD.Berapa rata – rata nilai hasil ulangan siswa? ",  R.mipmap.soal_mat_pat_kelas6_soal60))
    )


    private  val pilihanGanda6: List<List<List<String>>> = listOf(
        listOf(
            listOf("a.  -110","b.  -115","c.  -120","d.  -125"),
            listOf("a.  -696","b.  -706","c.  -716","d.  -726"),
            listOf("a.  182","b.  192","c.  -182","d.  -192")
        ),
        listOf(
            listOf("a.  16","b.  24","c.  -16","d.  -24"),
            listOf("a.  -3","b.  -9","c.  3","d.  9"),
            listOf("a.  -144","b.  92","c.  96","d.  144")
        ),
        listOf(
            listOf("a.  -116","b.  -126","c.  -128","d.  -140"),
            listOf("a.  6156","b.  6165","c.  6256","d.  6265"),
            listOf("a.  1680","b.  1780","c.  1870","d.  1880")
        ),
        listOf(
            listOf("a.  48","b.  58","c.  124","d.  134"),
            listOf("a. 1/7","b. 2/7","c. 3/7","d. 4/7"),
            listOf("a. 2 1/3","b. 2 2/3","c. 2 1/4","d. 2 3/4")
        ),
        listOf(
            listOf("a.  100","b.  110","c.  120","d.  130"),
            listOf("a. 6 1/3","b. 6 2/3","c. 7 1/3","d. 7 2/3"),
            listOf("a.  Titik pusat","b.  Jari - jari","c.  Diameter","d.  Panjang")
        ),
        listOf(
            listOf("a.  AC","b.  CB","c.  Garis lurus AB","d.  Garis lengkung AB"),
            listOf("a.  7 cm","b.  14 cm","c.  21 cm","d.  28 cm"),
            listOf("a.  31,4 cm","b.  62,8 cm","c.  94,2 cm","d.  125,6 cm")
        ),
        listOf(
            listOf("a.  1156 cm²","b.  1165 cm²","c.  1256 cm²","d.  1265 cm²"),
            listOf("a.  154 cm²","b.  462 cm²","c.  616 cm²","d.  770 cm²"),
            listOf("a.  50 cm","b.  60 cm","c.  70 cm","d.  80 cm")
        ),
        listOf(
            listOf("a.  1.800 cm²","b.  2.000 cm²","c.  2.200 cm²","d.  2.400 cm²"),
            listOf("a.  150 m³","b.  200 m³","c.  250 m³","d.  300 m³"),
            listOf("a.  1.869 cm²","b.  1.896 cm²","c.  1.968 cm²","d.  1.986 cm²")
        ),
        listOf(
            listOf("a.  1 jam 37 menit","b.  2 jam 7 menit","c.  2 jam 37 menit","d.  3 jam 7 menit"),
            listOf("a.  1,2 m","b.  12 m","c.  120 m","d.  210 m"),
            listOf("a. 192 cm³","b. 384 cm³","c. 768 cm³","d. 1536 cm³ ")
        ),
        listOf(
            listOf("a.  Rp 182.000,00","b.  Rp 1.820.000,00","c.  Rp 18.200.000,00","d.  Rp 182.000.000,00"),
            listOf("a. 12.500 cm³","b. 15.000 cm³","c. 17.500 cm³","d. 20.000 cm³"),
            listOf("a. 348 cm²","b. 384 cm²","c. 448 cm²","d. 484 cm² ")
        ),
        listOf(
            listOf("a.  7 cm","b.  17cm","c.  27cm","d.  37cm"),
            listOf("a. 1256 cm²","b. 1570 cm²","c. 2826 cm²","d. 6280 cm²  "),
            listOf("a. 30.808 cm³","b. 30.088 cm³","c. 38.088 cm³","d. 38.808 cm³ ")
        ),
        listOf(
            listOf("a.  14 cm","b.  21cm","c.  28cm","d.  42cm"),
            listOf("a.  114 liter","b.  194 liter","c.  264 liter","d.  314 liter"),
            listOf("a.  6","b.  8","c.  10","d.  12")
        ),
        listOf(
            listOf("a. 9.600 cm²","b. 10.856 cm²","c. 12.112 cm²","d. 13.368 cm²"),
            listOf("a. 2.992 cm²","b. 3.212 cm²","c. 3.366 cm²","d. 3.520 cm²"),
            listOf("a.  100m³","b.  200m³","c.  300m³","d.  400m³ ")
        ),
        listOf(
            listOf("a.  Rp 400.000,00","b.  Rp 600.000,00","c.  Rp 800.000,00","d.  Rp 1.000.000,00"),
            listOf("a.  6.400 cm³","b.  64.000 cm³","c.  8.000 cm³","d.  80.000 cm³"),
            listOf("a.  10 buah","b.  15 buah","c.  20 buah","d.  25 buah")
        ),
        listOf(
            listOf("a.  4 jam","b.  4 jam 30 menit","c.  5 jam","d.  5 jam 30 menit"),
            listOf("a.  26.367 cm²","b.  26.376 cm²","c.  36.367 cm²","d.  36.376 cm²"),
            listOf("a.  6.280 liter","b.  6.820 liter","c.  62.800 liter","d.  68.200 liter")
        ),
        listOf(
            listOf("a.  180 cm³","b.  240 cm³","c.  300 cm³","d.  360 cm³"),
            listOf("a.  192 cm²","b.  240 cm²","c.  336 cm²","d.  384 cm²"),
            listOf("a.  550cm²","b.  704 cm²","c.  1.232 cm²","d.  1.322 cm²")
        ),
        listOf(
            listOf("a.  1.232 cm²","b.  1.848 cm²","c.  2.464 cm²","d.  4.928 cm²"),
            listOf("a.  1.570cm²","b.  2.512 cm²","c.  4.082cm²","d.  5.024cm²"),
            listOf("a.  1.540 cm³","b.  2.800 cm³","c.  3.080 cm³","d.  4.340 cm³")
        ),
        listOf(
            listOf("a.  Diagram Batang","b.  Diagram Angka","c.  Diagaram Garis","d.  Diagram Lingkaran"),
            listOf("a.  7","b.  7,5","c.  8","d.  8,5"),
            listOf("a.  8","b.  8,5","c.  9","d.  9,5")
        ),
        listOf(
            listOf("a.  86","b.  88","c.  96","d.  98"),
            listOf("a.  60","b.  70","c.  80","d.  90"),
            listOf("a.  7","b.  7,5","c.  8","d.  8,5")
        ),
        listOf(
            listOf("a.  38,5","b.  39","c.  39,5","d.  40"),
            listOf("a.  10 anak","b.  12 anak","c.  22 anak","d.  24 anak"),
            listOf("a.  75,5","b.  76,5","c.  77","d.  78")
        )
    )


    private val kunciJawaban6: List<List<Int>> = listOf(
        listOf(2,1,3),
        listOf(0,0,1),
        listOf(0,2,1),
        listOf(0,2,1),
        listOf(3,1,1),
        listOf(2,3,1),
        listOf(2,0,1),
        listOf(1,3,2),
        listOf(2,0,1),
        listOf(2,0,1),
        listOf(2,1,3),
        listOf(3,1,0),
        listOf(1,1,2),
        listOf(0,1,1),
        listOf(2,1,0),
        listOf(3,2,0),
        listOf(1,2,3),
        listOf(1,1,3),
        listOf(2,2,1),
        listOf(1,2,2)






    )
    private lateinit var scoreManagerMatematika6: ScoreManagerMatematika


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_soal_mat_kelas6, container, false)
        scoreManagerMatematika6 = ScoreManagerMatematika(requireActivity().applicationContext)
        jawabanBenar6 = if(scoreManagerMatematika6.scoreMatKelas6 < 1) 0 else scoreManagerMatematika6.scoreMatKelas6 / 5

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
            val getData = soalMatsd6[jawabanBenar6][i]
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

                    var scoreMatSd = scoreManagerMatematika6.scoreMatKelas6
                    if(pilihGrup1 == ch1 && pilihGrup2 == ch2 && pilihGrup3 == ch3){
                        jawabanBenar6++

                        if(jawabanBenar6 == soalMatsd6.size){
                            scoreMatSd +=5
                            scoreManagerMatematika6.scoreMatKelas6 = scoreMatSd
                            Toast.makeText(activity,"Selamat anda telah menyelesaikan misi", Toast.LENGTH_SHORT).show()
                            done = true
                        }else {
                            scoreMatSd +=5
                            scoreManagerMatematika6.scoreMatKelas6 = scoreMatSd
                            Toast.makeText(activity,R.string.segments_sukses, Toast.LENGTH_SHORT).show()
                            // refresh ui
                            for(i in 0 until (listRadiogrup.size)){
                                val getData = soalMatsd6[jawabanBenar6][i]
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
                    }
                } // end cek jawab
            }else {
                Toast.makeText(activity, "Anda belum memasukkan semua jawaban", Toast.LENGTH_SHORT).show()
            } // end cek semua jawaban telah di centang
        }
        return view
    }
}