
public class Orang {
	private String namaDepan, namaBelakang, jenisKelamin, hobi, greeting, bio;
	private int umur;
	
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
	

	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}
	
	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}
	
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	public void setHobi(String hobi) {
		this.hobi = hobi;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public String getNamaDepan() {
		return namaDepan;
	}

	public String getNamaBelakang() {
		return namaBelakang;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public String getHobi() {
		return hobi;
	}

	public int getUmur() {
		return umur;
	}
}
