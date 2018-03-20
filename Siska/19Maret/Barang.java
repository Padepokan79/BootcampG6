package soalAsosiasiPedagang;

public class Barang {
	private String namaBarang;
	private int hargaJual;
	private int hargaBeli;
	private int keuntungan;
	Barang (String nama, int hargaJual, int hargaBeli){
		this.namaBarang = nama;
		this.hargaJual = hargaJual;
		this.hargaBeli = hargaBeli;
	}
	//nama
	String getnamaBarang() {
		return namaBarang;
	}
	void setnamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	//hargaJual
	int gethargaJual() {
		return hargaJual;
	}
	void sethargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}
	//hargaBeli
	int gethargaBeli() {
		return hargaBeli;
	}
	void sethargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}
	//keuntungan
	int getkeuntungan() {
		return hargaJual-hargaBeli;
	}
	
}
