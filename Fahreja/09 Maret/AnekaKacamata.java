
public class AnekaKacamata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kacamata ket1 = new Kacamata();
		Kacamata ket2 = new Kacamata();
		Kacamata ket3 = new Kacamata("Baca", "Hitam", "KMata", "Minus", 200000);
		
		ket1.jenis = "Gaya";
		ket1.warna = "Putih";
		ket1.merk = "KMata";
		ket1.lensa = "Bolong";
		ket1.harga = 300000;
		
		ket2.kumpul("Bulat", "Abu", "KMata", "Cekung", 100000);
		
		ket1.tampil();
		ket2.tampil();
		ket3.tampil();
		
	}

}
