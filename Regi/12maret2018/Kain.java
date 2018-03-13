
public class Kain {
	String nama, bahan, warna, motif;
	int harga;
	
	public Kain() {
		// TODO Auto-generated constructor stub
	}
	
	Kain(String n, String b, String w, String m, int h) {
		nama = n;
		bahan = b;
		warna = w;
		motif = m;
		harga = h;
	}
	
	void tampilDataKain() {
		System.out.println("\nNama : " + nama);
		System.out.println("Bahan : " + bahan);
		System.out.println("Warna : " + warna);
		System.out.println("Motif : " + motif);
		System.out.println("Harga : " + harga + " Rp");
	}

}
