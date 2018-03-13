
public class Gitar {
	String jenisGitar, merek, bahan, jenisSenar, warna;
	int harga, jumlahSenar;
	
	public Gitar() {
		// TODO Auto-generated constructor stub
	}
	
	Gitar(String jGitar, String m, String b, String jSenar, String w, int h, int jmlSenar) {
		jenisGitar = jGitar;
		merek = m;
		bahan = b;
		jenisSenar = jSenar;
		warna = w;
		harga = h;
		jumlahSenar = jmlSenar;
	}
	
	void inputData(String jGitar, String m, String b, String jSenar, String w, int h, int jmlSenar) {
		jenisGitar = jGitar;
		merek = m;
		bahan = b;
		jenisSenar = jSenar;
		warna = w;
		harga = h;
		jumlahSenar = jmlSenar;
	}
	
	void tampilData() {
		System.out.println("\nGitar: ");
		System.out.println("Jenis Gitar = " + jenisGitar);
		System.out.println("Merek = " + merek);
		System.out.println("Bahan = " + bahan);
		System.out.println("Jenis Senar = " + jenisSenar);
		System.out.println("Warna = " + warna);
		System.out.println("Harga = " + harga + " Rp");
		System.out.println("Jumlah Senar = " + jumlahSenar);
	}
}
