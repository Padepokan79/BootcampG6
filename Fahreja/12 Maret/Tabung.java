class Tabung extends BangunRuang {
	double diameter;
	final double pi = 3.14;
	
	void nilai(double r, double t) {
		jari = r;
		tinggi = t;
	}
	void nilai(double dm) {
		diameter = dm;
	}
	
	double volume() {
		return (pi*jari*jari)*tinggi;
	}
	double convert() {
		return diameter / 2;
	}
	
	double luas() {
		return (2)*(pi*jari*jari)*(2*pi*jari*jari);
	}
	void tampilVolum() {
		System.out.println("Hasil volume tabung dengan jari-jari "+jari+"cm dan tinggi "+tinggi+" : "+volume());
	}
	void tampilLuas() {
		System.out.println("Hasil volume tabung dengan jari-jari "+jari+"cm dan tinggi "+tinggi+" : "+luas());
	}
	
	void angka() {
		System.out.println("Masukan nilai dalam senti meter");
	}
}
