
public class Keripik extends Makanan{
	private String jenisKeripik;
	private int harga;
	
	public Keripik(String nama, String rasa, int berat, String jenisKeripik, int harga) {
		super(nama, rasa, berat);
		this.jenisKeripik = jenisKeripik;
		this.harga = harga;
	}

	public String getJenisKeripik() {
		return jenisKeripik;
	}

	public void setJenisKeripik(String jenisKeripik) {
		this.jenisKeripik = jenisKeripik;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
}
