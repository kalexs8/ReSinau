package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import android.os.Handler
import android.os.Looper
import com.example.alat.EnergyManager
import com.example.alat.ScoreManagerIpa
import com.example.alat.ScoreManagerMatematika
import com.example.alat.ScoreManagerPai
import com.example.ipa.SoalIpaKelas7
import com.example.ipa.SoalIpaKelas8
import com.example.ipa.SoalIpaKelas9
import com.example.matematika.SoalMatKelas7
import com.example.matematika.SoalMatKelas8
import com.example.matematika.SoalMatKelas9
import com.example.pai.SoalPaiKelas7
import com.example.pai.SoalPaiKelas8
import com.example.pai.SoalPaiKelas9

class LatihanMateriSmp : AppCompatActivity() {

    private lateinit var scoreManagerMatematika: ScoreManagerMatematika
    private lateinit var scoreManagerPai: ScoreManagerPai
    private lateinit var scoreManagerIpa: ScoreManagerIpa

    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_materi_smp)
        supportActionBar?.hide()
        val tipeSoal = intent.getStringExtra("POINTER_SOAL")
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan_smp)
        scoreManagerMatematika = ScoreManagerMatematika(applicationContext)
        scoreManagerPai = ScoreManagerPai(applicationContext)
        scoreManagerIpa = ScoreManagerIpa(applicationContext)
        progressBar = findViewById(R.id.progress_bar_smp)
        val heart = EnergyManager(applicationContext)
        heart.viewUpdater(findViewById(R.id.heartsCount), findViewById(R.id.timerView3))


        val closesd = findViewById<ImageView>(R.id.closeSmp)
        closesd.setOnClickListener{
            finish()
        }
        progressBar.max = 10
        when (tipeSoal){
            "SoalMatKelas7" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas7(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas7 < 1) 0 else scoreManagerMatematika.scoreMatKelas7 / 5
                        }
                    }
                }.start()
            }
            "SoalMatKelas8" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas8(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas8 < 1) 0 else scoreManagerMatematika.scoreMatKelas8 / 5
                        }
                    }
                }.start()
            }
            "SoalMatKelas9" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalMatKelas9(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerMatematika.scoreMatKelas9 < 1) 0 else scoreManagerMatematika.scoreMatKelas9 / 5
                        }
                    }
                }.start()

            }
            "SoalPaiKelas7" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas7(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas7< 1) 0 else scoreManagerPai.scorePaiKelas7 / 5
                        }
                    }
                }.start()

            }
            "SoalPaiKelas8" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas8(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas8< 1) 0 else scoreManagerPai.scorePaiKelas8 / 5
                        }
                    }
                }.start()

            }
            "SoalPaiKelas9" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalPaiKelas9(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerPai.scorePaiKelas9< 1) 0 else scoreManagerPai.scorePaiKelas9 / 5
                        }
                    }
                }.start()

            }
            "SoalIpaKelas7" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas7(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas7< 1) 0 else scoreManagerIpa.scoreIpaKelas7 / 5
                        }
                    }
                }.start()

            }
            "SoalIpaKelas8" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas8(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas8< 1) 0 else scoreManagerIpa.scoreIpaKelas8 / 5
                        }
                    }
                }.start()
            }
            "SoalIpaKelas9" ->{
                val fragments: ArrayList<Fragment> = arrayListOf(
                    SoalIpaKelas9(),
                )
                val adapterSmp = ViewPagerAdapterSmp(fragments,this)
                viewPagerBilangan.adapter = adapterSmp
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManagerIpa.scoreIpaKelas9< 1) 0 else scoreManagerIpa.scoreIpaKelas9 / 5
                        }
                    }
                }.start()
            }





        }

    }


}