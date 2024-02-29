//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 28 Febuari 2024
//Deskripsi	: Class yang berisi program utama class Titik

public class Titik {
	//atribut
	private float absis;
	private float ordinat;
	private static float counterTitik;

	//Konstruktor
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	public Titik(float absis, float ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik++;
	}

	//Method
	public void setAbsis(float a){
		absis = a;
	}
	
	public void setOrdinat(float o){
		ordinat = o;
	}

	public float getAbsis(){
		return absis;
	}

	public float getOrdinat(){
		return ordinat;
	}

	public static float getCounterTitik(){
		return counterTitik;
	}

	public float getJarakPusat(){
		return (float) Math.sqrt(Math.pow(absis, 2)+Math.pow(ordinat, 2));
	}

	public float refleksiX(){
		return ordinat = ordinat * -1;
	}

	public float refleksiY(){
		return absis = absis * -1;
	}

	public Titik getRefkelksiX(){
		return new Titik(absis, -(ordinat)) ;
	}

	public Titik getRefleksiY(){
		return new Titik(-(absis), ordinat);
	}
}