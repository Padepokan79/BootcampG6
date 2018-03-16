package main;

public abstract class Buah {
	
	private int harga, jumlahLaku;
	private String hari;
		
	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public int getJumlahLaku() {
		return jumlahLaku;
	}

	public void setJumlahLaku(int jumlahLaku) {
		this.jumlahLaku = jumlahLaku;
	}

	public String getHari() {
		return hari;
	}

	public void setHari(String hari) {
		this.hari = hari;
	}

	public abstract int totalPemasukan();
	
}
