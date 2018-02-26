// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoSembilan {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];
		int maksimum;

		maksimum = arr1[0];

		System.out.println("9. Tampilkan Nilai Maksimum arr1! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}

		for (int i = 0; i < arr1.length-1; i++) {
			if (arr1[i] > arr1[i+1]) {
				if (arr1[i] > maksimum) {
					maksimum = arr1[i];
				}
			}
		}

		System.out.println("\nNIlai Maksimum pada arr1 : " + maksimum);

	}
}
