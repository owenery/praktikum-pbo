/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : Kelas Main dari class kupu dan turunannya
*/

public class Main {
    public static void main(String[] args) {
        //kamus lokal
        ulat K;
        data<kupu> anu;

        //algoritma
        K = new ulat();
        anu = new data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new kupuDewasa());
        anu.getIsi().gerak();
    }
}
