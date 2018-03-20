package main;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPenjualanPerHari;
		int totalPenjualan = 0;
		
		String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
		
		HashMap<String, Bensin> mapBensin = new HashMap<String, Bensin>();
		
		Premium premium = new Premium();
		Pertalite pertalite = new Pertalite();
		
		// Memasukkan object bensin kedalam hashmap
		for (String h : hari) {
			switch (h) {
				case "Senin":
					mapBensin.put(h + "Premium", premium = new Premium(120, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(50, h));
					break;
				case "Selasa":
					mapBensin.put(h + "Premium", premium = new Premium(100, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(15, h));
					break;
				case "Rabu":
					mapBensin.put(h + "Premium", premium = new Premium(50, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(13, h));
					break;
				case "Kamis":
					mapBensin.put(h + "Premium", premium = new Premium(30, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(4, h));
					break;
				case "Jum'at":
					mapBensin.put(h + "Premium", premium = new Premium(20, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(20, h));
					break;
				case "Sabtu":
					mapBensin.put(h + "Premium", premium = new Premium(150, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(55, h));
					break;
				case "Minggu":
					mapBensin.put(h + "Premium", premium = new Premium(110, h));
					mapBensin.put(h + "Pertalite", pertalite = new Pertalite(60, h));
					break;
			}
		}		
				
		// Mengurutkan object bensin
		for (String h : hari) {			
			totalPenjualanPerHari = 0;
			
			// Menampilkan hitungan
			for (Map.Entry<String, Bensin> entry:mapBensin.entrySet()) {
				String key = entry.getKey();
				Bensin bensin = entry.getValue();	
				
				if ((h + "Premium").equals(key) || (h + "Pertalite").equals(key)) {
					System.out.println(bensin.toString());
					totalPenjualanPerHari = totalPenjualanPerHari + bensin.hitungPemasukan();
					totalPenjualan = totalPenjualan + bensin.hitungPemasukan();
				} 
			}
			
			System.out.println("Total pemasukan hari " + h + " " + totalPenjualanPerHari + "\n");
		}
		
		// Total keseluruhan
		System.out.println("Total pemasukan keseluruhan " + totalPenjualan + "\n");		
	}

}
