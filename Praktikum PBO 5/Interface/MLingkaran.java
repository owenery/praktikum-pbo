/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 23 Maret 2024
Deskripsi   : implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;
public class MLingkaran {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jejari lingkaran: ");
        double r = scan.nextDouble();
        lingkaran l = new lingkaran(r);
        System.out.println("Luas lingkaran dengan"+
        " jejari " + r + " satuan adalah "+l.hitungLuas());
        scan.close();
    }
}