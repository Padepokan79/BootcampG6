//SOAL Teh Lena no.1

public class Barang {
	String namaBarang;
	int hargaJual, hargaBeli;
	
	
	public Barang() {
		// TODO Auto-generated constructor stub
	}
	
	public Barang(String namaBarang, int hargaJual, int hargaBeli) {
		super();
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
	public int getHargaJual() {
		return hargaJual;
	}
	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}
	public int getHargaBeli() {
		return hargaBeli;
	}
	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	@Override
	public String toString() {
		return "Nama Barang = " + namaBarang + "\nHarga Jual = " + hargaJual + "\nHarga Beli = " + hargaBeli;
	}
	
	
	
	
	
	

}
