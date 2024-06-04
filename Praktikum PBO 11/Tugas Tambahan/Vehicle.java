/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat abstrak Vehicle.java
 */

public abstract class Vehicle {
    public abstract double calcFuelEfficency();
    public abstract double calcTripDistance();

    public String StringtoString(){
        return this.getClass().getSimpleName();
    }
}
