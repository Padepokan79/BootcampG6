
public class Superhero {
	String namaSuperhero, namaSamaran, jenisPakaian, gender, kekuatan, kelemahan, musuh, partner;
	int umur;
	
	
	public Superhero() {
		// TODO Auto-generated constructor stub
	}
	
	Superhero(String nmSuperhero, String nmSamaran, String jk, String kkuatn, String klemahn, String enemy, String partnr, int umr){
		namaSuperhero = nmSuperhero;
		namaSamaran = nmSamaran;
		gender = jk;
		kekuatan = kkuatn;
		kelemahan = klemahn;
		musuh = enemy;
		partner = partnr;
		umur = umr;
	}
	
	void insertRecord(String nmSuperhero, String nmSamaran, String jk, String kkuatn, String klemahn, String enemy, String partnr, int umr){
		namaSuperhero = nmSuperhero;
		namaSamaran = nmSamaran;
		gender = jk;
		kekuatan = kkuatn;
		kelemahan = klemahn;
		musuh = enemy;
		partner = partnr;
		umur = umr;
	}
	
	void display() {
		System.out.println("SUPERHERO");
		System.out.println("Nama: "+namaSuperhero);
		System.out.println("Nama Alias: "+namaSamaran);
		System.out.println("Umur: "+umur);
		System.out.println("Jenis Kelamin: "+gender);
		System.out.println("Kekuatan: "+kekuatan);
		System.out.println("Kelemahan: "+kelemahan);
		System.out.println("Musuh: "+musuh);
		System.out.println("Nama Partner: "+partner);
		System.out.println();
	}
}
