// Ilham galang 23 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoTiga {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int cari;
		boolean hasilCari = false;

		System.out.println("3. Suatu bilangan ada di-posisi/index ke berapa di arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}
		System.out.print("\nMasukkan bilangan yang ingin dicari posis/index-nya : ");
		cari = keyboard.nextInt();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == cari) {
				System.out.println(cari + " ada pada posisi: " + (i+1) + " dan ada pada index: " + i);
				hasilCari = true;
			}
		}
		if (!hasilCari) {
			System.out.println("404 Not Found.");
		}
	}
}