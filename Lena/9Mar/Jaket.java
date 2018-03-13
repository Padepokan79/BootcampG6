
public class Jaket {
	String namaPemilik, jenisJaket, warnaJaket;
	
	public Jaket() {
		// TODO Auto-generated constructor stub
	}
	
	Jaket(String nama, String jenis, String warna){
		namaPemilik = nama;
		jenisJaket = jenis;
		warnaJaket = warna;
	}
	
	void insertRecord(String nama, String jenis, String warna){
		namaPemilik = nama;
		jenisJaket = jenis;
		warnaJaket = warna;
	}
	
	void display() {
		System.out.println("Jaket "+jenisJaket+" milik "+namaPemilik+" warna "+warnaJaket);
	}
}
