package com.example.alat

import android.content.Context

class ScoreManagerIps(context: Context) {

    private val sharedPrefs = context.getSharedPreferences("score_prefs", Context.MODE_PRIVATE)

    fun resetScorePai() {
        scoreIpsKelas1 = 0
        scoreIpsKelas2 = 0
        scoreIpsKelas3 = 0
        scoreIpsKelas4 = 0
        scoreIpsKelas5 = 0
        scoreIpsKelas6 = 0
        scoreIpsKelas7 = 0
        scoreIpsKelas8 = 0
        scoreIpsKelas9 = 0
        totalScoreIps = 0
    }

    var scoreIpsKelas1: Int
        get() = sharedPrefs.getInt("score_ips_kelas_1", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_1", v).apply()

    var scoreIpsKelas2: Int
        get() = sharedPrefs.getInt("score_ips_kelas_2", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_2", v).apply()

    var scoreIpsKelas3: Int
        get() = sharedPrefs.getInt("score_ips_kelas_3", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_3", v).apply()

    var scoreIpsKelas4: Int
        get() = sharedPrefs.getInt("score_ips_kelas_4", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_4", v).apply()

    var scoreIpsKelas5: Int
        get() = sharedPrefs.getInt("score_ips_kelas_5", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_5", v).apply()

    var scoreIpsKelas6: Int
        get() = sharedPrefs.getInt("score_ips_kelas_6", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_6", v).apply()

    var scoreIpsKelas7: Int
        get() = sharedPrefs.getInt("score_ips_kelas_7", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_7", v).apply()

    var scoreIpsKelas8: Int
        get() = sharedPrefs.getInt("score_ips_kelas_8", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_8", v).apply()

    var scoreIpsKelas9: Int
        get() = sharedPrefs.getInt("score_ips_kelas_9", 0)
        set(v) = sharedPrefs.edit().putInt("score_ips_kelas_9", v).apply()


    var totalScoreIps: Int
        get() = scoreIpsKelas1 + scoreIpsKelas2 + scoreIpsKelas3 + scoreIpsKelas4 +scoreIpsKelas5+
                scoreIpsKelas6 + scoreIpsKelas7 + scoreIpsKelas8 + scoreIpsKelas9
        set(v) = sharedPrefs.edit().putInt("total_score", v).apply()
}
