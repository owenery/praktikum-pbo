/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat representasi objek Helicopter
 */

 public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad){
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
