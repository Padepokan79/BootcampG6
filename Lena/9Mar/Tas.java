
public class Tas {
	String namaPemilik, jenisTas, warnaTas;
	
	public Tas() {
		// TODO Auto-generated constructor stub
	}
	
	Tas(String nama, String jenis, String warna){
		namaPemilik = nama;
		jenisTas = jenis;
		warnaTas = warna;
	}
	
	void insertRecord(String nama, String jenis, String warna){
		namaPemilik = nama;
		jenisTas = jenis;
		warnaTas = warna;
	}
	
	void display() {
		System.out.println("Tas "+jenisTas+" milik "+namaPemilik+" warna "+warnaTas);
	}

}
