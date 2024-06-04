/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat Main dari lambdaMap
 */

import java.util.HashMap;

public class lambdaMap {
    public static void main(String[] srgs){
        HashMap<Integer, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put(2, " Ang");
        mahasiswaList.put(3, " Ban");
        mahasiswaList.put(1, " Cak");
        
        mahasiswaList.forEach((key, value) -> System.out.println(key + value));
    }
}