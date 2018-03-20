import java.util.ArrayList;
import java.util.Random;

public class UrutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arrPrima = new ArrayList<Integer>();
		Random nilai = new Random();
		int tempMin = 0, tempIndex = 0;
		
		for (int i = 0; i < 30; i++) {
			arr.add(nilai.nextInt(1000));
		}
		
		System.out.println("Nilai Array Awal: ");
		tampilArr(arr);
		
		for (int i = 0; i < arr.size(); i++) {
			tempMin = arr.get(0);
			tempIndex = 0;
			for (int j = 0; j < arr.size()-i-1; j++) {
				if (arr.get(j) < arr.get(j+1)) {
					if (arr.get(j) < tempMin) {
						tempMin = arr.get(j);
						tempIndex = j;							
					}
				}
				else {
					if (arr.get(j+1) < tempMin) {
						tempMin = arr.get(j+1);
						tempIndex = j+1;							
					}
				}
			}
			arr.remove(tempIndex);
			arr.add(tempMin);
		}
		System.out.println();
		System.out.println("Nilai Array Setelah di Urut: ");
		tampilArr(arr);
		System.out.println();
		
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) == 2 || arr.get(index) == 3 || arr.get(index) == 5 || arr.get(index) == 7) {
				arrPrima.add(arr.get(index));
				arr.remove(index);
			} 
			else if ( !(arr.get(index) % 2 == 0 || arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0 || arr.get(index) % 7 == 0) ) {
				arrPrima.add(arr.get(index));
				arr.remove(index);
			}
		}

		System.out.println();
		System.out.println("Nilai Array Setelah di Urut Tanpa Bilangan Prima: ");
		tampilArr(arr);
		System.out.println();
		System.out.println("Nilai Array yang Berisi Bilangan Prima tadi: ");
		tampilArr(arrPrima);
		
	}
	public static void tampilArr(ArrayList<Integer> array) {
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}		
	}
}
