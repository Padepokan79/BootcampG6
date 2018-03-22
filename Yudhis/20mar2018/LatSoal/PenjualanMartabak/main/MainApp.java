package main;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		
		int totalPenjualanPerHari;
		int totalPenjualan = 0;
		
		String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
		
		HashMap<String, Martabak> mapPenjualan = new HashMap<String, Martabak>();
		
		Manis manis = new Manis();
		Telor telor = new Telor();
		
		// Memasukkan object martabak kedalam hashmap
		for (String h : hari) {
			mapPenjualan.put(h + "Manis", manis = new Manis(800, h));
			mapPenjualan.put(h + "Telor", telor = new Telor(500, h));
		}
		
		// Mengurutkan object martabak
		for (String h : hari) {			
			totalPenjualanPerHari = 0;
			
			// Menampilkan hitungan
			for (Map.Entry<String, Martabak> entry:mapPenjualan.entrySet()) {
				String key = entry.getKey();
				Martabak martabak = entry.getValue();	
				
				if ((h + "Manis").equals(key) || (h + "Telor").equals(key)) {
					System.out.println(martabak.toString());
					totalPenjualanPerHari = totalPenjualanPerHari + martabak.totalPenjualan();
					totalPenjualan = totalPenjualan + martabak.totalPenjualan();
				} 
			}
			
			System.out.println("Total pemasukan hari " + h + " " + totalPenjualanPerHari + "\n");
		}
		
		// Total keseluruhan
		System.out.println("Total pemasukan keseluruhan " + totalPenjualan + "\n");
		
	}
	
}
