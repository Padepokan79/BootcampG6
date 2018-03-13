class Tabung extends BangunRuang {
	double diameter;
	final double pi = 3.14;
	
	void nilai(double dm) {
		diameter = dm;
	}
	
	double volume() {
		return (pi*getJari()*getJari()*getTinggi());
	}
	double convert() {
		return diameter / 2;
	}
	
	double luas() {
		return ((2*pi*getJari())*(getJari()+getTinggi()));
	}
	void tampilVolum() {
		System.out.println("Hasil volume tabung dengan jari-jari "+getJari()+"cm dan tinggi "+getTinggi()+" : "+volume());
	}
	void tampilLuas() {
		System.out.println("Hasil luas tabung dengan jari-jari "+getJari()+"cm dan tinggi "+getTinggi()+" : "+luas());
	}
	
	void angka() {
		System.out.println("Masukan nilai dalam senti meter");
	}
}
