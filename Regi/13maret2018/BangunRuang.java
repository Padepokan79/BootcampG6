
public class BangunRuang {
	private int sisi, panjang, lebar, tinggi, jariJari;
	
	public BangunRuang() {
		// TODO Auto-generated constructor stub
	}
	
	BangunRuang(int sisi, int panjang, int lebar, int tinggi, int jariJari) {
		this.sisi = sisi;
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		this.jariJari = jariJari;
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
	
	public int getSisi() {
		return sisi;
	}
	
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	
	public int getPanjang() {
		return panjang;
	}
	
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}
	
	public int getLebar() {
		return lebar;
	}
	
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	public int getTinggi() {
		return tinggi;
	}
	
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	
	public int getjariJari() {
		return jariJari;
	}
	
	public void setJariJari(int jariJari) {
		this.jariJari = jariJari;
	}
}
