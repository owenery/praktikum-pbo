//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 3 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Mhs dan WaliMhs

public class Main{
    public static void main(String[] args){
        Mhs x;
        Mhs y;
        Mhs z;
        WaliMhs a;
        WaliMhs b;

        x = new Mhs();
        y = new Mhs("Blubub", "123", "Informatika", new WaliMhs("Bob", "243", "perumahan"));
        a = new WaliMhs("Tere", "54", "Kampung");
        z = new Mhs("Joro", "769", "Ekokeu", a);
        b = new WaliMhs();
        b.setNama("Hendro");
        b.setNomorHp("098");
        b.setAlamat("maskam");
        x.setNama("Rawr");
        x.setNim("746");
        x.setJurusan("Komisi 1");
        x.setWali(b);
        System.out.println("Mahasiswa x :");
        x.cetak();
        System.out.println("Mahasiswa y :");
        y.cetak();
        System.out.println("Mahasiswa z :");
        z.cetak();
    }
}