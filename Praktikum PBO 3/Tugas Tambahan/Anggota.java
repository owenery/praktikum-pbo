public class Anggota {
    //atribut
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    //method
    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman == 3){
            throw new MaksimumBukuTerpinjamException(this.getNama() + " Telah mencapai batas peminjaman.");
        }
        if (!buku.isTersedia()){
            throw new BukuTidakTersediaException("Maaf " + this.getNama() + ", Buku berjudul " + buku.getJudul() + " sedang tidak tersedia.");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
        System.out.println("Buku berjudul " + buku.getJudul() + " telah dipinjam oleh " + this.getNama() + ". Jumlah buku yang dipinjam olehnya berjumlah " + this.getJumlahBukuPinjaman());
    }
}