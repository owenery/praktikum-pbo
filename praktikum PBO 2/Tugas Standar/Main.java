//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 28 Febuari 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Titik

public class Main {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
        Titik t3;
		Titik t4;
		Titik t5;
		Garis g1;
		Garis g2;
		Titik t6;
		Titik t7;
		Garis g3;

		t1 = new Titik();
		t2 = new Titik();
        t3 = new Titik(3,4);
		g1 = new Garis(t1, t3);
		t6 = new Titik();
		t7 = new Titik();
		g3 = new Garis(t2, new Titik(1,2));

		t1.setAbsis(5);
		t1.setOrdinat(7);
		t2.setAbsis(5);
		t2.setOrdinat(7);

		float counterTitik;
		float absis;
		float ordinat;

		counterTitik = Titik.getCounterTitik();
		System.out.println("Jumlah objek titik: " + counterTitik);
        
        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        System.out.println("t1("+absis + ", " + ordinat + ")");
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);

        absis = t2.getAbsis();
		ordinat = t2.getOrdinat();
		System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t2("+absis + ", " + ordinat + ")");

        absis = t3.getAbsis();
        ordinat = t3.getOrdinat();
        System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("t3("+ absis + ", " + ordinat + ")");

		absis = t3.getAbsis();
		ordinat = t3.getOrdinat();
		System.out.printf("Jarak ke titik pusat (0,0) adalah %.2f\n", t3.getJarakPusat());
		System.out.println("Jarak ke titik pusat (0,0) adalah " + t3.getJarakPusat());

		absis = t3.getAbsis();
		ordinat = t3.refleksiX();
		System.out.printf("Refleksi titik t3 terhadap sumbu X adalah (%.1f, %.1f)\n", absis, ordinat);

		absis = t3.refleksiY();
		ordinat = t3.getOrdinat();
		System.out.printf("Refleksi titik t3 terhadap sumbu Y adalah (%.1f, %.1f)\n", absis, ordinat);

		absis = t3.getAbsis();
		ordinat = t3.getOrdinat();
		t4 = t3.getRefkelksiX();
		t5 = t3.getRefleksiY();
		System.out.println("titik t4 adalah refleksi titik t3 terhadap sumbu X dengan nilai (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
		System.out.println("titik t5 adalah refleksi titik t3 terhadap sumbu Y dengan nilai (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");

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