package DuaPuluhMaret2018;

import java.util.HashMap;
import java.util.Map;

public class NilaiRandom {

	public static void main(String[] args) {
		int angkaRandom;
		int bilanganTemp;
		int x = 0;
		
		HashMap<Integer, Integer> bilangan = new HashMap<Integer, Integer>();
		
		for (int i=0; i<30; i++) {
		angkaRandom = ((int) (1000*Math.random()+1));
		bilangan.put(i, angkaRandom);
		}
		
		System.out.println("30 Nilai random 1 - 1000");
		for(Map.Entry<Integer, Integer> angka : bilangan.entrySet()) {
			System.out.print(angka.getValue() + " ");
		}
		
		System.out.println("\n\nUrutan dari nilai kecil ke besar");
		for ( int i=0; i < bilangan.size(); i++){
			for (int j = i+1; j< bilangan.size(); j++){
				if ( (bilangan.get(j)).compareTo(bilangan.get(i)) < 0){
				bilanganTemp = bilangan.get(i);
				bilangan.put(i, bilangan.get(j));
				bilangan.put(j, bilanganTemp);
				}
			}
		}
		for(Map.Entry<Integer, Integer> angka : bilangan.entrySet()) {
			System.out.print(angka.getValue() + " ");
		}
		System.out.println();
		
		System.out.println("\nBilangan Prima");
		for (int i = 2; i <= bilangan.size() ; i++) {
			if (bilangan.get(x) == 2 || bilangan.get(x) == 3 || bilangan.get(x) == 5 || bilangan.get(x) == 7) {
				System.out.print(bilangan.get(x) + " ");
				bilangan.remove(x);
					
				
			} 
			else if ( !(bilangan.get(x) % 2 == 0 ||bilangan.get(x) % 3 == 0 ||bilangan.get(x) % 5 == 0 ||bilangan.get(x) % 7 == 0) ) {
				System.out.print(bilangan.get(x) + " ");
				bilangan.remove(x);	
				}
			x++;
		}
		
		System.out.println("\n\nUrutan tanpa bilangan prima");
		for(Map.Entry<Integer, Integer> angka : bilangan.entrySet()) {
			System.out.print(angka.getValue() + " ");
		}
		
	}

}
