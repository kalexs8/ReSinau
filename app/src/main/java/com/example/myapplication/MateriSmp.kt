package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.alat.EnergyManager
import com.example.alat.ScoreManagerMatematika
import com.example.alat.ScoreManagerPai
import com.example.alat.SoalManager

class MateriSmp : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_smp)
        supportActionBar?.title = getString(R.string.smp)
        // button untuk sd
        val paiSmp = findViewById<Button>(R.id.btnPaiSmp)
        val matSmp = findViewById<Button>(R.id.btnMatSmp)
        val ipaSmp = findViewById<Button>(R.id.btnIpaSmp)
        val ipsSmp = findViewById<Button>(R.id.btnIpsSmp)
        val indoSmp = findViewById<Button>(R.id.btnIndonesiaSmp)
        val engSmp = findViewById<Button>(R.id.btnEnglishSmp)
        val silaSmp = findViewById<Button>(R.id.btnPancasilaSmp)
        val seniSmp = findViewById<Button>(R.id.btnSeniSmp)
        val pjokSmp = findViewById<Button>(R.id.btnPjokSmp)
        // materi sd 1-6
        val ipa7 = findViewById<TextView>(R.id.ipaKelas7)
        val ipa8 = findViewById<TextView>(R.id.ipaKelas8)
        val ipa9 = findViewById<TextView>(R.id.ipaKelas9)
        val mat7 = findViewById<TextView>(R.id.matKelas7)
        val mat8 = findViewById<TextView>(R.id.matKelas8)
        val mat9 = findViewById<TextView>(R.id.matKelas9)
        val pai7 = findViewById<TextView>(R.id.paiKelas7)
        val pai8 = findViewById<TextView>(R.id.paiKelas8)
        val pai9 = findViewById<TextView>(R.id.paiKelas9)
        val ips7 = findViewById<TextView>(R.id.ipsKelas7)
        val ips8 = findViewById<TextView>(R.id.ipsKelas8)
        val ips9 = findViewById<TextView>(R.id.ipsKelas9)
        val indo7 = findViewById<TextView>(R.id.indoKelas7)
        val indo8 = findViewById<TextView>(R.id.indoKelas8)
        val indo9 = findViewById<TextView>(R.id.indoKelas9)
        val eng7 = findViewById<TextView>(R.id.englisKelas7)
        val eng8 = findViewById<TextView>(R.id.englisKelas8)
        val eng9 = findViewById<TextView>(R.id.englisKelas9)
        val sila7 = findViewById<TextView>(R.id.pknKelas7)
        val sila8 = findViewById<TextView>(R.id.pknKelas8)
        val sila9 = findViewById<TextView>(R.id.pknKelas9)
        val seni7 = findViewById<TextView>(R.id.seniKelas7)
        val seni8 = findViewById<TextView>(R.id.seniKelas8)
        val seni9 = findViewById<TextView>(R.id.seniKelas9)
        val pjok7 = findViewById<TextView>(R.id.pjokkelas7)
        val pjok8 = findViewById<TextView>(R.id.pjokKelas8)
        val pjok9 = findViewById<TextView>(R.id.pjokKelas9)

        val scoreManagerMatematika = ScoreManagerMatematika(this)
        val scoreManagerPai = ScoreManagerPai(this)
        val scoreMatSmp = findViewById<TextView>(R.id.scoreMatSmp)
        val scorePaiSMp = findViewById<TextView>(R.id.scorePaiSmp)
        val energy = EnergyManager(applicationContext)


        Thread {
            while (true){
                //  Barisan kode penting (gak usah diapa-apain)
                Thread.sleep(1000) // Sebelum menampilkan skor baru, cooldown selama 1 detik agar Thread tidak exhausted
                Handler(Looper.getMainLooper()).post{
                    // Untuk listing score bisa ditambahkan dibawah komen ini (tidak usah sesuai urutan)
                    scoreMatSmp.text = getString(R.string.score_mat)+scoreManagerMatematika.totalScoreMat.toString()
                    scorePaiSMp.text = getString(R.string.score_pai)+scoreManagerPai.totalScorePai.toString()
                }
            }
        }.start()



        paiSmp.setOnClickListener {

            pai7.visibility = if(pai7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pai8.visibility = if(pai8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pai9.visibility = if(pai9.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        matSmp.setOnClickListener {

            mat7.visibility = if(mat7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat8.visibility = if(mat8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat9.visibility = if(mat9.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        ipaSmp.setOnClickListener {

            ipa7.visibility = if(ipa7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa8.visibility = if(ipa8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa9.visibility = if(ipa9.visibility == View.GONE)
                View.VISIBLE else View.GONE
        }

        ipsSmp.setOnClickListener {

            ips7.visibility = if(ips7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips8.visibility = if(ips8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips9.visibility = if(ips9.visibility == View.GONE)
                View.VISIBLE else View.GONE


        }

        indoSmp.setOnClickListener {

            indo7.visibility = if(indo7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo8.visibility = if(indo8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo9.visibility = if(indo9.visibility == View.GONE)
                View.VISIBLE else View.GONE


        }

        engSmp.setOnClickListener {

            eng7.visibility = if(eng7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng8.visibility = if(eng8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng9.visibility = if(eng9.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        silaSmp.setOnClickListener {

            sila7.visibility = if(sila7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila8.visibility = if(sila8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila9.visibility = if(sila9.visibility == View.GONE)
                View.VISIBLE else View.GONE


        }

        seniSmp.setOnClickListener {

            seni7.visibility = if(seni7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni8.visibility = if(seni8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni9.visibility = if(seni9.visibility == View.GONE)
                View.VISIBLE else View.GONE


        }

        pjokSmp.setOnClickListener {

            pjok7.visibility = if(pjok7.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok8.visibility = if(pjok8.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok9.visibility = if(pjok9.visibility == View.GONE)
                View.VISIBLE else View.GONE


        }
        mat7.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas7, SoalManager.MATEMATIKA_KELAS7)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSmp::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas7")
                    startActivity(intent)
                }
            }
        }

        mat8.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas8, SoalManager.MATEMATIKA_KELAS8)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSmp::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas8")
                    startActivity(intent)
                }
            }
        }

        mat9.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas9, SoalManager.MATEMATIKA_KELAS9)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSmp::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas9")
                    startActivity(intent)
                }
            }
        }
        pai7.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas7, SoalManager.PAI_KELAS7)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSmp::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas7")
                    startActivity(intent)
                }
            }
        }
        pai8.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas8, SoalManager.PAI_KELAS8)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSmp::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas8")
                    startActivity(intent)
                }
            }
        }
        pai9.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas9, SoalManager.PAI_KELAS9)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSmp::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas9")
                    startActivity(intent)
                }
            }
        }


    }
}