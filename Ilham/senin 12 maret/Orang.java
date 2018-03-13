
public class Orang {
	String namaDepan, namaBelakang, jenisKelamin, hobi, greeting, bio;
	int umur;
	
	Orang(){
		
	}
	Orang(String nmDepan, String nmBelakang, String jk, int usia, String hb) {
		namaDepan = nmDepan;
		namaBelakang = nmBelakang;
		jenisKelamin = jk;
		umur = usia;
		hobi = hb;
		bio = namaDepan + " is " + umur + " years old. They like " + hobi + ".";
		greeting = "Hi! i'm " + namaDepan;
	}
	
	void tambahDataOrang(String nmDepan, String nmBelakang, String jk, int usia, String hb) {
		namaDepan = nmDepan;
		namaBelakang = nmBelakang;
		jenisKelamin = jk;
		umur = usia;
		hobi = hb;
		bio = namaDepan + " is " + umur + " years old. They like " + hobi + ".";
		greeting = "Hi! i'm " + namaDepan;
	}
	
	void tampilDataOrang() {
		System.out.println("Nama :" + namaDepan + " " + namaBelakang);
		System.out.println("Umur :" + umur);
		System.out.println("Jenis Kelamin :" + jenisKelamin);
		System.out.println("Hobi :" + hobi);
		System.out.println("Bio {" + bio + "}");
		System.out.println("Greeting {" + greeting + "}");
		System.out.println();
	}
	
	void tampilDataOrangDariInput() {
		bio = namaDepan + " is " + umur + " years old. They like " + hobi + ".";
		greeting = "Hi! i'm " + namaDepan;
		System.out.println("Bio {" + bio + "}");
		System.out.println("Greeting {" + greeting + "}");		
	}
}
