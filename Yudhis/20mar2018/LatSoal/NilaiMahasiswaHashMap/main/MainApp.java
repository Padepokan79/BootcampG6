package main;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		int totalRataRataNilai = 0;
		
		HashMap<String, Nilai> mapNilai = new HashMap<String, Nilai>();
		
		Nilai nilai = new Nilai();
		
		mapNilai.put("Dinda", nilai = new Nilai("Dinda", 80, 90, 70, 80));
		mapNilai.put("Randi", nilai = new Nilai("Randi", 20, 50, 50, 70));
		mapNilai.put("Joseph", nilai = new Nilai("Joseph", 70, 80, 80, 85));
		mapNilai.put("Diana", nilai = new Nilai("Diana", 95, 85, 90, 80));
		mapNilai.put("Natalia", nilai = new Nilai("Natalia", 75, 65, 60, 50));
		
		for (Map.Entry<String, Nilai> entry:mapNilai.entrySet()) {
			nilai = entry.getValue();
			
			totalRataRataNilai = totalRataRataNilai + nilai.getRataRataNilai();
		}
		
		System.out.println("Rata-rata keseluruhan = " + totalRataRataNilai / mapNilai.size());
	}
	
}
