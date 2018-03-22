package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPenjualan = 0;
		int totalPenjualanPerHari;
		int penjualanLeManRabuMinggu = 0;
		
		String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu"};
		
		HashMap<String, Galon> mapGalon = new HashMap<String, Galon>();
		
		Sega sega = new Sega();
		Ron89 ron89 = new Ron89();
		LeMan leMan = new LeMan();
		
		for (String h : hari) {
			mapGalon.put(h + "Sega", sega = new Sega(12, h));
			mapGalon.put(h + "Ron89", ron89 = new Ron89(8, h));
			mapGalon.put(h + "LeMan", leMan = new LeMan(17, h));
			
			if (!(h.equals("Senin") || h.equals("Selasa"))) {
				penjualanLeManRabuMinggu = penjualanLeManRabuMinggu + 17;
			}
		}
		
		for (String h : hari) {
			totalPenjualanPerHari = 0;
			
			for (Map.Entry<String, Galon> entry:mapGalon.entrySet()) {
				String key = entry.getKey();
				Galon galon = entry.getValue();
				
				if ((h + "Sega").equals(key) || (h + "Ron89").equals(key) || (h + "LeMan").equals(key)) {
					System.out.println(galon.toString());
					totalPenjualanPerHari = totalPenjualanPerHari + galon.hitungPemasukan();
					totalPenjualan = totalPenjualan + galon.hitungPemasukan();
				}
				
			}
			
			System.out.println("Total pemasukan hari " + h + " " + totalPenjualanPerHari + "\n");
		}
		
		System.out.println("Total pemasukan keseluruhan " + totalPenjualan + "\n");		
		System.out.println("Total penjualan galon LeMan Rabu-Minggu " + penjualanLeManRabuMinggu + "\n");
	}

}
