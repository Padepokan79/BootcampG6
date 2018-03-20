package main;

public class Telor extends Martabak implements HargaMartabak {
	
	String hari;
	
	public Telor() {
		// TODO Auto-generated constructor stub
	}
	
	public Telor(int penjualan, String hari) {
		if (hari.equals("Sabtu")) {
			// TODO Auto-generated constructor stub
			setPenjualan((int) (penjualan * 0.5 + penjualan));
		} else if (hari.equals("Minggu")) {
			setPenjualan((int) (penjualan * 0.4 + penjualan));
		} else {
			setPenjualan(penjualan);
		}
		
		setHarga(hargaMartabakTelor);
		this.hari = hari;
	}
	
	@Override
	public String toString() {
		return "Penjualan martabak telor sebanyak " + getPenjualan() + ""
				+ ", dengan total pemasukan " + totalPenjualan();
	}

	@Override
	public int totalPenjualan() {
		// TODO Auto-generated method stub
		return getHarga() * getPenjualan();
	}

}
