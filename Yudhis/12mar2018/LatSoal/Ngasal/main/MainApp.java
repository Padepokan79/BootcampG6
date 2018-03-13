package main;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bantal bantal = new Bantal();
		BanMobil banMobil = new BanMobil();
		Panci panci = new Panci();
		
		bantal.tampilBantal("\tYudhis", 96000000, "Bulu Harimau India", "MAYORA", "Besar");
		banMobil.tambilBanMobil("\tYudhis", "TIMOR", "A/T Super", "Michelin", 500000);
		panci.tampilPanci("\tYudhis", "YUPAN", 35000, "Dutch Oven (Panci Sayur)", 5);
	}

}
