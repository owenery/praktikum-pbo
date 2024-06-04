/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat abstract class Airplane.java
 */

public abstract class Airplane extends Vehicle implements IFlyer{
    @Override
    public void takeOff(){}

    @Override
    public void land(){}

    @Override
    public void fly(){}

    @Override
    public String StringtoString(){
        return this.getClass().getSimpleName();
    }
}
