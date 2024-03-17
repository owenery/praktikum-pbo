/*
Tanggal     : 17 Maret 2024
File        : Mhs.java
Penulis     : David Nugroho
Deskripsi   : Representasi dasar dari objek Mahasiswa, turunan dari Person
*/

package Kampus.Mhs;

import Kampus.Person.person;
import Kampus.WaliMhs.waliMhs;

public class mhs extends person {
    //atribut
    private String nim;
    private String jurusan;
    private waliMhs wali;

    //method
    public mhs(String nama, String nik, String nim, String jurusan, waliMhs wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public waliMhs getWaliMhs(){
        return this.wali;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWaliMhs(waliMhs waliMhs){
        this.wali = waliMhs;
    }

    public void cetak(){
        System.out.println(nama + " adalah seorang mahasiswa dengan NIM " + this.getNim() + " dengan jurusan " + this.getJurusan() + " dan memiliki dosen wali bernama " + this.getWaliMhs().getNama());
    }
}
