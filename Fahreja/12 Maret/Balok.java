class Balok extends BangunRuang {
	
	void nilai(double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
	}
	
	double volume() {
		return panjang * lebar * tinggi;
	}
	double luas() {
		return (2*lebar*tinggi)+(2*lebar*tinggi)+(2*panjang*lebar);
	}
	
	void tampilVolum() {
		System.out.println("Hasil volume Balok dengan panjang "+panjang+"cm lebar "+lebar+"cm dan tinggi "+tinggi+" : "+volume());
	}
	void tampilLuas() {
		System.out.println("Hasil Luas Balok dengan panjang "+panjang+"cm lebar "+lebar+"cm dan tinggi "+tinggi+" : "+luas());
		
	}
	void ket() {
		System.out.println("Rumus Balok");
	}
	void angka() {
		System.out.println("Masukan nilai dalam senti meter");
	}
}
