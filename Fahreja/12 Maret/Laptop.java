
public class Laptop {
	String merk, ukuran,spek, warna;
	int harga;
	
	void kumpul(String mrk,String ukr, String wrn, String sp, int hrg) {
		 merk = mrk;
		 ukuran = ukr;
		 warna = wrn;
		 spek = sp;
		 harga = hrg;
	 }
	void tampil() {
		 System.out.println("\tMerk  Laptop  : "+merk);
		 System.out.println("\tUkuran Laptop : "+ukuran);
		 System.out.println("\tWarna Laprop  : "+warna);
		 System.out.println("\tHarga Laptop  : "+harga);
		 System.out.println("\tspek Laptop   : "+spek);
		 System.out.println("");
	}
}
