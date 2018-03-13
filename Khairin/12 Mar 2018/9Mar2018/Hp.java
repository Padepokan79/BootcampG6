package eclipse;

public class Hp {
	String merk, tipe, warna;
	int harga, berat;
	
	public Hp() {
		// TODO Auto-generated constructor stub
	}
	
	Hp (String brand, String type, String col, int price, int wei){
		merk = brand;
		tipe = type;
		warna = col;
		harga = price;
		berat = wei;
	}
	
	void hp (String brand, String type, String col, int price, int wei){
		merk = brand;
		tipe = type;
		warna = col;
		harga = price;
		berat = wei;
	}
	
	void displayData() {
		System.out.println("KETERANGAN HP");
		System.out.println("Merk HP : " + merk);
		System.out.println("Tipe HP : " + tipe);
		System.out.println("Warna HP : " + warna);
		System.out.println("Harga HP : " + harga);
		System.out.println("Berat HP (dalam gram) : " + berat);
	}
	
}
