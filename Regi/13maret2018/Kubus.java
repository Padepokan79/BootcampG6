
public class Kubus extends BangunRuang {
	public Kubus() {
		// TODO Auto-generated constructor stub
	}
	
	Kubus(int sisi) {
//		this.sisi = sisi;
		setSisi(sisi);
	}
	
	int luasKubus(int sisi) {
		return 6*luasPersegi(sisi);
	}
	
	int volumeKubus(int sisi) {
		return sisi*sisi*sisi;
	}

}
