
public class Mie {
	String jenis,rasa,merk, ukuran;
	int harga;
	
	Mie(){
		
	}
	Mie(String jns, String rs, String id,String ukr, int hrg){
		jenis = jns;
		rasa = rs;
		ukuran = ukr;
		merk = id;
		harga = hrg;
	}
	void tampil() {
		System.out.println("Jenis  Mie : "+jenis);
		System.out.println("Rasa   Mie : "+rasa);
		System.out.println("Merk   Mie : "+merk);
		System.out.println("Ukuran Mie : "+ukuran);
		System.out.println("Harga  Mie : "+harga);
		System.out.println("");
	}
	
}
