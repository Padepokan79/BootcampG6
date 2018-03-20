package main;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		int totalRataRataNilai = 0;
		
		ArrayList<Nilai> listNilai = new ArrayList<Nilai>();
		
		Nilai nilai = new Nilai();
		listNilai.add(nilai = new Nilai("Dinda", 80, 90, 70, 80));
		listNilai.add(nilai = new Nilai("Randi", 20, 50, 50, 70));
		listNilai.add(nilai = new Nilai("Joseph", 70, 80, 80, 85));
		listNilai.add(nilai = new Nilai("Diana", 95, 85, 90, 80));
		listNilai.add(nilai = new Nilai("Natalia", 75, 65, 60, 50));
		
		for (Nilai n : listNilai) {
			totalRataRataNilai = totalRataRataNilai + n.getRataRataNilai();
		}
		
		System.out.println("Rata-rata keseluruhan = " + totalRataRataNilai / listNilai.size());
	}
	
}
