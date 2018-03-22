package LatihanKartikaSari;

public class CoklatKoin extends Makanan {
	int diameter;

	public CoklatKoin(String nama, String rasa, String warna, String komposisi, int harga, double berat, String expired,
			int diameter) {
		super(nama, rasa, warna, komposisi, harga, berat, expired);
		this.diameter = diameter;
	}

}
