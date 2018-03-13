
public class BangunRuang {
	private final double phi = 22/7;
	private double tinggi, panjang, lebar, sisi, jariJari ;
	
	public BangunRuang() {
		// TODO Auto-generated constructor stub
	}
	
	void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	void setLebar(double lebar) {
		this.lebar = lebar;
	}

	void setSisi(double sisi) {
		this.sisi = sisi;
	}

	void setJariJari(double jariJari) {
		this.jariJari = jariJari;
	}
	
	public double getTinggi() {
		return tinggi;
	}
	
	public double getPanjang() {
		return panjang;
	}
	
	public double getLebar() {
		return lebar;
	}
	
	public double getSisi() {
		return sisi;
	}
	
	public double getJariJari() {
		return jariJari;
	}
	
	public double getPhi() {
		return phi;
	}
	
	public double volume() {
		return 0;
	}
	
	public double luas() {
		return 0;
	}
}
