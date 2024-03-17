/*
Tanggal     : 17 Maret 2024
File        : Main.java
Penulis     : David Nugroho
Deskripsi   : Driver dari class person, mahasiswa, dan wali mahasiswa
*/

package Kampus.Main;

import Kampus.Mhs.mhs;
import Kampus.Person.person;
import Kampus.WaliMhs.waliMhs;

public class Main {
    public static void main(String[] args) {
        person Kik = new person("Kik", "3374");
        waliMhs pic = new waliMhs("Pic", "3375", "085", "Gajah Muda");
        mhs kaa = new mhs(Kik.getNama(), Kik.getNik(), "24060", "Seni", pic);
        Kik.cetak();
        pic.cetak();
        kaa.cetak();
        Kik.setNama("KIK");
        Kik.setNik("1234");
        System.out.println("Nama baru dari Kik adalah " + Kik.getNama() + " dengan NIK " + Kik.getNik());
        pic.setNomorHP("0858");
        pic.setAlamat("Kopi II No. 3");
        System.out.println("Pic sebenarnya merupakan mata-mata, nomor handphone dan alamat lamanya adalah " + pic.getNomorHP() + " dan " + pic.getAlamat());
        kaa.setNim("122140112");
        kaa.setJurusan("Nuklir");
        System.out.println("Tak hanya mengganti nama dan NIK, kini Kaa mengganti juga NIM nya menjadi " + kaa.getNim() + " dan jurusannya menjadi " + kaa.getJurusan());
    }
}
