package com.example.alat

import android.content.Context

class ScoreManagerPai(context: Context) {

        private val sharedPrefs = context.getSharedPreferences("score_prefs", Context.MODE_PRIVATE)

        fun resetScore() {
            scorePaiKelas1 = 0
            scorePaiKelas2 = 0
            scorePaiKelas3 = 0
            scorePaiKelas4 = 0
            scorePaiKelas5 = 0
            scorePaiKelas6 = 0
            scorePaiKelas7 = 0
            scorePaiKelas8 = 0
            scorePaiKelas9 = 0
            totalScorePai = 0
        }

        var scorePaiKelas1: Int
        get() = sharedPrefs.getInt("score_mat_kelas_1", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_1", v).apply()

        var scorePaiKelas2: Int
        get() = sharedPrefs.getInt("score_mat_kelas_2", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_2", v).apply()

        var scorePaiKelas3: Int
        get() = sharedPrefs.getInt("score_mat_kelas_3", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_3", v).apply()

        var scorePaiKelas4: Int
        get() = sharedPrefs.getInt("score_mat_kelas_4", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_4", v).apply()

        var scorePaiKelas5: Int
        get() = sharedPrefs.getInt("score_mat_kelas_5", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_5", v).apply()

        var scorePaiKelas6: Int
        get() = sharedPrefs.getInt("score_mat_kelas_6", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_6", v).apply()

        var scorePaiKelas7: Int
        get() = sharedPrefs.getInt("score_mat_kelas_7", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_7", v).apply()

        var scorePaiKelas8: Int
        get() = sharedPrefs.getInt("score_mat_kelas_8", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_8", v).apply()

        var scorePaiKelas9: Int
        get() = sharedPrefs.getInt("score_mat_kelas_9", 0)
        set(v) = sharedPrefs.edit().putInt("score_mat_kelas_9", v).apply()








        var totalScorePai: Int
        get() = scorePaiKelas1 + scorePaiKelas1 + scorePaiKelas1 + scorePaiKelas1 +scorePaiKelas1+
                scorePaiKelas1 + scorePaiKelas1 + scorePaiKelas1 + scorePaiKelas1
        set(v) = sharedPrefs.edit().putInt("total_score", v).apply()
    }
