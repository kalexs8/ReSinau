package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import android.os.Handler
import android.os.Looper
import com.example.alat.ScoreManagerMatematika
import com.example.alat.ScoreManagerPai
import com.example.matematika.*
import com.example.pai.SoalPaiKelas1

class LatihanMateriSd : AppCompatActivity() {

    private lateinit var scoreManagerMatematika: ScoreManagerMatematika
    private lateinit var scoreManagerPai: ScoreManagerPai
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_materi_sd)
        supportActionBar?.hide()
        val tipeSoal = intent.getStringExtra("POINTER_SOAL")
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan_sd)
        scoreManagerMatematika = ScoreManagerMatematika(applicationContext)
        progressBar = findViewById(R.id.progress_bar_sd)


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
        }


    }


}