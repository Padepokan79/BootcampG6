package main;

public abstract class Kereta {
	
	private int hari, harga, penumpang;
		
	public int getHari() {
		return hari;
	}
	
	public void setHari(int hari) {
		this.hari = hari;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public int getPenumpang() {
		return penumpang;
	}

	public void setPenumpang(int penumpang) {
		this.penumpang = penumpang;
	}

	public abstract int totalPemasukan();
	
}
