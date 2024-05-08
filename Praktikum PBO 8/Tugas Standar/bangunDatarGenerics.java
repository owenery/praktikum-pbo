/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : Kelas konstrukti generics untuk bangunDatar
*/

public class bangunDatarGenerics<T extends bangunDatar> {
    private T BangunDatar;

    public void set(T tipeBangunDatar){
        BangunDatar = tipeBangunDatar;
    }

    public T get(){
        return BangunDatar;
    }

    public double hitungKeliling(){
        return BangunDatar.hitungKeliling();
    }
}
