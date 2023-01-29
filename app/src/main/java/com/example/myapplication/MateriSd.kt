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
import com.example.alat.*

class MateriSd : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_sd)
        supportActionBar?.title = getString(R.string.sd)
        // button untuk sd
        val paiSd = findViewById<Button>(R.id.btnPaiSd)
        val matSd = findViewById<Button>(R.id.btnMatSd)
        val ipaSd = findViewById<Button>(R.id.btnIpaSd)
        val ipsSd = findViewById<Button>(R.id.btnIpsSd)
        val indoSd = findViewById<Button>(R.id.btnIndonesiasd)
        val engSD = findViewById<Button>(R.id.btnEnglishSd)
        val silaSd = findViewById<Button>(R.id.btnPancasilaSd)
        val seniSd = findViewById<Button>(R.id.btnSeniSd)
        val pjokSD = findViewById<Button>(R.id.btnPjokSd)
        // materi sd 1-6
        val mat1 = findViewById<TextView>(R.id.matKelas1)
        val ipa1 = findViewById<TextView>(R.id.ipaKelas1)
        val ipa2 = findViewById<TextView>(R.id.ipaKelas2)
        val ipa3 = findViewById<TextView>(R.id.ipaKelas3)
        val ipa4 = findViewById<TextView>(R.id.ipaKelas4)
        val ipa5 = findViewById<TextView>(R.id.ipaKelas5)
        val ipa6 = findViewById<TextView>(R.id.ipaKelas6)
        val mat2 = findViewById<TextView>(R.id.matKelas2)
        val mat3 = findViewById<TextView>(R.id.matKelas3)
        val mat4 = findViewById<TextView>(R.id.matKelas4)
        val mat5 = findViewById<TextView>(R.id.matKelas5)
        val mat6 = findViewById<TextView>(R.id.matKelas6)
        val pai1 = findViewById<TextView>(R.id.paiKelas1)
        val pai2 = findViewById<TextView>(R.id.paiKelas2)
        val pai3 = findViewById<TextView>(R.id.paiKelas3)
        val pai4 = findViewById<TextView>(R.id.paiKelas4)
        val pai5 = findViewById<TextView>(R.id.paiKelas5)
        val pai6 = findViewById<TextView>(R.id.paiKelas6)
        val ips1 = findViewById<TextView>(R.id.ipsKelas1)
        val ips2 = findViewById<TextView>(R.id.ipsKelas2)
        val ips3 = findViewById<TextView>(R.id.ipsKelas3)
        val ips4 = findViewById<TextView>(R.id.ipsKelas4)
        val ips5 = findViewById<TextView>(R.id.ipsKelas5)
        val ips6 = findViewById<TextView>(R.id.ipsKelas6)
        val indo1 = findViewById<TextView>(R.id.indoKelas1)
        val indo2 = findViewById<TextView>(R.id.indoKelas2)
        val indo3 = findViewById<TextView>(R.id.indoKelas3)
        val indo4 = findViewById<TextView>(R.id.indoKelas4)
        val indo5 = findViewById<TextView>(R.id.indoKelas5)
        val indo6 = findViewById<TextView>(R.id.indoKelas6)
        val eng1 = findViewById<TextView>(R.id.englisKelas1)
        val eng2 = findViewById<TextView>(R.id.englisKelas2)
        val eng3 = findViewById<TextView>(R.id.englisKelas3)
        val eng4 = findViewById<TextView>(R.id.englisKelas4)
        val eng5 = findViewById<TextView>(R.id.englisKelas5)
        val eng6 = findViewById<TextView>(R.id.englisKelas6)
        val sila1 = findViewById<TextView>(R.id.pknKelas1)
        val sila2 = findViewById<TextView>(R.id.pknKelas2)
        val sila3 = findViewById<TextView>(R.id.pknKelas3)
        val sila4 = findViewById<TextView>(R.id.pknKelas4)
        val sila5 = findViewById<TextView>(R.id.pknKelas5)
        val sila6 = findViewById<TextView>(R.id.pknKelas6)
        val seni1 = findViewById<TextView>(R.id.seniKelas1)
        val seni2 = findViewById<TextView>(R.id.seniKelas2)
        val seni3 = findViewById<TextView>(R.id.seniKelas3)
        val seni4 = findViewById<TextView>(R.id.seniKelas4)
        val seni5 = findViewById<TextView>(R.id.seniKelas5)
        val seni6 = findViewById<TextView>(R.id.seniKelas6)
        val pjok1 = findViewById<TextView>(R.id.pjokkelas1)
        val pjok2 = findViewById<TextView>(R.id.pjokkelas2)
        val pjok3 = findViewById<TextView>(R.id.pjokkelas3)
        val pjok4 = findViewById<TextView>(R.id.pjokkelas4)
        val pjok5 = findViewById<TextView>(R.id.pjokKelas5)
        val pjok6 = findViewById<TextView>(R.id.pjokKelas6)
        val scoreManagerMatematika = ScoreManagerMatematika(this)
        val scoreManagerPai = ScoreManagerPai(this)
        val scoreManagerIpa = ScoreManagerIpa(this)
        val scoreManagerIps = ScoreManagerIps(this)
        val scoreMatSd = findViewById<TextView>(R.id.scoreMatSd)
        val scorePaiSd = findViewById<TextView>(R.id.scorePaiSd)
        val scoreIpaSd = findViewById<TextView>(R.id.scoreIpaSd)
        val scoreIpsSd = findViewById<TextView>(R.id.scoreIpsSd)
        val energy = EnergyManager(applicationContext)

        Thread {
            while (true){
                //  Barisan kode penting (gak usah diapa-apain)
                Thread.sleep(1000) // Sebelum menampilkan skor baru, cooldown selama 1 detik agar Thread tidak exhausted
                Handler(Looper.getMainLooper()).post{
                    // Untuk listing score bisa ditambahkan dibawah komen ini (tidak usah sesuai urutan)
                    scoreMatSd.text = getString(R.string.score_mat)+scoreManagerMatematika.totalScoreMat.toString()
                    scorePaiSd.text = getString(R.string.score_pai)+scoreManagerPai.totalScorePai.toString()
                    scoreIpaSd.text = getString(R.string.score_ipa)+scoreManagerIpa.totalScoreIpa.toString()
                    scoreIpsSd.text = getString(R.string.score_ips)+scoreManagerIps.totalScoreIps.toString()


                }
            }
        }.start()



        paiSd.setOnClickListener {

            pai1.visibility = if(pai1.visibility == View.GONE)
                    View.VISIBLE else View.GONE
            pai2.visibility = if(pai2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pai3.visibility = if(pai3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pai4.visibility = if(pai4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pai5.visibility = if(pai5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pai6.visibility = if(pai6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        matSd.setOnClickListener {

            mat1.visibility = if(mat1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat2.visibility = if(mat2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat3.visibility = if(mat3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat4.visibility = if(mat4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat5.visibility = if(mat5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            mat6.visibility = if(mat6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        ipaSd.setOnClickListener {

            ipa1.visibility = if(ipa1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa2.visibility = if(ipa2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa3.visibility = if(ipa3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa4.visibility = if(ipa4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa5.visibility = if(ipa5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ipa6.visibility = if(ipa6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        ipsSd.setOnClickListener {

            ips1.visibility = if(ips1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips2.visibility = if(ips2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips3.visibility = if(ips3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips4.visibility = if(ips4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips5.visibility = if(ips5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            ips6.visibility = if(ips6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        indoSd.setOnClickListener {

            indo1.visibility = if(indo1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo2.visibility = if(indo2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo3.visibility = if(indo3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo4.visibility = if(indo4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo5.visibility = if(indo5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            indo6.visibility = if(indo6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        engSD.setOnClickListener {

            eng1.visibility = if(eng1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng2.visibility = if(eng2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng3.visibility = if(eng3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng4.visibility = if(eng4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng5.visibility = if(eng5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            eng6.visibility = if(eng6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        silaSd.setOnClickListener {

            sila1.visibility = if(sila1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila2.visibility = if(sila2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila3.visibility = if(sila3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila4.visibility = if(sila4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila5.visibility = if(sila5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            sila6.visibility = if(sila6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        seniSd.setOnClickListener {

            seni1.visibility = if(seni1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni2.visibility = if(seni2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni3.visibility = if(seni3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni4.visibility = if(seni4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni5.visibility = if(seni5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            seni6.visibility = if(seni6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }

        pjokSD.setOnClickListener {

            pjok1.visibility = if(pjok1.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok2.visibility = if(pjok2.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok3.visibility = if(pjok3.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok4.visibility = if(pjok4.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok5.visibility = if(pjok5.visibility == View.GONE)
                View.VISIBLE else View.GONE
            pjok6.visibility = if(pjok6.visibility == View.GONE)
                View.VISIBLE else View.GONE

        }
        mat1.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas1, SoalManager.MATEMATIKA_KELAS1)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas1")
                    startActivity(intent)
                }
            }
        }

        mat2.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas2, SoalManager.MATEMATIKA_KELAS2)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    if(!SoalManager.cek(energy)){
                        Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                    }else{
                        val intent = Intent(this, LatihanMateriSd::class.java)
                        intent.putExtra("POINTER_SOAL", "SoalMatKelas2")
                        startActivity(intent)
                    }
                }
            }
        }

        mat3.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas3, SoalManager.MATEMATIKA_KELAS3)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas3")
                    startActivity(intent)
                }
            }
        }

        mat4.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas4, SoalManager.MATEMATIKA_KELAS4)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas4")
                    startActivity(intent)
                }
            }
        }

        mat5.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas5, SoalManager.MATEMATIKA_KELAS5)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas5")
                    startActivity(intent)
                }
            }
        }

        mat6.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerMatematika.scoreMatKelas6, SoalManager.MATEMATIKA_KELAS6)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalMatKelas6")
                    startActivity(intent)
                }
            }
        }

        pai1.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas1, SoalManager.PAI_KELAS1)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas1")
                    startActivity(intent)
                }
            }
        }

        pai2.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas2, SoalManager.PAI_KELAS2)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas2")
                    startActivity(intent)
                }
            }
        }
        pai3.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas3, SoalManager.PAI_KELAS3)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas3")
                    startActivity(intent)
                }
            }
        }
        pai4.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas4, SoalManager.PAI_KELAS4)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas4")
                    startActivity(intent)
                }
            }
        }
        pai5.setOnClickListener {

            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas5, SoalManager.PAI_KELAS5)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas5")
                    startActivity(intent)
                }
            }
        }
        pai6.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerPai.scorePaiKelas6, SoalManager.PAI_KELAS6)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalPaiKelas6")
                    startActivity(intent)
                }
            }
        }
        ipa1.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIpa.scoreIpaKelas1, SoalManager.IPA_KELAS1)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpaKelas1")
                    startActivity(intent)
                }
            }
        }
        ipa2.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIpa.scoreIpaKelas2, SoalManager.IPA_KELAS2)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpaKelas2")
                    startActivity(intent)
                }
            }
        }
        ipa3.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIpa.scoreIpaKelas3, SoalManager.IPA_KELAS3)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpaKelas3")
                    startActivity(intent)
                }
            }
        }
        ipa4.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIpa.scoreIpaKelas4, SoalManager.IPA_KELAS4)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpaKelas4")
                    startActivity(intent)
                }
            }
        }
        ipa5.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIpa.scoreIpaKelas5, SoalManager.IPA_KELAS5)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpaKelas5")
                    startActivity(intent)
                }
            }
        }
        ipa6.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIpa.scoreIpaKelas6, SoalManager.IPA_KELAS6)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpaKelas6")
                    startActivity(intent)
                }
            }
        }
        ips1.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIps.scoreIpsKelas1, SoalManager.IPS_KELAS1)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpsKelas1")
                    startActivity(intent)
                }
            }
        }
        ips2.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIps.scoreIpsKelas2, SoalManager.IPS_KELAS2)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpsKelas2")
                    startActivity(intent)
                }
            }
        }
        ips3.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIps.scoreIpsKelas3, SoalManager.IPS_KELAS3)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpsKelas3")
                    startActivity(intent)
                }
            }
        }
        ips4.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIps.scoreIpsKelas4, SoalManager.IPS_KELAS4)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpsKelas4")
                    startActivity(intent)
                }
            }
        }
        ips5.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIps.scoreIpsKelas5, SoalManager.IPS_KELAS5)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpsKelas5")
                    startActivity(intent)
                }
            }
        }
        ips6.setOnClickListener {
            if(SoalManager.dijawab(scoreManagerIps.scoreIpsKelas6, SoalManager.IPS_KELAS6)){
                Toast.makeText(applicationContext, "Anda telah menyelesaikan semua soal di bagian ini", Toast.LENGTH_SHORT).show()
            }else{
                if(!SoalManager.cek(energy)){
                    Toast.makeText(this, R.string.empty_energy, Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this, LatihanMateriSd::class.java)
                    intent.putExtra("POINTER_SOAL", "SoalIpsKelas6")
                    startActivity(intent)
                }
            }
        }

    }
}