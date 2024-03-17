/*
Tanggal     : 17 Maret 2024
File        : Person.java
Penulis     : David Nugroho
Deskripsi   : Representasi dasar dari objek Person
*/

package Kampus.Person;

public class person{
    //atribut
    protected String nama;
    protected String nik;

    //method
    public person(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNik(){
        return this.nik;
    }

    public void setNama(String nama){
        this.nama  = nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public  void cetak(){
        System.out.println("Seorang bernama " + this.getNama() + " dengan NIK " + this.getNik());
    }
}