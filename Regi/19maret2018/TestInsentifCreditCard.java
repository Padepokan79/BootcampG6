package SembilanBelasMaret2018;

import java.util.ArrayList;

public class TestInsentifCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard visaGold = new CreditCard("Visa Gold", 10000);
		CreditCard masterTitanium = new CreditCard("Master Titanium", 15000);
		CreditCard visaPlatinum = new CreditCard("Visa Platinum", 20000);
		CreditCard masterWorldmiles = new CreditCard("Master Worldmiles", 25000);
		
		ArrayList<Integer> insentifVisaGold = new ArrayList<Integer>();
		ArrayList<Integer> insentifTitanium = new ArrayList<Integer>();
		ArrayList<Integer> insentifPlatinum = new ArrayList<Integer>();
		ArrayList<Integer> insentifWorldmiles = new ArrayList<Integer>();
		
		ArrayList<String> bulan = new ArrayList<String>();
		
		bulan.add("januari");
		bulan.add("februari");
		bulan.add("maret");
		bulan.add("april");
		bulan.add("mei");
		bulan.add("juni");
		bulan.add("juli");
		bulan.add("agustus");
		bulan.add("september");
		bulan.add("oktober");
		bulan.add("november");
		bulan.add("desember");
		
		int insentifPerBulan = 0;
		int insentifSetahun = 0;
		
		for (int i = 0; i < bulan.size(); i++) {
			insentifVisaGold.add(15);
			insentifTitanium.add(8);
			insentifPlatinum.add(17);
			insentifWorldmiles.add(4);
			
			insentifPerBulan = (visaGold.getInsentifPenjualankartu()*insentifVisaGold.get(i)) + (masterTitanium.getInsentifPenjualankartu()*
					insentifTitanium.get(i)) + (visaPlatinum.getInsentifPenjualankartu()*insentifPlatinum.get(i)) + (masterWorldmiles.getInsentifPenjualankartu()*
					insentifWorldmiles.get(i));
			
			if (bulan.get(i).equalsIgnoreCase("maret")) {
				insentifPerBulan  = insentifPerBulan - (int) (0.02*insentifPerBulan);
			}
			
			System.out.println("Insentif bulan " + bulan.get(i) + " = Rp. " + insentifPerBulan);
			insentifSetahun = insentifSetahun + insentifPerBulan;
		}
		System.out.println("\nInsentif setahun = Rp. " + insentifSetahun);
	}
	
}
