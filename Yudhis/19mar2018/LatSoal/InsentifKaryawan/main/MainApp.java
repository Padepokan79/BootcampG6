package main;

import java.util.ArrayList;

public class MainApp {
	
	public static void main(String[] args) {
		ArrayList<String> bulan = new ArrayList<String>();
		
		int totalInsentif = 0;
		
		bulan.add("Januari");
		bulan.add("Februari");
		bulan.add("Maret");
		bulan.add("April");
		bulan.add("Mei");
		bulan.add("Juni");
		bulan.add("Juli");
		bulan.add("Agustus");
		bulan.add("September");
		bulan.add("Oktober");
		bulan.add("November");
		bulan.add("Desember");
		
		for (String b : bulan) {
			VisaGold visaGold = new VisaGold(b, 15);
			MasterTitanium masterTitanium = new MasterTitanium(b, 8);
			VisaPlatinum visaPlatinum = new VisaPlatinum(b, 17);
			MasterWorldmiles masterWorldmiles = new MasterWorldmiles(b, 4);
			
			System.out.println(visaGold.toString());
			System.out.println(masterTitanium.toString());
			System.out.println(visaPlatinum.toString());
			System.out.println(masterWorldmiles.toString());
			
			double insentifBulanan = visaGold.getInsentif() + masterTitanium.getInsentif() +
					visaPlatinum.getInsentif() + masterWorldmiles.getInsentif();
			
			totalInsentif = totalInsentif + (int) insentifBulanan;
			
			System.out.println("Insentif bulan " + b + " = " + (int) insentifBulanan + "\n");
		}
		
		System.out.println("Total insentif setahun = " + totalInsentif);
		
		
	}
	
}
