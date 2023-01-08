package com.example.matematika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import android.os.Handler
import android.os.Looper
import com.example.alat.ScoreManager

class LatihanMateriSd : AppCompatActivity() {

    private lateinit var scoreManager: ScoreManager
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_materi_sd)
        supportActionBar?.hide()
        val tipeSoal = intent.getStringExtra("POINTER_SOAL")
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan_sd)
        scoreManager = ScoreManager(applicationContext)
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
                            progressBar.progress = if(scoreManager.scoreMatKelas1 < 1) 0 else scoreManager.scoreMatKelas1 / 5
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
                        progressBar.progress = if(scoreManager.scoreMatKelas2 < 1) 0 else scoreManager.scoreMatKelas2 / 5
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
                            progressBar.progress = if(scoreManager.scoreMatKelas3 < 1) 0 else scoreManager.scoreMatKelas3 / 5
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
                            progressBar.progress = if(scoreManager.scoreMatKelas4 < 1) 0 else scoreManager.scoreMatKelas4 / 5
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
                            progressBar.progress = if(scoreManager.scoreMatKelas5 < 1) 0 else scoreManager.scoreMatKelas5 / 5
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
                            progressBar.progress = if(scoreManager.scoreMatKelas6 < 1) 0 else scoreManager.scoreMatKelas6 / 5
                        }
                    }
                }.start()
            }
        }

    }


}