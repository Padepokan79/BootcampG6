package main;

public class Pertalite extends Bensin implements HargaBensin {

	String hari;
	
	public Pertalite() {
		// TODO Auto-generated constructor stub
	}
	
	public Pertalite(int penjualan, String hari) {
		// TODO Auto-generated constructor stub
		setPenjualan(penjualan);
		setHarga(hargaPertalite);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan pertalite sebanyak " + getPenjualan() + " liter"
				+ ", dengan total pemasukan " + hitungPemasukan();
	}
	
	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		return getPenjualan() * getHarga();
	}
	
}
