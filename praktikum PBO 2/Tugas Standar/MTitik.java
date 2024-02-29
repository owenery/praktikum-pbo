//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 28 Febuari 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Titik

public class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
        Titik t3;
		Titik t4;
		Titik t5;

		t1 = new Titik();
		t2 = new Titik();
        t3 = new Titik(3,4);

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
	}
}