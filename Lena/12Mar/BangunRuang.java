
public class BangunRuang {
	double panjang, lebar, tinggi, jariJari, sisi;
	double phi=3.14;
	
	void insertRecord(double sisi) {
		this.sisi = sisi;
	}
	
	void insertRecord(double panjang, double lebar, double tinggi) {
		this.panjang=panjang;
		this.lebar=lebar;
		this.tinggi=tinggi;
	}
	
	void insertRecord(double jariJari, double tinggi) {
		this.jariJari = jariJari;
		this.tinggi = tinggi;
	}
	
	double hitungLuas() {
		return sisi*sisi*6;
	}
	double hitungVolume() {
		return sisi*sisi*sisi;
	}
	
	void displayLuas() {
		System.out.println("Luas Kubus: "+ hitungLuas());
	}
	void displayVolume() {
		System.out.println("Volume Kubus: "+ hitungVolume());
	}
}
