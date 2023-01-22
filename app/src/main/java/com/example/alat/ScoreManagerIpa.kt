package com.example.alat

import android.content.Context

class ScoreManagerIpa(context: Context) {

    private val sharedPrefs = context.getSharedPreferences("score_prefs", Context.MODE_PRIVATE)

    fun resetScorePai() {
        scoreIpaKelas1 = 0
        scoreIpaKelas2 = 0
        scoreIpaKelas3 = 0
        scoreIpaKelas4 = 0
        scoreIpaKelas5 = 0
        scoreIpaKelas6 = 0
        scoreIpaKelas7 = 0
        scoreIpaKelas8 = 0
        scoreIpaKelas9 = 0
        totalScoreIpa = 0
    }

    var scoreIpaKelas1: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_1", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_1", v).apply()

    var scoreIpaKelas2: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_2", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_2", v).apply()

    var scoreIpaKelas3: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_3", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_3", v).apply()

    var scoreIpaKelas4: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_4", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_4", v).apply()

    var scoreIpaKelas5: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_5", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_5", v).apply()

    var scoreIpaKelas6: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_6", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_6", v).apply()

    var scoreIpaKelas7: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_7", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_7", v).apply()

    var scoreIpaKelas8: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_8", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_8", v).apply()

    var scoreIpaKelas9: Int
        get() = sharedPrefs.getInt("score_ipa_kelas_9", 0)
        set(v) = sharedPrefs.edit().putInt("score_ipa_kelas_9", v).apply()


    var totalScoreIpa: Int
        get() = scoreIpaKelas1 + scoreIpaKelas2 + scoreIpaKelas3 + scoreIpaKelas4 +scoreIpaKelas5+
                scoreIpaKelas6 + scoreIpaKelas7 + scoreIpaKelas8 + scoreIpaKelas9
        set(v) = sharedPrefs.edit().putInt("total_score", v).apply()
}
