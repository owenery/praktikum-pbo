//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 28 Febuari 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Garis

public class MGaris {
	public static void main(String[] args) {
		Garis g1;
		Garis g2;
		Titik t6;
		Titik t7;
		Garis g3;

		g1 = new Garis(new Titik(5, 7), new Titik(3, 4));
		t6 = new Titik();
		t7 = new Titik();
		g3 = new Garis(new Titik(5, 7), new Titik(1,2));

		System.out.println("Panjang dari garis g1 adalah " + g1.getPanjang());
		System.out.println("Gradien dari garis g2 adalah " + g1.getGradien());

		g2 = g1.getRefleksiGaris();
		t6 = g2.getTitikAwal();
		t7 = g2.getTitikAkhir();
		System.out.println("Refleksi dari garis g1 berada pada titik (" + t6.getAbsis() + ", " + t6.getOrdinat() + ") dan (" + t7.getAbsis() + ", " + t7.getOrdinat() + ")");

		if (g3.isTegakLurus(g2)) {
			System.out.println("Kedua garis tegak lurus");
		}
		else {
			System.out.println("Kedua garis tidak tegak lurus");
		}
	}
}