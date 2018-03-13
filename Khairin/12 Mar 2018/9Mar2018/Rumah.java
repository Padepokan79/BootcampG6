package eclipse;

public class Rumah {
	String pemilikRumah, warnaRumah, alamatRumah;
	int banyakKamar, banyakWc, banyakPohon, hargaRumah; 
	double luasRumah;
	
	public Rumah() {
		// TODO Auto-generated constructor stub
	}
	
	Rumah (String nama, String warna, String almt, int kamar, int wc, int pohon, double luas, int harga){
		pemilikRumah = nama;
		warnaRumah= warna;
		alamatRumah= almt;
		banyakKamar= kamar;
		banyakWc= wc;
		banyakPohon= pohon;
		luasRumah= luas;
		hargaRumah= harga;
	}
	
	void rumah (String nama, String warna, String almt, int kamar, int wc, int pohon, double luas, int harga){
		pemilikRumah = nama;
		warnaRumah= warna;
		alamatRumah= almt;
		banyakKamar= kamar;
		banyakWc= wc;
		banyakPohon= pohon;
		luasRumah= luas;
		hargaRumah= harga;
	}
	
	void displayInfoRumah () {
		System.out.println("NAMA PEMILIK RUMAH : " + pemilikRumah);
		System.out.println("WARNA RUMAH : " + warnaRumah);
		System.out.println("ALAMAT RUMAH : " + alamatRumah);
		System.out.println("BANYAK KAMAR : " + banyakKamar);
		System.out.println("BANYAK WC : " + banyakWc);
		System.out.println("BANYAK POHON : " + banyakPohon);
		System.out.println("LUAS RUMAH : " + luasRumah);
		System.out.println("HARGA RUMAH : Rp." + hargaRumah);		
		System.out.println();
	}
}

