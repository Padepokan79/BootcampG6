package main;

public abstract class Tiket {

	private int penonton;
	private int harga;
	
	public int getPenonton() {
		return penonton;
	}
	
	public void setPenonton(int penonton) {
		this.penonton = penonton;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public abstract int hitungPemasukan();
	
}
