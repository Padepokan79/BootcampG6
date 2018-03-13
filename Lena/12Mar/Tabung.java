
public class Tabung extends BangunRuang{
	
	
	double hitungLuas() {
		return 2*phi*jariJari*(jariJari+tinggi);
	}
	double hitungVolume() {
		return phi*jariJari*jariJari*tinggi;
	}
	
	void displayLuas() {
		System.out.println("Luas Balok dengan jari-jari "+jariJari+"cm tinggi "+tinggi+"cm adalah "+ hitungLuas());
	}
	void displayVolume() {
		System.out.println("Volume Balok dengan jari-jari "+jariJari+"cm tinggi "+tinggi+"cm adalah "+ hitungVolume());
		System.out.println();
	}
}
