
public class Tabung extends BangunRuang {
	public Tabung() {
		// TODO Auto-generated constructor stub
	}
	
	Tabung(int jariJari, int tinggi, int diameter) {
		this.jariJari = jariJari;
		this.tinggi = tinggi;
		this.diameter = diameter;
	}

	int luasTabung(int diameter, int tinggi) {
		return (int) ((2*3.14*(diameter/2)*(diameter/2)+tinggi));
	}
	
	int luasTabung(double jariJari, int tinggi) {
		return (int) ((2*3.14*jariJari)*(jariJari+tinggi));
	}
	
	int volumeTabung(int jariJari, int tinggi) {
		return (int) (3.14*jariJari*jariJari*tinggi);
	}

}
