
public class Balok extends BangunRuang {
	
	
	double hitungLuas() {
		return 2*(panjang*lebar+panjang*tinggi+tinggi*lebar);
	}
	double hitungVolume() {
		return panjang*lebar*tinggi;
	}
	
	void displayLuas() {
		System.out.println("Luas Balok dengan panjang: "+panjang+"cm lebar "+lebar+"cm tinggi "+tinggi+"cm adalah "+ hitungLuas());
	}
	void displayVolume() {
		System.out.println("Volume Balok dengan panjang: "+panjang+"cm lebar "+lebar+"cm tinggi "+tinggi+"cm adalah "+ hitungVolume());
		System.out.println();
	}
}
