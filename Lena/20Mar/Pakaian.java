package hashMapTokoPakaian;

public class Pakaian {
	private String jenis;
	private int harga;
	
	public Pakaian(String jenis, int harga) {
		super();
		this.jenis = jenis;
		this.harga = harga;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
}
