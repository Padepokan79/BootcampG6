package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainApp {
	
	static Random random = new Random();
	final static int panjangArray = 30;
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> mapArray = new HashMap<Integer, Integer>();
		ArrayList<Integer> listPrima = new ArrayList<Integer>();
		
		// Menaruh dan menampilkan array awal
		for (int i = 0; i < panjangArray; i++) {
			mapArray.put(i, isiArray());
			System.out.print(mapArray.get(i) + " ");
		}
		
		// Mengurutkan array
		for (int i = 0; i < panjangArray; i++) {
			for (int j = i; j < panjangArray; j++) {
				int temp = 0;
				
				if (mapArray.get(i) > mapArray.get(j)) {
					temp = mapArray.get(j);
					mapArray.put(j, mapArray.get(i));
					mapArray.put(i, temp);
				} 
			}
		}
		
		// Menampilkan hasil urutan array
		System.out.println();
		for (Map.Entry<Integer, Integer> entry:mapArray.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
		
		// Mencari bilangan prima
		for (Map.Entry<Integer, Integer> entry:mapArray.entrySet()) {		
			for (int i = 2; i <= entry.getValue(); i++) {
				if (entry.getValue() % i == 0) {
					listPrima.add(entry.getKey());
				}
			}
		}
		
		// Menghapus bilangan prima
		System.out.println("\n" + listPrima.size());
		
	}
	
	public static int isiArray() {
		return random.nextInt(1000) + 1;
	}
	
}
