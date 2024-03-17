/*
Tanggal     : 16 Maret 2024
File        : persegiPanjang.java
Penulis     : David Nugroho
Deskripsi   : Representasi dasar dari objek persegi panjang, turunan kelas poligon
*/

package org.bangunDatar;

import org.poligon.poligon;

public class persegiPanjang extends poligon{
    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar, Integer jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}