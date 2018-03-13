public class BangunRuang {
	double sisi, panjang, tinggi, lebar, jari; 
	double hasilVolume, hasilLuas;
	
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
