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
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan)
        val fragments: ArrayList<Fragment> = arrayListOf(
            SoalMatKelas1(),
            SoalMatKelas2(),
            SoalMatKelas3(),
            SoalMatKelas4(),
            SoalMatKelas5(),
            SoalMatKelas6()
        )
        val adapterSD = ViewPagerAdapterSd(fragments,this)
        scoreManager = ScoreManager(applicationContext)
        progressBar = findViewById(R.id.progress_bar)
        viewPagerBilangan.adapter = adapterSD


        val closesd = findViewById<ImageView>(R.id.closeSd)
        closesd.setOnClickListener{
            finish()
        }
        progressBar.max = 10
        when (tipeSoal){
            "SoalMatKelas1" ->{
                Thread {
                    while (true){
                        Thread.sleep(1000)
                        Handler(Looper.getMainLooper()).post{
                            progressBar.progress = if(scoreManager.scoreMatKelas1 < 1) 0 else scoreManager.scoreMatKelas1 / 5
                        }
                    }
                }.start()
            }
        }
    }


}