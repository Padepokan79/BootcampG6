// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoTujuh {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];

		System.out.println("7. Copy isi arr1 ke arr2! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

		arr2 = arr1;

		System.out.println("\nNilai array pada arr2: ");
		for (int r : arr2) {
			System.out.print(r + ", ");
		}

	}
}
