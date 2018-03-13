package eclipse;

public class Botol {
	String merk, warna, jenis;
	int harga, volumeIsi;
	
	Botol (String brand, String color, String jen, int price, int vol){
		merk = brand;
		warna = color;
		jenis = jen;
		harga = price;
		volumeIsi = vol;
	}
	
	void bottle (String brand, String color, String jen, int price, int vol){
		merk = brand;
		warna = color;
		jenis = jen;
		harga = price;
		volumeIsi = vol;
	}
	
	void displayData() {
		System.out.println("KETERANGAN BOTOL");
		System.out.println("Merk Botol : " + merk);
		System.out.println("Jenis Botol : " + jenis);
		System.out.println("Warna Botol : " + warna);
		System.out.println("Harga Botol : " + harga);
		System.out.println("Volume Isi Botol (dalam ml) : " + volumeIsi);
	}

	
}

