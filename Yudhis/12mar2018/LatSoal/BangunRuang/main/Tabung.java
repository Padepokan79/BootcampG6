package main;

public class Tabung extends BangunRuang {
	
	double jariJari, tinggi;
	
	// Input Override
	void masukan () {
		System.out.print("Masukkan Jari-Jari dalam Centimeter : "); jariJari = input.nextDouble();
		System.out.print("Masukkan Tinggi dalam Centimeter : "); tinggi = input.nextDouble();
	}
	
	Tabung () {		
		System.out.println("Menghitung Ruang Tabung.");
		masukan();
		
		System.out.print("\nLuas Tabung dengan Jari-Jari " + jariJari + "cm, Tinggi " + tinggi + 
				"cm Adalah " + luas(jariJari, tinggi));
		System.out.print("\nVolume Tabung dengan Jari-Jari " + jariJari + "cm, Tinggi " + tinggi + 
				"cm Adalah " + volume(jariJari, tinggi) + "\n");
	}
	
}
