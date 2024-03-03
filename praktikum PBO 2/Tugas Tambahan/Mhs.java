//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 3 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class Mhs

public class Mhs {
    //Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMhs wali;
    static double counterMhs;

    //Konstruktor
    public Mhs(String nama, String nim, String jurusan, WaliMhs wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
        counterMhs++;
    }

    public Mhs(){
        nama = "-";
        nim = "-";
        jurusan = "-";
        wali = new WaliMhs();
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public  String getJurusan(){
        return jurusan;
    }

    public WaliMhs getWali(){
        return wali;
    }

    static double counterMhs(){
        return counterMhs;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMhs wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama mahasiswa          : " + nama);
        System.out.println("NIM mahasiswa           : " + nim);
        System.out.println("Jurusan mahasiswa       : " + jurusan);
        System.out.println("Nama wali mahasiswa     : " + wali.getNama());
        System.out.println("Nomor HP wali mahasiswa : " + wali.getNomorHp());
        System.out.println("Alamat wali mahasiswa   : " + wali.getAlamat());
    }
}
