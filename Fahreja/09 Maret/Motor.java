
public class Motor {
	String tahun,merk,jenis,warna;
	int harga;
	Motor(){
		
	}
	Motor(String thn,String id, String jns, String wrn, int hrg){
		tahun = thn;
		merk = id;
		jenis = jns;
		warna = wrn;
		harga = hrg;
	}
	
	void kumpul(String thn,String id, String jns, String wrn, int hrg) {
		tahun = thn;
		merk = id;
		jenis = jns;
		warna = wrn;
		harga = hrg;
	}
	
	void tampil() {
		System.out.println("Tahun Motor : "+tahun);
		System.out.println("Merk  Motor : "+merk);
		System.out.println("Jenis Motor : "+jenis);
		System.out.println("Warna Motor : "+warna);
		System.out.println("Harga Motor : "+harga);
		System.out.println("");
	}

}
