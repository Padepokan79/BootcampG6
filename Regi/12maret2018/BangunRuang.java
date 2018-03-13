
public class BangunRuang {
	int sisi, panjang, lebar, tinggi, jariJari, diameter;
	
	public BangunRuang() {
		// TODO Auto-generated constructor stub
	}
	
	BangunRuang(int sisi, int panjang, int lebar, int tinggi, int jariJari, int diameter) {
		this.sisi = sisi;
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		this.jariJari = jariJari;
		this.diameter = diameter;
	}
	
	int luasPersegi(int sisi) {
		return sisi*sisi;
	}
	
	int luasPersegiPanjang(int panjang, int lebar) {
		return panjang*lebar;
	}
	
	int luasKubus(int sisi) {
		return 6*sisi*sisi;
	}
}
