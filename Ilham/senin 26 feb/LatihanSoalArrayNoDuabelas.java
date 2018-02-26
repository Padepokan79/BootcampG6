// Ilham galang 26 02 2018
import java.util.Scanner;

public class LatihanSoalArrayNoDuabelas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = {25,14,56,15,36,56,77,18,29,49};
		int[] arr2 = new int[10];
		int[] arr3 = {2,39,47,14,36,56,57,49,43,79};
		int[] arr4 = new int[10];

		System.out.println("12. Jumlahkan elemen arr1 dan arr3! ");
		System.out.println("Nilai array pada arr1: ");
		for (int r : arr1) {
			System.out.print(r + ", ");
		}
		System.out.println("\nNilai array pada arr3: ");
		for (int r : arr3) {
			System.out.print(r + ", ");
		}

		for (int i = 0; i < arr1.length; i++) {
			arr4[i] = arr1[i] + arr3[i];
		}

		System.out.println("\nNIlai pada arr4 : ");
		for (int r : arr4) {
				System.out.print(r + ", ");
		}
	}
}
