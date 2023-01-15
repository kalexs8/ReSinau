package com.example.alat;

import android.content.Context;
import android.widget.Toast;

public final class SoalManager {
    // Batas-batas segmen soal setiap materi dan kelas
    public static final int MATEMATIKA_KELAS1 = 10;
    public static final int MATEMATIKA_KELAS2 = 10;
    public static final int MATEMATIKA_KELAS3 = 10;
    public static final int MATEMATIKA_KELAS4 = 10;
    public static final int MATEMATIKA_KELAS5 = 12;
    public static final int MATEMATIKA_KELAS6 = 20;
    public static final int MATEMATIKA_KELAS7 = 30;
    public static final int MATEMATIKA_KELAS8 = 40;
    public static final int MATEMATIKA_KELAS9 = 50;
    public static final int PAI_KELAS1 = 10;
    public static final int PAI_KELAS2 = 10;
    public static final int PAI_KELAS3 = 10;
    public static final int PAI_KELAS4 = 15;
    public static final int PAI_KELAS5 = 15;
    public static final int PAI_KELAS6 = 20;

    // Fungsi operasi soal
    public static boolean dijawab(int score, int target, int division){
        return score != 0 &&  score / division == target;
    }
    public static boolean dijawab(int score, int target){
        return score != 0 &&  score / 5 == target;
    }
    // Cek energi kalau masih ada
    public static boolean cek(Context ct, EnergyManager em, String text){
        if(em.getEnergy() == 0){
            Toast.makeText(ct, text, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
