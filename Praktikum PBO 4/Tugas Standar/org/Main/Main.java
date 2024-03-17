/*
Tanggal     : 16 Maret 2024
File        : Main.java
Penulis     : David Nugroho
Deskripsi   : Driver class untuk poligon, persegi panjang, dan segitiga
*/

package org.Main;

import org.bangunDatar.*;

public class Main {
    public static void main(String[] args) {
        persegiPanjang persegi = new persegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang : " + persegi.hitungLuas());

        segitiga Segitiga = new segitiga(10, 5, 3);
        Segitiga.printInfo();
        System.out.println("Luas segitiga : " + Segitiga.hitungLuasS());
    }
}
