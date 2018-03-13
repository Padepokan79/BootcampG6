public class BangunRuang {
	private double sisi, panjang, tinggi, lebar, jari; 
	double volume, luas;
	
	//inisialisasi method
	void nilai(int s) {
		s = 0;
	}
	void nilai(int p, int l, int t) {
		p = 0;
		l = 0;
		t = 0;
	}
	void nilai (int r, int t) {
		r = 0;
		t = 0;
	}
	
	public double getSisi() {
		return sisi;
	}
	public double getPanjang(){
		return panjang;
	}
	public double getTinggi(){
		return tinggi;
	}
	public double getLebar(){
		return lebar;
	}
	public double getJari(){
		return jari;
	}
	
	public void setKubus(double sisi) {
		this.sisi = sisi;
	}
	public void setBalok(double panjang,double lebar, double tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}
	
	public void setTabung(double jari, double tinggi) {
		this.jari = jari;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}
	
	void tampilVolum() {
		System.out.println("Hasil Volume");
	}
	void tampilLuas() {
		System.out.println("Hasil Luas");
	}
	void pilihan() {
		System.out.println("1. Volume");
		System.out.println("2. Luas");
		System.out.print(">");
	}
	void angka() {
		System.out.println("Masukan nilai dalam senti meter");
	}
}
