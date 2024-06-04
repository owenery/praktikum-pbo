/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat abstrak Animal.java
 */

public abstract class Animal{
    public abstract void eat();
    public String StringtoString(){
        return this.getClass().getSimpleName();
    }
}