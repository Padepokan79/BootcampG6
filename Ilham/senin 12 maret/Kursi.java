
public class Kursi {
	int harga;
	String bahan, tipe, warna;
	
	Kursi() {
		
	}
	
	void tambahKursi(String bhn, String tp, String wrn, int hrg) {
		bahan = bhn;
		tipe= tp;
		warna = wrn;
		harga = hrg;
	}
	
	void tampilKursi() {
		System.out.println(tipe+ " " + bahan + " " + warna + " " + harga);
		System.out.println();
	}
}
