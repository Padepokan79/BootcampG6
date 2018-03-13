
public class Televisi {
	String jenis, merk, ukuran, koneksi;
	int harga;
	
	Televisi(){
		
	}
	Televisi(String jns, String mrk, String ukr, String knk, int hrg){
		jenis = jns;
		merk = mrk;
		ukuran = ukr;
		koneksi = knk;
		harga = hrg;
	}
	
	void tampil() {
		System.out.println("Jenis    Tv : "+jenis);
		System.out.println("Merk     Tv : "+merk);
		System.out.println("Ukuran   Tv : "+ukuran);
		System.out.println("Koneksi  Tv : "+koneksi);
		System.out.println("Harga    Tv : "+harga);
		System.out.println("");
	}
}
