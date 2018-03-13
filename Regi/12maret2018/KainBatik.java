
public class KainBatik extends Kain{
	String corak, asal;
	
	public KainBatik() {
		// TODO Auto-generated constructor stub
	}
	
	KainBatik(String n, String b, String w, String m, String c, String a, int h) {
		nama = n;
		bahan = b;
		warna = w;
		motif = m;
		corak = c;
		asal = a;
		harga = h;
	}
	
	void tampilDataKain () {
		System.out.println("\nNama : " + nama);
		System.out.println("Bahan : " + bahan);
		System.out.println("Warna : " + warna);
		System.out.println("Motif : " + motif);
		System.out.println("Corak : " + corak);
		System.out.println("Asal daerah : " + asal);
		System.out.println("Harga : " + harga + " Rp");
	}

}
