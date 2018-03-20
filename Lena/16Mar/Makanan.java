package arrayListKartikaSari;

public class Makanan {
	private String tanggalExpired;
	private double beratPerBungkus, harga;
	private String nama, kemasanYangDigunakan, komposisi, rasa;
	
	public Makanan(String tanggalExpired, double beratPerBungkus, double harga, String nama,
			String kemasanYangDigunakan, String komposisi, String rasa) {
		super();
		this.tanggalExpired = tanggalExpired;
		this.beratPerBungkus = beratPerBungkus;
		this.harga = harga;
		this.nama = nama;
		this.kemasanYangDigunakan = kemasanYangDigunakan;
		this.komposisi = komposisi;
		this.rasa = rasa;
	}

	public String getTanggalExpired() {
		return tanggalExpired;
	}

	public void setTanggalExpired(String tanggalExpired) {
		this.tanggalExpired = tanggalExpired;
	}

	public double getBeratPerBungkus() {
		return beratPerBungkus;
	}

	public void setBeratPerBungkus(double beratPerBungkus) {
		this.beratPerBungkus = beratPerBungkus;
	}

	public double getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKemasanYangDigunakan() {
		return kemasanYangDigunakan;
	}

	public void setKemasanYangDigunakan(String kemasanYangDigunakan) {
		this.kemasanYangDigunakan = kemasanYangDigunakan;
	}

	public String getKomposisi() {
		return komposisi;
	}

	public void setKomposisi(String komposisi) {
		this.komposisi = komposisi;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	
}
