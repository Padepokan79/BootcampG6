package eclipse;

public class Pohon {
	String namaPohon, bentukDaun, namaBuah, jenisBatang, jenisAkar, jenisBiji;
	double tinggiPohon;
	
	public Pohon() {
		// TODO Auto-generated constructor stub
	}
	
	Pohon (String pohon, String buah,  String daun, String batang, String akar, String biji, double tinggi){
		 namaPohon = pohon;
		 namaBuah = buah;
		 bentukDaun = daun;
		 jenisBatang = batang;
		 jenisAkar = akar;
		 jenisBiji = biji;
		 tinggiPohon = tinggi;
	}
	
	void pohon (String pohon, String buah,  String daun, String batang, String akar, String biji, double tinggi){
		 namaPohon = pohon;
		 namaBuah = buah;
		 bentukDaun = daun;
		 jenisBatang = batang;
		 jenisAkar = akar;
		 jenisBiji = biji;
		 tinggiPohon = tinggi;
	}
	
	void displayInfoPohon() {
		System.out.println("NAMA POHON : " + namaPohon);
		System.out.println("NAMA BUAH : " + namaBuah);
		System.out.println("BENTUK DAUN : " + bentukDaun);
		System.out.println("JENIS BATANG : " + jenisBatang);
		System.out.println("JENIS AKAR : " + jenisAkar);
		System.out.println("JENIS BIJI : " + jenisBiji);
		System.out.println("TINGGI POHON (dalam meter) : " + tinggiPohon + " Meter");
		System.out.println();
	}

}
