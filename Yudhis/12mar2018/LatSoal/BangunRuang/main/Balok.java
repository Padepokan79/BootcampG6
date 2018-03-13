package main;

public class Balok extends BangunRuang {
	
	double panjang, tinggi, lebar;
	
	// Input Override
	void masukan () {
		System.out.print("Masukkan Panjang dalam Centimeter : "); panjang = input.nextDouble();
		System.out.print("Masukkan Tinggi dalam Centimeter : "); tinggi = input.nextDouble();
		System.out.print("Masukkan Lebar dalam Centimeter : "); lebar = input.nextDouble();
	}
	
	Balok () {
		System.out.println("Menghitung Ruang Balok.");
		masukan();
		
		System.out.print("\nLuas Kubus dengan Panjang " + panjang + "cm, Lebar " + lebar + 
				"cm, Tinggi " + tinggi + "cm Adalah " + luas(panjang, tinggi, lebar));
		System.out.print("\nVolume Kubus dengan Panjang " + panjang + "cm, Lebar " + lebar + 
				"cm, Tinggi " + tinggi + "cm Adalah " + volume(panjang, tinggi, lebar) + "\n");
	}
	
}
