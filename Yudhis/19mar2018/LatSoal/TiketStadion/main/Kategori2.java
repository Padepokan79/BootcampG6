package main;

public class Kategori2 implements HargaTiket {
	
	private int hargaTiket = hargaTiketKategori2;
	int penonton;
	
	public Kategori2() {
		
	}
	
	public Kategori2(int penonton) {
		super();
		this.penonton = penonton;
	}

	public int getHargaTiket() {
		return hargaTiket;
	}
	
	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		return penonton * hargaTiket;
	}
	
}
