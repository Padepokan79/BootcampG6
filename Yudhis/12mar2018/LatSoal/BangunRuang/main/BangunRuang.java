package main;

import java.util.Scanner;

public class BangunRuang {
	
	Scanner input = new Scanner(System.in);
	
	// Input
	void masukan () {
		System.out.print("Masukan yg diperlukan : "); input.nextDouble();
	}
	
	// Volume Kubus
	double volume (double sisi) {
		return sisi * sisi * sisi;
	}
	
	// Volume Balok
	double volume (double panjang, double tinggi, double lebar) {
		return panjang * tinggi * lebar;
	}
	
	// Volume Tabung
	double volume (double jariJari, double tinggi) {
		return 3.14 * jariJari * jariJari * tinggi;
	}
	
	// Luas Permukaan Kubus
	double luas (double sisi) {
		return sisi * sisi * 6;
	}
	
	// Luas Permukaan Balok
	double luas (double panjang, double tinggi, double lebar) {
		return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
	}
	
	// Luas Permukaan Tabung
	double luas (double jariJari, double tinggi) {
		return 2 * 3.14 * jariJari * jariJari + 3.14 * (jariJari + jariJari) * tinggi;
	}
}
