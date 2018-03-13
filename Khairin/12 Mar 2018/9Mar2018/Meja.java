package eclipse;

public class Meja {
	String w, b, m; 
	int ber, p;
	
	public Meja() {
		// TODO Auto-generated constructor stub
	}
	
	Meja (String merk, String warna, String bahan, int berat, int harga){
		m = merk;
		w = warna;
		b = bahan;
		ber = berat;
		p = harga;
	}
	
	void table (String merk, String warna, String bahan, int berat, int harga){
		m = merk;
		w = warna;
		b = bahan;
		ber = berat;
		p = harga;
	}
	
	void displayKet() {
		System.out.println("Deskripsi Meja");
		System.out.println("Merk meja : " + m);
		System.out.println("Warna meja : " + w);
		System.out.println("Bahan meja : " + b);
		System.out.println("Berat meja : " + ber);
		System.out.println("Harga meja : " + p);
	}
	
	

}
