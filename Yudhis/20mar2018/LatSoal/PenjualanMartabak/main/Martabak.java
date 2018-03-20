package main;

public abstract class Martabak {
	
	private int harga, penjualan;

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public int getPenjualan() {
		return penjualan;
	}

	public void setPenjualan(int penjualan) {
		this.penjualan = penjualan;
	}
	
	public abstract int totalPenjualan();
}
