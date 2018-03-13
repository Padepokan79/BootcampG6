
public class KainKebaya extends Kain {
	String model;
	
	public KainKebaya() {
		// TODO Auto-generated constructor stub
	}
	
	KainKebaya(String n, String b, String w, String m, String mod, String c, int h) {
		nama = n;
		bahan = b;
		warna = w;
		motif = m;
		model = mod;
		harga = h;
	}
	
	void tampilDataKain () {
		System.out.println("\nNama : " + nama);
		System.out.println("Bahan : " + bahan);
		System.out.println("Warna : " + warna);
		System.out.println("Motif : " + motif);
		System.out.println("Model : " + model);
		System.out.println("Harga : " + harga + " Rp");
	}

}
