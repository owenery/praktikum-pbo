/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : representasi dari objek lingkaran turunan dari bangunDatar
*/

public class Lingkaran extends bangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
