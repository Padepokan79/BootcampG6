
public class Dayung extends Olahraga {
	int anggotaPerTim, ukuranPerahu;
	String properti, kelas;
	
	public Dayung() {
		// TODO Auto-generated constructor stub
	}
	
	Dayung (String j, String s, String c, String k, int uPerahu, int aPerTim, String p, String m) {
		jenis = j;
		status = s;
		cabang = c;
		kelas = k;
		ukuranPerahu = uPerahu;
		anggotaPerTim = aPerTim;
		properti = p;
		manfaat = m;
	}
	
	void tampilData() {
		System.out.println("\nJenis : " + jenis);
		System.out.println("Status : " + status);
		System.out.println("Cabang : " + cabang);
		System.out.println("Kelas : " + kelas);
		System.out.println("Ukuran Perahu : " + ukuranPerahu + " m");
		System.out.println("Anggota per Tim : " + anggotaPerTim + " orang");
		System.out.println("Properti Keselamatan : " + properti);
		System.out.println("Manfaat : " + manfaat);
	}

}
