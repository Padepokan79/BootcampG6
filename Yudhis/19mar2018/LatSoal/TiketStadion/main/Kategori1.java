package main;

public class Kategori1 implements HargaTiket {
	
	private int hargaTiket = hargaTiketKategori1;
	int penonton;
	
	public Kategori1() {
		
	}
	
	public Kategori1(int penonton) {
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
