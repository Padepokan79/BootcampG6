
public class Buah {
	private String namaBuah;
	private int stokDalamKg, hargaPerKg;
	
	public Buah(String namaBuah, int stokDalamKg, int hargaPerKg) {
		super();
		this.namaBuah = namaBuah;
		this.stokDalamKg = stokDalamKg;
		this.hargaPerKg = hargaPerKg;
	}

	public String getNamaBuah() {
		return namaBuah;
	}

	public void setNamaBuah(String namaBuah) {
		this.namaBuah = namaBuah;
	}

	public int getStokDalamKg() {
		return stokDalamKg;
	}

	public void setStokDalamKg(int stokDalamKg) {
		this.stokDalamKg = stokDalamKg;
	}

	public int getHargaPerKg() {
		return hargaPerKg;
	}

	public void setHargaPerKg(int hargaPerKg) {
		this.hargaPerKg = hargaPerKg;
	}
	
	
}
