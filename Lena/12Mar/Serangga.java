
public class Serangga {
	String nama, warna, tinggal, makan,peran;
	
	void insertSerangga(String nama, String warna, String tinggal, String makan, String peran) {
		this.nama=nama;
		this.warna=warna;
		this.tinggal=tinggal;
		this.makan=makan;
		this.peran = peran;
	}
	
	void display() {
		System.out.println();
		System.out.println("Nama: "+this.nama);
		System.out.println("Warna: "+this.warna);
		System.out.println("Dapat ditemukan di: "+this.tinggal);
		System.out.println("Makanan: "+this.makan);
		System.out.println("Peran: "+this.peran);
	}
}
