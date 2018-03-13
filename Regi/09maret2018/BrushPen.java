
public class BrushPen {
	int harga, isi;
	String warna, ukuran, merek, tipe;
	
	public BrushPen() {
		// TODO Auto-generated constructor stub
	}
	
	BrushPen(int h, int i, String w, String u, String m, String t) {
		harga = h;
		isi = i;
		warna = w;
		ukuran = u;
		merek = m;
		tipe = t;
	}
	
	void inputData(int h, int i, String w, String u, String m, String t) {
		harga = h;
		isi = i;
		warna = w;
		ukuran = u;
		merek = m;
		tipe = t;
	}
	
	void tampilData() {
		System.out.println("\nBrush Pen: ");
		System.out.println("Harga = " + harga + " Rp");
		System.out.println("Isi = " + isi);
		System.out.println("Warna = " + warna);
		System.out.println("Ukuran = " + ukuran);
		System.out.println("Merek = " + merek);
		System.out.println("Tipe = " + tipe);
	}
}
