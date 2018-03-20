package main;

public class LeMan extends Galon implements HargaGalon {

	String hari;
	
	public LeMan() {
		// TODO Auto-generated constructor stub
	}
	
	public LeMan(int penjualan, String hari) {
		// TODO Auto-generated constructor stub
		setHarga(hargaGalonLeMan);
		setPenjualan(penjualan);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan galon LeMan pada " + hari + ", penjualan sebanyak " + getPenjualan() + 
				", pemasukan = " + hitungPemasukan();
	}

	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		return getHarga() * getPenjualan();
	}
	
}
