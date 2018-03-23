import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestArrayHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> arrYangLebihDari = new HashMap<Integer, Integer>();
		Scanner input = new Scanner(System.in);		
		
		int angkaYangDicari, posisiAngkaYangDicari = 1;
		
		arr.put(1,4);
		arr.put(2,3);
		arr.put(3,2);
		arr.put(4,4);
		arr.put(5,2);
		arr.put(6,6);
		arr.put(7,2);
		arr.put(8,5);
		arr.put(9,5);
		arr.put(10,7);
		arr.put(11,5);
		arr.put(12,3);
		arr.put(13,5);
		arr.put(14,3);
		arr.put(15,3);
		arr.put(16,23);
		arr.put(17,4);
		arr.put(18,6);
		arr.put(19,4);
		arr.put(20,3);
		arr.put(21,4);
		arr.put(22,4);
		arr.put(23,2);
		arr.put(24,2);
		
		tampilArr(arr);
		System.out.println();
		
		System.out.println("Masukan Angka yang di cari: ");
		angkaYangDicari = input.nextInt();
		
		for (int posisi = 1; posisi <= arr.size(); posisi++) {
			if(arr.get(posisi) > angkaYangDicari) {
				arrYangLebihDari.put(posisiAngkaYangDicari, arr.get(posisi));
				posisiAngkaYangDicari++;
			}
		}

		System.out.println("Yang lebih dari Angka " + angkaYangDicari + " ada " + arrYangLebihDari.size() + ", yaitu:");
		tampilArr(arrYangLebihDari);
	}

	public static void tampilArr(HashMap<Integer, Integer> array) {
		for (Map.Entry entry : array.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}		
	}
}
