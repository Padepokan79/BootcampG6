class Balok extends BangunRuang {
	
	double volume() {
		return getPanjang() * getLebar() * getTinggi();
	}
	double luas() {
		return 2*(getLebar()*getTinggi()+getPanjang()*getTinggi()+getPanjang()*getLebar());
	}
	
	void tampilVolum() {
		System.out.println("Hasil volume Balok dengan panjang "+getPanjang()+"cm lebar "+getLebar()+"cm dan tinggi "+getTinggi()+" : "+volume());
	}
	void tampilLuas() {
		System.out.println("Hasil Luas Balok dengan panjang "+getPanjang()+"cm lebar "+getLebar()+"cm dan tinggi "+getTinggi()+" : "+luas());
		
	}
	void ket() {
		System.out.println("Rumus Balok");
	}
	void angka() {
		System.out.println("Masukan nilai dalam senti meter");
	}
}
