public class Person {
	String namaDepan,namaBelakang, gender, kesukaan;
	int umur;
	
	Person(){
		
	}
	
	Person (String nm,String gen,String like, int age) {
		namaDepan = nm;
		gender = gen;
		kesukaan = like;
		umur = age;
	}
	void tambah(String nD, String nB,String gen,String like, int age) {
		namaDepan = nD;
		namaBelakang = nB;
		gender = gen;
		kesukaan = like;
		umur = age;
	}
	void tampil() {
		System.out.println("BIO {"+namaDepan +" "+namaBelakang+" Jenis kelamin, Umur "+ gender +" "+umur+" tahun. Saya suka "+kesukaan+"}.");
	}
	void greterP() {
		System.out.println("Yo i'm "+namaDepan);
	}
}