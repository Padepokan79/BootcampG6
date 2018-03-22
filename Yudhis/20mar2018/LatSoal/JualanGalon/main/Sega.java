package main;

public class Sega extends Galon implements HargaGalon {

	String hari;
	
	public Sega() {
		// TODO Auto-generated constructor stub
	}
	
	public Sega(int penjualan, String hari) {
		// TODO Auto-generated constructor stub
		setHarga(hargaGalonSega);
		setPenjualan(penjualan);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan galon Sega pada " + hari + ", penjualan sebanyak " + getPenjualan() + 
				", pemasukan = " + hitungPemasukan();
	}

	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		return getHarga() * getPenjualan();
	}
	
}
