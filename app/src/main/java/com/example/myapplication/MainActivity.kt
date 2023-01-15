package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Lesson())



        binding.menuBawahNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.lesson -> replaceFragment(Lesson())
                R.id.contest -> replaceFragment(Contest())
                R.id.score -> replaceFragment(Score())
                R.id.contact -> replaceFragment(Contact())
                R.id.profile -> replaceFragment(Profile())

                else ->{

                }
            }
                true

        }




    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameNavBottom,fragment)
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.lesson_menu, menu)

        return true
    }
//    override fun onPause(){
//        super.onPause()
//        val pref = applicationContext.getSharedPreferences("score_prefs", android.content.Context.MODE_PRIVATE)
//        if(!com.example.alat.EnergyManager(this).full()){
//            pref.edit().putLong("time_left_energy", if(pref.getLong("time_left_energy", System.currentTimeMillis()) < System.currentTimeMillis())
//                pref.getLong("time_left_energy", System.currentTimeMillis())
//            else
//                System.currentTimeMillis()
//            ).apply()
//            println("Invoked pause, saving current time_left_energy...")
//        }
//    }
//
//    override fun onStop() {
//        super.onStop()
//        val pref = applicationContext.getSharedPreferences("score_prefs", android.content.Context.MODE_PRIVATE)
//        if(!com.example.alat.EnergyManager(this).full()){
//            pref.edit().putLong("time_left_energy", if(pref.getLong("time_left_energy", System.currentTimeMillis()) < System.currentTimeMillis())
//                    pref.getLong("time_left_energy", System.currentTimeMillis())
//                    else
//                        System.currentTimeMillis()
//                ).apply()
//            println("Invoked stop, saving current time_left_energy...")
//        }
//    }
}