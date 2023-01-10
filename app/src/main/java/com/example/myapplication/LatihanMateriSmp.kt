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
import com.example.matematika.SoalMatKelas7
import com.example.matematika.SoalMatKelas8
import com.example.matematika.SoalMatKelas9

class LatihanMateriSmp : AppCompatActivity() {

    private lateinit var scoreManagerMatematika: ScoreManagerMatematika
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_materi_smp)
        supportActionBar?.hide()
        val tipeSoal = intent.getStringExtra("POINTER_SOAL")
        val viewPagerBilangan: ViewPager2 = findViewById(R.id.view_pager_bilangan_smp)
        scoreManagerMatematika = ScoreManagerMatematika(applicationContext)
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

        }

    }


}