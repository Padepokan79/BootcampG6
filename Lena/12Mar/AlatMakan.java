
public class AlatMakan {
	String jenis, merk, warna, bahan, fungsi;
	int harga;
	

	void insertAlatMakan(String jenis, String merk, String warna, String bahan, String fungsi, int harga){
		this.jenis = jenis;
		this.merk = merk;
		this.warna = warna;
		this.bahan = bahan;
		this.fungsi = fungsi;
		this.harga = harga;
	}
	
	void display() {
		System.out.println();
		System.out.println("Nama: "+this.jenis);
		System.out.println("Merk: "+this.merk);
		System.out.println("Warna: "+this.warna);
		System.out.println("Terbuat dari: "+this.bahan);
		System.out.println("Kegunaan: "+this.fungsi);
		System.out.println("Harga: "+this.harga);
	}
}
