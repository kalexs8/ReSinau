package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import android.os.Handler
import android.os.Looper
import com.example.alat.*
import com.example.ipa.*
import com.example.ips.*
import com.example.matematika.*
import com.example.pai.*

class LatihanMateriSd : AppCompatActivity() {

    private lateinit var scoreManagerMatematika: ScoreManagerMatematika
    private lateinit var scoreManagerPai: ScoreManagerPai
    private lateinit var scoreManagerIpa: ScoreManagerIpa
    private lateinit var scoreManagerIps: ScoreManagerIps
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_materi_sd)
        supportActionBar?.hide()
        val tipeSoal = intent.getStringExtra("POINTER_SOAL")
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan_sd)
        scoreManagerMatematika = ScoreManagerMatematika(applicationContext)
        scoreManagerPai = ScoreManagerPai(applicationContext)
        scoreManagerIpa = ScoreManagerIpa(applicationContext)
        scoreManagerIps = ScoreManagerIps(applicationContext)
        progressBar = findViewById(R.id.progress_bar_sd)
        val heart = EnergyManager(applicationContext)
        heart.viewUpdater(findViewById(R.id.heartsCount), findViewById(R.id.timerView2))

        val closesd = findViewById<ImageView>(R.id.closeSd)
        closesd.setOnClickListener{
            finish()
        }
        progressBar.max = 10
        when (tipeSoal){
            "SoalMatKelas1" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas1(),
                )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas1 < 1) 0 else scoreManagerMatematika.scoreMatKelas1 / 5
                        }
                    }
                }.start()
            }
        "SoalMatKelas2" ->{
            val fragments: ArrayList<Fragment> = arrayListOf(
                SoalMatKelas2(),
            )
            val adapterSD = ViewPagerAdapterSd(fragments,this)
            viewPagerBilangan.adapter = adapterSD
            Thread {
                while (true){
                    Thread.sleep(1000)
                    Handler(Looper.getMainLooper()).post{
                        progressBar.progress = if(scoreManagerMatematika.scoreMatKelas2 < 1) 0 else scoreManagerMatematika.scoreMatKelas2 / 5
                    }
                }
            }.start()
        }
            "SoalMatKelas3" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas3(),
                )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas3 < 1) 0 else scoreManagerMatematika.scoreMatKelas3 / 5
                        }
                    }
                }.start()

            }
            "SoalMatKelas4" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas4(),
                )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas4 < 1) 0 else scoreManagerMatematika.scoreMatKelas4 / 5
                        }
                    }
                }.start()
            }

            "SoalMatKelas5" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas5(),
                )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas5 < 1) 0 else scoreManagerMatematika.scoreMatKelas5 / 5
                        }
                    }
                }.start()
            }

            "SoalMatKelas6" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas6(),
                )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas6 < 1) 0 else scoreManagerMatematika.scoreMatKelas6 / 5
                        }
                    }
                }.start()
            }
            "SoalPaiKelas1" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas1(),

                )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas1 < 1) 0 else scoreManagerPai.scorePaiKelas1 / 5
                        }
                    }
                }.start()
            }
            "SoalPaiKelas2" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas2(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas2 < 1) 0 else scoreManagerPai.scorePaiKelas2 / 5
                        }
                    }
                }.start()
            }
            "SoalPaiKelas3" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas3(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas3 < 1) 0 else scoreManagerPai.scorePaiKelas3 / 5
                        }
                    }
                }.start()
            }
            "SoalPaiKelas4" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas4(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas4 < 1) 0 else scoreManagerPai.scorePaiKelas4 / 5
                        }
                    }
                }.start()
            }
            "SoalPaiKelas5" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas5(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas5 < 1) 0 else scoreManagerPai.scorePaiKelas5 / 5
                        }
                    }
                }.start()
            }
            "SoalPaiKelas6" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas6(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas6 < 1) 0 else scoreManagerPai.scorePaiKelas6 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas1" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas1(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas1 < 1) 0 else scoreManagerIpa.scoreIpaKelas1 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas2" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas2(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas2 < 1) 0 else scoreManagerIpa.scoreIpaKelas3 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas3" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas3(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas3 < 1) 0 else scoreManagerIpa.scoreIpaKelas3 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas4" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas4(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas4 < 1) 0 else scoreManagerIpa.scoreIpaKelas4 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas5" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas5(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas5 < 1) 0 else scoreManagerIpa.scoreIpaKelas5 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas6" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas6(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas6 < 1) 0 else scoreManagerIpa.scoreIpaKelas6 / 5
                        }
                    }
                }.start()
            }
            "SoalIpsKelas1" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpsKelas1(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIps.scoreIpsKelas1 < 1) 0 else scoreManagerIps.scoreIpsKelas1 / 5
                        }
                    }
                }.start()
            }
            "SoalIpsKelas2" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpsKelas2(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIps.scoreIpsKelas2 < 1) 0 else scoreManagerIps.scoreIpsKelas2 / 5
                        }
                    }
                }.start()
            }
            "SoalIpsKelas3" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpsKelas3(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIps.scoreIpsKelas3 < 1) 0 else scoreManagerIps.scoreIpsKelas3 / 5
                        }
                    }
                }.start()
            }
            "SoalIpsKelas4" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpsKelas4(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIps.scoreIpsKelas4 < 1) 0 else scoreManagerIps.scoreIpsKelas4 / 5
                        }
                    }
                }.start()
            }
            "SoalIpsKelas5" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpsKelas5(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIps.scoreIpsKelas5 < 1) 0 else scoreManagerIps.scoreIpsKelas5 / 5
                        }
                    }
                }.start()
            }
            "SoalIpsKelas6" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpsKelas6(),

                    )
                val adapterSD = ViewPagerAdapterSd(fragments,this)
                viewPagerBilangan.adapter = adapterSD
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIps.scoreIpsKelas6 < 1) 0 else scoreManagerIps.scoreIpsKelas6 / 5
                        }
                    }
                }.start()
            }
        }
    }
}