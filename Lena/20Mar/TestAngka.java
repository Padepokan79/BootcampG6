package hashMapAngka;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int angka, count=0;
		int[] nilaiArray = {4,3,2,4,2,6,2,5,5,7,5,3,5,3,3,23,4,6,4,3,4,4,2,2}; 
		
		HashMap<Integer, Integer> mapAngka = new HashMap<Integer, Integer>();
		insertToAddHashMap(mapAngka, nilaiArray);
		
		System.out.print("\n\nMasukkan angka yang dicari: ");
		angka = scan.nextInt();
		
		HashMap<Integer, Integer> mapAngkaLebihBesar = new HashMap<Integer, Integer>();
		for(Map.Entry<Integer, Integer> map : mapAngka.entrySet()) {
			if(map.getValue() > angka) {
				count++;
				mapAngkaLebihBesar.put(count, map.getValue());
			}
		}
		
		System.out.print("Yang lebih dari Angka "+angka+" ada "+count+", yaitu: ");
		for(Map.Entry<Integer, Integer> map : mapAngkaLebihBesar.entrySet()) {
			System.out.print(map.getValue()+" ");
		}
	}
	
	public static void insertToAddHashMap(HashMap<Integer, Integer> namaMap, int[] nilai) {
		for(int i=0; i<nilai.length; i++) {
			namaMap.put(i+1, nilai[i]);
			System.out.print(nilai[i]+" ");
		}
	}

}
