
public class PenjualBuah {
	private String namaBuah;
	private int hargaBuah, stokBuahDalamKg;
	public PenjualBuah(String namaBuah, int hargaBuah, int stokBuahDalamKg) {
		super();
		this.namaBuah = namaBuah;
		this.hargaBuah = hargaBuah;
		this.stokBuahDalamKg = stokBuahDalamKg;
	}
	public String getNamaBuah() {
		return namaBuah;
	}
	public int getHargaBuah() {
		return hargaBuah;
	}
	public int getStokBuahDalamKg() {
		return stokBuahDalamKg;
	}
	public void setStokBuahDalamKg(int stokBuahDalamKg) {
		this.stokBuahDalamKg = stokBuahDalamKg;
	}
	
}
