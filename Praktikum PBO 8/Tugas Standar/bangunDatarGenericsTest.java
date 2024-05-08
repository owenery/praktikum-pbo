/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : Main dari class bangunDatarGenerics
*/

public class bangunDatarGenericsTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        bangunDatarGenerics<Lingkaran> bdg = new bangunDatarGenerics<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generics : " + bdg.get().getClass().getName());
    }
}
