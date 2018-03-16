
public class Makanan {
	private String nama, rasa;
	private int berat;

	public Makanan(String nama, String rasa, int berat) {
		super();
		this.nama = nama;
		this.rasa = rasa;
		this.berat = berat;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public int getBerat() {
		return berat;
	}

	public void setBerat(int berat) {
		this.berat = berat;
	}
	
}

