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

class LatihanMateriSmp : AppCompatActivity() {

    private lateinit var scoreManager: ScoreManager
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_materi_smp)
        supportActionBar?.hide()
        val tipeSoal = intent.getStringExtra("POINTER_SOAL")
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan_smp)
        scoreManager = ScoreManager(applicationContext)
        progressBar = findViewById(R.id.progress_bar_smp)


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
                            progressBar.progress = if(scoreManager.scoreMatKelas7 < 1) 0 else scoreManager.scoreMatKelas7 / 5
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
                            progressBar.progress = if(scoreManager.scoreMatKelas8 < 1) 0 else scoreManager.scoreMatKelas8 / 5
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
                            progressBar.progress = if(scoreManager.scoreMatKelas9 < 1) 0 else scoreManager.scoreMatKelas9 / 5
                        }
                    }
                }.start()

            }

        }

    }


}