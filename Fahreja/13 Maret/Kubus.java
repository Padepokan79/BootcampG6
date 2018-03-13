
class Kubus extends BangunRuang {
	
	
	double volume() {
		return  getSisi()*getSisi()*getSisi();
	}
	
	double luas() {
		return 6 * getSisi() * getSisi();
	}
	void tampilVolum() {
		System.out.println("Volume kubus dengan sisi "+getSisi()+"cm adalah  : "+volume());
	}
	void tampilLuas() {
		System.out.println("Luas kubus dengan sisi "+getSisi()+"cm adalah  : "+luas());
		
	}
	void ket() {
		System.out.println("Rumus Kubus");
	}
	void angka() {
		System.out.println("Masukan sisi dalam senti meter");
		System.out.print(">");
	}
}
