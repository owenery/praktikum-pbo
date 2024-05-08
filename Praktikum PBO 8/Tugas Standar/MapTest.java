/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : Main dari class MapTest
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");

        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();

        for (Integer keys : key){
            System.out.println(map.get(keys));
        }
    }
}
