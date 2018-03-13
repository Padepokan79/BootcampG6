
public class Laptop {
	String merk, tipe;
	int harga;
	
	Laptop() {
		
	}
	
	void tambahLaptop(String merkInput, String tipeInput, int hargaInput) {
		merk = merkInput;
		tipe = tipeInput;
		harga = hargaInput;
	}
	
	void tampilLaptop() {
		System.out.println(merk + " " + tipe + " " + harga);
		System.out.println();
	}
}
