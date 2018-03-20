
public class Makanan {
	private String nama;
	private int harga,berat;
	
	public Makanan(String nama, int harga, int berat) {
		super();
		this.nama = nama;
		this.harga = harga;
		this.berat = berat;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public int getBerat() {
		return berat;
	}

	public void setBerat(int berat) {
		this.berat = berat;
	}
}
