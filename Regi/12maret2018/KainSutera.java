
public class KainSutera extends Kain {
	String jenisBenang, asal;
	
	public KainSutera() {
		// TODO Auto-generated constructor stub
	}

	KainSutera(String n, String b, String jbenang, String w, String m, String c, String a, int h) {
		nama = n;
		bahan = b;
		jenisBenang = jbenang;
		warna = w;
		motif = m;
		asal = a;
		harga = h;
	}
	
	void tampilDataKain () {
		System.out.println("\nNama : " + nama);
		System.out.println("Bahan : " + bahan);
		System.out.println("Jenis Benang : " + jenisBenang);
		System.out.println("Warna : " + warna);
		System.out.println("Motif : " + motif);
		System.out.println("Asal daerah : " + asal);
		System.out.println("Harga : " + harga + " Rp");
	}

}
