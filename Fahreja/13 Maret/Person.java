public class Person {
	private String namaDepan,namaBelakang, gender, kesukaan;
	private int umur;
	
	Person(){
		
	}
	
	public Person (String namaDepan,String gender,String kesukaan, int umur) {
		this.namaDepan = namaDepan;
		this.gender = gender;
		this.kesukaan = kesukaan;
		this.umur = umur;
	}
	public String getNamaDepan() {
		return namaDepan;
	}
	public String getNamaBelakang() {
		return namaBelakang;
	}
	public String getGender() {
		return gender;
	}
	public String getKesukaan() {
		return kesukaan;
	}
	public int getUmur() {
		return umur;
	}
	
	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}
	
	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setKesukaan(String kesukaan) {
		this.kesukaan = kesukaan;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	void tampil() {
		System.out.println("BIO {"+namaDepan +" "+namaBelakang+" Jenis kelamin "+ gender +" , Umur "+umur+" tahun. Saya suka "+kesukaan+"}.");
	}
	void greterP() {
		System.out.println("Yo i'm "+namaDepan);
	}
}