package LatihanKartikaSari;

public class AlmondCrispyCheese extends Makanan {
	String ukuranToples;
	int jumlahIsiPerToples;
	
	public AlmondCrispyCheese(String nama, String rasa, String warna, String komposisi, int harga, double berat, String expired, 
			String ukuranToples, int jumlahIsiPerToples) {
		super(nama, rasa, warna, komposisi, harga, berat, expired);
		this.ukuranToples = ukuranToples;
		this.jumlahIsiPerToples = jumlahIsiPerToples;
	}

}
