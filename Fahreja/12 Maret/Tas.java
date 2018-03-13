
public class Tas {
	String merk, jenis, warna, bahan;
	int harga;
	
	void kumpul(String mrk,String jns, String wrn, String bhn, int hrg) {
		 merk = mrk;
		 jenis = jns;
		 warna = wrn;
		 bahan = bhn;
		 harga = hrg;
	 }
	void tampil() {
		System.out.println("\tMerk  Tas  : "+merk);
		 System.out.println("\tJenis Tas  : "+jenis);
		 System.out.println("\tWarna Tas  : "+warna);
		 System.out.println("\tHarga Tas  : "+harga);
		 System.out.println("\tBahan Tas  : "+bahan);
		 System.out.println("");
	}
}
