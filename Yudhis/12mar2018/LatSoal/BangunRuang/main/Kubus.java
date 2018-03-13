package main;

public class Kubus extends BangunRuang {
	
	double sisi;
	
	// Input Override
	void masukan () {
		System.out.print("Masukkan Panjang Sisi dalam Centimeter : "); sisi = input.nextDouble();
	}
	
	Kubus () {
		System.out.println("Menghitung Ruang Kubus.");
		masukan();
		
		System.out.print("\nLuas Kubus dengan Sisi " + sisi + "cm Adalah " + luas(sisi));
		System.out.print("\nVolume Kubus dengan Sisi " + sisi + "cm Adalah " + volume(sisi) + "\n");
	}
	
}
