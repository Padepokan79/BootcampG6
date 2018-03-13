
public class ObjekSekitarNegasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotiKartikaSari roti1 = new RotiKartikaSari();
		TiketKeretaApi tiketKereta1 = new TiketKeretaApi();
		TiketBioskopCGV tiketCGV = new TiketBioskopCGV();
		
		roti1.tambahRoti("Brownies", "coklat", 60000, "coklat", "lembut", "sedang");
		tiketKereta1.tambahTiketKeretaApi("Cicalengka", "Cimekar", "10.00", "Ekonomi", 5000);
		tiketCGV.tambahTiketBioskopCGV("Your Name", "20.00", "Paris Van Java", "G5", 2, 30000);

		roti1.tampilRoti();
		tiketKereta1.tampilTiketKeretaApi();
		tiketCGV.tampilTiketBioskopCGV();
		
	}

}
