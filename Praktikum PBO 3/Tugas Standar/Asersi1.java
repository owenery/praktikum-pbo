//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Asersi1

public class Asersi1 {
    public static void main(String[] args) {
        int x = -1;
        if (x>0){
            System.out.println("x bilangan positif");
        }
        else {
            assert(x < 0) : "Ada kesalahan code";
            System.out.println("x bilangan negatif");
        }
    }
}
