package arrayListKartikaSari;

import java.util.Date;

public class ProduksiKartikaSari extends Makanan{
	private String topping, bentuk;
	private int jumlahIsiPerBungkus, ukuranDalamCM;
	
	public ProduksiKartikaSari(String tanggalExpired, double beratPerBungkus, double harga, String nama,
			String kemasanYangDigunakan, String komposisi, String rasa, String topping, String bentuk,
			int jumlahIsiPerBungkus, int ukuranDalamCM) {
		super(tanggalExpired, beratPerBungkus, harga, nama, kemasanYangDigunakan, komposisi, rasa);
		this.topping = topping;
		this.bentuk = bentuk;
		this.jumlahIsiPerBungkus = jumlahIsiPerBungkus;
		this.ukuranDalamCM = ukuranDalamCM;
	}
	
	

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getBentuk() {
		return bentuk;
	}

	public void setBentuk(String bentuk) {
		this.bentuk = bentuk;
	}

	public int getJumlahIsiPerBungkus() {
		return jumlahIsiPerBungkus;
	}

	public void setJumlahIsiPerBungkus(int jumlahIsiPerBungkus) {
		this.jumlahIsiPerBungkus = jumlahIsiPerBungkus;
	}

	public int getUkuranDalamCM() {
		return ukuranDalamCM;
	}

	public void setUkuranDalamCM(int ukuranDalamCM) {
		this.ukuranDalamCM = ukuranDalamCM;
	}
	
	
	
	
}
