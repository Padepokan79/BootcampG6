package penjualBuah;

public class Buah {
	private String namaBuah;
	private int harga;
	
	public Buah(String namaBuah, int harga) {
		super();
		this.namaBuah = namaBuah;
		this.harga = harga;
	}

	public String getNamaBuah() {
		return namaBuah;
	}

	public void setNamaBuah(String namaBuah) {
		this.namaBuah = namaBuah;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
}
