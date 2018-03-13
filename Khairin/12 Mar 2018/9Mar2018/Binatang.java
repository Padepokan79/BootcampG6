package eclipse;

public class Binatang {
	String pemilikBinatang, namaBinatang, jenisBinatang, jenisKelamin,  warnaBinatang, suaraBinatang;
	int banyakKaki, beratBadan;
	
	Binatang (String pemilik, String nama, String jenis, String kelamin, String warna, String suara, int kaki, int berat) {
		pemilikBinatang = pemilik;
		namaBinatang = nama;
		jenisBinatang = jenis;
		jenisKelamin = kelamin;
		warnaBinatang = warna;
		suaraBinatang = suara;
		banyakKaki = kaki;
		beratBadan = berat;
	}
	
	void binatang (String pemilik, String nama, String jenis, String kelamin, String warna, String suara, int kaki, int berat) {
		pemilikBinatang = pemilik;
		namaBinatang = nama;
		jenisBinatang = jenis;
		jenisKelamin = kelamin;
		warnaBinatang = warna;
		suaraBinatang = suara;
		banyakKaki = kaki;
		beratBadan = berat;
	}
	
	void displayInfoBin () {
		System.out.println("NAMA PEMILIK BINATANG : " + pemilikBinatang);
		System.out.println("NAMA BINATANG : " + namaBinatang);
		System.out.println("JENIS BINATANG : " + jenisBinatang);
		System.out.println("JENIS KELAMIN : " + jenisKelamin);
		System.out.println("WARNA BINATANG : " + warnaBinatang);
		System.out.println("SUARA BINATANG : " + suaraBinatang);
		System.out.println("BANYAK KAKI : " + banyakKaki);
		System.out.println("BERAT BADAN : " + beratBadan + " gram");
		System.out.println();
	}
	
}