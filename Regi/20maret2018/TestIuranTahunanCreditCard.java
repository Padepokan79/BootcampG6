package DuaPuluhMaret2018;

import java.util.HashMap;

public class TestIuranTahunanCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key = 1;
		
		CreditCard visaGold = new CreditCard("Visa Gold", 300000);
		CreditCard masterTitanium = new CreditCard("Master Titanium", 500000);
		CreditCard visaPlatinum = new CreditCard("Visa Platinum", 750000);
		CreditCard masterWorldmiles = new CreditCard("Master Worldmiles", 1000000);
		
		HashMap<Integer, Integer> jumlahKartuVisaGold = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> jumlahKartuMasterTitanium = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> jumlahKartuVisaPlatinum = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> jumlahKartuMasterWorldmiles = new HashMap<Integer, Integer>();
		
		HashMap<Integer, String> tahunIuran = new HashMap<Integer, String>();
		
		tahunIuran.put(1, "pertama");
		tahunIuran.put(2, "kedua");
		tahunIuran.put(3, "ketiga");
		tahunIuran.put(4, "keempat");
		tahunIuran.put(5, "kelima");
		
		int iuranPerTahun = 0;
		int iuranSetelahLimaTahun = 0;
		
		for (int i = 1; i <= tahunIuran.size(); i++) {
			jumlahKartuVisaGold.put(1, 1);
			jumlahKartuMasterTitanium.put(1, 1);
			jumlahKartuVisaPlatinum.put(1, 2);
			jumlahKartuMasterWorldmiles.put(1, 1);
			
			iuranPerTahun = (visaGold.getIuranTahunan()*jumlahKartuVisaGold.get(key)) + (masterTitanium.getIuranTahunan()*jumlahKartuMasterTitanium.get(key)) + 
					(visaPlatinum.getIuranTahunan()*jumlahKartuVisaPlatinum.get(key)) + (masterWorldmiles.getIuranTahunan()*jumlahKartuMasterWorldmiles.get(key));
			
			if (tahunIuran.get(i).equalsIgnoreCase("ketiga")) {
				iuranPerTahun = (int) (iuranPerTahun - (0.1*iuranPerTahun));
			}
			
			System.out.println("Iuran Tahunan tahun " + tahunIuran.get(i) + " = Rp. " + iuranPerTahun);
			iuranSetelahLimaTahun = iuranSetelahLimaTahun + iuranPerTahun;
		}
		System.out.println("\nIuran tahunan yang harus dibayar setelah tahun kelima adalah Rp. " + iuranSetelahLimaTahun);

	}

}
