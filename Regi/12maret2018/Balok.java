
public class Balok extends BangunRuang {
	public Balok() {
		// TODO Auto-generated constructor stub
	}
	
	Balok(int panjang, int lebar, int tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}
	
	int luasBalok(int panjang, int lebar, int tinggi) {
		return 2*(luasPersegiPanjang(panjang, lebar) + panjang*tinggi + lebar*tinggi);
	}
	
	int volumeBalok(int panjang, int lebar, int tinggi) {
		return panjang*lebar*tinggi;
	}

}
