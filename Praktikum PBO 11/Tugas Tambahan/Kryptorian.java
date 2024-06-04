/*
 * Nama         : David Nugroho
 * NIM          : 24060122130074
 * Tanggal      : 4 Juni 2024
 * Deskripsi    : Membuat abstrak Kryptorian.java
 */

public abstract class Kryptorian extends Animal implements IFlyer{
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