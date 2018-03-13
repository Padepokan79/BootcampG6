package main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minuman minuman = new Minuman();
		Laptop laptop = new Laptop();
		Ponsel ponsel = new Ponsel(3000000, "SAMSUNG", "A5 2017");
		
		minuman.nama = "Good Day Originale Cappucino";
		minuman.harga = 5000;
		System.out.println("Minuman " + minuman.nama + " seharga " + minuman.harga);
		
		laptop.merk = "ASUS";
		laptop.tipe = "A455L";
		laptop.harga = 5000000;
		laptop.tampilLaptop();
		
	}

}
