package arrayListKartikaSari;

public class CuankiCup extends Makanan{
	private String tanggalProduksi;
	private String isiYangTerkandung;
	
	public CuankiCup(String tanggalExpired, double beratPerBungkus, double harga, String nama,
			String kemasanYangDigunakan, String komposisi, String rasa, String tanggalProduksi,
			String isiYangTerkandung) {
	
		super(tanggalExpired, beratPerBungkus, harga, nama, kemasanYangDigunakan, komposisi, rasa);
		this.tanggalProduksi = tanggalProduksi;
		this.isiYangTerkandung = isiYangTerkandung;
	}

	public String getTanggalProduksi() {
		return tanggalProduksi;
	}

	public void setTanggalProduksi(String tanggalProduksi) {
		this.tanggalProduksi = tanggalProduksi;
	}

	public String getIsiYangTerkandung() {
		return isiYangTerkandung;
	}

	public void setIsiYangTerkandung(String isiYangTerkandung) {
		this.isiYangTerkandung = isiYangTerkandung;
	}
	
	
	
	
}
