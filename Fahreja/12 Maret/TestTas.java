
public class TestTas {
	public static void main(String[] args) {
		Laki tas1 = new Laki();
		Wanita tas2 = new Wanita();
		Both tas3 = new Both();
		
		tas1.tasLaki();
		tas1.kumpul("Blood", "Ransel", "Abu-Abus", "Nilon", 250000);
		tas1.tampil();
		
		tas2.tasWanita();
		tas2.kumpul("JH EMMA", "Hand BAG", "Hitam", "Kulit", 500000);
		tas2.tampil();
		
		tas3.unisex();
		tas3.kumpul("REI", "Carrier", "Hijau Kuning", "Cordura", 500000);
		tas3.tampil();
	}
}
