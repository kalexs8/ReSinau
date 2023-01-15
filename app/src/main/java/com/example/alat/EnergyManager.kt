package com.example.alat

import android.content.Context
import android.widget.TextView
import android.view.View
import kotlinx.coroutines.*

class EnergyManager(context: Context) {
    val sharedPrefs: android.content.SharedPreferences = context.getSharedPreferences("score_prefs", Context.MODE_PRIVATE)
    private var alreadyCompare: Boolean
        get() = sharedPrefs.getBoolean("already_compare", false)
        set(v) = sharedPrefs.edit().putBoolean("already_compare", v).apply()
    private class HeartUpdater(private val vt: TextView, private val em: TextView, private val hrt: EnergyManager) : Runnable{
        override fun run() {
            RegenerationUpdater(em, hrt).run()
            vt.text = hrt.energy.toString()
            val handl = android.os.Handler(android.os.Looper.getMainLooper())
            handl.postDelayed(this, 1000)
        }
    }
    private class RegenerationUpdater(private val em: TextView, private val inst: EnergyManager): Runnable{
        override fun run() {
            if(!inst.full()){
                val lastTime = Time(inst.sharedPrefs.getLong("time_left_energy", System.currentTimeMillis()))
                val current = Time(System.currentTimeMillis())
                lastTime.hour += 4
                lastTime.minute = 0
                lastTime.second = 0
                if(current.calendarInstance.after(lastTime.calendarInstance)){
                    inst.energy = 3
                    inst.sharedPrefs.edit().putLong("time_left_energy", System.currentTimeMillis()).apply()
                    inst.save()
                    inst.alreadyCompare = false
                }else{
                    val job = Job()
                    val scope = CoroutineScope(Dispatchers.Main + job)
                    val last = inst.sharedPrefs.getLong("time_left_energy", System.currentTimeMillis())
                    val tgtEnd = last + (2 * 60 * 60 * 1000)
                    val remaining = tgtEnd - System.currentTimeMillis()
                    scope.launch{
                        em.visibility = View.VISIBLE
                        while(System.currentTimeMillis() < tgtEnd){
                            val trm = remaining - (System.currentTimeMillis() - tgtEnd)
                            val remSecond = trm / 1000
                            val second = remSecond % 60
                            val minute = remSecond / 60
                            val hour = minute / 60
                            val remMinute = minute % 60
                            em.text = String.format("%s:%s:%s",
                                if(hour.toString().length < 2) "0$hour" else "$hour",
                                if(remMinute.toString().length < 2) "0$remMinute" else "$remMinute",
                                if(second.toString().length < 2) "0$second" else "$second",
                            )
                            delay(1000)
                        }
                        em.visibility = View.GONE
                        inst.save()
                        job.cancel()
                    } // end scope-launch
                    inst.alreadyCompare = false
                }
            }
        }
    }
    var energy: Int
        get() = sharedPrefs.getInt("energy_data", 0)
        set(v) = sharedPrefs.edit().putInt("energy_data", v).apply()

    fun viewUpdater(vt: TextView, em: TextView){
        HeartUpdater(vt, em, this).run()

    }

    fun save(){
        sharedPrefs.edit().putLong("time_left_energy", System.currentTimeMillis()).apply()
    }

    fun saveComp(){
        if(!this.full() && !this.alreadyCompare)
            sharedPrefs.edit().putLong("time_left_energy", System.currentTimeMillis()).apply()
        this.alreadyCompare = true
    }

    fun full(): Boolean{
        return this.energy == 3
    }

}