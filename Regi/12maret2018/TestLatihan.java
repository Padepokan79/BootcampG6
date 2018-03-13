
public class TestLatihan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KainBatik kainBatik1 = new KainBatik("Batik", "Mori", "Coklat", "Kembang", "Batik Pekalongan", "Pekalongan", 650000);
		kainBatik1.tampilDataKain();
		
		KainSutera kainSutera1 = new KainSutera("Sutera", "Sutera", "Sutera", "Putih", "Polos", "Polos", "China", 1500000);
		kainSutera1.tampilDataKain();
		
		KainKebaya kainKebaya1 = new KainKebaya("Kebaya", "Tile", "Merah", "Kembang", "Brokat", "Kembang", 360000);
		kainKebaya1.tampilDataKain();
		
		Futsal futsal1 = new Futsal("Olahraga Darat", "Dipertandingkan", "Menggunakan Bola", 5, 4, 15, "Kebugaran Fisik");
		futsal1.tampilData();
		
		Dayung dayung1 = new Dayung("Olahraga Air", "Dipertandingkan", "Menggunakan Perahu", "Pemula", 3, 5, "Pelampung dan Helm", "Kebugaran Tubuh");
		dayung1.tampilData();
		
		Paralayang paralayang1 = new Paralayang("Olahraga Udara", "Dipertandingkan", "Menggunakan Parasut", "Parasut", "XL", 15, "Kebugaran Tubuh");
		paralayang1.tampilData();

	}

}
