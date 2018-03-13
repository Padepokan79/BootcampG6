
public class GuntingRambut {
	String jenis, ukuran, bahan;
	int harga;
	
	public GuntingRambut() {
		// TODO Auto-generated constructor stub
	}
	
	GuntingRambut(String j, String u, String b, int h) {
		jenis = j;
		ukuran = u;
		bahan = b;
		harga = h;
	}
	
	void inputData(String j, String u, String b, int h) {
		jenis = j;
		ukuran = u;
		bahan = b;
		harga = h;
	}
	
	void tampilData() {
		System.out.println("\nGunting Rambut");
		System.out.println("Jenis = " + jenis);
		System.out.println("Ukuran = " + ukuran);
		System.out.println("Bahan = " + bahan);
		System.out.println("Harga = " + harga + " Rp");
	}
}
