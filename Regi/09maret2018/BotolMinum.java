
public class BotolMinum {
	int tinggi, diameter, volume, harga, beratIsi, beratKosong;
	String warna, merek;
	
	BotolMinum() {
		
	}
	
	BotolMinum(int t, int d, int v, int h, int bIsi, int bKosong, String w, String m) {
		tinggi = t;
		diameter = d;
		volume = v;
		harga = h;
		beratIsi = bIsi;
		beratKosong = bKosong;
		warna = w;
		merek = m;
	}
	
	void masukkanData(int t, int d, int v, int h, int bIsi, int bKosong, String w, String m) {
		tinggi = t;
		diameter = d;
		volume = v;
		harga = h;
		beratIsi = bIsi;
		beratKosong = bKosong;
		warna = w;
		merek = m;
	}
	
	void tampilData() {
		System.out.println("Tinggi = " + tinggi + " cm");
		System.out.println("Diameter = " + diameter + " cm");
		System.out.println("Volume = " + volume + " ml");
		System.out.println("Harga = " + harga + " Rp");
		System.out.println("Berat Isi = " + beratIsi + " gr");
		System.out.println("Berat Kosong = " + beratKosong + " gr");
		System.out.println("Warna = " + warna);
		System.out.println("Merek = " + merek);
	}
	
}
