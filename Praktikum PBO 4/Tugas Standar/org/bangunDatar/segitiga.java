/*
Tanggal     : 17 Maret 2024
File        : segitiga.java
Penulis     : David Nugroho
Deskripsi   : Representasi dasar dari objek segitiga, turunan kelas poligon
*/

package org.bangunDatar;

import org.poligon.poligon;

public class segitiga extends poligon{
    private double alas, tinggi;

    public segitiga(double alas, double tinggi, Integer jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasS(){
        return alas * tinggi / 2;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());
    }
}
