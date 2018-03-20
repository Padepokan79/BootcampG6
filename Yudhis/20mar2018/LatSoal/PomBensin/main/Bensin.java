package main;

public abstract class Bensin {
	
	private int penjualan, harga;
	
	public int getPenjualan() {
		return penjualan;
	}

	public void setPenjualan(int penjualan) {
		this.penjualan = penjualan;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public abstract int hitungPemasukan();
	
}
