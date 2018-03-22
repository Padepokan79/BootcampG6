package SoalIntensifCreditCard;

import java.util.*;
public class TestIntensifCreditCard {

	public static void main(String[] args) {
		double total = 0;
		double perbulan;
		
		IntensifCreditCard visaGold = new IntensifCreditCard("VG", "Visa Gold" , 10000);
		IntensifCreditCard masterTitanium = new IntensifCreditCard("MT", "Master Titanium" , 15000);
		IntensifCreditCard visaPlatinum = new IntensifCreditCard("VP", "Visa Platinum" , 20000);
		IntensifCreditCard masterWorldmiles = new IntensifCreditCard("MW", "Master Worldmiles" , 25000);
		
		HashMap<Integer, Integer >  kartu= new HashMap<Integer, Integer> ();
		
		kartu.put(1, 15);
		kartu.put(2, 8);
		kartu.put(3, 17);
		kartu.put(4, 4);
		
		//HashMap<Integer, Integer >  bulan= new HashMap<Integer, Integer> ();
		
		for (int i = 1; i <= 12; i ++) {
			visaGold.setbulan(i);
			visaGold.getintensif();
			masterTitanium.setbulan(i);
			masterTitanium.getintensif();
			masterWorldmiles.setbulan(i);
			masterWorldmiles.getintensif();
			visaPlatinum.setbulan(i);
			visaPlatinum.getintensif();
			
			perbulan = visaGold.getintensif()*kartu.get(1) + masterTitanium.getintensif()*kartu.get(2) + visaPlatinum.getintensif()*kartu.get(3)+ masterWorldmiles.getintensif()*kartu.get(4);
			total = total + perbulan;
			System.out.println("Bulan : " + perbulan);
		}	
		System.out.println("Total : " + total);
}
}