package keretaApi;

public class Kereta {
	private String namaGerbong;
	private int hargaTiket;
	
	public Kereta(String namaGerbong, int hargaTiket) {
		super();
		this.namaGerbong = namaGerbong;
		this.hargaTiket = hargaTiket;
	}

	public String getNamaGerbong() {
		return namaGerbong;
	}

	public void setNamaGerbong(String namaGerbong) {
		this.namaGerbong = namaGerbong;
	}

	public int getHargaTiket() {
		return hargaTiket;
	}

	public void setHargaTiket(int hargaTiket) {
		this.hargaTiket = hargaTiket;
	}

}
