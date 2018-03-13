
public class Futsal extends Olahraga {
	int jmlPemain, ukuranBola, ukuranLapangan;
	
	Futsal(String j, String s, String c, int jPemain, int uBola, int uLapangan, String m) {
		jenis = j;
		status = s;
		cabang = c;
		jmlPemain = jPemain;
		ukuranBola = uBola;
		ukuranLapangan = uLapangan;
		manfaat = m;
	}
	
	void tampilData() {
		System.out.println("\nJenis : " + jenis);
		System.out.println("Status : " + status);
		System.out.println("Cabang : " + cabang);
		System.out.println("Jumlah Pemain : " + jmlPemain + " orang");
		System.out.println("Ukuran Bola : " + ukuranBola);
		System.out.println("Ukuran Lapangan : " + ukuranLapangan + " m");
		System.out.println("Manfaat : " + manfaat);
	}

}
