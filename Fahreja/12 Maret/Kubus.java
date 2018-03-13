
class Kubus extends BangunRuang {
	
	void nilai(double s) {
		sisi = s;
	}
	
	double volume() {
		return sisi * sisi * sisi;
	}
	
	double luas() {
		return 6 * sisi * sisi;
	}
	void tampilVolum() {
		System.out.println("Volume kubus dengan sisi "+sisi+"cm adalah  : "+volume());
	}
	void tampilLuas() {
		System.out.println("Luas kubus dengan sisi "+sisi+"cm adalah  : "+luas());
		
	}
	void ket() {
		System.out.println("Rumus Kubus");
	}
	void angka() {
		System.out.println("Masukan sisi dalam senti meter");
		System.out.print(">");
	}
}
