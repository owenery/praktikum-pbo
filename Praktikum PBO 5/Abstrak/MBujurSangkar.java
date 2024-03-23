/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 23 Maret 2024
Deskripsi   : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;
public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bujurSangkar bs = new bujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi =  scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+ sisi + 
        " satuan adalah "+bs.hitungLuas(sisi));
        
        scan.close();
    }
}