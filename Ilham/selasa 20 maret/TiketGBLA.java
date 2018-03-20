
public class TiketGBLA {
	private String kategori;
	private long hargaTiket;
	private int jumlahPenonton;
	
	public TiketGBLA(String kategori, long harga) {
		this.kategori = kategori;
		this.hargaTiket = harga;
	}

	public int getJumlahPenonton() {
		return jumlahPenonton;
	}

	public void setJumlahPenonton(int jumlahPenonton) {
		this.jumlahPenonton = jumlahPenonton;
	}

	public String getKategori() {
		return kategori;
	}

	public long getHargaTiket() {
		return hargaTiket;
	}
	
	public long pendapatanPerpertandingan() {
		return this.hargaTiket * jumlahPenonton;
	}
	
}
