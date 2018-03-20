package main;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalIuran = 0;
		int batasTahun = 5;
		
		ArrayList<CreditCard> creditCards = new ArrayList<CreditCard>();
		
		for (int i = 1; i <= batasTahun; i++) {
			MasterWorldmiles masterWorldMilesAyah = new MasterWorldmiles(i, "Ayah");
			creditCards.add(masterWorldMilesAyah);
			VisaPlatinum visaPlatinumAyah = new VisaPlatinum(i, "Ayah");
			creditCards.add(visaPlatinumAyah);
			VisaGold visaGoldIbu = new VisaGold(i, "Ibu");
			creditCards.add(visaGoldIbu);
			VisaPlatinum visaPlatinumIbu = new VisaPlatinum(i, "Ibu");
			creditCards.add(visaPlatinumIbu);
			MasterTitanium masterTitaniumAnak = new MasterTitanium(i, "Anak");
			creditCards.add(masterTitaniumAnak);
			
			System.out.println("Total iuran tahun ke-" + i + " = "
					+ "" + (masterWorldMilesAyah.hitungIuran() + visaPlatinumAyah.hitungIuran() + 
							visaPlatinumIbu.hitungIuran() + visaGoldIbu.hitungIuran() + 
							masterTitaniumAnak.hitungIuran() + "\n"));
		}
		
		for (CreditCard creditCard : creditCards) {
			totalIuran = totalIuran + creditCard.hitungIuran();
		}
		System.out.println("Total iuran selama " + batasTahun + " adalah " + (int) totalIuran);
	}

}
