/*
Tanggal     : 17 Maret 2024
File        : WaliMhs.java
Penulis     : David Nugroho
Deskripsi   : Representasi dasar dari objek wali mahasiswa, turunan dari Person
*/

package Kampus.WaliMhs;

import Kampus.Person.person;

public class waliMhs extends person{
    //atribut
    private String nomorHP;
    private String alamat;

    //method
    public waliMhs(String nama, String nik, String nomorHP, String alamat){
        super(nama, nik);
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNomorHP(){
        return this.nomorHP;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setNomorHP(String nomorHP){
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        System.out.println(nama + " adalah seorang wali dosen dengan nomor handphone " + this.getNomorHP() + " dan alamat " + this.getAlamat());
    }
}