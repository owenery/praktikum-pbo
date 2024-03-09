public class Main {
    public static void main(String[] args) {
        Anggota a = new Anggota("Tere");
        Anggota b = new Anggota("Liye");
        Buku c = new Buku("Bumi");
        Buku d = new Buku("Matahari");
        Buku e = new Buku("Bulan");
        Buku f = new Buku("Bintang");

        try {
            a.pinjamBuku(c);
            b.pinjamBuku(c);

        }
        catch (BukuTidakTersediaException g) {
            System.out.println(g.getMessage());
        }
        catch (MaksimumBukuTerpinjamException h){
            System.out.println(h.getMessage());
        }
        try {
            a.pinjamBuku(d);
            a.pinjamBuku(e);
            a.pinjamBuku(f);
        }
        catch (BukuTidakTersediaException g) {
            System.out.println(g.getMessage());
        }
        catch (MaksimumBukuTerpinjamException h){
            System.out.println(h.getMessage());
        }
    }
}    