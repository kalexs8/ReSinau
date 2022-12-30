package com.example.alat;

public final class SoalManager {
    // Batas-batas segmen soal setiap materi dan kelas
    public static final int MATEMATIKA_KELAS1 = 2;

    // Fungsi operasi soal
    public static boolean dijawab(int score, int target, int division){
        return score != 0 &&  score / division == target;
    }
    public static boolean dijawab(int score, int target){
        return score != 0 &&  score / 5 == target;
    }
}
