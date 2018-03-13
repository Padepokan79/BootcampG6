
public class TestBotolMinum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BotolMinum botolMinum1 = new BotolMinum();
		BotolMinum botolMinum2 = new BotolMinum();
		
		botolMinum1.beratIsi = 550;
		botolMinum1.beratKosong = 50;
		botolMinum1.diameter = 5;
		botolMinum1.harga = 25000;
		botolMinum1.merek = "Tupperware";
		botolMinum1.tinggi = 20;
		botolMinum1.volume = 150;
		botolMinum1.warna = "Hijau";
		botolMinum1.merek = "Tupperware";
				
		System.out.println("Tinggi = " + botolMinum1.tinggi + " cm");
		System.out.println("Diameter = " + botolMinum1.diameter + " cm");
		System.out.println("Volume = " + botolMinum1.volume + " ml");
		System.out.println("Harga = " + botolMinum1.harga + " Rp");
		System.out.println("Berat Isi = " + botolMinum1.beratIsi + " gr");
		System.out.println("Berat Kosong = " + botolMinum1.beratKosong + " gr");
		System.out.println("Warna = " + botolMinum1.warna);
		System.out.println("Merek = " + botolMinum1.merek);

		// Menggunakan constructor
		botolMinum2.masukkanData(15, 5, 400, 50000, 490, 100, "Biru", "Aqua");
		botolMinum2.tampilData();
		
		
	}

}
