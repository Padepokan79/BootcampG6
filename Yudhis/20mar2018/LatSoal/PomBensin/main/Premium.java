package main;

public class Premium extends Bensin implements HargaBensin {

	String hari;
	
	public Premium() {
		// TODO Auto-generated constructor stub
	}
	
	public Premium(int penjualan, String hari) {
		// TODO Auto-generated constructor stub
		setPenjualan(penjualan);
		setHarga(hargaPremium);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan premium sebanyak " + getPenjualan() + " liter"
				+ ", dengan total pemasukan " + hitungPemasukan();
	}
	
	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		return getPenjualan() * getHarga();
	}
	
}
