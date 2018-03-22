package main;

public class Manis extends Martabak implements HargaMartabak {
	
	String hari;
	
	public Manis() {
		// TODO Auto-generated constructor stub
	}
	
	public Manis(int penjualan, String hari) {
		if (hari.equals("Sabtu")) {
			// TODO Auto-generated constructor stub
			setPenjualan((int) (penjualan * 0.5 + penjualan));
		} else if (hari.equals("Minggu")) {
			setPenjualan((int) (penjualan * 0.4 + penjualan));
		} else {
			setPenjualan(penjualan);
		}
		
		setHarga(hargaMartabakManis);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan martabak manis sebanyak " + getPenjualan() + ""
				+ ", dengan total pemasukan " + totalPenjualan();
	}

	@Override
	public int totalPenjualan() {
		// TODO Auto-generated method stub
		return getHarga() * getPenjualan();
	}

}
