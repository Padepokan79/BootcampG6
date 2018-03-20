package soalAsosiasiPedagang;

public class Pedagang {
	private String namaPedagang;
	private String alamat;
	private String barang;
	Pedagang (String namaPedagang, String alamat, String barang){
		this.namaPedagang = namaPedagang;
		this.alamat = alamat;
		this.barang = barang;
	}
	//nama Pedagang
	String getnamaPedagang() {
		return namaPedagang;
	}
	void setnamaPedagang(String namaPedagang) {
		this.namaPedagang = namaPedagang;
	}
	//alamat
	String getalamat() {
		return alamat;
	}
	void setalamat (String alamat) {
		this.alamat = alamat;
	}
	//barang
	String getbarang() {
		return barang;
	}
	void setbarang(String barang) {
		this.barang = barang;
	}
}
