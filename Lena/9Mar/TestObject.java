
public class TestObject {
	public static void main(String[] args) {
		Jaket jaket1 = new Jaket();
		Jaket jaket2 = new Jaket();
		Jaket jaket3 = new Jaket("Lena", "rajut", "pink");
		
		Tas tas1 = new Tas();
		Tas tas2 = new Tas();
		Tas tas3 = new Tas("Lena", "ransel", "maroon");
		
		BotolMinum botol1 = new BotolMinum();
		BotolMinum botol2 = new BotolMinum();
		BotolMinum botol3 = new BotolMinum("Lena", "ECO Tupperware", "ungu", 500);
		
		jaket1.namaPemilik = "Fahreja";
		jaket1.jenisJaket = "bomber";
		jaket1.warnaJaket = "merah";		
		System.out.println("Jaket "+jaket1.jenisJaket+" milik "+jaket1.namaPemilik+" warna "+jaket1.warnaJaket);
		
		tas1.namaPemilik = "Fahreja";
		tas1.jenisTas = "ransel";
		tas1.warnaTas = "hitam";		
		System.out.println("Tas "+tas1.jenisTas+" milik "+tas1.namaPemilik+" warna "+tas1.warnaTas);
		
		botol1.namaPemilik = "Fahreja";
		botol1.merkBotol = "Pocari Sweat";
		botol1.warnaBotol = "transparan putih biru";
		botol1.ukuran = 600;		
		System.out.println("Botol minum "+botol1.merkBotol+" warna "+botol1.warnaBotol+" ukuran "+botol1.ukuran+" ml adalah milik "+botol1.namaPemilik);
		
		System.out.println();
		
		jaket2.insertRecord("Irin", "parka", "merah");
		tas2.insertRecord("Irin", "ransel", "hitam");
		botol2.insertRecord("Irin", "Tupperware", "hijau kuning", 350);
		
		jaket2.display();
		tas2.display();
		botol2.display();
		
		System.out.println();
		
		jaket3.display();
		tas3.display();
		botol3.display();
	}
}
