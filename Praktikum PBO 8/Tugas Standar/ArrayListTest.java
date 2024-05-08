/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : Main dari class ArrayListTest
*/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<String>();
        string.add("Praktikum");
        string.add("Collection");
        string.add("Generics");

        for(String s : string){
            System.out.println(s + " ");
        }

        for (int i=0;i<string.size();i++){
            System.out.println(string.get(i) + " ");
        }
    }
}