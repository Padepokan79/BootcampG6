
public class Kubus extends BangunRuang{
	void insertRecord(double sisi) {
		this.sisi = sisi;
	}
	
	double hitungLuas() {
		return sisi*sisi*6;
	}
	double hitungVolume() {
		return sisi*sisi*sisi;
	}
	
	void displayLuas() {
		System.out.println("Luas Kubus dengan sisi "+sisi+"cm adalah "+ hitungLuas());
	}
	void displayVolume() {
		System.out.println("Volume Kubus dengan sisi "+sisi+"cm adalah "+ hitungVolume());
		System.out.println();
	}
}
