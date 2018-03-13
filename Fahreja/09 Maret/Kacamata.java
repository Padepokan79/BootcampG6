
public class Kacamata {
	String jenis,warna,merk,lensa;
	int harga;
	
	Kacamata(){
		
	}
	
	Kacamata(String jns, String wrn, String id, String ln, int hrg){
		jenis = jns;
		warna = wrn;
		merk = id;
		lensa = ln;
		harga = hrg;
	}
	
	void kumpul (String jns, String wrn, String id, String ln, int hrg) {
		jenis = jns;
		warna = wrn;
		merk = id;
		lensa = ln;
		harga = hrg;
	}
	
	void tampil() {
		System.out.println("Jenis Kacamata : "+jenis);
		System.out.println("Warna Kacamata : "+warna);
		System.out.println("Merk  Kacamata : "+merk);
		System.out.println("Lensa Kacamata : "+lensa);
		System.out.println("Harga Kacamata : "+harga);
		System.out.println("");
	}
}
