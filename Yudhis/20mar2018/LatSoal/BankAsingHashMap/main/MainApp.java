package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalIuran = 0;
		int batasTahun = 5;
		
		HashMap<String, CreditCard> mapCreditCard = new HashMap<String, CreditCard>();
		
		for (int i = 1; i <= batasTahun; i++) {
			MasterWorldmiles masterWorldMilesAyah = new MasterWorldmiles(i, "Ayah");
			mapCreditCard.put("Tahun" + i + "AyahMasterWorldmiles", masterWorldMilesAyah);
			VisaPlatinum visaPlatinumAyah = new VisaPlatinum(i, "Ayah");
			mapCreditCard.put("Tahun" + i + "AyahVisaPlatinum", visaPlatinumAyah);
			VisaGold visaGoldIbu = new VisaGold(i, "Ibu");
			mapCreditCard.put("Tahun" + i + "IbuVisaGold", visaGoldIbu);
			VisaPlatinum visaPlatinumIbu = new VisaPlatinum(i, "Ibu");
			mapCreditCard.put("Tahun" + i + "IbuVisaPlatinum", visaPlatinumIbu);
			MasterTitanium masterTitaniumAnak = new MasterTitanium(i, "Anak");
			mapCreditCard.put("Tahun" + i + "AnakMasterTitanium", masterTitaniumAnak);
			
			System.out.println("Total iuran tahun ke-" + i + " = "
					+ "" + (masterWorldMilesAyah.hitungIuran() + visaPlatinumAyah.hitungIuran() + 
							visaPlatinumIbu.hitungIuran() + visaGoldIbu.hitungIuran() + 
							masterTitaniumAnak.hitungIuran() + "\n"));		
		}
		
		for (Map.Entry<String, CreditCard> entry:mapCreditCard.entrySet()) {
			CreditCard creditCard = entry.getValue();
			
			totalIuran = totalIuran + creditCard.hitungIuran();
		}
		System.out.println("Total iuran selama " + batasTahun + " adalah " + (int) totalIuran);
	}

}
