//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 3 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class WaliMhs

public class WaliMhs {
    //Atribut
    private String nama;
    private String nomorHp;
    private String alamat;
    static double counterWali;

    //Konstruktor
    public WaliMhs(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        counterWali++;
    }

    public WaliMhs(){
        nama = "-";
        nomorHp = "-";
        alamat = "-";
    }

    public String getNama(){
        return nama;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }

    static double counterWali(){
        return counterWali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
