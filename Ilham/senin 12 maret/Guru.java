
public class Guru extends Orang {
	String subjek;
	
	
	void tambahDataGuru(String nmDepan, String nmBelakang, String jk, int usia, String hb, String subjek) {
		namaDepan = nmDepan;
		namaBelakang = nmBelakang;
		jenisKelamin = jk;
		umur = usia;
		hobi = hb;
		bio = namaDepan + " is " + umur + " years old. They like " + hobi + ".";
		this.subjek = subjek;
		greeting = "Hello My name is " + namaBelakang + ", and I teach " + subjek;
	}
	
	void tampilDataGuru() {
		System.out.println("Nama : " + namaDepan + " " + namaBelakang);
		System.out.println("Umur : " + umur);
		System.out.println("Jenis Kelamin : " + jenisKelamin);
		System.out.println("Hobi : " + hobi);
		System.out.println("Subjek : " + subjek);
		System.out.println("Bio {" + bio + "}");
		System.out.println("Greeting {" + greeting + "}");
		System.out.println();
	}
}
