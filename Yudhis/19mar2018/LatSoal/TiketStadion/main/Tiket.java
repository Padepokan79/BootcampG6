package main;

public class Tiket {
	
	private int pemasukan;
	int pertandingan = 0;
	
	Kategori1 kategori1 = new Kategori1();
	Kategori2 kategori2 = new Kategori2();
	
	public Tiket() {
		
	}
	
	public Tiket(int penontonKategori1, int penontonKategori2, int pertandingan) {
		// TODO Auto-generated constructor stub
		kategori1 = new Kategori1(penontonKategori1);
		kategori2 = new Kategori2(penontonKategori2);
		this.pertandingan = pertandingan;
		pemasukan = hitungPemasukan();
	}
	
	public int getPemasukan() {
		return pemasukan;
	}

	public void setPemasukan(int pemasukan) {
		this.pemasukan = pemasukan;
	}
	
	@Override
	public String toString() {
		return "Pemasukan tiket pertandingan ke-" + pertandingan + " sebesar " + getPemasukan();
	}

	public int hitungPemasukan() {
		return kategori1.hitungPemasukan() + kategori2.hitungPemasukan();
	}
	
}
