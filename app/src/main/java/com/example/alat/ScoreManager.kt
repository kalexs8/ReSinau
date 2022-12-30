package com.example.alat

import android.content.Context

class ScoreManager(context: Context) {

    private val sharedPrefs = context.getSharedPreferences("score_prefs", Context.MODE_PRIVATE)

    fun resetScore() {
        scoreMatKelas1 = 0
        scoreMatKelas2 = 0
        totalScore = 0
    }

    var scoreMatKelas1: Int
        get() = sharedPrefs.getInt("score_mat_kelas_1", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_1", v).apply()

    var scoreMatKelas2: Int
        get() = sharedPrefs.getInt("score_mat_kelas_2", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_2", v).apply()

    var totalScore: Int
        get() = scoreMatKelas1 + scoreMatKelas2
        set(v) = sharedPrefs.edit().putInt("total_score", v).apply()
}