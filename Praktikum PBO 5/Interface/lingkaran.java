/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 23 Maret 2024
Deskripsi   : Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;
public class lingkaran implements IArea{
    private double jejari;
    public lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI *jejari*jejari;
    }
}