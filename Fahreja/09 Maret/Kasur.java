
public class Kasur {
	String jenis,tipe,merk,ukuran;
	int harga;
	
	Kasur(){
		
	}
	Kasur(String jns, String tp, String mrk,String ukr, int hrg){
		jenis = jns;
		tipe = tp;
		merk = mrk;
		ukuran = ukr;
		harga = hrg;
	}
	void tampil() {
		System.out.println("Jenis  Kasur : "+jenis);
		System.out.println("Tipe   Kasur : "+tipe);
		System.out.println("Merk   Kasur : "+merk);
		System.out.println("Ukuran Kasur : "+ukuran);
		System.out.println("Harga  Kasur : "+harga);
		System.out.println("");
	}
}
