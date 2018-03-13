
class BangunRuang {
	private double panjang;
	private double lebar;
	private double tinggi;
	private double sisi;
	private double jarijari;
	final double pi=3.14;
	
	void buatData (double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
	}
	
	void menghitungVolume (double panjang, double lebar, double tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}
	
	void menghitungLuas (double p, double l, double t) {
		panjang = p;
		lebar = l;
		tinggi = t;
	}
	
	void setpanjang(double panjang) {
		this.panjang=panjang;
	}
	double getpanjang() {
		return panjang;
	}
	void setlebar(double lebar) {
		this.lebar=lebar;
	}
	double getlebar() {
		return lebar;
	}
	void settinggi(double tinggi) {
		this.tinggi=tinggi;
	}
	double gettinggi() {
		return tinggi;
	}
	void setsisi(double sisi) {
		this.sisi=sisi;
	}
	double getsisi() {
		return sisi;
	}
	void setjarijari(double jarijari) {
		this.jarijari=jarijari;
	}
	double getjarijari() {
		return jarijari;
	}
}
