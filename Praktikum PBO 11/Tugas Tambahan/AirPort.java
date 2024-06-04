/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat representasi objek AirPort
 */

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane) {
            return "Permission Diterima";
        } else {
            return "Permission Ditolak";
        }
    }
}
