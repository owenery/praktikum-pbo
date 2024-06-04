/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat representasi objek SeaPlane
 */

public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public double calcFuelEfficency(){
        return 0;
    }

    @Override
    public double calcTripDistance(){
        return 0;
    }
}
