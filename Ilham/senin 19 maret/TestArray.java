import java.util.ArrayList;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arrYangLebihDari = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);		
		
		int angkaYangDicari;
		
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(4);
		arr.add(2);
		arr.add(6);
		arr.add(2);
		arr.add(5);
		arr.add(5);
		arr.add(7);
		arr.add(5);
		arr.add(3);
		arr.add(5);
		arr.add(3);
		arr.add(3);
		arr.add(23);
		arr.add(4);
		arr.add(6);
		arr.add(4);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(2);
		arr.add(2);
		
		tampilArr(arr);
		System.out.println();
		
		System.out.println("Masukan Angka yang di cari: ");
		angkaYangDicari = input.nextInt();
		
		for (int index = 0; index < arr.size(); index++) {
			if(arr.get(index) > angkaYangDicari) {
				arrYangLebihDari.add(arr.get(index));
			}
		}

		System.out.println("Yang lebih dari Angka 6 ada " + arrYangLebihDari.size() + ", yaitu:");
		tampilArr(arrYangLebihDari);
	}

	public static void tampilArr(ArrayList<Integer> array) {
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}		
	}
}
