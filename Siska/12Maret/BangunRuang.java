
class BangunRuang {
	double panjang;
	double lebar;
	double tinggi;
	double volume;
	double luas;
	
	void buatData (double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
	}
	
	void menghitungVolume (double pan, double leb, double ti) {
		panjang = pan;
		lebar = leb;
		tinggi = ti;
		
		volume = pan*leb*ti;
	}
	
	void menghitungLuas (double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
		
		luas = 2*(p*l + p*t + l*t);
	}
	
	void menampilkanVolume() {
		System.out.println("Volume : ");
	}
	
	void menampilkanLuas() {
		System.out.println("Luas : ");
	}
	
}
