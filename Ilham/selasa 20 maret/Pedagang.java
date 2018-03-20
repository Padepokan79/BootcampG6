import java.util.HashMap;

public class Pedagang {
	private String namaPedagang, alamatPedagang;
	HashMap<String, Barang> barang = new HashMap<String, Barang>();
	
	public Pedagang(String nama, String alamat) {
		this.namaPedagang = nama;
		this.alamatPedagang = alamat;
	}

	public String getNamaPedagang() {
		return namaPedagang;
	}

	public void setNamaPedagang(String namaPedagang) {
		this.namaPedagang = namaPedagang;
	}

	public String getAlamatPedagang() {
		return alamatPedagang;
	}

	public void setAlamatPedagang(String alamatPedagang) {
		this.alamatPedagang = alamatPedagang;
	}

	public HashMap<String, Barang> getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang.put(barang.getNamaBarang(), barang);
	}
	
}
