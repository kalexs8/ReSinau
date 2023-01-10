package com.example.alat

import android.content.Context

class ScoreManagerMatematika(context: Context) {

    private val sharedPrefs = context.getSharedPreferences("score_prefs", Context.MODE_PRIVATE)

    fun resetScore() {
        scoreMatKelas1 = 0
        scoreMatKelas2 = 0
        scoreMatKelas3 = 0
        scoreMatKelas4 = 0
        scoreMatKelas5 = 0
        scoreMatKelas6 = 0
        scoreMatKelas7 = 0
        scoreMatKelas8 = 0
        scoreMatKelas9 = 0
        totalScoreMat = 0
    }

    var scoreMatKelas1: Int
        get() = sharedPrefs.getInt("score_mat_kelas_1", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_1", v).apply()

    var scoreMatKelas2: Int
        get() = sharedPrefs.getInt("score_mat_kelas_2", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_2", v).apply()

    var scoreMatKelas3: Int
        get() = sharedPrefs.getInt("score_mat_kelas_3", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_3", v).apply()

    var scoreMatKelas4: Int
        get() = sharedPrefs.getInt("score_mat_kelas_4", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_4", v).apply()

    var scoreMatKelas5: Int
        get() = sharedPrefs.getInt("score_mat_kelas_5", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_5", v).apply()

    var scoreMatKelas6: Int
        get() = sharedPrefs.getInt("score_mat_kelas_6", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_6", v).apply()

    var scoreMatKelas7: Int
        get() = sharedPrefs.getInt("score_mat_kelas_7", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_7", v).apply()

    var scoreMatKelas8: Int
        get() = sharedPrefs.getInt("score_mat_kelas_8", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_8", v).apply()

    var scoreMatKelas9: Int
        get() = sharedPrefs.getInt("score_mat_kelas_9", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_9", v).apply()








    var totalScoreMat: Int
        get() = scoreMatKelas1 + scoreMatKelas2 + scoreMatKelas3 +scoreMatKelas4 +scoreMatKelas5+
                scoreMatKelas6 + scoreMatKelas7 + scoreMatKelas8 + scoreMatKelas9
        set(v) = sharedPrefs.edit().putInt("total_score", v).apply()
}