/*
Nama        : David Nugroho
NIM         : 24060122130074
Tanggal     : 8 April 2024
Deskripsi   : Kelas konstruksi generics untuk kupu
*/

public class data<T extends kupu> {
    private T Kupu;

    public T getIsi(){
        return Kupu;
    }

    public void setIsi(T tipeKupu){
        Kupu = tipeKupu;
    }
}
