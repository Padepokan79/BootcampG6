// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoEmpatbelas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int tempArr = 0;

		System.out.println("14. Urutkan Nilai arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}
			System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = arr1.length-1; j > i; j--) {
				if (arr1[j] < arr1[j-1]) {
					tempArr = arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = tempArr;
				}
			}
		}

		System.out.println("\nNIlai pada arr1 setelah di urutkan : ");
		for (int r : arr1) {
				System.out.print(r + ", ");
		}
	}
}
