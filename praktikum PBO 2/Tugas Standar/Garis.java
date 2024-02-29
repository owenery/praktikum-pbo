//Nama		: David Nugroho
//NIM		: 24060122130074
//Tanggal	: 28 Febuari 2024
//Deskripsi	: Class yang berisi program utama untuk mengaplikasikan class Garis

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    static double counterGaris;
    
    //konstruktor
    public Garis(){
      titikAwal = new Titik();
      titikAkhir = new Titik();
      counterGaris++;
    }
  
    public Garis(Titik titikAwal, Titik titikAkhir){
      this.titikAwal = titikAwal;
      this.titikAkhir = titikAkhir;
      counterGaris++;
    }
    
    //method getter dan setter
    public Titik getTitikAwal(){
      return this.titikAwal;
    }
  
    public Titik getTitikAkhir(){
      return this.titikAkhir;
    }
  
    public static double getCounterGaris(){
      return counterGaris;
    }
  
    public void setTitikAwal(Titik titikAwal){
      this.titikAwal = titikAwal;
    }
  
    public void setTitikAkhir(Titik titikAkhir){
      this.titikAkhir = titikAkhir;
    }

    public float getPanjang(){
      double dx = (titikAwal.getAbsis()-titikAkhir.getAbsis());
      double dy = (titikAwal.getOrdinat()-titikAkhir.getOrdinat());
      return (float) Math.pow(Math.pow(dx, 2) + Math.pow(dy, 2), 0.5);
    }

    public float getGradien(){
      return (float) (titikAwal.getAbsis()-titikAkhir.getAbsis())/(titikAwal.getOrdinat()-titikAkhir.getOrdinat());
    }

    public Garis getRefleksiGaris(){
      return new Garis(titikAwal.getRefleksiY(), titikAkhir.getRefleksiY());
    }

    public boolean isTegakLurus(Garis g){
      return this.getGradien()*g.getGradien() == -1;
    }
  }