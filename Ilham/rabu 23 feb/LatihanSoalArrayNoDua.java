// Ilham galang 23 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoDua {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int cari;
		boolean hasilCari = false;

		System.out.println("2. Apakah suatu bilangan ada di arr1 atau tidak! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}
		System.out.print("\nMasukkan bilangan yang ingin dicari : ");
		cari = keyboard.nextInt();
		for (int r : arr1) {
			if (r == cari) {
				System.out.println(r + " found.");
				hasilCari = true;
			}
		}
		if (!hasilCari) {
			System.out.println("404 Not Found.");
		}
	}
}
