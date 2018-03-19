
public class Pedagang {
	String nama, alamat;
	int jumlahBarang;

	
	public Pedagang(String nama, String alamat,int jumlahBarang,  Barang barang) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jumlahBarang = jumlahBarang;
	}
	
	
	public String getNama() {
		return nama;
	}


	public void setNama(String nama) {
		this.nama = nama;
	}


	public String getAlamat() {
		return alamat;
	}


	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	

	public int getJumlahBarang() {
		return jumlahBarang;
	}


	public void setJumlahBarang(int jumlahBarang) {
		this.jumlahBarang = jumlahBarang;
	}
	

	@Override
	public String toString() {
		return "Nama Pedagang = " + nama + "\nAlamat Pedagang = " + alamat + "\nJumlah Barang = " + jumlahBarang;
	}

	
	
	
	
}
