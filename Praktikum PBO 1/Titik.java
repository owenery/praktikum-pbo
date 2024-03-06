//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 21 Febuari 2024
//Deskripsi	: Class yang berisi program utama untuk class Titik

public class Titik {
	float absis;
	float ordinat;
	static float counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(float absis, float ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik++;
	}

	void setAbsis(float a){
		absis = a;
	}
	
	void setOrdinat(float o){
		ordinat = o;
	}

	float getAbsis(){
		return absis;
	}

	float getOrdinat(){
		return ordinat;
	}

	static float getCounterTitik(){
		return counterTitik;
	}
}
