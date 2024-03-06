//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Asersi2

class Lingkaran{
    //atribut
    private double jariJari;

    //method
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0) : "Jari jari harus lebih dari 0";
        Lingkaran l = new Lingkaran(jariJari);
        double keliling = l.hitungKeliling();
        System.out.println("Keliling lingkaran l adalah " + keliling);
    }
}

//Terdapat kesalahan pesan pada assertion, dimana kondisi jariJari > 0, namun pesannya hanya jariJari tidak boleh sama dengan 0 yang seharusnya jariJari harus lebih dari 0