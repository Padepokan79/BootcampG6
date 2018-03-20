package EnamBelasMaret2018;

public class Buah {
	String namaBuah;
	private int hargaBuahPerKg;
	
	public Buah(String namaBuah, int hargaBuahPerKg) {
		super();
		this.namaBuah = namaBuah;
		this.hargaBuahPerKg = hargaBuahPerKg;
	}

	public int getHargaBuahPerKg() {
		return hargaBuahPerKg;
	}

	public void setHargaBuahPerKg(int hargaBuahPerKg) {
		this.hargaBuahPerKg = hargaBuahPerKg;
	}
	
}