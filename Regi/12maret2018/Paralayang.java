
public class Paralayang extends Olahraga {
	String peralatan, ukuranParasut;
	int beratRanselPeralatan;
	
	public Paralayang() {
		// TODO Auto-generated constructor stub
	}
	
	Paralayang(String j, String s, String c, String p, String uParasut, int bRansel, String m) {
		jenis = j;
		status = s;
		cabang = c;
		peralatan = p;
		ukuranParasut= uParasut;
		beratRanselPeralatan = bRansel;
		manfaat = m;
	}
	
	void tampilData() {
		System.out.println("\nJenis : " + jenis);
		System.out.println("Status : " + status);
		System.out.println("Cabang : " + cabang);
		System.out.println("Peralatan : " + peralatan);
		System.out.println("Ukuran Parasut : " + ukuranParasut);
		System.out.println("Berat Ransel" + beratRanselPeralatan + " Kg");
		System.out.println("Manfaat : " + manfaat);
	}

}
