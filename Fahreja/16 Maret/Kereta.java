
public class Kereta {
	private String jenisKelasKereta;
	private int hargaTiket;
	public Kereta(String jenisKelasKereta, int hargaTiket) {
		super();
		this.jenisKelasKereta = jenisKelasKereta;
		this.hargaTiket = hargaTiket;
	}
	
	public int getHargaTiket() {
		return hargaTiket;
	}
	public void setHargaTiket(int hargaTiket) {
		this.hargaTiket = hargaTiket;
	}
	public String getJenisKelasKereta() {
		return jenisKelasKereta;
	}
	
	
}
