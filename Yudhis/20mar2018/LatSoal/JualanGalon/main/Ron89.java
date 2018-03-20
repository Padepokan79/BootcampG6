package main;

public class Ron89 extends Galon implements HargaGalon {

	String hari;
	
	public Ron89() {
		// TODO Auto-generated constructor stub
	}
	
	public Ron89(int penjualan, String hari) {
		// TODO Auto-generated constructor stub
		setHarga(hargaGalonRon89);
		setPenjualan(penjualan);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan galon Ron89 pada " + hari + ", penjualan sebanyak " + getPenjualan() + 
				", pemasukan = " + hitungPemasukan();
	}

	@Override
	public int hitungPemasukan() {
		// TODO Auto-generated method stub
		return getHarga() * getPenjualan();
	}
	
}
