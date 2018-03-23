
public class Printing {
	private String jenis;
	private double hargaPer, biayaTambahanPerMeter;
	private int rataRataPengunjungPerhari, jumlahKertas, panjang, lebar, minPanjang, minLebar;
	
	public Printing(String jenis, double harga, int rataRataPengunjungPerhari) {
		this.jenis = jenis;
		this.hargaPer = harga;
		this.rataRataPengunjungPerhari = rataRataPengunjungPerhari;
	}
	
	public Printing(String jenis, double harga, int rataRataPengunjungPerhari, int minPanjang, int minLebar, double biayaTambahanPerMeter) {
		this.jenis = jenis;
		this.hargaPer = harga;
		this.rataRataPengunjungPerhari = rataRataPengunjungPerhari;
		this.minPanjang = minPanjang;
		this.minLebar = minLebar;
		this.biayaTambahanPerMeter = biayaTambahanPerMeter;
	}

	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}

	public String getJenis() {
		return jenis;
	}

	public double getHargaPer() {
		return hargaPer;
	}

	public double getBiayaTambahanPerMeter() {
		return biayaTambahanPerMeter;
	}

	public int getRataRataPengunjungPerhari() {
		return rataRataPengunjungPerhari;
	}
	
	public int getJumlahKertas() {
		return jumlahKertas;
	}

	public void setJumlahKertas(int jumlahKertas) {
		this.jumlahKertas = jumlahKertas;
	}

	public long pendapatanPerpengunjung() {
		if (!this.jenis.equalsIgnoreCase("Kertas Biasa")) {
			this.panjang = this.panjang - this.minPanjang;
			this.lebar = this.lebar - this.minLebar;
			return (long) (this.hargaPer + (this.panjang * biayaTambahanPerMeter) + (this.lebar * this.biayaTambahanPerMeter));
		} else {
			return (long) (this.hargaPer * this.jumlahKertas);	
		}
	}
}
