
public class Barang {
	private String namaBarang;
	private double hargaJual, hargaBeli;
	
	public Barang(String namaBarang, double hargaJual, double hargaBeli) {
		this.namaBarang = namaBarang;
		this.hargaJual = hargaJual;
		this.hargaBeli = hargaBeli;
	}
	
	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public double getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(double hargaJual) {
		this.hargaJual = hargaJual;
	}

	public double getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(double hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public double keuntungan() {
		return hargaJual - hargaBeli;
	}
}
